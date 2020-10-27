package com.example.dagger.viewModels;

import com.example.dagger.dependencyInjection.scopes.ActivityScope;
import com.example.dagger.viewModels.userRepository.UserRepository;

import javax.inject.Inject;

/**
 * Класс представляющий ViewModel авторизации
 *
 * @author Moiseeva Anastasia on 27.10.2020
 */
@ActivityScope
public class LoginViewModel {
    private final UserRepository userRepository;

    @Inject
    public LoginViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
