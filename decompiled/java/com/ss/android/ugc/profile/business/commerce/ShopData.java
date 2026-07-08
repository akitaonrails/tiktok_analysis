package com.ss.android.ugc.profile.business.commerce;

import X.C09CT;
import com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class ShopData extends AdvancedFeatureBaseData {
    public static final int $stable = 8;

    @C09CT("shop_schema")
    public String shopSchema;

    public final String getShopSchema() {
        return this.shopSchema;
    }

    public final void setShopSchema(String str) {
        this.shopSchema = str;
    }
}
