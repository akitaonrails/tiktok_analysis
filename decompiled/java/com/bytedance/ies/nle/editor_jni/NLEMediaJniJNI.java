package com.bytedance.ies.nle.editor_jni;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes28.dex */
public class NLEMediaJniJNI {
    public static final native void INLEAsyncRenderPlayStatusListener_change_ownership(INLEAsyncRenderPlayStatusListener iNLEAsyncRenderPlayStatusListener, long j, boolean z);

    public static final native void INLEAsyncRenderPlayStatusListener_director_connect(INLEAsyncRenderPlayStatusListener iNLEAsyncRenderPlayStatusListener, long j, boolean z, boolean z2);

    public static final native void INLEAsyncRenderPlayStatusListener_onPauseInner(long j, INLEAsyncRenderPlayStatusListener iNLEAsyncRenderPlayStatusListener);

    public static final native void INLEAsyncRenderPlayStatusListener_onPlayInner(long j, INLEAsyncRenderPlayStatusListener iNLEAsyncRenderPlayStatusListener);

    public static final native void INLEMattingListener_change_ownership(INLEMattingListener iNLEMattingListener, long j, boolean z);

    public static final native void INLEMattingListener_director_connect(INLEMattingListener iNLEMattingListener, long j, boolean z, boolean z2);

    public static final native void INLEMattingListener_onMattingAddedCallback(long j, INLEMattingListener iNLEMattingListener, String str);

    public static final native void INLEMattingListener_onMattingClipDoneCallback(long j, INLEMattingListener iNLEMattingListener, String str, float f, float f2);

    public static final native void INLEMattingListener_onMattingDoneCallback(long j, INLEMattingListener iNLEMattingListener, float f, String str);

    public static final native void INLEMattingListener_onMattingErrorCallback__SWIG_0(long j, INLEMattingListener iNLEMattingListener, int i, int i2, float f);

    public static final native void INLEMattingListener_onMattingErrorCallback__SWIG_1(long j, INLEMattingListener iNLEMattingListener, int i, String str);

    public static final native void INLEMattingListener_onMattingInteractiveMaskCallback(long j, INLEMattingListener iNLEMattingListener, String str, long j2, String str2);

    public static final native void INLEMattingListener_onMattingProgressCallback(long j, INLEMattingListener iNLEMattingListener, String str, float f, float f2, boolean z);

    public static final native void INLEMattingListener_onMattingRemovedCallback(long j, INLEMattingListener iNLEMattingListener, String str);

    public static final native void INLEMattingListener_onMattingStartedCallback(long j, INLEMattingListener iNLEMattingListener);

    public static final native boolean INLEMattingListener_shouldInterceptMatting(long j, INLEMattingListener iNLEMattingListener, long j2, NLETrackSlot nLETrackSlot);

    public static final native void INLENecessaryResourceFetchCallback_change_ownership(INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, long j, boolean z);

    public static final native void INLENecessaryResourceFetchCallback_director_connect(INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, long j, boolean z, boolean z2);

    public static final native void INLENecessaryResourceFetchCallback_onDone(long j, INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, int i, int i2, int i3, String str);

    public static final native void INLENecessaryResourceFetchCallback_onPreFetch(long j, INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, long j2, VecString vecString);

    public static final native void INLENecessaryResourceFetchCallback_onProgress(long j, INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, float f);

    public static final native void INLENecessaryResourceFetchCallback_onSingleResourceFail(long j, INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, String str, int i, String str2);

    public static final native int INLEResourceDownloadConfig_concurrentTaskNum_get(long j, INLEResourceDownloadConfig iNLEResourceDownloadConfig);

    public static final native void INLEResourceDownloadConfig_concurrentTaskNum_set(long j, INLEResourceDownloadConfig iNLEResourceDownloadConfig, int i);

    public static final native int INLEResourceDownloadConfig_maxPauseCount_get(long j, INLEResourceDownloadConfig iNLEResourceDownloadConfig);

    public static final native void INLEResourceDownloadConfig_maxPauseCount_set(long j, INLEResourceDownloadConfig iNLEResourceDownloadConfig, int i);

    public static final native int INLEResourceDownloadConfig_priorityRule_get(long j, INLEResourceDownloadConfig iNLEResourceDownloadConfig);

    public static final native void INLEResourceDownloadConfig_priorityRule_set(long j, INLEResourceDownloadConfig iNLEResourceDownloadConfig, int i);

    public static final native void INLEResourceDownloadConfig_setResourcePriorityConfig(long j, INLEResourceDownloadConfig iNLEResourceDownloadConfig, String str);

    public static final native int INLEResourceDownloadConfig_timeThreshold_get(long j, INLEResourceDownloadConfig iNLEResourceDownloadConfig);

    public static final native void INLEResourceDownloadConfig_timeThreshold_set(long j, INLEResourceDownloadConfig iNLEResourceDownloadConfig, int i);

    public static final native void INLEResourceDownloadStatusListener_change_ownership(INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener, long j, boolean z);

    public static final native void INLEResourceDownloadStatusListener_director_connect(INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener, long j, boolean z, boolean z2);

    public static final native void INLEResourceDownloadStatusListener_onAllResourceDownloadFinished(long j, INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener);

    public static final native void INLEResourceDownloadStatusListener_onFail(long j, INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener, long j2, NLEResourceNode nLEResourceNode, int i, String str);

    public static final native void INLEResourceDownloadStatusListener_onStart(long j, INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener, long j2, NLEResourceNode nLEResourceNode);

    public static final native void INLEResourceDownloadStatusListener_onSuccess(long j, INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener, long j2, NLEResourceNode nLEResourceNode, boolean z);

    public static final native String NLEAlgorithmPath_beatsPath_get(long j, NLEAlgorithmPath nLEAlgorithmPath);

    public static final native void NLEAlgorithmPath_beatsPath_set(long j, NLEAlgorithmPath nLEAlgorithmPath, String str);

    public static final native String NLEAlgorithmPath_downBeatsPath_get(long j, NLEAlgorithmPath nLEAlgorithmPath);

    public static final native void NLEAlgorithmPath_downBeatsPath_set(long j, NLEAlgorithmPath nLEAlgorithmPath, String str);

    public static final native String NLEAlgorithmPath_manMadePath_get(long j, NLEAlgorithmPath nLEAlgorithmPath);

    public static final native void NLEAlgorithmPath_manMadePath_set(long j, NLEAlgorithmPath nLEAlgorithmPath, String str);

    public static final native int NLEAlgorithmPath_mode_get(long j, NLEAlgorithmPath nLEAlgorithmPath);

    public static final native void NLEAlgorithmPath_mode_set(long j, NLEAlgorithmPath nLEAlgorithmPath, int i);

    public static final native String NLEAlgorithmPath_noStrengthBeatsPath_get(long j, NLEAlgorithmPath nLEAlgorithmPath);

    public static final native void NLEAlgorithmPath_noStrengthBeatsPath_set(long j, NLEAlgorithmPath nLEAlgorithmPath, String str);

    public static final native String NLEAlgorithmPath_onlineBeatsPath_get(long j, NLEAlgorithmPath nLEAlgorithmPath);

    public static final native void NLEAlgorithmPath_onlineBeatsPath_set(long j, NLEAlgorithmPath nLEAlgorithmPath, String str);

    public static final native int NLEAlgorithmPath_pictureDuration_get(long j, NLEAlgorithmPath nLEAlgorithmPath);

    public static final native void NLEAlgorithmPath_pictureDuration_set(long j, NLEAlgorithmPath nLEAlgorithmPath, int i);

    public static final native int NLEAlgorithmPath_type_get(long j, NLEAlgorithmPath nLEAlgorithmPath);

    public static final native void NLEAlgorithmPath_type_set(long j, NLEAlgorithmPath nLEAlgorithmPath, int i);

    public static final native int NLEAudioCompileEncodeSettings_audioBps_get(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings);

    public static final native void NLEAudioCompileEncodeSettings_audioBps_set(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings, int i);

    public static final native int NLEAudioCompileEncodeSettings_channelCount_get(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings);

    public static final native void NLEAudioCompileEncodeSettings_channelCount_set(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings, int i);

    public static final native int NLEAudioCompileEncodeSettings_compileType_get(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings);

    public static final native void NLEAudioCompileEncodeSettings_compileType_set(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings, int i);

    public static final native boolean NLEAudioCompileEncodeSettings_enableAudioCompileGraph_get(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings);

    public static final native void NLEAudioCompileEncodeSettings_enableAudioCompileGraph_set(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings, boolean z);

    public static final native boolean NLEAudioCompileEncodeSettings_enableHwBufferEncode_get(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings);

    public static final native void NLEAudioCompileEncodeSettings_enableHwBufferEncode_set(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings, boolean z);

    public static final native boolean NLEAudioCompileEncodeSettings_isSkipAudioBitrateAdjust_get(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings);

    public static final native void NLEAudioCompileEncodeSettings_isSkipAudioBitrateAdjust_set(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings, boolean z);

    public static final native boolean NLEAudioCompileEncodeSettings_isSupportHWEncoder_get(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings);

    public static final native void NLEAudioCompileEncodeSettings_isSupportHWEncoder_set(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings, boolean z);

    public static final native long NLEAudioCompileEncodeSettings_mHWEncodeSetting_get(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings);

    public static final native void NLEAudioCompileEncodeSettings_mHWEncodeSetting_set(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings, long j2, NLEAudioHWEncodeSettings nLEAudioHWEncodeSettings);

    public static final native long NLEAudioCompileEncodeSettings_mSWEncodeSetting_get(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings);

    public static final native void NLEAudioCompileEncodeSettings_mSWEncodeSetting_set(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings, long j2, NLEAudioSWEncodeSettings nLEAudioSWEncodeSettings);

    public static final native int NLEAudioCompileEncodeSettings_sampleRate_get(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings);

    public static final native void NLEAudioCompileEncodeSettings_sampleRate_set(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings, int i);

    public static final native boolean NLEAudioCompileEncodeSettings_useHWEncoder_get(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings);

    public static final native void NLEAudioCompileEncodeSettings_useHWEncoder_set(long j, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings, boolean z);

    public static final native long NLEAudioHWEncodeSettings_mBitrate_get(long j, NLEAudioHWEncodeSettings nLEAudioHWEncodeSettings);

    public static final native void NLEAudioHWEncodeSettings_mBitrate_set(long j, NLEAudioHWEncodeSettings nLEAudioHWEncodeSettings, long j2);

    public static final native long NLEAudioSWEncodeSettings_mBitrate_get(long j, NLEAudioSWEncodeSettings nLEAudioSWEncodeSettings);

    public static final native void NLEAudioSWEncodeSettings_mBitrate_set(long j, NLEAudioSWEncodeSettings nLEAudioSWEncodeSettings, long j2);

    public static final native float NLEAudioXResults_be0_get(long j, NLEAudioXResults nLEAudioXResults);

    public static final native void NLEAudioXResults_be0_set(long j, NLEAudioXResults nLEAudioXResults, float f);

    public static final native float NLEAudioXResults_be1_get(long j, NLEAudioXResults nLEAudioXResults);

    public static final native void NLEAudioXResults_be1_set(long j, NLEAudioXResults nLEAudioXResults, float f);

    public static final native float NLEAudioXResults_ctps_get(long j, NLEAudioXResults nLEAudioXResults);

    public static final native void NLEAudioXResults_ctps_set(long j, NLEAudioXResults nLEAudioXResults, float f);

    public static final native float NLEAudioXResults_do__get(long j, NLEAudioXResults nLEAudioXResults);

    public static final native void NLEAudioXResults_do__set(long j, NLEAudioXResults nLEAudioXResults, float f);

    public static final native float NLEAudioXResults_drr_get(long j, NLEAudioXResults nLEAudioXResults);

