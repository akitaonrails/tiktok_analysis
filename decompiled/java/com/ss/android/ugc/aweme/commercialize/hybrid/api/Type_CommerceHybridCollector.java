package com.ss.android.ugc.aweme.commercialize.hybrid.api;

import X.C2097608Jq;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class Type_CommerceHybridCollector {
    public static final Type_CommerceHybridCollector INSTANCE = new Type_CommerceHybridCollector();
    public static final Map<String, String> TYPE_COLLECTOR = C2097608Jq.LJIIJ(new Pair("SPARK", "com.ss.android.ugc.aweme.commercialize.hybrid.impl.spark.AdHybridSparkLoader"), new Pair("WEB", "com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.AdWebLoader"), new Pair("ASYNCSARK", "com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridAsyncSparkLoader"), new Pair("SPARK_LITE", "com.ss.android.ugc.aweme.commercialize.hybrid.impl.sparklite.AdHybridSparkLiteLoader"));

    public final Map<String, String> getTYPE_COLLECTOR() {
        return TYPE_COLLECTOR;
    }
}
