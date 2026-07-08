package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;
import com.google.gson.k;

/* JADX INFO: loaded from: classes11.dex */
public final class CarePageData {

    @C09CT("height")
    public final Integer height;

    @C09CT("origin_type")
    public final Long originType;

    @C09CT("raw_data")
    public final k rawData;

    @C09CT("schema")
    public final String schema;

    public CarePageData(Integer num, Long l, String str, k kVar) {
        this.height = num;
        this.originType = l;
        this.schema = str;
        this.rawData = kVar;
    }
}
