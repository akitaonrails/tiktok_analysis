package com.ss.android.ugc.aweme.ecommerce.ug.popup.libra;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgMallLandingDeeplinkFallbackModel {

    @C09CT("enable_monitor_lifecycle_callback")
    public final boolean enableMonitorLifecycleCallback;

    @C09CT("monitor_lifecycle_callback_timeout")
    public final int monitorLifecycleCallbackTimeout;

    public EcUgMallLandingDeeplinkFallbackModel() {
        this(false, 0);
    }

    public EcUgMallLandingDeeplinkFallbackModel(boolean z, int i) {
        this.enableMonitorLifecycleCallback = z;
        this.monitorLifecycleCallbackTimeout = i;
    }
}
