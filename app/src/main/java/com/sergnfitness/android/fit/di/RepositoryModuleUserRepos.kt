package com.sergnfitness.android.fit.di


import com.sergnfitness.data.repository.UserRepositoryImpl
import com.sergnfitness.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped


@Module
@InstallIn(ActivityComponent::class)
abstract class RepositoryModuleUserRepos {

    @ActivityScoped
    @Binds
    abstract fun bindUserRepository(
        userRepositoryImpl: UserRepositoryImpl
    ): UserRepository

}