package com.bytedance.lynx.hybrid.info.model;

import X.C09CT;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class GlobalConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("tag")
    public final boolean tag;

    /* JADX WARN: Illegal instructions before constructor call */
    public GlobalConfig() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public GlobalConfig(boolean z, boolean z2) {
        this.enable = z;
        this.tag = z2;
    }

    public /* synthetic */ GlobalConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
