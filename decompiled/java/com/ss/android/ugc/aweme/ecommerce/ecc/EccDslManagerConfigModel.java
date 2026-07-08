package com.ss.android.ugc.aweme.ecommerce.ecc;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class EccDslManagerConfigModel {

    @C09CT("dsl_fetch_throttle")
    public final long dslFetchThrottle;

    @C09CT("dsl_manager_enable")
    public final boolean dslManageEnable;

    public EccDslManagerConfigModel() {
        this(86400L, false);
    }

    public EccDslManagerConfigModel(long j, boolean z) {
        this.dslFetchThrottle = j;
        this.dslManageEnable = z;
    }
}
