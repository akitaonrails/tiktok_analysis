package com.ss.android.ugc.aweme.topic.search.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SuggestTopicResponse extends BaseResponse {

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT(alternate = {"book_list"}, value = "movie_list")
    public final List<TopicRawInfo> infoList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestTopicResponse)) {
            return false;
        }
        SuggestTopicResponse suggestTopicResponse = (SuggestTopicResponse) obj;
        return Intrinsics.LJFF(this.infoList, suggestTopicResponse.infoList) && Intrinsics.LJFF(this.cursor, suggestTopicResponse.cursor) && Intrinsics.LJFF(this.hasMore, suggestTopicResponse.hasMore);
    }

    public final int hashCode() {
        List<TopicRawInfo> list = this.infoList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.cursor;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.hasMore;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestTopicResponse(infoList=");
        sbLIZ.append(this.infoList);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SuggestTopicResponse(List<TopicRawInfo> list, Long l, Boolean bool) {
        this.infoList = list;
        this.cursor = l;
        this.hasMore = bool;
    }
}
