package com.ss.pusher.core.params;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public final class RTCTestEnv {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("rtc_app_id")
    public final String rtcAppId = "";

    @C09CT("access_host")
    public final String accessHost = "";

    @C09CT("media_server_ip")
    public final String mediaServerIp = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RTCTestEnv(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", rtcAppId='");
        sbLIZ.append(this.rtcAppId);
        sbLIZ.append("', accessHost='");
        sbLIZ.append(this.accessHost);
        sbLIZ.append("', mediaServerIp='");
        sbLIZ.append(this.mediaServerIp);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
