package com.ss.android.ugc.aweme.pipo.payments.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcomPipoBraintreeSdkConfigModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_preload")
    public final boolean enablePreload;

    public EcomPipoBraintreeSdkConfigModel() {
        this(false, false);
    }

    public EcomPipoBraintreeSdkConfigModel(boolean z, boolean z2) {
        this.enablePreload = z;
        this.enable = z2;
    }
}