    public static final native void NLEAudioXResults_drr_set(long j, NLEAudioXResults nLEAudioXResults, float f);

    public static final native float NLEAudioXResults_li_get(long j, NLEAudioXResults nLEAudioXResults);

    public static final native void NLEAudioXResults_li_set(long j, NLEAudioXResults nLEAudioXResults, float f);

    public static final native float NLEAudioXResults_mp_get(long j, NLEAudioXResults nLEAudioXResults);

    public static final native void NLEAudioXResults_mp_set(long j, NLEAudioXResults nLEAudioXResults, float f);

    public static final native float NLEAudioXResults_rcd_get(long j, NLEAudioXResults nLEAudioXResults);

    public static final native void NLEAudioXResults_rcd_set(long j, NLEAudioXResults nLEAudioXResults, float f);

    public static final native float NLEAudioXResults_tacm_get(long j, NLEAudioXResults nLEAudioXResults);

    public static final native void NLEAudioXResults_tacm_set(long j, NLEAudioXResults nLEAudioXResults, float f);

    public static final native int NLEBeatTrackingInfo_beat_get(long j, NLEBeatTrackingInfo nLEBeatTrackingInfo);

    public static final native void NLEBeatTrackingInfo_beat_set(long j, NLEBeatTrackingInfo nLEBeatTrackingInfo, int i);

    public static final native long NLEBeatTrackingInfo_offset_get(long j, NLEBeatTrackingInfo nLEBeatTrackingInfo);

    public static final native void NLEBeatTrackingInfo_offset_set(long j, NLEBeatTrackingInfo nLEBeatTrackingInfo, long j2);

    public static final native String NLEBeatTrackingParam_filePath_get(long j, NLEBeatTrackingParam nLEBeatTrackingParam);

    public static final native void NLEBeatTrackingParam_filePath_set(long j, NLEBeatTrackingParam nLEBeatTrackingParam, String str);

    public static final native String NLEBeatTrackingParam_modelPath_get(long j, NLEBeatTrackingParam nLEBeatTrackingParam);

    public static final native void NLEBeatTrackingParam_modelPath_set(long j, NLEBeatTrackingParam nLEBeatTrackingParam, String str);

    public static final native long NLEBeatTrackingParam_slice_get(long j, NLEBeatTrackingParam nLEBeatTrackingParam);

    public static final native void NLEBeatTrackingParam_slice_set(long j, NLEBeatTrackingParam nLEBeatTrackingParam, long j2);

    public static final native long NLEBeatTrackingParam_trimIn_get(long j, NLEBeatTrackingParam nLEBeatTrackingParam);

    public static final native void NLEBeatTrackingParam_trimIn_set(long j, NLEBeatTrackingParam nLEBeatTrackingParam, long j2);

    public static final native long NLEBeatTrackingParam_trimOut_get(long j, NLEBeatTrackingParam nLEBeatTrackingParam);

    public static final native void NLEBeatTrackingParam_trimOut_set(long j, NLEBeatTrackingParam nLEBeatTrackingParam, long j2);

    public static final native boolean NLEBrushStickerState_bboxCalculatedByPixel_get(long j, NLEBrushStickerState nLEBrushStickerState);

    public static final native void NLEBrushStickerState_bboxCalculatedByPixel_set(long j, NLEBrushStickerState nLEBrushStickerState, boolean z);

    public static final native float NLEBrushStickerState_bottom_get(long j, NLEBrushStickerState nLEBrushStickerState);

    public static final native void NLEBrushStickerState_bottom_set(long j, NLEBrushStickerState nLEBrushStickerState, float f);

    public static final native float NLEBrushStickerState_left_get(long j, NLEBrushStickerState nLEBrushStickerState);

    public static final native void NLEBrushStickerState_left_set(long j, NLEBrushStickerState nLEBrushStickerState, float f);

    public static final native long NLEBrushStickerState_memCacheSize_get(long j, NLEBrushStickerState nLEBrushStickerState);

    public static final native void NLEBrushStickerState_memCacheSize_set(long j, NLEBrushStickerState nLEBrushStickerState, long j2);

    public static final native int NLEBrushStickerState_redo_count_get(long j, NLEBrushStickerState nLEBrushStickerState);

    public static final native void NLEBrushStickerState_redo_count_set(long j, NLEBrushStickerState nLEBrushStickerState, int i);

    public static final native float NLEBrushStickerState_right_get(long j, NLEBrushStickerState nLEBrushStickerState);

    public static final native void NLEBrushStickerState_right_set(long j, NLEBrushStickerState nLEBrushStickerState, float f);

    public static final native float NLEBrushStickerState_stroke_size_get(long j, NLEBrushStickerState nLEBrushStickerState);

    public static final native void NLEBrushStickerState_stroke_size_set(long j, NLEBrushStickerState nLEBrushStickerState, float f);

    public static final native float NLEBrushStickerState_top_get(long j, NLEBrushStickerState nLEBrushStickerState);

    public static final native void NLEBrushStickerState_top_set(long j, NLEBrushStickerState nLEBrushStickerState, float f);

    public static final native long NLEBrushStickerState_totalCacheSize_get(long j, NLEBrushStickerState nLEBrushStickerState);

    public static final native void NLEBrushStickerState_totalCacheSize_set(long j, NLEBrushStickerState nLEBrushStickerState, long j2);

    public static final native int NLEBrushStickerState_undo_count_get(long j, NLEBrushStickerState nLEBrushStickerState);

    public static final native void NLEBrushStickerState_undo_count_set(long j, NLEBrushStickerState nLEBrushStickerState, int i);

    public static final native int NLEClipAlgorithmParam_bingoEffect_get(long j, NLEClipAlgorithmParam nLEClipAlgorithmParam);

    public static final native void NLEClipAlgorithmParam_bingoEffect_set(long j, NLEClipAlgorithmParam nLEClipAlgorithmParam, int i);

    public static final native int NLEClipAlgorithmParam_index_get(long j, NLEClipAlgorithmParam nLEClipAlgorithmParam);

    public static final native void NLEClipAlgorithmParam_index_set(long j, NLEClipAlgorithmParam nLEClipAlgorithmParam, int i);

    public static final native long NLEClipAlgorithmParam_range_get(long j, NLEClipAlgorithmParam nLEClipAlgorithmParam);

    public static final native void NLEClipAlgorithmParam_range_set(long j, NLEClipAlgorithmParam nLEClipAlgorithmParam, long j2);

    public static final native int NLEClipAlgorithmParam_rotate_get(long j, NLEClipAlgorithmParam nLEClipAlgorithmParam);

    public static final native void NLEClipAlgorithmParam_rotate_set(long j, NLEClipAlgorithmParam nLEClipAlgorithmParam, int i);

    public static final native long NLEClipAlgorithmParam_trimIn_get(long j, NLEClipAlgorithmParam nLEClipAlgorithmParam);

    public static final native void NLEClipAlgorithmParam_trimIn_set(long j, NLEClipAlgorithmParam nLEClipAlgorithmParam, long j2);

    public static final native long NLEClipAlgorithmParam_trimOut_get(long j, NLEClipAlgorithmParam nLEClipAlgorithmParam);

    public static final native void NLEClipAlgorithmParam_trimOut_set(long j, NLEClipAlgorithmParam nLEClipAlgorithmParam, long j2);

    public static final native String NLECompileMediaInfo_filePath_get(long j, NLECompileMediaInfo nLECompileMediaInfo);

    public static final native void NLECompileMediaInfo_filePath_set(long j, NLECompileMediaInfo nLECompileMediaInfo, String str);

    public static final native long NLECompileMediaInfo_metadata_get(long j, NLECompileMediaInfo nLECompileMediaInfo);

    public static final native void NLECompileMediaInfo_metadata_set(long j, NLECompileMediaInfo nLECompileMediaInfo, long j2, MapStrStr mapStrStr);

    public static final native long NLECompileResult_audioXResult_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_audioXResult_set(long j, NLECompileResult nLECompileResult, long j2, NLEAudioXResults nLEAudioXResults);

    public static final native String NLECompileResult_compileHash_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_compileHash_set(long j, NLECompileResult nLECompileResult, String str);

    public static final native int NLECompileResult_compileLevel_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_compileLevel_set(long j, NLECompileResult nLECompileResult, int i);

    public static final native float NLECompileResult_compilePauseTime_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_compilePauseTime_set(long j, NLECompileResult nLECompileResult, float f);

    public static final native double NLECompileResult_decodeFrameAvgTime_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_decodeFrameAvgTime_set(long j, NLECompileResult nLECompileResult, double d);

    public static final native int NLECompileResult_encodeBitsType_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_encodeBitsType_set(long j, NLECompileResult nLECompileResult, int i);

    public static final native double NLECompileResult_encodeFrameAvgTime_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_encodeFrameAvgTime_set(long j, NLECompileResult nLECompileResult, double d);

    public static final native int NLECompileResult_encodeHdrType_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_encodeHdrType_set(long j, NLECompileResult nLECompileResult, int i);

    public static final native int NLECompileResult_encodeType_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_encodeType_set(long j, NLECompileResult nLECompileResult, int i);

    public static final native boolean NLECompileResult_isCompileHardEncode_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_isCompileHardEncode_set(long j, NLECompileResult nLECompileResult, boolean z);

    public static final native boolean NLECompileResult_isRecordHardEncode_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_isRecordHardEncode_set(long j, NLECompileResult nLECompileResult, boolean z);

    public static final native boolean NLECompileResult_isReencode_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_isReencode_set(long j, NLECompileResult nLECompileResult, boolean z);

    public static final native long NLECompileResult_mainTrackSourceMediaInfo_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_mainTrackSourceMediaInfo_set(long j, NLECompileResult nLECompileResult, long j2, VecNLECompileMediaInfo vecNLECompileMediaInfo);

    public static final native BigInteger NLECompileResult_notRemuxErrorCode_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_notRemuxErrorCode_set(long j, NLECompileResult nLECompileResult, BigInteger bigInteger);

    public static final native String NLECompileResult_outputVideoPath_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_outputVideoPath_set(long j, NLECompileResult nLECompileResult, String str);

    public static final native double NLECompileResult_renderFrameAvgTime_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_renderFrameAvgTime_set(long j, NLECompileResult nLECompileResult, double d);

    public static final native long NLECompileResult_riskyVideoInfo_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_riskyVideoInfo_set(long j, NLECompileResult nLECompileResult, long j2, MapStrStr mapStrStr);

    public static final native int NLECompileResult_transType_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_transType_set(long j, NLECompileResult nLECompileResult, int i);

    public static final native long NLECompileResult_uploadParams_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_uploadParams_set(long j, NLECompileResult nLECompileResult, long j2, NLEUploadParams nLEUploadParams);

    public static final native long NLECompileResult_vqscoreResult_get(long j, NLECompileResult nLECompileResult);

    public static final native void NLECompileResult_vqscoreResult_set(long j, NLECompileResult nLECompileResult, long j2, NLEVQScoreResult nLEVQScoreResult);

    public static final native double NLELoudnessDetectResult_avgLoudness_get(long j, NLELoudnessDetectResult nLELoudnessDetectResult);

    public static final native void NLELoudnessDetectResult_avgLoudness_set(long j, NLELoudnessDetectResult nLELoudnessDetectResult, double d);

    public static final native double NLELoudnessDetectResult_peakLoudness_get(long j, NLELoudnessDetectResult nLELoudnessDetectResult);

    public static final native void NLELoudnessDetectResult_peakLoudness_set(long j, NLELoudnessDetectResult nLELoudnessDetectResult, double d);

    public static final native int NLELoudnessDetectResult_result_get(long j, NLELoudnessDetectResult nLELoudnessDetectResult);

    public static final native void NLELoudnessDetectResult_result_set(long j, NLELoudnessDetectResult nLELoudnessDetectResult, int i);

    public static final native String NLEMVAudioInfo_path_get(long j, NLEMVAudioInfo nLEMVAudioInfo);

