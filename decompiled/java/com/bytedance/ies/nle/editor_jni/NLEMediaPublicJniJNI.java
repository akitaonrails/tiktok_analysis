package com.bytedance.ies.nle.editor_jni;

import com.bytedance.ies.nle.editor_jni.MapStrInt;

/* JADX INFO: loaded from: classes36.dex */
public class NLEMediaPublicJniJNI {
    public static final native void DLWCallback_change_ownership(DLWCallback dLWCallback, long j, boolean z);

    public static final native void DLWCallback_compileDone(long j, DLWCallback dLWCallback);

    public static final native void DLWCallback_compileError(long j, DLWCallback dLWCallback, int i);

    public static final native void DLWCallback_director_connect(DLWCallback dLWCallback, long j, boolean z, boolean z2);

    public static final native void DLWCallback_onProgress(long j, DLWCallback dLWCallback, float f);

    public static final native int DynamicLightWaveUtil_cancelCompile(long j, DynamicLightWaveUtil dynamicLightWaveUtil);

    public static final native int DynamicLightWaveUtil_compile(long j, DynamicLightWaveUtil dynamicLightWaveUtil, String str, boolean z, long j2, DLWCallback dLWCallback);

    public static final native int DynamicLightWaveUtil_destroy(long j, DynamicLightWaveUtil dynamicLightWaveUtil);

    public static final native int DynamicLightWaveUtil_insertClipAndFilter(long j, DynamicLightWaveUtil dynamicLightWaveUtil, long j2, SpeedConfig speedConfig, String str);

    public static final native void INLEApplyPatchCallback_change_ownership(INLEApplyPatchCallback iNLEApplyPatchCallback, long j, boolean z);

    public static final native void INLEApplyPatchCallback_director_connect(INLEApplyPatchCallback iNLEApplyPatchCallback, long j, boolean z, boolean z2);

    public static final native void INLEApplyPatchCallback_onError(long j, INLEApplyPatchCallback iNLEApplyPatchCallback, long j2, NLEModel nLEModel, String str);

    public static final native void INLEApplyPatchCallback_onProgress(long j, INLEApplyPatchCallback iNLEApplyPatchCallback, long j2, NLEModel nLEModel, float f);

    public static final native void INLEApplyPatchCallback_onSuccess(long j, INLEApplyPatchCallback iNLEApplyPatchCallback, long j2, NLEModel nLEModel);

    public static final native void INLEInvisibleWatermarkListener_change_ownership(INLEInvisibleWatermarkListener iNLEInvisibleWatermarkListener, long j, boolean z);

    public static final native void INLEInvisibleWatermarkListener_director_connect(INLEInvisibleWatermarkListener iNLEInvisibleWatermarkListener, long j, boolean z, boolean z2);

    public static final native void INLEInvisibleWatermarkListener_onFinished(long j, INLEInvisibleWatermarkListener iNLEInvisibleWatermarkListener, long j2, VecString vecString, int i);

    public static final native void INLEInvisibleWatermarkListener_onProgress(long j, INLEInvisibleWatermarkListener iNLEInvisibleWatermarkListener, long j2, long j3, long j4);

    public static final native void INLEMediaOnDone_change_ownership(INLEMediaOnDone iNLEMediaOnDone, long j, boolean z);

    public static final native void INLEMediaOnDone_director_connect(INLEMediaOnDone iNLEMediaOnDone, long j, boolean z, boolean z2);

    public static final native void INLEMediaOnDone_onDone(long j, INLEMediaOnDone iNLEMediaOnDone, int i);

    public static final native void INLEMediaOnProgressChanged_change_ownership(INLEMediaOnProgressChanged iNLEMediaOnProgressChanged, long j, boolean z);

    public static final native void INLEMediaOnProgressChanged_director_connect(INLEMediaOnProgressChanged iNLEMediaOnProgressChanged, long j, boolean z, boolean z2);

    public static final native void INLEMediaOnProgressChanged_onChanged(long j, INLEMediaOnProgressChanged iNLEMediaOnProgressChanged, double d);

    public static final native void INLEVQScoreWrapperListener_change_ownership(INLEVQScoreWrapperListener iNLEVQScoreWrapperListener, long j, boolean z);

    public static final native void INLEVQScoreWrapperListener_director_connect(INLEVQScoreWrapperListener iNLEVQScoreWrapperListener, long j, boolean z, boolean z2);

    public static final native void INLEVQScoreWrapperListener_onFinished(long j, INLEVQScoreWrapperListener iNLEVQScoreWrapperListener, long j2, VecDouble vecDouble);

    public static final native void INLEVQScoreWrapperListener_onProgress(long j, INLEVQScoreWrapperListener iNLEVQScoreWrapperListener, int i, int i2, double d);

    public static final native void KeyFrameCalcalator_refreshKeyframeInfo(long j, NLETrackSlot nLETrackSlot, long j2);

    public static final native String MapStrInt_Iterator_getKey(long j, MapStrInt.Iterator iterator);

    public static final native long MapStrInt_Iterator_getNextUnchecked(long j, MapStrInt.Iterator iterator);

    public static final native int MapStrInt_Iterator_getValue(long j, MapStrInt.Iterator iterator);

    public static final native boolean MapStrInt_Iterator_isNot(long j, MapStrInt.Iterator iterator, long j2, MapStrInt.Iterator iterator2);

    public static final native void MapStrInt_Iterator_setValue(long j, MapStrInt.Iterator iterator, int i);

    public static final native long MapStrInt_begin(long j, MapStrInt mapStrInt);

    public static final native void MapStrInt_clear(long j, MapStrInt mapStrInt);

    public static final native boolean MapStrInt_containsImpl(long j, MapStrInt mapStrInt, String str);

    public static final native long MapStrInt_end(long j, MapStrInt mapStrInt);

    public static final native long MapStrInt_find(long j, MapStrInt mapStrInt, String str);

    public static final native boolean MapStrInt_isEmpty(long j, MapStrInt mapStrInt);

    public static final native void MapStrInt_putUnchecked(long j, MapStrInt mapStrInt, String str, int i);

    public static final native void MapStrInt_removeUnchecked(long j, MapStrInt mapStrInt, long j2, MapStrInt.Iterator iterator);

    public static final native int MapStrInt_sizeImpl(long j, MapStrInt mapStrInt);

    public static final native void NLEAlgorithmCallbackWrapper_change_ownership(NLEAlgorithmCallbackWrapper nLEAlgorithmCallbackWrapper, long j, boolean z);

    public static final native void NLEAlgorithmCallbackWrapper_director_connect(NLEAlgorithmCallbackWrapper nLEAlgorithmCallbackWrapper, long j, boolean z, boolean z2);

    public static final native void NLEAlgorithmCallbackWrapper_onProgress(long j, NLEAlgorithmCallbackWrapper nLEAlgorithmCallbackWrapper, float f);

    public static final native int NLEAlgorithmController_beginGenVideoFrames(long j, NLEAlgorithmController nLEAlgorithmController, int i, long j2, NLEAlgorithmCallbackWrapper nLEAlgorithmCallbackWrapper);

    public static final native int NLEAlgorithmController_cancelGenVideoFrame(long j, NLEAlgorithmController nLEAlgorithmController, int i);

    public static final native int NLEAlgorithmController_genRandomSolve(long j, NLEAlgorithmController nLEAlgorithmController);

    public static final native int NLEAlgorithmController_genSmartCutting(long j, NLEAlgorithmController nLEAlgorithmController);

    public static final native long NLEAlgorithmController_getAllVideoRangeData(long j, NLEAlgorithmController nLEAlgorithmController);

    public static final native int NLEAlgorithmController_initBingoAlgorithm(long j, NLEAlgorithmController nLEAlgorithmController);

    public static final native int NLEAlgorithmController_initSmartAlgorithm(long j, NLEAlgorithmController nLEAlgorithmController, long j2, long j3, long j4, NLEAlgorithmPath nLEAlgorithmPath);

    public static final native int NLEAlgorithmController_reInitSmartAlgorithmIfPossible(long j, NLEAlgorithmController nLEAlgorithmController);

    public static final native int NLEAlgorithmController_setMusicAndResult(long j, NLEAlgorithmController nLEAlgorithmController, String str, int i, int i2, long j2, NLEAlgorithmPath nLEAlgorithmPath);

    public static final native int NLEAlgorithmController_updateAlgorithmFromNormal(long j, NLEAlgorithmController nLEAlgorithmController);

    public static final native long NLEApplyPatchShims_applyNLEModelWithJSON(long j, NLEApplyPatchShims nLEApplyPatchShims, String str, long j2, INLEApplyPatchCallback iNLEApplyPatchCallback);

    public static final native long NLEApplyPatchShims_applyNLEModel__SWIG_0(long j, NLEApplyPatchShims nLEApplyPatchShims, long j2, NLEModel nLEModel, long j3, INLEApplyPatchCallback iNLEApplyPatchCallback);

    public static final native long NLEApplyPatchShims_applyNLEModel__SWIG_1(long j, NLEApplyPatchShims nLEApplyPatchShims, long j2, NLEModel nLEModel, long j3, INLEApplyPatchCallback iNLEApplyPatchCallback, boolean z);

    public static final native long NLEApplyPatchShims_rebindNLEModel(long j, NLEApplyPatchShims nLEApplyPatchShims, long j2, NLEModel nLEModel);

    public static final native void NLEAudioBeatTracking_notifyStop(long j, NLEAudioBeatTracking nLEAudioBeatTracking);

    public static final native int NLEAudioBeatTracking_process(long j, NLEAudioBeatTracking nLEAudioBeatTracking, long j2, NLEBeatTrackingParam nLEBeatTrackingParam, long j3, VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo);

