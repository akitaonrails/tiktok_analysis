package com.ss.lyrax.ttlh_adapter.settings_param;

import com.ss.lyrax.video.NativeRenderConfig;
import com.ss.lyrax.video.TTLHTarsSdkConfigs;
import com.ss.lyrax.video.TTLHVideoFrameAdjustmentConfig;

/* JADX INFO: loaded from: classes21.dex */
public class ABSettingsConfigs {
    public boolean disableVideoFrameStaticsAdd;
    public boolean enableAnchorStableModeSwitch;
    public boolean enableAocLocalConfigs;
    public boolean enableAudioEncodeConfigMigration;
    public boolean enableDownNativeRender;
    public boolean enableEffectRemoveNodesValidationFix;
    public boolean enableLyraxVideoSourceWrapper;
    public boolean enableLyraxVideoSourceWrapperLinkmic;
    public boolean enableRemoveSceneNone;
    public boolean enableRenderLog;
    public boolean enableSendVideoFrameLogs;
    public boolean enableVideoFrameStaticsOpt;
    public boolean frameRatioPhase2Part2;
    public boolean glAllocFailMock;
    public int lyraxVideoCapturePipelineStage;
    public NativeRenderConfig nativeRenderConfig;
    public String rtcAppIdForTest;
    public TTLHTarsSdkConfigs tarsSdkConfigs;
    public TTLHVideoFrameAdjustmentConfig videoFrameAdjustment;
    public int videoStrategyActiveScene;

    public ABSettingsConfigs() {
        this.videoFrameAdjustment = new TTLHVideoFrameAdjustmentConfig();
        this.nativeRenderConfig = new NativeRenderConfig();
        this.enableRenderLog = false;
        this.enableAnchorStableModeSwitch = false;
        this.glAllocFailMock = false;
        this.frameRatioPhase2Part2 = false;
        this.enableSendVideoFrameLogs = false;
        this.tarsSdkConfigs = new TTLHTarsSdkConfigs();
        this.videoStrategyActiveScene = 0;
        this.rtcAppIdForTest = "";
        this.enableDownNativeRender = false;
        this.enableAocLocalConfigs = false;
        this.enableLyraxVideoSourceWrapper = false;
        this.enableLyraxVideoSourceWrapperLinkmic = false;
        this.lyraxVideoCapturePipelineStage = -1;
        this.enableVideoFrameStaticsOpt = false;
        this.enableEffectRemoveNodesValidationFix = true;
        this.disableVideoFrameStaticsAdd = false;
        this.enableRemoveSceneNone = false;
        this.enableAudioEncodeConfigMigration = false;
    }

    public boolean getDisableVideoFrameStaticsAdd() {
        return this.disableVideoFrameStaticsAdd;
    }

    public boolean getEnableAnchorStableModeSwitch() {
        return this.enableAnchorStableModeSwitch;
    }

    public boolean getEnableAocLocalConfigs() {
        return this.enableAocLocalConfigs;
    }

    public boolean getEnableAudioEncodeConfigMigration() {
        return this.enableAudioEncodeConfigMigration;
    }

    public boolean getEnableDownNativeRender() {
        return this.enableDownNativeRender;
    }

    public boolean getEnableEffectRemoveNodesValidationFix() {
        return this.enableEffectRemoveNodesValidationFix;
    }

    public boolean getEnableLyraxVideoSourceWrapper() {
        return this.enableLyraxVideoSourceWrapper;
    }

    public boolean getEnableLyraxVideoSourceWrapperLinkmic() {
        return this.enableLyraxVideoSourceWrapperLinkmic;
    }

    public boolean getEnableRemoveSceneNone() {
        return this.enableRemoveSceneNone;
    }

    public boolean getEnableRenderLog() {
        return this.enableRenderLog;
    }

    public boolean getEnableSendVideoFrameLogs() {
        return this.enableSendVideoFrameLogs;
    }

    public boolean getEnableVideoFrameStaticsOpt() {
        return this.enableVideoFrameStaticsOpt;
    }

    public boolean getFrameRatioPhase2Part2() {
        return this.frameRatioPhase2Part2;
    }

    public boolean getGlAllocFailMock() {
        return this.glAllocFailMock;
    }

    public int getLyraxVideoCapturePipelineStage() {
        return this.lyraxVideoCapturePipelineStage;
    }

    public NativeRenderConfig getNativeRenderConfig() {
        return this.nativeRenderConfig;
    }

    public String getRtcAppIdForTest() {
        return this.rtcAppIdForTest;
    }

    public TTLHTarsSdkConfigs getTarsSdkConfigs() {
        return this.tarsSdkConfigs;
    }

    public TTLHVideoFrameAdjustmentConfig getVideoFrameAdjustment() {
        return this.videoFrameAdjustment;
    }

    public int getVideoStrategyActiveScene() {
        return this.videoStrategyActiveScene;
    }

    public void setEnableEffectRemoveNodesValidationFix(boolean z) {
        this.enableEffectRemoveNodesValidationFix = z;
    }

    public ABSettingsConfigs(boolean z, String str, TTLHVideoFrameAdjustmentConfig tTLHVideoFrameAdjustmentConfig, NativeRenderConfig nativeRenderConfig, boolean z2, boolean z3, boolean z4, boolean z5, TTLHTarsSdkConfigs tTLHTarsSdkConfigs, int i, boolean z6, boolean z7, boolean z8, int i2, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.videoFrameAdjustment = new TTLHVideoFrameAdjustmentConfig();
        this.nativeRenderConfig = new NativeRenderConfig();
        this.enableRenderLog = false;
        this.enableAnchorStableModeSwitch = false;
        this.glAllocFailMock = false;
        this.frameRatioPhase2Part2 = false;
        this.enableSendVideoFrameLogs = false;
        new TTLHTarsSdkConfigs();
        this.enableAnchorStableModeSwitch = z;
        this.rtcAppIdForTest = str;
        this.videoFrameAdjustment = tTLHVideoFrameAdjustmentConfig;
        this.nativeRenderConfig = nativeRenderConfig;
        this.enableRenderLog = z2;
        this.glAllocFailMock = z3;
        this.frameRatioPhase2Part2 = z4;
        this.enableSendVideoFrameLogs = z5;
        this.tarsSdkConfigs = tTLHTarsSdkConfigs;
        this.videoStrategyActiveScene = i;
        this.enableAocLocalConfigs = z6;
        this.enableLyraxVideoSourceWrapper = z7;
        this.enableLyraxVideoSourceWrapperLinkmic = z8;
        this.lyraxVideoCapturePipelineStage = i2;
        this.enableVideoFrameStaticsOpt = z9;
        this.enableEffectRemoveNodesValidationFix = z10;
        this.disableVideoFrameStaticsAdd = z11;
        this.enableRemoveSceneNone = z12;
        this.enableAudioEncodeConfigMigration = z13;
        this.enableDownNativeRender = z14;
    }
}
