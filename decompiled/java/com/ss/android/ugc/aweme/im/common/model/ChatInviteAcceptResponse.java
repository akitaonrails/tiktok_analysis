package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ChatInviteAcceptResponse extends BaseResponse {

    @C09CT("accept_status")
    public Integer acceptStatus;

    @C09CT("invitor_user_id")
    public Long invitorUserId;

    public ChatInviteAcceptResponse() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatInviteAcceptResponse)) {
            return false;
        }
        ChatInviteAcceptResponse chatInviteAcceptResponse = (ChatInviteAcceptResponse) obj;
        return Intrinsics.LJFF(this.acceptStatus, chatInviteAcceptResponse.acceptStatus) && Intrinsics.LJFF(this.invitorUserId, chatInviteAcceptResponse.invitorUserId);
    }

    public final int hashCode() {
        Integer num = this.acceptStatus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.invitorUserId;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatInviteAcceptResponse(acceptStatus=");
        sbLIZ.append(this.acceptStatus);
        sbLIZ.append(", invitorUserId=");
        sbLIZ.append(this.invitorUserId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ChatInviteAcceptResponse(Integer num, Long l) {
        this.acceptStatus = num;
        this.invitorUserId = l;
    }
}
