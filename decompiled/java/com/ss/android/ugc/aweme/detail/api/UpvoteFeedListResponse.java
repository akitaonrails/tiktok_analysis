package com.ss.android.ugc.aweme.detail.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class UpvoteFeedListResponse extends BaseResponse {

    @C09CT("pagination")
    public FeedPagination pagination;

    @C09CT("data")
    public final ArrayList<UpvoteFeedStruct> upvoteFeedList;

    public UpvoteFeedListResponse() {
        this(new ArrayList(), new FeedPagination(false, 0L, null, null, null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvoteFeedListResponse)) {
            return false;
        }
        UpvoteFeedListResponse upvoteFeedListResponse = (UpvoteFeedListResponse) obj;
        return Intrinsics.LJFF(this.upvoteFeedList, upvoteFeedListResponse.upvoteFeedList) && Intrinsics.LJFF(this.pagination, upvoteFeedListResponse.pagination);
    }

    public final int hashCode() {
        return (this.upvoteFeedList.hashCode() * 31) + this.pagination.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpvoteFeedListResponse(upvoteFeedList=");
        sbLIZ.append(this.upvoteFeedList);
        sbLIZ.append(", pagination=");
        sbLIZ.append(this.pagination);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UpvoteFeedListResponse(ArrayList<UpvoteFeedStruct> arrayList, FeedPagination feedPagination) {
        this.upvoteFeedList = arrayList;
        this.pagination = feedPagination;
    }
}
