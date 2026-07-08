package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class PoiBoostData implements Serializable {

    @C09CT("boost_cnt")
    public final String boostCount;

    @C09CT("schema")
    public final String schema;

    public PoiBoostData() {
        this(null, null);
    }

    public PoiBoostData(String str, String str2) {
        this.schema = str;
        this.boostCount = str2;
    }
}
