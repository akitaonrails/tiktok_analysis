package com.ss.android.ugc.aweme.ecommerce.sparkpreload;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class ECSparkPreloadInfo {

    @C09CT("channel")
    public final String channel;

    @C09CT("container_type")
    public final String containerType;

    @C09CT("delay_ms")
    public final int delayMs;

    @C09CT("schema")
    public final String schema;

    @C09CT("schema_type")
    public final int schemaType;

    @C09CT("spark_perf_biz")
    public final String sparkPerfBiz;

    public ECSparkPreloadInfo() {
        this(null, null, null, null, 0, 1);
    }

    public ECSparkPreloadInfo(String str, String str2, String str3, String str4, int i, int i2) {
        this.schema = str;
        this.channel = str2;
        this.sparkPerfBiz = str3;
        this.containerType = str4;
        this.delayMs = i;
        this.schemaType = i2;
    }
}
