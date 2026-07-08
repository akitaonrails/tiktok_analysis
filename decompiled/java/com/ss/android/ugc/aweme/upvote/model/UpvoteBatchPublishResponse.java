package com.ss.android.ugc.aweme.upvote.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UpvoteBatchPublishResponse extends BaseResponse {

    @C09CT("failed_item_ids")
    public final List<String> failedItemIds;

    @C09CT("upvotes")
    public final List<UpvoteStruct> upvotes;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvoteBatchPublishResponse)) {
            return false;
        }
        UpvoteBatchPublishResponse upvoteBatchPublishResponse = (UpvoteBatchPublishResponse) obj;
        return Intrinsics.LJFF(this.upvotes, upvoteBatchPublishResponse.upvotes) && Intrinsics.LJFF(this.failedItemIds, upvoteBatchPublishResponse.failedItemIds);
    }

    public final int hashCode() {
        List<UpvoteStruct> list = this.upvotes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.failedItemIds;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpvoteBatchPublishResponse(upvotes=");
        sbLIZ.append(this.upvotes);
        sbLIZ.append(", failedItemIds=");
        sbLIZ.append(this.failedItemIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UpvoteBatchPublishResponse(List<UpvoteStruct> list, List<String> list2) {
        this.upvotes = list;
        this.failedItemIds = list2;
    }
}
