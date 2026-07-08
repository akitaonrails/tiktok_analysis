package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes5.dex */
public enum DivideModel {
    EFFECT(0),
    DEFAULT(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static DivideModel valueOf(String str) {
        return (DivideModel) C08FF.LIZ(DivideModel.class, str);
    }

    DivideModel(int i) {
        this.value = i;
    }
}