    public static final native int NLEBrushRuntimeController_addBrushStickerStroke__SWIG_0(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str, Object obj, long j2, NLERectF nLERectF);

    public static final native int NLEBrushRuntimeController_addBrushStickerStroke__SWIG_1(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str, String str2, String str3, long j2);

    public static final native int NLEBrushRuntimeController_begin2DBrush(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str);

    public static final native int NLEBrushRuntimeController_clear2DBrush(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str);

    public static final native int NLEBrushRuntimeController_end2DBrush(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str);

    public static final native long NLEBrushRuntimeController_getBrushStickerOutState(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str, boolean z);

    public static final native int NLEBrushRuntimeController_processPanEvent(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str, float f, float f2, float f3, float f4, float f5);

    public static final native int NLEBrushRuntimeController_processTouchDownEvent(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str, float f, float f2, float f3, float f4, float f5);

    public static final native int NLEBrushRuntimeController_processTouchUpEvent(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str, float f, float f2, float f3, float f4, float f5);

    public static final native int NLEBrushRuntimeController_processTouchUpEvent2(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str, float f, float f2, float f3, float f4, float f5, boolean z);

    public static final native int NLEBrushRuntimeController_redo2DBrush(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str);

    public static final native int NLEBrushRuntimeController_reverse2DBrush(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str);

    public static final native int NLEBrushRuntimeController_saveBrushStickerContext(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str, String str2, long j2, NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper);

    public static final native int NLEBrushRuntimeController_saveStickerBrushMask(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str, String str2, long j2, NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper);

    public static final native int NLEBrushRuntimeController_saveStickerBrushToPng(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str, String str2, long j2, NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper);

    public static final native int NLEBrushRuntimeController_setBrushStickerOutStateCallback(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str, long j2, NLEBrushStateCallbackWrapper nLEBrushStateCallbackWrapper);

    public static final native int NLEBrushRuntimeController_undo2DBrush(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str);

    public static final native void NLEBrushSaveCallbackWrapper_change_ownership(NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper, long j, boolean z);

    public static final native void NLEBrushSaveCallbackWrapper_director_connect(NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper, long j, boolean z, boolean z2);

    public static final native void NLEBrushSaveCallbackWrapper_onDone(long j, NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper, String str, boolean z);

    public static final native void NLEBrushSaveCallbackWrapper_onDoneSwigExplicitNLEBrushSaveCallbackWrapper(long j, NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper, String str, boolean z);

    public static final native void NLEBrushStateCallbackWrapper_change_ownership(NLEBrushStateCallbackWrapper nLEBrushStateCallbackWrapper, long j, boolean z);

    public static final native void NLEBrushStateCallbackWrapper_director_connect(NLEBrushStateCallbackWrapper nLEBrushStateCallbackWrapper, long j, boolean z, boolean z2);

    public static final native void NLEBrushStateCallbackWrapper_onStateChange(long j, NLEBrushStateCallbackWrapper nLEBrushStateCallbackWrapper, long j2, NLEBrushStickerState nLEBrushStickerState);

    public static final native void NLEBrushStateCallbackWrapper_onStateChangeSwigExplicitNLEBrushStateCallbackWrapper(long j, NLEBrushStateCallbackWrapper nLEBrushStateCallbackWrapper, long j2, NLEBrushStickerState nLEBrushStickerState);

    public static final native void NLECompileListenerWrapper_onCompileDone(long j, NLECompileListenerWrapper nLECompileListenerWrapper);

    public static final native void NLECompileListenerWrapper_onCompileError(long j, NLECompileListenerWrapper nLECompileListenerWrapper, int i, int i2, float f, String str);

    public static final native void NLECompileListenerWrapper_onCompileProgress(long j, NLECompileListenerWrapper nLECompileListenerWrapper, float f);

    public static final native void NLEConfigUtil_disableSetDataSourceOpt(long j);

    public static final native boolean NLEConfigUtil_enableFixCallback();

    public static final native boolean NLEConfigUtil_enableInvalidParamMonitor();

    public static final native boolean NLEConfigUtil_enableSeekDoneAndRenderCallbackOpt();

    public static final native boolean NLEConfigUtil_enableSetDataSourceOpt(long j);

    public static final native boolean NLEConfigUtil_enableSetDataSourceOptFix();

    public static final native boolean NLEConfigUtil_enableSetDataSourceOptFix2();

    public static final native boolean NLEConfigUtil_enableSetDataSourceOptIgnoreEditorMode();

    public static final native boolean NLEConfigUtil_enableSetDataSourceOptSkipMultiPhoto();

    public static final native void NLEConfigUtil_restoreSetDataSourceOpt(long j);

    public static final native void NLEDoActionListenerWrapper_change_ownership(NLEDoActionListenerWrapper nLEDoActionListenerWrapper, long j, boolean z);

    public static final native void NLEDoActionListenerWrapper_director_connect(NLEDoActionListenerWrapper nLEDoActionListenerWrapper, long j, boolean z, boolean z2);

    public static final native void NLEDoActionListenerWrapper_onDoActionCompleted(long j, NLEDoActionListenerWrapper nLEDoActionListenerWrapper, long j2, MapStrStr mapStrStr);

    public static final native void NLEDoActionListenerWrapper_onDoActionCompletedSwigExplicitNLEDoActionListenerWrapper(long j, NLEDoActionListenerWrapper nLEDoActionListenerWrapper, long j2, MapStrStr mapStrStr);

    public static final native void NLEEffectMsgListenerWrapper_change_ownership(NLEEffectMsgListenerWrapper nLEEffectMsgListenerWrapper, long j, boolean z);

    public static final native void NLEEffectMsgListenerWrapper_director_connect(NLEEffectMsgListenerWrapper nLEEffectMsgListenerWrapper, long j, boolean z, boolean z2);

    public static final native void NLEEffectMsgListenerWrapper_onMessageReceived(long j, NLEEffectMsgListenerWrapper nLEEffectMsgListenerWrapper, int i, int i2, int i3, String str);

    public static final native void NLEEffectMsgListenerWrapper_onMessageReceivedSwigExplicitNLEEffectMsgListenerWrapper(long j, NLEEffectMsgListenerWrapper nLEEffectMsgListenerWrapper, int i, int i2, int i3, String str);

    public static final native int NLEEffectRuntimeController_doAction(long j, NLEEffectRuntimeController nLEEffectRuntimeController, boolean z, String str, int i, long j2, MapStrStr mapStrStr, long j3, NLEDoActionListenerWrapper nLEDoActionListenerWrapper);

    public static final native int NLEEffectRuntimeController_removeEffectMessageCenterCallback(long j, NLEEffectRuntimeController nLEEffectRuntimeController);

    public static final native int NLEEffectRuntimeController_setEffectMessageCenterCallback(long j, NLEEffectRuntimeController nLEEffectRuntimeController, long j2, NLEEffectMsgListenerWrapper nLEEffectMsgListenerWrapper);

    public static final native void NLEEncodeListenerWrapper_change_ownership(NLEEncodeListenerWrapper nLEEncodeListenerWrapper, long j, boolean z);

    public static final native void NLEEncodeListenerWrapper_director_connect(NLEEncodeListenerWrapper nLEEncodeListenerWrapper, long j, boolean z, boolean z2);

    public static final native void NLEEncodeListenerWrapper_onCompressBuffer__SWIG_0(long j, NLEEncodeListenerWrapper nLEEncodeListenerWrapper, byte[] bArr, long j2, int i, boolean z);

    public static final native void NLEEncodeListenerWrapper_onCompressBuffer__SWIG_1(long j, NLEEncodeListenerWrapper nLEEncodeListenerWrapper, Object obj, long j2, int i, boolean z);

    public static final native void NLEEncodeListenerWrapper_setEnableByteBuffer(long j, NLEEncodeListenerWrapper nLEEncodeListenerWrapper, boolean z);

    public static final native int NLEExporterController_cancelCompile(long j, NLEExporterController nLEExporterController);

    public static final native boolean NLEExporterController_compileOnlyAudio(long j, NLEExporterController nLEExporterController, String str, long j2, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings);

