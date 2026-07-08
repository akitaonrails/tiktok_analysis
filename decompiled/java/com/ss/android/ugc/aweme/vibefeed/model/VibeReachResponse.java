package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class VibeReachResponse extends BaseResponse {

    @C09CT("both_like_card_contentpb")
    public final String coLikeContentPb;

    @C09CT("reminder_card_contentpb")
    public final String reminderContentPb;

    public VibeReachResponse() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VibeReachResponse)) {
            return false;
        }
        VibeReachResponse vibeReachResponse = (VibeReachResponse) obj;
        return Intrinsics.LJFF(this.coLikeContentPb, vibeReachResponse.coLikeContentPb) && Intrinsics.LJFF(this.reminderContentPb, vibeReachResponse.reminderContentPb);
    }

    public final int hashCode() {
        String str = this.coLikeContentPb;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reminderContentPb;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeReachResponse(coLikeContentPb=");
        sbLIZ.append(this.coLikeContentPb);
        sbLIZ.append(", reminderContentPb=");
        sbLIZ.append(this.reminderContentPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VibeReachResponse(String str, String str2) {
        this.coLikeContentPb = str;
        this.reminderContentPb = str2;
    }
}
