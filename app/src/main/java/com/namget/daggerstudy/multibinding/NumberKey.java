package com.namget.daggerstudy.multibinding;

import dagger.MapKey;

@MapKey
@interface NumberKey {
    Class<? extends Number> value();
}
