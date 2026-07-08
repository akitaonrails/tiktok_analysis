package com.bytedance.android.starship.solaria.define;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class FunctionParam implements Serializable {

    @C09CT("calc_type")
    public final int calcType;

    @C09CT("calc_value")
    public final long calcValue;

    @C09CT("operation")
    public final int operation;

    @C09CT("return_type")
    public final int returnType;

    public FunctionParam() {
        this(0, 0, 0L, 0);
    }

    public FunctionParam(int i, int i2, long j, int i3) {
        this.operation = i;
        this.calcType = i2;
        this.calcValue = j;
        this.returnType = i3;
    }
}
