package com.namget.daggerstudy.binds

import dagger.BindsOptionalOf
import dagger.Module

/**
 * Created by Namget on 2020.05.17.
 */

@Module
abstract class CommonModule{
    @BindsOptionalOf
    abstract fun bindsOptionalString() : String
}