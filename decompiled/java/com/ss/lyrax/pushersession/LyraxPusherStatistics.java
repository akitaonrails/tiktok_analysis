package com.ss.lyrax.pushersession;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxPusherStatistics {
    public int videoEncodeFps;
    public int videoSendBitrate;
    public int videoSendFps;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxPusherStatistics{videoSendBitrate=");
        sbLIZ.append(this.videoSendBitrate);
        sbLIZ.append(", videoEncodeFps=");
        sbLIZ.append(this.videoEncodeFps);
        sbLIZ.append(", videoSendFps=");
        sbLIZ.append(this.videoSendFps);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxPusherStatistics() {
    }

    public LyraxPusherStatistics(int i, int i2, int i3) {
        this.videoSendBitrate = i;
        this.videoEncodeFps = i2;
        this.videoSendFps = i3;
    }
}
