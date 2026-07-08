package com.ss.android.ugc.aweme.explore.api;

import X.C09CT;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class ExploreTopicRequestParams {

    @C09CT("custom_topics")
    public final List<ExploreCustomTopicResponse> customTopics;

    public final List<ExploreCustomTopicResponse> getCustomTopics() {
        return this.customTopics;
    }

    public ExploreTopicRequestParams(List<ExploreCustomTopicResponse> list) {
        this.customTopics = list;
    }
}
