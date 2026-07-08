package com.ss.bytertc.engine.type;

import X.C2188811AlT;
import com.ss.bytertc.engine.InternalRemoteVideoStats;

/* JADX INFO: loaded from: classes21.dex */
public class RemoteVideoStats {
    public int codecEventCode;
    public int codecType;
    public int decoderOutputFrameRate;
    public long e2eDelay;
    public int frozenRate;
    public int height;
    public boolean isHardwareCodec;
    public boolean isScreen;
    public int jitter;
    public int maxqp;
    public float receivedKBitrate;
    public int rendererOutputFrameRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public int superResolutionMode;
    public int videoIndex;
    public float videoLossRate;
    public int width;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoteVideoStats{width='");
        sbLIZ.append(this.width);
        sbLIZ.append('\'');
        sbLIZ.append(", height='");
        sbLIZ.append(this.height);
        sbLIZ.append('\'');
        sbLIZ.append(", videoLossRate='");
        sbLIZ.append(this.videoLossRate);
        sbLIZ.append('\'');
        sbLIZ.append(", receivedKBitrate='");
        sbLIZ.append(this.receivedKBitrate);
        sbLIZ.append('\'');
        sbLIZ.append(", decoderOutputFrameRate='");
        sbLIZ.append(this.decoderOutputFrameRate);
        sbLIZ.append('\'');
        sbLIZ.append(", rendererOutputFrameRate='");
        sbLIZ.append(this.rendererOutputFrameRate);
        sbLIZ.append('\'');
        sbLIZ.append(", stallCount='");
        sbLIZ.append(this.stallCount);
        sbLIZ.append('\'');
        sbLIZ.append(", stallDuration='");
        sbLIZ.append(this.stallDuration);
        sbLIZ.append('\'');
        sbLIZ.append(", e2eDelay='");
        sbLIZ.append(this.e2eDelay);
        sbLIZ.append('\'');
        sbLIZ.append(", isScreen='");
        sbLIZ.append(this.isScreen);
        sbLIZ.append('\'');
        sbLIZ.append(", rtt='");
        sbLIZ.append(this.rtt);
        sbLIZ.append('\'');
        sbLIZ.append(", frozenRate='");
        sbLIZ.append(this.frozenRate);
        sbLIZ.append('\'');
        sbLIZ.append(", videoIndex='");
        sbLIZ.append(this.videoIndex);
        sbLIZ.append('\'');
        sbLIZ.append(", jitter='");
        sbLIZ.append(this.jitter);
        sbLIZ.append('\'');
        sbLIZ.append(", codecType='");
        sbLIZ.append(this.codecType);
        sbLIZ.append('\'');
        sbLIZ.append(", isHardwareCodec='");
        sbLIZ.append(this.isHardwareCodec);
        sbLIZ.append('\'');
        sbLIZ.append(", codecEventCode='");
        sbLIZ.append(this.codecEventCode);
        sbLIZ.append('\'');
        sbLIZ.append(", superResolutionMode='");
        sbLIZ.append(this.superResolutionMode);
        sbLIZ.append('\'');
        sbLIZ.append(", maxqp='");
        sbLIZ.append(this.maxqp);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RemoteVideoStats() {
    }

    public RemoteVideoStats(InternalRemoteVideoStats internalRemoteVideoStats) {
        this.width = internalRemoteVideoStats.width;
        this.height = internalRemoteVideoStats.height;
        this.videoLossRate = internalRemoteVideoStats.videoLossRate;
        this.receivedKBitrate = internalRemoteVideoStats.receivedKBitrate;
        this.decoderOutputFrameRate = internalRemoteVideoStats.decoderOutputFrameRate;
        this.rendererOutputFrameRate = internalRemoteVideoStats.rendererOutputFrameRate;
        this.stallCount = internalRemoteVideoStats.stallCount;
        this.stallDuration = internalRemoteVideoStats.stallDuration;
        this.e2eDelay = internalRemoteVideoStats.e2eDelay;
        this.isScreen = internalRemoteVideoStats.isScreen;
        this.statsInterval = internalRemoteVideoStats.statsInterval;
        this.rtt = internalRemoteVideoStats.rtt;
        this.frozenRate = internalRemoteVideoStats.frozenRate;
        this.codecType = internalRemoteVideoStats.codecType;
        this.isHardwareCodec = internalRemoteVideoStats.isHardwareCodec;
        this.codecEventCode = internalRemoteVideoStats.codecEventCode;
        this.videoIndex = internalRemoteVideoStats.videoIndex;
        this.jitter = internalRemoteVideoStats.jitter;
        this.superResolutionMode = internalRemoteVideoStats.superResolutionMode;
        this.maxqp = internalRemoteVideoStats.maxqp;
    }
}
