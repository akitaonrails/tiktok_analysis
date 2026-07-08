package com.ss.lyrax.video;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class LinkMicVideoConfig {

    @C09CT("cameraResolutionDiffThreshold")
    public int cameraResolutionDiffThreshold;

    @C09CT("enableLinkMicVideoParamsGenerate")
    public boolean enableLinkMicVideoParamsGenerate;

    @C09CT("heightStride")
    public int heightStride;

    @C09CT("highBitRateRatio")
    public int highBitRateRatio;

    @C09CT("highFps")
    public int linkMicHighFps;

    @C09CT("lowFps")
    public int linkMicLowFps;

    @C09CT("normalFps")
    public int linkMicNormalFps;

    @C09CT("strategyRunTimeoutMs")
    public int strategyRunTimeoutMs;

    @C09CT("widthStride")
    public int widthStride;

    public LinkMicVideoConfig() {
        this.strategyRunTimeoutMs = 200;
        this.widthStride = 8;
        this.heightStride = 2;
        this.highBitRateRatio = 2;
        this.linkMicHighFps = 25;
        this.linkMicNormalFps = 15;
        this.linkMicLowFps = 12;
        this.cameraResolutionDiffThreshold = 20;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicVideoConfig{enableLinkMicVideoParamsGenerate=");
        sbLIZ.append(this.enableLinkMicVideoParamsGenerate);
        sbLIZ.append(", strategyRunTimeoutMs=");
        sbLIZ.append(this.strategyRunTimeoutMs);
        sbLIZ.append(", widthStride=");
        sbLIZ.append(this.widthStride);
        sbLIZ.append(", heightStride=");
        sbLIZ.append(this.heightStride);
        sbLIZ.append(", highBitRateRatio=");
        sbLIZ.append(this.highBitRateRatio);
        sbLIZ.append(", linkMicHighFps=");
        sbLIZ.append(this.linkMicHighFps);
        sbLIZ.append(", linkMicNormalFps=");
        sbLIZ.append(this.linkMicNormalFps);
        sbLIZ.append(", linkMicLowFps=");
        sbLIZ.append(this.linkMicLowFps);
        sbLIZ.append(", cameraResolutionDiffThreshold=");
        sbLIZ.append(this.cameraResolutionDiffThreshold);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LinkMicVideoConfig(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.enableLinkMicVideoParamsGenerate = z;
        this.strategyRunTimeoutMs = i;
        this.widthStride = i2;
        this.heightStride = i3;
        this.highBitRateRatio = i4;
        this.linkMicHighFps = i5;
        this.linkMicNormalFps = i6;
        this.linkMicLowFps = i7;
        this.cameraResolutionDiffThreshold = i8;
    }
}
