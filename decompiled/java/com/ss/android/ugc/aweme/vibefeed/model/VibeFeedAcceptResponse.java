package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class VibeFeedAcceptResponse extends BaseResponse {

    @C09CT("feed_create_time")
    public final Long feedCreateTime;

    @C09CT("feed_id")
    public final String feedId;

    public VibeFeedAcceptResponse() {
        this(0L, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VibeFeedAcceptResponse)) {
            return false;
        }
        VibeFeedAcceptResponse vibeFeedAcceptResponse = (VibeFeedAcceptResponse) obj;
        return Intrinsics.LJFF(this.feedCreateTime, vibeFeedAcceptResponse.feedCreateTime) && Intrinsics.LJFF(this.feedId, vibeFeedAcceptResponse.feedId);
    }

    public final int hashCode() {
        Long l = this.feedCreateTime;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.feedId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeFeedAcceptResponse(feedCreateTime=");
        sbLIZ.append(this.feedCreateTime);
        sbLIZ.append(", feedId=");
        sbLIZ.append(this.feedId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VibeFeedAcceptResponse(Long l, String str) {
        this.feedCreateTime = l;
        this.feedId = str;
    }
}
