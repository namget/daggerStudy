package com.namget.daggerstudy.binds

import java.security.SecureRandom
import java.util.*

/**
 * Created by Namget on 2020.05.17.
 */
abstract class Binds{
    abstract fun bindRandom(secureRandom: SecureRandom) : Random
}

