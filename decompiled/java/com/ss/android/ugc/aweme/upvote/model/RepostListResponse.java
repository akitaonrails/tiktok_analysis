package com.ss.android.ugc.aweme.upvote.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RepostListResponse extends BaseResponse {
    public final boolean LL;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("aweme_list")
    public final List<Aweme> repostList;

    @C09CT("biz_extra")
    public final Map<String, Long> upvoteExtra;

    @C09CT("upvote_lists")
    public final List<UpvoteList> upvoteLists;

    public RepostListResponse() {
        this(null, false, null, null, false, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepostListResponse)) {
            return false;
        }
        RepostListResponse repostListResponse = (RepostListResponse) obj;
        return Intrinsics.LJFF(this.repostList, repostListResponse.repostList) && this.hasMore == repostListResponse.hasMore && Intrinsics.LJFF(this.upvoteExtra, repostListResponse.upvoteExtra) && Intrinsics.LJFF(this.upvoteLists, repostListResponse.upvoteLists) && this.LL == repostListResponse.LL;
    }

    public final int hashCode() {
        int iHashCode = ((this.repostList.hashCode() * 31) + C786410Ut5.Z2(this.hasMore)) * 31;
        Map<String, Long> map = this.upvoteExtra;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<UpvoteList> list = this.upvoteLists;
        return ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LL);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostListResponse(repostList=");
        sbLIZ.append(this.repostList);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", upvoteExtra=");
        sbLIZ.append(this.upvoteExtra);
        sbLIZ.append(", upvoteLists=");
        sbLIZ.append(this.upvoteLists);
        sbLIZ.append(", isPreload=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RepostListResponse(List<? extends Aweme> list, boolean z, Map<String, Long> map, List<UpvoteList> list2, boolean z2) {
        this.repostList = list;
        this.hasMore = z;
        this.upvoteExtra = map;
        this.upvoteLists = list2;
        this.LL = z2;
    }

    public RepostListResponse(List list, boolean z, Map map, List list2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : map, (i & 8) == 0 ? list2 : null, (i & 16) == 0 ? z2 : false);
    }
}
