package com.ss.android.vesdk;

import X.C08FF;
import X.C1285070jXt;
import X.C1339250kxH;
import X.C1466660oGm;
import X.C1864730ycp;
import X.C2188811AlT;
import X.C2484209oO;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoHWEncodeSettings;
import com.ss.android.vesdk.settings.VideoInvisibleWatermarkSettings;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class VEVideoEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoEncodeSettings> CREATOR = new C1864730ycp(23);
    public int HwBps;
    public boolean banExtraDataLoop;
    public ENCODE_BITRATE_MODE bitrateMode;
    public int bps;
    public COMPILE_TYPE compileType;
    public int downloadNetworkSpeed;
    public boolean enableAvInterLeave;
    public boolean enableByteVCRemuxVideo;
    public boolean enableCloudProcessWithMusic;
    public boolean enableCopyWithMetadata;
    public boolean enableHdr10BitEncode;
    public boolean enableHwBufferEncode;
    public boolean enableInterLeave;
    public boolean enablePseudoLandscape;
    public boolean enableRemuxVideo;
    public int enableRemuxVideoBitrate;
    public int enableRemuxVideoFPS;
    public boolean enableRemuxVideoForRotation;
    public boolean enableRemuxVideoForShoot;
    public int enableRemuxVideoRes;
    public boolean enableUploadDirectly;
    public boolean enableVideoAndAudioRemux;
    public boolean enableVqscore;
    public int encodeProfile;
    public int encodeStandard;
    public String externalSettingsJsonStr;
    public int fps;
    public int frameRate;
    public double fullHdBitrateRatio;
    public int gopSize;
    public boolean hasBFrame;
    public double hevcBitrateRatio;
    public double highFpsBitrateRatio;
    public double hpBitrateRatio;
    public int hwEncodeQpMax;
    public int hwEncodeQpMin;
    public int iFrameInterval;
    public boolean ignoreJsonBitrate;
    public float image_compile_quality;
    public boolean isSupportHWEncoder;
    public int keyFrameDuration;
    public double m2kBitrateRatio;
    public double m4kBitrateRatio;
    public String mComment;
    public boolean mCompileSoftInfo;
    public String mDescription;
    public boolean mEnableInvisibleWatermark;
    public VEVideoEncodeFitMode mFitMode;
    public double mHdr_bitrate_ratio;
    public int[] mKeyFramePoints;
    public VEVideoEncodeMirrorMode mMirrorMode;
    public boolean mOptRemuxWithCopy;
    public boolean mReEncodeOpt;
    public boolean mRecordingMp4;
    public int mResolutionAlign;
    public int mTransitionFrameCount;
    public int mTransitionKeyFrameMode;
    public int mTransitionKeyFrameVersion;
    public boolean mTransitionKeyframeEnable;
    public VEVideoCompileEncodeSettings mVideoCompileEncodeSetting;
    public VideoInvisibleWatermarkSettings mVideoInvisibleWatermarkSettings;
    public int mVideoTrc;
    public VEVideoCompileEncodeSettings mVideoWatermarkCompileEncodeSetting;
    public VEWatermarkParam mWatermarkParam;
    public int maxCacheDuration;
    public int mvStillFramesPublishFps;
    public int mvStillFramesWatermarkFps;
    public VESize outputSize;
    public int publishFps;
    public int resizeMode;
    public float resizeX;
    public float resizeY;
    public int rotate;
    public double sdBitrateRatio;
    public float speed;
    public double swByteVC1Crf;
    public double swByteVC1HdrCrf;
    public int swByteVC1Preset;
    public int swCRF;
    public double swFHDCrfRatio;
    public double swHFpsOffset;
    public int swMaxQp;
    public long swMaxrate;
    public int swMinQp;
    public int swPreset;
    public int swQP;
    public double swQPOffset;
    public double swSDCrfRatio;
    public int swThreadCount;
    public float templateScore;
    public double transitionBitrateRatio;
    public boolean uploadingWithSynthesisCancelWritefile;
    public boolean useSoftwareDecode;
    public String vqscoreModelPath;
    public VESize watermarkSize;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void initFromVEConfigCenter() {
        /*
            r4 = this;
            boolean r0 = r4.enableHwBufferEncode
            if (r0 != 0) goto L15
            com.ss.android.vesdk.VEConfigCenter r2 = com.ss.android.vesdk.VEConfigCenter.getInstance()
            java.lang.String r0 = "ve_enable_compile_buffer_hw_encode"
            r1 = 0
            java.lang.Boolean r0 = r2.getValue(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L16
        L15:
            r1 = 1
        L16:
            r4.enableHwBufferEncode = r1
            com.ss.android.vesdk.VEConfigCenter r3 = com.ss.android.vesdk.VEConfigCenter.getInstance()
            com.ss.android.vesdk.VEConfigCenter$DataType r2 = com.ss.android.vesdk.VEConfigCenter.DataType.INTEGER
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "remux_video_res"
            com.ss.android.vesdk.VEConfigCenter$ValuePkt r1 = r3.getValue(r0, r2, r1)
            java.lang.String r3 = "VEVideoEncodeSettings"
            if (r1 == 0) goto L70
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L70
            java.lang.Object r0 = r1.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r2 = r0.intValue()
            r4.enableRemuxVideoRes = r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "remuxVideoRes = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C2484209oO.LJI(r3, r0)
        L5a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "KEY_ENABLE_BUFFER_HW_COMPILE: "
            r1.append(r0)
            boolean r0 = r4.enableHwBufferEncode
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C2484209oO.LJI(r3, r0)
            return
        L70:
            java.lang.String r0 = "No remux video resolution config"
            X.C2484209oO.LJI(r3, r0)
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEVideoEncodeSettings.initFromVEConfigCenter():void");
    }

    public int getBitrateValue() {
        int i = C1285070jXt.LIZ[this.bitrateMode.ordinal()];
        if (i == 1) {
            return getBps();
        }
        if (i == 2) {
            return getSwCRF();
        }
        if (i == 3) {
            return getSwQP();
        }
        if (i == 4) {
            return getBps();
        }
        throw new IllegalStateException("CompileTime BUG by SDK. Unhandled ENCODE_BITRATE_MODE enum value.");
    }

    public Float getImageCompileQuality() {
        return Float.valueOf(this.image_compile_quality);
    }

    public VEVideoEncodeSettings() {
        this.mFitMode = VEVideoEncodeFitMode.CENTER_CROP;
        this.mMirrorMode = VEVideoEncodeMirrorMode.NO_MIRROR;
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.ignoreJsonBitrate = false;
        this.HwBps = -1;
        this.useSoftwareDecode = false;
        this.frameRate = 30;
        this.iFrameInterval = 1;
        this.swCRF = 19;
        this.swQPOffset = -1.0d;
        this.swHFpsOffset = 1.0d;
        this.swByteVC1HdrCrf = 21.0d;
        this.swByteVC1Crf = 22.0d;
        this.swSDCrfRatio = 1.0d;
        this.swFHDCrfRatio = 1.0d;
        this.swThreadCount = 6;
        this.swMinQp = 15;
        this.swMaxQp = 39;
        this.swQP = 15;
        this.fps = -1;
        this.publishFps = -1;
        this.mvStillFramesPublishFps = -1;
        this.mvStillFramesWatermarkFps = -1;
        this.gopSize = 60;
        this.hwEncodeQpMin = -1;
        this.hwEncodeQpMax = -1;
        this.keyFrameDuration = -1;
        this.maxCacheDuration = -1;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.swByteVC1Preset = -1;
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000L;
        this.enableRemuxVideoRes = -1;
        this.enableRemuxVideoFPS = -1;
        this.enableRemuxVideoBitrate = -1;
        this.uploadingWithSynthesisCancelWritefile = false;
        this.enableCopyWithMetadata = false;
        this.enableUploadDirectly = false;
        this.downloadNetworkSpeed = -1;
        this.enablePseudoLandscape = false;
        this.templateScore = 0.0f;
        this.enableCloudProcessWithMusic = false;
        this.enableVideoAndAudioRemux = false;
        this.mVideoTrc = -1;
        this.hasBFrame = false;
        this.mEnableInvisibleWatermark = false;
        this.mVideoInvisibleWatermarkSettings = null;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mTransitionKeyFrameVersion = -1;
        this.mTransitionFrameCount = 1;
        this.mTransitionKeyFrameMode = 0;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = true;
        this.image_compile_quality = 100.0f;
        this.enableVqscore = false;
        this.mHdr_bitrate_ratio = 1.0d;
        this.hpBitrateRatio = 0.75d;
        this.fullHdBitrateRatio = 1.0d;
        this.sdBitrateRatio = 1.0d;
        this.highFpsBitrateRatio = 1.0d;
        this.hevcBitrateRatio = 1.0d;
        this.transitionBitrateRatio = 1.0d;
        this.m2kBitrateRatio = 1.0d;
        this.m4kBitrateRatio = 1.0d;
        VESize vESize = this.outputSize;
        vESize.width = 576;
        vESize.height = 1024;
        VESize vESize2 = this.watermarkSize;
        vESize2.width = -1;
        vESize2.height = -1;
        this.fps = -1;
        this.bps = 4194304;
        this.isSupportHWEncoder = true;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    public boolean isSupportHwEnc() {
        if (VEConfigCenter.getInstance().getValue("ve_enable_titan_sw_encode", false).booleanValue()) {
            return false;
        }
        return this.isSupportHWEncoder;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEVideoEncodeSettings{compileType=");
        sbLIZ.append(this.compileType);
        sbLIZ.append(", rotate=");
        sbLIZ.append(this.rotate);
        sbLIZ.append(", resizeMode=");
        sbLIZ.append(this.resizeMode);
        sbLIZ.append(", resizeX=");
        sbLIZ.append(this.resizeX);
        sbLIZ.append(", resizeY=");
        sbLIZ.append(this.resizeY);
        sbLIZ.append(", speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(", outputSize=");
        sbLIZ.append(this.outputSize);
        sbLIZ.append(", watermarkSize=");
        sbLIZ.append(this.watermarkSize);
        sbLIZ.append(", bitrateMode=");
        sbLIZ.append(this.bitrateMode);
        sbLIZ.append(", bps=");
        sbLIZ.append(this.bps);
        sbLIZ.append(", swCRF=");
        sbLIZ.append(this.swCRF);
        sbLIZ.append(", swQPOffset=");
        sbLIZ.append(this.swQPOffset);
        sbLIZ.append(", swHFpsOffset=");
        sbLIZ.append(this.swHFpsOffset);
        sbLIZ.append(", swByteVC1Crf=");
        sbLIZ.append(this.swByteVC1Crf);
        sbLIZ.append(", swSDCrfRatio=");
        sbLIZ.append(this.swSDCrfRatio);
        sbLIZ.append(", swFHDCrfRatio=");
        sbLIZ.append(this.swFHDCrfRatio);
        sbLIZ.append(", swThreadCount=");
        sbLIZ.append(this.swThreadCount);
        sbLIZ.append(", swMinQp=");
        sbLIZ.append(this.swMinQp);
        sbLIZ.append(", swMaxQp=");
        sbLIZ.append(this.swMaxQp);
        sbLIZ.append(", swQP=");
        sbLIZ.append(this.swQP);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.fps);
        sbLIZ.append(", publishFps=");
        sbLIZ.append(this.publishFps);
        sbLIZ.append(", mvStillFramesPublishFps=");
        sbLIZ.append(this.mvStillFramesPublishFps);
        sbLIZ.append(", mvStillFramesWatermarkFps=");
        sbLIZ.append(this.mvStillFramesWatermarkFps);
        sbLIZ.append(", gopSize=");
        sbLIZ.append(this.gopSize);
        sbLIZ.append(", swPreset=");
        sbLIZ.append(this.swPreset);
        sbLIZ.append(", swByteVC1Preset=");
        sbLIZ.append(this.swByteVC1Preset);
        sbLIZ.append(", encodeStandard=");
        sbLIZ.append(this.encodeStandard);
        sbLIZ.append(", encodeProfile=");
        sbLIZ.append(this.encodeProfile);
        sbLIZ.append(", swMaxrate=");
        sbLIZ.append(this.swMaxrate);
        sbLIZ.append(", isSupportHWEncoder=");
        sbLIZ.append(this.isSupportHWEncoder);
        sbLIZ.append(", enableHwBufferEncode=");
        sbLIZ.append(this.enableHwBufferEncode);
        sbLIZ.append(", enableRemuxVideo=");
        sbLIZ.append(this.enableRemuxVideo);
        sbLIZ.append(", enableRemuxVideoForRotation=");
        sbLIZ.append(this.enableRemuxVideoForRotation);
        sbLIZ.append(", enableRemuxVideoForShoot=");
        sbLIZ.append(this.enableRemuxVideoForShoot);
        sbLIZ.append(", enableByteVCRemuxVideo=");
        sbLIZ.append(this.enableByteVCRemuxVideo);
        sbLIZ.append(", enableInterLeave=");
        sbLIZ.append(this.enableInterLeave);
        sbLIZ.append(", enableAvInterLeave=");
        sbLIZ.append(this.enableAvInterLeave);
        sbLIZ.append(", enableHdr10BitEncode=");
        sbLIZ.append(this.enableHdr10BitEncode);
        sbLIZ.append(", hasBFrame=");
        sbLIZ.append(this.hasBFrame);
        sbLIZ.append(", mWatermarkParam=");
        sbLIZ.append(this.mWatermarkParam);
        sbLIZ.append(", mVideoWatermarkCompileEncodeSetting=");
        sbLIZ.append(this.mVideoWatermarkCompileEncodeSetting);
        sbLIZ.append(", mEnableInvisibleWatermark=");
        sbLIZ.append(this.mEnableInvisibleWatermark);
        sbLIZ.append(", mVideoInvisibleWatermarkSettings=");
        sbLIZ.append(this.mVideoInvisibleWatermarkSettings);
        sbLIZ.append(", mVideoCompileEncodeSetting=");
        sbLIZ.append(this.mVideoCompileEncodeSetting);
        sbLIZ.append(", mOptRemuxWithCopy=");
        sbLIZ.append(this.mOptRemuxWithCopy);
        sbLIZ.append(", mReEncodeOpt=");
        sbLIZ.append(this.mReEncodeOpt);
        sbLIZ.append(", mDescripiton=");
        sbLIZ.append(this.mDescription);
        sbLIZ.append(", mComment=");
        sbLIZ.append(this.mComment);
        sbLIZ.append(", mFitMode=");
        sbLIZ.append(this.mFitMode);
        sbLIZ.append(", videoTrc=");
        sbLIZ.append(this.mVideoTrc);
        sbLIZ.append(", mHdr_bitrate_ratio=");
        sbLIZ.append(this.mHdr_bitrate_ratio);
        sbLIZ.append(", hpBitrateRatio=");
        sbLIZ.append(this.hpBitrateRatio);
        sbLIZ.append(", fullHdBitrateRatio=");
        sbLIZ.append(this.fullHdBitrateRatio);
        sbLIZ.append(", sdBitrateRatio=");
        sbLIZ.append(this.sdBitrateRatio);
        sbLIZ.append(", highFpsBitrateRatio=");
        sbLIZ.append(this.highFpsBitrateRatio);
        sbLIZ.append(", hevcBitrateRatio=");
        sbLIZ.append(this.hevcBitrateRatio);
        sbLIZ.append(", transitionBitrateRatio=");
        sbLIZ.append(this.transitionBitrateRatio);
        sbLIZ.append(", m2kBitrateRatio=");
        sbLIZ.append(this.m2kBitrateRatio);
        sbLIZ.append(", m4kBitrateRatio=");
        sbLIZ.append(this.m4kBitrateRatio);
        sbLIZ.append(", mTransitionKeyframeEnable=");
        sbLIZ.append(this.mTransitionKeyframeEnable);
        sbLIZ.append(", mTransitionKeyFrameVersion=");
        sbLIZ.append(this.mTransitionKeyFrameVersion);
        sbLIZ.append(", mTransitionFrameCount=");
        sbLIZ.append(this.mTransitionFrameCount);
        sbLIZ.append(", mTransitionKeyFrameMode=");
        sbLIZ.append(this.mTransitionKeyFrameMode);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean IsIgnoreJsonBitrate() {
        return this.ignoreJsonBitrate;
    }

    public double get2kBitrateRatio() {
        return this.m2kBitrateRatio;
    }

    public double get4kBitrateRatio() {
        return this.m4kBitrateRatio;
    }

    public ENCODE_BITRATE_MODE getBitrateMode() {
        return this.bitrateMode;
    }

    public int getBps() {
        return this.bps;
    }

    public String getComment() {
        return this.mComment;
    }

    public COMPILE_TYPE getCompileType() {
        return this.compileType;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public int getDownloadNetworkSpeed() {
        return this.downloadNetworkSpeed;
    }

    public boolean getEnableCloudProcessWithMusic() {
        return this.enableCloudProcessWithMusic;
    }

    public boolean getEnableCopyWithMetadata() {
        return this.enableCopyWithMetadata;
    }

    public boolean getEnableInvisibleWatermark() {
        return this.mEnableInvisibleWatermark;
    }

    public boolean getEnablePseudoLandscape() {
        return this.enablePseudoLandscape;
    }

    public int getEnableRemuxVideoBitrate() {
        return this.enableRemuxVideoBitrate;
    }

    public int getEnableRemuxVideoRes() {
        return this.enableRemuxVideoRes;
    }

    public boolean getEnableUploadDirectly() {
        return this.enableUploadDirectly;
    }

    public boolean getEnableVideoAndAudioRemux() {
        return this.enableVideoAndAudioRemux;
    }

    public boolean getEnableVqscore() {
        return this.enableVqscore;
    }

    public int getEncodeProfile() {
        return this.encodeProfile;
    }

    public int getEncodeStandard() {
        return this.encodeStandard;
    }

    public String getExternalSettingsJsonStr() {
        return this.externalSettingsJsonStr;
    }

    public VEVideoEncodeFitMode getFitMode() {
        return this.mFitMode;
    }

    public int getFps() {
        return this.fps;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public double getFullHdBitrateRatio() {
        return this.fullHdBitrateRatio;
    }

    public int getGopSize() {
        return this.gopSize;
    }

    public double getHdrBitrateRatio() {
        return this.mHdr_bitrate_ratio;
    }

    public double getHevcBitrateRatio() {
        return this.hevcBitrateRatio;
    }

    public double getHighFpsBitrateRatio() {
        return this.highFpsBitrateRatio;
    }

    public double getHpBitrateRatio() {
        return this.hpBitrateRatio;
    }

    public int getHwBps() {
        return this.HwBps;
    }

    public int getIFrameInterval() {
        return this.iFrameInterval;
    }

    public int getKeyFrameDuration() {
        return this.keyFrameDuration;
    }

    public int[] getKeyFramePoints() {
        return this.mKeyFramePoints;
    }

    public int getMVStillFramesPublishFps() {
        return this.mvStillFramesPublishFps;
    }

    public int getMVStillFramesWatermarkFps() {
        return this.mvStillFramesWatermarkFps;
    }

    public int getMaxCacheDuration() {
        return this.maxCacheDuration;
    }

    public VEVideoEncodeMirrorMode getMirrorMode() {
        return this.mMirrorMode;
    }

    public int getPublishFps() {
        return this.publishFps;
    }

    public int getResizeMode() {
        return this.resizeMode;
    }

    public float getResizeX() {
        return this.resizeX;
    }

    public float getResizeY() {
        return this.resizeY;
    }

    public int getResolutionAlignment() {
        return this.mResolutionAlign;
    }

    public int getRotate() {
        return this.rotate;
    }

    public double getSdBitrateRatio() {
        return this.sdBitrateRatio;
    }

    public float getSpeed() {
        return this.speed;
    }

    public int getSwCRF() {
        return this.swCRF;
    }

    public int getSwMaxQp() {
        return this.swMaxQp;
    }

    public long getSwMaxRate() {
        return this.swMaxrate;
    }

    public int getSwMinQp() {
        return this.swMinQp;
    }

    public int getSwPreset() {
        return this.swPreset;
    }

    public int getSwQP() {
        return this.swQP;
    }

    public float getTemplateScore() {
        return this.templateScore;
    }

    public double getTransitionBitrateRatio() {
        return this.transitionBitrateRatio;
    }

    public int getTransitionFrameCount() {
        return this.mTransitionFrameCount;
    }

    public int getTransitionKeyFrameMode() {
        return this.mTransitionKeyFrameMode;
    }

    public int getTransitionKeyFrameVersion() {
        return this.mTransitionKeyFrameVersion;
    }

    public boolean getTransitionKeyframeEnable() {
        return this.mTransitionKeyframeEnable;
    }

    public boolean getUploadingWithSynthesisCancelWritefile() {
        return this.uploadingWithSynthesisCancelWritefile;
    }

    public boolean getUseSoftwareDecode() {
        return this.useSoftwareDecode;
    }

    public VEVideoCompileEncodeSettings getVideoCompileEncodeSetting() {
        return this.mVideoCompileEncodeSetting;
    }

    public VideoInvisibleWatermarkSettings getVideoInvisibleWatermarkSettings() {
        return this.mVideoInvisibleWatermarkSettings;
    }

    public VESize getVideoRes() {
        return this.outputSize;
    }

    public int getVideoTrc() {
        return this.mVideoTrc;
    }

    public String getVqscoreModelPath() {
        return this.vqscoreModelPath;
    }

    public VEVideoCompileEncodeSettings getWatermarkCompileEncodeSetting() {
        return this.mVideoWatermarkCompileEncodeSetting;
    }

    public VEWatermarkParam getWatermarkParam() {
        return this.mWatermarkParam;
    }

    public VESize getWatermarkVideoRes() {
        return this.watermarkSize;
    }

    public boolean isBanExtraDataLoop() {
        return this.banExtraDataLoop;
    }

    public boolean isCompileSoftInfo() {
        return this.mCompileSoftInfo;
    }

    public boolean isEnableAvInterLeave() {
        return this.enableAvInterLeave;
    }

    public boolean isEnableByteVCRemuxVideo() {
        return this.enableByteVCRemuxVideo;
    }

    public boolean isEnableHdr10BitEncode() {
        return this.enableHdr10BitEncode;
    }

    public boolean isEnableHwBufferEncode() {
        return this.enableHwBufferEncode;
    }

    public boolean isEnableInterLeave() {
        return this.enableInterLeave;
    }

    public boolean isEnableRemuxVideo() {
        return this.enableRemuxVideo;
    }

    public boolean isEnableRemuxVideoForRotation() {
        return this.enableRemuxVideoForRotation;
    }

    public boolean isEnableRemuxVideoForShoot() {
        return this.enableRemuxVideoForShoot;
    }

    public int isEnableRemuxVideoRes() {
        return this.enableRemuxVideoRes;
    }

    public boolean isHasBFrame() {
        return this.hasBFrame;
    }

    public boolean isOptRemuxWithCopy() {
        return this.mOptRemuxWithCopy;
    }

    public boolean isReEncodeOpt() {
        return this.mReEncodeOpt;
    }

    public boolean isRecordingMp4() {
        return this.mRecordingMp4;
    }

    public enum COMPILE_TYPE implements Parcelable {
        COMPILE_TYPE_MP4,
        COMPILE_TYPE_GIF,
        COMPILE_TYPE_HIGH_GIF,
        COMPILE_TYPE_TRANSPARENT_GIF,
        COMPILE_TYPE_JPEG,
        COMPILE_TYPE_PNG,
        COMPILE_TYPE_WEBP;

        public static final Parcelable.Creator<COMPILE_TYPE> CREATOR = new C1864730ycp(18);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static COMPILE_TYPE valueOf(String str) {
            return (COMPILE_TYPE) C08FF.LIZ(COMPILE_TYPE.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public enum ENCODE_BITRATE_MODE implements Parcelable {
        ENCODE_BITRATE_ABR,
        ENCODE_BITRATE_CRF,
        ENCODE_BITRATE_QP,
        ENCODE_BITRATE_VBR;

        public static final ENCODE_BITRATE_MODE[] values = values();
        public static final Parcelable.Creator<ENCODE_BITRATE_MODE> CREATOR = new C1339250kxH(8);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static ENCODE_BITRATE_MODE fromInteger(int i) {
            return values[i];
        }

        public static ENCODE_BITRATE_MODE valueOf(String str) {
            return (ENCODE_BITRATE_MODE) C08FF.LIZ(ENCODE_BITRATE_MODE.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum ENCODE_PRESET implements Parcelable {
        ENCODE_LEVEL_ULTRAFAST,
        ENCODE_LEVEL_SUPERFAST,
        ENCODE_LEVEL_VERYFAST,
        ENCODE_LEVEL_FASTER,
        ENCODE_LEVEL_FAST,
        ENCODE_LEVEL_MEDIUM,
        ENCODE_LEVEL_SLOW,
        ENCODE_LEVEL_SLOWER,
        ENCODE_LEVEL_VERYSLOW,
        ENCODE_LEVEL_PLACEBO;

        public static final Parcelable.Creator<ENCODE_PRESET> CREATOR = new C1466660oGm(13);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static ENCODE_PRESET valueOf(String str) {
            return (ENCODE_PRESET) C08FF.LIZ(ENCODE_PRESET.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum ENCODE_PROFILE implements Parcelable {
        ENCODE_PROFILE_UNKNOWN,
        ENCODE_PROFILE_BASELINE,
        ENCODE_PROFILE_MAIN,
        ENCODE_PROFILE_HIGH;

        public static final Parcelable.Creator<ENCODE_PROFILE> CREATOR = new C1864730ycp(19);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static ENCODE_PROFILE valueOf(String str) {
            return (ENCODE_PROFILE) C08FF.LIZ(ENCODE_PROFILE.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum ENCODE_STANDARD implements Parcelable {
        ENCODE_STANDARD_H264,
        ENCODE_STANDARD_ByteVC1,
        ENCODE_STANDARD_MPEG4;

        public static final Parcelable.Creator<ENCODE_STANDARD> CREATOR = new C1864730ycp(20);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static ENCODE_STANDARD valueOf(String str) {
            return (ENCODE_STANDARD) C08FF.LIZ(ENCODE_STANDARD.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum VEVideoEncodeFitMode implements Parcelable {
        NONE,
        CENTER_INSIDE,
        CENTER_CROP;

        public static final Parcelable.Creator<VEVideoEncodeFitMode> CREATOR = new C1864730ycp(21);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static VEVideoEncodeFitMode valueOf(String str) {
            return (VEVideoEncodeFitMode) C08FF.LIZ(VEVideoEncodeFitMode.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum VEVideoEncodeMirrorMode implements Parcelable {
        NO_MIRROR,
        X_MIRROR,
        Y_MIRROR;

        public static final Parcelable.Creator<VEVideoEncodeMirrorMode> CREATOR = new C1864730ycp(22);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static VEVideoEncodeMirrorMode valueOf(String str) {
            return (VEVideoEncodeMirrorMode) C08FF.LIZ(VEVideoEncodeMirrorMode.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public VEVideoEncodeSettings(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        this.mFitMode = VEVideoEncodeFitMode.CENTER_CROP;
        this.mMirrorMode = VEVideoEncodeMirrorMode.NO_MIRROR;
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.ignoreJsonBitrate = false;
        this.HwBps = -1;
        this.useSoftwareDecode = false;
        this.frameRate = 30;
        this.iFrameInterval = 1;
        this.swCRF = 19;
        this.swQPOffset = -1.0d;
        this.swHFpsOffset = 1.0d;
        this.swByteVC1HdrCrf = 21.0d;
        this.swByteVC1Crf = 22.0d;
        this.swSDCrfRatio = 1.0d;
        this.swFHDCrfRatio = 1.0d;
        this.swThreadCount = 6;
        this.swMinQp = 15;
        this.swMaxQp = 39;
        this.swQP = 15;
        this.fps = -1;
        this.publishFps = -1;
        this.mvStillFramesPublishFps = -1;
        this.mvStillFramesWatermarkFps = -1;
        this.gopSize = 60;
        this.hwEncodeQpMin = -1;
        this.hwEncodeQpMax = -1;
        this.keyFrameDuration = -1;
        this.maxCacheDuration = -1;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.swByteVC1Preset = -1;
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000L;
        this.enableRemuxVideoRes = -1;
        this.enableRemuxVideoFPS = -1;
        this.enableRemuxVideoBitrate = -1;
        this.uploadingWithSynthesisCancelWritefile = false;
        this.enableCopyWithMetadata = false;
        this.enableUploadDirectly = false;
        this.downloadNetworkSpeed = -1;
        this.enablePseudoLandscape = false;
        this.templateScore = 0.0f;
        this.enableCloudProcessWithMusic = false;
        this.enableVideoAndAudioRemux = false;
        this.mVideoTrc = -1;
        this.hasBFrame = false;
        this.mEnableInvisibleWatermark = false;
        this.mVideoInvisibleWatermarkSettings = null;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mTransitionKeyFrameVersion = -1;
        this.mTransitionFrameCount = 1;
        this.mTransitionKeyFrameMode = 0;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = true;
        this.image_compile_quality = 100.0f;
        this.enableVqscore = false;
        this.mHdr_bitrate_ratio = 1.0d;
        this.hpBitrateRatio = 0.75d;
        this.fullHdBitrateRatio = 1.0d;
        this.sdBitrateRatio = 1.0d;
        this.highFpsBitrateRatio = 1.0d;
        this.hevcBitrateRatio = 1.0d;
        this.transitionBitrateRatio = 1.0d;
        this.m2kBitrateRatio = 1.0d;
        this.m4kBitrateRatio = 1.0d;
        this.compileType = (COMPILE_TYPE) parcel.readParcelable(COMPILE_TYPE.class.getClassLoader());
        this.rotate = parcel.readInt();
        this.resizeMode = parcel.readInt();
        this.resizeX = parcel.readFloat();
        this.resizeY = parcel.readFloat();
        this.speed = parcel.readFloat();
        this.outputSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.watermarkSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.bitrateMode = (ENCODE_BITRATE_MODE) parcel.readParcelable(ENCODE_BITRATE_MODE.class.getClassLoader());
        this.bps = parcel.readInt();
        this.fps = parcel.readInt();
        this.publishFps = parcel.readInt();
        this.mvStillFramesPublishFps = parcel.readInt();
        this.mvStillFramesWatermarkFps = parcel.readInt();
        this.swCRF = parcel.readInt();
        this.swQPOffset = parcel.readDouble();
        this.swHFpsOffset = parcel.readDouble();
        this.swByteVC1Crf = parcel.readDouble();
        this.swSDCrfRatio = parcel.readDouble();
        this.swFHDCrfRatio = parcel.readDouble();
        this.swThreadCount = parcel.readInt();
        this.swMinQp = parcel.readInt();
        this.swMaxQp = parcel.readInt();
        this.swQP = parcel.readInt();
        this.gopSize = parcel.readInt();
        this.swPreset = parcel.readInt();
        this.swByteVC1Preset = parcel.readInt();
        this.encodeStandard = parcel.readInt();
        this.encodeProfile = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSupportHWEncoder = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.enableRemuxVideo = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.enableRemuxVideoForRotation = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.enableRemuxVideoForShoot = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.enableInterLeave = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.enableAvInterLeave = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.enableHdr10BitEncode = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.hasBFrame = z8;
        this.swMaxrate = parcel.readLong();
        this.mWatermarkParam = (VEWatermarkParam) parcel.readParcelable(VEWatermarkParam.class.getClassLoader());
        this.mVideoWatermarkCompileEncodeSetting = (VEVideoCompileEncodeSettings) parcel.readParcelable(VEVideoCompileEncodeSettings.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.mEnableInvisibleWatermark = z9;
        this.mVideoInvisibleWatermarkSettings = (VideoInvisibleWatermarkSettings) parcel.readParcelable(VideoInvisibleWatermarkSettings.class.getClassLoader());
        this.mVideoCompileEncodeSetting = (VEVideoCompileEncodeSettings) parcel.readParcelable(VEVideoCompileEncodeSettings.class.getClassLoader());
        this.externalSettingsJsonStr = parcel.readString();
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.mOptRemuxWithCopy = z10;
        this.mDescription = parcel.readString();
        this.mComment = parcel.readString();
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mCompileSoftInfo = z11;
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.mRecordingMp4 = z12;
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.enableHwBufferEncode = z13;
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.mReEncodeOpt = z14;
        this.mResolutionAlign = parcel.readInt();
        this.banExtraDataLoop = parcel.readByte() != 0;
        this.mFitMode = (VEVideoEncodeFitMode) parcel.readParcelable(VEVideoEncodeFitMode.class.getClassLoader());
        this.mMirrorMode = (VEVideoEncodeMirrorMode) parcel.readParcelable(VEVideoEncodeMirrorMode.class.getClassLoader());
        this.frameRate = parcel.readInt();
        this.iFrameInterval = parcel.readInt();
        this.mVideoTrc = parcel.readInt();
        this.mHdr_bitrate_ratio = parcel.readDouble();
        this.hpBitrateRatio = parcel.readDouble();
        this.fullHdBitrateRatio = parcel.readDouble();
        this.sdBitrateRatio = parcel.readDouble();
        this.highFpsBitrateRatio = parcel.readDouble();
        this.hevcBitrateRatio = parcel.readDouble();
        this.transitionBitrateRatio = parcel.readDouble();
        this.m2kBitrateRatio = parcel.readDouble();
        this.m4kBitrateRatio = parcel.readDouble();
        this.mTransitionKeyframeEnable = parcel.readBoolean();
        this.mTransitionKeyFrameVersion = parcel.readInt();
        this.mTransitionFrameCount = parcel.readInt();
        this.mTransitionKeyFrameMode = parcel.readInt();
    }

    public void adjustVideoCompileEncodeSetting(int i) {
        if (i != 1) {
            if (i == 2) {
                VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = this.mVideoCompileEncodeSetting;
                if (vEVideoCompileEncodeSettings != null) {
                    this.mVideoWatermarkCompileEncodeSetting = vEVideoCompileEncodeSettings;
                }
                if (this.outputSize.isValid()) {
                    VESize vESize = this.watermarkSize;
                    VESize vESize2 = this.outputSize;
                    vESize.width = vESize2.width;
                    vESize.height = vESize2.height;
                    return;
                }
                return;
            }
            return;
        }
        VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings2 = this.mVideoWatermarkCompileEncodeSetting;
        if (vEVideoCompileEncodeSettings2 != null) {
            this.mVideoCompileEncodeSetting = vEVideoCompileEncodeSettings2;
        }
        if (!this.watermarkSize.isValid()) {
            return;
        }
        VESize vESize3 = this.outputSize;
        VESize vESize4 = this.watermarkSize;
        vESize3.width = vESize4.width;
        vESize3.height = vESize4.height;
    }

    public void setBps(int i) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_VBR;
        this.bps = i;
    }

    public void setCompileType(COMPILE_TYPE compile_type) {
        this.compileType = compile_type;
    }

    public void setDownloadNetworkSpeed(int i) {
        this.downloadNetworkSpeed = i;
    }

    public void setEnableAvInterLeave(boolean z) {
        this.enableAvInterLeave = z;
    }

    public void setEnableCloudProcessWithMusic(boolean z) {
        this.enableCloudProcessWithMusic = z;
    }

    public void setEnableCopyWithMetadata(boolean z) {
        this.enableCopyWithMetadata = z;
    }

    public void setEnableHdr10BitEncode(boolean z) {
        this.enableHdr10BitEncode = z;
    }

    public void setEnableInterLeave(boolean z) {
        this.enableInterLeave = z;
    }

    public void setEnablePseudoLandscape(boolean z) {
        this.enablePseudoLandscape = z;
    }

    public void setEnableRemuxVideo(boolean z) {
        this.enableRemuxVideo = z;
    }

    public void setEnableRemuxVideoBitrate(int i) {
        this.enableRemuxVideoBitrate = i;
    }

    public void setEnableRemuxVideoFPS(int i) {
        this.enableRemuxVideoFPS = i;
    }

    public void setEnableRemuxVideoForRotation(boolean z) {
        this.enableRemuxVideoForRotation = z;
    }

    public void setEnableRemuxVideoForShoot(boolean z) {
        this.enableRemuxVideoForShoot = z;
    }

    public void setEnableRemuxVideoRes(int i) {
        this.enableRemuxVideoRes = i;
    }

    public void setEnableUploadDirectly(boolean z) {
        this.enableUploadDirectly = z;
    }

    public void setEnableVideoAndAudioRemux(boolean z) {
        this.enableVideoAndAudioRemux = z;
    }

    public void setEnableVqscore(boolean z) {
        this.enableVqscore = z;
    }

    public void setEncodeProfile(ENCODE_PROFILE encode_profile) {
        this.encodeProfile = encode_profile.ordinal();
    }

    public void setFitMode(VEVideoEncodeFitMode vEVideoEncodeFitMode) {
        this.mFitMode = vEVideoEncodeFitMode;
    }

    public void setFps(int i) {
        this.fps = i;
        this.publishFps = -1;
    }

    public void setGopSize(int i) {
        this.gopSize = i;
    }

    public void setHwBps(int i) {
        this.HwBps = i;
    }

    public void setIgnoreJsonBitrate(boolean z) {
        this.ignoreJsonBitrate = z;
    }

    public void setImageCompileQuality(float f) {
        this.image_compile_quality = f;
    }

    public void setMVStillFramesPublishFps(int i) {
        this.mvStillFramesPublishFps = i;
    }

    public void setMVStillFramesWatermarkFps(int i) {
        this.mvStillFramesWatermarkFps = i;
    }

    public void setQP(int i) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP;
        this.swQP = i;
    }

    public void setResizeMode(int i) {
        this.resizeMode = i;
    }

    public void setResizeX(float f) {
        this.resizeX = f;
    }

    public void setResizeY(float f) {
        this.resizeY = f;
    }

    public void setRotate(int i) {
        this.rotate = i;
    }

    public void setSWCRF(int i) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF;
        this.swCRF = i;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setSupportHwEnc(boolean z) {
        this.isSupportHWEncoder = z;
    }

    public void setSwPreset(ENCODE_PRESET encode_preset) {
        this.swPreset = encode_preset.ordinal();
    }

    public void setTemplateScore(float f) {
        this.templateScore = f;
    }

    public void setUploadingWithSynthesisCancelWritefile(boolean z) {
        this.uploadingWithSynthesisCancelWritefile = z;
    }

    public void setUseSoftwareDecode(boolean z) {
        this.useSoftwareDecode = z;
    }

    public boolean setVideoHwEnc(boolean z) {
        VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = this.mVideoCompileEncodeSetting;
        if (vEVideoCompileEncodeSettings.isSupportHWEncoder) {
            vEVideoCompileEncodeSettings.useHWEncoder = z;
        } else {
            vEVideoCompileEncodeSettings.useHWEncoder = false;
        }
        return vEVideoCompileEncodeSettings.useHWEncoder;
    }

    public boolean setVideoInvisibleWatermarkSettings(VideoInvisibleWatermarkSettings videoInvisibleWatermarkSettings) {
        boolean z;
        this.mVideoInvisibleWatermarkSettings = videoInvisibleWatermarkSettings;
        if (videoInvisibleWatermarkSettings != null) {
            z = true;
        } else {
            z = false;
        }
        this.mEnableInvisibleWatermark = z;
        return true;
    }

    public void setVideoSWOptCrf(int i) {
        this.mVideoCompileEncodeSetting.mSWEncodeSetting.mCrf = i;
    }

    public void setVideoTrc(int i) {
        this.mVideoTrc = i;
    }

    public void setVqscoreModelPath(String str) {
        this.vqscoreModelPath = str;
    }

    public boolean setWatermark(VEWatermarkParam vEWatermarkParam) {
        if (vEWatermarkParam != null) {
            if (vEWatermarkParam.getEntities() != null) {
                this.mWatermarkParam = vEWatermarkParam;
                return true;
            }
            return false;
        }
        this.mWatermarkParam = null;
        return true;
    }

    public /* synthetic */ VEVideoEncodeSettings(C1864730ycp c1864730ycp) {
        this();
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z) {
        this.mFitMode = VEVideoEncodeFitMode.CENTER_CROP;
        this.mMirrorMode = VEVideoEncodeMirrorMode.NO_MIRROR;
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.ignoreJsonBitrate = false;
        this.HwBps = -1;
        this.useSoftwareDecode = false;
        this.frameRate = 30;
        this.iFrameInterval = 1;
        this.swCRF = 19;
        this.swQPOffset = -1.0d;
        this.swHFpsOffset = 1.0d;
        this.swByteVC1HdrCrf = 21.0d;
        this.swByteVC1Crf = 22.0d;
        this.swSDCrfRatio = 1.0d;
        this.swFHDCrfRatio = 1.0d;
        this.swThreadCount = 6;
        this.swMinQp = 15;
        this.swMaxQp = 39;
        this.swQP = 15;
        this.fps = -1;
        this.publishFps = -1;
        this.mvStillFramesPublishFps = -1;
        this.mvStillFramesWatermarkFps = -1;
        this.gopSize = 60;
        this.hwEncodeQpMin = -1;
        this.hwEncodeQpMax = -1;
        this.keyFrameDuration = -1;
        this.maxCacheDuration = -1;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.swByteVC1Preset = -1;
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000L;
        this.enableRemuxVideoRes = -1;
        this.enableRemuxVideoFPS = -1;
        this.enableRemuxVideoBitrate = -1;
        this.uploadingWithSynthesisCancelWritefile = false;
        this.enableCopyWithMetadata = false;
        this.enableUploadDirectly = false;
        this.downloadNetworkSpeed = -1;
        this.enablePseudoLandscape = false;
        this.templateScore = 0.0f;
        this.enableCloudProcessWithMusic = false;
        this.enableVideoAndAudioRemux = false;
        this.mVideoTrc = -1;
        this.hasBFrame = false;
        this.mEnableInvisibleWatermark = false;
        this.mVideoInvisibleWatermarkSettings = null;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mTransitionKeyFrameVersion = -1;
        this.mTransitionFrameCount = 1;
        this.mTransitionKeyFrameMode = 0;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = true;
        this.image_compile_quality = 100.0f;
        this.enableVqscore = false;
        this.mHdr_bitrate_ratio = 1.0d;
        this.hpBitrateRatio = 0.75d;
        this.fullHdBitrateRatio = 1.0d;
        this.sdBitrateRatio = 1.0d;
        this.highFpsBitrateRatio = 1.0d;
        this.hevcBitrateRatio = 1.0d;
        this.transitionBitrateRatio = 1.0d;
        this.m2kBitrateRatio = 1.0d;
        this.m4kBitrateRatio = 1.0d;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    public void setEnableRemuxVideo(boolean z, boolean z2) {
        this.enableRemuxVideo = z;
        this.enableRemuxVideoForRotation = z2;
    }

    public void setFps(int i, int i2) {
        if (i2 > 0 && i2 < i) {
            this.fps = i;
            this.publishFps = i2;
        } else {
            this.fps = i;
            this.publishFps = -1;
        }
    }

    public void setVideoBitrate(ENCODE_BITRATE_MODE encode_bitrate_mode, int i) {
        this.bitrateMode = encode_bitrate_mode;
        int i2 = C1285070jXt.LIZ[encode_bitrate_mode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        this.bps = i;
                        return;
                    }
                    throw new IllegalStateException("CompileTime BUG by sdk. Unhandled bitrateMode");
                }
                this.swQP = i;
                return;
            }
            this.swCRF = i;
            return;
        }
        this.bps = i;
    }

    public void setVideoRes(int i, int i2) {
        VESize vESize = this.outputSize;
        vESize.width = i;
        vESize.height = i2;
    }

    public void setWatermarkVideoRes(int i, int i2) {
        VESize vESize = this.watermarkSize;
        vESize.width = i;
        vESize.height = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.compileType, i);
        parcel.writeInt(this.rotate);
        parcel.writeInt(this.resizeMode);
        parcel.writeFloat(this.resizeX);
        parcel.writeFloat(this.resizeY);
        parcel.writeFloat(this.speed);
        parcel.writeParcelable(this.outputSize, i);
        parcel.writeParcelable(this.watermarkSize, i);
        parcel.writeParcelable(this.bitrateMode, i);
        parcel.writeInt(this.bps);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.publishFps);
        parcel.writeInt(this.mvStillFramesPublishFps);
        parcel.writeInt(this.mvStillFramesWatermarkFps);
        parcel.writeInt(this.swCRF);
        parcel.writeDouble(this.swQPOffset);
        parcel.writeDouble(this.swHFpsOffset);
        parcel.writeDouble(this.swByteVC1Crf);
        parcel.writeDouble(this.swSDCrfRatio);
        parcel.writeDouble(this.swFHDCrfRatio);
        parcel.writeInt(this.swThreadCount);
        parcel.writeInt(this.swMinQp);
        parcel.writeInt(this.swMaxQp);
        parcel.writeInt(this.swQP);
        parcel.writeInt(this.gopSize);
        parcel.writeInt(this.swPreset);
        parcel.writeInt(this.swByteVC1Preset);
        parcel.writeInt(this.encodeStandard);
        parcel.writeInt(this.encodeProfile);
        parcel.writeByte(this.isSupportHWEncoder ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableRemuxVideo ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableRemuxVideoForRotation ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableRemuxVideoForShoot ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableInterLeave ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableAvInterLeave ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableHdr10BitEncode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hasBFrame ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.swMaxrate);
        parcel.writeParcelable(this.mWatermarkParam, i);
        parcel.writeParcelable(this.mVideoWatermarkCompileEncodeSetting, i);
        parcel.writeByte(this.mEnableInvisibleWatermark ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.mVideoInvisibleWatermarkSettings, i);
        parcel.writeParcelable(this.mVideoCompileEncodeSetting, i);
        parcel.writeString(this.externalSettingsJsonStr);
        parcel.writeByte(this.mOptRemuxWithCopy ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mDescription);
        parcel.writeString(this.mComment);
        parcel.writeByte(this.mCompileSoftInfo ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mRecordingMp4 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableHwBufferEncode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mReEncodeOpt ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mResolutionAlign);
        parcel.writeByte(this.banExtraDataLoop ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.mFitMode, i);
        parcel.writeParcelable(this.mMirrorMode, i);
        parcel.writeInt(this.frameRate);
        parcel.writeInt(this.iFrameInterval);
        parcel.writeInt(this.mVideoTrc);
        parcel.writeDouble(this.mHdr_bitrate_ratio);
        parcel.writeDouble(this.hpBitrateRatio);
        parcel.writeDouble(this.fullHdBitrateRatio);
        parcel.writeDouble(this.sdBitrateRatio);
        parcel.writeDouble(this.highFpsBitrateRatio);
        parcel.writeDouble(this.hevcBitrateRatio);
        parcel.writeDouble(this.transitionBitrateRatio);
        parcel.writeDouble(this.m2kBitrateRatio);
        parcel.writeDouble(this.m4kBitrateRatio);
        parcel.writeBoolean(this.mTransitionKeyframeEnable);
        parcel.writeInt(this.mTransitionKeyFrameVersion);
        parcel.writeInt(this.mTransitionFrameCount);
        parcel.writeInt(this.mTransitionKeyFrameMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc A[PHI: r1
      0x00dc: PHI (r1v6 long) = (r1v5 long), (r1v7 long) binds: [B:45:0x0109, B:39:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0wQN] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.0wQN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C1780130wQN setVideoHWoptBitrate(com.ss.android.vesdk.VESize r21, X.C1780120wQM r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEVideoEncodeSettings.setVideoHWoptBitrate(com.ss.android.vesdk.VESize, X.0wQM, java.lang.String):X.0wQN");
    }

    public float setVideoHWoptBitrate(int i, float f, boolean z) {
        long j;
        float f2;
        float f3 = f;
        float f4 = 0.0f;
        if (f3 < 0.0f) {
            C2484209oO.LIZJ("VEVideoEncodeSettings", "compileProbe HW setVideoHWoptBitrate optBitrate error");
            return -1.0f;
        }
        VESize vESize = this.outputSize;
        int iMin = Math.min(vESize.width, vESize.height);
        int iAbs = Math.abs(i - iMin);
        if (i > 572 && ((i < 580 || (i > 716 && i < 724)) && iAbs > 8)) {
            C2484209oO.LIZJ("VEVideoEncodeSettings", "compileProbe 576P || 720P: output resolution is not as expected");
            return -1.0f;
        }
        if (i > 1076 && i < 1089) {
            if (z) {
                if (iAbs > 8) {
                    C2484209oO.LIZJ("VEVideoEncodeSettings", "compileProbe 1080P_HD: output resolution is not as expected");
                    return -1.0f;
                }
            } else if (iAbs < 8) {
                C2484209oO.LIZJ("VEVideoEncodeSettings", "compileProbe 1080P: output resolution is not as expected");
                return -1.0f;
            }
        }
        if (iMin > 716) {
            if (iMin < 724) {
                f2 = this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate / 1000;
                f4 = f3 - f2;
                this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate = (long) (f3 * 1000.0f);
                return f4;
            }
        } else {
            if (iMin > 572) {
                if (iMin < 580) {
                    if (!z) {
                        VEVideoHWEncodeSettings vEVideoHWEncodeSettings = this.mVideoCompileEncodeSetting.mHWEncodeSetting;
                        f3 = (float) (((double) f3) / vEVideoHWEncodeSettings.mSd_bitrate_ratio);
                        j = vEVideoHWEncodeSettings.mBitrate;
                    } else {
                        f3 = this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate / 1000.0f;
                        this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate = (long) (f3 * 1000.0f);
                        return f4;
                    }
                }
                f2 = j / 1000.0f;
                f4 = f3 - f2;
                this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate = (long) (f3 * 1000.0f);
                return f4;
            }
            C2484209oO.LIZJ("VEVideoEncodeSettings", "compileProbe output resolution error");
            return -1.0f;
        }
        if (iMin > 1076 && iMin < 1089) {
            VEVideoHWEncodeSettings vEVideoHWEncodeSettings2 = this.mVideoCompileEncodeSetting.mHWEncodeSetting;
            f3 = (float) (((double) f3) / vEVideoHWEncodeSettings2.mFullHd_bitrate_ratio);
            j = vEVideoHWEncodeSettings2.mBitrate;
            f2 = j / 1000.0f;
            f4 = f3 - f2;
            this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate = (long) (f3 * 1000.0f);
            return f4;
        }
        C2484209oO.LIZJ("VEVideoEncodeSettings", "compileProbe output resolution error");
        return -1.0f;
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z, int i, int i2) {
        this.mFitMode = VEVideoEncodeFitMode.CENTER_CROP;
        this.mMirrorMode = VEVideoEncodeMirrorMode.NO_MIRROR;
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.ignoreJsonBitrate = false;
        this.HwBps = -1;
        this.useSoftwareDecode = false;
        this.frameRate = 30;
        this.iFrameInterval = 1;
        this.swCRF = 19;
        this.swQPOffset = -1.0d;
        this.swHFpsOffset = 1.0d;
        this.swByteVC1HdrCrf = 21.0d;
        this.swByteVC1Crf = 22.0d;
        this.swSDCrfRatio = 1.0d;
        this.swFHDCrfRatio = 1.0d;
        this.swThreadCount = 6;
        this.swMinQp = 15;
        this.swMaxQp = 39;
        this.swQP = 15;
        this.fps = -1;
        this.publishFps = -1;
        this.mvStillFramesPublishFps = -1;
        this.mvStillFramesWatermarkFps = -1;
        this.gopSize = 60;
        this.hwEncodeQpMin = -1;
        this.hwEncodeQpMax = -1;
        this.keyFrameDuration = -1;
        this.maxCacheDuration = -1;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.swByteVC1Preset = -1;
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000L;
        this.enableRemuxVideoRes = -1;
        this.enableRemuxVideoFPS = -1;
        this.enableRemuxVideoBitrate = -1;
        this.uploadingWithSynthesisCancelWritefile = false;
        this.enableCopyWithMetadata = false;
        this.enableUploadDirectly = false;
        this.downloadNetworkSpeed = -1;
        this.enablePseudoLandscape = false;
        this.templateScore = 0.0f;
        this.enableCloudProcessWithMusic = false;
        this.enableVideoAndAudioRemux = false;
        this.mVideoTrc = -1;
        this.hasBFrame = false;
        this.mEnableInvisibleWatermark = false;
        this.mVideoInvisibleWatermarkSettings = null;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mTransitionKeyFrameVersion = -1;
        this.mTransitionFrameCount = 1;
        this.mTransitionKeyFrameMode = 0;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = true;
        this.image_compile_quality = 100.0f;
        this.enableVqscore = false;
        this.mHdr_bitrate_ratio = 1.0d;
        this.hpBitrateRatio = 0.75d;
        this.fullHdBitrateRatio = 1.0d;
        this.sdBitrateRatio = 1.0d;
        this.highFpsBitrateRatio = 1.0d;
        this.hevcBitrateRatio = 1.0d;
        this.transitionBitrateRatio = 1.0d;
        this.m2kBitrateRatio = 1.0d;
        this.m4kBitrateRatio = 1.0d;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.fps = i;
        this.gopSize = i2;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    private float[] bitrateRangeSettingsJsonStr(String str, boolean z, float f, int i) {
        JSONArray jSONArray;
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONArray = new JSONArray();
            if (716 < i && i < 724) {
                jSONArray = z ? jSONObject.optJSONArray("720P_HD") : f == 7000.0f ? jSONObject.optJSONArray("720P_Base_7Mb") : jSONObject.optJSONArray("720P");
            } else if (1076 < i && i < 1089) {
                jSONArray = jSONObject.optJSONArray("1080P");
            } else if (572 < i && i < 580) {
                jSONArray = f == 7000.0f ? jSONObject.optJSONArray("576P_Base_7Mb") : jSONObject.optJSONArray("576P");
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bitrateRange json str parse error : ");
            sbLIZ.append(e.getLocalizedMessage());
            C2484209oO.LIZJ("VEVideoEncodeSettings", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (jSONArray == null) {
            C2484209oO.LIZJ("VEVideoEncodeSettings", "bitrateRange json parse failed");
            return null;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            fArr[i2] = (float) JSONArrayProtectorUtils.getDouble(jSONArray, i2);
        }
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[PHI: r4
      0x00b2: PHI (r4v6 float) = (r4v3 float), (r4v7 float) binds: [B:47:0x00e0, B:31:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C1465930oFb getHwAdaptiveBitrate(int r25, X.C1780120wQM r26, float r27, java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEVideoEncodeSettings.getHwAdaptiveBitrate(int, X.0wQM, float, java.lang.String, java.lang.String):X.0oFb");
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z, int i, int i2, int i3, int i4, boolean z2) {
        this.mFitMode = VEVideoEncodeFitMode.CENTER_CROP;
        this.mMirrorMode = VEVideoEncodeMirrorMode.NO_MIRROR;
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.ignoreJsonBitrate = false;
        this.HwBps = -1;
        this.useSoftwareDecode = false;
        this.frameRate = 30;
        this.iFrameInterval = 1;
        this.swCRF = 19;
        this.swQPOffset = -1.0d;
        this.swHFpsOffset = 1.0d;
        this.swByteVC1HdrCrf = 21.0d;
        this.swByteVC1Crf = 22.0d;
        this.swSDCrfRatio = 1.0d;
        this.swFHDCrfRatio = 1.0d;
        this.swThreadCount = 6;
        this.swMinQp = 15;
        this.swMaxQp = 39;
        this.swQP = 15;
        this.fps = -1;
        this.publishFps = -1;
        this.mvStillFramesPublishFps = -1;
        this.mvStillFramesWatermarkFps = -1;
        this.gopSize = 60;
        this.hwEncodeQpMin = -1;
        this.hwEncodeQpMax = -1;
        this.keyFrameDuration = -1;
        this.maxCacheDuration = -1;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.swByteVC1Preset = -1;
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000L;
        this.enableRemuxVideoRes = -1;
        this.enableRemuxVideoFPS = -1;
        this.enableRemuxVideoBitrate = -1;
        this.uploadingWithSynthesisCancelWritefile = false;
        this.enableCopyWithMetadata = false;
        this.enableUploadDirectly = false;
        this.downloadNetworkSpeed = -1;
        this.enablePseudoLandscape = false;
        this.templateScore = 0.0f;
        this.enableCloudProcessWithMusic = false;
        this.enableVideoAndAudioRemux = false;
        this.mVideoTrc = -1;
        this.mEnableInvisibleWatermark = false;
        this.mVideoInvisibleWatermarkSettings = null;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mTransitionKeyFrameVersion = -1;
        this.mTransitionFrameCount = 1;
        this.mTransitionKeyFrameMode = 0;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = true;
        this.image_compile_quality = 100.0f;
        this.enableVqscore = false;
        this.mHdr_bitrate_ratio = 1.0d;
        this.hpBitrateRatio = 0.75d;
        this.fullHdBitrateRatio = 1.0d;
        this.sdBitrateRatio = 1.0d;
        this.highFpsBitrateRatio = 1.0d;
        this.hevcBitrateRatio = 1.0d;
        this.transitionBitrateRatio = 1.0d;
        this.m2kBitrateRatio = 1.0d;
        this.m4kBitrateRatio = 1.0d;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.fps = i;
        this.gopSize = i2;
        this.bps = i3;
        this.swPreset = i4;
        this.hasBFrame = z2;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float get_adaptive_encode_bitrate(int r17, int r18, int r19, int r20, int r21, float r22, float r23, float[] r24, float r25) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEVideoEncodeSettings.get_adaptive_encode_bitrate(int, int, int, int, int, float, float, float[], float):float");
    }
}
