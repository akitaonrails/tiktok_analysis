package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RTCDualStreamParam {

    @C09CT("is_auto_switch")
    public int autoSwitch;

    @C09CT("auto_switch_user_num")
    public int autoSwitchUserNum;

    @C09CT("remote_default_stream_type")
    public int defaultStreamType;

    @C09CT("hd_video_param")
    public RTCVideoParam hdVideoParam;

    @C09CT("sd_video_param")
    public RTCVideoParam sdVideoParam;

    public RTCDualStreamParam() {
        this(0, 0, 0, null, null);
    }

    public RTCDualStreamParam(int i, int i2, int i3, RTCVideoParam rTCVideoParam, RTCVideoParam rTCVideoParam2) {
        this.defaultStreamType = i;
        this.autoSwitch = i2;
        this.autoSwitchUserNum = i3;
        this.hdVideoParam = rTCVideoParam;
        this.sdVideoParam = rTCVideoParam2;
    }
}
