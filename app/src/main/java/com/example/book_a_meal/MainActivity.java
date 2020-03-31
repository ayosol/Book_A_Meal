package com.example.book_a_meal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nameView;
    SpannableString spannableString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameView = findViewById(R.id.appNameTextView);
        spannableString = new SpannableString(getString(R.string.app_name_main));
        spannableString.setSpan(new ForegroundColorSpan(getColor(R.color.colorPrimary)), 0 ,1 ,0);
        spannableString.setSpan(new ForegroundColorSpan(getColor(R.color.colorPrimary)), 5 ,6 ,0);
        spannableString.setSpan(new ForegroundColorSpan(getColor(R.color.colorPrimary)), 10 ,11 ,0);
        nameView.setText(spannableString);


    }
}
