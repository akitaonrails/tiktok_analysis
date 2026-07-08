package com.ss.android.ugc.aweme.ecommerce.showcase.mix;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class SparkPreloadData {

    @C09CT("gecko_channel")
    public final String geckoChannel;

    @C09CT("origin_schema")
    public final String originSchema;

    @C09CT("preload_type")
    public final Integer preloadPeriod;

    @C09CT("schema")
    public final String schema;

    @C09CT("type")
    public final Integer type;

    public SparkPreloadData(Integer num, Integer num2, String str, String str2, String str3) {
        this.type = num;
        this.preloadPeriod = num2;
        this.geckoChannel = str;
        this.schema = str2;
        this.originSchema = str3;
    }
}
