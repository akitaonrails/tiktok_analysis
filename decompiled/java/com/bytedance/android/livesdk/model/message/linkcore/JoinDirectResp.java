package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes.dex */
public final class JoinDirectResp extends LinkMicUplinkBaseResp {

    @C09CT("all_users")
    public AllListUser allUsers;

    @C09CT("layout")
    public LayoutState layout;

    @C09CT("multi_guest_resp_extra")
    public BizJoinDirectResponse multiGuestRespExtra;

    @C09CT("self_pos")
    public MicPositionData position;

    @C09CT("info")
    public RTCExtraInfo rtcInfo;

    @C09CT("self_link_mic_id")
    public String selfLinkMicId;

    @C09CT("spot_list")
    public List<SpotInfo> spotList;

    public JoinDirectResp() {
        this(null, null, null, null, null, null, new ArrayList());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinDirectResp)) {
            return false;
        }
        JoinDirectResp joinDirectResp = (JoinDirectResp) obj;
        return Intrinsics.LJFF(this.rtcInfo, joinDirectResp.rtcInfo) && Intrinsics.LJFF(this.selfLinkMicId, joinDirectResp.selfLinkMicId) && Intrinsics.LJFF(this.position, joinDirectResp.position) && Intrinsics.LJFF(this.allUsers, joinDirectResp.allUsers) && Intrinsics.LJFF(this.multiGuestRespExtra, joinDirectResp.multiGuestRespExtra) && Intrinsics.LJFF(this.layout, joinDirectResp.layout) && Intrinsics.LJFF(this.spotList, joinDirectResp.spotList);
    }

    public final int hashCode() {
        RTCExtraInfo rTCExtraInfo = this.rtcInfo;
        int iHashCode = (rTCExtraInfo == null ? 0 : rTCExtraInfo.hashCode()) * 31;
        String str = this.selfLinkMicId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MicPositionData micPositionData = this.position;
        int iHashCode3 = (iHashCode2 + (micPositionData == null ? 0 : micPositionData.hashCode())) * 31;
        AllListUser allListUser = this.allUsers;
        int iHashCode4 = (iHashCode3 + (allListUser == null ? 0 : allListUser.hashCode())) * 31;
        BizJoinDirectResponse bizJoinDirectResponse = this.multiGuestRespExtra;
        int iHashCode5 = (iHashCode4 + (bizJoinDirectResponse == null ? 0 : bizJoinDirectResponse.hashCode())) * 31;
        LayoutState layoutState = this.layout;
        return ((iHashCode5 + (layoutState != null ? layoutState.hashCode() : 0)) * 31) + this.spotList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JoinDirectResp(rtcInfo=");
        sbLIZ.append(this.rtcInfo);
        sbLIZ.append(", selfLinkMicId=");
        sbLIZ.append(this.selfLinkMicId);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", allUsers=");
        sbLIZ.append(this.allUsers);
        sbLIZ.append(", multiGuestRespExtra=");
        sbLIZ.append(this.multiGuestRespExtra);
        sbLIZ.append(", layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(", spotList=");
        sbLIZ.append(this.spotList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JoinDirectResp(RTCExtraInfo rTCExtraInfo, String str, MicPositionData micPositionData, AllListUser allListUser, BizJoinDirectResponse bizJoinDirectResponse, LayoutState layoutState, List<SpotInfo> list) {
        super(null);
        this.rtcInfo = rTCExtraInfo;
        this.selfLinkMicId = str;
        this.position = micPositionData;
        this.allUsers = allListUser;
        this.multiGuestRespExtra = bizJoinDirectResponse;
        this.layout = layoutState;
        this.spotList = list;
    }
}
