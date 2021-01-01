package com.adityapal.rr_aditya_task;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.adityapal.rr_aditya_task.fragments.DashboardFragment;
import com.adityapal.rr_aditya_task.fragments.LeaderboardFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottom_nav);

        bottomNavigation.setOnNavigationItemSelectedListener(bottomNavListener);


        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new DashboardFragment())
                    .commit();
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment selectedFragement = null;

            switch (item.getItemId()){
                case R.id.nav_home:
                    selectedFragement = new DashboardFragment();
                    break;

                case R.id.nav_leaderboard:
                    selectedFragement = new LeaderboardFragment();
                    break;
            }

            if (selectedFragement != null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, selectedFragement)
                        .commit();
            }
            return true;
        }
    };
}