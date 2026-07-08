package com.ss.lyrax.ttlh_adapter.push_param;

import com.ss.lyrax.ttlh_adapter.push_param.capture_base.CaptureBaseParams;
import com.ss.lyrax.ttlh_adapter.push_param.interact.InteractConfigV2;
import com.ss.lyrax.ttlh_adapter.push_param.push_base.PushBaseConfigV2;

/* JADX INFO: loaded from: classes21.dex */
public class SDKSettingsConfig {
    public SDKSettingsAudioConfig mAudioConfig;
    public CaptureBaseParams mCaptureBaseConfig;
    public SDKSettingsCommonConfig mCommonConfig;
    public InteractConfigV2 mInteractConfig;
    public PushBaseConfigV2 mPushBaseConfig;
    public SDKSettingsVideoConfig mVideoConfig;

    public SDKSettingsConfig() {
        this.mCommonConfig = new SDKSettingsCommonConfig();
        this.mAudioConfig = new SDKSettingsAudioConfig();
        this.mVideoConfig = new SDKSettingsVideoConfig();
        this.mPushBaseConfig = new PushBaseConfigV2();
        this.mInteractConfig = new InteractConfigV2();
        this.mCaptureBaseConfig = new CaptureBaseParams();
    }

    public void setIncrementalParsing(boolean z) {
        SDKSettingsVideoConfig sDKSettingsVideoConfig = this.mVideoConfig;
        if (sDKSettingsVideoConfig != null) {
            sDKSettingsVideoConfig.setIncrementalParsing(z);
        }
        PushBaseConfigV2 pushBaseConfigV2 = this.mPushBaseConfig;
        if (pushBaseConfigV2 != null) {
            pushBaseConfigV2.setIncrementalParsing(z);
        }
        CaptureBaseParams captureBaseParams = this.mCaptureBaseConfig;
        if (captureBaseParams != null) {
            captureBaseParams.setIncrementalParsing(z);
        }
    }

    public SDKSettingsConfig(PushBaseConfigV2 pushBaseConfigV2, InteractConfigV2 interactConfigV2, CaptureBaseParams captureBaseParams, SDKSettingsCommonConfig sDKSettingsCommonConfig, SDKSettingsAudioConfig sDKSettingsAudioConfig, SDKSettingsVideoConfig sDKSettingsVideoConfig) {
        this.mCommonConfig = new SDKSettingsCommonConfig();
        this.mAudioConfig = new SDKSettingsAudioConfig();
        this.mVideoConfig = new SDKSettingsVideoConfig();
        this.mPushBaseConfig = new PushBaseConfigV2();
        this.mInteractConfig = new InteractConfigV2();
        new CaptureBaseParams();
        this.mPushBaseConfig = pushBaseConfigV2;
        this.mInteractConfig = interactConfigV2;
        this.mCaptureBaseConfig = captureBaseParams;
        this.mCommonConfig = sDKSettingsCommonConfig;
        this.mAudioConfig = sDKSettingsAudioConfig;
        this.mVideoConfig = sDKSettingsVideoConfig;
    }
}
