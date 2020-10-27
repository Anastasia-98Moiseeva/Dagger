package com.example.dagger.dependencyInjection.components;


import com.example.dagger.activities.LoginActivity;
import com.example.dagger.dependencyInjection.scopes.ActivityScope;
import com.example.dagger.fragments.LoginPasswordFragment;
import com.example.dagger.fragments.LoginUsernameFragment;

import dagger.Subcomponent;

/**
 * Компонент отвечающий за внедрение логики авторизации
 *
 * @author Moiseeva Anastasia on 27.10.2020
 */
@ActivityScope
@Subcomponent
public interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        LoginComponent create();
    }

    void inject(LoginActivity loginActivity);

    void inject(LoginUsernameFragment loginUsernameFragment);

    void inject(LoginPasswordFragment loginPasswordFragment);
}

