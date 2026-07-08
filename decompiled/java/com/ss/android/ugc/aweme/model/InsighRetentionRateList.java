package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class InsighRetentionRateList {

    @C09CT("value")
    public final List<InsightRetentionRatePair> value;

    public InsighRetentionRateList() {
        this(null, 1, null);
    }

    public InsighRetentionRateList(List<InsightRetentionRatePair> list) {
        this.value = list;
    }

    public InsighRetentionRateList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
