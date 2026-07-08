package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.SpotInfo;
import tikcast.linkmic.common.UserLinkState;

/* JADX INFO: loaded from: classes.dex */
public final class ApplyRequestResponse extends LinkMicUplinkBaseResp {

    @C09CT("applier_link_mic_id")
    public String applicantLinkMicId;

    @C09CT("layout")
    public LayoutState layout;

    @C09CT("multi_guest_resp_extra")
    public BizApplyResponse multiGuestRespExtra;

    @C09CT("owner_link_mic_id")
    public String ownerLinkMicId;

    @C09CT("post_link_state")
    public UserLinkState postLinkState;

    @C09CT("pre_link_state")
    public UserLinkState preLinkState;

    @C09CT("applier_ext_info")
    public RTCExtraInfo rtcInfo;

    @C09CT("spot_list")
    public List<SpotInfo> spotList;

    public ApplyRequestResponse() {
        this(null, null, null, null, new ArrayList(), null, null, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyRequestResponse)) {
            return false;
        }
        ApplyRequestResponse applyRequestResponse = (ApplyRequestResponse) obj;
        return Intrinsics.LJFF(this.rtcInfo, applyRequestResponse.rtcInfo) && Intrinsics.LJFF(this.applicantLinkMicId, applyRequestResponse.applicantLinkMicId) && Intrinsics.LJFF(this.multiGuestRespExtra, applyRequestResponse.multiGuestRespExtra) && Intrinsics.LJFF(this.layout, applyRequestResponse.layout) && Intrinsics.LJFF(this.spotList, applyRequestResponse.spotList) && Intrinsics.LJFF(this.preLinkState, applyRequestResponse.preLinkState) && Intrinsics.LJFF(this.postLinkState, applyRequestResponse.postLinkState) && Intrinsics.LJFF(this.ownerLinkMicId, applyRequestResponse.ownerLinkMicId);
    }

    public final int hashCode() {
        RTCExtraInfo rTCExtraInfo = this.rtcInfo;
        int iHashCode = (rTCExtraInfo == null ? 0 : rTCExtraInfo.hashCode()) * 31;
        String str = this.applicantLinkMicId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BizApplyResponse bizApplyResponse = this.multiGuestRespExtra;
        int iHashCode3 = (iHashCode2 + (bizApplyResponse == null ? 0 : bizApplyResponse.hashCode())) * 31;
        LayoutState layoutState = this.layout;
        int iHashCode4 = (((iHashCode3 + (layoutState == null ? 0 : layoutState.hashCode())) * 31) + this.spotList.hashCode()) * 31;
        UserLinkState userLinkState = this.preLinkState;
        int iHashCode5 = (iHashCode4 + (userLinkState == null ? 0 : userLinkState.hashCode())) * 31;
        UserLinkState userLinkState2 = this.postLinkState;
        return ((iHashCode5 + (userLinkState2 != null ? userLinkState2.hashCode() : 0)) * 31) + this.ownerLinkMicId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplyRequestResponse(rtcInfo=");
        sbLIZ.append(this.rtcInfo);
        sbLIZ.append(", applicantLinkMicId=");
        sbLIZ.append(this.applicantLinkMicId);
        sbLIZ.append(", multiGuestRespExtra=");
        sbLIZ.append(this.multiGuestRespExtra);
        sbLIZ.append(", layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(", spotList=");
        sbLIZ.append(this.spotList);
        sbLIZ.append(", preLinkState=");
        sbLIZ.append(this.preLinkState);
        sbLIZ.append(", postLinkState=");
        sbLIZ.append(this.postLinkState);
        sbLIZ.append(", ownerLinkMicId=");
        sbLIZ.append(this.ownerLinkMicId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ApplyRequestResponse(RTCExtraInfo rTCExtraInfo, String str, BizApplyResponse bizApplyResponse, LayoutState layoutState, List<SpotInfo> list, UserLinkState userLinkState, UserLinkState userLinkState2, String str2) {
        super(null);
        this.rtcInfo = rTCExtraInfo;
        this.applicantLinkMicId = str;
        this.multiGuestRespExtra = bizApplyResponse;
        this.layout = layoutState;
        this.spotList = list;
        this.preLinkState = userLinkState;
        this.postLinkState = userLinkState2;
        this.ownerLinkMicId = str2;
    }
}
