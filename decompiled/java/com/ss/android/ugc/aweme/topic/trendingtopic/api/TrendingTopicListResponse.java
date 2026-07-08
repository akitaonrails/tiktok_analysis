package com.ss.android.ugc.aweme.topic.trendingtopic.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TrendingTopicListResponse extends BaseResponse {

    @C09CT("billboard_info")
    public final List<BillboardInfo> topicList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrendingTopicListResponse) && Intrinsics.LJFF(this.topicList, ((TrendingTopicListResponse) obj).topicList);
    }

    public final int hashCode() {
        List<BillboardInfo> list = this.topicList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrendingTopicListResponse(topicList=");
        sbLIZ.append(this.topicList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TrendingTopicListResponse(List<BillboardInfo> list) {
        this.topicList = list;
    }
}
