package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class RTCEngineConfig {

    @C09CT("rtc_app_id")
    public String rtcAppId;

    @C09CT("rtc_channel_id")
    public long rtcChannelId;

    @C09CT("rtc_token")
    public String rtcToken;

    @C09CT("rtc_user_id")
    public String rtcUserId;

    public RTCEngineConfig() {
        this(null, null, null, 0L);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RTCEngineConfig(rtcAppId=");
        sbLIZ.append(this.rtcAppId);
        sbLIZ.append(", rtcUserId=");
        sbLIZ.append(this.rtcUserId);
        sbLIZ.append(", rtcToken=");
        sbLIZ.append(this.rtcToken);
        sbLIZ.append(", rtcChannelId=");
        sbLIZ.append(this.rtcChannelId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RTCEngineConfig(String str, String str2, String str3, long j) {
        this.rtcAppId = str;
        this.rtcUserId = str2;
        this.rtcToken = str3;
        this.rtcChannelId = j;
    }
}
