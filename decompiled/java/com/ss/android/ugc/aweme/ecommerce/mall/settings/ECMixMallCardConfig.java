package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMixMallCardConfig {

    @C09CT("count")
    public final int count;

    @C09CT("lynx_schema")
    public final String lynxSchema;

    @C09CT("type")
    public final String type;

    public ECMixMallCardConfig() {
        this("", 0, "");
    }

    public ECMixMallCardConfig(String str, int i, String str2) {
        this.type = str;
        this.count = i;
        this.lynxSchema = str2;
    }
}
