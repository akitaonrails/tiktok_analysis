package com.bytedance.sdk.account.platform.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class CsrfMonitorSwitch {

    @C09CT("enable_interceptor")
    public final boolean enableInterceptor;

    @C09CT("enable_account_sdk")
    public final boolean enableSDK;

    public CsrfMonitorSwitch() {
        this(false, false);
    }

    public CsrfMonitorSwitch(boolean z, boolean z2) {
        this.enableInterceptor = z;
        this.enableSDK = z2;
    }
}
