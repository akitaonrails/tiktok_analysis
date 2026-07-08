package com.ss.lyrax.ttlh_adapter.push_param.push_base;

import com.ss.lyrax.ttlh_adapter.utils.ParamConverter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class PushVideoBmfConfig {
    public JSONObject colorCorrectionSetting;
    public boolean enableColorCorrection;
    public boolean enableGameStreamHDAdaptive;
    public boolean enableGameVideoStreamHD;
    public boolean enableStreamHDAdaptive;
    public boolean enableVideoStreamHD;
    public JSONObject gameVideoStreamHDParams;
    public int minStreamHDAdaptedResolutionHeight;
    public int minStreamHDAdaptedResolutionWidth;
    public JSONObject videoStreamHDParams;

    public PushVideoBmfConfig() {
        this.minStreamHDAdaptedResolutionWidth = 9999;
        this.minStreamHDAdaptedResolutionHeight = 9999;
    }

    public JSONObject getColorCorrectionSetting() {
        return this.colorCorrectionSetting;
    }

    public boolean getEnableColorCorrection() {
        return this.enableColorCorrection;
    }

    public boolean getEnableGameStreamHDAdaptive() {
        return this.enableGameStreamHDAdaptive;
    }

    public boolean getEnableGameVideoStreamHD() {
        return this.enableGameVideoStreamHD;
    }

    public boolean getEnableStreamHDAdaptive() {
        return this.enableStreamHDAdaptive;
    }

    public boolean getEnableVideoStreamHD() {
        return this.enableVideoStreamHD;
    }

    public JSONObject getGameVideoStreamHDParams() {
        return this.gameVideoStreamHDParams;
    }

    public int getMinStreamHDAdaptedResolutionHeight() {
        return this.minStreamHDAdaptedResolutionHeight;
    }

    public int getMinStreamHDAdaptedResolutionWidth() {
        return this.minStreamHDAdaptedResolutionWidth;
    }

    public JSONObject getVideoStreamHDParams() {
        return this.videoStreamHDParams;
    }

    public PushVideoBmfConfig(boolean z, int i, int i2, String str, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3) {
        this.enableStreamHDAdaptive = z;
        this.minStreamHDAdaptedResolutionWidth = i;
        this.minStreamHDAdaptedResolutionHeight = i2;
        this.videoStreamHDParams = ParamConverter.convertStringToJson(str, this.videoStreamHDParams);
        this.enableVideoStreamHD = z2;
        this.enableGameStreamHDAdaptive = z3;
        this.gameVideoStreamHDParams = ParamConverter.convertStringToJson(str2, this.gameVideoStreamHDParams);
        this.enableGameVideoStreamHD = z4;
        this.enableColorCorrection = z5;
        this.colorCorrectionSetting = ParamConverter.convertStringToJson(str3, this.colorCorrectionSetting);
    }
}
