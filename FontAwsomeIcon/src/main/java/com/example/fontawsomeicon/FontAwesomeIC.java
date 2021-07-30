package com.example.fontawsomeicon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FontAwesomeIC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font_awesome_ic);
    }

    public  static  int getSVG(){
        return  R.drawable.arrow_down_to_dotted_line;
    }
}