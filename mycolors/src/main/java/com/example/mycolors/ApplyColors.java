package com.example.mycolors;

import android.content.Context;
import android.widget.Toast;

public class ApplyColors {
    public static void simpleToast(Context context, String Message){
        Toast.makeText(context, ""+Message, Toast.LENGTH_SHORT).show();
    }
}
