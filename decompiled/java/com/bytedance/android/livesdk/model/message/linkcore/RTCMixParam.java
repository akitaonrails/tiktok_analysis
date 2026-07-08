package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class RTCMixParam {

    @C09CT("video_bitrate_kbps")
    public int videoBitRate;

    public RTCMixParam() {
        this(0);
    }

    public RTCMixParam(int i) {
        this.videoBitRate = i;
    }
}
