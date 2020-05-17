package com.namget.daggerstudy

import dagger.Module
import dagger.Provides

/**
 * Created by Namget on 2020.05.17.
 * 중복 타입을 선언 하면 안된다.
 *
 */
@Module(includes = [MyModule::class])
class MyModuleTwo {
    @Provides
    fun provideClassB() : ClassB{
        return ClassB()
    }
}