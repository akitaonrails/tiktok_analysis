package com.ss.android.vesdk;

import X.C08FF;
import X.C1698130uI7;
import X.C1DIX;
import X.C1DJ5;
import X.C2188811AlT;
import X.C2189641Amo;
import X.C2325341G0m;
import X.C2484209oO;
import X.EnumC1270990jBB;
import X.EnumC19366110pf;
import X.EnumC19367110pp;
import X.EnumC19386710sz;
import X.EnumC2244671CtN;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.vesdk.VEConfigCenter;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes36.dex */
public class VECameraSettings implements Parcelable {
    public int[] CameraHWLevelAndroid2TE;
    public int[] CameraHWLevelTE2Android;
    public boolean mBindSurfaceLifecycleToCamera;
    public int mCamera2RetryCnt;
    public boolean mCameraAntiShake;
    public CAMERA_FACING_ID mCameraFacing;
    public C1DJ5 mCameraFrameRateStrategy;
    public CAMERA_MODE_TYPE mCameraMode;
    public boolean mCameraPreviewIndependent;
    public HashMap<EnumC1270990jBB, Cert> mCameraPrivacyCertMap;
    public CAMERA_TYPE mCameraType;
    public float mCameraZoomLimitFactor;
    public CAMERA_CAPTURE_FLASH_STRATEGY mCaptureFlashStrategy;
    public boolean mCaptureHdr;
    public VESize mCaptureSize;
    public CAMERA_TYPE mConfigCameraType;
    public CAMERA_TYPE mDefaultCameraTypeInNewCameraStrategy;
    public float mDefaultZoomRatio;
    public boolean mDefaultZoomUsingZoomV2;
    public long mDynamicRangeProfile;
    public boolean mEnableFallback;
    public boolean mEnableForceRestartWhenCameraError;
    public int mEnableGcForCameraMetadataThreshold;
    public boolean mEnableHDR10BitRecord;
    public boolean mEnableManualReleaseCaptureResult;
    public boolean mEnableMonitorRuntimeInfo;
    public boolean mEnableOpenCamera1Opt;
    public boolean mEnablePreviewTemplate;
    public boolean mEnablePreviewingFallback;
    public boolean mEnableRecord60Fps;
    public boolean mEnableRecordStream;
    public boolean mEnableRefactorFocusAndMeter;
    public boolean mEnableStabilization;
    public boolean mEnableSurfaceSharing;
    public boolean mEnableWideFOV;
    public boolean mEnableYuvBufferCapture;
    public boolean mEnableZsl;
    public Bundle mExtParameters;
    public EnumC19366110pf mFaceAEStrategy;
    public int mFocusTimeoutMS;
    public int mFps;
    public int mFpsMaxLimit;
    public C1DIX mFpsMode;
    public int[] mFpsRange;
    public CAMERA_HW_LEVEL mHwLevel;
    public boolean mIsCameraOpenCloseSync;
    public boolean mIsForceCloseCamera;
    public boolean mIsUseHint;
    public boolean mIsUseNewCameraTypeStrategy;
    public int mMaxWidth;
    public float mMaxWidthTakePictureSizeAccuracy;
    public boolean mOptCameraSceneFps;
    public byte mOptionFlags;
    public boolean mPreferOpenCameraByCameraId;
    public VESize mPreviewSize;
    public EnumC19386710sz mPreviewSizeStrategy;
    public String mRecordStreamFolderPath;
    public int mRetryCnt;
    public int mRetryStartPreviewCnt;
    public long mRuntimeInfoMonitorPeriod;
    public String mSceneMode;
    public VESize mSecondaryPreviewSize;
    public EnumC2244671CtN mStabilizationMode;
    public String mStrCameraHardwareID;
    public boolean mUseMaxWidthTakePicture;
    public boolean mUseSyncModeOnCamera2;
    public boolean mVESetCameraTwoOutputMode;
    public boolean mbDontUseVendorCamera;
    public boolean mbDualCameraExpansionScheme;
    public static final String TAG = "VECameraSettings";
    public static final String[] sCameraSceneMode = {"auto", "action", "barcode", "beach", "candlelight", "fireworks", "hdr", "landscape", "night", "night-portrait", "party", "portrait", "snow", "sports", "steadyphoto", "sunset", "theatre"};
    public static final Parcelable.Creator<VECameraSettings> CREATOR = new C2325341G0m(16);

    /* JADX INFO: loaded from: classes34.dex */
    public enum CAMERA_FACING_ID implements Parcelable {
        FACING_BACK,
        FACING_FRONT,
        FACING_WIDE_ANGLE,
        FACING_TELEPHOTO,
        FACING_3RD,
        FACING_REAR_MAIN_REAR_WIDE,
        FACING_REAR_MAIN_REAR_TELE,
        FACING_REAR_MAIN_FRONT_MAIN;

        public static final Parcelable.Creator<CAMERA_FACING_ID> CREATOR = new C2189641Amo(24);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean isBidirectional() {
            return this == FACING_REAR_MAIN_FRONT_MAIN;
        }

