package com.ss.lyrax.transcoder;

import com.ss.lyrax.stream.LyraxLowLatencyParams;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderParam {
    public LyraxTranscoderAudioConfig audioConfig;
    public boolean disableCdnForward;
    public boolean disableTranscodeTask;
    public boolean enablePassthrough;
    public LyraxTranscoderFeaturesConfig featureConfigs;
    public LyraxTranscoderLayoutConfig layoutConfig;
    public LyraxLowLatencyParams lowLatencyParams;
    public ArrayList<String> pushUrl;
    public LyraxTranscoderServerControlConfig serverControlConfig;
    public LyraxTranscoderSpatialAudioConfig spatialAudioConfig;
    public LyraxTranscoderSyncControlConfig syncControlConfig;
    public LyraxTranscoderVideoConfig videoConfig;
    public String roomId = "";
    public String userId = "";
    public String orientation = "";
    public String metaData = "";
    public String requestId = "";
    public String authInfo = "";

    public static LyraxTranscoderParam defaultLyraxTranscoderConfig() {
        LyraxTranscoderParam lyraxTranscoderParam = new LyraxTranscoderParam();
        LyraxTranscoderVideoConfig lyraxTranscoderVideoConfig = new LyraxTranscoderVideoConfig();
        lyraxTranscoderVideoConfig.setVideoCodecType(LyraxTranscoderVideoCodecType.H264);
        lyraxTranscoderVideoConfig.setFps(15);
        lyraxTranscoderVideoConfig.setGop(2);
        lyraxTranscoderVideoConfig.setEnableBFrame(false);
        lyraxTranscoderVideoConfig.setRoiInfo(0.0f, 0.0f, 0.0f, 0.0f);
        lyraxTranscoderVideoConfig.setUpgradeRes(360, 640);
        lyraxTranscoderVideoConfig.setWidth(360);
        lyraxTranscoderVideoConfig.setHeight(640);
        lyraxTranscoderVideoConfig.setBitrateKBPS(500);
        lyraxTranscoderParam.setVideoConfig(lyraxTranscoderVideoConfig);
        LyraxTranscoderAudioConfig lyraxTranscoderAudioConfig = new LyraxTranscoderAudioConfig();
        lyraxTranscoderAudioConfig.setAudioCodecType(LyraxTranscoderAudioCodecType.AUDIOCODEC_AAC);
        lyraxTranscoderAudioConfig.setChannels(2);
        lyraxTranscoderAudioConfig.setBitrateKBPS(64);
        lyraxTranscoderAudioConfig.setSampleRate(48000);
        lyraxTranscoderAudioConfig.setAudioCodecProfile(LyraxTranscoderAudioCodecProfile.AACPROFILE_LC);
        lyraxTranscoderParam.setAudioConfig(lyraxTranscoderAudioConfig);
        LyraxTranscoderServerControlConfig lyraxTranscoderServerControlConfig = new LyraxTranscoderServerControlConfig();
        lyraxTranscoderServerControlConfig.setEnableVolumeIndication(false);
        lyraxTranscoderServerControlConfig.setTalkVolumeLevels(new int[]{0, 20});
        lyraxTranscoderServerControlConfig.setAddVolumeValue(false);
        lyraxTranscoderServerControlConfig.setVolumeIndicationInterval(2.0f);
        lyraxTranscoderParam.setServerControlConfig(lyraxTranscoderServerControlConfig);
        LyraxTranscoderSyncControlConfig lyraxTranscoderSyncControlConfig = new LyraxTranscoderSyncControlConfig();
        lyraxTranscoderSyncControlConfig.setBaseUserId("");
        lyraxTranscoderSyncControlConfig.setSyncStrategy(LyraxTranscoderSyncStrategy.NO_SYNC);
        lyraxTranscoderSyncControlConfig.setMaxCacheTimeMS(2000);
        lyraxTranscoderSyncControlConfig.setVideoNeedSDKMix(true);
        lyraxTranscoderParam.setSyncControlConfig(lyraxTranscoderSyncControlConfig);
        LyraxTranscoderSpatialAudioConfig lyraxTranscoderSpatialAudioConfig = new LyraxTranscoderSpatialAudioConfig();
        lyraxTranscoderSpatialAudioConfig.setEnableSpatialRender(false);
        lyraxTranscoderParam.setSpatialAudioConfig(lyraxTranscoderSpatialAudioConfig);
        LyraxTranscoderLayoutConfig lyraxTranscoderLayoutConfig = new LyraxTranscoderLayoutConfig();
        lyraxTranscoderLayoutConfig.setBackgroundColor("#000000");
        lyraxTranscoderLayoutConfig.setAppData("");
        lyraxTranscoderParam.setLayoutConfig(lyraxTranscoderLayoutConfig);
        LyraxLowLatencyParams lyraxLowLatencyParams = new LyraxLowLatencyParams();
        lyraxLowLatencyParams.enableLowLatencyPush = false;
        lyraxLowLatencyParams.isUsingInitialParams = true;
        lyraxTranscoderParam.setLowLatencyParams(lyraxLowLatencyParams);
        return lyraxTranscoderParam;
    }

    public LyraxTranscoderAudioConfig getAudioConfig() {
        return this.audioConfig;
    }

    public String getAuthInfo() {
        return this.authInfo;
    }

    public boolean getDisableTranscodeTask() {
        return this.disableTranscodeTask;
    }

    public boolean getEnablePassthrough() {
        return this.enablePassthrough;
    }

    public LyraxTranscoderFeaturesConfig getFeatureConfigs() {
        return this.featureConfigs;
    }

    public LyraxTranscoderLayoutConfig getLayoutConfig() {
        return this.layoutConfig;
    }

    public LyraxLowLatencyParams getLowLatencyParams() {
        return this.lowLatencyParams;
    }

    public String getMetaData() {
        return this.metaData;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public ArrayList<String> getPushUrls() {
        return this.pushUrl;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public LyraxTranscoderServerControlConfig getServerControlConfig() {
        return this.serverControlConfig;
    }

    public LyraxTranscoderSpatialAudioConfig getSpatialAudioConfig() {
        return this.spatialAudioConfig;
    }

    public LyraxTranscoderSyncControlConfig getSyncControlConfig() {
        return this.syncControlConfig;
    }

    public String getUserId() {
        return this.userId;
    }

    public LyraxTranscoderVideoConfig getVideoConfig() {
        return this.videoConfig;
    }

    public boolean isDisableCdnForward() {
        return this.disableCdnForward;
    }

    public void setAudioConfig(LyraxTranscoderAudioConfig lyraxTranscoderAudioConfig) {
        this.audioConfig = lyraxTranscoderAudioConfig;
    }

    public void setAuthInfo(String str) {
        this.authInfo = str;
    }

    public void setDisableCdnForward(boolean z) {
        this.disableCdnForward = z;
    }

    public void setDisableTranscodeTask(boolean z) {
        this.disableTranscodeTask = z;
    }

    public void setEnablePassthrough(boolean z) {
        this.enablePassthrough = z;
    }

    public void setFeatureConfigs(LyraxTranscoderFeaturesConfig lyraxTranscoderFeaturesConfig) {
        this.featureConfigs = lyraxTranscoderFeaturesConfig;
    }

    public void setLayoutConfig(LyraxTranscoderLayoutConfig lyraxTranscoderLayoutConfig) {
        this.layoutConfig = lyraxTranscoderLayoutConfig;
    }

    public void setLowLatencyParams(LyraxLowLatencyParams lyraxLowLatencyParams) {
        this.lowLatencyParams = lyraxLowLatencyParams;
    }

    public void setMetaData(String str) {
        this.metaData = str;
    }

    public void setOrientation(String str) {
        this.orientation = str;
    }

    public void setPushUrls(ArrayList<String> arrayList) {
        this.pushUrl = arrayList;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setServerControlConfig(LyraxTranscoderServerControlConfig lyraxTranscoderServerControlConfig) {
        this.serverControlConfig = lyraxTranscoderServerControlConfig;
    }

    public void setSpatialAudioConfig(LyraxTranscoderSpatialAudioConfig lyraxTranscoderSpatialAudioConfig) {
        this.spatialAudioConfig = lyraxTranscoderSpatialAudioConfig;
    }

    public void setSyncControlConfig(LyraxTranscoderSyncControlConfig lyraxTranscoderSyncControlConfig) {
        this.syncControlConfig = lyraxTranscoderSyncControlConfig;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setVideoConfig(LyraxTranscoderVideoConfig lyraxTranscoderVideoConfig) {
        this.videoConfig = lyraxTranscoderVideoConfig;
    }
}
