package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class TopicFeedTabFeatureConfig {

    @C09CT("tabs")
    public final List<TopicFeedTabConfig> tabs;

    public TopicFeedTabFeatureConfig() {
        this(null, 1, null);
    }

    public TopicFeedTabFeatureConfig(List<TopicFeedTabConfig> list) {
        this.tabs = list;
    }

    public TopicFeedTabFeatureConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
