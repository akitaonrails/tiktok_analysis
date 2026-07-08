package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes.dex */
public final class CreateChannelResponse extends LinkMicUplinkBaseResp {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("is_resume")
    public Integer isResume;

    @C09CT("layout")
    public LayoutState layout;

    @C09CT("multi_guest_resp_extra")
    public BizCreateChannelResponse multiGuestRespExtra;

    @C09CT("info")
    public RTCExtraInfo rtcInfo;

    @C09CT("self_link_mic_id")
    public String selfLinkMicId;

    @C09CT("spot_list")
    public List<SpotInfo> spotList;

    public CreateChannelResponse() {
        this(0L, null, null, null, null, null, new ArrayList());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateChannelResponse)) {
            return false;
        }
        CreateChannelResponse createChannelResponse = (CreateChannelResponse) obj;
        return this.channelId == createChannelResponse.channelId && Intrinsics.LJFF(this.rtcInfo, createChannelResponse.rtcInfo) && Intrinsics.LJFF(this.selfLinkMicId, createChannelResponse.selfLinkMicId) && Intrinsics.LJFF(this.isResume, createChannelResponse.isResume) && Intrinsics.LJFF(this.multiGuestRespExtra, createChannelResponse.multiGuestRespExtra) && Intrinsics.LJFF(this.layout, createChannelResponse.layout) && Intrinsics.LJFF(this.spotList, createChannelResponse.spotList);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.channelId) * 31;
        RTCExtraInfo rTCExtraInfo = this.rtcInfo;
        int iHashCode = (iY2 + (rTCExtraInfo == null ? 0 : rTCExtraInfo.hashCode())) * 31;
        String str = this.selfLinkMicId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.isResume;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        BizCreateChannelResponse bizCreateChannelResponse = this.multiGuestRespExtra;
        int iHashCode4 = (iHashCode3 + (bizCreateChannelResponse == null ? 0 : bizCreateChannelResponse.hashCode())) * 31;
        LayoutState layoutState = this.layout;
        return ((iHashCode4 + (layoutState != null ? layoutState.hashCode() : 0)) * 31) + this.spotList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateChannelResponse(channelId=");
        sbLIZ.append(this.channelId);
        sbLIZ.append(", rtcInfo=");
        sbLIZ.append(this.rtcInfo);
        sbLIZ.append(", selfLinkMicId=");
        sbLIZ.append(this.selfLinkMicId);
        sbLIZ.append(", isResume=");
        sbLIZ.append(this.isResume);
        sbLIZ.append(", multiGuestRespExtra=");
        sbLIZ.append(this.multiGuestRespExtra);
        sbLIZ.append(", layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(", spotList=");
        sbLIZ.append(this.spotList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreateChannelResponse(long j, RTCExtraInfo rTCExtraInfo, String str, Integer num, BizCreateChannelResponse bizCreateChannelResponse, LayoutState layoutState, List<SpotInfo> list) {
        super(null);
        this.channelId = j;
        this.rtcInfo = rTCExtraInfo;
        this.selfLinkMicId = str;
        this.isResume = num;
        this.multiGuestRespExtra = bizCreateChannelResponse;
        this.layout = layoutState;
        this.spotList = list;
    }
}
