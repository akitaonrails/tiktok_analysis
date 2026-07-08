package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class VibeFeedCloseResponse extends BaseResponse {

    @C09CT("extra_info")
    public final String extraInfo;

    @C09CT("timestamp")
    public final Long timestamp;

    public VibeFeedCloseResponse() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VibeFeedCloseResponse)) {
            return false;
        }
        VibeFeedCloseResponse vibeFeedCloseResponse = (VibeFeedCloseResponse) obj;
        return Intrinsics.LJFF(this.timestamp, vibeFeedCloseResponse.timestamp) && Intrinsics.LJFF(this.extraInfo, vibeFeedCloseResponse.extraInfo);
    }

    public final int hashCode() {
        Long l = this.timestamp;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.extraInfo;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeFeedCloseResponse(timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.extraInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VibeFeedCloseResponse(Long l, String str) {
        this.timestamp = l;
        this.extraInfo = str;
    }
}
