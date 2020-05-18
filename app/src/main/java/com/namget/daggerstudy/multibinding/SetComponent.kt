package com.namget.daggerstudy.multibinding

import dagger.Component

/**
 * Created by Namget on 2020.05.18.
 */
@Component(modules = [SetModule::class])
interface SetComponent{
    fun inject(setFoo: SetFoo)
}