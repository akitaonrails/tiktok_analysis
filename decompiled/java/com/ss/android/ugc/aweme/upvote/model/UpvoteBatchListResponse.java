package com.ss.android.ugc.aweme.upvote.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class UpvoteBatchListResponse extends BaseResponse {

    @C09CT("biz_extra")
    public final Map<String, Long> upvoteExtra;

    @C09CT("upvote_lists")
    public final List<UpvoteList> upvoteLists;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvoteBatchListResponse)) {
            return false;
        }
        UpvoteBatchListResponse upvoteBatchListResponse = (UpvoteBatchListResponse) obj;
        return Intrinsics.LJFF(this.upvoteLists, upvoteBatchListResponse.upvoteLists) && Intrinsics.LJFF(this.upvoteExtra, upvoteBatchListResponse.upvoteExtra);
    }

    public final int hashCode() {
        int iHashCode = this.upvoteLists.hashCode() * 31;
        Map<String, Long> map = this.upvoteExtra;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpvoteBatchListResponse(upvoteLists=");
        sbLIZ.append(this.upvoteLists);
        sbLIZ.append(", upvoteExtra=");
        sbLIZ.append(this.upvoteExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UpvoteBatchListResponse(List<UpvoteList> list, Map<String, Long> map) {
        this.upvoteLists = list;
        this.upvoteExtra = map;
    }
}
