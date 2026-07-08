package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;

/* JADX INFO: loaded from: classes.dex */
public final class GenRTCInfoResp {

    @C09CT("common_resp")
    public LinkMicCommonResp commonResp;

    @C09CT("info")
    public RTCExtraInfo info;

    @C09CT("link_mic_id")
    public String linkMicId = "";

    @C09CT("rtc_room_id")
    public long rtcRoomId;
}
