package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ReplyResponse extends LinkMicUplinkBaseResp {

    @C09CT("invitee_link_mic_id")
    public String inviteeLinkMicId;

    @C09CT("layout")
    public LayoutState layout;

    @C09CT("linked_user_ui_positions")
    public List<String> linkedUserUiPositions;

    @C09CT("multi_guest_resp_extra")
    public BizReplyResponse multiGuestRespExtra;

    @C09CT("invitee_pos")
    public MicPositionData position;

    @C09CT("invitee_ext_info")
    public RTCExtraInfo rtcInfo;

    @C09CT("spot_list")
    public List<SpotInfo> spotList;

    @C09CT("ui_pos")
    public List<PosIdentity> uiPos;

    public ReplyResponse() {
        this(null, null, null, null, new ArrayList(), new ArrayList(), null, new ArrayList());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplyResponse)) {
            return false;
        }
        ReplyResponse replyResponse = (ReplyResponse) obj;
        return Intrinsics.LJFF(this.rtcInfo, replyResponse.rtcInfo) && Intrinsics.LJFF(this.inviteeLinkMicId, replyResponse.inviteeLinkMicId) && Intrinsics.LJFF(this.position, replyResponse.position) && Intrinsics.LJFF(this.multiGuestRespExtra, replyResponse.multiGuestRespExtra) && Intrinsics.LJFF(this.linkedUserUiPositions, replyResponse.linkedUserUiPositions) && Intrinsics.LJFF(this.uiPos, replyResponse.uiPos) && Intrinsics.LJFF(this.layout, replyResponse.layout) && Intrinsics.LJFF(this.spotList, replyResponse.spotList);
    }

    public final int hashCode() {
        RTCExtraInfo rTCExtraInfo = this.rtcInfo;
        int iHashCode = (rTCExtraInfo == null ? 0 : rTCExtraInfo.hashCode()) * 31;
        String str = this.inviteeLinkMicId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MicPositionData micPositionData = this.position;
        int iHashCode3 = (iHashCode2 + (micPositionData == null ? 0 : micPositionData.hashCode())) * 31;
        BizReplyResponse bizReplyResponse = this.multiGuestRespExtra;
        int iHashCode4 = (((((iHashCode3 + (bizReplyResponse == null ? 0 : bizReplyResponse.hashCode())) * 31) + this.linkedUserUiPositions.hashCode()) * 31) + this.uiPos.hashCode()) * 31;
        LayoutState layoutState = this.layout;
        return ((iHashCode4 + (layoutState != null ? layoutState.hashCode() : 0)) * 31) + this.spotList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplyResponse(rtcInfo=");
        sbLIZ.append(this.rtcInfo);
        sbLIZ.append(", inviteeLinkMicId=");
        sbLIZ.append(this.inviteeLinkMicId);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", multiGuestRespExtra=");
        sbLIZ.append(this.multiGuestRespExtra);
        sbLIZ.append(", linkedUserUiPositions=");
        sbLIZ.append(this.linkedUserUiPositions);
        sbLIZ.append(", uiPos=");
        sbLIZ.append(this.uiPos);
        sbLIZ.append(", layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(", spotList=");
        sbLIZ.append(this.spotList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ReplyResponse(RTCExtraInfo rTCExtraInfo, String str, MicPositionData micPositionData, BizReplyResponse bizReplyResponse, List<String> list, List<PosIdentity> list2, LayoutState layoutState, List<SpotInfo> list3) {
        super(null);
        this.rtcInfo = rTCExtraInfo;
        this.inviteeLinkMicId = str;
        this.position = micPositionData;
        this.multiGuestRespExtra = bizReplyResponse;
        this.linkedUserUiPositions = list;
        this.uiPos = list2;
        this.layout = layoutState;
        this.spotList = list3;
    }
}