    public static final native boolean NLEExporterController_compile__SWIG_0(long j, NLEExporterController nLEExporterController, String str, long j2, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native boolean NLEExporterController_compile__SWIG_1(long j, NLEExporterController nLEExporterController, String str, String str2, long j2, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native boolean NLEExporterController_compile__SWIG_2(long j, NLEExporterController nLEExporterController, String str, long j2, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j3, NLECompileListenerWrapper nLECompileListenerWrapper);

    public static final native boolean NLEExporterController_compile__SWIG_3(long j, NLEExporterController nLEExporterController, String str, String str2, long j2, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j3, NLECompileListenerWrapper nLECompileListenerWrapper);

    public static final native int NLEExporterController_destroyCompiler(long j, NLEExporterController nLEExporterController);

    public static final native String NLEExporterController_getAudioMatrixResult(long j, NLEExporterController nLEExporterController);

    public static final native int NLEExporterController_getCompileLevel(long j, NLEExporterController nLEExporterController, long j2, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native long NLEExporterController_getCompileResult(long j, NLEExporterController nLEExporterController);

    public static final native String NLEExporterController_getCompileStuckResult(long j, NLEExporterController nLEExporterController);

    public static final native long NLEExporterController_getDenoiseSnrResults(long j, NLEExporterController nLEExporterController);

    public static final native int NLEExporterController_getRemuxErrorCode(long j, NLEExporterController nLEExporterController, long j2, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native boolean NLEExporterController_isEnableRemuxVideo(long j, NLEExporterController nLEExporterController, long j2, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native int NLEExporterController_isWatermarkCompileEncode(long j, NLEExporterController nLEExporterController);

    public static final native void NLEExporterController_pauseCompile(long j, NLEExporterController nLEExporterController);

    public static final native void NLEExporterController_resumeCompile(long j, NLEExporterController nLEExporterController);

    public static final native void NLEExporterController_setCompileDumpFilePath(long j, NLEExporterController nLEExporterController, String str);

    public static final native void NLEExporterController_setDownloadNetSpeed(long j, NLEExporterController nLEExporterController, int i);

    public static final native void NLEExporterController_setSmartRecodeParam(long j, NLEExporterController nLEExporterController, boolean z, int i);

    public static final native long NLEFilterRuntimeController_checkComposerNodeExclusion(long j, NLEFilterRuntimeController nLEFilterRuntimeController, String str, String str2, String str3);

    public static final native int NLEFilterRuntimeController_doLensOneKeyDetect(long j, NLEFilterRuntimeController nLEFilterRuntimeController);

    public static final native String NLEFilterRuntimeController_getAmazingFilterParam(long j, NLEFilterRuntimeController nLEFilterRuntimeController, String str, String str2);

    public static final native float NLEFilterRuntimeController_getColorFilterIntensity(long j, NLEFilterRuntimeController nLEFilterRuntimeController, String str);

    public static final native void NLEFilterRuntimeController_updateMultiComposerNodesInSwing(long j, NLEFilterRuntimeController nLEFilterRuntimeController, long j2, NLETrackSlot nLETrackSlot, long j3, NLETrackSlot nLETrackSlot2);

    public static final native void NLEInfoStickerBufferCallbackWrapper_change_ownership(NLEInfoStickerBufferCallbackWrapper nLEInfoStickerBufferCallbackWrapper, long j, boolean z);

    public static final native void NLEInfoStickerBufferCallbackWrapper_director_connect(NLEInfoStickerBufferCallbackWrapper nLEInfoStickerBufferCallbackWrapper, long j, boolean z, boolean z2);

    public static final native Object NLEInfoStickerBufferCallbackWrapper_onGetBuffer(long j, NLEInfoStickerBufferCallbackWrapper nLEInfoStickerBufferCallbackWrapper, String str);

    public static final native void NLEInvisibleWatermarkExtractor_cancelExtraction(long j, NLEInvisibleWatermarkExtractor nLEInvisibleWatermarkExtractor);

    public static final native int NLEInvisibleWatermarkExtractor_startExtraction(long j, NLEInvisibleWatermarkExtractor nLEInvisibleWatermarkExtractor, String str, long j2, NLEInvisibleWatermarkTimeRange nLEInvisibleWatermarkTimeRange, long j3, INLEInvisibleWatermarkListener iNLEInvisibleWatermarkListener);

    public static final native long NLEInvisibleWatermarkTimeRange_endTimeUs_get(long j, NLEInvisibleWatermarkTimeRange nLEInvisibleWatermarkTimeRange);

    public static final native void NLEInvisibleWatermarkTimeRange_endTimeUs_set(long j, NLEInvisibleWatermarkTimeRange nLEInvisibleWatermarkTimeRange, long j2);

    public static final native long NLEInvisibleWatermarkTimeRange_startTimeUs_get(long j, NLEInvisibleWatermarkTimeRange nLEInvisibleWatermarkTimeRange);

    public static final native void NLEInvisibleWatermarkTimeRange_startTimeUs_set(long j, NLEInvisibleWatermarkTimeRange nLEInvisibleWatermarkTimeRange, long j2);

    public static final native void NLEListenerCompileTargetFileInfoPredictWrapper_change_ownership(NLEListenerCompileTargetFileInfoPredictWrapper nLEListenerCompileTargetFileInfoPredictWrapper, long j, boolean z);

    public static final native void NLEListenerCompileTargetFileInfoPredictWrapper_director_connect(NLEListenerCompileTargetFileInfoPredictWrapper nLEListenerCompileTargetFileInfoPredictWrapper, long j, boolean z, boolean z2);

    public static final native void NLEListenerCompileTargetFileInfoPredictWrapper_onCompileTargetFileInfoPredict(long j, NLEListenerCompileTargetFileInfoPredictWrapper nLEListenerCompileTargetFileInfoPredictWrapper, long j2, long j3, boolean z, boolean z2);

    public static final native void NLEListenerCompileTargetFileInfoPredictWrapper_onCompileTargetFileInfoPredictSwigExplicitNLEListenerCompileTargetFileInfoPredictWrapper(long j, NLEListenerCompileTargetFileInfoPredictWrapper nLEListenerCompileTargetFileInfoPredictWrapper, long j2, long j3, boolean z, boolean z2);

    public static final native void NLEListenerGetImageWrapper_change_ownership(NLEListenerGetImageWrapper nLEListenerGetImageWrapper, long j, boolean z);

    public static final native void NLEListenerGetImageWrapper_director_connect(NLEListenerGetImageWrapper nLEListenerGetImageWrapper, long j, boolean z, boolean z2);

    public static final native int NLEListenerGetImageWrapper_onGetImageDataCalled(long j, NLEListenerGetImageWrapper nLEListenerGetImageWrapper, byte[] bArr, int i, int i2, int i3, float f);

    public static final native long NLEMattingListenerWrapper_SWIGSmartPtrUpcast(long j);

    public static final native void NLEMattingListenerWrapper_change_ownership(NLEMattingListenerWrapper nLEMattingListenerWrapper, long j, boolean z);

    public static final native void NLEMattingListenerWrapper_director_connect(NLEMattingListenerWrapper nLEMattingListenerWrapper, long j, boolean z, boolean z2);

    public static final native boolean NLEMattingRuntimeController_addMattingTask(long j, NLEMattingRuntimeController nLEMattingRuntimeController, String str);

    public static final native void NLEMattingRuntimeController_cleanMattingFile__SWIG_0(long j, NLEMattingRuntimeController nLEMattingRuntimeController, String str, String str2, int i, String str3, boolean z);

    public static final native void NLEMattingRuntimeController_cleanMattingFile__SWIG_1(long j, NLEMattingRuntimeController nLEMattingRuntimeController, String str, String str2, int i, String str3);

    public static final native void NLEMattingRuntimeController_copyMattingFile(long j, NLEMattingRuntimeController nLEMattingRuntimeController, String str, String str2, String str3, int i);

    public static final native long NLEMattingRuntimeController_getRunningTasks(long j, NLEMattingRuntimeController nLEMattingRuntimeController);

    public static final native void NLEMattingRuntimeController_removeAllTask(long j, NLEMattingRuntimeController nLEMattingRuntimeController);

    public static final native void NLEMattingRuntimeController_removeMattingListener(long j, NLEMattingRuntimeController nLEMattingRuntimeController);

    public static final native void NLEMattingRuntimeController_removeMattingTask(long j, NLEMattingRuntimeController nLEMattingRuntimeController, String str);

    public static final native void NLEMattingRuntimeController_setMattingListener(long j, NLEMattingRuntimeController nLEMattingRuntimeController, long j2, NLEMattingListenerWrapper nLEMattingListenerWrapper);

    public static final native void NLEMediaAudioInfoListener_change_ownership(NLEMediaAudioInfoListener nLEMediaAudioInfoListener, long j, boolean z);

    public static final native void NLEMediaAudioInfoListener_director_connect(NLEMediaAudioInfoListener nLEMediaAudioInfoListener, long j, boolean z, boolean z2);

    public static final native void NLEMediaAudioInfoListener_onDone(long j, NLEMediaAudioInfoListener nLEMediaAudioInfoListener, long j2, NLEMediaAudioInfo nLEMediaAudioInfo);

    public static final native void NLEMediaAudioInfoListener_onFail(long j, NLEMediaAudioInfoListener nLEMediaAudioInfoListener, int i);

    public static final native long NLEMediaOnDoneWrapper_SWIGSmartPtrUpcast(long j);

    public static final native void NLEMediaOnDoneWrapper_change_ownership(NLEMediaOnDoneWrapper nLEMediaOnDoneWrapper, long j, boolean z);

    public static final native void NLEMediaOnDoneWrapper_director_connect(NLEMediaOnDoneWrapper nLEMediaOnDoneWrapper, long j, boolean z, boolean z2);

    public static final native void NLEMediaOnDoneWrapper_onDone(long j, NLEMediaOnDoneWrapper nLEMediaOnDoneWrapper, int i);

    public static final native void NLEMediaOnDoneWrapper_onDoneSwigExplicitNLEMediaOnDoneWrapper(long j, NLEMediaOnDoneWrapper nLEMediaOnDoneWrapper, int i);

    public static final native long NLEMediaOnProgressChangedWrapper_SWIGSmartPtrUpcast(long j);

    public static final native void NLEMediaOnProgressChangedWrapper_change_ownership(NLEMediaOnProgressChangedWrapper nLEMediaOnProgressChangedWrapper, long j, boolean z);

    public static final native void NLEMediaOnProgressChangedWrapper_director_connect(NLEMediaOnProgressChangedWrapper nLEMediaOnProgressChangedWrapper, long j, boolean z, boolean z2);

    public static final native void NLEMediaOnProgressChangedWrapper_onChanged(long j, NLEMediaOnProgressChangedWrapper nLEMediaOnProgressChangedWrapper, double d);

    public static final native void NLEMediaOnProgressChangedWrapper_onChangedSwigExplicitNLEMediaOnProgressChangedWrapper(long j, NLEMediaOnProgressChangedWrapper nLEMediaOnProgressChangedWrapper, double d);

    public static final native long NLEMediaResourceManager_getResourceManager(long j, NLEMediaResourceManager nLEMediaResourceManager);

    public static final native long NLEMediaResourceManager_obtain();

    public static final native void NLEMediaResourceManager_prepareNecessaryResource__SWIG_0(long j, NLEMediaResourceManager nLEMediaResourceManager, long j2, NLEModel nLEModel, long j3, INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, boolean z, boolean z2);

    public static final native void NLEMediaResourceManager_prepareNecessaryResource__SWIG_1(long j, NLEMediaResourceManager nLEMediaResourceManager, long j2, NLEModel nLEModel, long j3, INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, boolean z);

    public static final native void NLEMediaResourceManager_prepareNecessaryResource__SWIG_2(long j, NLEMediaResourceManager nLEMediaResourceManager, long j2, NLEModel nLEModel, long j3, INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback);

    public static final native void NLEMediaResourceManager_setDelegate(long j, NLEMediaResourceManager nLEMediaResourceManager, long j2, NLEResourceManager nLEResourceManager);

    public static final native int NLEMediaReverseUtil_reverseAudio(String str, String str2);

    public static final native int NLEMediaReverseUtil_reverseNLEModel__SWIG_0(long j, NLEModel nLEModel, String str, long j2, NLEMediaOnProgressChangedWrapper nLEMediaOnProgressChangedWrapper, long j3, NLEMediaOnDoneWrapper nLEMediaOnDoneWrapper, String str2, int i, int i2, boolean z);

    public static final native int NLEMediaReverseUtil_reverseNLEModel__SWIG_1(long j, NLEModel nLEModel, String str, long j2, NLEMediaOnProgressChangedWrapper nLEMediaOnProgressChangedWrapper, long j3, NLEMediaOnDoneWrapper nLEMediaOnDoneWrapper, String str2, int i, int i2);

    public static final native int NLEMediaReverseUtil_reverseNLEModel__SWIG_2(long j, NLEModel nLEModel, String str, long j2, NLEMediaOnProgressChangedWrapper nLEMediaOnProgressChangedWrapper, long j3, NLEMediaOnDoneWrapper nLEMediaOnDoneWrapper, String str2, int i);

    public static final native int NLEMediaReverseUtil_reverseNLEModel__SWIG_3(long j, NLEModel nLEModel, String str, long j2, NLEMediaOnProgressChangedWrapper nLEMediaOnProgressChangedWrapper, long j3, NLEMediaOnDoneWrapper nLEMediaOnDoneWrapper, String str2);

    public static final native int NLEMediaReverse_cancelReverse(long j, NLEMediaReverse nLEMediaReverse);

    public static final native void NLEMediaReverse_releaseReverse(long j, NLEMediaReverse nLEMediaReverse);

    public static final native int NLEMediaReverse_startReverse__SWIG_0(long j, NLEMediaReverse nLEMediaReverse, long j2, NLEModel nLEModel, String str, long j3, INLEMediaOnProgressChanged iNLEMediaOnProgressChanged, long j4, INLEMediaOnDone iNLEMediaOnDone, String str2, int i, int i2, boolean z);

    public static final native int NLEMediaReverse_startReverse__SWIG_1(long j, NLEMediaReverse nLEMediaReverse, long j2, NLEModel nLEModel, String str, long j3, INLEMediaOnProgressChanged iNLEMediaOnProgressChanged, long j4, INLEMediaOnDone iNLEMediaOnDone, String str2, int i, int i2);

    public static final native int NLEMediaReverse_startReverse__SWIG_2(long j, NLEMediaReverse nLEMediaReverse, long j2, NLEModel nLEModel, String str, long j3, INLEMediaOnProgressChanged iNLEMediaOnProgressChanged, long j4, INLEMediaOnDone iNLEMediaOnDone, String str2, int i);

    public static final native int NLEMediaReverse_startReverse__SWIG_3(long j, NLEMediaReverse nLEMediaReverse, long j2, NLEModel nLEModel, String str, long j3, INLEMediaOnProgressChanged iNLEMediaOnProgressChanged, long j4, INLEMediaOnDone iNLEMediaOnDone, String str2);

    public static final native void NLEMediaRuntimeController_addAndroidImageHolder(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str, Object obj);

    public static final native int NLEMediaRuntimeController_addMetadata(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str, String str2);

    public static final native int NLEMediaRuntimeController_cancelGetVideoFrames(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native void NLEMediaRuntimeController_cancelPreprocessI2V(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native void NLEMediaRuntimeController_clearAndroidImageHolder(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native int NLEMediaRuntimeController_enableWatermarkMetadata(long j, NLEMediaRuntimeController nLEMediaRuntimeController, boolean z);

    public static final native String NLEMediaRuntimeController_findVEParentIdByNLESlotUUID(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str);

    public static final native long NLEMediaRuntimeController_getCanvasSize(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native int NLEMediaRuntimeController_getCurrDecodeImage(long j, NLEMediaRuntimeController nLEMediaRuntimeController, Object obj, String str);

    public static final native int NLEMediaRuntimeController_getDisplayImage(long j, NLEMediaRuntimeController nLEMediaRuntimeController, Object obj);

    public static final native int NLEMediaRuntimeController_getEffectHandle(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native String NLEMediaRuntimeController_getFileInfo(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str, String str2);

    public static final native int NLEMediaRuntimeController_getHighLightResult(long j, NLEMediaRuntimeController nLEMediaRuntimeController, long j2, VecLongLong vecLongLong);

    public static final native long NLEMediaRuntimeController_getHighLightResultByPts(long j, NLEMediaRuntimeController nLEMediaRuntimeController, int i);

    public static final native int NLEMediaRuntimeController_getImages(long j, NLEMediaRuntimeController nLEMediaRuntimeController, long j2, VecLongLong vecLongLong, int i, int i2, int i3, long j3, NLEListenerGetImageWrapper nLEListenerGetImageWrapper);

    public static final native long NLEMediaRuntimeController_getInitSize__SWIG_0(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native long NLEMediaRuntimeController_getInitSize__SWIG_1(long j, NLEMediaRuntimeController nLEMediaRuntimeController, int i, int i2);

    public static final native String NLEMediaRuntimeController_getKeyFrameParam(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str, long j2);

    public static final native String NLEMediaRuntimeController_getMetadata(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str);

    public static final native float NLEMediaRuntimeController_getPlayFps(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native int NLEMediaRuntimeController_getPreviewFillMode(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native String NLEMediaRuntimeController_getUniqueKey(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native int NLEMediaRuntimeController_getVEColorSpace(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native long NLEMediaRuntimeController_getVideoResolution(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native boolean NLEMediaRuntimeController_isUseFilterProcess(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native int NLEMediaRuntimeController_lockSeekVideoClip(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str);

    public static final native double NLEMediaRuntimeController_mapOriginalPositionToTimeEffectPosition__SWIG_0(long j, NLEMediaRuntimeController nLEMediaRuntimeController, double d, int i);

    public static final native double NLEMediaRuntimeController_mapOriginalPositionToTimeEffectPosition__SWIG_1(long j, NLEMediaRuntimeController nLEMediaRuntimeController, double d);

    public static final native double NLEMediaRuntimeController_mapTimeEffectPositionToOriginalPosition(long j, NLEMediaRuntimeController nLEMediaRuntimeController, double d);

    public static final native String NLEMediaRuntimeController_preprocessI2V(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str, String str2, long j2, int i);

    public static final native int NLEMediaRuntimeController_sendEffectMsg(long j, NLEMediaRuntimeController nLEMediaRuntimeController, int i, int i2, int i3, String str);

    public static final native void NLEMediaRuntimeController_setBackgroundColor(long j, NLEMediaRuntimeController nLEMediaRuntimeController, int i);

    public static final native int NLEMediaRuntimeController_setCanvasColor(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str);

    public static final native int NLEMediaRuntimeController_setCanvasMinDuration(long j, NLEMediaRuntimeController nLEMediaRuntimeController, long j2, boolean z);

    public static final native void NLEMediaRuntimeController_setCanvasSize(long j, NLEMediaRuntimeController nLEMediaRuntimeController, int i, int i2);

    public static final native void NLEMediaRuntimeController_setDisplayPos(long j, NLEMediaRuntimeController nLEMediaRuntimeController, int i, int i2, int i3, int i4);

    public static final native void NLEMediaRuntimeController_setDisplayState(long j, NLEMediaRuntimeController nLEMediaRuntimeController, float f, float f2, float f3, int i, int i2);

    public static final native void NLEMediaRuntimeController_setEncoderListener(long j, NLEMediaRuntimeController nLEMediaRuntimeController, long j2, NLEEncodeListenerWrapper nLEEncodeListenerWrapper);

    public static final native int NLEMediaRuntimeController_setHeightWidthRatio(long j, NLEMediaRuntimeController nLEMediaRuntimeController, float f);

    public static final native void NLEMediaRuntimeController_setMagnifierDisplayState(long j, NLEMediaRuntimeController nLEMediaRuntimeController, float f, float f2, float f3);

    public static final native int NLEMediaRuntimeController_setMaxWidthAndHeight(long j, NLEMediaRuntimeController nLEMediaRuntimeController, long j2, long j3);

    public static final native int NLEMediaRuntimeController_setMetadata(long j, NLEMediaRuntimeController nLEMediaRuntimeController, long j2, MapStrStr mapStrStr);

    public static final native void NLEMediaRuntimeController_setOnCompileTargetFileInfoPredictListener(long j, NLEMediaRuntimeController nLEMediaRuntimeController, long j2, NLEListenerCompileTargetFileInfoPredictWrapper nLEListenerCompileTargetFileInfoPredictWrapper);

    public static final native void NLEMediaRuntimeController_setPlayFps(long j, NLEMediaRuntimeController nLEMediaRuntimeController, float f);

    public static final native int NLEMediaRuntimeController_setPreviewFillMode(long j, NLEMediaRuntimeController nLEMediaRuntimeController, int i);

    public static final native void NLEMediaRuntimeController_setPreviewOffScreen(long j, NLEMediaRuntimeController nLEMediaRuntimeController, boolean z);

    public static final native int NLEMediaRuntimeController_setPreviewSurfaceImage(long j, NLEMediaRuntimeController nLEMediaRuntimeController, Object obj, boolean z);

    public static final native int NLEMediaRuntimeController_setPreviewSurfaceTexDesc__SWIG_0(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str, boolean z);

    public static final native int NLEMediaRuntimeController_setPreviewSurfaceTexDesc__SWIG_1(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str);

    public static final native int NLEMediaRuntimeController_unlockSeekVideoClip(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native long NLEMediaSession_getAlgorithmApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getBrushApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getDataSource(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getEffectApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getExporterApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getFilterApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getMattingApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getMediaConfig(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getMediaRuntimeApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getMediaSettingApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getMetricsApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getPlayerApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getStickerApi(long j, NLEMediaSession nLEMediaSession);

    public static final native void NLEMediaSession_setDataSource(long j, NLEMediaSession nLEMediaSession, long j2, NLEModel nLEModel);

    public static final native void NLEMediaSession_updateMediaConfig(long j, NLEMediaSession nLEMediaSession, long j2, NLEMediaConfig nLEMediaConfig);

    public static final native int NLEMediaSettingsController_enableEffect(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_enableHighSpeedForSingle(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_enableImageEditor(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_enableSimpleProcessor(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native int NLEMediaSettingsController_getPageMode(long j, NLEMediaSettingsController nLEMediaSettingsController);

    public static final native void NLEMediaSettingsController_setAutoPrepare(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native int NLEMediaSettingsController_setDestroyVersion(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_setDldEnabled(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_setDldThrVal(long j, NLEMediaSettingsController nLEMediaSettingsController, int i);

    public static final native void NLEMediaSettingsController_setDleEnabled(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_setDleEnabledPreview(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native int NLEMediaSettingsController_setDropFrameParam(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z, long j2, int i);

    public static final native void NLEMediaSettingsController_setForceDetectForFirstFrameByClip(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_setImageResizeInfo(long j, NLEMediaSettingsController nLEMediaSettingsController, int i, int i2, int i3, int i4);

    public static final native void NLEMediaSettingsController_setLoopPlay(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_setPageMode(long j, NLEMediaSettingsController nLEMediaSettingsController, int i);

    public static final native int NLEMediaSettingsController_setPreviewFps__SWIG_0(long j, NLEMediaSettingsController nLEMediaSettingsController, int i, boolean z);

    public static final native int NLEMediaSettingsController_setPreviewFps__SWIG_1(long j, NLEMediaSettingsController nLEMediaSettingsController, int i);

    public static final native int NLEMediaSettingsController_setPreviewMaxFps(long j, NLEMediaSettingsController nLEMediaSettingsController, int i);

    public static final native int NLEMediaSettingsController_setSrcMaxHWRatio(long j, NLEMediaSettingsController nLEMediaSettingsController, float f);

    public static final native void NLEMediaSettingsController_setSurfaceReDraw(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native long NLEMediaUtil_createAudioBeatTracking();

    public static final native long NLEMediaUtil_createNLESegmentTemplateWithResourceFolderPath(String str, String str2, long j, PairIntInt pairIntInt);

    public static final native int NLEMediaUtil_detachAudioStreamFile__SWIG_0(String str, long j, NLEModel nLEModel);

    public static final native int NLEMediaUtil_detachAudioStreamFile__SWIG_1(String str, long j, NLEModel nLEModel, int i, int i2, int i3);

    public static final native long NLEMediaUtil_detectAudioLoudness(long j, VecString vecString, long j2, VecLongLong vecLongLong, long j3, VecLongLong vecLongLong2);

    public static final native long NLEMediaUtil_getMediaAudioInfo(String str);

    public static final native void NLEMediaUtil_getMediaAudioInfoAsync(String str, long j, NLEMediaAudioInfoListener nLEMediaAudioInfoListener);

    public static final native long NLEMediaUtil_getMediaVideoInfo(String str);

    public static final native void NLEMediaUtil_getMediaVideoInfoAsync(String str, long j, NLEMediaVideoInfoListener nLEMediaVideoInfoListener);

    public static final native boolean NLEMediaUtil_isNewAnimation(long j, NLEVideoAnimation nLEVideoAnimation);

    public static final native int NLEMediaUtil_isStickerDynamic(String str);

    public static final native int NLEMediaUtil_numberOfString(String str);

    public static final native int NLEMediaUtil_operateGlobalAllowedPaths(long j, VecString vecString, int i);

    public static final native void NLEMediaUtil_preloadMediaInfo(long j, VecString vecString, long j2, INLEMediaOnDone iNLEMediaOnDone);

    public static final native void NLEMediaVideoInfoListener_change_ownership(NLEMediaVideoInfoListener nLEMediaVideoInfoListener, long j, boolean z);

    public static final native void NLEMediaVideoInfoListener_director_connect(NLEMediaVideoInfoListener nLEMediaVideoInfoListener, long j, boolean z, boolean z2);

    public static final native void NLEMediaVideoInfoListener_onDone(long j, NLEMediaVideoInfoListener nLEMediaVideoInfoListener, long j2, NLEMediaVideoInfo nLEMediaVideoInfo);

    public static final native void NLEMediaVideoInfoListener_onFail(long j, NLEMediaVideoInfoListener nLEMediaVideoInfoListener, int i);

    public static final native int NLEMetricsRuntimeController_enableAudioGlitchMetrics(long j, NLEMetricsRuntimeController nLEMetricsRuntimeController, boolean z);

    public static final native String NLEMetricsRuntimeController_getAudioGlitchCount(long j, NLEMetricsRuntimeController nLEMetricsRuntimeController);

    public static final native void NLEOnFrameAvailableWrapper_change_ownership(NLEOnFrameAvailableWrapper nLEOnFrameAvailableWrapper, long j, boolean z);

    public static final native void NLEOnFrameAvailableWrapper_director_connect(NLEOnFrameAvailableWrapper nLEOnFrameAvailableWrapper, long j, boolean z, boolean z2);

    public static final native boolean NLEOnFrameAvailableWrapper_onGetFrame(long j, NLEOnFrameAvailableWrapper nLEOnFrameAvailableWrapper, byte[] bArr, long j2, long j3, long j4);

    public static final native void NLEPlayer_addMessageListener(long j, NLEPlayer nLEPlayer, long j2, NLEMediaMessageListener nLEMediaMessageListener);

    public static final native void NLEPlayer_addNLEResourceDownloadStatusListener(long j, NLEPlayer nLEPlayer, long j2, INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener);

    public static final native void NLEPlayer_cancelAsyncRender(long j, NLEPlayer nLEPlayer);

    public static final native void NLEPlayer_clearNLEResourceDownloadStatusListener(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_destroy(long j, NLEPlayer nLEPlayer);

    public static final native String NLEPlayer_dumpSwingEffectData(long j, NLEPlayer nLEPlayer, String str);

    public static final native String NLEPlayer_dumpVEClips(long j, NLEPlayer nLEPlayer);

    public static final native String NLEPlayer_dumpVEModel(long j, NLEPlayer nLEPlayer);

    public static final native String NLEPlayer_dumpVESequence(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_flushSeekCmd(long j, NLEPlayer nLEPlayer);

    public static final native long NLEPlayer_getCurrentPosition(long j, NLEPlayer nLEPlayer);

    public static final native long NLEPlayer_getDuration(long j, NLEPlayer nLEPlayer);

    public static final native String NLEPlayer_getEffectDebugPageUIData(long j, NLEPlayer nLEPlayer);

    public static final native String NLEPlayer_handleEffectDebugCmd(long j, NLEPlayer nLEPlayer, String str, String str2);

    public static final native int NLEPlayer_handleEffectDebugService(long j, NLEPlayer nLEPlayer, int i, String str, String str2);

    public static final native int NLEPlayer_pause__SWIG_0(long j, NLEPlayer nLEPlayer, boolean z);

    public static final native int NLEPlayer_pause__SWIG_1(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_play(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_prepare(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_rePrepare(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_refreshCurrentFrame(long j, NLEPlayer nLEPlayer, int i);

    public static final native void NLEPlayer_releaseAndroidSurface(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_releaseEngine__SWIG_0(long j, NLEPlayer nLEPlayer, boolean z);

    public static final native int NLEPlayer_releaseEngine__SWIG_1(long j, NLEPlayer nLEPlayer);

    public static final native void NLEPlayer_releaseMagnifierSurface(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_releaseResource(long j, NLEPlayer nLEPlayer);

    public static final native void NLEPlayer_removeNLEResourceDownloadStatusListener(long j, NLEPlayer nLEPlayer, long j2, INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener);

    public static final native int NLEPlayer_seekBackward(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_seekForward(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_seekTime__SWIG_0(long j, NLEPlayer nLEPlayer, long j2, int i);

    public static final native int NLEPlayer_seekTime__SWIG_1(long j, NLEPlayer nLEPlayer, long j2, int i, long j3);

    public static final native int NLEPlayer_seekWithFrameStable(long j, NLEPlayer nLEPlayer, long j2, long j3, NLEListenerGetImageWrapper nLEListenerGetImageWrapper);

    public static final native int NLEPlayer_seekWithFrame__SWIG_0(long j, NLEPlayer nLEPlayer, long j2, long j3, NLEListenerGetImageWrapper nLEListenerGetImageWrapper);

    public static final native int NLEPlayer_seekWithFrame__SWIG_1(long j, NLEPlayer nLEPlayer, long j2, int i, long j3, NLEListenerGetImageWrapper nLEListenerGetImageWrapper);

    public static final native int NLEPlayer_seekWithSpeed(long j, NLEPlayer nLEPlayer, long j2, int i, float f, float f2);

    public static final native int NLEPlayer_setAndroidMagnifierSurface__SWIG_0(long j, NLEPlayer nLEPlayer, Object obj, boolean z);

    public static final native int NLEPlayer_setAndroidMagnifierSurface__SWIG_1(long j, NLEPlayer nLEPlayer, Object obj);

    public static final native int NLEPlayer_setAndroidSurface__SWIG_0(long j, NLEPlayer nLEPlayer, Object obj, boolean z);

    public static final native int NLEPlayer_setAndroidSurface__SWIG_1(long j, NLEPlayer nLEPlayer, Object obj);

    public static final native void NLEPlayer_setAsyncRenderPlayStatusListener(long j, NLEPlayer nLEPlayer, long j2, INLEAsyncRenderPlayStatusListener iNLEAsyncRenderPlayStatusListener);

    public static final native int NLEPlayer_setEditorMode(long j, NLEPlayer nLEPlayer, int i);

    public static final native void NLEPlayer_setEnableDirectRenderMode(long j, NLEPlayer nLEPlayer, boolean z);

    public static final native void NLEPlayer_setEnableFastcvLanc(long j, NLEPlayer nLEPlayer, boolean z);

    public static final native int NLEPlayer_setMagnifierSurfaceSize(long j, NLEPlayer nLEPlayer, int i, int i2);

    public static final native void NLEPlayer_setNleModel(long j, NLEPlayer nLEPlayer, long j2, NLEModel nLEModel);

    public static final native int NLEPlayer_setPlayRange__SWIG_0(long j, NLEPlayer nLEPlayer, long j2, long j3, int i);

    public static final native int NLEPlayer_setPlayRange__SWIG_1(long j, NLEPlayer nLEPlayer, long j2, long j3);

    public static final native int NLEPlayer_setPreviewSurfaceSize(long j, NLEPlayer nLEPlayer, int i, int i2);

    public static final native void NLEPlayer_setResourceDownloadConfig(long j, NLEPlayer nLEPlayer, long j2, INLEResourceDownloadConfig iNLEResourceDownloadConfig);

    public static final native void NLEPlayer_setResourceManager(long j, NLEPlayer nLEPlayer, long j2, NLEResourceManager nLEResourceManager);

    public static final native void NLEPlayer_setSkipNextSeek(long j, NLEPlayer nLEPlayer, boolean z);

    public static final native void NLEPlayer_startAsyncRenderResourceDownload(long j, NLEPlayer nLEPlayer, long j2, NLEModel nLEModel);

    public static final native int NLEPlayer_state(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_stop(long j, NLEPlayer nLEPlayer);

    public static final native void NLERenderResourceUtil_convertTrackKeyframesToSlotKeyframes(long j, NLEModel nLEModel);

    public static final native long NLERenderResourceUtil_getUnpreparedNecessaryResources(long j, NLEModel nLEModel);

    public static final native long NLERenderResourceUtil_getUnpreparedUnnecessaryResources(long j, NLEModel nLEModel);

    public static final native void NLERenderResourceUtil_setNLEResourceNecessary(long j, NLEModel nLEModel, long j2, long j3);

    public static final native void NLERenderResourceUtil_setUnnecessaryNLEResourceByTime(long j, NLEModel nLEModel, long j2);

    public static final native long NLEResourceDownloadConfig_SWIGUpcast(long j);

    public static final native void NLEResourceDownloadConfig_setResourcePriorityConfig(long j, NLEResourceDownloadConfig nLEResourceDownloadConfig, String str);

    public static final native void NLESafetyApplyPatchToken_cancel(long j, NLESafetyApplyPatchToken nLESafetyApplyPatchToken);

    public static final native void NLESafetyApplyPatchToken_pause(long j, NLESafetyApplyPatchToken nLESafetyApplyPatchToken);

    public static final native void NLESafetyApplyPatchToken_resume(long j, NLESafetyApplyPatchToken nLESafetyApplyPatchToken, long j2, INLEApplyPatchCallback iNLEApplyPatchCallback);

    public static final native int NLEStickerController_beginInfoStickerPin(long j, NLEStickerController nLEStickerController, String str);

    public static final native int NLEStickerController_cancelInfoStickerPin(long j, NLEStickerController nLEStickerController, String str);

    public static final native int NLEStickerController_enableStickerAnimationPreview(long j, NLEStickerController nLEStickerController, String str, boolean z);

    public static final native String NLEStickerController_getInfoStickerAssetInfo(long j, NLEStickerController nLEStickerController, String str);

    public static final native long NLEStickerController_getInfoStickerBoundingBox(long j, NLEStickerController nLEStickerController, String str, boolean z);

    public static final native String NLEStickerController_getInfoStickerNewTemplateParams(long j, NLEStickerController nLEStickerController, String str);

    public static final native byte[] NLEStickerController_getInfoStickerPinData(long j, NLEStickerController nLEStickerController, String str);

    public static final native byte[] NLEStickerController_getInfoStickerPinMappingData(long j, NLEStickerController nLEStickerController, String str);

    public static final native float NLEStickerController_getInfoStickerRotate(long j, NLEStickerController nLEStickerController, String str);

    public static final native float NLEStickerController_getInfoStickerScale(long j, NLEStickerController nLEStickerController, String str);

    public static final native String NLEStickerController_getInfoStickerTemplateParams(long j, NLEStickerController nLEStickerController, String str);

    public static final native boolean NLEStickerController_getInfoStickerVisible(long j, NLEStickerController nLEStickerController, String str);

    public static final native long NLEStickerController_getNewTextTemplateBoundingBox(long j, NLEStickerController nLEStickerController, long j2, NLETrackSlot nLETrackSlot);

    public static final native long NLEStickerController_getNewTextTemplateChildElementBoundingBox(long j, NLEStickerController nLEStickerController, long j2, NLETrackSlot nLETrackSlot, long j3, NLETrackSlot nLETrackSlot2);

    public static final native long NLEStickerController_getSrtInfoStickerInitPosition(long j, NLEStickerController nLEStickerController, String str);

    public static final native int NLEStickerController_getStickerBoundingBox(long j, NLEStickerController nLEStickerController, long j2, NLETrackSlot nLETrackSlot, long j3, NLERectF nLERectF, boolean z);

    public static final native boolean NLEStickerController_getStickerIsDynamic(long j, NLEStickerController nLEStickerController, String str);

    public static final native long NLEStickerController_getTextCanvasBoundingBox(long j, NLEStickerController nLEStickerController, String str);

    public static final native boolean NLEStickerController_isInfoStickerAnimatable(long j, NLEStickerController nLEStickerController, String str);

    public static final native int NLEStickerController_setInfoStickerRestoreMode(long j, NLEStickerController nLEStickerController, int i);

    public static final native int NLEStickerController_startStickerAnimationPreview(long j, NLEStickerController nLEStickerController, long j2, int i);

    public static final native int NLEStickerController_stopStickerAnimationPreview(long j, NLEStickerController nLEStickerController);

    public static final native void NLEVEOperationEventManager_addVEOperationListener(long j, NLEVEOperationEventManager nLEVEOperationEventManager, long j2, NLEVEOperationListener nLEVEOperationListener);

    public static final native void NLEVEOperationEventManager_clearVEOperationListener(long j, NLEVEOperationEventManager nLEVEOperationEventManager);

    public static final native long NLEVEOperationEventManager_obtain();

    public static final native void NLEVEOperationEventManager_removeVEOperationListener(long j, NLEVEOperationEventManager nLEVEOperationEventManager, long j2, NLEVEOperationListener nLEVEOperationListener);

    public static final native void NLEVEOperationListener_change_ownership(NLEVEOperationListener nLEVEOperationListener, long j, boolean z);

    public static final native void NLEVEOperationListener_director_connect(NLEVEOperationListener nLEVEOperationListener, long j, boolean z, boolean z2);

    public static final native void NLEVEOperationListener_onVEOperationEvent(long j, NLEVEOperationListener nLEVEOperationListener, int i, String str, long j2, NLEResourceNode nLEResourceNode, int i2, int i3);

    public static final native long NLEVQScoreTimeRange_endTimeUs_get(long j, NLEVQScoreTimeRange nLEVQScoreTimeRange);

    public static final native void NLEVQScoreTimeRange_endTimeUs_set(long j, NLEVQScoreTimeRange nLEVQScoreTimeRange, long j2);

    public static final native long NLEVQScoreTimeRange_intervalUs_get(long j, NLEVQScoreTimeRange nLEVQScoreTimeRange);

    public static final native void NLEVQScoreTimeRange_intervalUs_set(long j, NLEVQScoreTimeRange nLEVQScoreTimeRange, long j2);

    public static final native long NLEVQScoreTimeRange_startTimeUs_get(long j, NLEVQScoreTimeRange nLEVQScoreTimeRange);

    public static final native void NLEVQScoreTimeRange_startTimeUs_set(long j, NLEVQScoreTimeRange nLEVQScoreTimeRange, long j2);

    public static final native void NLEVQScoreWrapper_cancelVQScore(long j, NLEVQScoreWrapper nLEVQScoreWrapper);

    public static final native void NLEVQScoreWrapper_setResolutionLimit(long j, NLEVQScoreWrapper nLEVQScoreWrapper, int i, int i2);

    public static final native int NLEVQScoreWrapper_startVQScore(long j, NLEVQScoreWrapper nLEVQScoreWrapper, long j2, NLEModel nLEModel, long j3, NLEVQScoreTimeRange nLEVQScoreTimeRange, int i, int i2, long j4, INLEVQScoreWrapperListener iNLEVQScoreWrapperListener);

    public static final native int SpeedConfig_mode_get(long j, SpeedConfig speedConfig);

    public static final native void SpeedConfig_mode_set(long j, SpeedConfig speedConfig, int i);

    public static final native long SpeedConfig_points_get(long j, SpeedConfig speedConfig);

    public static final native void SpeedConfig_points_set(long j, SpeedConfig speedConfig, long j2, VecNLEPointSPtr vecNLEPointSPtr);

    public static final native long SpeedConfig_repeat_duration_get(long j, SpeedConfig speedConfig);

    public static final native void SpeedConfig_repeat_duration_set(long j, SpeedConfig speedConfig, long j2);

    public static final native boolean VideoEngineEffectUtil_isAllUsingNewEngine(String str);

    public static final native void delete_DLWCallback(long j);

    public static final native void delete_DynamicLightWaveUtil(long j);

    public static final native void delete_INLEApplyPatchCallback(long j);

    public static final native void delete_INLEInvisibleWatermarkListener(long j);

    public static final native void delete_INLEMediaOnDone(long j);

    public static final native void delete_INLEMediaOnProgressChanged(long j);

    public static final native void delete_INLEVQScoreWrapperListener(long j);

    public static final native void delete_KeyFrameCalcalator(long j);

    public static final native void delete_MapStrInt(long j);

    public static final native void delete_MapStrInt_Iterator(long j);

    public static final native void delete_NLEAlgorithmCallbackWrapper(long j);

    public static final native void delete_NLEAlgorithmController(long j);

    public static final native void delete_NLEApplyPatchShims(long j);

    public static final native void delete_NLEAudioBeatTracking(long j);

    public static final native void delete_NLEBrushRuntimeController(long j);

    public static final native void delete_NLEBrushSaveCallbackWrapper(long j);

    public static final native void delete_NLEBrushStateCallbackWrapper(long j);

    public static final native void delete_NLECompileListenerWrapper(long j);

    public static final native void delete_NLEConfigUtil(long j);

    public static final native void delete_NLEDoActionListenerWrapper(long j);

    public static final native void delete_NLEEffectMsgListenerWrapper(long j);

    public static final native void delete_NLEEffectRuntimeController(long j);

    public static final native void delete_NLEEncodeListenerWrapper(long j);

    public static final native void delete_NLEExporterController(long j);

    public static final native void delete_NLEFilterRuntimeController(long j);

    public static final native void delete_NLEInfoStickerBufferCallbackWrapper(long j);

    public static final native void delete_NLEInvisibleWatermarkExtractor(long j);

    public static final native void delete_NLEInvisibleWatermarkTimeRange(long j);

    public static final native void delete_NLEListenerCompileTargetFileInfoPredictWrapper(long j);

    public static final native void delete_NLEListenerGetImageWrapper(long j);

    public static final native void delete_NLEMattingListenerWrapper(long j);

    public static final native void delete_NLEMattingRuntimeController(long j);

    public static final native void delete_NLEMediaAudioInfoListener(long j);

    public static final native void delete_NLEMediaOnDoneWrapper(long j);

    public static final native void delete_NLEMediaOnProgressChangedWrapper(long j);

    public static final native void delete_NLEMediaResourceManager(long j);

    public static final native void delete_NLEMediaReverse(long j);

    public static final native void delete_NLEMediaReverseUtil(long j);

    public static final native void delete_NLEMediaRuntimeController(long j);

    public static final native void delete_NLEMediaSession(long j);

    public static final native void delete_NLEMediaSettingsController(long j);

    public static final native void delete_NLEMediaUtil(long j);

    public static final native void delete_NLEMediaVideoInfoListener(long j);

    public static final native void delete_NLEMetricsRuntimeController(long j);

    public static final native void delete_NLEOnFrameAvailableWrapper(long j);

    public static final native void delete_NLEPlayer(long j);

    public static final native void delete_NLEResourceDownloadConfig(long j);

    public static final native void delete_NLESafetyApplyPatchToken(long j);

    public static final native void delete_NLEStickerController(long j);

    public static final native void delete_NLEVEOperationEventManager(long j);

    public static final native void delete_NLEVEOperationListener(long j);

    public static final native void delete_NLEVQScoreTimeRange(long j);

    public static final native void delete_NLEVQScoreWrapper(long j);

    public static final native void delete_SpeedConfig(long j);

    public static final native void delete_VideoEngineEffectUtil(long j);

    public static final native long new_DLWCallback();

    public static final native long new_DynamicLightWaveUtil(long j, long j2, long j3, String str, String str2);

    public static final native long new_INLEApplyPatchCallback();

    public static final native long new_INLEInvisibleWatermarkListener();

    public static final native long new_INLEMediaOnDone();

    public static final native long new_INLEMediaOnProgressChanged();

    public static final native long new_INLEVQScoreWrapperListener();

    public static final native long new_KeyFrameCalcalator();

    public static final native long new_MapStrInt__SWIG_0();

    public static final native long new_MapStrInt__SWIG_1(long j, MapStrInt mapStrInt);

    public static final native long new_NLEAlgorithmCallbackWrapper();

    public static final native long new_NLEApplyPatchShims(long j, NLEModel nLEModel);

    public static final native long new_NLEAudioBeatTracking();

    public static final native long new_NLEBrushSaveCallbackWrapper();

    public static final native long new_NLEBrushStateCallbackWrapper();

    public static final native long new_NLECompileListenerWrapper();

    public static final native long new_NLEConfigUtil();

    public static final native long new_NLEDoActionListenerWrapper();

    public static final native long new_NLEEffectMsgListenerWrapper();

    public static final native long new_NLEEncodeListenerWrapper();

    public static final native long new_NLEInfoStickerBufferCallbackWrapper();

    public static final native long new_NLEInvisibleWatermarkExtractor(String str);

    public static final native long new_NLEInvisibleWatermarkTimeRange();

    public static final native long new_NLEListenerCompileTargetFileInfoPredictWrapper();

    public static final native long new_NLEListenerGetImageWrapper();

    public static final native long new_NLEMattingListenerWrapper();

    public static final native long new_NLEMediaAudioInfoListener();

    public static final native long new_NLEMediaOnDoneWrapper();

    public static final native long new_NLEMediaOnProgressChangedWrapper();

    public static final native long new_NLEMediaResourceManager();

    public static final native long new_NLEMediaReverse();

    public static final native long new_NLEMediaReverseUtil();

    public static final native long new_NLEMediaSession(long j, NLEMediaConfig nLEMediaConfig);

    public static final native long new_NLEMediaUtil();

    public static final native long new_NLEMediaVideoInfoListener();

    public static final native long new_NLEOnFrameAvailableWrapper();

    public static final native long new_NLEResourceDownloadConfig();

    public static final native long new_NLEVEOperationEventManager();

    public static final native long new_NLEVEOperationListener();

    public static final native long new_NLEVQScoreTimeRange();

    public static final native long new_NLEVQScoreWrapper(String str);

    public static final native long new_SpeedConfig();

    public static final native long new_VideoEngineEffectUtil();

    public static final native void swig_module_init();

    static {
        swig_module_init();
    }

    public static void SwigDirector_DLWCallback_compileDone(DLWCallback dLWCallback) {
        dLWCallback.compileDone();
    }

    public static void SwigDirector_NLEMattingListenerWrapper_onMattingStartedCallback(NLEMattingListenerWrapper nLEMattingListenerWrapper) {
        nLEMattingListenerWrapper.onMattingStartedCallback();
    }

    public static void SwigDirector_DLWCallback_compileError(DLWCallback dLWCallback, int i) {
        dLWCallback.compileError(i);
    }

    public static void SwigDirector_DLWCallback_onProgress(DLWCallback dLWCallback, float f) {
        dLWCallback.onProgress(f);
    }

    public static void SwigDirector_INLEApplyPatchCallback_onSuccess(INLEApplyPatchCallback iNLEApplyPatchCallback, long j) {
        NLEModel nLEModel;
        if (j == 0) {
            nLEModel = null;
        } else {
            nLEModel = new NLEModel(j, true);
        }
        iNLEApplyPatchCallback.onSuccess(nLEModel);
    }

    public static void SwigDirector_INLEMediaOnDone_onDone(INLEMediaOnDone iNLEMediaOnDone, int i) {
        iNLEMediaOnDone.onDone(i);
    }

    public static void SwigDirector_INLEMediaOnProgressChanged_onChanged(INLEMediaOnProgressChanged iNLEMediaOnProgressChanged, double d) {
        iNLEMediaOnProgressChanged.onChanged(d);
    }

    public static void SwigDirector_INLEVQScoreWrapperListener_onFinished(INLEVQScoreWrapperListener iNLEVQScoreWrapperListener, long j) {
        iNLEVQScoreWrapperListener.onFinished(new VecDouble(j, false));
    }

    public static void SwigDirector_NLEAlgorithmCallbackWrapper_onProgress(NLEAlgorithmCallbackWrapper nLEAlgorithmCallbackWrapper, float f) {
        nLEAlgorithmCallbackWrapper.onProgress(f);
    }

    public static void SwigDirector_NLEBrushStateCallbackWrapper_onStateChange(NLEBrushStateCallbackWrapper nLEBrushStateCallbackWrapper, long j) {
        NLEBrushStickerState nLEBrushStickerState;
        if (j == 0) {
            nLEBrushStickerState = null;
        } else {
            nLEBrushStickerState = new NLEBrushStickerState(j, true);
        }
        nLEBrushStateCallbackWrapper.onStateChange(nLEBrushStickerState);
    }

    public static void SwigDirector_NLEDoActionListenerWrapper_onDoActionCompleted(NLEDoActionListenerWrapper nLEDoActionListenerWrapper, long j) {
        nLEDoActionListenerWrapper.onDoActionCompleted(new MapStrStr(j, true));
    }

    public static Object SwigDirector_NLEInfoStickerBufferCallbackWrapper_onGetBuffer(NLEInfoStickerBufferCallbackWrapper nLEInfoStickerBufferCallbackWrapper, String str) {
        return nLEInfoStickerBufferCallbackWrapper.onGetBuffer(str);
    }

    public static void SwigDirector_NLEMattingListenerWrapper_onMattingAddedCallback(NLEMattingListenerWrapper nLEMattingListenerWrapper, String str) {
        nLEMattingListenerWrapper.onMattingAddedCallback(str);
    }

    public static void SwigDirector_NLEMattingListenerWrapper_onMattingRemovedCallback(NLEMattingListenerWrapper nLEMattingListenerWrapper, String str) {
        nLEMattingListenerWrapper.onMattingRemovedCallback(str);
    }

    public static boolean SwigDirector_NLEMattingListenerWrapper_shouldInterceptMatting(NLEMattingListenerWrapper nLEMattingListenerWrapper, long j) {
        NLETrackSlot nLETrackSlot;
        if (j == 0) {
            nLETrackSlot = null;
        } else {
            nLETrackSlot = new NLETrackSlot(j, true);
        }
        return nLEMattingListenerWrapper.shouldInterceptMatting(nLETrackSlot);
    }

    public static void SwigDirector_NLEMediaAudioInfoListener_onDone(NLEMediaAudioInfoListener nLEMediaAudioInfoListener, long j) {
        NLEMediaAudioInfo nLEMediaAudioInfo;
        if (j == 0) {
            nLEMediaAudioInfo = null;
        } else {
            nLEMediaAudioInfo = new NLEMediaAudioInfo(j, true);
        }
        nLEMediaAudioInfoListener.onDone(nLEMediaAudioInfo);
    }

    public static void SwigDirector_NLEMediaAudioInfoListener_onFail(NLEMediaAudioInfoListener nLEMediaAudioInfoListener, int i) {
        nLEMediaAudioInfoListener.onFail(i);
    }

    public static void SwigDirector_NLEMediaOnDoneWrapper_onDone(NLEMediaOnDoneWrapper nLEMediaOnDoneWrapper, int i) {
        nLEMediaOnDoneWrapper.onDone(i);
    }

    public static void SwigDirector_NLEMediaOnProgressChangedWrapper_onChanged(NLEMediaOnProgressChangedWrapper nLEMediaOnProgressChangedWrapper, double d) {
        nLEMediaOnProgressChangedWrapper.onChanged(d);
    }

    public static void SwigDirector_NLEMediaVideoInfoListener_onDone(NLEMediaVideoInfoListener nLEMediaVideoInfoListener, long j) {
        NLEMediaVideoInfo nLEMediaVideoInfo;
        if (j == 0) {
            nLEMediaVideoInfo = null;
        } else {
            nLEMediaVideoInfo = new NLEMediaVideoInfo(j, true);
        }
        nLEMediaVideoInfoListener.onDone(nLEMediaVideoInfo);
    }

    public static void SwigDirector_NLEMediaVideoInfoListener_onFail(NLEMediaVideoInfoListener nLEMediaVideoInfoListener, int i) {
        nLEMediaVideoInfoListener.onFail(i);
    }

    public static void SwigDirector_INLEApplyPatchCallback_onError(INLEApplyPatchCallback iNLEApplyPatchCallback, long j, String str) {
        NLEModel nLEModel;
        if (j == 0) {
            nLEModel = null;
        } else {
            nLEModel = new NLEModel(j, true);
        }
        iNLEApplyPatchCallback.onError(nLEModel, str);
    }

    public static void SwigDirector_INLEApplyPatchCallback_onProgress(INLEApplyPatchCallback iNLEApplyPatchCallback, long j, float f) {
        NLEModel nLEModel;
        if (j == 0) {
            nLEModel = null;
        } else {
            nLEModel = new NLEModel(j, true);
        }
        iNLEApplyPatchCallback.onProgress(nLEModel, f);
    }

    public static void SwigDirector_INLEInvisibleWatermarkListener_onFinished(INLEInvisibleWatermarkListener iNLEInvisibleWatermarkListener, long j, int i) {
        iNLEInvisibleWatermarkListener.onFinished(new VecString(j, false), i);
    }

    public static void SwigDirector_NLEBrushSaveCallbackWrapper_onDone(NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper, String str, boolean z) {
        nLEBrushSaveCallbackWrapper.onDone(str, z);
    }

    public static void SwigDirector_NLEMattingListenerWrapper_onMattingDoneCallback(NLEMattingListenerWrapper nLEMattingListenerWrapper, float f, String str) {
        nLEMattingListenerWrapper.onMattingDoneCallback(f, str);
    }

    public static void SwigDirector_NLEMattingListenerWrapper_onMattingErrorCallback__SWIG_1(NLEMattingListenerWrapper nLEMattingListenerWrapper, int i, String str) {
        nLEMattingListenerWrapper.onMattingErrorCallback(i, str);
    }

    public static void SwigDirector_INLEInvisibleWatermarkListener_onProgress(INLEInvisibleWatermarkListener iNLEInvisibleWatermarkListener, long j, long j2, long j3) {
        iNLEInvisibleWatermarkListener.onProgress(j, j2, j3);
    }

    public static void SwigDirector_INLEVQScoreWrapperListener_onProgress(INLEVQScoreWrapperListener iNLEVQScoreWrapperListener, int i, int i2, double d) {
        iNLEVQScoreWrapperListener.onProgress(i, i2, d);
    }

    public static void SwigDirector_NLEMattingListenerWrapper_onMattingClipDoneCallback(NLEMattingListenerWrapper nLEMattingListenerWrapper, String str, float f, float f2) {
        nLEMattingListenerWrapper.onMattingClipDoneCallback(str, f, f2);
    }

    public static void SwigDirector_NLEMattingListenerWrapper_onMattingErrorCallback__SWIG_0(NLEMattingListenerWrapper nLEMattingListenerWrapper, int i, int i2, float f) {
        nLEMattingListenerWrapper.onMattingErrorCallback(i, i2, f);
    }

    public static void SwigDirector_NLEMattingListenerWrapper_onMattingInteractiveMaskCallback(NLEMattingListenerWrapper nLEMattingListenerWrapper, String str, long j, String str2) {
        nLEMattingListenerWrapper.onMattingInteractiveMaskCallback(str, j, str2);
    }

    public static void SwigDirector_NLEEffectMsgListenerWrapper_onMessageReceived(NLEEffectMsgListenerWrapper nLEEffectMsgListenerWrapper, int i, int i2, int i3, String str) {
        nLEEffectMsgListenerWrapper.onMessageReceived(i, i2, i3, str);
    }

    public static void SwigDirector_NLEEncodeListenerWrapper_onCompressBuffer__SWIG_0(NLEEncodeListenerWrapper nLEEncodeListenerWrapper, byte[] bArr, long j, int i, boolean z) {
        nLEEncodeListenerWrapper.onCompressBuffer(bArr, j, i, z);
    }

    public static void SwigDirector_NLEEncodeListenerWrapper_onCompressBuffer__SWIG_1(NLEEncodeListenerWrapper nLEEncodeListenerWrapper, Object obj, long j, int i, boolean z) {
        nLEEncodeListenerWrapper.onCompressBuffer(obj, j, i, z);
    }

    public static void SwigDirector_NLEListenerCompileTargetFileInfoPredictWrapper_onCompileTargetFileInfoPredict(NLEListenerCompileTargetFileInfoPredictWrapper nLEListenerCompileTargetFileInfoPredictWrapper, long j, long j2, boolean z, boolean z2) {
        nLEListenerCompileTargetFileInfoPredictWrapper.onCompileTargetFileInfoPredict(j, j2, z, z2);
    }

    public static void SwigDirector_NLEMattingListenerWrapper_onMattingProgressCallback(NLEMattingListenerWrapper nLEMattingListenerWrapper, String str, float f, float f2, boolean z) {
        nLEMattingListenerWrapper.onMattingProgressCallback(str, f, f2, z);
    }

    public static boolean SwigDirector_NLEOnFrameAvailableWrapper_onGetFrame(NLEOnFrameAvailableWrapper nLEOnFrameAvailableWrapper, byte[] bArr, long j, long j2, long j3) {
        return nLEOnFrameAvailableWrapper.onGetFrame(bArr, j, j2, j3);
    }

    public static int SwigDirector_NLEListenerGetImageWrapper_onGetImageDataCalled(NLEListenerGetImageWrapper nLEListenerGetImageWrapper, byte[] bArr, int i, int i2, int i3, float f) {
        return nLEListenerGetImageWrapper.onGetImageDataCalled(bArr, i, i2, i3, f);
    }

    public static void SwigDirector_NLEVEOperationListener_onVEOperationEvent(NLEVEOperationListener nLEVEOperationListener, int i, String str, long j, int i2, int i3) {
        NLEResourceNode nLEResourceNode;
        NLEVEOperationResType nLEVEOperationResTypeSwigToEnum = NLEVEOperationResType.swigToEnum(i);
        if (j == 0) {
            nLEResourceNode = null;
        } else {
            nLEResourceNode = new NLEResourceNode(j, true);
        }
        nLEVEOperationListener.onVEOperationEvent(nLEVEOperationResTypeSwigToEnum, str, nLEResourceNode, i2, NLERenderAction.swigToEnum(i3));
    }
}
