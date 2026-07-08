package com.ss.android.ugc.aweme.ecommerce.ectracker;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class EcTrackerFilterConfig {

    @C09CT("btm_filter")
    public final List<String> btmFilter;

    @C09CT("key")
    public final String key;

    public EcTrackerFilterConfig() {
        this(null, null);
    }

    public EcTrackerFilterConfig(String str, List<String> list) {
        this.key = str;
        this.btmFilter = list;
    }
}
