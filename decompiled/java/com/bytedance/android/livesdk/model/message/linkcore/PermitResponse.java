package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import webcast.data.multilive_biz.BizPermitResponse;

/* JADX INFO: loaded from: classes.dex */
public final class PermitResponse extends LinkMicUplinkBaseResp {

    @C09CT("applier")
    public Player applier;

    @C09CT("applier_link_mic_id")
    public String applierLinkMicId;

    @C09CT("layout")
    public LayoutState layout;

    @C09CT("permiter_link_mic_id")
    public String linkMicId;

    @C09CT("linked_user_ui_positions")
    public List<String> linkedUserUiPositions;

    @C09CT("multi_guest_resp_extra")
    public BizPermitResponse multiGuestRespExtra;

    @C09CT("applier_pos")
    public MicPositionData position;

    @C09CT("permiter_ext_info")
    public RTCExtraInfo rtcInfo;

    @C09CT("spot_list")
    public List<SpotInfo> spotList;

    @C09CT("ui_pos")
    public List<PosIdentity> uiPos;

    public PermitResponse() {
        this(null, null, null, null, "", new ArrayList(), null, new ArrayList(), null, new ArrayList());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermitResponse)) {
            return false;
        }
        PermitResponse permitResponse = (PermitResponse) obj;
        return Intrinsics.LJFF(this.rtcInfo, permitResponse.rtcInfo) && Intrinsics.LJFF(this.linkMicId, permitResponse.linkMicId) && Intrinsics.LJFF(this.position, permitResponse.position) && Intrinsics.LJFF(this.applier, permitResponse.applier) && Intrinsics.LJFF(this.applierLinkMicId, permitResponse.applierLinkMicId) && Intrinsics.LJFF(this.linkedUserUiPositions, permitResponse.linkedUserUiPositions) && Intrinsics.LJFF(this.multiGuestRespExtra, permitResponse.multiGuestRespExtra) && Intrinsics.LJFF(this.uiPos, permitResponse.uiPos) && Intrinsics.LJFF(this.layout, permitResponse.layout) && Intrinsics.LJFF(this.spotList, permitResponse.spotList);
    }

    public final int hashCode() {
        RTCExtraInfo rTCExtraInfo = this.rtcInfo;
        int iHashCode = (rTCExtraInfo == null ? 0 : rTCExtraInfo.hashCode()) * 31;
        String str = this.linkMicId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MicPositionData micPositionData = this.position;
        int iHashCode3 = (iHashCode2 + (micPositionData == null ? 0 : micPositionData.hashCode())) * 31;
        Player player = this.applier;
        int iHashCode4 = (((((iHashCode3 + (player == null ? 0 : player.hashCode())) * 31) + this.applierLinkMicId.hashCode()) * 31) + this.linkedUserUiPositions.hashCode()) * 31;
        BizPermitResponse bizPermitResponse = this.multiGuestRespExtra;
        int iHashCode5 = (((iHashCode4 + (bizPermitResponse == null ? 0 : bizPermitResponse.hashCode())) * 31) + this.uiPos.hashCode()) * 31;
        LayoutState layoutState = this.layout;
        return ((iHashCode5 + (layoutState != null ? layoutState.hashCode() : 0)) * 31) + this.spotList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PermitResponse(rtcInfo=");
        sbLIZ.append(this.rtcInfo);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(this.linkMicId);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", applier=");
        sbLIZ.append(this.applier);
        sbLIZ.append(", applierLinkMicId=");
        sbLIZ.append(this.applierLinkMicId);
        sbLIZ.append(", linkedUserUiPositions=");
        sbLIZ.append(this.linkedUserUiPositions);
        sbLIZ.append(", multiGuestRespExtra=");
        sbLIZ.append(this.multiGuestRespExtra);
        sbLIZ.append(", uiPos=");
        sbLIZ.append(this.uiPos);
        sbLIZ.append(", layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(", spotList=");
        sbLIZ.append(this.spotList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PermitResponse(RTCExtraInfo rTCExtraInfo, String str, MicPositionData micPositionData, Player player, String str2, List<String> list, BizPermitResponse bizPermitResponse, List<PosIdentity> list2, LayoutState layoutState, List<SpotInfo> list3) {
        super(null);
        this.rtcInfo = rTCExtraInfo;
        this.linkMicId = str;
        this.position = micPositionData;
        this.applier = player;
        this.applierLinkMicId = str2;
        this.linkedUserUiPositions = list;
        this.multiGuestRespExtra = bizPermitResponse;
        this.uiPos = list2;
        this.layout = layoutState;
        this.spotList = list3;
    }
}
