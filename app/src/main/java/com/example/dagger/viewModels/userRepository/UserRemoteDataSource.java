package com.example.dagger.viewModels.userRepository;


import com.example.dagger.viewModels.userRepository.service.LoginRetrofitService;

import javax.inject.Inject;

/**
 * Класс представляющий удаленный источник данных пользователя
 *
 * @author Moiseeva Anastasia on 27.10.2020
 */
public class UserRemoteDataSource {
    private final LoginRetrofitService loginRetrofitService;

    @Inject
    public UserRemoteDataSource(LoginRetrofitService loginRetrofitService) {
        this.loginRetrofitService = loginRetrofitService;
    }

}
