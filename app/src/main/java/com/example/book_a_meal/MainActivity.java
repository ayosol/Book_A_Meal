package com.example.book_a_meal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView nameView;
    SpannableString spannableString;
    ImageView menuImage;
    FrameLayout frameLayout;
    Fragment fragment;

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
        frameLayout = findViewById(R.id.frameLayout);
        fragment  = null;
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
                            fragment = new Login();
                            menuImage.setImageResource(R.drawable.sharp_menu);
                            break;
                        case R.id.register_main_menu:
                            fragment = new Register();
                            menuImage.setImageResource(R.drawable.sharp_menu);
                            break;
                        case R.id.loginCaterer_main_menu:
                            fragment = new LoginCaterer();
                            menuImage.setImageResource(R.drawable.sharp_menu);
                            break;
                        case R.id.registerCaterer_main_menu:
                            fragment = new RegisterCaterer();
                            menuImage.setImageResource(R.drawable.sharp_menu);
                            break;
                        default:
                            menuImage.setImageResource(R.drawable.sharp_menu);
                            return false;
                    }
                    return loadFragment(fragment);
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

    private boolean loadFragment(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frameLayout,fragment)
                    .commit();
            return true;
        }
        return false;
    }



}
