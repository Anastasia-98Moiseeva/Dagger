package com.example.dagger.viewModels.userRepository;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Класс представляющий пользовательский репозиторий
 *
 * @author Moiseeva Anastasia on 27.10.2020
 */
@Singleton
public class UserRepository {
    private final UserLocalDataSource userLocalDataSource;
    private final UserRemoteDataSource userRemoteDataSource;

    @Inject
    public UserRepository(UserLocalDataSource userLocalDataSource, UserRemoteDataSource userRemoteDataSource) {
        this.userLocalDataSource = userLocalDataSource;
        this.userRemoteDataSource = userRemoteDataSource;
    }

}
