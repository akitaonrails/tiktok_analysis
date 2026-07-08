package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class DexCacheExpandConfig {

    @C09CT("clazz")
    public int clazz;

    @C09CT("method_field")
    public int methodField;

    @C09CT("method_type")
    public int methodType;

    @C09CT("string")
    public int string;

    public DexCacheExpandConfig() {
        this(-1, -1, -1, -1);
    }

    public final void setClazz(int i) {
        this.clazz = i;
    }

    public final void setMethodField(int i) {
        this.methodField = i;
    }

    public final void setMethodType(int i) {
        this.methodType = i;
    }

    public final void setString(int i) {
        this.string = i;
    }

    public DexCacheExpandConfig(int i, int i2, int i3, int i4) {
        this.methodField = i;
        this.clazz = i2;
        this.string = i3;
        this.methodType = i4;
    }
}
