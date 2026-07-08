package com.bytedance.android.sdk.ticketguard;

import X.C0XNA;

/* JADX INFO: loaded from: classes14.dex */
public final class ProviderRequestParam extends C0XNA {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public final boolean getNeedEncrypt() {
        return this.LIZIZ;
    }

    public final boolean getReeOnly() {
        return this.LIZ;
    }

    public ProviderRequestParam(String str, String str2) {
        this(str, str2, false, false);
    }

    public ProviderRequestParam(String str, String str2, boolean z) {
        this(str, str2, z, false);
    }

    public ProviderRequestParam(String str, String str2, boolean z, boolean z2) {
        super(str, str2, System.currentTimeMillis());
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
