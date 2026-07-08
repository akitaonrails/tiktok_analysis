package com.ss.android.ugc.aweme.ecommercelive.common.infra.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class LiveSparkSwitchConfig {

    @C09CT("enable_spark_intercept")
    public boolean enableSparkInterceptor;

    public LiveSparkSwitchConfig() {
        this(true);
    }

    public LiveSparkSwitchConfig(boolean z) {
        this.enableSparkInterceptor = z;
    }
}
