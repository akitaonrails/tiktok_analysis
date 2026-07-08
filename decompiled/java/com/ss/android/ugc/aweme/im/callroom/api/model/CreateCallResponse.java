package com.ss.android.ugc.aweme.im.callroom.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CreateCallResponse extends BaseResponse {

    @C09CT("log_pb")
    public final Object logPb;

    @C09CT("notice")
    public final VoipNotice notice;

    @C09CT("room_info")
    public final RoomInfo roomInfo;

    @C09CT("rtc_info")
    public final RtcInfo rtcInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateCallResponse)) {
            return false;
        }
        CreateCallResponse createCallResponse = (CreateCallResponse) obj;
        return Intrinsics.LJFF(this.roomInfo, createCallResponse.roomInfo) && Intrinsics.LJFF(this.rtcInfo, createCallResponse.rtcInfo) && Intrinsics.LJFF(this.notice, createCallResponse.notice) && Intrinsics.LJFF(this.logPb, createCallResponse.logPb);
    }

    public final int hashCode() {
        RoomInfo roomInfo = this.roomInfo;
        int iHashCode = (roomInfo == null ? 0 : roomInfo.hashCode()) * 31;
        RtcInfo rtcInfo = this.rtcInfo;
        int iHashCode2 = (iHashCode + (rtcInfo == null ? 0 : rtcInfo.hashCode())) * 31;
        VoipNotice voipNotice = this.notice;
        int iHashCode3 = (iHashCode2 + (voipNotice == null ? 0 : voipNotice.hashCode())) * 31;
        Object obj = this.logPb;
        return iHashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[roomInfo=");
        sbLIZ.append(this.roomInfo);
        sbLIZ.append(", rtcInfo=");
        sbLIZ.append(this.rtcInfo);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(", baseResponse=");
        sbLIZ.append(super.toString());
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreateCallResponse(RoomInfo roomInfo, RtcInfo rtcInfo, VoipNotice voipNotice, Object obj) {
        this.roomInfo = roomInfo;
        this.rtcInfo = rtcInfo;
        this.notice = voipNotice;
        this.logPb = obj;
    }
}
