package com.ss.android.vesdk;

import X.C08FF;
import X.C2185991Agv;
import X.C2189641Amo;
import X.EnumC1153050g6x;
import X.EnumC1153060g6y;
import X.EnumC19367110pp;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.vesdk.VEConfigCenter;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public class VEPreviewSettings {
    public boolean mBlockRenderExit;
    public VESize mCanvasSize;
    public int mCaptureRenderFinalWidth;
    public boolean mCheckStatusWhenStopPreview;
    public boolean mDisableEffectInternalSetting;
    public VEDisplaySettings mDisplaySettings;
    public long mEffectAlgorithmRequirement;
    public boolean mEnable3buffer;
    public boolean mEnableDestroyEffectInStopPreview;
    public boolean mEnableEGLImage;
    public boolean mEnableEffectRT;
    public boolean mEnableMakeUpBackground;
    public boolean mEnablePreloadEffectRes;
    public List<C2185991Agv> mExternalCapturePipelines;
    public boolean mOptFirstFrame;
    public int mOptFirstFrameBypassEffectFrameCnt;
    public boolean mSwitchEffectInGLTask;
    public VESize mRenderSize = new VESize(720, 1280);
    public boolean mEnableAudioRecord = false;
    public boolean mIsAsyncDetection = false;
    public boolean mAudioPreStartEnable = false;
    public boolean mEnableNewEffectAlgorithmAsync = false;
    public boolean mCameraFrameUpdateIndependentThread = false;
    public int maxCountOfBufCache = 3;
    public boolean mDisEnableEffectWhenNoUsed = false;
    public boolean enableReducePerFrameCallbackOptimization = false;
    public int mFirstNFrameIntervalsAverageCnt = 5;
    public EnumC1153050g6x mContentType = EnumC1153050g6x.RecordFullContent;
    public boolean mEnablePureHDR10BitProcessingPipeline = false;
    public boolean mEnableHDR10BitProcessingPipeline = false;
    public boolean mEnableDynamicRecordContentType = false;
    public boolean mEnableLens = false;
    public int mCaptureRenderMaxWidth = Integer.MAX_VALUE;
    public boolean mIsSyncCapture = false;
    public boolean mRecordEffectContentHighSpeed = false;
    public boolean mNeedPostProcess = true;
    public EnumC1153060g6y graphType = EnumC1153060g6y.LV_GRAPH_TYPE;
    public boolean mEnableEffectAmazingEngine = true;
    public boolean mEnable2DEngineEffect = true;
    public boolean mFollowShotIndependentThread = false;
    public boolean mForceSetFollowShotIndependentThread = false;
    public boolean mEnableRenderLayer = false;
    public boolean mEnableModelHotUpdate = false;
    public boolean mEnableAudioDecodeTimeOpt = false;
    public boolean mForceDecodeTimeOpt = false;
    public boolean mVideoDecodeUseSetMultiTrackStatus = true;
    public boolean mEnableRenderThreadSelfDrive = false;
    public int mRenderThreadSelfDriveConfig = 0;
    public boolean forceRenderThreadSelfDriveConfig = false;
    public boolean mEnableRecordMattingOpt = false;
    public boolean mForceEnableRecordMattingOpt = false;
    public boolean mEnablePlayAVSyncOpt = false;
    public CAMERA_OUTPUT_MODE mOutputMode = CAMERA_OUTPUT_MODE.SURFACE;

    public static class Builder {
        public VEPreviewSettings mExportPreviewSettings;

        public Builder() {
            this.mExportPreviewSettings = new VEPreviewSettings();
        }

        public VEPreviewSettings build() {
            return this.mExportPreviewSettings;
        }

        public Builder(VEPreviewSettings vEPreviewSettings) {
            this.mExportPreviewSettings = vEPreviewSettings;
        }

        public Builder blockRenderExit(boolean z) {
            this.mExportPreviewSettings.mBlockRenderExit = z;
            return this;
        }

        public Builder disableEffectInternalSetting(boolean z) {
            this.mExportPreviewSettings.mDisableEffectInternalSetting = z;
            return this;
        }

        public Builder enable2DEngineEffect(boolean z) {
            this.mExportPreviewSettings.mEnable2DEngineEffect = z;
            return this;
        }

        public Builder enable3buffer(boolean z) {
            this.mExportPreviewSettings.mEnable3buffer = z;
            return this;
        }

        public Builder enableAudioDecodeTimeOpt(boolean z) {
            VEPreviewSettings vEPreviewSettings = this.mExportPreviewSettings;
            vEPreviewSettings.mForceDecodeTimeOpt = true;
            vEPreviewSettings.mEnableAudioDecodeTimeOpt = z;
            return this;
        }

        public Builder enableAudioPreStart(boolean z) {
            this.mExportPreviewSettings.mAudioPreStartEnable = z;
            return this;
        }

        public Builder enableAudioRecord(boolean z) {
            this.mExportPreviewSettings.mEnableAudioRecord = z;
            return this;
        }

        public Builder enableCheckStatusWhenStopPreview(boolean z) {
            this.mExportPreviewSettings.mCheckStatusWhenStopPreview = z;
            return this;
        }

        public Builder enableDestroyEffectInStopPreview(boolean z) {
            this.mExportPreviewSettings.mEnableDestroyEffectInStopPreview = z;
            return this;
        }

        public Builder enableDynamicRecordContentType(boolean z) {
            this.mExportPreviewSettings.mEnableDynamicRecordContentType = z;
            return this;
        }

        public Builder enableEGLImage(boolean z) {
            this.mExportPreviewSettings.mEnableEGLImage = z;
            return this;
        }

        public Builder enableEffectAmazingEngine(boolean z) {
            this.mExportPreviewSettings.mEnableEffectAmazingEngine = z;
            return this;
        }

        public Builder enableEffectRT(boolean z) {
            this.mExportPreviewSettings.mEnableEffectRT = z;
            return this;
        }

        public Builder enableFollowShotIndependentThread(boolean z) {
            VEPreviewSettings vEPreviewSettings = this.mExportPreviewSettings;
            vEPreviewSettings.mForceSetFollowShotIndependentThread = true;
            vEPreviewSettings.mFollowShotIndependentThread = z;
            return this;
        }

        public Builder enableLens(boolean z) {
            this.mExportPreviewSettings.mEnableLens = z;
            return this;
        }

        public Builder enableMakeUpBackground(boolean z) {
            this.mExportPreviewSettings.mEnableMakeUpBackground = z;
            return this;
        }

        public Builder enableModelHotUpdate(boolean z) {
            this.mExportPreviewSettings.mEnableModelHotUpdate = z;
            return this;
        }

        public Builder enablePlayAVSyncOpt(boolean z) {
            this.mExportPreviewSettings.mEnablePlayAVSyncOpt = z;
            return this;
        }

        public Builder enablePreloadEffectRes(boolean z) {
            this.mExportPreviewSettings.mEnablePreloadEffectRes = z;
            return this;
        }

        public Builder enableRecordEffectContentHighSpeed(boolean z) {
            this.mExportPreviewSettings.mRecordEffectContentHighSpeed = z;
            return this;
        }

        public Builder enableRecordMattingOpt(boolean z) {
            VEPreviewSettings vEPreviewSettings = this.mExportPreviewSettings;
            vEPreviewSettings.mEnableRecordMattingOpt = z;
            vEPreviewSettings.mForceEnableRecordMattingOpt = true;
            return this;
        }

        public Builder enableReducePerFrameCallbackOptimization(boolean z) {
            this.mExportPreviewSettings.enableReducePerFrameCallbackOptimization = z;
            return this;
        }

        public Builder enableRenderLayer(boolean z) {
            VEPreviewSettings vEPreviewSettings = this.mExportPreviewSettings;
            vEPreviewSettings.mEnableRenderLayer = z;
            if (z) {
                vEPreviewSettings.mEnableModelHotUpdate = true;
            }
            return this;
        }

        public Builder enableRenderThreadSelfDrive(boolean z) {
            this.mExportPreviewSettings.mEnableRenderThreadSelfDrive = z;
            return this;
        }

        public Builder enableSyncCapture(boolean z) {
            this.mExportPreviewSettings.mIsSyncCapture = z;
            return this;
        }

        public Builder firstNFrameIntervalsAverageCnt(int i) {
            this.mExportPreviewSettings.mFirstNFrameIntervalsAverageCnt = i;
            return this;
        }

        public Builder optFirstFrame(boolean z) {
            this.mExportPreviewSettings.mOptFirstFrame = z;
            return this;
        }

        public Builder setAsyncDetection(boolean z) {
            this.mExportPreviewSettings.mIsAsyncDetection = z;
            return this;
        }

        public Builder setCameraUpdateIndependentThread(boolean z) {
            this.mExportPreviewSettings.mCameraFrameUpdateIndependentThread = z;
            return this;
        }

        public Builder setCaptureRenderFinalWidth(int i) {
            this.mExportPreviewSettings.mCaptureRenderFinalWidth = i;
            return this;
        }

        public Builder setCaptureRenderMaxWidth(int i) {
            this.mExportPreviewSettings.mCaptureRenderMaxWidth = i;
            return this;
        }

        public Builder setDisEnableEffectWhenNoUsed(boolean z) {
            this.mExportPreviewSettings.mDisEnableEffectWhenNoUsed = z;
            return this;
        }

        public Builder setDisplaySettings(VEDisplaySettings vEDisplaySettings) {
            this.mExportPreviewSettings.mDisplaySettings = vEDisplaySettings;
            return this;
        }

        public Builder setEffectAlgorithmRequirement(long j) {
            this.mExportPreviewSettings.mEffectAlgorithmRequirement = j;
            return this;
        }

        public Builder setExternalCapturePipelines(List<C2185991Agv> list) {
            this.mExportPreviewSettings.mExternalCapturePipelines = list;
            return this;
        }

        public Builder setGraphMode(EnumC1153060g6y enumC1153060g6y) {
            this.mExportPreviewSettings.graphType = enumC1153060g6y;
            return this;
        }

        public Builder setMaxCountOfBufCache(int i) {
            this.mExportPreviewSettings.maxCountOfBufCache = i;
            return this;
        }

        public Builder setNeedPostProcess(boolean z) {
            this.mExportPreviewSettings.mNeedPostProcess = z;
            return this;
        }

        public Builder setNewEffectAlgorithmAsync(boolean z) {
            this.mExportPreviewSettings.mEnableNewEffectAlgorithmAsync = z;
            return this;
        }

        public Builder setOutPutMode(CAMERA_OUTPUT_MODE camera_output_mode) {
            this.mExportPreviewSettings.mOutputMode = camera_output_mode;
            return this;
        }

        public Builder setRecordContentType(EnumC1153050g6x enumC1153050g6x) {
            this.mExportPreviewSettings.mContentType = enumC1153050g6x;
            return this;
        }

        public Builder setRenderSize(VESize vESize) {
            this.mExportPreviewSettings.mRenderSize = vESize;
            return this;
        }

        public Builder setRenderThreadSelfDriveConfig(int i) {
            VEPreviewSettings vEPreviewSettings = this.mExportPreviewSettings;
            vEPreviewSettings.mRenderThreadSelfDriveConfig = i;
            vEPreviewSettings.forceRenderThreadSelfDriveConfig = true;
            return this;
        }

        public Builder setVideoDecodeUseSetMultiTrackStatus(boolean z) {
            this.mExportPreviewSettings.mVideoDecodeUseSetMultiTrackStatus = z;
            return this;
        }

        public Builder switchEffectInGLTask(boolean z) {
            this.mExportPreviewSettings.mSwitchEffectInGLTask = z;
            return this;
        }

        public Builder enableHDR10BitProcessingPipeline(boolean z, boolean z2) {
            VEPreviewSettings vEPreviewSettings = this.mExportPreviewSettings;
            vEPreviewSettings.mEnableHDR10BitProcessingPipeline = z;
            vEPreviewSettings.mEnablePureHDR10BitProcessingPipeline = z2;
            return this;
        }
    }

    public boolean getAudioDecodeTimeOpt() {
        return this.mForceDecodeTimeOpt ? this.mEnableAudioDecodeTimeOpt : VEConfigCenter.getInstance().getValue("ve_enanle_titan_audio_decode_time_opt", false).booleanValue();
    }

    public int getRecordContentType() {
        return this.mContentType.ordinal();
    }

    public boolean isEnableRecordMattingOpt() {
        if (this.mForceEnableRecordMattingOpt) {
            return this.mEnableRecordMattingOpt;
        }
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_enable_record_async_framework", VEConfigCenter.DataType.BOOLEAN, Boolean.FALSE);
        if (value != null) {
            return ((Boolean) value.getValue()).booleanValue();
        }
        return false;
    }

    public boolean isFollowShotIndependentThread() {
        if (this.mForceSetFollowShotIndependentThread) {
            return this.mFollowShotIndependentThread;
        }
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_titan_follow_shot_independent_thread", VEConfigCenter.DataType.BOOLEAN, Boolean.FALSE);
        if (value != null && value.getValue() != null && (value.getValue() instanceof Boolean)) {
            this.mFollowShotIndependentThread = ((Boolean) value.getValue()).booleanValue();
        }
        return this.mFollowShotIndependentThread;
    }

    public int getHwDecodeConfig() {
        return VEConfigCenter.getInstance().getValue("ve_enable_record_hw_decode", 0);
    }

    public boolean isEnableCameraFrameUpdateIndependentThread() {
        EnumC19367110pp cameraOutputAndUpdateStrategy = VECameraSettings.getCameraOutputAndUpdateStrategy();
        if (VEConfigCenter.getInstance().getValue("ve_camera_frame_update_independent_thread", false).booleanValue() || cameraOutputAndUpdateStrategy == EnumC19367110pp.STRATEGY_TWOTHREAD_ONEOUT || cameraOutputAndUpdateStrategy == EnumC19367110pp.STRATEGY_TWOTHREAD_TWOOUT) {
            this.mCameraFrameUpdateIndependentThread = true;
        }
        return this.mCameraFrameUpdateIndependentThread;
    }

    public boolean isEnableNewEffectAlgorithmAsync() {
        if (VEConfigCenter.getInstance().getValue("ve_new_effect_algorithm_async", false).booleanValue()) {
            this.mEnableNewEffectAlgorithmAsync = true;
        }
        return this.mEnableNewEffectAlgorithmAsync;
    }

    public boolean isEnablePassEffectWhenNoEffectFilter() {
        return VEConfigCenter.getInstance().getValue("ve_enable_pass_effect_when_no_effect_filter", false).booleanValue();
    }

    public boolean isEnableTitanAudioOpt() {
        return VEConfigCenter.getInstance().getValue("ve_titan_audio_opt", false).booleanValue();
    }

    public boolean isPreloadEffectResEnabled() {
        if (VEConfigCenter.getInstance().getValue("ve_enable_preload_effect_res", false).booleanValue()) {
            this.mEnablePreloadEffectRes = true;
        }
        return this.mEnablePreloadEffectRes;
    }

    public boolean checkStatusWhenStopPreview() {
        return this.mCheckStatusWhenStopPreview;
    }

    public VESize getCanvasSize() {
        return this.mCanvasSize;
    }

    public int getCaptureRenderFinalWidth() {
        return this.mCaptureRenderFinalWidth;
    }

    public int getCaptureRenderMaxWidth() {
        return this.mCaptureRenderMaxWidth;
    }

    public boolean getDisEnableEffectWhenNoUsed() {
        return this.mDisEnableEffectWhenNoUsed;
    }

    public VEDisplaySettings getDisplaySettings() {
        return this.mDisplaySettings;
    }

    public long getEffectAlgorithmRequirement() {
        return this.mEffectAlgorithmRequirement;
    }

    public boolean getEnableLens() {
        return this.mEnableLens;
    }

    public List<C2185991Agv> getExternalCapturePipelines() {
        return this.mExternalCapturePipelines;
    }

    public int getFirstNFrameIntervalsAverageCnt() {
        return this.mFirstNFrameIntervalsAverageCnt;
    }

    public boolean getForceRenderThreadSelfDriveConfig() {
        return this.forceRenderThreadSelfDriveConfig;
    }

    public EnumC1153060g6y getGraphType() {
        return this.graphType;
    }

    public int getMaxCountOfBufCache() {
        return this.maxCountOfBufCache;
    }

    public CAMERA_OUTPUT_MODE getOutputMode() {
        return this.mOutputMode;
    }

    public VESize getRenderSize() {
        return this.mRenderSize;
    }

    public int getRenderThreadSelfDriveConfig() {
        return this.mRenderThreadSelfDriveConfig;
    }

    public boolean is3bufferEnable() {
        return this.mEnable3buffer;
    }

    public boolean isAsyncDetection() {
        return this.mIsAsyncDetection;
    }

    public boolean isAudioPreStartEnable() {
        return this.mAudioPreStartEnable;
    }

    public boolean isAudioRecordEnabled() {
        return this.mEnableAudioRecord;
    }

    public boolean isBlockRenderExit() {
        return this.mBlockRenderExit;
    }

    public boolean isEGLImageEnable() {
        return this.mEnableEGLImage;
    }

    public boolean isEffectInternalSettingDisabled() {
        return this.mDisableEffectInternalSetting;
    }

    public boolean isEffectRTEnable() {
        return this.mEnableEffectRT;
    }

    public boolean isEnable2DEngineEffect() {
        return this.mEnable2DEngineEffect;
    }

    public boolean isEnableDestroyEffectInStopPreview() {
        return this.mEnableDestroyEffectInStopPreview;
    }

    public boolean isEnableDynamicRecordContentType() {
        return this.mEnableDynamicRecordContentType;
    }

    public boolean isEnableEffectAmazingEngine() {
        return this.mEnableEffectAmazingEngine;
    }

    public boolean isEnableModelHotUpdate() {
        return this.mEnableModelHotUpdate;
    }

    public boolean isEnablePlayAVSyncOpt() {
        return this.mEnablePlayAVSyncOpt;
    }

    public boolean isEnableRenderLayer() {
        return this.mEnableRenderLayer;
    }

    public boolean isEnableRenderThreadSelfDrive() {
        return this.mEnableRenderThreadSelfDrive;
    }

    public boolean isHDR10BitProcessingPipelineEnabled() {
        return this.mEnableHDR10BitProcessingPipeline;
    }

    public boolean isMakeUpBackgroundEnable() {
        return this.mEnableMakeUpBackground;
    }

    public boolean isOptFirstFrame() {
        return this.mOptFirstFrame;
    }

    public boolean isPureHDR10BitProcessingPipelineEnabled() {
        return this.mEnablePureHDR10BitProcessingPipeline;
    }

    public boolean isRecordEffectContentHighSpeed() {
        return this.mRecordEffectContentHighSpeed;
    }

    public boolean isReducePerFrameCallbackOptimizationEnabled() {
        return this.enableReducePerFrameCallbackOptimization;
    }

    public boolean isSwitchEffectInGLTask() {
        return this.mSwitchEffectInGLTask;
    }

    public boolean isSyncCapture() {
        return this.mIsSyncCapture;
    }

    public boolean isVideoDecodeUseSetMultiTrackStatus() {
        return this.mVideoDecodeUseSetMultiTrackStatus;
    }

    public boolean needPostProcess() {
        return this.mNeedPostProcess;
    }

    /* JADX INFO: loaded from: classes34.dex */
    public enum CAMERA_OUTPUT_MODE implements Parcelable {
        SURFACE,
        FRAME,
        SURFACE_FRAME,
        TWO_SURFACES,
        EXTERNAL_SURFACE;

        public static final Parcelable.Creator<CAMERA_OUTPUT_MODE> CREATOR = new C2189641Amo(26);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static CAMERA_OUTPUT_MODE valueOf(String str) {
            return (CAMERA_OUTPUT_MODE) C08FF.LIZ(CAMERA_OUTPUT_MODE.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }
}
