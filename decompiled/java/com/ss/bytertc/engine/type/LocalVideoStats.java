package com.ss.bytertc.engine.type;

import X.C2188811AlT;
import com.ss.bytertc.engine.InternalLocalVideoStats;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class LocalVideoStats {
    public int codecEventCode;
    public int codecType;
    public int encodedBitrate;
    public int encodedFrameCount;
    public int encodedFrameHeight;
    public int encodedFrameWidth;
    public double encoderOutputFrameRate;
    public double inputFrameRate;
    public boolean isHardwareCodec;
    public boolean isScreen;
    public int jitter;
    public double rendererOutputFrameRate;
    public int rtt;
    public double sentFrameRate;
    public float sentKBitrate;
    public ArrayList<Integer> simEncBps;
    public ArrayList<Integer> simEncFramerate;
    public ArrayList<Integer> simEncHeight;
    public String simEncInfo;
    public ArrayList<Integer> simEncWidth;
    public int statsInterval;
    public int videoDenoiseMode;
    public float videoLossRate;

    public LocalVideoStats() {
        this.simEncWidth = new ArrayList<>();
        this.simEncHeight = new ArrayList<>();
        this.simEncFramerate = new ArrayList<>();
        this.simEncBps = new ArrayList<>();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalVideoStats{sentKBitrate='");
        sbLIZ.append(this.sentKBitrate);
        sbLIZ.append('\'');
        sbLIZ.append(", inputFrameRate='");
        sbLIZ.append(this.inputFrameRate);
        sbLIZ.append('\'');
        sbLIZ.append(", sentFrameRate='");
        sbLIZ.append(this.sentFrameRate);
        sbLIZ.append('\'');
        sbLIZ.append(", encoderOutputFrameRate='");
        sbLIZ.append(this.encoderOutputFrameRate);
        sbLIZ.append('\'');
        sbLIZ.append(", rendererOutputFrameRate='");
        sbLIZ.append(this.rendererOutputFrameRate);
        sbLIZ.append('\'');
        sbLIZ.append(", videoLossRate='");
        sbLIZ.append(this.videoLossRate);
        sbLIZ.append('\'');
        sbLIZ.append(", rtt='");
        sbLIZ.append(this.rtt);
        sbLIZ.append('\'');
        sbLIZ.append(", statsInterval='");
        sbLIZ.append(this.statsInterval);
        sbLIZ.append('\'');
        sbLIZ.append(", encodedBitrate='");
        sbLIZ.append(this.encodedBitrate);
        sbLIZ.append('\'');
        sbLIZ.append(", encodedFrameWidth='");
        sbLIZ.append(this.encodedFrameWidth);
        sbLIZ.append('\'');
        sbLIZ.append(", encodedFrameHeight='");
        sbLIZ.append(this.encodedFrameHeight);
        sbLIZ.append('\'');
        sbLIZ.append(", encodedFrameCount='");
        sbLIZ.append(this.encodedFrameCount);
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
        sbLIZ.append(", isScreen='");
        sbLIZ.append(this.isScreen);
        sbLIZ.append('\'');
        sbLIZ.append(", jitter='");
        sbLIZ.append(this.jitter);
        sbLIZ.append('\'');
        sbLIZ.append(", videoDenoiseMode");
        sbLIZ.append(this.videoDenoiseMode);
        sbLIZ.append('\'');
        sbLIZ.append(", simEncInfo=");
        sbLIZ.append(this.simEncInfo);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LocalVideoStats(InternalLocalVideoStats internalLocalVideoStats) {
        this.simEncWidth = new ArrayList<>();
        this.simEncHeight = new ArrayList<>();
        this.simEncFramerate = new ArrayList<>();
        this.simEncBps = new ArrayList<>();
        this.sentKBitrate = internalLocalVideoStats.sentKBitrate;
        this.inputFrameRate = internalLocalVideoStats.inputFrameRate;
        this.sentFrameRate = internalLocalVideoStats.sentFrameRate;
        this.encoderOutputFrameRate = internalLocalVideoStats.encoderOutputFrameRate;
        this.rendererOutputFrameRate = internalLocalVideoStats.rendererOutputFrameRate;
        this.statsInterval = internalLocalVideoStats.statsInterval;
        this.videoLossRate = internalLocalVideoStats.videoLossRate;
        this.rtt = internalLocalVideoStats.rtt;
        this.encodedBitrate = internalLocalVideoStats.encodedBitrate;
        this.encodedFrameWidth = internalLocalVideoStats.encodedFrameWidth;
        this.encodedFrameHeight = internalLocalVideoStats.encodedFrameHeight;
        this.encodedFrameCount = internalLocalVideoStats.encodedFrameCount;
        this.codecType = internalLocalVideoStats.codecType;
        this.isHardwareCodec = internalLocalVideoStats.isHardwareCodec;
        this.codecEventCode = internalLocalVideoStats.codecEventCode;
        this.isScreen = internalLocalVideoStats.isScreen;
        this.jitter = internalLocalVideoStats.jitter;
        this.videoDenoiseMode = internalLocalVideoStats.videoDenoiseMode;
        this.simEncInfo = internalLocalVideoStats.simEncInfo;
        this.simEncWidth = internalLocalVideoStats.simEncWidth;
        this.simEncHeight = internalLocalVideoStats.simEncHeight;
        this.simEncFramerate = internalLocalVideoStats.simEncFramerate;
        this.simEncBps = internalLocalVideoStats.simEncBps;
    }
}
