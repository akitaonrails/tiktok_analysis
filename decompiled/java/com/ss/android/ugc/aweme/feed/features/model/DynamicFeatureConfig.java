package com.ss.android.ugc.aweme.feed.features.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class DynamicFeatureConfig {

    @C09CT("dynamic_feature_events")
    public final List<String> eventWhiteList;

    public DynamicFeatureConfig() {
        this(null, 1, null);
    }

    public DynamicFeatureConfig(List<String> list) {
        this.eventWhiteList = list;
    }

    public DynamicFeatureConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
