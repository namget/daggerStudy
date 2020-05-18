package com.namget.daggerstudy.multibinding

import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoSet
import java.util.*
import kotlin.collections.HashSet

/**
 * Created by Namget on 2020.05.18.
 */
@Module
class SetModule{
    @Provides
    @IntoSet
    fun provideHello() : String{
        return "hello"
    }

    @Provides
    @IntoSet
    fun provideWorld() : String{
        return "world"
    }

    @Provides
    @ElementsIntoSet
    fun provideSet() : Set<String>{
        return HashSet(listOf("namget","test"))
    }
}