    public static final native void NLEMVAudioInfo_path_set(long j, NLEMVAudioInfo nLEMVAudioInfo, String str);

    public static final native long NLEMVAudioInfo_trimIn_get(long j, NLEMVAudioInfo nLEMVAudioInfo);

    public static final native void NLEMVAudioInfo_trimIn_set(long j, NLEMVAudioInfo nLEMVAudioInfo, long j2);

    public static final native long NLEMVAudioInfo_trimOut_get(long j, NLEMVAudioInfo nLEMVAudioInfo);

    public static final native void NLEMVAudioInfo_trimOut_set(long j, NLEMVAudioInfo nLEMVAudioInfo, long j2);

    public static final native int NLEMVInfoBean_fps_get(long j, NLEMVInfoBean nLEMVInfoBean);

    public static final native void NLEMVInfoBean_fps_set(long j, NLEMVInfoBean nLEMVInfoBean, int i);

    public static final native int NLEMVInfoBean_height_get(long j, NLEMVInfoBean nLEMVInfoBean);

    public static final native void NLEMVInfoBean_height_set(long j, NLEMVInfoBean nLEMVInfoBean, int i);

    public static final native long NLEMVInfoBean_resources_get(long j, NLEMVInfoBean nLEMVInfoBean);

    public static final native void NLEMVInfoBean_resources_set(long j, NLEMVInfoBean nLEMVInfoBean, long j2, VecNLEMVResourceBean vecNLEMVResourceBean);

    public static final native int NLEMVInfoBean_width_get(long j, NLEMVInfoBean nLEMVInfoBean);

    public static final native void NLEMVInfoBean_width_set(long j, NLEMVInfoBean nLEMVInfoBean, int i);

    public static final native int NLEMVResourceBean_clipIndex_get(long j, NLEMVResourceBean nLEMVResourceBean);

    public static final native void NLEMVResourceBean_clipIndex_set(long j, NLEMVResourceBean nLEMVResourceBean, int i);

    public static final native String NLEMVResourceBean_content_get(long j, NLEMVResourceBean nLEMVResourceBean);

    public static final native void NLEMVResourceBean_content_set(long j, NLEMVResourceBean nLEMVResourceBean, String str);

    public static final native int NLEMVResourceBean_isLoop_get(long j, NLEMVResourceBean nLEMVResourceBean);

    public static final native void NLEMVResourceBean_isLoop_set(long j, NLEMVResourceBean nLEMVResourceBean, int i);

    public static final native boolean NLEMVResourceBean_isMute_get(long j, NLEMVResourceBean nLEMVResourceBean);

    public static final native void NLEMVResourceBean_isMute_set(long j, NLEMVResourceBean nLEMVResourceBean, boolean z);

    public static final native int NLEMVResourceBean_rid_get(long j, NLEMVResourceBean nLEMVResourceBean);

    public static final native void NLEMVResourceBean_rid_set(long j, NLEMVResourceBean nLEMVResourceBean, int i);

    public static final native long NLEMVResourceBean_seqIn_get(long j, NLEMVResourceBean nLEMVResourceBean);

    public static final native void NLEMVResourceBean_seqIn_set(long j, NLEMVResourceBean nLEMVResourceBean, long j2);

    public static final native long NLEMVResourceBean_seqOut_get(long j, NLEMVResourceBean nLEMVResourceBean);

    public static final native void NLEMVResourceBean_seqOut_set(long j, NLEMVResourceBean nLEMVResourceBean, long j2);

    public static final native int NLEMVResourceBean_trackIndex_get(long j, NLEMVResourceBean nLEMVResourceBean);

    public static final native void NLEMVResourceBean_trackIndex_set(long j, NLEMVResourceBean nLEMVResourceBean, int i);

    public static final native long NLEMVResourceBean_trimIn_get(long j, NLEMVResourceBean nLEMVResourceBean);

    public static final native void NLEMVResourceBean_trimIn_set(long j, NLEMVResourceBean nLEMVResourceBean, long j2);

    public static final native long NLEMVResourceBean_trimOut_get(long j, NLEMVResourceBean nLEMVResourceBean);

    public static final native void NLEMVResourceBean_trimOut_set(long j, NLEMVResourceBean nLEMVResourceBean, long j2);

    public static final native String NLEMVResourceBean_type_get(long j, NLEMVResourceBean nLEMVResourceBean);

    public static final native void NLEMVResourceBean_type_set(long j, NLEMVResourceBean nLEMVResourceBean, String str);

    public static final native boolean NLEMediaABConfig_enableApiThreadCheck_get(long j, NLEMediaABConfig nLEMediaABConfig);

    public static final native void NLEMediaABConfig_enableApiThreadCheck_set(long j, NLEMediaABConfig nLEMediaABConfig, boolean z);

    public static final native boolean NLEMediaABConfig_enableApiTimeCost_get(long j, NLEMediaABConfig nLEMediaABConfig);

    public static final native void NLEMediaABConfig_enableApiTimeCost_set(long j, NLEMediaABConfig nLEMediaABConfig, boolean z);

    public static final native boolean NLEMediaABConfig_enableRenderWithStageModel_get(long j, NLEMediaABConfig nLEMediaABConfig);

    public static final native void NLEMediaABConfig_enableRenderWithStageModel_set(long j, NLEMediaABConfig nLEMediaABConfig, boolean z);

    public static final native boolean NLEMediaABConfig_enableSyncModelInAudio_get(long j, NLEMediaABConfig nLEMediaABConfig);

    public static final native void NLEMediaABConfig_enableSyncModelInAudio_set(long j, NLEMediaABConfig nLEMediaABConfig, boolean z);

    public static final native double NLEMediaABConfig_threadSamplingProb_get(long j, NLEMediaABConfig nLEMediaABConfig);

    public static final native void NLEMediaABConfig_threadSamplingProb_set(long j, NLEMediaABConfig nLEMediaABConfig, double d);

    public static final native long NLEMediaAudioInfo_bitrate_get(long j, NLEMediaAudioInfo nLEMediaAudioInfo);

    public static final native void NLEMediaAudioInfo_bitrate_set(long j, NLEMediaAudioInfo nLEMediaAudioInfo, long j2);

    public static final native long NLEMediaAudioInfo_channelSize_get(long j, NLEMediaAudioInfo nLEMediaAudioInfo);

    public static final native void NLEMediaAudioInfo_channelSize_set(long j, NLEMediaAudioInfo nLEMediaAudioInfo, long j2);

    public static final native long NLEMediaAudioInfo_duration_get(long j, NLEMediaAudioInfo nLEMediaAudioInfo);

    public static final native void NLEMediaAudioInfo_duration_set(long j, NLEMediaAudioInfo nLEMediaAudioInfo, long j2);

    public static final native long NLEMediaAudioInfo_sampleFormat_get(long j, NLEMediaAudioInfo nLEMediaAudioInfo);

    public static final native void NLEMediaAudioInfo_sampleFormat_set(long j, NLEMediaAudioInfo nLEMediaAudioInfo, long j2);

    public static final native long NLEMediaAudioInfo_sampleRate_get(long j, NLEMediaAudioInfo nLEMediaAudioInfo);

    public static final native void NLEMediaAudioInfo_sampleRate_set(long j, NLEMediaAudioInfo nLEMediaAudioInfo, long j2);

    public static final native String NLEMediaConfig_contentType_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_contentType_set(long j, NLEMediaConfig nLEMediaConfig, String str);

    public static final native String NLEMediaConfig_defaultFontPath_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_defaultFontPath_set(long j, NLEMediaConfig nLEMediaConfig, String str);

    public static final native boolean NLEMediaConfig_deleteBeforeAddingEffect_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_deleteBeforeAddingEffect_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native boolean NLEMediaConfig_enableCatchExceptionInCallback_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_enableCatchExceptionInCallback_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native boolean NLEMediaConfig_enableCoexistGlobalEffect_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_enableCoexistGlobalEffect_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native boolean NLEMediaConfig_enableDestroyingCheck_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_enableDestroyingCheck_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native boolean NLEMediaConfig_enableGetStateLock_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_enableGetStateLock_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native boolean NLEMediaConfig_enableImageTemplateConfig_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_enableImageTemplateConfig_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native boolean NLEMediaConfig_enableLockSeekInVESwingMode_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_enableLockSeekInVESwingMode_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native boolean NLEMediaConfig_enableLogExecutor_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_enableLogExecutor_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native boolean NLEMediaConfig_enableReleaseSurfaceLock_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_enableReleaseSurfaceLock_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native boolean NLEMediaConfig_enableResourceAsyncRender_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_enableResourceAsyncRender_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native boolean NLEMediaConfig_enableStickerMode_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_enableStickerMode_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native boolean NLEMediaConfig_enableVEOperationEvent_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_enableVEOperationEvent_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native boolean NLEMediaConfig_forCanvasMode_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_forCanvasMode_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native boolean NLEMediaConfig_lockSetDataSourceAndDestroy_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_lockSetDataSourceAndDestroy_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native double NLEMediaConfig_maxFps_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_maxFps_set(long j, NLEMediaConfig nLEMediaConfig, double d);

    public static final native int NLEMediaConfig_mediaLogLevel_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_mediaLogLevel_set(long j, NLEMediaConfig nLEMediaConfig, int i);

    public static final native double NLEMediaConfig_minFps_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_minFps_set(long j, NLEMediaConfig nLEMediaConfig, double d);

    public static final native String NLEMediaConfig_modelPath_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_modelPath_set(long j, NLEMediaConfig nLEMediaConfig, String str);

    public static final native int NLEMediaConfig_nleImageLinearLayoutShortEdgeMaxLength_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_nleImageLinearLayoutShortEdgeMaxLength_set(long j, NLEMediaConfig nLEMediaConfig, int i);

    public static final native int NLEMediaConfig_nleImageMaxRenderHeight_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_nleImageMaxRenderHeight_set(long j, NLEMediaConfig nLEMediaConfig, int i);

    public static final native int NLEMediaConfig_nleImageMaxRenderWidth_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_nleImageMaxRenderWidth_set(long j, NLEMediaConfig nLEMediaConfig, int i);

    public static final native long NLEMediaConfig_nleMediaAbConfig_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_nleMediaAbConfig_set(long j, NLEMediaConfig nLEMediaConfig, long j2, NLEMediaABConfig nLEMediaABConfig);

    public static final native long NLEMediaConfig_nleVEGlobalConfig_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_nleVEGlobalConfig_set(long j, NLEMediaConfig nLEMediaConfig, long j2, NLEVEGlobalConfig nLEVEGlobalConfig);

    public static final native long NLEMediaConfig_nleVEUserConfig_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_nleVEUserConfig_set(long j, NLEMediaConfig nLEMediaConfig, long j2, NLEVEUserConfig nLEVEUserConfig);

    public static final native boolean NLEMediaConfig_reUseFirstAVInfo_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_reUseFirstAVInfo_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native boolean NLEMediaConfig_usingDefaultFpsToMinus1_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_usingDefaultFpsToMinus1_set(long j, NLEMediaConfig nLEMediaConfig, boolean z);

    public static final native String NLEMediaConfig_workSpace_get(long j, NLEMediaConfig nLEMediaConfig);

    public static final native void NLEMediaConfig_workSpace_set(long j, NLEMediaConfig nLEMediaConfig, String str);

    public static final native void NLEMediaMessageListener_change_ownership(NLEMediaMessageListener nLEMediaMessageListener, long j, boolean z);

    public static final native void NLEMediaMessageListener_director_connect(NLEMediaMessageListener nLEMediaMessageListener, long j, boolean z, boolean z2);

    public static final native void NLEMediaMessageListener_onError(long j, NLEMediaMessageListener nLEMediaMessageListener, int i, int i2, float f, String str);

    public static final native void NLEMediaMessageListener_onInfo(long j, NLEMediaMessageListener nLEMediaMessageListener, int i, int i2, float f, String str);

