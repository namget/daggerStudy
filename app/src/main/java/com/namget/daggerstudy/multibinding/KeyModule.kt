package com.namget.daggerstudy.multibinding

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

/**
 * Created by Namget on 2020.05.19.
 */
@Module
class KeyModule{
    @IntoMap
    @AnimalKey(Animal.CAT)
    @Provides
    fun provideCat() : String{
        return "Meow"
    }

    @IntoMap
    @AnimalKey(Animal.DOG)
    @Provides
    fun provideDog() : String{
        return "Bow-bow"
    }

    @IntoMap
    @NumberKey(Float::class)
    @Provides
    fun provideFloatValue() : String{
        return "100f"
    }

    @IntoMap
    @NumberKey(Integer::class)
    @Provides
    fun provideIntegerValue() : String{
        return "1"
    }

}