package com.namget.daggerstudy

import com.namget.daggerstudy.multibinding.Animal
import com.namget.daggerstudy.multibinding.DaggerMayKeyComponent
import org.junit.Test

/**
 * Created by Namget on 2020.05.19.
 */
class KeyTest {

    @Test
    fun testCustomMapKey(){
        val component = DaggerMayKeyComponent.create()
        val cat = component.getStringByAnimal()[Animal.CAT]
        val dog = component.getStringByAnimal()[Animal.DOG]
        val number = component.getStringByNumber()[Float::class.java]
        println(cat)
        println(dog)
        println(number)
    }

}