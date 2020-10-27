package com.example.dagger.dependencyInjection.components;

import com.example.dagger.dependencyInjection.modules.NetworkModule;
import com.example.dagger.dependencyInjection.modules.SubcomponentsModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Компонент отвечающий за внедрение логики приложения
 *
 * @author Moiseeva Anastasia on 27.10.2020
 */
@Singleton
@Component(modules = {NetworkModule.class, SubcomponentsModule.class})
public interface ApplicationComponent {
    LoginComponent.Factory loginComponent();
}

