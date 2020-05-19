package com.namget.daggerstudy

import com.namget.daggerstudy.multibinding.DaggerMapComponent
import com.namget.daggerstudy.multibinding.MapComponent
import com.namget.daggerstudy.multibinding.MapFoo
import org.junit.Test

/**
 * Created by Namget on 2020.05.18.
 */
class MapTest {
    @Test
    fun testMultibindingMap(){
        val component= DaggerMapComponent.create()
        val value = component.getLongByString()["foo"]
        val str = component.getStringByClass()[MapFoo::class.java]
        println(value)
        println(str)
    }
}