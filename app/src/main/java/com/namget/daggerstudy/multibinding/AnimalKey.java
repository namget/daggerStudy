package com.namget.daggerstudy.multibinding;

import dagger.MapKey;

@MapKey
@interface AnimalKey {
    Animal value();
}
