package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class InsightEngagementList {

    @C09CT("list")
    public final List<InsightRetentionRatePair> list;

    public InsightEngagementList() {
        this(null, 1, null);
    }

    public InsightEngagementList(List<InsightRetentionRatePair> list) {
        this.list = list;
    }

    public InsightEngagementList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
