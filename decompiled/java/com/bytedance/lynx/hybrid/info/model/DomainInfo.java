package com.bytedance.lynx.hybrid.info.model;

import X.C09CT;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class DomainInfo {

    @C09CT("source")
    public final int source;

    public DomainInfo() {
        this(0, 1, null);
    }

    public DomainInfo(int i) {
        this.source = i;
    }

    public /* synthetic */ DomainInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i);
    }
}
