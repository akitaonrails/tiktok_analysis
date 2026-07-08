package com.ss.android.ugc.aweme.topic.trendingtopic.api;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class BillboardInfo {

    @C09CT("event_info")
    public final List<VideoTrendingTopic> topics;

    @C09CT("billboard_type")
    public final Integer type;

    public BillboardInfo(Integer num, List<VideoTrendingTopic> list) {
        this.type = num;
        this.topics = list;
    }
}
