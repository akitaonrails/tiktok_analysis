package com.ss.android.ugc.aweme.commercialize.preview.model;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class AdsOnDemandQuery {

    @C09CT("adv_id")
    public final String advId;

    @C09CT("features")
    public final Map<String, List<String>> features;

    public AdsOnDemandQuery() {
        this(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdsOnDemandQuery(Map<String, ? extends List<String>> map, String str) {
        this.features = map;
        this.advId = str;
    }
}
