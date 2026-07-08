package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AcceptInviteCardResponse extends BaseResponse {

    @C09CT("error")
    public final InviteError inviteError;

    @C09CT("invitee_group_status")
    public final Integer inviteeGroupStatus;

    public AcceptInviteCardResponse() {
        this(null, null);
    }

    public final AcceptInviteCardResponse copy(InviteError inviteError, Integer num) {
        return new AcceptInviteCardResponse(inviteError, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcceptInviteCardResponse)) {
            return false;
        }
        AcceptInviteCardResponse acceptInviteCardResponse = (AcceptInviteCardResponse) obj;
        return Intrinsics.LJFF(this.inviteError, acceptInviteCardResponse.inviteError) && Intrinsics.LJFF(this.inviteeGroupStatus, acceptInviteCardResponse.inviteeGroupStatus);
    }

    public int hashCode() {
        InviteError inviteError = this.inviteError;
        int iHashCode = (inviteError == null ? 0 : inviteError.hashCode()) * 31;
        Integer num = this.inviteeGroupStatus;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AcceptInviteCardResponse(inviteError=");
        sbLIZ.append(this.inviteError);
        sbLIZ.append(", inviteeGroupStatus=");
        sbLIZ.append(this.inviteeGroupStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final InviteError getInviteError() {
        return this.inviteError;
    }

    public final Integer getInviteeGroupStatus() {
        return this.inviteeGroupStatus;
    }

    public AcceptInviteCardResponse(InviteError inviteError, Integer num) {
        this.inviteError = inviteError;
        this.inviteeGroupStatus = num;
    }
}
