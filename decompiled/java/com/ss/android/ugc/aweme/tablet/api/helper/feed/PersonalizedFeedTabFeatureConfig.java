package com.ss.android.ugc.aweme.tablet.api.helper.feed;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class PersonalizedFeedTabFeatureConfig {

    @C09CT("TopicDataSourceURL")
    public final String dataSource;

    @C09CT("Topics")
    public final List<PersonalizedFeedTabConfig> tabs;

    public PersonalizedFeedTabFeatureConfig() {
        this(null, null, 3, null);
    }

    public PersonalizedFeedTabFeatureConfig(List<PersonalizedFeedTabConfig> list, String str) {
        this.tabs = list;
        this.dataSource = str;
    }

    public PersonalizedFeedTabFeatureConfig(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : str);
    }
}
