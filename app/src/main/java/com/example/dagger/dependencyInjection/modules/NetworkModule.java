package com.example.dagger.dependencyInjection.modules;

import com.example.dagger.viewModels.userRepository.service.LoginRetrofitService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Модуль группирующий логику представления объектов, связанных сетью
 *
 * @author Moiseeva Anastasia on 27.10.2020
 */
@Module
public class NetworkModule {

    @Singleton
    @Provides
    public LoginRetrofitService provideLoginRetrofitService() {
        return new Retrofit.Builder()
                .baseUrl("https://example.com")
                .build()
                .create(LoginRetrofitService.class);
    }

}