    public static final native void NLEMediaMessageListener_onKeyFrameProcess(long j, NLEMediaMessageListener nLEMediaMessageListener, String str, long j2, String str2);

    public static final native void NLEMediaMessageListener_onKeyFrameProcessWithType(long j, NLEMediaMessageListener nLEMediaMessageListener, String str, long j2, String str2, int i);

    public static final native long NLEMediaVideoInfo_bitrate_get(long j, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfo_bitrate_set(long j, NLEMediaVideoInfo nLEMediaVideoInfo, long j2);

    public static final native long NLEMediaVideoInfo_codec_get(long j, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfo_codec_set(long j, NLEMediaVideoInfo nLEMediaVideoInfo, long j2);

    public static final native long NLEMediaVideoInfo_duration_get(long j, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfo_duration_set(long j, NLEMediaVideoInfo nLEMediaVideoInfo, long j2);

    public static final native String NLEMediaVideoInfo_formatName_get(long j, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfo_formatName_set(long j, NLEMediaVideoInfo nLEMediaVideoInfo, String str);

    public static final native double NLEMediaVideoInfo_fps_get(long j, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfo_fps_set(long j, NLEMediaVideoInfo nLEMediaVideoInfo, double d);

    public static final native int NLEMediaVideoInfo_hdrColorPrimary_get(long j, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfo_hdrColorPrimary_set(long j, NLEMediaVideoInfo nLEMediaVideoInfo, int i);

    public static final native int NLEMediaVideoInfo_hdrColorRange_get(long j, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfo_hdrColorRange_set(long j, NLEMediaVideoInfo nLEMediaVideoInfo, int i);

    public static final native int NLEMediaVideoInfo_hdrColorSpace_get(long j, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfo_hdrColorSpace_set(long j, NLEMediaVideoInfo nLEMediaVideoInfo, int i);

    public static final native int NLEMediaVideoInfo_hdr_get(long j, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfo_hdr_set(long j, NLEMediaVideoInfo nLEMediaVideoInfo, int i);

    public static final native long NLEMediaVideoInfo_height_get(long j, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfo_height_set(long j, NLEMediaVideoInfo nLEMediaVideoInfo, long j2);

    public static final native boolean NLEMediaVideoInfo_isImage_get(long j, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfo_isImage_set(long j, NLEMediaVideoInfo nLEMediaVideoInfo, boolean z);

    public static final native long NLEMediaVideoInfo_keyFrameCount_get(long j, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfo_keyFrameCount_set(long j, NLEMediaVideoInfo nLEMediaVideoInfo, long j2);

    public static final native long NLEMediaVideoInfo_maxDuration_get(long j, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfo_maxDuration_set(long j, NLEMediaVideoInfo nLEMediaVideoInfo, long j2);

    public static final native long NLEMediaVideoInfo_rotation_get(long j, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfo_rotation_set(long j, NLEMediaVideoInfo nLEMediaVideoInfo, long j2);

    public static final native long NLEMediaVideoInfo_width_get(long j, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfo_width_set(long j, NLEMediaVideoInfo nLEMediaVideoInfo, long j2);

    public static final native String NLEModelExporterListenerParamBody_strParam_get(long j, NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody);

    public static final native void NLEModelExporterListenerParamBody_strParam_set(long j, NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody, String str);

    public static final native String NLEModelExporterListenerParamBody_videoUrl_get(long j, NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody);

    public static final native void NLEModelExporterListenerParamBody_videoUrl_set(long j, NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody, String str);

    public static final native float NLEPosition_x_get(long j, NLEPosition nLEPosition);

    public static final native void NLEPosition_x_set(long j, NLEPosition nLEPosition, float f);

    public static final native float NLEPosition_y_get(long j, NLEPosition nLEPosition);

    public static final native void NLEPosition_y_set(long j, NLEPosition nLEPosition, float f);

    public static final native float NLERectF_bottom_get(long j, NLERectF nLERectF);

    public static final native void NLERectF_bottom_set(long j, NLERectF nLERectF, float f);

    public static final native float NLERectF_left_get(long j, NLERectF nLERectF);

    public static final native void NLERectF_left_set(long j, NLERectF nLERectF, float f);

    public static final native float NLERectF_right_get(long j, NLERectF nLERectF);

    public static final native void NLERectF_right_set(long j, NLERectF nLERectF, float f);

    public static final native float NLERectF_top_get(long j, NLERectF nLERectF);

    public static final native void NLERectF_top_set(long j, NLERectF nLERectF, float f);

    public static final native void NLEResourceCallback_change_ownership(NLEResourceCallback nLEResourceCallback, long j, boolean z);

    public static final native void NLEResourceCallback_director_connect(NLEResourceCallback nLEResourceCallback, long j, boolean z, boolean z2);

    public static final native void NLEResourceCallback_onError(long j, NLEResourceCallback nLEResourceCallback, int i, String str);

    public static final native void NLEResourceCallback_onProgress(long j, NLEResourceCallback nLEResourceCallback, float f);

    public static final native void NLEResourceCallback_onSuccess(long j, NLEResourceCallback nLEResourceCallback, String str, String str2, boolean z);

    public static final native int NLEResourceManager_cancelTask(long j, NLEResourceManager nLEResourceManager, String str);

    public static final native void NLEResourceManager_change_ownership(NLEResourceManager nLEResourceManager, long j, boolean z);

    public static final native void NLEResourceManager_director_connect(NLEResourceManager nLEResourceManager, long j, boolean z, boolean z2);

    public static final native String NLEResourceManager_fetchResource__SWIG_0(long j, NLEResourceManager nLEResourceManager, String str, long j2, NLEResourceCallback nLEResourceCallback);

    public static final native String NLEResourceManager_fetchResource__SWIG_1(long j, NLEResourceManager nLEResourceManager, String str);

    public static final native int NLEResourceManager_pauseTask(long j, NLEResourceManager nLEResourceManager, String str);

    public static final native int NLEResourceManager_resumeTask__SWIG_0(long j, NLEResourceManager nLEResourceManager, String str, long j2, NLEResourceCallback nLEResourceCallback);

    public static final native int NLEResourceManager_resumeTask__SWIG_1(long j, NLEResourceManager nLEResourceManager, String str);

    public static final native int NLERichTextParam_opCode_get(long j, NLERichTextParam nLERichTextParam);

    public static final native void NLERichTextParam_opCode_set(long j, NLERichTextParam nLERichTextParam, int i);

    public static final native float NLERichTextParam_param1_get(long j, NLERichTextParam nLERichTextParam);

    public static final native void NLERichTextParam_param1_set(long j, NLERichTextParam nLERichTextParam, float f);

    public static final native float NLERichTextParam_param2_get(long j, NLERichTextParam nLERichTextParam);

    public static final native void NLERichTextParam_param2_set(long j, NLERichTextParam nLERichTextParam, float f);

    public static final native float NLERichTextParam_param3_get(long j, NLERichTextParam nLERichTextParam);

    public static final native void NLERichTextParam_param3_set(long j, NLERichTextParam nLERichTextParam, float f);

    public static final native float NLERichTextParam_param4_get(long j, NLERichTextParam nLERichTextParam);

    public static final native void NLERichTextParam_param4_set(long j, NLERichTextParam nLERichTextParam, float f);

    public static final native String NLERichTextParam_param5_get(long j, NLERichTextParam nLERichTextParam);

    public static final native void NLERichTextParam_param5_set(long j, NLERichTextParam nLERichTextParam, String str);

    public static final native long NLETimeRange_in_get(long j, NLETimeRange nLETimeRange);

    public static final native void NLETimeRange_in_set(long j, NLETimeRange nLETimeRange, long j2);

    public static final native long NLETimeRange_out_get(long j, NLETimeRange nLETimeRange);

    public static final native void NLETimeRange_out_set(long j, NLETimeRange nLETimeRange, long j2);

    public static final native long NLEUploadParams_metadata_get(long j, NLEUploadParams nLEUploadParams);

    public static final native void NLEUploadParams_metadata_set(long j, NLEUploadParams nLEUploadParams, long j2, MapStrStr mapStrStr);

    public static final native boolean NLEUploadParams_removeSourceMetadata_get(long j, NLEUploadParams nLEUploadParams);

    public static final native void NLEUploadParams_removeSourceMetadata_set(long j, NLEUploadParams nLEUploadParams, boolean z);

    public static final native long NLEUploadParams_sourceFilePaths_get(long j, NLEUploadParams nLEUploadParams);

    public static final native void NLEUploadParams_sourceFilePaths_set(long j, NLEUploadParams nLEUploadParams, long j2, VecString vecString);

    public static final native void NLEVEGlobalConfig_addConfig__SWIG_0(long j, NLEVEGlobalConfig nLEVEGlobalConfig, String str, int i);

    public static final native void NLEVEGlobalConfig_addConfig__SWIG_1(long j, NLEVEGlobalConfig nLEVEGlobalConfig, String str, boolean z);

    public static final native void NLEVEGlobalConfig_addConfig__SWIG_2(long j, NLEVEGlobalConfig nLEVEGlobalConfig, int i, int i2);

    public static final native void NLEVEGlobalConfig_addConfig__SWIG_3(long j, NLEVEGlobalConfig nLEVEGlobalConfig, int i, boolean z);

    public static final native void NLEVEGlobalConfig_clearConfig(long j, NLEVEGlobalConfig nLEVEGlobalConfig);

    public static final native void NLEVEGlobalConfig_enableCheckCanvasFilter(long j, NLEVEGlobalConfig nLEVEGlobalConfig, boolean z);

    public static final native void NLEVEUserConfig_addConfig__SWIG_0(long j, NLEVEUserConfig nLEVEUserConfig, String str, int i);

    public static final native void NLEVEUserConfig_addConfig__SWIG_1(long j, NLEVEUserConfig nLEVEUserConfig, String str, boolean z);

    public static final native void NLEVEUserConfig_addConfig__SWIG_2(long j, NLEVEUserConfig nLEVEUserConfig, String str, String str2);

    public static final native void NLEVEUserConfig_addConfig__SWIG_3(long j, NLEVEUserConfig nLEVEUserConfig, int i, int i2);

    public static final native void NLEVEUserConfig_addConfig__SWIG_4(long j, NLEVEUserConfig nLEVEUserConfig, int i, boolean z);

    public static final native void NLEVEUserConfig_addConfig__SWIG_5(long j, NLEVEUserConfig nLEVEUserConfig, int i, String str);

    public static final native void NLEVEUserConfig_clearConfig(long j, NLEVEUserConfig nLEVEUserConfig);

    public static final native float NLEVQScoreResult_averageScore_get(long j, NLEVQScoreResult nLEVQScoreResult);

    public static final native void NLEVQScoreResult_averageScore_set(long j, NLEVQScoreResult nLEVQScoreResult, float f);

    public static final native int NLEVQScoreResult_processedFrames_get(long j, NLEVQScoreResult nLEVQScoreResult);

    public static final native void NLEVQScoreResult_processedFrames_set(long j, NLEVQScoreResult nLEVQScoreResult, int i);

    public static final native boolean NLEVideoCompileEncodeSettings_enableHwBufferEncode_get(long j, NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings);

    public static final native void NLEVideoCompileEncodeSettings_enableHwBufferEncode_set(long j, NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings, boolean z);

    public static final native boolean NLEVideoCompileEncodeSettings_isSupportHWEncoder_get(long j, NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings);

    public static final native void NLEVideoCompileEncodeSettings_isSupportHWEncoder_set(long j, NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings, boolean z);

    public static final native long NLEVideoCompileEncodeSettings_mHWEncodeSetting_get(long j, NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings);

    public static final native void NLEVideoCompileEncodeSettings_mHWEncodeSetting_set(long j, NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings, long j2, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings);

    public static final native long NLEVideoCompileEncodeSettings_mSWEncodeSetting_get(long j, NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings);

    public static final native void NLEVideoCompileEncodeSettings_mSWEncodeSetting_set(long j, NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings, long j2, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings);

    public static final native boolean NLEVideoCompileEncodeSettings_useHWEncoder_get(long j, NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings);

    public static final native void NLEVideoCompileEncodeSettings_useHWEncoder_set(long j, NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings, boolean z);

    public static final native int NLEVideoEncodeSettings_alphaVideoSplitType_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_alphaVideoSplitType_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native int NLEVideoEncodeSettings_bitDepth_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_bitDepth_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native int NLEVideoEncodeSettings_bitrateMode_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_bitrateMode_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native String NLEVideoEncodeSettings_bitrateSettings_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_bitrateSettings_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, String str);

    public static final native int NLEVideoEncodeSettings_bps_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_bps_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native int NLEVideoEncodeSettings_colorSpace_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_colorSpace_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native int NLEVideoEncodeSettings_compileType_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_compileType_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native int NLEVideoEncodeSettings_downloadNetworkSpeed_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_downloadNetworkSpeed_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native boolean NLEVideoEncodeSettings_enableAvInterleave_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableAvInterleave_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enableByteVCRemuxVideo_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableByteVCRemuxVideo_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enableCloudProcessWithMusic_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableCloudProcessWithMusic_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enableCopyWithMetadata_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableCopyWithMetadata_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enableHdr10BitEncode_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableHdr10BitEncode_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enableHwBufferEncode_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableHwBufferEncode_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enableInterLeave_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableInterLeave_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enableInvisibleWatermark_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableInvisibleWatermark_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enableMainTrackSourceMediaInfo_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableMainTrackSourceMediaInfo_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enablePseudoLandscape_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enablePseudoLandscape_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enableRemuxVideoForRotation_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableRemuxVideoForRotation_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enableRemuxVideoForShoot_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableRemuxVideoForShoot_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native int NLEVideoEncodeSettings_enableRemuxVideoRes_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableRemuxVideoRes_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native boolean NLEVideoEncodeSettings_enableRemuxVideo_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableRemuxVideo_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enableUploadDirectly_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableUploadDirectly_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enableUploadingWhileCompileCancelWriteFile_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableUploadingWhileCompileCancelWriteFile_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enableUploadingWhileCompile_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableUploadingWhileCompile_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enableVQScore_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableVQScore_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_enableVideoAndAudioRemux_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_enableVideoAndAudioRemux_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native int NLEVideoEncodeSettings_encodeProfile_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_encodeProfile_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native int NLEVideoEncodeSettings_encodeStandard_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_encodeStandard_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native long NLEVideoEncodeSettings_endTime_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_endTime_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j2);

    public static final native String NLEVideoEncodeSettings_externalSettingsJsonStr_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_externalSettingsJsonStr_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, String str);

    public static final native int NLEVideoEncodeSettings_fps_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_fps_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native int NLEVideoEncodeSettings_gopSize_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_gopSize_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native long NLEVideoEncodeSettings_hw_video_bps_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_hw_video_bps_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j2);

    public static final native boolean NLEVideoEncodeSettings_ignoreJsonBitrate_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_ignoreJsonBitrate_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native float NLEVideoEncodeSettings_imageQuality_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_imageQuality_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, float f);

    public static final native boolean NLEVideoEncodeSettings_isAudioOnly_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_isAudioOnly_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_isSupportHWEncoder_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_isSupportHWEncoder_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native String NLEVideoEncodeSettings_lastCompileHash_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_lastCompileHash_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, String str);

    public static final native long NLEVideoEncodeSettings_mAudioCompileEncodeSetting_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_mAudioCompileEncodeSetting_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j2, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings);

    public static final native boolean NLEVideoEncodeSettings_mAutoModifyResolution_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_mAutoModifyResolution_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native String NLEVideoEncodeSettings_mComment_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_mComment_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, String str);

    public static final native boolean NLEVideoEncodeSettings_mCompileSoftInfo_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_mCompileSoftInfo_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native String NLEVideoEncodeSettings_mDescription_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_mDescription_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, String str);

    public static final native long NLEVideoEncodeSettings_mKeyFramePoints_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_mKeyFramePoints_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j2, VecInt vecInt);

    public static final native boolean NLEVideoEncodeSettings_mOptRemuxWithCopy_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_mOptRemuxWithCopy_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_mReEncodeOpt_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_mReEncodeOpt_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native boolean NLEVideoEncodeSettings_mRecordingMp4_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_mRecordingMp4_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native int NLEVideoEncodeSettings_mResolutionAlign_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_mResolutionAlign_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native boolean NLEVideoEncodeSettings_mTransitionKeyframeEnable_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_mTransitionKeyframeEnable_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native long NLEVideoEncodeSettings_mVideoCompileEncodeSetting_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_mVideoCompileEncodeSetting_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j2, NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings);

    public static final native long NLEVideoEncodeSettings_mVideoInvisibleWatermark_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_mVideoInvisibleWatermark_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j2, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark);

    public static final native long NLEVideoEncodeSettings_mVideoWatermarkCompileEncodeSetting_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_mVideoWatermarkCompileEncodeSetting_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j2, NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings);

    public static final native long NLEVideoEncodeSettings_mWatermarkParam_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_mWatermarkParam_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j2, NLEWatermarkParam nLEWatermarkParam);

    public static final native long NLEVideoEncodeSettings_nremuxBitrate_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_nremuxBitrate_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j2);