        public static CAMERA_FACING_ID valueOf(String str) {
            return (CAMERA_FACING_ID) C08FF.LIZ(CAMERA_FACING_ID.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static class Builder {
        public VECameraSettings mExportCameraSettings;

        public Builder overrideWithCloudConfig() {
            return this;
        }

        public Builder() {
            this.mExportCameraSettings = new VECameraSettings();
        }

        public VECameraSettings build() {
            return this.mExportCameraSettings;
        }

        public Builder(VECameraSettings vECameraSettings) {
            this.mExportCameraSettings = vECameraSettings;
        }

        public Builder bindSurfaceLifecycleToCamera(boolean z) {
            this.mExportCameraSettings.mBindSurfaceLifecycleToCamera = z;
            return this;
        }

        public Builder enableCameraPreviewIndependent(boolean z) {
            this.mExportCameraSettings.mCameraPreviewIndependent = z;
            return this;
        }

        public Builder enableForceRestartWhenCameraError(boolean z) {
            this.mExportCameraSettings.mEnableForceRestartWhenCameraError = z;
            return this;
        }

        public Builder enableFrontFacingVideoContinueFocus(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("enableFrontFacingVideoContinueFocus", z);
            return this;
        }

        public Builder enableHDR10BitRecord(boolean z) {
            this.mExportCameraSettings.mEnableHDR10BitRecord = z;
            return this;
        }

        public Builder enablePreviewingFallback(boolean z) {
            this.mExportCameraSettings.mEnablePreviewingFallback = z;
            return this;
        }

        public Builder enableRecord60Fps(boolean z) {
            this.mExportCameraSettings.mEnableRecord60Fps = z;
            return this;
        }

        public Builder enableRecordStream(boolean z) {
            this.mExportCameraSettings.mEnableRecordStream = z;
            return this;
        }

        public Builder enableRefactorFocusAndMeter(boolean z) {
            this.mExportCameraSettings.mEnableRefactorFocusAndMeter = z;
            return this;
        }

        public Builder enableRetryOpenCamera(boolean z) {
            int i;
            VECameraSettings vECameraSettings = this.mExportCameraSettings;
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            vECameraSettings.mRetryCnt = i;
            return this;
        }

        public Builder enableShutterSound(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("enableShutterSound", z);
            return this;
        }

        public Builder enableStabilization(EnumC2244671CtN enumC2244671CtN) {
            VECameraSettings vECameraSettings = this.mExportCameraSettings;
            vECameraSettings.mEnableStabilization = true;
            if (enumC2244671CtN == EnumC2244671CtN.OFF) {
                vECameraSettings.mEnableStabilization = false;
            }
            vECameraSettings.mStabilizationMode = enumC2244671CtN;
            return this;
        }

        public Builder enableSwitchFlashSleepToTakeEffect(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("enableSwitchFlashSleepToTakeEffect", z);
            return this;
        }

        public Builder enableYuvBufferCapture(boolean z) {
            this.mExportCameraSettings.mEnableYuvBufferCapture = z;
            return this;
        }

        public Builder forceRunUpdateTexImg(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("forceRunUpdateTexImg", z);
            return this;
        }

        public Builder setCamera2RetryCnt(int i) {
            this.mExportCameraSettings.mCamera2RetryCnt = i;
            return this;
        }

        public Builder setCameraAiNightVideo(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("enable_ai_night_video", z);
            return this;
        }

        public Builder setCameraAntiShake(boolean z) {
            this.mExportCameraSettings.mCameraAntiShake = z;
            return this;
        }

        public Builder setCameraFacing(CAMERA_FACING_ID camera_facing_id) {
            this.mExportCameraSettings.mStrCameraHardwareID = VEConfigCenter.getInstance().getValue("wide_camera_id", "-1");
            this.mExportCameraSettings.mCameraFacing = camera_facing_id;
            return this;
        }

        public Builder setCameraModeType(CAMERA_MODE_TYPE camera_mode_type) {
            this.mExportCameraSettings.mCameraMode = camera_mode_type;
            return this;
        }

        public Builder setCameraPrivacyCertMap(HashMap<EnumC1270990jBB, Cert> map) {
            this.mExportCameraSettings.mCameraPrivacyCertMap = map;
            return this;
        }

        public Builder setCameraSuperAntiShake(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("enable_super_Stabilization", z);
            return this;
        }

        public Builder setCameraType(CAMERA_TYPE camera_type) {
            VECameraSettings vECameraSettings = this.mExportCameraSettings;
            vECameraSettings.mCameraType = camera_type;
            vECameraSettings.mIsUseNewCameraTypeStrategy = false;
            return this;
        }

        public Builder setCameraVideoAntiShake(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("enable_video_stabilization", z);
            return this;
        }

        public Builder setCameraVideoHDR(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("enable_video_hdr", z);
            return this;
        }

        public Builder setCameraZoomLimitFactor(float f) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            this.mExportCameraSettings.mCameraZoomLimitFactor = f;
            return this;
        }

        public Builder setCaptureFlashStrategy(CAMERA_CAPTURE_FLASH_STRATEGY camera_capture_flash_strategy) {
            this.mExportCameraSettings.mCaptureFlashStrategy = camera_capture_flash_strategy;
            return this;
        }

        public Builder setDefaultZoomRatio(float f) {
            this.mExportCameraSettings.mDefaultZoomRatio = f;
            return this;
        }

        public Builder setDefaultZoomUsingZoomV2(boolean z) {
            this.mExportCameraSettings.mDefaultZoomUsingZoomV2 = z;
            return this;
        }

        public Builder setDontUseVendorCameraType(boolean z) {
            this.mExportCameraSettings.mbDontUseVendorCamera = z;
            return this;
        }

        public Builder setDualCameraExtensionScheme(boolean z) {
            this.mExportCameraSettings.mbDualCameraExpansionScheme = z;
            return this;
        }

        public Builder setDynamicRangeProfile(long j) {
            this.mExportCameraSettings.mDynamicRangeProfile = j;
            return this;
        }

        public Builder setEnableFallback(boolean z) {
            this.mExportCameraSettings.mEnableFallback = z;
            return this;
        }

        public Builder setEnableMonitorRuntimeInfo(boolean z) {
            this.mExportCameraSettings.mEnableMonitorRuntimeInfo = z;
            return this;
        }

        public Builder setEnableSurfaceSharing(boolean z) {
            this.mExportCameraSettings.mEnableSurfaceSharing = z;
            return this;
        }

        public Builder setEnableZsl(boolean z) {
            this.mExportCameraSettings.mEnableZsl = z;
            return this;
        }

        public Builder setExtParameters(Bundle bundle) {
            this.mExportCameraSettings.mExtParameters = bundle;
            return this;
        }

        public Builder setFaceAEStrategy(EnumC19366110pf enumC19366110pf) {
            this.mExportCameraSettings.mFaceAEStrategy = enumC19366110pf;
            return this;
        }

        public Builder setFps(int i) {
            this.mExportCameraSettings.mFps = i;
            return this;
        }

        public Builder setFpsMaxLimit(int i) {
            if (i < 30) {
                i = 30;
            }
            this.mExportCameraSettings.mFpsMaxLimit = i;
            return this;
        }

        public Builder setFpsMode(C1DIX c1dix) {
            this.mExportCameraSettings.mFpsMode = c1dix;
            return this;
        }

        public Builder setFpsRange(int[] iArr) {
            VECameraSettings vECameraSettings = this.mExportCameraSettings;
            vECameraSettings.mFpsRange = iArr;
            vECameraSettings.mCameraFrameRateStrategy = C1DJ5.DYNAMIC_FRAMERATE_WITHOUT_SELECT;
            return this;
        }

        public Builder setHwLevel(CAMERA_HW_LEVEL camera_hw_level) {
            this.mExportCameraSettings.mHwLevel = camera_hw_level;
            return this;
        }

        public Builder setIsUseNewCameraTypeStrategy(boolean z) {
            this.mExportCameraSettings.mIsUseNewCameraTypeStrategy = z;
            return this;
        }

        public Builder setMaxWidth(int i) {
            this.mExportCameraSettings.mMaxWidth = i;
            return this;
        }

        public Builder setMaxWidthTakePictureSizeAccuracy(float f) {
            this.mExportCameraSettings.mMaxWidthTakePictureSizeAccuracy = f;
            return this;
        }

        public Builder setMonitorRuntimeInfoPeriod(long j) {
            this.mExportCameraSettings.mRuntimeInfoMonitorPeriod = j;
            return this;
        }

        public Builder setOptionFlag(byte b) {
            this.mExportCameraSettings.mOptionFlags = b;
            return this;
        }

        public Builder setPreferOpenCameraByCameraId(boolean z) {
            this.mExportCameraSettings.mPreferOpenCameraByCameraId = z;
            return this;
        }

        public Builder setPreviewSizeStrategy(EnumC19386710sz enumC19386710sz) {
            this.mExportCameraSettings.mPreviewSizeStrategy = enumC19386710sz;
            return this;
        }

        public Builder setRecordStreamFolderPath(String str) {
            this.mExportCameraSettings.mRecordStreamFolderPath = str;
            return this;
        }

        public Builder setRetryCnt(int i) {
            this.mExportCameraSettings.mRetryCnt = i;
            return this;
        }

        public Builder setRetryStartPreviewCnt(int i) {
            this.mExportCameraSettings.mRetryStartPreviewCnt = i;
            return this;
        }

        public Builder setSceneMode(String str) {
            this.mExportCameraSettings.mSceneMode = str;
            return this;
        }

        public Builder setUseMaxWidthTakePicture(boolean z) {
            this.mExportCameraSettings.mUseMaxWidthTakePicture = z;
            return this;
        }

        public Builder setUseSyncModeOnCamera2(boolean z) {
            this.mExportCameraSettings.mUseSyncModeOnCamera2 = z;
            return this;
        }

        public Builder setCameraFacing(CAMERA_FACING_ID camera_facing_id, String str) {
            VECameraSettings vECameraSettings = this.mExportCameraSettings;
            vECameraSettings.mCameraFacing = camera_facing_id;
            vECameraSettings.mStrCameraHardwareID = str;
            return this;
        }

        public Builder setCaptureSize(int i, int i2) {
            this.mExportCameraSettings.mCaptureSize = new VESize(i, i2);
            return this;
        }

        public Builder setPreviewSize(int i, int i2) {
            this.mExportCameraSettings.mPreviewSize = new VESize(i, i2);
            return this;
        }

        public Builder setSecondaryPreviewSize(int i, int i2) {
            this.mExportCameraSettings.mSecondaryPreviewSize = new VESize(i, i2);
            return this;
        }
    }

    public static EnumC19367110pp getCameraOutputAndUpdateStrategy() {
        EnumC19367110pp enumC19367110pp = EnumC19367110pp.STRATEGY_DEFAULT;
        int value = VEConfigCenter.getInstance().getValue("ve_camera_output_and_update_strategy", 0);
        if (value == 1) {
            enumC19367110pp = EnumC19367110pp.STRATEGY_ONETHREAD_ONEOUT;
        } else if (value == 2) {
            enumC19367110pp = EnumC19367110pp.STRATEGY_ONETHREAD_TWOOUT;
        } else if (value == 3) {
            enumC19367110pp = EnumC19367110pp.STRATEGY_TWOTHREAD_ONEOUT;
        } else if (value == 4) {
            enumC19367110pp = EnumC19367110pp.STRATEGY_TWOTHREAD_TWOOUT;
        }
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ve_camera_output_and_update_strategy: ");
        sbLIZ.append(value);
        sbLIZ.append(", enum:");
        sbLIZ.append(enumC19367110pp);
        C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        return enumC19367110pp;
    }

    public EnumC19366110pf getCameraFaceDetect() {
        this.mExtParameters.putInt("useCameraFaceDetect", this.mFaceAEStrategy.ordinal());
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("faceae strategy: ");
        sbLIZ.append(this.mFaceAEStrategy);
        C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        return this.mFaceAEStrategy;
    }

    public C1DJ5 getCameraFrameRateStrategy() {
        C1DJ5 c1dj5 = this.mCameraFrameRateStrategy;
        C1DJ5 c1dj52 = C1DJ5.DYNAMIC_FRAMERATE;
        if (c1dj5 == c1dj52) {
            Integer num = (Integer) VEConfigCenter.getInstance().getValue("frame_rate_strategy", VEConfigCenter.DataType.INTEGER, 0).getValue();
            if (num.intValue() == 1) {
                this.mCameraFrameRateStrategy = C1DJ5.FIXED_FRAMERATE_FOR_ALL;
            } else if (num.intValue() == 2) {
                this.mCameraFrameRateStrategy = C1DJ5.FIXED_FRAMERATE_FOR_REAR;
            } else if (num.intValue() == 3) {
                this.mCameraFrameRateStrategy = C1DJ5.DYNAMIC_FRAMERATE_WITHOUT_SELECT;
            } else {
                this.mCameraFrameRateStrategy = c1dj52;
            }
        }
        return this.mCameraFrameRateStrategy;
    }

    public CAMERA_TYPE getCameraType() {
        if (this.mConfigCameraType == CAMERA_TYPE.NULL) {
            this.mConfigCameraType = getCameraTypeFromConfigCenter(this.mDefaultCameraTypeInNewCameraStrategy, this.mbDontUseVendorCamera);
        }
        return this.mConfigCameraType;
    }

    public boolean getDualCameraExtensionScheme() {
        if (!this.mbDualCameraExpansionScheme) {
            this.mbDualCameraExpansionScheme = VEConfigCenter.getInstance().getValue("ve_dual_camera_expansion_scheme", false).booleanValue();
        }
        return this.mbDualCameraExpansionScheme;
    }

    public int getFpsMaxLimit() {
        VEConfigCenter.ValuePkt value;
        if (this.mFpsMaxLimit == 30 && (value = VEConfigCenter.getInstance().getValue("ve_camera_fps_max", VEConfigCenter.DataType.INTEGER, 0)) != null && (value.getValue() instanceof Integer)) {
            this.mFpsMaxLimit = ((Integer) value.getValue()).intValue();
        }
        return this.mFpsMaxLimit;
    }

    public int[] getFpsRange() {
        int value;
        if (this.mCameraFrameRateStrategy != C1DJ5.DYNAMIC_FRAMERATE_WITHOUT_SELECT && this.mFpsRange[0] == 7 && (value = VEConfigCenter.getInstance().getValue("ve_camera_fps_range", 7)) != 0) {
            this.mFpsRange[0] = value;
        }
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Camera FpsRange:[");
        sbLIZ.append(this.mFpsRange[0]);
        sbLIZ.append(", ");
        sbLIZ.append(this.mFpsRange[1]);
        sbLIZ.append(e3.f);
        C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        return this.mFpsRange;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isEnableRefactorFocusAndMeter() {
        /*
            r3 = this;
            boolean r0 = r3.mEnableRefactorFocusAndMeter
            if (r0 != 0) goto L16
            com.ss.android.vesdk.VEConfigCenter r2 = com.ss.android.vesdk.VEConfigCenter.getInstance()
            java.lang.String r0 = "ve_enable_refactor_camera_focus"
            r1 = 0
            java.lang.Boolean r0 = r2.getValue(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
        L16:
            r1 = 1
        L17:
            r3.mEnableRefactorFocusAndMeter = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VECameraSettings.isEnableRefactorFocusAndMeter():boolean");
    }

    public boolean isEnableYuvBufferCapture() {
        VEConfigCenter.ValuePkt value;
        if (!this.mEnableYuvBufferCapture && (value = VEConfigCenter.getInstance().getValue("ve_enable_yuv_buffer_capture", VEConfigCenter.DataType.BOOLEAN, Boolean.FALSE)) != null && value.getValue() != null && (value.getValue() instanceof Boolean) && ((Boolean) value.getValue()).booleanValue()) {
            this.mEnableYuvBufferCapture = true;
        }
        return this.mEnableYuvBufferCapture;
    }

    public boolean isOptCameraSceneFps() {
        return this.mOptCameraSceneFps || VEConfigCenter.getInstance().getValue("ve_camera_scene_diff_fps_opt", false).booleanValue();
    }

    public void swapPreviewSize() {
        VESize vESize = this.mPreviewSize;
        VESize vESize2 = new VESize(vESize.width, vESize.height);
        VESize vESize3 = this.mPreviewSize;
        VESize vESize4 = this.mSecondaryPreviewSize;
        vESize3.width = vESize4.width;
        vESize3.height = vESize4.height;
        vESize4.width = vESize2.width;
        vESize4.height = vESize2.height;
    }

    public VECameraSettings() {
        this.CameraHWLevelTE2Android = new int[]{2, 0, 1, 3};
        this.CameraHWLevelAndroid2TE = new int[]{1, 2, 0, 3};
        this.mFps = 30;
        this.mPreviewSize = new VESize(720, 1280);
        this.mSecondaryPreviewSize = new VESize(720, 960);
        this.mFpsRange = new int[]{7, 30};
        this.mHwLevel = CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LIMITED;
        CAMERA_TYPE camera_type = CAMERA_TYPE.TYPE1;
        this.mCameraType = camera_type;
        this.mConfigCameraType = CAMERA_TYPE.NULL;
        this.mIsUseNewCameraTypeStrategy = false;
        this.mDefaultCameraTypeInNewCameraStrategy = CAMERA_TYPE.TYPE2;
        this.mbDontUseVendorCamera = false;
        CAMERA_FACING_ID camera_facing_id = CAMERA_FACING_ID.FACING_FRONT;
        this.mCameraFacing = camera_facing_id;
        this.mStrCameraHardwareID = "-1";
        this.mSceneMode = "auto";
        this.mCameraAntiShake = false;
        this.mbDualCameraExpansionScheme = false;
        this.mCameraFrameRateStrategy = C1DJ5.DYNAMIC_FRAMERATE;
        this.mFaceAEStrategy = EnumC19366110pf.ENABLE_FACEAE_FOR_ALL;
        this.mEnableWideFOV = false;
        this.mIsUseHint = false;
        this.mEnableSurfaceSharing = false;
        this.mIsCameraOpenCloseSync = true;
        this.mIsForceCloseCamera = true;
        this.mFocusTimeoutMS = 2500;
        this.mEnableGcForCameraMetadataThreshold = 0;
        this.mFpsMaxLimit = 30;
        this.mOptCameraSceneFps = false;
        this.mEnableYuvBufferCapture = false;
        this.mUseMaxWidthTakePicture = false;
        this.mMaxWidthTakePictureSizeAccuracy = 0.0f;
        this.mMaxWidth = 0;
        this.mEnablePreviewTemplate = false;
        this.mOptionFlags = (byte) 1;
        this.mCaptureSize = new VESize(-1, -1);
        this.mEnableFallback = true;
        this.mCameraMode = CAMERA_MODE_TYPE.VIDEO_MODE;
        this.mUseSyncModeOnCamera2 = false;
        this.mCameraZoomLimitFactor = -1.0f;
        this.mEnableZsl = false;
        this.mEnableManualReleaseCaptureResult = true;
        this.mRetryCnt = 0;
        this.mRetryStartPreviewCnt = 0;
        this.mEnableRecordStream = false;
        this.mEnableRecord60Fps = false;
        this.mRecordStreamFolderPath = "";
        this.mCamera2RetryCnt = 1;
        this.mEnableHDR10BitRecord = false;
        this.mEnableStabilization = false;
        this.mStabilizationMode = EnumC2244671CtN.OFF;
        this.mDynamicRangeProfile = 1L;
        this.mFpsMode = C1DIX.DEFAULT;
        this.mCaptureFlashStrategy = CAMERA_CAPTURE_FLASH_STRATEGY.FlashOnSimulatedStrategy;
        this.mCameraPreviewIndependent = false;
        this.mPreferOpenCameraByCameraId = false;
        this.mEnablePreviewingFallback = false;
        this.mEnableOpenCamera1Opt = true;
        this.mEnableRefactorFocusAndMeter = false;
        this.mEnableForceRestartWhenCameraError = false;
        this.mBindSurfaceLifecycleToCamera = false;
        this.mEnableMonitorRuntimeInfo = true;
        this.mRuntimeInfoMonitorPeriod = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.mCameraPrivacyCertMap = null;
        this.mPreviewSizeStrategy = EnumC19386710sz.DEFAULT;
        this.mVESetCameraTwoOutputMode = false;
        this.mDefaultZoomRatio = 1.0f;
        this.mDefaultZoomUsingZoomV2 = true;
        this.mCameraType = camera_type;
        this.mCameraFacing = camera_facing_id;
        this.mFps = 30;
        VESize vESize = this.mPreviewSize;
        vESize.width = 720;
        vESize.height = 1280;
        VESize vESize2 = this.mSecondaryPreviewSize;
        vESize2.width = 720;
        vESize2.height = 960;
        this.mExtParameters = new Bundle();
    }

    public boolean getCameraCaptureHdrFromCenter() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_camera_capture_hdr", VEConfigCenter.DataType.BOOLEAN, Boolean.FALSE);
        if (value == null || value.getValue() == null || !(value.getValue() instanceof Boolean)) {
            return false;
        }
        return ((Boolean) value.getValue()).booleanValue();
    }

    public int getCameraCaptureMFNRFromCenter() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("key_camera_capture_mfnr", VEConfigCenter.DataType.INTEGER, 0);
        if (value == null || value.getValue() == null || !(value.getValue() instanceof Integer)) {
            return 0;
        }
        return ((Integer) value.getValue()).intValue();
    }

    public boolean getCameraHdrDisableFromCenter() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_disable_camera_hdr", VEConfigCenter.DataType.BOOLEAN, Boolean.FALSE);
        if (value == null || value.getValue() == null || !(value.getValue() instanceof Boolean)) {
            return false;
        }
        return ((Boolean) value.getValue()).booleanValue();
    }

    public boolean getCameraNoiseReduceFromCenter() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_enable_camera_noise_reduce", VEConfigCenter.DataType.BOOLEAN, Boolean.FALSE);
        if (value == null || value.getValue() == null || !(value.getValue() instanceof Boolean)) {
            return false;
        }
        return ((Boolean) value.getValue()).booleanValue();
    }

    public boolean getCameraRDHWRecordDisableFromCenter() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_camera_disable_rdhw_record", VEConfigCenter.DataType.BOOLEAN, Boolean.FALSE);
        if (value == null || value.getValue() == null || !(value.getValue() instanceof Boolean)) {
            return false;
        }
        return ((Boolean) value.getValue()).booleanValue();
    }

    public boolean getCameraVideoModeTemplate() {
        boolean zBooleanValue = VEConfigCenter.getInstance().getValue("ve_enable_camera_preview_template", this.mEnablePreviewTemplate).booleanValue();
        this.mEnablePreviewTemplate = zBooleanValue;
        this.mExtParameters.putBoolean("enablePreviewTemplate", zBooleanValue);
        return this.mEnablePreviewTemplate;
    }

    public int getEnableGcForCameraMetadataThreshold() {
        int value = VEConfigCenter.getInstance().getValue("ve_enable_gc_for_camera_metadata", 0);
        this.mEnableGcForCameraMetadataThreshold = value;
        return value;
    }

    public boolean getEnableSurfaceSharing() {
        boolean zBooleanValue = VEConfigCenter.getInstance().getValue("ve_camera_enable_surface_sharing", this.mEnableSurfaceSharing).booleanValue();
        this.mEnableSurfaceSharing = zBooleanValue;
        return zBooleanValue;
    }

    public boolean getMetadataConfig() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_enable_camera_metadata", VEConfigCenter.DataType.BOOLEAN, Boolean.FALSE);
        if (value == null || value.getValue() == null || !(value.getValue() instanceof Boolean)) {
            return false;
        }
        return ((Boolean) value.getValue()).booleanValue();
    }

    public boolean getWideFOV() {
        this.mEnableWideFOV = VEConfigCenter.getInstance().getValue("ve_enable_wide_fov_for_samsung", this.mEnableWideFOV).booleanValue();
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getWideFOV: ");
        sbLIZ.append(this.mEnableWideFOV);
        C2484209oO.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        return this.mEnableWideFOV;
    }

    public boolean isVESetCameraTwoOutputMode() {
        EnumC19367110pp cameraOutputAndUpdateStrategy = getCameraOutputAndUpdateStrategy();
        boolean z = cameraOutputAndUpdateStrategy == EnumC19367110pp.STRATEGY_ONETHREAD_TWOOUT || cameraOutputAndUpdateStrategy == EnumC19367110pp.STRATEGY_TWOTHREAD_TWOOUT;
        this.mVESetCameraTwoOutputMode = z;
        return z;
    }

    public CAMERA_MODE_TYPE getCamera2OutputMode() {
        return this.mCameraMode;
    }

    public int getCamera2RetryCnt() {
        return this.mCamera2RetryCnt;
    }

    public boolean getCameraAntiShake() {
        return this.mCameraAntiShake;
    }

    public CAMERA_FACING_ID getCameraFacing() {
        return this.mCameraFacing;
    }

    public String getCameraHardwareID() {
        return this.mStrCameraHardwareID;
    }

    public HashMap<EnumC1270990jBB, Cert> getCameraPrivacyCertMap() {
        return this.mCameraPrivacyCertMap;
    }

    public float getCameraZoomLimitFactor() {
        return this.mCameraZoomLimitFactor;
    }

    public CAMERA_CAPTURE_FLASH_STRATEGY getCaptureFlashStrategy() {
        return this.mCaptureFlashStrategy;
    }

    public VESize getCaptureSize() {
        return this.mCaptureSize;
    }

    public float getDefaultZoomRatio() {
        return this.mDefaultZoomRatio;
    }

    public boolean getDefaultZoomUsingZoomV2() {
        return this.mDefaultZoomUsingZoomV2;
    }

    public boolean getDontUseVendorCamera() {
        return this.mbDontUseVendorCamera;
    }

    public long getDynamicRangeProfile() {
        return this.mDynamicRangeProfile;
    }

    public boolean getEnableFallback() {
        return this.mEnableFallback;
    }

    public boolean getEnableHDR10BitRecord() {
        return this.mEnableHDR10BitRecord;
    }

    public boolean getEnableManualReleaseCaptureResult() {
        return this.mEnableManualReleaseCaptureResult;
    }

    public boolean getEnableRecord60Fps() {
        return this.mEnableRecord60Fps;
    }

    public boolean getEnableRecordStream() {
        return this.mEnableRecordStream;
    }

    public boolean getEnableStabilization() {
        return this.mEnableStabilization;
    }

    public boolean getEnableZsl() {
        return this.mEnableZsl;
    }

    public Bundle getExtParameters() {
        return this.mExtParameters;
    }

    public int getFocusTimeout() {
        return this.mFocusTimeoutMS;
    }

    public int getFps() {
        return this.mFps;
    }

    public C1DIX getFpsMode() {
        return this.mFpsMode;
    }

    public CAMERA_HW_LEVEL getHwLevel() {
        return this.mHwLevel;
    }

    public boolean getIsCameraOpenCloseSync() {
        return this.mIsCameraOpenCloseSync;
    }

    public boolean getIsForceCloseCamera() {
        return this.mIsForceCloseCamera;
    }

    public boolean getIsUseHint() {
        return this.mIsUseHint;
    }

    public boolean getIsUseNewCameraTypeStrategy() {
        return this.mIsUseNewCameraTypeStrategy;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public float getMaxWidthTakePictureSizeAccuracy() {
        return this.mMaxWidthTakePictureSizeAccuracy;
    }

    public long getMonitorRuntimeInfoPeriod() {
        return this.mRuntimeInfoMonitorPeriod;
    }

    public byte getOptionFlag() {
        return this.mOptionFlags;
    }

    public VESize getPreviewSize() {
        return this.mPreviewSize;
    }

    public EnumC19386710sz getPreviewSizeStrategy() {
        return this.mPreviewSizeStrategy;
    }

    public String getRecordStreamFolderPath() {
        return this.mRecordStreamFolderPath;
    }

    public int getRetryCnt() {
        return this.mRetryCnt;
    }

    public String getSceneMode() {
        return this.mSceneMode;
    }

    public VESize getSecondaryPreviewSize() {
        return this.mSecondaryPreviewSize;
    }

    public EnumC2244671CtN getStabilizationMode() {
        return this.mStabilizationMode;
    }

    public int getmRetryStartPreviewCnt() {
        return this.mRetryStartPreviewCnt;
    }

    public boolean isBindSurfaceLifecycleToCamera() {
        return this.mBindSurfaceLifecycleToCamera;
    }

    public boolean isCameraPreviewIndependent() {
        return this.mCameraPreviewIndependent;
    }

    public boolean isEnableForceRestartWhenCameraError() {
        return this.mEnableForceRestartWhenCameraError;
    }

    public boolean isEnableMonitorRuntimeInfo() {
        return this.mEnableMonitorRuntimeInfo;
    }

    public boolean isEnableOpenCamera1Opt() {
        return this.mEnableOpenCamera1Opt;
    }

    public boolean isEnablePreviewingFallback() {
        return this.mEnablePreviewingFallback;
    }

    public boolean isPreferOpenCameraByCameraId() {
        return this.mPreferOpenCameraByCameraId;
    }

    public boolean isSyncModeOnCamera2() {
        return this.mUseSyncModeOnCamera2;
    }

    public boolean isUseMaxWidthTakePicture() {
        return this.mUseMaxWidthTakePicture;
    }

    public enum CAMERA_CAPTURE_FLASH_STRATEGY implements Parcelable {
        PreAndMainStrategy,
        TorchFakeStrategy,
        FlashOnRealStrategy,
        FlashOnSimulatedStrategy;

        public static final Parcelable.Creator<CAMERA_CAPTURE_FLASH_STRATEGY> CREATOR = new C2325341G0m(13);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static CAMERA_CAPTURE_FLASH_STRATEGY valueOf(String str) {
            return (CAMERA_CAPTURE_FLASH_STRATEGY) C08FF.LIZ(CAMERA_CAPTURE_FLASH_STRATEGY.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public enum CAMERA_FLASH_MODE implements Parcelable {
        CAMERA_FLASH_OFF,
        CAMERA_FLASH_ON,
        CAMERA_FLASH_TORCH,
        CAMERA_FLASH_AUTO,
        CAMERA_FLASH_RED_EYE,
        CAMERA_FLASH_EXTERNAL;

        public static final Parcelable.Creator<CAMERA_FLASH_MODE> CREATOR = new C2189641Amo(25);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static CAMERA_FLASH_MODE valueOf(String str) {
            return (CAMERA_FLASH_MODE) C08FF.LIZ(CAMERA_FLASH_MODE.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum CAMERA_HW_LEVEL implements Parcelable {
        CAMERA_HW_LEVEL_LEGACY,
        CAMERA_HW_LEVEL_LIMITED,
        CAMERA_HW_LEVEL_FULL,
        CAMERA_HW_LEVEL_LEVEL_3;

        public static final Parcelable.Creator<CAMERA_HW_LEVEL> CREATOR = new C2325341G0m(14);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static CAMERA_HW_LEVEL valueOf(String str) {
            return (CAMERA_HW_LEVEL) C08FF.LIZ(CAMERA_HW_LEVEL.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* JADX INFO: loaded from: classes26.dex */
    public enum CAMERA_MODE_TYPE implements Parcelable {
        VIDEO_MODE,
        IMAGE_MODE,
        AR_MODE;

        public static final Parcelable.Creator<CAMERA_MODE_TYPE> CREATOR = new C1698130uI7(5);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static CAMERA_MODE_TYPE valueOf(String str) {
            return (CAMERA_MODE_TYPE) C08FF.LIZ(CAMERA_MODE_TYPE.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum CAMERA_TYPE implements Parcelable {
        NULL,
        TYPE1,
        TYPE2,
        TYPE_OGXM,
        TYPE_GNOB_MEDIA,
        TYPE_CamKit,
        TYPE_BEWO,
        TYPE_GNOB_Unit,
        TYPE_OGXM_V2,
        TYPE_GNOB,
        TYPE_VENDOR_RDHW,
        TYPE_VENDOR_GNOB;

        public static final Parcelable.Creator<CAMERA_TYPE> CREATOR = new C2325341G0m(15);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static CAMERA_TYPE valueOf(String str) {
            return (CAMERA_TYPE) C08FF.LIZ(CAMERA_TYPE.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public VECameraSettings(Parcel parcel) {
        CAMERA_HW_LEVEL camera_hw_level;
        CAMERA_TYPE camera_type;
        CAMERA_TYPE camera_type2;
        boolean z;
        boolean z2;
        CAMERA_FACING_ID camera_facing_id;
        boolean z3;
        C1DJ5 c1dj5;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        CAMERA_MODE_TYPE camera_mode_type;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        this.CameraHWLevelTE2Android = new int[]{2, 0, 1, 3};
        this.CameraHWLevelAndroid2TE = new int[]{1, 2, 0, 3};
        this.mFps = 30;
        this.mPreviewSize = new VESize(720, 1280);
        this.mSecondaryPreviewSize = new VESize(720, 960);
        this.mFpsRange = new int[]{7, 30};
        this.mHwLevel = CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LIMITED;
        this.mCameraType = CAMERA_TYPE.TYPE1;
        this.mConfigCameraType = CAMERA_TYPE.NULL;
        this.mIsUseNewCameraTypeStrategy = false;
        this.mDefaultCameraTypeInNewCameraStrategy = CAMERA_TYPE.TYPE2;
        this.mbDontUseVendorCamera = false;
        this.mCameraFacing = CAMERA_FACING_ID.FACING_FRONT;
        this.mStrCameraHardwareID = "-1";
        this.mSceneMode = "auto";
        this.mCameraAntiShake = false;
        this.mbDualCameraExpansionScheme = false;
        this.mCameraFrameRateStrategy = C1DJ5.DYNAMIC_FRAMERATE;
        this.mFaceAEStrategy = EnumC19366110pf.ENABLE_FACEAE_FOR_ALL;
        this.mEnableWideFOV = false;
        this.mIsUseHint = false;
        this.mEnableSurfaceSharing = false;
        this.mIsCameraOpenCloseSync = true;
        this.mIsForceCloseCamera = true;
        this.mFocusTimeoutMS = 2500;
        this.mEnableGcForCameraMetadataThreshold = 0;
        this.mFpsMaxLimit = 30;
        this.mOptCameraSceneFps = false;
        this.mEnableYuvBufferCapture = false;
        this.mUseMaxWidthTakePicture = false;
        this.mMaxWidthTakePictureSizeAccuracy = 0.0f;
        this.mMaxWidth = 0;
        this.mEnablePreviewTemplate = false;
        this.mOptionFlags = (byte) 1;
        this.mCaptureSize = new VESize(-1, -1);
        this.mEnableFallback = true;
        this.mCameraMode = CAMERA_MODE_TYPE.VIDEO_MODE;
        this.mUseSyncModeOnCamera2 = false;
        this.mCameraZoomLimitFactor = -1.0f;
        this.mEnableZsl = false;
        this.mEnableManualReleaseCaptureResult = true;
        this.mRetryCnt = 0;
        this.mRetryStartPreviewCnt = 0;
        this.mEnableRecordStream = false;
        this.mEnableRecord60Fps = false;
        this.mRecordStreamFolderPath = "";
        this.mCamera2RetryCnt = 1;
        this.mEnableHDR10BitRecord = false;
        this.mEnableStabilization = false;
        this.mStabilizationMode = EnumC2244671CtN.OFF;
        this.mDynamicRangeProfile = 1L;
        C1DIX c1dix = C1DIX.DEFAULT;
        this.mFpsMode = c1dix;
        this.mCaptureFlashStrategy = CAMERA_CAPTURE_FLASH_STRATEGY.FlashOnSimulatedStrategy;
        this.mCameraPreviewIndependent = false;
        this.mPreferOpenCameraByCameraId = false;
        this.mEnablePreviewingFallback = false;
        this.mEnableOpenCamera1Opt = true;
        this.mEnableRefactorFocusAndMeter = false;
        this.mEnableForceRestartWhenCameraError = false;
        this.mBindSurfaceLifecycleToCamera = false;
        this.mEnableMonitorRuntimeInfo = true;
        this.mRuntimeInfoMonitorPeriod = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.mCameraPrivacyCertMap = null;
        this.mPreviewSizeStrategy = EnumC19386710sz.DEFAULT;
        this.mVESetCameraTwoOutputMode = false;
        this.mDefaultZoomRatio = 1.0f;
        this.mDefaultZoomUsingZoomV2 = true;
        this.CameraHWLevelTE2Android = parcel.createIntArray();
        this.CameraHWLevelAndroid2TE = parcel.createIntArray();
        this.mFps = parcel.readInt();
        this.mPreviewSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.mSecondaryPreviewSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.mFpsRange = parcel.createIntArray();
        int i = parcel.readInt();
        if (i == -1) {
            camera_hw_level = null;
        } else {
            camera_hw_level = CAMERA_HW_LEVEL.values()[i];
        }
        this.mHwLevel = camera_hw_level;
        int i2 = parcel.readInt();
        if (i2 == -1) {
            camera_type = null;
        } else {
            camera_type = CAMERA_TYPE.values()[i2];
        }
        this.mCameraType = camera_type;
        int i3 = parcel.readInt();
        if (i3 == -1) {
            camera_type2 = null;
        } else {
            camera_type2 = CAMERA_TYPE.values()[i3];
        }
        this.mConfigCameraType = camera_type2;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsUseNewCameraTypeStrategy = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mbDontUseVendorCamera = z2;
        int i4 = parcel.readInt();
        if (i4 == -1) {
            camera_facing_id = null;
        } else {
            camera_facing_id = CAMERA_FACING_ID.values()[i4];
        }
        this.mCameraFacing = camera_facing_id;
        this.mStrCameraHardwareID = parcel.readString();
        this.mSceneMode = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.mCameraAntiShake = z3;
        int i5 = parcel.readInt();
        if (i5 == -1) {
            c1dj5 = null;
        } else {
            c1dj5 = C1DJ5.values()[i5];
        }
        this.mCameraFrameRateStrategy = c1dj5;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mEnableWideFOV = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.mIsUseHint = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.mEnableSurfaceSharing = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.mIsCameraOpenCloseSync = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mIsForceCloseCamera = z8;
        this.mFocusTimeoutMS = parcel.readInt();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.mUseMaxWidthTakePicture = z9;
        this.mMaxWidth = parcel.readInt();
        this.mOptionFlags = parcel.readByte();
        this.mCaptureSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.mEnableFallback = z10;
        int i6 = parcel.readInt();
        if (i6 == -1) {
            camera_mode_type = null;
        } else {
            camera_mode_type = CAMERA_MODE_TYPE.values()[i6];
        }
        this.mCameraMode = camera_mode_type;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mUseSyncModeOnCamera2 = z11;
        this.mCameraZoomLimitFactor = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.mEnableZsl = z12;
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.mEnableManualReleaseCaptureResult = z13;
        this.mRetryCnt = parcel.readInt();
        this.mRetryStartPreviewCnt = parcel.readInt();
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.mEnableRecordStream = z14;
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.mEnableRecord60Fps = z15;
        this.mRecordStreamFolderPath = parcel.readString();
        this.mCamera2RetryCnt = parcel.readInt();
        if (parcel.readByte() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.mEnableHDR10BitRecord = z16;
        this.mDynamicRangeProfile = parcel.readLong();
        int i7 = parcel.readInt();
        this.mFpsMode = i7 != -1 ? C1DIX.values()[i7] : c1dix;
        this.mExtParameters = parcel.readBundle();
        int i8 = parcel.readInt();
        this.mCaptureFlashStrategy = i8 != -1 ? CAMERA_CAPTURE_FLASH_STRATEGY.values()[i8] : null;
        if (parcel.readByte() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.mCameraPreviewIndependent = z17;
        if (parcel.readByte() != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.mEnablePreviewingFallback = z18;
        if (parcel.readByte() != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.mEnableRefactorFocusAndMeter = z19;
        if (parcel.readByte() != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        this.mPreferOpenCameraByCameraId = z20;
        if (parcel.readByte() != 0) {
            z21 = true;
        } else {
            z21 = false;
        }
        this.mEnableForceRestartWhenCameraError = z21;
        if (parcel.readByte() != 0) {
            z22 = true;
        } else {
            z22 = false;
        }
        this.mBindSurfaceLifecycleToCamera = z22;
        this.mEnableYuvBufferCapture = parcel.readByte() != 0;
        this.mMaxWidthTakePictureSizeAccuracy = parcel.readFloat();
        this.mDefaultZoomRatio = parcel.readFloat();
        this.mDefaultZoomUsingZoomV2 = parcel.readBoolean();
        this.mPreviewSizeStrategy = EnumC19386710sz.values()[parcel.readInt()];
    }

    public static CAMERA_TYPE cameraTypeConverter(int i) {
        if (i != 2) {
            switch (i) {
                case 6:
                    return CAMERA_TYPE.TYPE_GNOB;
                case 7:
                    return CAMERA_TYPE.TYPE_VENDOR_RDHW;
                case 8:
                    return CAMERA_TYPE.TYPE_VENDOR_GNOB;
                case BdTuring.TYPE_ECAF /* 9 */:
                    return CAMERA_TYPE.TYPE_OGXM_V2;
                default:
                    return CAMERA_TYPE.TYPE2;
            }
        }
        return CAMERA_TYPE.TYPE_GNOB_MEDIA;
    }

    public void enableManualReleaseCaptureResult(boolean z) {
        this.mEnableManualReleaseCaptureResult = z;
    }

    public void setCameraAntiShake(boolean z) {
        this.mCameraAntiShake = z;
    }

    public void setCameraFacing(CAMERA_FACING_ID camera_facing_id) {
        this.mCameraFacing = camera_facing_id;
    }

    public void setCameraType(CAMERA_TYPE camera_type) {
        this.mCameraType = camera_type;
    }

    public void setConfigCameraType(CAMERA_TYPE camera_type) {
        this.mConfigCameraType = camera_type;
    }

    public void setEnableFallback(boolean z) {
        this.mEnableFallback = z;
    }

    public void setEnableRecord60Fps(boolean z) {
        this.mEnableRecord60Fps = z;
    }

    public void setEnableRecordStream(boolean z) {
        this.mEnableRecordStream = z;
    }

    public void setEnableZsl(boolean z) {
        this.mEnableZsl = z;
    }

    public void setFps(int i) {
        this.mFps = i;
    }

    public void setFpsRange(int[] iArr) {
        this.mFpsRange = iArr;
    }

    public void setHwLevel(CAMERA_HW_LEVEL camera_hw_level) {
        this.mHwLevel = camera_hw_level;
    }

    public void setOptionFlag(byte b) {
        this.mOptionFlags = b;
    }

    public void setRecordStreamFolderPath(String str) {
        this.mRecordStreamFolderPath = str;
    }

    public void setSceneMode(String str) {
        this.mSceneMode = str;
    }

    public /* synthetic */ VECameraSettings(C2325341G0m c2325341G0m) {
        this();
    }

    public static CAMERA_TYPE getCameraTypeFromConfigCenter(CAMERA_TYPE camera_type, boolean z) {
        int iIntValue = -1;
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_camera_type", VEConfigCenter.DataType.INTEGER, -1);
        if (value != null && value.getValue() != null && (value.getValue() instanceof Integer)) {
            iIntValue = ((Integer) value.getValue()).intValue();
            if (iIntValue != 0 && !z) {
                camera_type = cameraTypeConverter(iIntValue);
            } else {
                VEConfigCenter.ValuePkt value2 = VEConfigCenter.getInstance().getValue("ve_is_in_camera2_blocklist", VEConfigCenter.DataType.BOOLEAN, Boolean.FALSE);
                if (value2 != null && value2.getValue() != null && (value2.getValue() instanceof Boolean)) {
                    if (((Boolean) value2.getValue()).booleanValue()) {
                        camera_type = CAMERA_TYPE.TYPE1;
                    } else {
                        camera_type = CAMERA_TYPE.TYPE2;
                    }
                }
            }
        }
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCameraTypeFromConfigCenter, cameraType = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", realCameraType = ");
        sbLIZ.append(camera_type);
        C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        return camera_type;
    }

    public void setPreviewSize(int i, int i2) {
        this.mPreviewSize = new VESize(i, i2);
    }

    public void setSecondaryPreviewSize(int i, int i2) {
        this.mSecondaryPreviewSize = new VESize(i, i2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iOrdinal;
        int iOrdinal2;
        int iOrdinal3;
        int iOrdinal4;
        int iOrdinal5;
        int iOrdinal6;
        int iOrdinal7;
        parcel.writeIntArray(this.CameraHWLevelTE2Android);
        parcel.writeIntArray(this.CameraHWLevelAndroid2TE);
        parcel.writeInt(this.mFps);
        parcel.writeParcelable(this.mPreviewSize, i);
        parcel.writeParcelable(this.mSecondaryPreviewSize, i);
        parcel.writeIntArray(this.mFpsRange);
        CAMERA_HW_LEVEL camera_hw_level = this.mHwLevel;
        int iOrdinal8 = -1;
        if (camera_hw_level == null) {
            iOrdinal = -1;
        } else {
            iOrdinal = camera_hw_level.ordinal();
        }
        parcel.writeInt(iOrdinal);
        CAMERA_TYPE camera_type = this.mCameraType;
        if (camera_type == null) {
            iOrdinal2 = -1;
        } else {
            iOrdinal2 = camera_type.ordinal();
        }
        parcel.writeInt(iOrdinal2);
        CAMERA_TYPE camera_type2 = this.mConfigCameraType;
        if (camera_type2 == null) {
            iOrdinal3 = -1;
        } else {
            iOrdinal3 = camera_type2.ordinal();
        }
        parcel.writeInt(iOrdinal3);
        parcel.writeByte(this.mIsUseNewCameraTypeStrategy ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mbDontUseVendorCamera ? (byte) 1 : (byte) 0);
        CAMERA_FACING_ID camera_facing_id = this.mCameraFacing;
        if (camera_facing_id == null) {
            iOrdinal4 = -1;
        } else {
            iOrdinal4 = camera_facing_id.ordinal();
        }
        parcel.writeInt(iOrdinal4);
        parcel.writeString(this.mStrCameraHardwareID);
        parcel.writeString(this.mSceneMode);
        parcel.writeByte(this.mCameraAntiShake ? (byte) 1 : (byte) 0);
        C1DJ5 c1dj5 = this.mCameraFrameRateStrategy;
        if (c1dj5 == null) {
            iOrdinal5 = -1;
        } else {
            iOrdinal5 = c1dj5.ordinal();
        }
        parcel.writeInt(iOrdinal5);
        parcel.writeByte(this.mEnableWideFOV ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsUseHint ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mEnableSurfaceSharing ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsCameraOpenCloseSync ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsForceCloseCamera ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mFocusTimeoutMS);
        parcel.writeByte(this.mUseMaxWidthTakePicture ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mMaxWidth);
        parcel.writeByte(this.mOptionFlags);
        parcel.writeParcelable(this.mCaptureSize, i);
        parcel.writeByte(this.mEnableFallback ? (byte) 1 : (byte) 0);
        CAMERA_MODE_TYPE camera_mode_type = this.mCameraMode;
        if (camera_mode_type == null) {
            iOrdinal6 = -1;
        } else {
            iOrdinal6 = camera_mode_type.ordinal();
        }
        parcel.writeInt(iOrdinal6);
        parcel.writeByte(this.mUseSyncModeOnCamera2 ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.mCameraZoomLimitFactor);
        parcel.writeByte(this.mEnableZsl ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mEnableManualReleaseCaptureResult ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mRetryCnt);
        parcel.writeInt(this.mRetryStartPreviewCnt);
        parcel.writeByte(this.mEnableRecordStream ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mEnableRecord60Fps ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mRecordStreamFolderPath);
        parcel.writeInt(this.mCamera2RetryCnt);
        parcel.writeByte(this.mEnableHDR10BitRecord ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.mDynamicRangeProfile);
        C1DIX c1dix = this.mFpsMode;
        if (c1dix == null) {
            iOrdinal7 = -1;
        } else {
            iOrdinal7 = c1dix.ordinal();
        }
        parcel.writeInt(iOrdinal7);
        parcel.writeBundle(this.mExtParameters);
        CAMERA_CAPTURE_FLASH_STRATEGY camera_capture_flash_strategy = this.mCaptureFlashStrategy;
        if (camera_capture_flash_strategy != null) {
            iOrdinal8 = camera_capture_flash_strategy.ordinal();
        }
        parcel.writeInt(iOrdinal8);
        parcel.writeByte(this.mCameraPreviewIndependent ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mEnablePreviewingFallback ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mEnableRefactorFocusAndMeter ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mPreferOpenCameraByCameraId ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mEnableForceRestartWhenCameraError ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mBindSurfaceLifecycleToCamera ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mEnableYuvBufferCapture ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.mMaxWidthTakePictureSizeAccuracy);
        parcel.writeFloat(this.mDefaultZoomRatio);
        parcel.writeBoolean(this.mDefaultZoomUsingZoomV2);
        parcel.writeInt(this.mPreviewSizeStrategy.ordinal());
    }
}
