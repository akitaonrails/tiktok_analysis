package com.ss.android.ugc.aweme.explore.api;

import X.C09CT;
import X.C20527315Tz;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreTopicFeedRequestParams {
    public static final C20527315Tz Companion = new Object() { // from class: X.15Tz
    };

    @C09CT("aweme_ids")
    public final List<String> awemeIds;

    @C09CT("count")
    public final int count;

    @C09CT("custom_topic_id")
    public final Long customTopicId;

    @C09CT("custom_topic_name")
    public final String customTopicName;

    @C09CT("need_chunk")
    public final Boolean needChunk;

    @C09CT("pull_type")
    public final Integer pullType;

    public final List<String> getAwemeIds() {
        return this.awemeIds;
    }

    public final int getCount() {
        return this.count;
    }

    public final Long getCustomTopicId() {
        return this.customTopicId;
    }

    public final String getCustomTopicName() {
        return this.customTopicName;
    }

    public final Boolean getNeedChunk() {
        return this.needChunk;
    }

    public final Integer getPullType() {
        return this.pullType;
    }

    public ExploreTopicFeedRequestParams(int i, Long l, String str, Integer num, Boolean bool, List<String> list) {
        this.count = i;
        this.customTopicId = l;
        this.customTopicName = str;
        this.pullType = num;
        this.needChunk = bool;
        this.awemeIds = list;
    }
}
