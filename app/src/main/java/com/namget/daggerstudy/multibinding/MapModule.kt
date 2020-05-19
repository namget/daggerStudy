package com.namget.daggerstudy.multibinding

import dagger.Module
import dagger.Provides
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

/**
 * Created by Namget on 2020.05.18.
 */
@Module
class MapModule {
    companion object {
        @Provides
        @IntoMap
        @StringKey("foo")
        fun provideFooValue() : Long{
            return 100L
        }

        @Provides
        @IntoMap
        @ClassKey(MapFoo::class)
        fun provideFooStr() : String{
            return "foo"
        }
    }
}