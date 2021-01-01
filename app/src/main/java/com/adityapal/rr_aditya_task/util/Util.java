package com.adityapal.rr_aditya_task.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.adityapal.rr_aditya_task.R;

public class Util {

    public static void loadImage(Context context, int drawable, ImageView imageView){
        Glide.with(context)
                .load(drawable)
                .into(imageView);
    }
}
