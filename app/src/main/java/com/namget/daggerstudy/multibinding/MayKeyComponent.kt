package com.namget.daggerstudy.multibinding

import dagger.Component

/**
 * Created by Namget on 2020.05.19.
 */
@Component(modules = [KeyModule::class])
interface MayKeyComponent {
    fun getStringByAnimal(): Map<Animal, String>
    fun getStringByNumber(): Map<Class<out Number>, String>
}