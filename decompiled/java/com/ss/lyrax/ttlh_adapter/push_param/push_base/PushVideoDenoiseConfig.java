package com.ss.lyrax.ttlh_adapter.push_param.push_base;

import com.ss.lyrax.ttlh_adapter.utils.ParamConverter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class PushVideoDenoiseConfig {
    public boolean enableDenoiseOpt;
    public int minDenoiseAdaptedResolutionHeight;
    public int minDenoiseAdaptedResolutionWidth;
    public JSONObject videoDenoiseParams;

    public PushVideoDenoiseConfig() {
        this.minDenoiseAdaptedResolutionWidth = 576;
        this.minDenoiseAdaptedResolutionHeight = 1024;
    }

    public boolean getEnableDenoiseOpt() {
        return this.enableDenoiseOpt;
    }

    public int getMinDenoiseAdaptedResolutionHeight() {
        return this.minDenoiseAdaptedResolutionHeight;
    }

    public int getMinDenoiseAdaptedResolutionWidth() {
        return this.minDenoiseAdaptedResolutionWidth;
    }

    public JSONObject getVideoDenoiseParams() {
        return this.videoDenoiseParams;
    }

    public PushVideoDenoiseConfig(int i, int i2, String str, boolean z) {
        this.minDenoiseAdaptedResolutionWidth = i;
        this.minDenoiseAdaptedResolutionHeight = i2;
        this.videoDenoiseParams = ParamConverter.convertStringToJson(str, this.videoDenoiseParams);
        this.enableDenoiseOpt = z;
    }
}
