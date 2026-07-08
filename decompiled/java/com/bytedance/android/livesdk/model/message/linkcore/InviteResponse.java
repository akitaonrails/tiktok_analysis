package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.controller.InviteResultInfo;
import webcast.data.multilive_biz.BizInviteResponse;

/* JADX INFO: loaded from: classes.dex */
public final class InviteResponse extends LinkMicUplinkBaseResp {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("invite_result_list")
    public List<InviteResultInfo> inviteResultList;

    @C09CT("invite_seq_id")
    public long inviteSeqId;

    @C09CT("invitee_link_mic_id")
    public String inviteeLinkMicId;

    @C09CT("invitor_link_mic_id")
    public String inviterLinkMicId;

    @C09CT("multi_guest_resp_extra")
    public BizInviteResponse multiGuestRespExtra;

    @C09CT("invitor_ext_info")
    public RTCExtraInfo rtcInfo;

    public InviteResponse() {
        this(0L, null, null, null, 0L, null, new ArrayList());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteResponse)) {
            return false;
        }
        InviteResponse inviteResponse = (InviteResponse) obj;
        return this.channelId == inviteResponse.channelId && Intrinsics.LJFF(this.rtcInfo, inviteResponse.rtcInfo) && Intrinsics.LJFF(this.inviterLinkMicId, inviteResponse.inviterLinkMicId) && Intrinsics.LJFF(this.inviteeLinkMicId, inviteResponse.inviteeLinkMicId) && this.inviteSeqId == inviteResponse.inviteSeqId && Intrinsics.LJFF(this.multiGuestRespExtra, inviteResponse.multiGuestRespExtra) && Intrinsics.LJFF(this.inviteResultList, inviteResponse.inviteResultList);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.channelId) * 31;
        RTCExtraInfo rTCExtraInfo = this.rtcInfo;
        int iHashCode = (iY2 + (rTCExtraInfo == null ? 0 : rTCExtraInfo.hashCode())) * 31;
        String str = this.inviterLinkMicId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.inviteeLinkMicId;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Y2(this.inviteSeqId)) * 31;
        BizInviteResponse bizInviteResponse = this.multiGuestRespExtra;
        return ((iHashCode3 + (bizInviteResponse != null ? bizInviteResponse.hashCode() : 0)) * 31) + this.inviteResultList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteResponse(channelId=");
        sbLIZ.append(this.channelId);
        sbLIZ.append(", rtcInfo=");
        sbLIZ.append(this.rtcInfo);
        sbLIZ.append(", inviterLinkMicId=");
        sbLIZ.append(this.inviterLinkMicId);
        sbLIZ.append(", inviteeLinkMicId=");
        sbLIZ.append(this.inviteeLinkMicId);
        sbLIZ.append(", inviteSeqId=");
        sbLIZ.append(this.inviteSeqId);
        sbLIZ.append(", multiGuestRespExtra=");
        sbLIZ.append(this.multiGuestRespExtra);
        sbLIZ.append(", inviteResultList=");
        sbLIZ.append(this.inviteResultList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InviteResponse(long j, RTCExtraInfo rTCExtraInfo, String str, String str2, long j2, BizInviteResponse bizInviteResponse, List<InviteResultInfo> list) {
        super(null);
        this.channelId = j;
        this.rtcInfo = rTCExtraInfo;
        this.inviterLinkMicId = str;
        this.inviteeLinkMicId = str2;
        this.inviteSeqId = j2;
        this.multiGuestRespExtra = bizInviteResponse;
        this.inviteResultList = list;
    }
}
