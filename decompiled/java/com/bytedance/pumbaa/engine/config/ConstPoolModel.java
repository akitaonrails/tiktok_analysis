package com.bytedance.pumbaa.engine.config;

import X.C09CT;
import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ConstPoolModel {

    @C09CT("config")
    public final String config;

    @C09CT("domain_recognize")
    public final n domainConfigs;

    @C09CT("extra")
    public final String extra;

    @C09CT("version")
    public final int version;

    public ConstPoolModel() {
        this(null, null, null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConstPoolModel)) {
            return false;
        }
        ConstPoolModel constPoolModel = (ConstPoolModel) obj;
        return Intrinsics.LJFF(this.config, constPoolModel.config) && Intrinsics.LJFF(this.extra, constPoolModel.extra) && Intrinsics.LJFF(this.domainConfigs, constPoolModel.domainConfigs) && this.version == constPoolModel.version;
    }

    public ConstPoolModel(String str, String str2, n nVar, int i) {
        this.config = str;
        this.extra = str2;
        this.domainConfigs = nVar;
        this.version = i;
    }
}
