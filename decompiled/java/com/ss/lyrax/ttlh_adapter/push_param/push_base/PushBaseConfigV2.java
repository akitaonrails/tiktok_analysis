package com.ss.lyrax.ttlh_adapter.push_param.push_base;

/* JADX INFO: loaded from: classes21.dex */
public class PushBaseConfigV2 {
    public PushAudioConfig mAudioConfig;
    public PushCommonConfig mCommonConfig;
    public PushVideoConfig mVideoConfig;

    public PushBaseConfigV2() {
        this.mCommonConfig = new PushCommonConfig();
        this.mAudioConfig = new PushAudioConfig();
        this.mVideoConfig = new PushVideoConfig();
    }

    public void setIncrementalParsing(boolean z) {
        PushAudioConfig pushAudioConfig = this.mAudioConfig;
        if (pushAudioConfig != null) {
            pushAudioConfig.setIncrementalParsing(z);
        }
        PushVideoConfig pushVideoConfig = this.mVideoConfig;
        if (pushVideoConfig != null) {
            pushVideoConfig.setIncrementalParsing(z);
        }
        PushCommonConfig pushCommonConfig = this.mCommonConfig;
        if (pushCommonConfig != null) {
            pushCommonConfig.setIncrementalParsing(z);
        }
    }

    public PushBaseConfigV2(PushCommonConfig pushCommonConfig, PushAudioConfig pushAudioConfig, PushVideoConfig pushVideoConfig) {
        this.mCommonConfig = new PushCommonConfig();
        this.mAudioConfig = new PushAudioConfig();
        new PushVideoConfig();
        this.mCommonConfig = pushCommonConfig;
        this.mAudioConfig = pushAudioConfig;
        this.mVideoConfig = pushVideoConfig;
    }
}
