package com.ss.lyrax.ttlh_adapter.push_param.interact;

/* JADX INFO: loaded from: classes21.dex */
public class InteractConfigV2 {
    public InteractAudioConfig mAudioConfig;
    public InteractCommonConfig mCommonConfig;
    public InteractMixConfig mMixConfig;
    public InteractStreamConfig mStreamConfig;
    public InteractVideoConfig mVideoConfig;

    public InteractConfigV2() {
        this.mAudioConfig = new InteractAudioConfig();
        this.mVideoConfig = new InteractVideoConfig();
        this.mStreamConfig = new InteractStreamConfig();
        this.mMixConfig = new InteractMixConfig();
        this.mCommonConfig = new InteractCommonConfig();
    }

    public InteractConfigV2(InteractAudioConfig interactAudioConfig, InteractVideoConfig interactVideoConfig, InteractStreamConfig interactStreamConfig, InteractMixConfig interactMixConfig, InteractCommonConfig interactCommonConfig) {
        this.mAudioConfig = new InteractAudioConfig();
        this.mVideoConfig = new InteractVideoConfig();
        this.mStreamConfig = new InteractStreamConfig();
        this.mMixConfig = new InteractMixConfig();
        new InteractCommonConfig();
        this.mAudioConfig = interactAudioConfig;
        this.mVideoConfig = interactVideoConfig;
        this.mStreamConfig = interactStreamConfig;
        this.mMixConfig = interactMixConfig;
        this.mCommonConfig = interactCommonConfig;
    }
}
