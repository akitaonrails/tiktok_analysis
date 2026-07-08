package com.ss.lyrax.video;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHVideoFrameAdjustmentConfig {
    public boolean disableMutualExclusionDetection;

    @C09CT("enable")
    public boolean enable;
    public boolean enableCameraAdjustment;
    public boolean enableCameraAdjustmentInLinkmic;
    public boolean enableTriggerChangeResolutionOpt;

    @C09CT("ratio")
    public float ratio;
    public boolean supportAnchorNet;
    public boolean supportCameraAdjustmentWithHistoryLinkmic;
    public boolean supportGpuTurbo;
    public boolean supportHistoryLinkMic;
    public boolean supportNetworkAdaptive;
    public boolean supportResolutionAdaptive;

    public TTLHVideoFrameAdjustmentConfig() {
        this.ratio = 0.5f;
        this.supportAnchorNet = true;
        this.supportResolutionAdaptive = true;
        this.supportNetworkAdaptive = true;
        this.supportGpuTurbo = true;
        this.supportHistoryLinkMic = true;
        this.disableMutualExclusionDetection = true;
        this.enableTriggerChangeResolutionOpt = true;
        this.enableCameraAdjustment = true;
        this.supportCameraAdjustmentWithHistoryLinkmic = true;
    }

    public TTLHVideoFrameAdjustmentConfig(boolean z, float f) {
        this.supportAnchorNet = true;
        this.supportResolutionAdaptive = true;
        this.supportNetworkAdaptive = true;
        this.supportGpuTurbo = true;
        this.supportHistoryLinkMic = true;
        this.disableMutualExclusionDetection = true;
        this.enableTriggerChangeResolutionOpt = true;
        this.enableCameraAdjustment = true;
        this.supportCameraAdjustmentWithHistoryLinkmic = true;
        this.enable = z;
        this.ratio = f;
    }
}
