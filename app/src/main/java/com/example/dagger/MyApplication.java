package com.example.dagger;

import android.app.Application;

import com.example.dagger.dependencyInjection.components.ApplicationComponent;
import com.example.dagger.dependencyInjection.components.DaggerApplicationComponent;

/**
 * Класс приложения
 *
 * @author Moiseeva Anastasia on 27.10.2020
 */
public class MyApplication extends Application {
    public ApplicationComponent appComponent = DaggerApplicationComponent.create();
}
