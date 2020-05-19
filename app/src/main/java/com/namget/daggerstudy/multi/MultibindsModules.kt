package com.namget.daggerstudy.multi

import dagger.Module
import dagger.multibindings.Multibinds

/**
 * Created by Namget on 2020.05.19.
 */
@Module
abstract class MultibindsModules{
    @Multibinds
    abstract fun strings() :Set<String>
}