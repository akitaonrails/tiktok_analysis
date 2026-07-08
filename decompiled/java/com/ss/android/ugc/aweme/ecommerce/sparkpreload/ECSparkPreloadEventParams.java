package com.ss.android.ugc.aweme.ecommerce.sparkpreload;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ECSparkPreloadEventParams {

    @C09CT("event_name")
    public final String eventName;

    @C09CT("matchers")
    public final List<Map<String, String>> matchers;

    public ECSparkPreloadEventParams() {
        this(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ECSparkPreloadEventParams(String str, List<? extends Map<String, String>> list) {
        this.eventName = str;
        this.matchers = list;
    }
}
