package com.example.book_a_meal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginCaterer extends Fragment {

    private TextInputLayout emailLayout;
    private TextInputLayout cateringServiceLayout;
    private TextInputLayout passwordLayout;
    private TextInputEditText emailEditText;
    private TextInputEditText cateringServiceEditText;
    private TextInputEditText passwordEditText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.activity_login_caterer, container,false);

        emailLayout = view.findViewById(R.id.email_Layout);
        cateringServiceLayout = view.findViewById(R.id.cateringService_Layout);
        passwordLayout = view.findViewById(R.id.password_Layout);
        emailEditText = view.findViewById(R.id.email_EditText);
        cateringServiceEditText = view.findViewById(R.id.cateringService_EditText);
        passwordEditText = view.findViewById(R.id.password_EditText);

        return view;
    }
}
