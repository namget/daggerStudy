package com.namget.daggerstudy.singleton

import dagger.Component
import javax.inject.Singleton

/**
 * Created by Namget on 2020.05.17.
 */

@Singleton
@Component(modules = [SingletonModule::class])
interface SingletonComponent{
    fun getString() : String
}