package com.ss.android.ugc.aweme.topic.trendingtopic.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TrendingTopicSearchResponse extends BaseResponse {

    @C09CT("billboard_plain_info")
    public final List<VideoTrendingTopic> topics;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrendingTopicSearchResponse) && Intrinsics.LJFF(this.topics, ((TrendingTopicSearchResponse) obj).topics);
    }

    public final int hashCode() {
        List<VideoTrendingTopic> list = this.topics;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrendingTopicSearchResponse(topics=");
        sbLIZ.append(this.topics);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TrendingTopicSearchResponse(List<VideoTrendingTopic> list) {
        this.topics = list;
    }
}