    public static final native long NLEVideoEncodeSettings_outputSize_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_outputSize_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j2, PairIntInt pairIntInt);

    public static final native boolean NLEVideoEncodeSettings_overwriteVeMetadata_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_overwriteVeMetadata_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native int NLEVideoEncodeSettings_remuxSizeLimit_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_remuxSizeLimit_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native int NLEVideoEncodeSettings_resizeMode_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_resizeMode_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native float NLEVideoEncodeSettings_resizeX_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_resizeX_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, float f);

    public static final native float NLEVideoEncodeSettings_resizeY_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_resizeY_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, float f);

    public static final native int NLEVideoEncodeSettings_rotate_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_rotate_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native boolean NLEVideoEncodeSettings_softwareDecode_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_softwareDecode_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, boolean z);

    public static final native int NLEVideoEncodeSettings_sourceType_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_sourceType_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native float NLEVideoEncodeSettings_speed_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_speed_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, float f);

    public static final native long NLEVideoEncodeSettings_startOffset_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_startOffset_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j2);

    public static final native long NLEVideoEncodeSettings_startTime_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_startTime_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j2);

    public static final native int NLEVideoEncodeSettings_swCRF_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_swCRF_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native long NLEVideoEncodeSettings_swMaxrate_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_swMaxrate_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j2);

    public static final native int NLEVideoEncodeSettings_swPreset_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_swPreset_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native float NLEVideoEncodeSettings_swQPOffset_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_swQPOffset_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, float f);

    public static final native int NLEVideoEncodeSettings_swQP_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_swQP_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native float NLEVideoEncodeSettings_templateScore_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_templateScore_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, float f);

    public static final native int NLEVideoEncodeSettings_video720PSuperResolutionStrategy_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_video720PSuperResolutionStrategy_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, int i);

    public static final native String NLEVideoEncodeSettings_vqscoreModel_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_vqscoreModel_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, String str);

    public static final native long NLEVideoEncodeSettings_watermarkSize_get(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native void NLEVideoEncodeSettings_watermarkSize_set(long j, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j2, PairIntInt pairIntInt);

    public static final native float NLEVideoHWEncodeSettings_m2K_bitrate_ratio_get(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings);

    public static final native void NLEVideoHWEncodeSettings_m2K_bitrate_ratio_set(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings, float f);

    public static final native float NLEVideoHWEncodeSettings_m4K_bitrate_ratio_get(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings);

    public static final native void NLEVideoHWEncodeSettings_m4K_bitrate_ratio_set(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings, float f);

    public static final native long NLEVideoHWEncodeSettings_mBitrate_get(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings);

    public static final native void NLEVideoHWEncodeSettings_mBitrate_set(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings, long j2);

    public static final native int NLEVideoHWEncodeSettings_mCodecType_get(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings);

    public static final native void NLEVideoHWEncodeSettings_mCodecType_set(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings, int i);

    public static final native float NLEVideoHWEncodeSettings_mFullHd_bitrate_ratio_get(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings);

    public static final native void NLEVideoHWEncodeSettings_mFullHd_bitrate_ratio_set(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings, float f);

    public static final native int NLEVideoHWEncodeSettings_mGop_get(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings);

    public static final native void NLEVideoHWEncodeSettings_mGop_set(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings, int i);

    public static final native float NLEVideoHWEncodeSettings_mH_fps_bitrate_ratio_get(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings);

    public static final native void NLEVideoHWEncodeSettings_mH_fps_bitrate_ratio_set(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings, float f);

    public static final native float NLEVideoHWEncodeSettings_mHp_bitrate_ratio_get(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings);

    public static final native void NLEVideoHWEncodeSettings_mHp_bitrate_ratio_set(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings, float f);

    public static final native int NLEVideoHWEncodeSettings_mProfile_get(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings);

    public static final native void NLEVideoHWEncodeSettings_mProfile_set(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings, int i);

    public static final native int NLEVideoHWEncodeSettings_mQpMax_get(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings);

    public static final native void NLEVideoHWEncodeSettings_mQpMax_set(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings, int i);

    public static final native int NLEVideoHWEncodeSettings_mQpMin_get(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings);

    public static final native void NLEVideoHWEncodeSettings_mQpMin_set(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings, int i);

    public static final native float NLEVideoHWEncodeSettings_mSd_bitrate_ratio_get(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings);

    public static final native void NLEVideoHWEncodeSettings_mSd_bitrate_ratio_set(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings, float f);

    public static final native void NLEVideoHWEncodeSettings_setQpRange(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings, int i, int i2);

    public static final native float NLEVideoHWEncodeSettings_transition_bitrate_ratio_get(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings);

    public static final native void NLEVideoHWEncodeSettings_transition_bitrate_ratio_set(long j, NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings, float f);

    public static final native int NLEVideoInvisibleWatermark_algoVersion_get(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark);

    public static final native void NLEVideoInvisibleWatermark_algoVersion_set(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark, int i);

    public static final native String NLEVideoInvisibleWatermark_algorithmName_get(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark);

    public static final native void NLEVideoInvisibleWatermark_algorithmName_set(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark, String str);

    public static final native boolean NLEVideoInvisibleWatermark_enableDelayInit_get(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark);

    public static final native void NLEVideoInvisibleWatermark_enableDelayInit_set(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark, boolean z);

    public static final native long NLEVideoInvisibleWatermark_endWaterDuration_get(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark);

    public static final native void NLEVideoInvisibleWatermark_endWaterDuration_set(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark, long j2);

    public static final native int NLEVideoInvisibleWatermark_memLazyload_get(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark);

    public static final native void NLEVideoInvisibleWatermark_memLazyload_set(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark, int i);

    public static final native String NLEVideoInvisibleWatermark_modelPathSec_get(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark);

    public static final native void NLEVideoInvisibleWatermark_modelPathSec_set(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark, String str);

    public static final native String NLEVideoInvisibleWatermark_modelPath_get(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark);

    public static final native void NLEVideoInvisibleWatermark_modelPath_set(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark, String str);

    public static final native int NLEVideoInvisibleWatermark_pFlag_get(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark);

    public static final native void NLEVideoInvisibleWatermark_pFlag_set(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark, int i);

    public static final native int NLEVideoInvisibleWatermark_watermarkInterval_get(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark);

    public static final native void NLEVideoInvisibleWatermark_watermarkInterval_set(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark, int i);

    public static final native String NLEVideoInvisibleWatermark_watermarkStr_get(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark);

    public static final native void NLEVideoInvisibleWatermark_watermarkStr_set(long j, NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark, String str);

    public static final native int NLEVideoSWEncodeSettings_mBitrateMode_get(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings);

    public static final native void NLEVideoSWEncodeSettings_mBitrateMode_set(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings, int i);

    public static final native int NLEVideoSWEncodeSettings_mBps_get(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings);

    public static final native void NLEVideoSWEncodeSettings_mBps_set(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings, int i);

    public static final native int NLEVideoSWEncodeSettings_mCrf_get(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings);

    public static final native void NLEVideoSWEncodeSettings_mCrf_set(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings, int i);

    public static final native int NLEVideoSWEncodeSettings_mGop_get(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings);

    public static final native void NLEVideoSWEncodeSettings_mGop_set(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings, int i);

    public static final native long NLEVideoSWEncodeSettings_mMaxRate_get(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings);

    public static final native void NLEVideoSWEncodeSettings_mMaxRate_set(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings, long j2);

    public static final native int NLEVideoSWEncodeSettings_mPreset_get(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings);

    public static final native void NLEVideoSWEncodeSettings_mPreset_set(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings, int i);

    public static final native int NLEVideoSWEncodeSettings_mProfile_get(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings);

    public static final native void NLEVideoSWEncodeSettings_mProfile_set(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings, int i);

    public static final native double NLEVideoSWEncodeSettings_mQPOffset_get(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings);

    public static final native void NLEVideoSWEncodeSettings_mQPOffset_set(long j, NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings, double d);

    public static final native int NLEWatermarkEntity_height_get(long j, NLEWatermarkEntity nLEWatermarkEntity);

    public static final native void NLEWatermarkEntity_height_set(long j, NLEWatermarkEntity nLEWatermarkEntity, int i);

    public static final native long NLEWatermarkEntity_images_get(long j, NLEWatermarkEntity nLEWatermarkEntity);

    public static final native void NLEWatermarkEntity_images_set(long j, NLEWatermarkEntity nLEWatermarkEntity, long j2, VecString vecString);

    public static final native int NLEWatermarkEntity_interval_get(long j, NLEWatermarkEntity nLEWatermarkEntity);

    public static final native void NLEWatermarkEntity_interval_set(long j, NLEWatermarkEntity nLEWatermarkEntity, int i);

    public static final native int NLEWatermarkEntity_position_get(long j, NLEWatermarkEntity nLEWatermarkEntity);

    public static final native void NLEWatermarkEntity_position_set(long j, NLEWatermarkEntity nLEWatermarkEntity, int i);

    public static final native int NLEWatermarkEntity_rotation_get(long j, NLEWatermarkEntity nLEWatermarkEntity);

    public static final native void NLEWatermarkEntity_rotation_set(long j, NLEWatermarkEntity nLEWatermarkEntity, int i);

    public static final native long NLEWatermarkEntity_sequenceIn_get(long j, NLEWatermarkEntity nLEWatermarkEntity);

    public static final native void NLEWatermarkEntity_sequenceIn_set(long j, NLEWatermarkEntity nLEWatermarkEntity, long j2);

    public static final native long NLEWatermarkEntity_sequenceOut_get(long j, NLEWatermarkEntity nLEWatermarkEntity);

    public static final native void NLEWatermarkEntity_sequenceOut_set(long j, NLEWatermarkEntity nLEWatermarkEntity, long j2);

    public static final native int NLEWatermarkEntity_width_get(long j, NLEWatermarkEntity nLEWatermarkEntity);

    public static final native void NLEWatermarkEntity_width_set(long j, NLEWatermarkEntity nLEWatermarkEntity, int i);

    public static final native int NLEWatermarkEntity_xOffset_get(long j, NLEWatermarkEntity nLEWatermarkEntity);

    public static final native void NLEWatermarkEntity_xOffset_set(long j, NLEWatermarkEntity nLEWatermarkEntity, int i);

    public static final native int NLEWatermarkEntity_yOffset_get(long j, NLEWatermarkEntity nLEWatermarkEntity);

    public static final native void NLEWatermarkEntity_yOffset_set(long j, NLEWatermarkEntity nLEWatermarkEntity, int i);

    public static final native int NLEWatermarkMask_height_get(long j, NLEWatermarkMask nLEWatermarkMask);

    public static final native void NLEWatermarkMask_height_set(long j, NLEWatermarkMask nLEWatermarkMask, int i);

    public static final native String NLEWatermarkMask_maskImage_get(long j, NLEWatermarkMask nLEWatermarkMask);

    public static final native void NLEWatermarkMask_maskImage_set(long j, NLEWatermarkMask nLEWatermarkMask, String str);

    public static final native int NLEWatermarkMask_width_get(long j, NLEWatermarkMask nLEWatermarkMask);

    public static final native void NLEWatermarkMask_width_set(long j, NLEWatermarkMask nLEWatermarkMask, int i);

    public static final native int NLEWatermarkMask_xOffset_get(long j, NLEWatermarkMask nLEWatermarkMask);

    public static final native void NLEWatermarkMask_xOffset_set(long j, NLEWatermarkMask nLEWatermarkMask, int i);

    public static final native int NLEWatermarkMask_yOffset_get(long j, NLEWatermarkMask nLEWatermarkMask);

    public static final native void NLEWatermarkMask_yOffset_set(long j, NLEWatermarkMask nLEWatermarkMask, int i);

    public static final native long NLEWatermarkParam_duration_get(long j, NLEWatermarkParam nLEWatermarkParam);

    public static final native void NLEWatermarkParam_duration_set(long j, NLEWatermarkParam nLEWatermarkParam, long j2);

    public static final native long NLEWatermarkParam_entities_get(long j, NLEWatermarkParam nLEWatermarkParam);

    public static final native void NLEWatermarkParam_entities_set(long j, NLEWatermarkParam nLEWatermarkParam, long j2, VecNLEWatermarkEntity vecNLEWatermarkEntity);

    public static final native String NLEWatermarkParam_extFile_get(long j, NLEWatermarkParam nLEWatermarkParam);

    public static final native void NLEWatermarkParam_extFile_set(long j, NLEWatermarkParam nLEWatermarkParam, String str);

    public static final native int NLEWatermarkParam_height_get(long j, NLEWatermarkParam nLEWatermarkParam);

    public static final native void NLEWatermarkParam_height_set(long j, NLEWatermarkParam nLEWatermarkParam, int i);

    public static final native long NLEWatermarkParam_images_get(long j, NLEWatermarkParam nLEWatermarkParam);

    public static final native void NLEWatermarkParam_images_set(long j, NLEWatermarkParam nLEWatermarkParam, long j2, VecString vecString);

    public static final native int NLEWatermarkParam_interval_get(long j, NLEWatermarkParam nLEWatermarkParam);

    public static final native void NLEWatermarkParam_interval_set(long j, NLEWatermarkParam nLEWatermarkParam, int i);

    public static final native long NLEWatermarkParam_mask_get(long j, NLEWatermarkParam nLEWatermarkParam);

    public static final native void NLEWatermarkParam_mask_set(long j, NLEWatermarkParam nLEWatermarkParam, long j2, NLEWatermarkMask nLEWatermarkMask);

    public static final native boolean NLEWatermarkParam_needExtFile_get(long j, NLEWatermarkParam nLEWatermarkParam);

    public static final native void NLEWatermarkParam_needExtFile_set(long j, NLEWatermarkParam nLEWatermarkParam, boolean z);

    public static final native int NLEWatermarkParam_position_get(long j, NLEWatermarkParam nLEWatermarkParam);

    public static final native void NLEWatermarkParam_position_set(long j, NLEWatermarkParam nLEWatermarkParam, int i);

    public static final native int NLEWatermarkParam_rotation_get(long j, NLEWatermarkParam nLEWatermarkParam);

    public static final native void NLEWatermarkParam_rotation_set(long j, NLEWatermarkParam nLEWatermarkParam, int i);

    public static final native long NLEWatermarkParam_secondHalfImages_get(long j, NLEWatermarkParam nLEWatermarkParam);

    public static final native void NLEWatermarkParam_secondHalfImages_set(long j, NLEWatermarkParam nLEWatermarkParam, long j2, VecString vecString);

    public static final native int NLEWatermarkParam_width_get(long j, NLEWatermarkParam nLEWatermarkParam);

    public static final native void NLEWatermarkParam_width_set(long j, NLEWatermarkParam nLEWatermarkParam, int i);

    public static final native int NLEWatermarkParam_xOffset_get(long j, NLEWatermarkParam nLEWatermarkParam);

    public static final native void NLEWatermarkParam_xOffset_set(long j, NLEWatermarkParam nLEWatermarkParam, int i);

    public static final native int NLEWatermarkParam_yOffset_get(long j, NLEWatermarkParam nLEWatermarkParam);

    public static final native void NLEWatermarkParam_yOffset_set(long j, NLEWatermarkParam nLEWatermarkParam, int i);

    public static final native long VecNLEBeatTrackingInfo_capacity(long j, VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo);

    public static final native void VecNLEBeatTrackingInfo_clear(long j, VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo);

    public static final native void VecNLEBeatTrackingInfo_doAdd__SWIG_0(long j, VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo, long j2, NLEBeatTrackingInfo nLEBeatTrackingInfo);

    public static final native void VecNLEBeatTrackingInfo_doAdd__SWIG_1(long j, VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo, int i, long j2, NLEBeatTrackingInfo nLEBeatTrackingInfo);

    public static final native long VecNLEBeatTrackingInfo_doGet(long j, VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo, int i);

    public static final native long VecNLEBeatTrackingInfo_doRemove(long j, VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo, int i);

    public static final native void VecNLEBeatTrackingInfo_doRemoveRange(long j, VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo, int i, int i2);

    public static final native long VecNLEBeatTrackingInfo_doSet(long j, VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo, int i, long j2, NLEBeatTrackingInfo nLEBeatTrackingInfo);

    public static final native int VecNLEBeatTrackingInfo_doSize(long j, VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo);

    public static final native boolean VecNLEBeatTrackingInfo_isEmpty(long j, VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo);

    public static final native void VecNLEBeatTrackingInfo_reserve(long j, VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo, long j2);

    public static final native long VecNLEClipAlgorithmParam_capacity(long j, VecNLEClipAlgorithmParam vecNLEClipAlgorithmParam);

    public static final native void VecNLEClipAlgorithmParam_clear(long j, VecNLEClipAlgorithmParam vecNLEClipAlgorithmParam);

    public static final native void VecNLEClipAlgorithmParam_doAdd__SWIG_0(long j, VecNLEClipAlgorithmParam vecNLEClipAlgorithmParam, long j2, NLEClipAlgorithmParam nLEClipAlgorithmParam);

    public static final native void VecNLEClipAlgorithmParam_doAdd__SWIG_1(long j, VecNLEClipAlgorithmParam vecNLEClipAlgorithmParam, int i, long j2, NLEClipAlgorithmParam nLEClipAlgorithmParam);

    public static final native long VecNLEClipAlgorithmParam_doGet(long j, VecNLEClipAlgorithmParam vecNLEClipAlgorithmParam, int i);

    public static final native long VecNLEClipAlgorithmParam_doRemove(long j, VecNLEClipAlgorithmParam vecNLEClipAlgorithmParam, int i);

    public static final native void VecNLEClipAlgorithmParam_doRemoveRange(long j, VecNLEClipAlgorithmParam vecNLEClipAlgorithmParam, int i, int i2);

    public static final native long VecNLEClipAlgorithmParam_doSet(long j, VecNLEClipAlgorithmParam vecNLEClipAlgorithmParam, int i, long j2, NLEClipAlgorithmParam nLEClipAlgorithmParam);

    public static final native int VecNLEClipAlgorithmParam_doSize(long j, VecNLEClipAlgorithmParam vecNLEClipAlgorithmParam);

    public static final native boolean VecNLEClipAlgorithmParam_isEmpty(long j, VecNLEClipAlgorithmParam vecNLEClipAlgorithmParam);

    public static final native void VecNLEClipAlgorithmParam_reserve(long j, VecNLEClipAlgorithmParam vecNLEClipAlgorithmParam, long j2);

    public static final native long VecNLECompileMediaInfo_capacity(long j, VecNLECompileMediaInfo vecNLECompileMediaInfo);

    public static final native void VecNLECompileMediaInfo_clear(long j, VecNLECompileMediaInfo vecNLECompileMediaInfo);

    public static final native void VecNLECompileMediaInfo_doAdd__SWIG_0(long j, VecNLECompileMediaInfo vecNLECompileMediaInfo, long j2, NLECompileMediaInfo nLECompileMediaInfo);

    public static final native void VecNLECompileMediaInfo_doAdd__SWIG_1(long j, VecNLECompileMediaInfo vecNLECompileMediaInfo, int i, long j2, NLECompileMediaInfo nLECompileMediaInfo);

    public static final native long VecNLECompileMediaInfo_doGet(long j, VecNLECompileMediaInfo vecNLECompileMediaInfo, int i);

    public static final native long VecNLECompileMediaInfo_doRemove(long j, VecNLECompileMediaInfo vecNLECompileMediaInfo, int i);

    public static final native void VecNLECompileMediaInfo_doRemoveRange(long j, VecNLECompileMediaInfo vecNLECompileMediaInfo, int i, int i2);

    public static final native long VecNLECompileMediaInfo_doSet(long j, VecNLECompileMediaInfo vecNLECompileMediaInfo, int i, long j2, NLECompileMediaInfo nLECompileMediaInfo);

    public static final native int VecNLECompileMediaInfo_doSize(long j, VecNLECompileMediaInfo vecNLECompileMediaInfo);

    public static final native boolean VecNLECompileMediaInfo_isEmpty(long j, VecNLECompileMediaInfo vecNLECompileMediaInfo);

    public static final native void VecNLECompileMediaInfo_reserve(long j, VecNLECompileMediaInfo vecNLECompileMediaInfo, long j2);

    public static final native long VecNLELoudnessDetectResult_capacity(long j, VecNLELoudnessDetectResult vecNLELoudnessDetectResult);

    public static final native void VecNLELoudnessDetectResult_clear(long j, VecNLELoudnessDetectResult vecNLELoudnessDetectResult);

    public static final native void VecNLELoudnessDetectResult_doAdd__SWIG_0(long j, VecNLELoudnessDetectResult vecNLELoudnessDetectResult, long j2, NLELoudnessDetectResult nLELoudnessDetectResult);

    public static final native void VecNLELoudnessDetectResult_doAdd__SWIG_1(long j, VecNLELoudnessDetectResult vecNLELoudnessDetectResult, int i, long j2, NLELoudnessDetectResult nLELoudnessDetectResult);

    public static final native long VecNLELoudnessDetectResult_doGet(long j, VecNLELoudnessDetectResult vecNLELoudnessDetectResult, int i);

    public static final native long VecNLELoudnessDetectResult_doRemove(long j, VecNLELoudnessDetectResult vecNLELoudnessDetectResult, int i);

    public static final native void VecNLELoudnessDetectResult_doRemoveRange(long j, VecNLELoudnessDetectResult vecNLELoudnessDetectResult, int i, int i2);

    public static final native long VecNLELoudnessDetectResult_doSet(long j, VecNLELoudnessDetectResult vecNLELoudnessDetectResult, int i, long j2, NLELoudnessDetectResult nLELoudnessDetectResult);

    public static final native int VecNLELoudnessDetectResult_doSize(long j, VecNLELoudnessDetectResult vecNLELoudnessDetectResult);

    public static final native boolean VecNLELoudnessDetectResult_isEmpty(long j, VecNLELoudnessDetectResult vecNLELoudnessDetectResult);

    public static final native void VecNLELoudnessDetectResult_reserve(long j, VecNLELoudnessDetectResult vecNLELoudnessDetectResult, long j2);

    public static final native long VecNLEMVResourceBean_capacity(long j, VecNLEMVResourceBean vecNLEMVResourceBean);

    public static final native void VecNLEMVResourceBean_clear(long j, VecNLEMVResourceBean vecNLEMVResourceBean);

    public static final native void VecNLEMVResourceBean_doAdd__SWIG_0(long j, VecNLEMVResourceBean vecNLEMVResourceBean, long j2, NLEMVResourceBean nLEMVResourceBean);

    public static final native void VecNLEMVResourceBean_doAdd__SWIG_1(long j, VecNLEMVResourceBean vecNLEMVResourceBean, int i, long j2, NLEMVResourceBean nLEMVResourceBean);

    public static final native long VecNLEMVResourceBean_doGet(long j, VecNLEMVResourceBean vecNLEMVResourceBean, int i);

    public static final native long VecNLEMVResourceBean_doRemove(long j, VecNLEMVResourceBean vecNLEMVResourceBean, int i);

    public static final native void VecNLEMVResourceBean_doRemoveRange(long j, VecNLEMVResourceBean vecNLEMVResourceBean, int i, int i2);

    public static final native long VecNLEMVResourceBean_doSet(long j, VecNLEMVResourceBean vecNLEMVResourceBean, int i, long j2, NLEMVResourceBean nLEMVResourceBean);

    public static final native int VecNLEMVResourceBean_doSize(long j, VecNLEMVResourceBean vecNLEMVResourceBean);

    public static final native boolean VecNLEMVResourceBean_isEmpty(long j, VecNLEMVResourceBean vecNLEMVResourceBean);

    public static final native void VecNLEMVResourceBean_reserve(long j, VecNLEMVResourceBean vecNLEMVResourceBean, long j2);

    public static final native long VecNLEWatermarkEntity_capacity(long j, VecNLEWatermarkEntity vecNLEWatermarkEntity);

    public static final native void VecNLEWatermarkEntity_clear(long j, VecNLEWatermarkEntity vecNLEWatermarkEntity);

    public static final native void VecNLEWatermarkEntity_doAdd__SWIG_0(long j, VecNLEWatermarkEntity vecNLEWatermarkEntity, long j2, NLEWatermarkEntity nLEWatermarkEntity);

    public static final native void VecNLEWatermarkEntity_doAdd__SWIG_1(long j, VecNLEWatermarkEntity vecNLEWatermarkEntity, int i, long j2, NLEWatermarkEntity nLEWatermarkEntity);

    public static final native long VecNLEWatermarkEntity_doGet(long j, VecNLEWatermarkEntity vecNLEWatermarkEntity, int i);

    public static final native long VecNLEWatermarkEntity_doRemove(long j, VecNLEWatermarkEntity vecNLEWatermarkEntity, int i);

    public static final native void VecNLEWatermarkEntity_doRemoveRange(long j, VecNLEWatermarkEntity vecNLEWatermarkEntity, int i, int i2);

    public static final native long VecNLEWatermarkEntity_doSet(long j, VecNLEWatermarkEntity vecNLEWatermarkEntity, int i, long j2, NLEWatermarkEntity nLEWatermarkEntity);

    public static final native int VecNLEWatermarkEntity_doSize(long j, VecNLEWatermarkEntity vecNLEWatermarkEntity);

    public static final native boolean VecNLEWatermarkEntity_isEmpty(long j, VecNLEWatermarkEntity vecNLEWatermarkEntity);

    public static final native void VecNLEWatermarkEntity_reserve(long j, VecNLEWatermarkEntity vecNLEWatermarkEntity, long j2);

    public static final native void delete_INLEAsyncRenderPlayStatusListener(long j);

    public static final native void delete_INLEMattingListener(long j);

    public static final native void delete_INLENecessaryResourceFetchCallback(long j);

    public static final native void delete_INLEResourceDownloadConfig(long j);

    public static final native void delete_INLEResourceDownloadStatusListener(long j);

    public static final native void delete_NLEAlgorithmPath(long j);

    public static final native void delete_NLEAudioCompileEncodeSettings(long j);

    public static final native void delete_NLEAudioHWEncodeSettings(long j);

    public static final native void delete_NLEAudioSWEncodeSettings(long j);

    public static final native void delete_NLEAudioXResults(long j);

    public static final native void delete_NLEBeatTrackingInfo(long j);

    public static final native void delete_NLEBeatTrackingParam(long j);

    public static final native void delete_NLEBrushStickerState(long j);

    public static final native void delete_NLEClipAlgorithmParam(long j);

    public static final native void delete_NLECompileMediaInfo(long j);

    public static final native void delete_NLECompileResult(long j);

    public static final native void delete_NLELoudnessDetectResult(long j);

    public static final native void delete_NLEMVAudioInfo(long j);

    public static final native void delete_NLEMVInfoBean(long j);

    public static final native void delete_NLEMVResourceBean(long j);

    public static final native void delete_NLEMediaABConfig(long j);

    public static final native void delete_NLEMediaAudioInfo(long j);

    public static final native void delete_NLEMediaConfig(long j);

    public static final native void delete_NLEMediaMessageListener(long j);

    public static final native void delete_NLEMediaVideoInfo(long j);

    public static final native void delete_NLEModelExporterListenerParamBody(long j);

    public static final native void delete_NLEModelVESequenceError(long j);

    public static final native void delete_NLEPosition(long j);

    public static final native void delete_NLERectF(long j);

    public static final native void delete_NLEResourceCallback(long j);

    public static final native void delete_NLEResourceManager(long j);

    public static final native void delete_NLERichTextParam(long j);

    public static final native void delete_NLETimeRange(long j);

    public static final native void delete_NLEUploadParams(long j);

    public static final native void delete_NLEVEGlobalConfig(long j);

    public static final native void delete_NLEVEUserConfig(long j);

    public static final native void delete_NLEVQScoreResult(long j);

    public static final native void delete_NLEVideoCompileEncodeSettings(long j);

    public static final native void delete_NLEVideoEncodeSettings(long j);

    public static final native void delete_NLEVideoHWEncodeSettings(long j);

    public static final native void delete_NLEVideoInvisibleWatermark(long j);

    public static final native void delete_NLEVideoSWEncodeSettings(long j);

    public static final native void delete_NLEWatermarkEntity(long j);

    public static final native void delete_NLEWatermarkMask(long j);

    public static final native void delete_NLEWatermarkParam(long j);

    public static final native void delete_VecNLEBeatTrackingInfo(long j);

    public static final native void delete_VecNLEClipAlgorithmParam(long j);

    public static final native void delete_VecNLECompileMediaInfo(long j);

    public static final native void delete_VecNLELoudnessDetectResult(long j);

    public static final native void delete_VecNLEMVResourceBean(long j);

    public static final native void delete_VecNLEWatermarkEntity(long j);

    public static final native long new_INLEAsyncRenderPlayStatusListener();

    public static final native long new_INLEMattingListener();

    public static final native long new_INLENecessaryResourceFetchCallback();

    public static final native long new_INLEResourceDownloadStatusListener();

    public static final native long new_NLEAlgorithmPath();

    public static final native long new_NLEAudioCompileEncodeSettings();

    public static final native long new_NLEAudioHWEncodeSettings();

    public static final native long new_NLEAudioSWEncodeSettings();

    public static final native long new_NLEAudioXResults();

    public static final native long new_NLEBeatTrackingInfo();

    public static final native long new_NLEBeatTrackingParam();

    public static final native long new_NLEBrushStickerState();

    public static final native long new_NLEClipAlgorithmParam();

    public static final native long new_NLECompileMediaInfo();

    public static final native long new_NLECompileResult();

    public static final native long new_NLELoudnessDetectResult();

    public static final native long new_NLEMVAudioInfo();

    public static final native long new_NLEMVInfoBean();

    public static final native long new_NLEMVResourceBean();

    public static final native long new_NLEMediaABConfig();

    public static final native long new_NLEMediaAudioInfo();

    public static final native long new_NLEMediaConfig();

    public static final native long new_NLEMediaMessageListener();

    public static final native long new_NLEMediaVideoInfo();

    public static final native long new_NLEModelExporterListenerParamBody();

    public static final native long new_NLEModelVESequenceError();

    public static final native long new_NLEPosition__SWIG_0();

    public static final native long new_NLEPosition__SWIG_1(float f, float f2);

    public static final native long new_NLERectF__SWIG_0();

    public static final native long new_NLERectF__SWIG_1(float f, float f2, float f3, float f4);

    public static final native long new_NLEResourceCallback();

    public static final native long new_NLEResourceManager();

    public static final native long new_NLERichTextParam();

    public static final native long new_NLETimeRange();

    public static final native long new_NLEUploadParams();

    public static final native long new_NLEVEGlobalConfig();

    public static final native long new_NLEVEUserConfig();

    public static final native long new_NLEVQScoreResult();

    public static final native long new_NLEVideoCompileEncodeSettings();

    public static final native long new_NLEVideoEncodeSettings();

    public static final native long new_NLEVideoHWEncodeSettings();

    public static final native long new_NLEVideoInvisibleWatermark();

    public static final native long new_NLEVideoSWEncodeSettings();

    public static final native long new_NLEWatermarkEntity();

    public static final native long new_NLEWatermarkMask();

    public static final native long new_NLEWatermarkParam();

    public static final native long new_VecNLEBeatTrackingInfo__SWIG_0();

    public static final native long new_VecNLEBeatTrackingInfo__SWIG_1(long j, VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo);

    public static final native long new_VecNLEBeatTrackingInfo__SWIG_2(int i, long j, NLEBeatTrackingInfo nLEBeatTrackingInfo);

    public static final native long new_VecNLEClipAlgorithmParam__SWIG_0();

    public static final native long new_VecNLEClipAlgorithmParam__SWIG_1(long j, VecNLEClipAlgorithmParam vecNLEClipAlgorithmParam);

    public static final native long new_VecNLEClipAlgorithmParam__SWIG_2(int i, long j, NLEClipAlgorithmParam nLEClipAlgorithmParam);

    public static final native long new_VecNLECompileMediaInfo__SWIG_0();

    public static final native long new_VecNLECompileMediaInfo__SWIG_1(long j, VecNLECompileMediaInfo vecNLECompileMediaInfo);

    public static final native long new_VecNLECompileMediaInfo__SWIG_2(int i, long j, NLECompileMediaInfo nLECompileMediaInfo);

    public static final native long new_VecNLELoudnessDetectResult__SWIG_0();

    public static final native long new_VecNLELoudnessDetectResult__SWIG_1(long j, VecNLELoudnessDetectResult vecNLELoudnessDetectResult);

    public static final native long new_VecNLELoudnessDetectResult__SWIG_2(int i, long j, NLELoudnessDetectResult nLELoudnessDetectResult);

    public static final native long new_VecNLEMVResourceBean__SWIG_0();

    public static final native long new_VecNLEMVResourceBean__SWIG_1(long j, VecNLEMVResourceBean vecNLEMVResourceBean);

    public static final native long new_VecNLEMVResourceBean__SWIG_2(int i, long j, NLEMVResourceBean nLEMVResourceBean);

    public static final native long new_VecNLEWatermarkEntity__SWIG_0();

    public static final native long new_VecNLEWatermarkEntity__SWIG_1(long j, VecNLEWatermarkEntity vecNLEWatermarkEntity);

    public static final native long new_VecNLEWatermarkEntity__SWIG_2(int i, long j, NLEWatermarkEntity nLEWatermarkEntity);

    public static final native void swig_module_init();

    static {
        swig_module_init();
    }

    public static void SwigDirector_INLEAsyncRenderPlayStatusListener_onPauseInner(INLEAsyncRenderPlayStatusListener iNLEAsyncRenderPlayStatusListener) {
        iNLEAsyncRenderPlayStatusListener.onPauseInner();
    }

    public static void SwigDirector_INLEAsyncRenderPlayStatusListener_onPlayInner(INLEAsyncRenderPlayStatusListener iNLEAsyncRenderPlayStatusListener) {
        iNLEAsyncRenderPlayStatusListener.onPlayInner();
    }

    public static void SwigDirector_INLEMattingListener_onMattingStartedCallback(INLEMattingListener iNLEMattingListener) {
        iNLEMattingListener.onMattingStartedCallback();
    }

    public static void SwigDirector_INLEResourceDownloadStatusListener_onAllResourceDownloadFinished(INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener) {
        iNLEResourceDownloadStatusListener.onAllResourceDownloadFinished();
    }

    public static void SwigDirector_INLEMattingListener_onMattingAddedCallback(INLEMattingListener iNLEMattingListener, String str) {
        iNLEMattingListener.onMattingAddedCallback(str);
    }

    public static void SwigDirector_INLEMattingListener_onMattingRemovedCallback(INLEMattingListener iNLEMattingListener, String str) {
        iNLEMattingListener.onMattingRemovedCallback(str);
    }

    public static boolean SwigDirector_INLEMattingListener_shouldInterceptMatting(INLEMattingListener iNLEMattingListener, long j) {
        NLETrackSlot nLETrackSlot;
        if (j == 0) {
            nLETrackSlot = null;
        } else {
            nLETrackSlot = new NLETrackSlot(j, true);
        }
        return iNLEMattingListener.shouldInterceptMatting(nLETrackSlot);
    }

    public static void SwigDirector_INLENecessaryResourceFetchCallback_onPreFetch(INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, long j) {
        iNLENecessaryResourceFetchCallback.onPreFetch(new VecString(j, false));
    }

    public static void SwigDirector_INLENecessaryResourceFetchCallback_onProgress(INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, float f) {
        iNLENecessaryResourceFetchCallback.onProgress(f);
    }

    public static void SwigDirector_INLEResourceDownloadStatusListener_onStart(INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener, long j) {
        NLEResourceNode nLEResourceNode;
        if (j == 0) {
            nLEResourceNode = null;
        } else {
            nLEResourceNode = new NLEResourceNode(j, true);
        }
        iNLEResourceDownloadStatusListener.onStart(nLEResourceNode);
    }

    public static void SwigDirector_NLEResourceCallback_onProgress(NLEResourceCallback nLEResourceCallback, float f) {
        nLEResourceCallback.onProgress(f);
    }

    public static int SwigDirector_NLEResourceManager_cancelTask(NLEResourceManager nLEResourceManager, String str) {
        return nLEResourceManager.cancelTask(str);
    }

    public static String SwigDirector_NLEResourceManager_fetchResource__SWIG_1(NLEResourceManager nLEResourceManager, String str) {
        return nLEResourceManager.fetchResource(str);
    }

    public static int SwigDirector_NLEResourceManager_pauseTask(NLEResourceManager nLEResourceManager, String str) {
        return nLEResourceManager.pauseTask(str);
    }

    public static int SwigDirector_NLEResourceManager_resumeTask__SWIG_1(NLEResourceManager nLEResourceManager, String str) {
        return nLEResourceManager.resumeTask(str);
    }

    public static void SwigDirector_INLEMattingListener_onMattingDoneCallback(INLEMattingListener iNLEMattingListener, float f, String str) {
        iNLEMattingListener.onMattingDoneCallback(f, str);
    }

    public static void SwigDirector_INLEMattingListener_onMattingErrorCallback__SWIG_1(INLEMattingListener iNLEMattingListener, int i, String str) {
        iNLEMattingListener.onMattingErrorCallback(i, str);
    }

    public static void SwigDirector_INLEResourceDownloadStatusListener_onSuccess(INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener, long j, boolean z) {
        NLEResourceNode nLEResourceNode;
        if (j == 0) {
            nLEResourceNode = null;
        } else {
            nLEResourceNode = new NLEResourceNode(j, true);
        }
        iNLEResourceDownloadStatusListener.onSuccess(nLEResourceNode, z);
    }

    public static void SwigDirector_NLEResourceCallback_onError(NLEResourceCallback nLEResourceCallback, int i, String str) {
        nLEResourceCallback.onError(i, str);
    }

    public static String SwigDirector_NLEResourceManager_fetchResource__SWIG_0(NLEResourceManager nLEResourceManager, String str, long j) {
        NLEResourceCallback nLEResourceCallback;
        if (j == 0) {
            nLEResourceCallback = null;
        } else {
            nLEResourceCallback = new NLEResourceCallback(j, true);
        }
        return nLEResourceManager.fetchResource(str, nLEResourceCallback);
    }

    public static int SwigDirector_NLEResourceManager_resumeTask__SWIG_0(NLEResourceManager nLEResourceManager, String str, long j) {
        NLEResourceCallback nLEResourceCallback;
        if (j == 0) {
            nLEResourceCallback = null;
        } else {
            nLEResourceCallback = new NLEResourceCallback(j, true);
        }
        return nLEResourceManager.resumeTask(str, nLEResourceCallback);
    }

    public static void SwigDirector_INLEMattingListener_onMattingClipDoneCallback(INLEMattingListener iNLEMattingListener, String str, float f, float f2) {
        iNLEMattingListener.onMattingClipDoneCallback(str, f, f2);
    }

    public static void SwigDirector_INLEMattingListener_onMattingErrorCallback__SWIG_0(INLEMattingListener iNLEMattingListener, int i, int i2, float f) {
        iNLEMattingListener.onMattingErrorCallback(i, i2, f);
    }

    public static void SwigDirector_INLEMattingListener_onMattingInteractiveMaskCallback(INLEMattingListener iNLEMattingListener, String str, long j, String str2) {
        iNLEMattingListener.onMattingInteractiveMaskCallback(str, j, str2);
    }

    public static void SwigDirector_INLENecessaryResourceFetchCallback_onSingleResourceFail(INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, String str, int i, String str2) {
        iNLENecessaryResourceFetchCallback.onSingleResourceFail(str, i, str2);
    }

    public static void SwigDirector_INLEResourceDownloadStatusListener_onFail(INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener, long j, int i, String str) {
        NLEResourceNode nLEResourceNode;
        if (j == 0) {
            nLEResourceNode = null;
        } else {
            nLEResourceNode = new NLEResourceNode(j, true);
        }
        iNLEResourceDownloadStatusListener.onFail(nLEResourceNode, i, str);
    }

    public static void SwigDirector_NLEMediaMessageListener_onKeyFrameProcess(NLEMediaMessageListener nLEMediaMessageListener, String str, long j, String str2) {
        nLEMediaMessageListener.onKeyFrameProcess(str, j, str2);
    }

    public static void SwigDirector_NLEResourceCallback_onSuccess(NLEResourceCallback nLEResourceCallback, String str, String str2, boolean z) {
        nLEResourceCallback.onSuccess(str, str2, z);
    }

    public static void SwigDirector_INLEMattingListener_onMattingProgressCallback(INLEMattingListener iNLEMattingListener, String str, float f, float f2, boolean z) {
        iNLEMattingListener.onMattingProgressCallback(str, f, f2, z);
    }

    public static void SwigDirector_INLENecessaryResourceFetchCallback_onDone(INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, int i, int i2, int i3, String str) {
        iNLENecessaryResourceFetchCallback.onDone(i, i2, i3, str);
    }

    public static void SwigDirector_NLEMediaMessageListener_onError(NLEMediaMessageListener nLEMediaMessageListener, int i, int i2, float f, String str) {
        nLEMediaMessageListener.onError(i, i2, f, str);
    }

    public static void SwigDirector_NLEMediaMessageListener_onInfo(NLEMediaMessageListener nLEMediaMessageListener, int i, int i2, float f, String str) {
        nLEMediaMessageListener.onInfo(i, i2, f, str);
    }

    public static void SwigDirector_NLEMediaMessageListener_onKeyFrameProcessWithType(NLEMediaMessageListener nLEMediaMessageListener, String str, long j, String str2, int i) {
        nLEMediaMessageListener.onKeyFrameProcessWithType(str, j, str2, KeyframeType.swigToEnum(i));
    }
}
