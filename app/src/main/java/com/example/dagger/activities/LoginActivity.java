package com.example.dagger.activities;

import android.app.Activity;
import android.os.Bundle;

import com.example.dagger.MyApplication;
import com.example.dagger.R;
import com.example.dagger.dependencyInjection.components.LoginComponent;
import com.example.dagger.viewModels.LoginViewModel;

import javax.inject.Inject;

/**
 * Активити авторизации
 *
 * @author Moiseeva Anastasia on 27.10.2020
 */
public class LoginActivity extends Activity {

    public LoginComponent loginComponent;

    @Inject
    LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loginComponent = ((MyApplication) getApplicationContext())
                .appComponent.loginComponent().create();

        loginComponent.inject(this);
    }
}
