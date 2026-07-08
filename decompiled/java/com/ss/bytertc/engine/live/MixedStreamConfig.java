package com.ss.bytertc.engine.live;

import X.C08FF;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.data.HumanOrientation;
import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.utils.LogUtil;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class MixedStreamConfig {
    public JSONObject advancedConfig;
    public MixedStreamAudioConfig audioConfig;
    public JSONObject authInfo;
    public MixedStreamClientMixConfig clientMixConfig;
    public boolean disableCdnForward;
    public ByteRTCStreamMixingType expectedMixingType = ByteRTCStreamMixingType.STREAM_MIXING_BY_SERVER;
    public List<MixedStreamFeatureConfig> featureConfigs;
    public MixedStreamLayoutConfig layout;
    public ByteRTCLowLatencyParams lowLatencyParams;
    public String orientation;
    public String pushURL;
    public String roomID;
    public MixedStreamServerControlConfig serverControlConfig;
    public MixedStreamSpatialConfig spatialConfig;
    public MixedStreamSyncControlConfig syncControlConfig;
    public String userID;
    public MixedStreamVideoConfig videoConfig;

    public static class MixedStreamLayoutConfig {
        public MixedStreamLayoutRegionConfig[] beforeRegions;
        public long danceVideoStartNtpTime;
        public MixedStreamLayoutRegionConfig[] regions;
        public String userConfigExtraInfo = "";
        public String animationId = "";
        public String animationPath = "";
        public String flashColor = "";
        public String backgroundColor = "#000000";
        public String backgroundImage = "";
        public AppdataSEIMode appdataSEIMode = AppdataSEIMode.APPDATA_SEI_ASYN_MODE;
        public MixedStreamRenderMode backgroundRenderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
        public String danceVideoId = "";

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            Object jSONObject2 = new JSONObject();
            try {
                MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr = this.regions;
                if (mixedStreamLayoutRegionConfigArr != null) {
                    try {
                        for (MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig : mixedStreamLayoutRegionConfigArr) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("winID", mixedStreamLayoutRegionConfig.winID);
                            jSONObject3.put("userID", mixedStreamLayoutRegionConfig.userID);
                            jSONObject3.put("roomID", mixedStreamLayoutRegionConfig.roomID);
                            jSONObject3.put("locationX", mixedStreamLayoutRegionConfig.locationX);
                            jSONObject3.put("locationY", mixedStreamLayoutRegionConfig.locationY);
                            jSONObject3.put("widthProportion", mixedStreamLayoutRegionConfig.widthProportion);
                            jSONObject3.put("heightProportion", mixedStreamLayoutRegionConfig.heightProportion);
                            jSONObject3.put("zOrder", mixedStreamLayoutRegionConfig.zOrder);
                            jSONObject3.put("alpha", mixedStreamLayoutRegionConfig.alpha);
                            jSONObject3.put("cornerRadius", mixedStreamLayoutRegionConfig.cornerRadius);
                            jSONObject3.put("regionContentType", mixedStreamLayoutRegionConfig.regionContentType);
                            jSONObject3.put("renderMode", mixedStreamLayoutRegionConfig.renderMode);
                            jSONObject3.put("streamIndex", mixedStreamLayoutRegionConfig.streamIndex);
                            jSONObject3.put("applySpatialAudio", mixedStreamLayoutRegionConfig.applySpatialAudio);
                            jSONObject3.put("applySpatialReverb", mixedStreamLayoutRegionConfig.applySpatialReverb);
                            jSONArray.put(jSONObject3);
                        }
                    } catch (JSONException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        LogUtil.w("MixedStreamConfig", "create layout json message happen exception", e);
                        return null;
                    }
                }
                try {
                    MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr2 = this.beforeRegions;
                    if (mixedStreamLayoutRegionConfigArr2 != null) {
                        for (MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig2 : mixedStreamLayoutRegionConfigArr2) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("winID", mixedStreamLayoutRegionConfig2.winID);
                            jSONObject4.put("userID", mixedStreamLayoutRegionConfig2.userID);
                            jSONObject4.put("roomID", mixedStreamLayoutRegionConfig2.roomID);
                            jSONObject4.put("locationX", mixedStreamLayoutRegionConfig2.locationX);
                            jSONObject4.put("locationY", mixedStreamLayoutRegionConfig2.locationY);
                            jSONObject4.put("widthProportion", mixedStreamLayoutRegionConfig2.widthProportion);
                            jSONObject4.put("heightProportion", mixedStreamLayoutRegionConfig2.heightProportion);
                            jSONObject4.put("zOrder", mixedStreamLayoutRegionConfig2.zOrder);
                            jSONObject4.put("alpha", mixedStreamLayoutRegionConfig2.alpha);
                            jSONObject4.put("cornerRadius", mixedStreamLayoutRegionConfig2.cornerRadius);
                            jSONObject4.put("regionContentType", mixedStreamLayoutRegionConfig2.regionContentType);
                            jSONObject4.put("renderMode", mixedStreamLayoutRegionConfig2.renderMode);
                            jSONObject4.put("streamIndex", mixedStreamLayoutRegionConfig2.streamIndex);
                            jSONObject4.put("applySpatialAudio", mixedStreamLayoutRegionConfig2.applySpatialAudio);
                            jSONObject4.put("applySpatialReverb", mixedStreamLayoutRegionConfig2.applySpatialReverb);
                            jSONArray2.put(jSONObject4);
                        }
                    }
                    jSONObject.put("canvas", jSONObject2);
                    jSONObject.put("regions", jSONArray);
                    jSONObject.put("beforeRegions", jSONArray2);
                } catch (JSONException e2) {
                    e = e2;
                }
            } catch (JSONException e3) {
                e = e3;
            }
            try {
                jSONObject.put("userConfigExtraInfo", this.userConfigExtraInfo);
                jSONObject.put("danceVideoId", this.danceVideoId);
                jSONObject.put("danceVideoStartNtpTime", this.danceVideoStartNtpTime);
                return C786410Ut5.J3(jSONObject);
            } catch (JSONException e4) {
                e = e4;
                TryCatchGuardChecker.doCheck(e);
                LogUtil.w("MixedStreamConfig", "create layout json message happen exception", e);
                return null;
            }
        }

        public String getAnimationId() {
            return this.animationId;
        }

        public String getAnimationPath() {
            return this.animationPath;
        }

        public AppdataSEIMode getAppdataSEIMode() {
            return this.appdataSEIMode;
        }

        public MixedStreamRenderMode getBackGroundImageRenderMode() {
            return this.backgroundRenderMode;
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public String getBackgroundImage() {
            return this.backgroundImage;
        }

        public MixedStreamLayoutRegionConfig[] getBeforeRegions() {
            return this.beforeRegions;
        }

        public String getDanceVideoId() {
            return this.danceVideoId;
        }

        public long getDanceVideoStartNtpTime() {
            return this.danceVideoStartNtpTime;
        }

        public String getFlashColor() {
            return this.flashColor;
        }

        public MixedStreamLayoutRegionConfig[] getRegions() {
            return this.regions;
        }

        public String getUserConfigExtraInfo() {
            return this.userConfigExtraInfo;
        }

        public MixedStreamLayoutConfig setAnimationId(String str) {
            this.animationId = str;
            return this;
        }

        public MixedStreamLayoutConfig setAnimationPath(String str) {
            this.animationPath = str;
            return this;
        }

        public MixedStreamLayoutConfig setAppdataSEIMode(AppdataSEIMode appdataSEIMode) {
            this.appdataSEIMode = appdataSEIMode;
            return this;
        }

        public MixedStreamLayoutConfig setBackgroundColor(String str) {
            this.backgroundColor = str;
            return this;
        }

        public MixedStreamLayoutConfig setBackgroundImage(String str) {
            this.backgroundImage = str;
            return this;
        }

        public MixedStreamLayoutConfig setBackgroundImageRenderMode(MixedStreamRenderMode mixedStreamRenderMode) {
            this.backgroundRenderMode = mixedStreamRenderMode;
            return this;
        }

        public MixedStreamLayoutConfig setBeforeRegions(MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr) {
            this.beforeRegions = mixedStreamLayoutRegionConfigArr;
            return this;
        }

        public MixedStreamLayoutConfig setDanceVideoId(String str) {
            this.danceVideoId = str;
            return this;
        }

        public MixedStreamLayoutConfig setDanceVideoStartNtpTime(long j) {
            this.danceVideoStartNtpTime = j;
            return this;
        }

        public MixedStreamLayoutConfig setFlashColor(String str) {
            this.flashColor = str;
            return this;
        }

        public MixedStreamLayoutConfig setRegions(MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr) {
            this.regions = mixedStreamLayoutRegionConfigArr;
            return this;
        }

        public MixedStreamLayoutConfig setUserConfigExtraInfo(String str) {
            this.userConfigExtraInfo = str;
            return this;
        }
    }

    public static MixedStreamConfig defaultMixedStreamConfig() {
        MixedStreamVideoConfig mixedStreamVideoConfig = new MixedStreamVideoConfig();
        mixedStreamVideoConfig.videoCodec = MixedStreamVideoConfig.MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_H264;
        mixedStreamVideoConfig.fps = 15;
        mixedStreamVideoConfig.gop = 2;
        mixedStreamVideoConfig.enableBframe = false;
        mixedStreamVideoConfig.height = 640;
        mixedStreamVideoConfig.width = 360;
        mixedStreamVideoConfig.bitrate = 500;
        mixedStreamVideoConfig.upgradeWidth = 0;
        mixedStreamVideoConfig.upgradeHeight = 0;
        mixedStreamVideoConfig.roiX = 0.0f;
        mixedStreamVideoConfig.roiY = 0.0f;
        mixedStreamVideoConfig.roiW = 0.0f;
        mixedStreamVideoConfig.roiH = 0.0f;
        MixedStreamAudioConfig mixedStreamAudioConfig = new MixedStreamAudioConfig();
        mixedStreamAudioConfig.audioCodec = MixedStreamAudioConfig.MixedStreamAudioCodecType.MIXED_STREAM_AUDIO_CODEC_TYPE_AAC;
        mixedStreamAudioConfig.channels = 2;
        mixedStreamAudioConfig.bitrate = 64;
        mixedStreamAudioConfig.sampleRate = 48000;
        mixedStreamAudioConfig.audioProfile = MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;
        MixedStreamServerControlConfig mixedStreamServerControlConfig = new MixedStreamServerControlConfig();
        mixedStreamServerControlConfig.enableVolumeIndication = false;
        mixedStreamServerControlConfig.seiContentMode = MixedStreamSEIContentMode.MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT;
        mixedStreamServerControlConfig.isAddVolumeValue = false;
        mixedStreamServerControlConfig.talkVolume = 0;
        mixedStreamServerControlConfig.enableTalkVolumeLevels = false;
        mixedStreamServerControlConfig.talkVolumeLevels = new int[]{0, 20};
        mixedStreamServerControlConfig.volumeIndicationInterval = 2.0f;
        mixedStreamServerControlConfig.seiPayloadType = 100;
        mixedStreamServerControlConfig.seiPayloadUuid = "";
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = new MixedStreamSyncControlConfig();
        mixedStreamSyncControlConfig.baseUserID = "";
        mixedStreamSyncControlConfig.syncStrategy = MixedStreamSyncStrategy.MIXED_STREAM_SYNC_STRATEGY_NO_SYNC;
        mixedStreamSyncControlConfig.maxCacheTimeMs = 2000;
        mixedStreamSyncControlConfig.videoNeedSdkMix = true;
        MixedStreamClientMixConfig mixedStreamClientMixConfig = new MixedStreamClientMixConfig();
        mixedStreamClientMixConfig.useAudioMixer = true;
        mixedStreamClientMixConfig.videoFormat = MixedStreamClientMixVideoFormat.MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_I420;
        MixedStreamSpatialConfig mixedStreamSpatialConfig = new MixedStreamSpatialConfig();
        mixedStreamSpatialConfig.enableSpatialRender = false;
        MixedStreamLayoutConfig mixedStreamLayoutConfig = new MixedStreamLayoutConfig();
        mixedStreamLayoutConfig.backgroundColor = "#000000";
        mixedStreamLayoutConfig.userConfigExtraInfo = "";
        ByteRTCLowLatencyParams byteRTCLowLatencyParams = new ByteRTCLowLatencyParams();
        byteRTCLowLatencyParams.enableLowLatencyPush = false;
        byteRTCLowLatencyParams.isUsingInitialParams = true;
        MixedStreamConfig mixedStreamConfig = new MixedStreamConfig();
        mixedStreamConfig.audioConfig = mixedStreamAudioConfig;
        mixedStreamConfig.videoConfig = mixedStreamVideoConfig;
        mixedStreamConfig.serverControlConfig = mixedStreamServerControlConfig;
        mixedStreamConfig.syncControlConfig = mixedStreamSyncControlConfig;
        mixedStreamConfig.clientMixConfig = mixedStreamClientMixConfig;
        mixedStreamConfig.spatialConfig = mixedStreamSpatialConfig;
        mixedStreamConfig.layout = mixedStreamLayoutConfig;
        mixedStreamConfig.pushURL = null;
        mixedStreamConfig.lowLatencyParams = byteRTCLowLatencyParams;
        return mixedStreamConfig;
    }

    public String getMixedStreamAdvancedConfig() {
        JSONObject jSONObject = this.advancedConfig;
        return jSONObject == null ? "" : C786410Ut5.J3(jSONObject);
    }

    public String getMixedStreamAudioConfigAudioProfile() {
        MixedStreamAudioProfile mixedStreamAudioProfile;
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        return (mixedStreamAudioConfig == null || (mixedStreamAudioProfile = mixedStreamAudioConfig.audioProfile) == null) ? "" : mixedStreamAudioProfile.getValue();
    }

    public int getMixedStreamAudioConfigChannels() {
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        if (mixedStreamAudioConfig == null) {
            return 0;
        }
        return mixedStreamAudioConfig.channels;
    }

    public String getMixedStreamAudioConfigCodec() {
        MixedStreamAudioConfig.MixedStreamAudioCodecType mixedStreamAudioCodecType;
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        return (mixedStreamAudioConfig == null || (mixedStreamAudioCodecType = mixedStreamAudioConfig.audioCodec) == null) ? "" : mixedStreamAudioCodecType.getValue();
    }

    public int getMixedStreamAudioConfigSampleRate() {
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        if (mixedStreamAudioConfig == null) {
            return 0;
        }
        return mixedStreamAudioConfig.sampleRate;
    }

    public String getMixedStreamAuthInfo() {
        JSONObject jSONObject = this.authInfo;
        return jSONObject == null ? "" : C786410Ut5.J3(jSONObject);
    }

    public boolean getMixedStreamClientMixConfigUseAudioMixer() {
        MixedStreamClientMixConfig mixedStreamClientMixConfig = this.clientMixConfig;
        if (mixedStreamClientMixConfig == null) {
            return true;
        }
        return mixedStreamClientMixConfig.useAudioMixer;
    }

    public int getMixedStreamClientMixConfigVideoFormat() {
        MixedStreamClientMixConfig mixedStreamClientMixConfig = this.clientMixConfig;
        return (mixedStreamClientMixConfig == null ? MixedStreamClientMixVideoFormat.MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_I420 : mixedStreamClientMixConfig.videoFormat).getValue();
    }

    public String getMixedStreamLayoutAnimationId() {
        String str;
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        return (mixedStreamLayoutConfig == null || (str = mixedStreamLayoutConfig.animationId) == null) ? "" : str;
    }

    public String getMixedStreamLayoutAnimationPath() {
        String str;
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        return (mixedStreamLayoutConfig == null || (str = mixedStreamLayoutConfig.animationPath) == null) ? "" : str;
    }

    public int getMixedStreamLayoutAppdataSEIMode() {
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        return (mixedStreamLayoutConfig == null ? AppdataSEIMode.APPDATA_SEI_ASYN_MODE : mixedStreamLayoutConfig.appdataSEIMode).getValue();
    }

    public String getMixedStreamLayoutBackgroundColor() {
        String str;
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        return (mixedStreamLayoutConfig == null || (str = mixedStreamLayoutConfig.backgroundColor) == null) ? "" : str;
    }

    public String getMixedStreamLayoutBackgroundImage() {
        String str;
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        return (mixedStreamLayoutConfig == null || (str = mixedStreamLayoutConfig.backgroundImage) == null) ? "" : str;
    }

    public int getMixedStreamLayoutBackgroundImageRenderMode() {
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        return (mixedStreamLayoutConfig == null ? MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN : mixedStreamLayoutConfig.backgroundRenderMode).getValue();
    }

    public MixedStreamLayoutRegionConfig[] getMixedStreamLayoutBeforeRegionConfigs() {
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        if (mixedStreamLayoutConfig == null) {
            return null;
        }
        return mixedStreamLayoutConfig.beforeRegions;
    }

    public String getMixedStreamLayoutFlashColor() {
        String str;
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        return (mixedStreamLayoutConfig == null || (str = mixedStreamLayoutConfig.flashColor) == null) ? "" : str;
    }

    public MixedStreamLayoutRegionConfig[] getMixedStreamLayoutRegionConfigs() {
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        if (mixedStreamLayoutConfig == null) {
            return null;
        }
        return mixedStreamLayoutConfig.regions;
    }

    public String getMixedStreamLayoutUserConfigExtraInfo() {
        String str;
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        return (mixedStreamLayoutConfig == null || (str = mixedStreamLayoutConfig.userConfigExtraInfo) == null) ? "" : str;
    }

    public int getMixedStreamMixType() {
        return this.expectedMixingType.value();
    }

    public String getMixedStreamOrientation() {
        String str = this.orientation;
        return str == null ? "" : str;
    }

    public String getMixedStreamRoomID() {
        String str = this.roomID;
        return str == null ? "" : str;
    }

    public int getMixedStreamServerControlConfigAsrTaskMode() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return 0;
        }
        return mixedStreamServerControlConfig.asrTaskMode.getValue();
    }

    public boolean getMixedStreamServerControlConfigEnableTalkVolumeLevels() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return false;
        }
        return mixedStreamServerControlConfig.enableTalkVolumeLevels;
    }

    public boolean getMixedStreamServerControlConfigEnableVolumeIndication() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return false;
        }
        return mixedStreamServerControlConfig.enableVolumeIndication;
    }

    public boolean getMixedStreamServerControlConfigIsAddVolumeValue() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return false;
        }
        return mixedStreamServerControlConfig.isAddVolumeValue;
    }

    public int getMixedStreamServerControlConfigSeiContentMode() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        return (mixedStreamServerControlConfig == null ? MixedStreamSEIContentMode.MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT : mixedStreamServerControlConfig.seiContentMode).getValue();
    }

    public int getMixedStreamServerControlConfigSeiPayloadType() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return 0;
        }
        return mixedStreamServerControlConfig.seiPayloadType;
    }

    public String getMixedStreamServerControlConfigSeiPayloadUuid() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        return mixedStreamServerControlConfig == null ? "" : mixedStreamServerControlConfig.seiPayloadUuid;
    }

    public int getMixedStreamServerControlConfigTalkLevelVolumeSize() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return 2;
        }
        return mixedStreamServerControlConfig.talkVolumeLevels.length;
    }

    public int getMixedStreamServerControlConfigTalkVolume() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return 0;
        }
        return mixedStreamServerControlConfig.talkVolume;
    }

    public int[] getMixedStreamServerControlConfigTalkVolumeLevels() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        return mixedStreamServerControlConfig == null ? new int[]{0, 20} : mixedStreamServerControlConfig.talkVolumeLevels;
    }

    public float getMixedStreamServerControlConfigVolumeIndicationInterval() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return 2.0f;
        }
        return mixedStreamServerControlConfig.volumeIndicationInterval;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationForwardX() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.forward.x;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationForwardY() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.forward.y;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationForwardZ() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.forward.z;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationRightX() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.right.x;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationRightY() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.right.y;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationRightZ() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.right.z;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationUpX() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.up.x;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationUpY() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.up.y;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationUpZ() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.up.z;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialPositionX() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialPosition.x;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialPositionY() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialPosition.y;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialPositionZ() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialPosition.z;
    }

    public boolean getMixedStreamSpatialConfigEnableSpatialRender() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return false;
        }
        return mixedStreamSpatialConfig.enableSpatialRender;
    }

    public String getMixedStreamSyncControlConfigBaseUser() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        return mixedStreamSyncControlConfig == null ? "" : mixedStreamSyncControlConfig.baseUserID;
    }

    public int getMixedStreamSyncControlConfigQueueLength() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        if (mixedStreamSyncControlConfig == null) {
            return 0;
        }
        return mixedStreamSyncControlConfig.maxCacheTimeMs;
    }

    public int getMixedStreamSyncControlConfigSyncStrategy() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        return (mixedStreamSyncControlConfig == null ? MixedStreamSyncStrategy.MIXED_STREAM_SYNC_STRATEGY_NO_SYNC : mixedStreamSyncControlConfig.syncStrategy).getValue();
    }

    public boolean getMixedStreamSyncControlConfigVideoNeedMix() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        if (mixedStreamSyncControlConfig == null) {
            return false;
        }
        return mixedStreamSyncControlConfig.videoNeedSdkMix;
    }

    public String getMixedStreamUrl() {
        String str = this.pushURL;
        return str == null ? "" : str;
    }

    public String getMixedStreamUserID() {
        String str = this.userID;
        return str == null ? "" : str;
    }

    public boolean getMixedStreamVideoConfigBFrame() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return false;
        }
        return mixedStreamVideoConfig.enableBframe;
    }

    public int getMixedStreamVideoConfigBitrate() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.bitrate;
    }

    public String getMixedStreamVideoConfigCodec() {
        MixedStreamVideoConfig.MixedStreamVideoCodecType mixedStreamVideoCodecType;
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        return (mixedStreamVideoConfig == null || (mixedStreamVideoCodecType = mixedStreamVideoConfig.videoCodec) == null) ? "" : mixedStreamVideoCodecType.getValue();
    }

    public int getMixedStreamVideoConfigFps() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.fps;
    }

    public int getMixedStreamVideoConfigGop() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.gop;
    }

    public int getMixedStreamVideoConfigHeight() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.height;
    }

    public float getMixedStreamVideoConfigRoiH() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0.0f;
        }
        return mixedStreamVideoConfig.roiH;
    }

    public float getMixedStreamVideoConfigRoiW() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0.0f;
        }
        return mixedStreamVideoConfig.roiW;
    }

    public float getMixedStreamVideoConfigRoiX() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0.0f;
        }
        return mixedStreamVideoConfig.roiX;
    }

    public float getMixedStreamVideoConfigRoiY() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0.0f;
        }
        return mixedStreamVideoConfig.roiY;
    }

    public int getMixedStreamVideoConfigUpgradeHeight() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.upgradeHeight;
    }

    public int getMixedStreamVideoConfigUpgradeWidth() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.upgradeWidth;
    }

    public int getMixedStreamVideoConfigWidth() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.width;
    }

    public int getMixedStreamaudioConfigBitrate() {
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        if (mixedStreamAudioConfig == null) {
            return 0;
        }
        return mixedStreamAudioConfig.bitrate;
    }

    public JSONObject getTranscodeMessage() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONObject jSONObject8 = new JSONObject();
        JSONObject jSONObject9 = new JSONObject();
        JSONObject jSONObject10 = new JSONObject();
        try {
            jSONObject.put("videoCodec", this.videoConfig.videoCodec);
            jSONObject.put("fps", this.videoConfig.fps);
            jSONObject.put("gop", this.videoConfig.gop);
            jSONObject.put("bitrate", this.videoConfig.bitrate);
            jSONObject.put("width", this.videoConfig.width);
            jSONObject.put("height", this.videoConfig.height);
            jSONObject.put("enableBframe", this.videoConfig.enableBframe);
            jSONObject.put("upgradeWidth", this.videoConfig.upgradeWidth);
            jSONObject.put("upgradeHeight", this.videoConfig.upgradeHeight);
            jSONObject.put("roiX", this.videoConfig.roiX);
            jSONObject.put("roiY", this.videoConfig.roiY);
            jSONObject.put("roiW", this.videoConfig.roiW);
            jSONObject.put("roiH", this.videoConfig.roiH);
            jSONObject2.put("audioCodec", this.audioConfig.audioCodec);
            jSONObject2.put("bitrate", this.audioConfig.bitrate);
            jSONObject2.put("sampleRate", this.audioConfig.sampleRate);
            jSONObject2.put("channels", this.audioConfig.channels);
            jSONObject2.put("audioProfile", this.audioConfig.audioProfile);
            jSONObject3.put("enableVolumeIndication", this.serverControlConfig.enableVolumeIndication);
            jSONObject3.put("talkVolume", this.serverControlConfig.talkVolume);
            jSONObject3.put("enableTalkVolumeLevels", this.serverControlConfig.enableTalkVolumeLevels);
            jSONObject3.put("talkVolumeLevels", this.serverControlConfig.talkVolumeLevels);
            jSONObject3.put("isAddVolumeValue", this.serverControlConfig.isAddVolumeValue);
            jSONObject3.put("volumeIndicationInterval", this.serverControlConfig.volumeIndicationInterval);
            jSONObject3.put("seiContentMode", this.serverControlConfig.seiContentMode);
            jSONObject3.put("seiPayloadType", this.serverControlConfig.seiPayloadType);
            jSONObject3.put("seiPayloadUuid", this.serverControlConfig.seiPayloadUuid);
            jSONObject4.put("useAudioMixer", this.clientMixConfig.useAudioMixer);
            jSONObject4.put("videoFormat", this.clientMixConfig.videoFormat.getValue());
            jSONObject5.put("syncStrategy", this.syncControlConfig.syncStrategy);
            jSONObject5.put("maxCacheTimeMs", this.syncControlConfig.maxCacheTimeMs);
            jSONObject5.put("videoNeedSdkMix", this.syncControlConfig.videoNeedSdkMix);
            jSONObject5.put("baseuserID", this.syncControlConfig.baseUserID);
            jSONObject7.put("backgroundColor", this.layout.backgroundColor);
            MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr = this.layout.regions;
            if (mixedStreamLayoutRegionConfigArr != null) {
                try {
                    for (MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig : mixedStreamLayoutRegionConfigArr) {
                        JSONObject jSONObject11 = new JSONObject();
                        jSONObject11.put("winID", mixedStreamLayoutRegionConfig.winID);
                        jSONObject11.put("userID", mixedStreamLayoutRegionConfig.userID);
                        jSONObject11.put("roomID", mixedStreamLayoutRegionConfig.roomID);
                        jSONObject11.put("locationX", mixedStreamLayoutRegionConfig.locationX);
                        jSONObject11.put("locationY", mixedStreamLayoutRegionConfig.locationY);
                        jSONObject11.put("widthProportion", mixedStreamLayoutRegionConfig.widthProportion);
                        jSONObject11.put("heightProportion", mixedStreamLayoutRegionConfig.heightProportion);
                        jSONObject11.put("zOrder", mixedStreamLayoutRegionConfig.zOrder);
                        jSONObject11.put("alpha", mixedStreamLayoutRegionConfig.alpha);
                        jSONObject11.put("cornerRadius", mixedStreamLayoutRegionConfig.cornerRadius);
                        jSONObject11.put("mediaType", mixedStreamLayoutRegionConfig.mediaType);
                        jSONObject11.put("renderMode", mixedStreamLayoutRegionConfig.renderMode);
                        jSONObject11.put("isLocalUser", mixedStreamLayoutRegionConfig.isLocalUser);
                        jSONObject11.put("streamIndex", mixedStreamLayoutRegionConfig.streamIndex);
                        jSONObject11.put("applySpatialAudio", mixedStreamLayoutRegionConfig.applySpatialAudio);
                        jSONObject11.put("applySpatialReverb", mixedStreamLayoutRegionConfig.applySpatialReverb);
                        jSONArray.put(jSONObject11);
                    }
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    LogUtil.w("MixedStreamConfig", "get json message happen exception", e);
                    return null;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr2 = this.layout.beforeRegions;
            if (mixedStreamLayoutRegionConfigArr2 != null) {
                for (MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig2 : mixedStreamLayoutRegionConfigArr2) {
                    JSONObject jSONObject12 = new JSONObject();
                    jSONObject12.put("winID", mixedStreamLayoutRegionConfig2.winID);
                    jSONObject12.put("userID", mixedStreamLayoutRegionConfig2.userID);
                    jSONObject12.put("roomID", mixedStreamLayoutRegionConfig2.roomID);
                    jSONObject12.put("locationX", mixedStreamLayoutRegionConfig2.locationX);
                    jSONObject12.put("locationY", mixedStreamLayoutRegionConfig2.locationY);
                    jSONObject12.put("widthProportion", mixedStreamLayoutRegionConfig2.widthProportion);
                    jSONObject12.put("heightProportion", mixedStreamLayoutRegionConfig2.heightProportion);
                    jSONObject12.put("zOrder", mixedStreamLayoutRegionConfig2.zOrder);
                    jSONObject12.put("alpha", mixedStreamLayoutRegionConfig2.alpha);
                    jSONObject12.put("cornerRadius", mixedStreamLayoutRegionConfig2.cornerRadius);
                    jSONObject12.put("mediaType", mixedStreamLayoutRegionConfig2.mediaType);
                    jSONObject12.put("renderMode", mixedStreamLayoutRegionConfig2.renderMode);
                    jSONObject12.put("isLocalUser", mixedStreamLayoutRegionConfig2.isLocalUser);
                    jSONObject12.put("streamIndex", mixedStreamLayoutRegionConfig2.streamIndex);
                    jSONObject12.put("applySpatialAudio", mixedStreamLayoutRegionConfig2.applySpatialAudio);
                    jSONObject12.put("applySpatialReverb", mixedStreamLayoutRegionConfig2.applySpatialReverb);
                    jSONArray2.put(jSONObject12);
                }
            }
            jSONObject6.put("canvas", jSONObject7);
            jSONObject6.put("regions", jSONArray);
            jSONObject6.put("beforeRegions", jSONArray2);
            jSONObject6.put("userConfigExtraInfo", this.layout.userConfigExtraInfo);
            jSONObject6.put("danceVideoId", this.layout.danceVideoId);
            jSONObject6.put("danceVideoStartNtpTime", this.layout.danceVideoStartNtpTime);
            jSONObject8.put("pushURL", this.pushURL);
            jSONObject9.put("transcode", jSONObject8);
            jSONObject9.put("orientation", this.orientation);
            jSONObject9.put("video", jSONObject);
            jSONObject9.put("audio", jSONObject2);
            jSONObject9.put("serverControl", jSONObject3);
            jSONObject9.put("clientMix", jSONObject4);
            jSONObject9.put("syncControl", jSONObject5);
            jSONObject9.put("layout", jSONObject6);
            jSONObject9.put("advancedConfig", this.advancedConfig);
            Object obj = this.authInfo;
            if (obj != null) {
                jSONObject9.put("authInfo", obj);
            }
            jSONObject10.put("expectedMixingType", this.expectedMixingType);
            jSONObject10.put("type", "transcode");
            jSONObject10.put("roomID", this.roomID);
            jSONObject10.put("userID", this.userID);
            jSONObject10.put("transcodeMeta", jSONObject9);
            return jSONObject10;
        } catch (Exception e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            LogUtil.w("MixedStreamConfig", "get json message happen exception", e);
            return null;
        }
    }

    public static class MixedStreamAudioConfig {
        public MixedStreamAudioCodecType audioCodec = MixedStreamAudioCodecType.MIXED_STREAM_AUDIO_CODEC_TYPE_AAC;
        public int bitrate = 64;
        public int sampleRate = 48000;
        public int channels = 2;
        public MixedStreamAudioProfile audioProfile = MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;

        public enum MixedStreamAudioCodecType {
            MIXED_STREAM_AUDIO_CODEC_TYPE_AAC("AAC");

            public String audioCodecType;

            public String getValue() {
                return this.audioCodecType;
            }

            public static MixedStreamAudioCodecType valueOf(String str) {
                return (MixedStreamAudioCodecType) C08FF.LIZ(MixedStreamAudioCodecType.class, str);
            }

            MixedStreamAudioCodecType(String str) {
                this.audioCodecType = str;
            }
        }

        public MixedStreamAudioCodecType getAudioCodec() {
            return this.audioCodec;
        }

        public MixedStreamAudioProfile getAudioProfile() {
            return this.audioProfile;
        }

        public int getBitrate() {
            return this.bitrate;
        }

        public int getChannels() {
            return this.channels;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        public MixedStreamAudioConfig setAudioCodec(MixedStreamAudioCodecType mixedStreamAudioCodecType) {
            this.audioCodec = mixedStreamAudioCodecType;
            return this;
        }

        public MixedStreamAudioConfig setAudioProfile(MixedStreamAudioProfile mixedStreamAudioProfile) {
            this.audioProfile = mixedStreamAudioProfile;
            return this;
        }

        public MixedStreamAudioConfig setBitrate(int i) {
            this.bitrate = i;
            return this;
        }

        public MixedStreamAudioConfig setChannels(int i) {
            this.channels = i;
            return this;
        }

        public MixedStreamAudioConfig setSampleRate(int i) {
            this.sampleRate = i;
            return this;
        }
    }

    public static class MixedStreamLayoutRegionConfig {
        public double cornerRadius;
        public MixedStreamEffectDescription[] effectDescription;
        public byte[] imageWaterMark;
        public boolean isLocalUser;
        public double locationX;
        public double locationY;
        public int winID;
        public int zOrder;
        public String userID = "";
        public String roomID = "";
        public double widthProportion = 1.0d;
        public double heightProportion = 1.0d;
        public double alpha = 1.0d;
        public MixedStreamMediaType mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
        public MixedStreamRenderMode renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
        public StreamIndex streamIndex = StreamIndex.STREAM_INDEX_MAIN;
        public MixedStreamLayoutRegionType regionContentType = MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM;
        public MixedStreamLayoutRegionImageWaterMarkConfig imageWaterMarkConfig = new MixedStreamLayoutRegionImageWaterMarkConfig(0, 0);
        public Position spatialPosition = new Position();
        public boolean applySpatialAudio = true;
        public boolean applySpatialReverb = false;
        public String alternateImageUrl = null;
        public AlternateImageFillMode alternateImageFillMode = AlternateImageFillMode.ALTERNATE_IMAGE_HIDDEN_MODE;
        public AlternateImageProcess alternateImageProcess = AlternateImageProcess.ALTERNATE_IMAGE_PROCESS_NONE;
        public int alternateImageProcessValue = 0;
        public AlternateImageProcessConfig alternateImageProcessConfig = new AlternateImageProcessConfig();
        public SourceCropInfo sourceCropInfo = new SourceCropInfo();

        public static class MixedStreamLayoutRegionImageWaterMarkConfig {
            public int imageHeight;
            public int imageWidth;

            public int getImageHeight() {
                return this.imageHeight;
            }

            public int getImageWidth() {
                return this.imageWidth;
            }

            public MixedStreamLayoutRegionImageWaterMarkConfig setImageHeight(int i) {
                this.imageHeight = i;
                return this;
            }

            public MixedStreamLayoutRegionImageWaterMarkConfig setImageWidth(int i) {
                this.imageWidth = i;
                return this;
            }

            public MixedStreamLayoutRegionImageWaterMarkConfig(int i, int i2) {
                this.imageWidth = i;
                this.imageHeight = i2;
            }
        }

        public double getAlpha() {
            return this.alpha;
        }

        public AlternateImageFillMode getAlternateImageFillMode() {
            return this.alternateImageFillMode;
        }

        public AlternateImageProcess getAlternateImageProcess() {
            return this.alternateImageProcess;
        }

        public AlternateImageProcessConfig getAlternateImageProcessConfig() {
            return this.alternateImageProcessConfig;
        }

        public int getAlternateImageProcessValue() {
            return this.alternateImageProcessValue;
        }

        public String getAlternateImageUrl() {
            return this.alternateImageUrl;
        }

        public boolean getApplySpatialAudio() {
            return this.applySpatialAudio;
        }

        public boolean getApplySpatialReverb() {
            return this.applySpatialReverb;
        }

        public double getCornerRadius() {
            return this.cornerRadius;
        }

        public MixedStreamEffectDescription[] getEffectDescription() {
            return this.effectDescription;
        }

        public double getHeightProportion() {
            return this.heightProportion;
        }

        public byte[] getImageWaterMark() {
            return this.imageWaterMark;
        }

        public MixedStreamLayoutRegionImageWaterMarkConfig getImageWaterMarkConfig() {
            return this.imageWaterMarkConfig;
        }

        public boolean getIsLocalUser() {
            return this.isLocalUser;
        }

        public double getLocationX() {
            return this.locationX;
        }

        public double getLocationY() {
            return this.locationY;
        }

        public MixedStreamMediaType getMediaType() {
            return this.mediaType;
        }

        public MixedStreamLayoutRegionType getRegionContentType() {
            return this.regionContentType;
        }

        public MixedStreamRenderMode getRenderMode() {
            return this.renderMode;
        }

        public String getRoomID() {
            return this.roomID;
        }

        public SourceCropInfo getSourceCropInfo() {
            return this.sourceCropInfo;
        }

        public Position getSpatialPosition() {
            return this.spatialPosition;
        }

        public StreamIndex getStreamIndex() {
            return this.streamIndex;
        }

        public String getUserID() {
            return this.userID;
        }

        public double getWidthProportion() {
            return this.widthProportion;
        }

        public int getWinID() {
            return this.winID;
        }

        public int getZOrder() {
            return this.zOrder;
        }

        public MixedStreamLayoutRegionConfig setAlpha(double d) {
            this.alpha = d;
            return this;
        }

        public MixedStreamLayoutRegionConfig setAlternateImageFillMode(AlternateImageFillMode alternateImageFillMode) {
            this.alternateImageFillMode = alternateImageFillMode;
            return this;
        }

        public MixedStreamLayoutRegionConfig setAlternateImageProcess(AlternateImageProcess alternateImageProcess) {
            this.alternateImageProcess = alternateImageProcess;
            return this;
        }

        public MixedStreamLayoutRegionConfig setAlternateImageProcessConfig(AlternateImageProcessConfig alternateImageProcessConfig) {
            this.alternateImageProcessConfig = alternateImageProcessConfig;
            return this;
        }

        public MixedStreamLayoutRegionConfig setAlternateImageProcessValue(int i) {
            this.alternateImageProcessValue = i;
            return this;
        }

        public MixedStreamLayoutRegionConfig setAlternateImageUrl(String str) {
            this.alternateImageUrl = str;
            return this;
        }

        public MixedStreamLayoutRegionConfig setApplySpatialAudio(boolean z) {
            this.applySpatialAudio = z;
            return this;
        }

        public MixedStreamLayoutRegionConfig setApplySpatialReverb(boolean z) {
            this.applySpatialReverb = z;
            return this;
        }

        public MixedStreamLayoutRegionConfig setCornerRadius(double d) {
            this.cornerRadius = d;
            return this;
        }

        public void setEffectDescriptions(MixedStreamEffectDescription[] mixedStreamEffectDescriptionArr) {
            this.effectDescription = mixedStreamEffectDescriptionArr;
        }

        public MixedStreamLayoutRegionConfig setHeightProportion(double d) {
            this.heightProportion = d;
            return this;
        }

        public MixedStreamLayoutRegionConfig setImageWaterMark(byte[] bArr) {
            this.imageWaterMark = bArr;
            return this;
        }

        public MixedStreamLayoutRegionConfig setImageWaterMarkConfig(MixedStreamLayoutRegionImageWaterMarkConfig mixedStreamLayoutRegionImageWaterMarkConfig) {
            this.imageWaterMarkConfig = mixedStreamLayoutRegionImageWaterMarkConfig;
            return this;
        }

        public MixedStreamLayoutRegionConfig setIsLocalUser(boolean z) {
            this.isLocalUser = z;
            return this;
        }

        public MixedStreamLayoutRegionConfig setLocationX(double d) {
            this.locationX = d;
            return this;
        }

        public MixedStreamLayoutRegionConfig setLocationY(double d) {
            this.locationY = d;
            return this;
        }

        public MixedStreamLayoutRegionConfig setMediaType(MixedStreamMediaType mixedStreamMediaType) {
            this.mediaType = mixedStreamMediaType;
            return this;
        }

        public MixedStreamLayoutRegionConfig setRegionContentType(MixedStreamLayoutRegionType mixedStreamLayoutRegionType) {
            this.regionContentType = mixedStreamLayoutRegionType;
            return this;
        }

        public MixedStreamLayoutRegionConfig setRenderMode(MixedStreamRenderMode mixedStreamRenderMode) {
            this.renderMode = mixedStreamRenderMode;
            return this;
        }

        public MixedStreamLayoutRegionConfig setRoomID(String str) {
            this.roomID = str;
            return this;
        }

        public MixedStreamLayoutRegionConfig setSourceCropInfo(SourceCropInfo sourceCropInfo) {
            this.sourceCropInfo = sourceCropInfo;
            return this;
        }

        public MixedStreamLayoutRegionConfig setSpatialPosition(Position position) {
            this.spatialPosition = position;
            return this;
        }

        public MixedStreamLayoutRegionConfig setStreamIndex(StreamIndex streamIndex) {
            this.streamIndex = streamIndex;
            return this;
        }

        public MixedStreamLayoutRegionConfig setUserID(String str) {
            this.userID = str;
            return this;
        }

        public MixedStreamLayoutRegionConfig setWidthProportion(double d) {
            this.widthProportion = d;
            return this;
        }

        public MixedStreamLayoutRegionConfig setWinID(int i) {
            this.winID = i;
            return this;
        }

        public MixedStreamLayoutRegionConfig setZOrder(int i) {
            this.zOrder = i;
            return this;
        }
    }

    public static class MixedStreamVideoConfig {
        public boolean enableBframe;
        public float roiH;
        public float roiW;
        public float roiX;
        public float roiY;
        public int upgradeHeight;
        public int upgradeWidth;
        public MixedStreamVideoCodecType videoCodec = MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_H264;
        public int fps = 15;
        public int gop = 2;
        public int bitrate = 500;
        public int width = 360;
        public int height = 640;

        public enum MixedStreamVideoCodecType {
            MIXED_STREAM_VIDEO_CODEC_TYPE_H264("H264"),
            MIXED_STREAM_VIDEO_CODEC_TYPE_BYTEVC1("ByteVC1");

            public String videoCodecType;

            public String getValue() {
                return this.videoCodecType;
            }

            public static MixedStreamVideoCodecType valueOf(String str) {
                return (MixedStreamVideoCodecType) C08FF.LIZ(MixedStreamVideoCodecType.class, str);
            }

            MixedStreamVideoCodecType(String str) {
                this.videoCodecType = str;
            }
        }

        public int getBitrate() {
            return this.bitrate;
        }

        public boolean getEnableBframe() {
            return this.enableBframe;
        }

        public int getFps() {
            return this.fps;
        }

        public int getGop() {
            return this.gop;
        }

        public int getHeight() {
            return this.height;
        }

        public MixedStreamVideoCodecType getVideoCodec() {
            return this.videoCodec;
        }

        public int getWidth() {
            return this.width;
        }

        public MixedStreamVideoConfig setBitrate(int i) {
            this.bitrate = i;
            return this;
        }

        public MixedStreamVideoConfig setEnableBframe(boolean z) {
            this.enableBframe = z;
            return this;
        }

        public MixedStreamVideoConfig setFps(int i) {
            this.fps = i;
            return this;
        }

        public MixedStreamVideoConfig setGop(int i) {
            this.gop = i;
            return this;
        }

        public MixedStreamVideoConfig setHeight(int i) {
            this.height = i;
            return this;
        }

        public MixedStreamVideoConfig setVideoCodec(MixedStreamVideoCodecType mixedStreamVideoCodecType) {
            this.videoCodec = mixedStreamVideoCodecType;
            return this;
        }

        public MixedStreamVideoConfig setWidth(int i) {
            this.width = i;
            return this;
        }

        public MixedStreamVideoConfig setUpgradeRes(int i, int i2) {
            this.upgradeWidth = i;
            this.upgradeHeight = i2;
            return this;
        }

        public MixedStreamVideoConfig setRoiInfo(float f, float f2, float f3, float f4) {
            this.roiX = f;
            this.roiY = f2;
            this.roiW = f3;
            this.roiH = f4;
            return this;
        }
    }

    public enum AlternateImageFillMode {
        ALTERNATE_IMAGE_HIDDEN_MODE(0),
        ALTERNATE_IMAGE_FILL_MODE(1);

        public int alternateImageFillMode;

        public int getValue() {
            return this.alternateImageFillMode;
        }

        public static AlternateImageFillMode valueOf(String str) {
            return (AlternateImageFillMode) C08FF.LIZ(AlternateImageFillMode.class, str);
        }

        AlternateImageFillMode(int i) {
            this.alternateImageFillMode = i;
        }
    }

    public enum AlternateImageProcess {
        ALTERNATE_IMAGE_PROCESS_NONE(0),
        ALTERNATE_IMAGE_PROCESS_GAUSSIAN(1),
        ALTERNATE_IMAGE_PROCESS_CONFIG(2);

        public int processMode;

        public int getValue() {
            return this.processMode;
        }

        public static AlternateImageProcess valueOf(String str) {
            return (AlternateImageProcess) C08FF.LIZ(AlternateImageProcess.class, str);
        }

        AlternateImageProcess(int i) {
            this.processMode = i;
        }
    }

    public static class AlternateImageProcessConfig {
        public int blur;
        public float brightness;

        public int getBlur() {
            return this.blur;
        }

        public float getBrightness() {
            return this.brightness;
        }

        public AlternateImageProcessConfig setBlur(int i) {
            this.blur = i;
            return this;
        }

        public AlternateImageProcessConfig setBrightness(float f) {
            this.brightness = f;
            return this;
        }
    }

    public enum AppdataSEIMode {
        APPDATA_SEI_ASYN_MODE(0),
        APPDATA_SEI_SYN_MODE(1);

        public int appdataSEISynMode;

        public int getValue() {
            return this.appdataSEISynMode;
        }

        public static AppdataSEIMode valueOf(String str) {
            return (AppdataSEIMode) C08FF.LIZ(AppdataSEIMode.class, str);
        }

        AppdataSEIMode(int i) {
            this.appdataSEISynMode = i;
        }
    }

    public enum MixedStreamASRTaskMode {
        MIXED_STREAM_ASR_TASK_MODE_DEFAULT(0),
        MIXED_STREAM_ASR_TASK_MODE_AI_EXPLANATION(1);

        public int taskMode;

        public int getValue() {
            return this.taskMode;
        }

        public static MixedStreamASRTaskMode fromValue(int i) {
            for (MixedStreamASRTaskMode mixedStreamASRTaskMode : values()) {
                if (mixedStreamASRTaskMode.getValue() == i) {
                    return mixedStreamASRTaskMode;
                }
            }
            return MIXED_STREAM_ASR_TASK_MODE_DEFAULT;
        }

        public static MixedStreamASRTaskMode valueOf(String str) {
            return (MixedStreamASRTaskMode) C08FF.LIZ(MixedStreamASRTaskMode.class, str);
        }

        MixedStreamASRTaskMode(int i) {
            this.taskMode = i;
        }
    }

    public enum MixedStreamAudioProfile {
        MIXED_STREAM_AUDIO_PROFILE_LC("LC"),
        MIXED_STREAM_AUDIO_PROFILE_HEV1("HEv1"),
        MIXED_STREAM_AUDIO_PROFILE_HEV2("HEv2");

        public String aacProfile;

        public String getValue() {
            return this.aacProfile;
        }

        public static MixedStreamAudioProfile valueOf(String str) {
            return (MixedStreamAudioProfile) C08FF.LIZ(MixedStreamAudioProfile.class, str);
        }

        MixedStreamAudioProfile(String str) {
            this.aacProfile = str;
        }
    }

    public static class MixedStreamClientMixConfig {
        public boolean useAudioMixer = true;
        public MixedStreamClientMixVideoFormat videoFormat = MixedStreamClientMixVideoFormat.MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_I420;

        public boolean getUseAudioMixer() {
            return this.useAudioMixer;
        }

        public MixedStreamClientMixVideoFormat getVideoFormat() {
            return this.videoFormat;
        }

        public MixedStreamClientMixConfig setUseAudioMixer(boolean z) {
            this.useAudioMixer = z;
            return this;
        }

        public MixedStreamClientMixConfig setVideoFormat(MixedStreamClientMixVideoFormat mixedStreamClientMixVideoFormat) {
            this.videoFormat = mixedStreamClientMixVideoFormat;
            return this;
        }
    }

    public enum MixedStreamClientMixVideoFormat {
        MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_I420(0),
        MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_TEXTURE_2D(1),
        MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_CVPIXEL_BUFFER_BGRA(2),
        MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_NV12(3);

        public int videoFormat;

        public int getValue() {
            return this.videoFormat;
        }

        public static MixedStreamClientMixVideoFormat valueOf(String str) {
            return (MixedStreamClientMixVideoFormat) C08FF.LIZ(MixedStreamClientMixVideoFormat.class, str);
        }

        MixedStreamClientMixVideoFormat(int i) {
            this.videoFormat = i;
        }
    }

    public static class MixedStreamEffectDescription {
        public MixedStreamEffectParam effectParam;
        public MixedStreamEffectType effectType = MixedStreamEffectType.MIXED_STREAM_EFFECT_TYPE_NONE;

        public MixedStreamEffectParam getEffectParam() {
            return this.effectParam;
        }

        public MixedStreamEffectType getEffectType() {
            return this.effectType;
        }

        public void setEffectParam(MixedStreamEffectParam mixedStreamEffectParam) {
            this.effectParam = mixedStreamEffectParam;
        }

        public void setEffectType(MixedStreamEffectType mixedStreamEffectType) {
            this.effectType = mixedStreamEffectType;
        }
    }

    public static class MixedStreamEffectParam {
        public String color;
        public boolean enable;
        public boolean enableSdkCallback;
        public boolean enableSegmentStore;
        public boolean enableWordMuting;
        public int thickness;

        public String getColor() {
            return this.color;
        }

        public int getThickness() {
            return this.thickness;
        }

        public boolean isEnable() {
            return this.enable;
        }

        public boolean isEnableSdkCallback() {
            return this.enableSdkCallback;
        }

        public boolean isEnableSegmentStore() {
            return this.enableSegmentStore;
        }

        public boolean isEnableWordMuting() {
            return this.enableWordMuting;
        }

        public void setColor(String str) {
            this.color = str;
        }

        public void setEnable(boolean z) {
            this.enable = z;
        }

        public void setEnableSdkCallback(boolean z) {
            this.enableSdkCallback = z;
        }

        public void setEnableSegmentStore(boolean z) {
            this.enableSegmentStore = z;
        }

        public void setEnableWordMuting(boolean z) {
            this.enableWordMuting = z;
        }

        public void setThickness(int i) {
            this.thickness = i;
        }
    }

    public enum MixedStreamEffectType {
        MIXED_STREAM_EFFECT_TYPE_NONE(0),
        MIXED_STREAM_EFFECT_TYPE_BORDER(1),
        MIXED_STREAM_EFFECT_TYPE_ASR_WORD_MUTING(2);

        public int effectType;

        public int getValue() {
            return this.effectType;
        }

        public static MixedStreamEffectType valueOf(String str) {
            return (MixedStreamEffectType) C08FF.LIZ(MixedStreamEffectType.class, str);
        }

        MixedStreamEffectType(int i) {
            this.effectType = i;
        }
    }

    public static class MixedStreamFeatureConfig {
        public boolean enable;
        public String featureName;
        public String options;
        public String projectKey;

        public boolean getEnable() {
            return this.enable;
        }

        public String getFeatureName() {
            return this.featureName;
        }

        public String getOptions() {
            return this.options;
        }

        public String getProjectKey() {
            return this.projectKey;
        }

        public MixedStreamFeatureConfig(boolean z, String str, String str2, String str3) {
            this.enable = z;
            this.featureName = str;
            this.projectKey = str2;
            this.options = str3;
        }
    }

    public static class MixedStreamFeatureOptions {
        public String agentUserId;
        public String anchorUserId;
        public String roomId;

        public String getAgentUserId() {
            return this.agentUserId;
        }

        public String getAnchorUserId() {
            return this.anchorUserId;
        }

        public String getRoomId() {
            return this.roomId;
        }

        public MixedStreamFeatureOptions(String str, String str2, String str3) {
            this.agentUserId = str;
            this.anchorUserId = str2;
            this.roomId = str3;
        }
    }

    public enum MixedStreamLayoutRegionType {
        MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM(0),
        MIXED_STREAM_LAYOUT_REGION_TYPE_IMAGE(1);

        public int regionType;

        public int getValue() {
            return this.regionType;
        }

        public static MixedStreamLayoutRegionType valueOf(String str) {
            return (MixedStreamLayoutRegionType) C08FF.LIZ(MixedStreamLayoutRegionType.class, str);
        }

        MixedStreamLayoutRegionType(int i) {
            this.regionType = i;
        }
    }

    public enum MixedStreamMediaType {
        MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO(0),
        MIXED_STREAM_MEDIA_TYPE_AUDIO_ONLY(1),
        MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY(2);

        public int contentControlType;

        public int getValue() {
            return this.contentControlType;
        }

        public static MixedStreamMediaType valueOf(String str) {
            return (MixedStreamMediaType) C08FF.LIZ(MixedStreamMediaType.class, str);
        }

        MixedStreamMediaType(int i) {
            this.contentControlType = i;
        }
    }

    public enum MixedStreamRenderMode {
        MIXED_STREAM_RENDER_MODE_HIDDEN(1),
        MIXED_STREAM_RENDER_MODE_FIT(2),
        MIXED_STREAM_RENDER_MODE_ADAPTIVE(3),
        MIXED_STREAM_RENDER_MODE_BOTTOM_CROP(4);

        public int renderMode;

        public int getValue() {
            return this.renderMode;
        }

        public static MixedStreamRenderMode valueOf(String str) {
            return (MixedStreamRenderMode) C08FF.LIZ(MixedStreamRenderMode.class, str);
        }

        MixedStreamRenderMode(int i) {
            this.renderMode = i;
        }
    }

    public enum MixedStreamSEIContentMode {
        MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT(0),
        MIXED_STREAM_SEI_CONTENT_MODE_ENABLE_VOLUME_INDICATION(1);

        public int seiContentMode;

        public int getValue() {
            return this.seiContentMode;
        }

        public static MixedStreamSEIContentMode valueOf(String str) {
            return (MixedStreamSEIContentMode) C08FF.LIZ(MixedStreamSEIContentMode.class, str);
        }

        MixedStreamSEIContentMode(int i) {
            this.seiContentMode = i;
        }
    }

    public static class MixedStreamServerControlConfig {
        public boolean enableTalkVolumeLevels;
        public boolean enableVolumeIndication;
        public boolean isAddVolumeValue;
        public int talkVolume;
        public float volumeIndicationInterval = 2.0f;
        public int[] talkVolumeLevels = {0, 20};
        public MixedStreamSEIContentMode seiContentMode = MixedStreamSEIContentMode.MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT;
        public int seiPayloadType = 100;
        public String seiPayloadUuid = "";
        public MixedStreamASRTaskMode asrTaskMode = MixedStreamASRTaskMode.MIXED_STREAM_ASR_TASK_MODE_DEFAULT;

        public MixedStreamASRTaskMode getAsrTaskMode() {
            return this.asrTaskMode;
        }

        public boolean getEnableVolumeIndication() {
            return this.enableVolumeIndication;
        }

        public boolean getIsAddVolumeValue() {
            return this.isAddVolumeValue;
        }

        public MixedStreamSEIContentMode getSeiContentMode() {
            return this.seiContentMode;
        }

        public int getSeiPayloadType() {
            return this.seiPayloadType;
        }

        public String getSeiPayloadUuid() {
            return this.seiPayloadUuid;
        }

        public int getTalkVolume() {
            return this.talkVolume;
        }

        public int[] getTalkVolumeLevels() {
            return this.talkVolumeLevels;
        }

        public float getVolumeIndicationInterval() {
            return this.volumeIndicationInterval;
        }

        public boolean isEnableTalkVolumeLevels() {
            return this.enableTalkVolumeLevels;
        }

        public MixedStreamServerControlConfig setAsrTaskMode(MixedStreamASRTaskMode mixedStreamASRTaskMode) {
            this.asrTaskMode = mixedStreamASRTaskMode;
            return this;
        }

        public MixedStreamServerControlConfig setEnableTalkVolumeLevels(boolean z) {
            this.enableTalkVolumeLevels = z;
            return this;
        }

        public MixedStreamServerControlConfig setEnableVolumeIndication(boolean z) {
            this.enableVolumeIndication = z;
            return this;
        }

        public MixedStreamServerControlConfig setIsAddVolumeValue(boolean z) {
            this.isAddVolumeValue = z;
            return this;
        }

        public MixedStreamServerControlConfig setSeiContentMode(MixedStreamSEIContentMode mixedStreamSEIContentMode) {
            this.seiContentMode = mixedStreamSEIContentMode;
            return this;
        }

        public MixedStreamServerControlConfig setSeiPayloadType(int i) {
            this.seiPayloadType = i;
            return this;
        }

        public MixedStreamServerControlConfig setSeiPayloadUuid(String str) {
            this.seiPayloadUuid = str;
            return this;
        }

        public MixedStreamServerControlConfig setTalkVolume(int i) {
            this.talkVolume = i;
            return this;
        }

        public MixedStreamServerControlConfig setTalkVolumeLevels(int[] iArr) {
            this.talkVolumeLevels = iArr;
            return this;
        }

        public MixedStreamServerControlConfig setVolumeIndicationInterval(float f) {
            this.volumeIndicationInterval = f;
            return this;
        }
    }

    public static class MixedStreamSpatialConfig {
        public boolean enableSpatialRender;
        public Position audienceSpatialPosition = new Position();
        public HumanOrientation audienceSpatialOrientation = new HumanOrientation();

        public HumanOrientation getAudienceSpatialOrientation() {
            return this.audienceSpatialOrientation;
        }

        public Position getAudienceSpatialPosition() {
            return this.audienceSpatialPosition;
        }

        public boolean getEnableSpatialRender() {
            return this.enableSpatialRender;
        }

        public MixedStreamSpatialConfig setAudienceSpatialOrientation(HumanOrientation humanOrientation) {
            this.audienceSpatialOrientation = humanOrientation;
            return this;
        }

        public MixedStreamSpatialConfig setAudienceSpatialPosition(Position position) {
            this.audienceSpatialPosition = position;
            return this;
        }

        public MixedStreamSpatialConfig setEnableSpatialRender(boolean z) {
            this.enableSpatialRender = z;
            return this;
        }

        public MixedStreamSpatialConfig setAudienceSpatialPosition(float f, float f2, float f3) {
            Position position = this.audienceSpatialPosition;
            position.x = f;
            position.y = f2;
            position.z = f3;
            return this;
        }
    }

    public static class MixedStreamSyncControlConfig {
        public MixedStreamSyncStrategy syncStrategy = MixedStreamSyncStrategy.MIXED_STREAM_SYNC_STRATEGY_NO_SYNC;
        public int maxCacheTimeMs = 2000;
        public boolean videoNeedSdkMix = true;
        public String baseUserID = "";

        public String getBaseUserID() {
            return this.baseUserID;
        }

        public int getMaxCacheTimeMs() {
            return this.maxCacheTimeMs;
        }

        public MixedStreamSyncStrategy getSyncStrategy() {
            return this.syncStrategy;
        }

        public boolean getVideoNeedSdkMix() {
            return this.videoNeedSdkMix;
        }

        public MixedStreamSyncControlConfig setBaseUserID(String str) {
            this.baseUserID = str;
            return this;
        }

        public MixedStreamSyncControlConfig setMaxCacheTimeMs(int i) {
            this.maxCacheTimeMs = i;
            return this;
        }

        public MixedStreamSyncControlConfig setSyncStrategy(MixedStreamSyncStrategy mixedStreamSyncStrategy) {
            this.syncStrategy = mixedStreamSyncStrategy;
            return this;
        }

        public MixedStreamSyncControlConfig setVideoNeedSdkMix(boolean z) {
            this.videoNeedSdkMix = z;
            return this;
        }
    }

    public enum MixedStreamSyncStrategy {
        MIXED_STREAM_SYNC_STRATEGY_NO_SYNC(0),
        MIXED_STREAM_SYNC_STRATEGY_AUDIO_PRECISE_SYNC(1),
        MIXED_STREAM_SYNC_STRATEGY_SIMPLEX_MODE_SYNC(2);

        public int syncStrategy;

        public int getValue() {
            return this.syncStrategy;
        }

        public static MixedStreamSyncStrategy valueOf(String str) {
            return (MixedStreamSyncStrategy) C08FF.LIZ(MixedStreamSyncStrategy.class, str);
        }

        MixedStreamSyncStrategy(int i) {
            this.syncStrategy = i;
        }
    }

    public static class SourceCropInfo {
        public float heightProportion;
        public float locationX;
        public float locationY;
        public float widthProportion;

        public float getHeightProportion() {
            return this.heightProportion;
        }

        public float getLocationX() {
            return this.locationX;
        }

        public float getLocationY() {
            return this.locationY;
        }

        public float getWidthProportion() {
            return this.widthProportion;
        }

        public SourceCropInfo setHeightProportion(float f) {
            this.heightProportion = f;
            return this;
        }

        public SourceCropInfo setLocationX(float f) {
            this.locationX = f;
            return this;
        }

        public SourceCropInfo setLocationY(float f) {
            this.locationY = f;
            return this;
        }

        public SourceCropInfo setWidthProportion(float f) {
            this.widthProportion = f;
            return this;
        }
    }

    public JSONObject getAdvancedConfig() {
        return this.advancedConfig;
    }

    public MixedStreamAudioConfig getAudioConfig() {
        return this.audioConfig;
    }

    public JSONObject getAuthInfo() {
        return this.authInfo;
    }

    public MixedStreamClientMixConfig getClientMixConfig() {
        return this.clientMixConfig;
    }

    public ByteRTCStreamMixingType getExpectedMixingType() {
        return this.expectedMixingType;
    }

    public List<MixedStreamFeatureConfig> getFeatureConfigs() {
        return this.featureConfigs;
    }

    public MixedStreamLayoutConfig getLayout() {
        return this.layout;
    }

    public ByteRTCLowLatencyParams getLowLatencyParams() {
        return this.lowLatencyParams;
    }

    public String getPushURL() {
        return this.pushURL;
    }

    public String getRoomID() {
        return this.roomID;
    }

    public MixedStreamServerControlConfig getServerControlConfig() {
        return this.serverControlConfig;
    }

    public MixedStreamSpatialConfig getSpatialConfig() {
        return this.spatialConfig;
    }

    public MixedStreamSyncControlConfig getSyncControlConfig() {
        return this.syncControlConfig;
    }

    public String getUserID() {
        return this.userID;
    }

    public MixedStreamVideoConfig getVideoConfig() {
        return this.videoConfig;
    }

    public boolean isDisableCdnForward() {
        return this.disableCdnForward;
    }

    public MixedStreamEffectDescription[] getMixedStreamEffectDescription(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return null;
        }
        return mixedStreamLayoutRegionConfig.effectDescription;
    }

    public String getMixedStreamEffectParamColor(MixedStreamEffectDescription mixedStreamEffectDescription) {
        MixedStreamEffectParam mixedStreamEffectParam;
        if (mixedStreamEffectDescription == null || (mixedStreamEffectParam = mixedStreamEffectDescription.effectParam) == null) {
            return "";
        }
        return mixedStreamEffectParam.color;
    }

    public int getMixedStreamEffectParamThickness(MixedStreamEffectDescription mixedStreamEffectDescription) {
        MixedStreamEffectParam mixedStreamEffectParam;
        if (mixedStreamEffectDescription == null || (mixedStreamEffectParam = mixedStreamEffectDescription.effectParam) == null) {
            return 0;
        }
        return mixedStreamEffectParam.thickness;
    }

    public int getMixedStreamEffectType(MixedStreamEffectDescription mixedStreamEffectDescription) {
        MixedStreamEffectType mixedStreamEffectType;
        if (mixedStreamEffectDescription == null) {
            mixedStreamEffectType = MixedStreamEffectType.MIXED_STREAM_EFFECT_TYPE_NONE;
        } else {
            mixedStreamEffectType = mixedStreamEffectDescription.effectType;
        }
        return mixedStreamEffectType.getValue();
    }

    public double getMixedStreamLayoutRegionAlpha(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0d;
        }
        return mixedStreamLayoutRegionConfig.alpha;
    }

    public int getMixedStreamLayoutRegionAlternateImageFillMode(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.alternateImageFillMode.getValue();
    }

    public int getMixedStreamLayoutRegionAlternateImageProcess(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.alternateImageProcess.getValue();
    }

    public int getMixedStreamLayoutRegionAlternateImageProcessConfigBlur(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 80;
        }
        return mixedStreamLayoutRegionConfig.alternateImageProcessConfig.blur;
    }

    public float getMixedStreamLayoutRegionAlternateImageProcessConfigBrightness(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.alternateImageProcessConfig.brightness;
    }

    public int getMixedStreamLayoutRegionAlternateImageProcessValue(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.alternateImageProcessValue;
    }

    public String getMixedStreamLayoutRegionAlternateImageUrl(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return "";
        }
        return mixedStreamLayoutRegionConfig.alternateImageUrl;
    }

    public boolean getMixedStreamLayoutRegionApplySpatialAudio(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return true;
        }
        return mixedStreamLayoutRegionConfig.applySpatialAudio;
    }

    public boolean getMixedStreamLayoutRegionApplySpatialReverb(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return true;
        }
        return mixedStreamLayoutRegionConfig.applySpatialReverb;
    }

    public int getMixedStreamLayoutRegionContentType(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.regionContentType.getValue();
    }

    public double getMixedStreamLayoutRegionCornerRadius(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0d;
        }
        return mixedStreamLayoutRegionConfig.cornerRadius;
    }

    public byte[] getMixedStreamLayoutRegionData(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return null;
        }
        return mixedStreamLayoutRegionConfig.imageWaterMark;
    }

    public int getMixedStreamLayoutRegionDataParamImageHeight(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.imageWaterMarkConfig.imageHeight;
    }

    public int getMixedStreamLayoutRegionDataParamImageWidth(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.imageWaterMarkConfig.imageWidth;
    }

    public double getMixedStreamLayoutRegionH(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0d;
        }
        return mixedStreamLayoutRegionConfig.heightProportion;
    }

    public boolean getMixedStreamLayoutRegionLocalUser(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return false;
        }
        return mixedStreamLayoutRegionConfig.isLocalUser;
    }

    public int getMixedStreamLayoutRegionMediaType(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.mediaType.getValue();
    }

    public int getMixedStreamLayoutRegionRenderMode(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.renderMode.getValue();
    }

    public String getMixedStreamLayoutRegionRoomID(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        String str;
        if (mixedStreamLayoutRegionConfig == null || (str = mixedStreamLayoutRegionConfig.roomID) == null) {
            return "";
        }
        return str;
    }

    public float getMixedStreamLayoutRegionSourceCropHeightProportion(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.sourceCropInfo.heightProportion;
    }

    public float getMixedStreamLayoutRegionSourceCropLocationX(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.sourceCropInfo.locationX;
    }

    public float getMixedStreamLayoutRegionSourceCropLocationY(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.sourceCropInfo.locationY;
    }

    public float getMixedStreamLayoutRegionSourceCropWidthProportion(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.sourceCropInfo.widthProportion;
    }

    public float getMixedStreamLayoutRegionSpatialPositionX(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.spatialPosition.x;
    }

    public float getMixedStreamLayoutRegionSpatialPositionY(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.spatialPosition.y;
    }

    public float getMixedStreamLayoutRegionSpatialPositionZ(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.spatialPosition.z;
    }

    public int getMixedStreamLayoutRegionStreamIndex(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.streamIndex.value();
    }

    public String getMixedStreamLayoutRegionUserID(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        String str;
        if (mixedStreamLayoutRegionConfig == null || (str = mixedStreamLayoutRegionConfig.userID) == null) {
            return "";
        }
        return str;
    }

    public double getMixedStreamLayoutRegionW(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0d;
        }
        return mixedStreamLayoutRegionConfig.widthProportion;
    }

    public int getMixedStreamLayoutRegionWinID(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.winID;
    }

    public double getMixedStreamLayoutRegionX(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0d;
        }
        return mixedStreamLayoutRegionConfig.locationX;
    }

    public double getMixedStreamLayoutRegionY(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0d;
        }
        return mixedStreamLayoutRegionConfig.locationY;
    }

    public int getMixedStreamLayoutRegionZOrder(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.zOrder;
    }

    public MixedStreamConfig setAdvancedConfig(JSONObject jSONObject) {
        this.advancedConfig = jSONObject;
        return this;
    }

    public MixedStreamConfig setAudioConfig(MixedStreamAudioConfig mixedStreamAudioConfig) {
        this.audioConfig = mixedStreamAudioConfig;
        return this;
    }

    public MixedStreamConfig setAuthInfo(JSONObject jSONObject) {
        this.authInfo = jSONObject;
        return this;
    }

    public MixedStreamConfig setClientMixConfig(MixedStreamClientMixConfig mixedStreamClientMixConfig) {
        this.clientMixConfig = mixedStreamClientMixConfig;
        return this;
    }

    public MixedStreamConfig setDisableCdnForward(boolean z) {
        this.disableCdnForward = z;
        return this;
    }

    public MixedStreamConfig setExpectedMixingType(ByteRTCStreamMixingType byteRTCStreamMixingType) {
        this.expectedMixingType = byteRTCStreamMixingType;
        return this;
    }

    public void setFeatureConfigs(List<MixedStreamFeatureConfig> list) {
        this.featureConfigs = list;
    }

    public MixedStreamConfig setLayout(MixedStreamLayoutConfig mixedStreamLayoutConfig) {
        this.layout = mixedStreamLayoutConfig;
        return this;
    }

    public void setLowLatencyParams(ByteRTCLowLatencyParams byteRTCLowLatencyParams) {
        this.lowLatencyParams = byteRTCLowLatencyParams;
    }

    public MixedStreamConfig setOrientation(String str) {
        this.orientation = str;
        return this;
    }

    public MixedStreamConfig setPushURL(String str) {
        this.pushURL = str;
        return this;
    }

    public MixedStreamConfig setRoomID(String str) {
        this.roomID = str;
        return this;
    }

    public MixedStreamConfig setServerControlConfig(MixedStreamServerControlConfig mixedStreamServerControlConfig) {
        this.serverControlConfig = mixedStreamServerControlConfig;
        return this;
    }

    public MixedStreamConfig setSpatialConfig(MixedStreamSpatialConfig mixedStreamSpatialConfig) {
        this.spatialConfig = mixedStreamSpatialConfig;
        return this;
    }

    public MixedStreamConfig setSyncControlConfig(MixedStreamSyncControlConfig mixedStreamSyncControlConfig) {
        this.syncControlConfig = mixedStreamSyncControlConfig;
        return this;
    }

    public MixedStreamConfig setUserID(String str) {
        this.userID = str;
        return this;
    }

    public MixedStreamConfig setVideoConfig(MixedStreamVideoConfig mixedStreamVideoConfig) {
        this.videoConfig = mixedStreamVideoConfig;
        return this;
    }
}
