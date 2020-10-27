package com.example.dagger.fragments;

import android.app.Fragment;
import android.content.Context;

import com.example.dagger.activities.LoginActivity;
import com.example.dagger.viewModels.LoginViewModel;

import javax.inject.Inject;

/**
 * Фрагмент имени пользователя
 *
 * @author Moiseeva Anastasia on 27.10.2020
 */
public class LoginUsernameFragment extends Fragment {

    @Inject
    LoginViewModel loginViewModel;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        ((LoginActivity) getActivity()).loginComponent.inject(this);
    }
}
