package com.namget.daggerstudy

import com.namget.daggerstudy.singleton.DaggerSingletonComponent
import com.namget.daggerstudy.singleton.SingletonComponent
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun testHelloWorld() {
        val myComponent: MyComponent = DaggerMyComponent.create()
        println("result : = ${myComponent.getString()}")
    }

    @Test
    fun testInject() {
//        val personComponent = DaggerPer
    }

    @Test
    fun testSingleton() {
        val singletonComponent: SingletonComponent = DaggerSingletonComponent.create()
        val temp1 = singletonComponent.getString()
        val temp2 = singletonComponent.getString()
        assertSame(temp1, temp2)
    }

}
