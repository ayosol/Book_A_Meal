package com.example.book_a_meal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Register extends Fragment {

    private TextInputLayout nameLayout;
    private TextInputLayout emailLayout;
    private TextInputLayout phoneLayout;
    private TextInputLayout passwordLayout;
    private TextInputEditText nameEditText;
    private TextInputEditText emailEditText;
    private TextInputEditText phoneEditText;
    private TextInputEditText passwordEditText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.activity_register, container,false);

        nameLayout = view.findViewById(R.id.name_Layout);
        emailLayout = view.findViewById(R.id.email_Layout);
        phoneLayout = view.findViewById(R.id.phone_Layout);
        passwordLayout = view.findViewById(R.id.password_Layout);
        nameEditText = view.findViewById(R.id.name_EditText);
        emailEditText = view.findViewById(R.id.email_EditText);
        phoneEditText = view.findViewById(R.id.phone_EditText);
        passwordEditText = view.findViewById(R.id.password_EditText);

        return view;
    }
}
