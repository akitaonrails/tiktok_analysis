package com.ss.lyrax.ttlh_adapter.push_param.push_base;

import com.ss.lyrax.video.TTLHAbnormalDetectConfigParser;

/* JADX INFO: loaded from: classes21.dex */
public class PushVideoFilterConfig {
    public PushVideoBmfConfig bmfConfig;
    public PushVideoDenoiseConfig denoiseConfig;
    public PushVideoEffectConfig effectConfig;
    public boolean enableMirrorOpt;
    public PushVideoSEIConfig seiConfig;
    public TTLHAbnormalDetectConfigParser videoAbnormalDetectConfig;

    public PushVideoFilterConfig() {
        this.effectConfig = new PushVideoEffectConfig();
        this.denoiseConfig = new PushVideoDenoiseConfig();
        this.bmfConfig = new PushVideoBmfConfig();
        this.seiConfig = new PushVideoSEIConfig();
        this.videoAbnormalDetectConfig = new TTLHAbnormalDetectConfigParser();
        this.enableMirrorOpt = false;
    }

    public boolean getEnableMirrorOpt() {
        return this.enableMirrorOpt;
    }

    public TTLHAbnormalDetectConfigParser getVideoAbnormalDetectConfig() {
        return this.videoAbnormalDetectConfig;
    }

    public PushVideoFilterConfig(PushVideoEffectConfig pushVideoEffectConfig, PushVideoDenoiseConfig pushVideoDenoiseConfig, PushVideoBmfConfig pushVideoBmfConfig, PushVideoSEIConfig pushVideoSEIConfig, TTLHAbnormalDetectConfigParser tTLHAbnormalDetectConfigParser, boolean z) {
        this.effectConfig = new PushVideoEffectConfig();
        this.denoiseConfig = new PushVideoDenoiseConfig();
        this.bmfConfig = new PushVideoBmfConfig();
        this.seiConfig = new PushVideoSEIConfig();
        new TTLHAbnormalDetectConfigParser();
        this.effectConfig = pushVideoEffectConfig;
        this.denoiseConfig = pushVideoDenoiseConfig;
        this.bmfConfig = pushVideoBmfConfig;
        this.seiConfig = pushVideoSEIConfig;
        this.videoAbnormalDetectConfig = tTLHAbnormalDetectConfigParser;
        this.enableMirrorOpt = z;
    }
}
