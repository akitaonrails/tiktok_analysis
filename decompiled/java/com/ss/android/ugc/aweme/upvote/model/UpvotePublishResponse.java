package com.ss.android.ugc.aweme.upvote.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvotePublishResponse extends BaseResponse {

    @C09CT("repost_count")
    public final Long repostCount;

    @C09CT("upvote")
    public final UpvoteStruct upvote;

    @C09CT("upvote_carrier_list")
    public final List<UpvoteStruct> upvoteCarrierList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvotePublishResponse)) {
            return false;
        }
        UpvotePublishResponse upvotePublishResponse = (UpvotePublishResponse) obj;
        return Intrinsics.LJFF(this.upvote, upvotePublishResponse.upvote) && Intrinsics.LJFF(this.repostCount, upvotePublishResponse.repostCount) && Intrinsics.LJFF(this.upvoteCarrierList, upvotePublishResponse.upvoteCarrierList);
    }

    public final int hashCode() {
        UpvoteStruct upvoteStruct = this.upvote;
        int iHashCode = (upvoteStruct == null ? 0 : upvoteStruct.hashCode()) * 31;
        Long l = this.repostCount;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List<UpvoteStruct> list = this.upvoteCarrierList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpvotePublishResponse(upvote=");
        sbLIZ.append(this.upvote);
        sbLIZ.append(", repostCount=");
        sbLIZ.append(this.repostCount);
        sbLIZ.append(", upvoteCarrierList=");
        sbLIZ.append(this.upvoteCarrierList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UpvotePublishResponse(UpvoteStruct upvoteStruct, Long l, List<UpvoteStruct> list) {
        this.upvote = upvoteStruct;
        this.repostCount = l;
        this.upvoteCarrierList = list;
    }
}
