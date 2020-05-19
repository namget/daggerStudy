package com.namget.daggerstudy.multibinding

import dagger.Component
import kotlin.reflect.KClass

/**
 * Created by Namget on 2020.05.18.
 */
@Component(modules = [MapModule::class])
interface MapComponent{
    fun getLongByString() : Map<String,Long>
    fun getStringByClass() : Map<Class<*>,String>
}