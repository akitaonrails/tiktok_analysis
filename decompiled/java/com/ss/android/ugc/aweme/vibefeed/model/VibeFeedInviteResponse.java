package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class VibeFeedInviteResponse extends BaseResponse {

    @C09CT("invite_card_content_pb")
    public final String inviteCardContentPB;

    @C09CT("invite_timestamp")
    public final Long inviteTimeStamp;

    public VibeFeedInviteResponse() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VibeFeedInviteResponse)) {
            return false;
        }
        VibeFeedInviteResponse vibeFeedInviteResponse = (VibeFeedInviteResponse) obj;
        return Intrinsics.LJFF(this.inviteCardContentPB, vibeFeedInviteResponse.inviteCardContentPB) && Intrinsics.LJFF(this.inviteTimeStamp, vibeFeedInviteResponse.inviteTimeStamp);
    }

    public final int hashCode() {
        String str = this.inviteCardContentPB;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.inviteTimeStamp;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeFeedInviteResponse(inviteCardContentPB=");
        sbLIZ.append(this.inviteCardContentPB);
        sbLIZ.append(", inviteTimeStamp=");
        sbLIZ.append(this.inviteTimeStamp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VibeFeedInviteResponse(String str, Long l) {
        this.inviteCardContentPB = str;
        this.inviteTimeStamp = l;
    }
}
