package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ECSettingConfig {

    @C09CT("coupon_panel_schema")
    public final String couponPanelSchema;

    @C09CT("prefetch_schema")
    public final PrefetchSchemaConfig prefetchSchema;

    public ECSettingConfig() {
        this(null, null);
    }

    public ECSettingConfig(String str, PrefetchSchemaConfig prefetchSchemaConfig) {
        this.couponPanelSchema = str;
        this.prefetchSchema = prefetchSchemaConfig;
    }
}
