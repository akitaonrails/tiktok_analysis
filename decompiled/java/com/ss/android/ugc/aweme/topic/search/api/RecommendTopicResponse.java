package com.ss.android.ugc.aweme.topic.search.api;

import X.C09CT;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class RecommendTopicResponse {

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("page_extra")
    public final String pageExtra;

    @C09CT("topic_info")
    public final List<TopicRawInfo> topicInfoList;

    public RecommendTopicResponse(List<TopicRawInfo> list, Boolean bool, String str) {
        this.topicInfoList = list;
        this.hasMore = bool;
        this.pageExtra = str;
    }
}
