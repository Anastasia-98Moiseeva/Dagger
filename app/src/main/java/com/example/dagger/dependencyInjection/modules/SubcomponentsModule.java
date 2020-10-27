package com.example.dagger.dependencyInjection.modules;

import com.example.dagger.dependencyInjection.components.LoginComponent;

import dagger.Module;

/**
 * Модуль передающий класс подкомпонента в атрибут аннотации
 *
 * @author Moiseeva Anastasia on 27.10.2020
 */
@Module(subcomponents = LoginComponent.class)
public class SubcomponentsModule {
}
