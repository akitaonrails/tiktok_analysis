package com.ss.android.ugc.aweme.im.callroom.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MemberStatusResponse extends BaseResponse {

    @C09CT("log_pb")
    public final Object logPb;

    @C09CT("member_status")
    public final int memberStatus;

    @C09CT("notice")
    public final VoipNotice notice;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemberStatusResponse)) {
            return false;
        }
        MemberStatusResponse memberStatusResponse = (MemberStatusResponse) obj;
        return this.memberStatus == memberStatusResponse.memberStatus && Intrinsics.LJFF(this.notice, memberStatusResponse.notice) && Intrinsics.LJFF(this.logPb, memberStatusResponse.logPb);
    }

    public final int hashCode() {
        int i = this.memberStatus * 31;
        VoipNotice voipNotice = this.notice;
        int iHashCode = (i + (voipNotice == null ? 0 : voipNotice.hashCode())) * 31;
        Object obj = this.logPb;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[memberStatus=");
        sbLIZ.append(this.memberStatus);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(", baseResponse=");
        sbLIZ.append(super.toString());
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MemberStatusResponse(int i, VoipNotice voipNotice, Object obj) {
        this.memberStatus = i;
        this.notice = voipNotice;
        this.logPb = obj;
    }
}
