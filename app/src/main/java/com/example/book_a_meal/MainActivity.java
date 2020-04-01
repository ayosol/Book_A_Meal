package com.example.book_a_meal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView nameView;
    SpannableString spannableString;
    ImageView menuImage;

    boolean isMenuClosed = true;

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

        menuImage = findViewById(R.id.menu_imageView);

    }

    public void menuImage(View view){
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.main_menu, popup.getMenu());

        if (isMenuClosed) {
            popup.show();
            menuImage.setImageResource(R.drawable.sharp_menu_open_white);

            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.login_main_menu:
                            Toast.makeText(getApplicationContext(), "login", Toast.LENGTH_SHORT).show();
                            menuImage.setImageResource(R.drawable.sharp_menu);
                            return true;
                        case R.id.register_main_menu:
                            Toast.makeText(getApplicationContext(), "register", Toast.LENGTH_SHORT).show();
                            menuImage.setImageResource(R.drawable.sharp_menu);
                            return true;
                        case R.id.loginCaterer_main_menu:
                            Toast.makeText(getApplicationContext(), "login as a Caterer", Toast.LENGTH_SHORT).show();
                            menuImage.setImageResource(R.drawable.sharp_menu);
                            return true;
                        case R.id.registerCaterer_main_menu:
                            Toast.makeText(getApplicationContext(), "register asa Caterer", Toast.LENGTH_SHORT).show();
                            menuImage.setImageResource(R.drawable.sharp_menu);
                            return true;
                        default:
                            menuImage.setImageResource(R.drawable.sharp_menu);
                            return false;
                    }
                }
            });

           popup.setOnDismissListener(new PopupMenu.OnDismissListener() {
               @Override
               public void onDismiss(PopupMenu menu) {
                   menuImage.setImageResource(R.drawable.sharp_menu);
               }
           });

            isMenuClosed = false;
        }
        else {
            popup.dismiss();
            menuImage.setImageResource(R.drawable.sharp_menu);
            isMenuClosed = true;
        }
    }



}
