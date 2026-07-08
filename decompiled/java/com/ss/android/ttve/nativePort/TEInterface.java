package com.ss.android.ttve.nativePort;

import X.C1284450jWt;
import X.C1311120kDu;
import X.C1DOM;
import X.C2188811AlT;
import X.C2484209oO;
import X.InterfaceC2185781Aga;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ttve.mediacodec.TEAvcEncoder;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.LoudnessDetectResult;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEEffectParams;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEMusicSRTEffectParam;
import com.ss.android.vesdk.VERect;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEStickerAnimator;
import com.ss.android.vesdk.VETimelineParams;
import com.ss.android.vesdk.VEUserConfig;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.clipparam.VEAICutOutClipParam;
import com.ss.android.vesdk.clipparam.VEClipAuxiliaryParam;
import com.ss.android.vesdk.clipparam.VEClipParam;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.clipparam.VEClipVideoFileInfoParam;
import com.ss.android.vesdk.clipparam.VECommonClipParam;
import com.ss.android.vesdk.filterparam.VEAmazingFilterParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEBeautyFilterParam;
import com.ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.ss.android.vesdk.filterparam.VEColorFilterParam;
import com.ss.android.vesdk.filterparam.VEColorHslFilterParam;
import com.ss.android.vesdk.filterparam.VEComposerFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectHdrFilterParam;
import com.ss.android.vesdk.filterparam.VEImageAddFilterParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import com.ss.android.vesdk.filterparam.VELensHdrFilterParam;
import com.ss.android.vesdk.filterparam.VEMultiComposerFilterParam;
import com.ss.android.vesdk.filterparam.VENewAiCutOutClipFilterParam;
import com.ss.android.vesdk.filterparam.VEReshapeFilterParam;
import com.ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoAjustmentFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoCropFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoLensOneKeyHdrParam;
import com.ss.android.vesdk.filterparam.VEVideoStableFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import com.ss.android.vesdk.runtime.VERuntime;
import java.util.Arrays;
import java.util.List;
import ud7.b;

/* JADX INFO: loaded from: classes36.dex */
public final class TEInterface extends TENativeServiceBase {
    public static boolean m_IsConfigedAB;
    public int mHostTrackIndex = -1;
    public long mNative;

    public static TEInterface createEngine() {
        return createEngine((VEUserConfig) null);
    }

    private native int nativeAddAudioTrack(long j, String str, int i, int i2, int i3, int i4, boolean z);

    private native int nativeAddAudioTrack2(long j, String str, int i, int i2, int i3, int i4, boolean z, int i5, int i6);

    private native int nativeAddAudioTrackForClips(long j, String[] strArr, int[] iArr, int[] iArr2, float[] fArr);

    private native int nativeAddAudioTrackWithNeedPrepare(long j, String str, String str2, int i, int i2, int i3, int i4, boolean z, boolean z2);

    private native int nativeAddAudioTrackWithStruct(long j, VECommonClipParam vECommonClipParam, boolean z);

    private native int nativeAddClipAuxiliaryParam(long j, int i, int i2, VEClipAuxiliaryParam[] vEClipAuxiliaryParamArr);

    private native String nativeAddFileInfoCache(long j, String str);

    private native int[] nativeAddFilters(long j, int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6);

    private native void nativeAddMetaData(long j, String str, String str2);

    private native int nativeAddSubTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d, double d2, double d3, double d4, int i, int i2);

    private native int nativeAddSubVideoTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i);

    private native int nativeAdjustFilterInOut(long j, int i, int i2, int i3);

    private native int nativeAppendComposerNodes(long j, String[] strArr);

    public static native String nativeAudioExtend(String str, float f, float f2, float f3);

    public static native int nativeAudioHwEncoder(boolean z);

    private native int nativeBeginAudioExtendToFile(long j, String str, String str2, String str3, float f, float f2, float f3);

    private native int nativeCancelAudioExtendToFile(long j);

    private native int nativeCancelGetImages(long j);

    private native int nativeChangeResWithEffect(long j, boolean[] zArr, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, int[] iArr5);

    private native int nativeChangeTransitonAt(long j, int i, VETransitionFilterParam vETransitionFilterParam);

    private native int[] nativeCheckComposerNodeExclusion(long j, String str, String str2, String str3);

    private native void nativeClearDisplay(long j, int i);

    private native int nativeClearFilter(long j);

    private native int nativeConcatShootVideo(long j, String str, String[] strArr, long[] jArr, boolean z);

    public static native int nativeConfigMaxCacheFrameCount(int i);

    private native long nativeCreateEngine(String[] strArr, int[] iArr, int[] iArr2);

    private native int nativeCreateTimeline(long j);

    private native int nativeDeleteAudioTrack(long j, int i, boolean z);

    private native int nativeDeleteClip(long j, int i, int i2, int i3);

    private native int nativeDeleteKeyFrameParam(long j, int i, int i2, int i3);

    private native int nativeDeleteSubVideoTrack(long j, int i);

    private native int nativeDestroyEngine(long j);

    public static native LoudnessDetectResult[] nativeDetectAudioLoudness(String[] strArr, int[] iArr, int[] iArr2);

    private native int nativeDoLensOneKeyHdrDetect(long j);

    private native String nativeDumpSequence(long j);

    private native void nativeDumpSequence(long j, String str);

    public static native int nativeEnableAGFXCtx(boolean z);

    public static native int nativeEnableAndroidHdrPreviewSupport(boolean z);

    private native int nativeEnableAudioDisplayCallBack(long j, boolean z);

    public static native int nativeEnableAudioGBU(boolean z);

    public static native int nativeEnableCompileGLContextReuse(boolean z);

    public static native int nativeEnableConcurrentPreloadOpt(int i);

    public static native int nativeEnableCreateDecoderByName(boolean z);

    public static native int nativeEnableCrossplatformGLBaseFBO(boolean z);

    public static native int nativeEnableDecoderResourceScheduleOptHw(int i);

    public static native int nativeEnableDeviceCapabilityOpt(int i);

    public static native int nativeEnableDisplayP3ReEncode(boolean z);

    public static native int nativeEnableDisplayP3Render(boolean z);

    public static native int nativeEnableEditorContextQueue(int i);

    private native int nativeEnableEffect(long j, boolean z);

    private native int nativeEnableEffectAmazing(long j, boolean z);

    public static native int nativeEnableEffectAmazingMV(boolean z);

    public static native int nativeEnableEffectCanvas(boolean z);

    public static native int nativeEnableEffectRenderWithoutGlreadpixels(boolean z);

    public static native int nativeEnableEffectTransiton(boolean z);

    private native int nativeEnableFaceDetect(long j, boolean z);

    public static native int nativeEnableFileInfoCache(boolean z);

    public static native int nativeEnableFirstFrameOpt(boolean z);

    private native int nativeEnableGenderDetect(long j, boolean z);

    private native int nativeEnableHDRSetting(long j, boolean z);

    public static native int nativeEnableHighSpeed(boolean z);

    private native int nativeEnableHighSpeedForSingle(long j, boolean z);

    public static native int nativeEnableImageAlgorithmReuseAndOptForAmazing(boolean z);

    private native int nativeEnableImageEditor(long j, boolean z);

    public static native int nativeEnableMultiThreadDecode(boolean z);

    public static native int nativeEnableNewAudioMixer(boolean z);

    public static native int nativeEnableOptGLFlush(boolean z);

    public static native int nativeEnableOptPlayBackDropFrame(boolean z);

    public static native int nativeEnableOutResolutionAlign4(boolean z);

    public static native int nativeEnableParallDecodeMatting(boolean z);

    public static native int nativeEnablePartRemux(boolean z);

    public static native int nativeEnablePinRefactor(boolean z);

    public static native int nativeEnablePipResolutionOpt(boolean z);

    public static native int nativeEnablePreviewPureColorBackground(boolean z, int i);

    private native void nativeEnableReEncodeOpt(long j, boolean z);

    public static native int nativeEnableReaderManagerRefactor(boolean z);

    public static native int nativeEnableRefaComposer(boolean z);

    public static native int nativeEnableRenderLib(boolean z);

    public static native int nativeEnableRenderLibFBOOpt(boolean z);

    public static native int nativeEnableSeekAndPreloadOpt(boolean z);

    public static native int nativeEnableSmartTransDetect(boolean z);

    public static native int nativeEnableVideoFrameCacheOpt(int i);

    private native int nativeExcAICutOutTask(long j);

    private native int nativeExpandTimeline(long j, int i);

    private native int nativeFlushSeekCmd(long j);

    private native int nativeFrameTrace(long j, String str, int i);

    private native long nativeGenEditorStatus(long j);

    private native Object nativeGetAllAudioTracks(long j);

    private native List<VEClipParam> nativeGetAllClips(long j, int i, int i2);

    private native List<VEClipVideoFileInfoParam> nativeGetAllVideoFileInfos(long j);

    private native byte[] nativeGetAudioCommonFilterPreprocessResult(long j, long j2);

    private native String nativeGetClipInfoString(long j, int i, int i2, int i3);

    private native String nativeGetClipInfoStringWithPath(long j, int i, int i2, int i3, String str);

    private native float nativeGetClipProgress(long j, int i);

    private native long nativeGetClipSequenceOut(long j, int i, int i2, int i3);

    private native float nativeGetColorFilterIntensity(long j, String str);

    private native int nativeGetCurPosition(long j);

    private native int nativeGetCurState(long j);

    private native int[] nativeGetDecodeDumpInfo(long j, int i, int i2);

    private native int nativeGetDecodeImage(long j, Bitmap bitmap, int i, int i2);

    private native int[] nativeGetDisplayDumpSize(long j);

    private native int nativeGetDisplayImage(long j, Bitmap bitmap);

    private native int nativeGetDuration(long j);

    private native long nativeGetDurationUs(long j);

    private native int nativeGetImages(long j, int[] iArr, int i, int i2, boolean z, int i3);

    private native int[] nativeGetInitResolution(long j);

    public static native Object nativeGetMVInfoStatic(String str);

    private native String nativeGetMetaData(long j, String str);

    private native long nativeGetPCMDeliverHandle(long j);

    private native int nativeGetProcessedImage(long j, Bitmap bitmap);

    private native float nativeGetProjectProgress(long j);

    private native int nativeGetRuntimeGLVersion(long j);

    private native String nativeGetSequenceUniqueKey(long j);

    private native int nativeGetSingleTrackProcessedImage(long j, int i, Bitmap bitmap);

    private native int nativeGetTimeEffectCurPosition(long j);

    private native int nativeGetTimeEffectDuration(long j);

    private native float nativeGetTrackVolume(long j, int i, int i2, int i3);

    private native int nativeGetTransparentImage(long j, Bitmap bitmap);

    private native int nativeInitAudioEditor(long j, String str, String[] strArr, int[] iArr, int[] iArr2, float[] fArr);

    private native int nativeInitAudioExtendToFile(long j);

    private native int nativeInitImageEditor(long j, Bitmap[] bitmapArr, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2, String[][] strArr3, float[] fArr, int[] iArr5, int i);

    private native int nativeInitVideoEditor(long j, String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i);

    private native int nativeInitVideoEditor2(long j, String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i, boolean z);

    private native int nativeInitVideoEditor2LoadCache(long j, String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i, boolean z, boolean[] zArr, String[] strArr5);

    private native int nativeInitVideoEditorLoadCache(long j, String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i, boolean[] zArr, String[] strArr5);

    private native int nativeInitVideoEditorWithCanvas(long j, String[] strArr, Bitmap[] bitmapArr, String[] strArr2, int[] iArr, int[] iArr2, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, String[] strArr5, int[] iArr5, int[] iArr6, String[][] strArr6, float[] fArr, int i, VESize[] vESizeArr);

    private native int nativeInitVideoEditorWithStruct(long j, VECommonClipParam[] vECommonClipParamArr, VECommonClipParam[] vECommonClipParamArr2, String[] strArr, int i);

    private native int nativeInsertClip(long j, int i, int i2, int i3, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam);

    private native boolean nativeIsAudioExtendToFileProcessing(long j);

    private native int nativeIsCompileEncode(long j);

    private native int nativeIsWatermarkCompileEncode(long j);

    private native int nativeLockSeekVideoClip(long j, int i);

    private native int nativeMoveClip(long j, int i, int i2, int i3, boolean z);

    public static native int nativeOpenEditorFpsLog(boolean z);

    public static native int nativeOpenOutputCallback(boolean z);

    private native int nativePause(long j, int i);

    private native int nativePauseSync(long j);

    private native int nativePrepareEngine(long j, int i);

    private native int nativePreprocessAudioTrackForFilter(long j, int i, int i2, String str, byte[] bArr, long[] jArr);

    private native int nativePushImageToBuffer(long j, String str);

    private native int nativeRefreshCurrentFrame(long j, int i);

    private native int nativeReleaseEngine(long j);

    private native int nativeReleaseEngineAsync(long j);

    private native void nativeReleasePreviewSurface(long j);

    private native int nativeReloadComposerNodes(long j, String[] strArr);

    private native int nativeRemoveAICutOutClipParam(long j, int i);

    private native int nativeRemoveComposerNodes(long j, String[] strArr);

    private native int nativeRemoveEffectCallback(long j);

    private native int nativeRemoveFilter(long j, int[] iArr);

    private native int nativeRemoveMessageCenterListener(long j);

    private native int nativeReplaceClip(long j, int i, int i2, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam);

    private native int nativeReplaceComposerNodesWithTag(long j, String[] strArr, int i, String[] strArr2, int i2, String[] strArr3);

    private native void nativeResetCallback(long j);

    private native int nativeSeek(long j, int i, int i2, int i3, int i4);

    public static native int nativeSeekPredictOpt(boolean z);

    private native int nativeSeekWithResult(long j, int i, int i2, int i3);

    private native int nativeSeekWithTolerance(long j, int i, int i2, int i3, int i4, int i5);

    private native int nativeSetAlgorithmPreConfig(long j, int i, int i2);

    private native int nativeSetAlgorithmSyncAndNum(long j, boolean z, int i);

    private native void nativeSetBackGroundColor(long j, int i);

    private native int nativeSetClientState(long j, int i);

    private native int nativeSetClipAttr(long j, int i, int i2, int i3, String str, String str2);

    private native int nativeSetCompileAudioDriver(long j, String str, int i, int i2, String str2);

    private native void nativeSetCompileDumpFilePath(long j, String str);

    public static native int nativeSetCompileReport(int i);

    private native int nativeSetComposerMode(long j, int i, int i2);

    private native int nativeSetComposerNodes(long j, String[] strArr);

    private native int nativeSetDeviceRotation(long j, float[] fArr, double d);

    private native void nativeSetDisplayState(long j, float f, float f2, float f3, float f4, int i, int i2, int i3);

    private native int nativeSetDldEnabled(long j, boolean z);

    private native int nativeSetDldThrVal(long j, int i);

    private native int nativeSetDleEnabled(long j, boolean z);

    private native int nativeSetDleEnabledPreview(long j, boolean z);

    public static native int nativeSetDropFrameParam(boolean z, long j, long j2);

    private native int nativeSetEffectCacheInt(long j, String str, int i);

    private native int nativeSetEffectCallback(long j, VEListener.VEEditorEffectListener vEEditorEffectListener);

    private native int nativeSetEffectMaxMemoryCache(long j, int i);

    private native int nativeSetEffectParams(long j, VEEffectParams vEEffectParams);

    private native void nativeSetEnableMultipleAudioFilter(long j, boolean z);

    private native void nativeSetEnableRemuxVideo(long j, boolean z);

    private native void nativeSetEncoderParallel(long j, boolean z, boolean z2);

    private native void nativeSetExpandLastFrame(long j, boolean z);

    private native int nativeSetFilterParam(long j, int i, String str, VEMusicSRTEffectParam vEMusicSRTEffectParam);

    private native int nativeSetFilterParam(long j, int i, String str, VEStickerAnimator vEStickerAnimator);

    private native int nativeSetFilterParam(long j, int i, String str, VEEffectFilterParam vEEffectFilterParam);

    private native int nativeSetFilterParam(long j, int i, String str, String str2);

    private native int nativeSetFilterParam2(long j, int i, String str, byte[] bArr);

    public static native int nativeSetForceDropFrameWithoutAudio(boolean z);

    public static native int nativeSetImageBufferLimit(int i, int i2, int i3);

    public static native int nativeSetImageBufferParam(int i, int i2, int i3);

    public static native int nativeSetInfoStickerTransEnable(boolean z);

    private native int nativeSetKeyFrameParam(long j, int i, int i2, int i3, String str);

    private native int nativeSetMaleMakeupState(long j, boolean z);

    public static native int nativeSetMaxAudioReaderCount(int i);

    public static native void nativeSetMaxDetectFrameCount(int i);

    public static native int nativeSetMaxSoftwareVideoReaderCount(int i, int i2, int i3, int i4);

    private native int nativeSetMessageCenterListener(long j, VEListener.VEMessageCenterListener vEMessageCenterListener);

    public static native int nativeSetOptVersion(int i);

    private native void nativeSetOption(long j, int i, String str, float f);

    private native void nativeSetOption(long j, int i, String str, long j2);

    private native void nativeSetOption(long j, int i, String str, String str2);

    private native void nativeSetOptionArray(long j, int i, String[] strArr, long[] jArr);

    private native void nativeSetOptionIntArray(long j, int i, String str, int[] iArr);

    private native void nativeSetOptionLongArray(long j, int i, String str, long[] jArr);

    private native void nativeSetPreviewFps(long j, int i);

    private native int nativeSetPreviewScaleMode(long j, int i);

    private native void nativeSetPreviewSurface(long j, Surface surface);

    private native void nativeSetPreviewSurfaceBitmap(long j, Bitmap bitmap, boolean z);

    private native void nativeSetSpeedRatio(long j, float f);

    private native int nativeSetSubTrackSeqIn(long j, int i, int i2, int i3);

    private native void nativeSetSurfaceSize(long j, int i, int i2);

    public static native int nativeSetTexturePoolLimit(int i, int i2);

    private native int nativeSetTimeRange(long j, int i, int i2, int i3);

    private native int nativeSetTrackDurationType(long j, int i, int i2, int i3);

    private native int nativeSetTrackFilterEnable(long j, int i, boolean z, boolean z2);

    private native int nativeSetTrackLayer(long j, int i, int i2, int i3);

    private native int nativeSetTrackMinMaxDuration(long j, int i, int i2, int i3, int i4);

    private native boolean nativeSetTrackVolume(long j, int i, int i2, float f);

    private native int nativeSetTransitionAt(long j, int i, long j2, String str);

    private native void nativeSetVideoBackGroundColor(long j, int i);

    private native void nativeSetViewPort(long j, int i, int i2, int i3, int i4);

    private native void nativeSetWaterMark(long j, VEWatermarkParam.VEWatermarkEntity[] vEWatermarkEntityArr, VEWatermarkParam.VEWatermarkMask vEWatermarkMask);

    private native int nativeStart(long j);

    private native int nativeStartEffectMonitor(long j);

    private native int nativeStop(long j);

    private native int nativeStopEffectMonitor(long j);

    private native int nativeSwitchResourceLoadMode(long j, boolean z, int i);

    private native int nativeUninitAudioExtendToFile(long j);

    private native int nativeUpdateAICutOutClipParam(long j, int i, int i2, VEAICutOutClipParam vEAICutOutClipParam);

    private native int nativeUpdateAlgorithmRuntimeParam(long j, int i, float f);

    private native int nativeUpdateAmazingFilterParam(long j, int i, int i2, VEAmazingFilterParam vEAmazingFilterParam);

    private native int nativeUpdateAudioTrack(long j, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2);

    private native int nativeUpdateAudioTrack2(long j, int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7);

    private native int nativeUpdateBeautyFilterParam(long j, int i, int i2, VEBeautyFilterParam vEBeautyFilterParam);

    private native int nativeUpdateCanvasFilterParam(long j, int i, int i2, VECanvasFilterParam vECanvasFilterParam);

    private native int nativeUpdateCanvasResolution(long j, int i, int i2);

    private native int nativeUpdateClipsSourceParam(long j, int i, int i2, int[] iArr, VEClipSourceParam[] vEClipSourceParamArr);

    private native int nativeUpdateClipsTimelineParam(long j, int i, int i2, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr);

    private native int nativeUpdateColorAdjustHslFilterParam(long j, int i, int i2, VEColorHslFilterParam vEColorHslFilterParam);

    private native int nativeUpdateColorFilterParam(long j, int i, int i2, VEColorFilterParam vEColorFilterParam);

    private native int nativeUpdateComposerNode(long j, String str, String str2, float f);

    private native int nativeUpdateCropFilterParam(long j, int i, int i2, VEVideoCropFilterParam vEVideoCropFilterParam);

    private native int nativeUpdateEffectComposerParam(long j, int i, int i2, VEComposerFilterParam vEComposerFilterParam);

    private native int nativeUpdateEffectFilterParam(long j, int i, int i2, VEEffectFilterParam vEEffectFilterParam);

    private native int nativeUpdateEffectHdrFilterParam(long j, int i, int i2, VEEffectHdrFilterParam vEEffectHdrFilterParam);

    private native int nativeUpdateFilterTime(long j, int i, int i2, int i3, int i4);

    private native int nativeUpdateImageAddFilterParam(long j, int i, int i2, VEImageAddFilterParam vEImageAddFilterParam);

    private native int nativeUpdateImageTransformFilterParam(long j, int i, int i2, VEImageTransformFilterParam vEImageTransformFilterParam);

    private native int nativeUpdateLensHdrFilterParam(long j, int i, int i2, VELensHdrFilterParam vELensHdrFilterParam);

    private native int nativeUpdateLensOneKeyHdrFilterParam(long j, int i, int i2, VEVideoLensOneKeyHdrParam vEVideoLensOneKeyHdrParam);

    private native int nativeUpdateMultiComposerNodes(long j, int i, String[] strArr, String[] strArr2, float[] fArr);

    private native int nativeUpdateMultiEffectComposerParam(long j, int i, int i2, VEMultiComposerFilterParam vEMultiComposerFilterParam);

    private native int nativeUpdateNewAICutOutClipParam(long j, int i, int i2, VENewAiCutOutClipFilterParam vENewAiCutOutClipFilterParam);

    private native int nativeUpdateQualityFilterParam(long j, int i, int i2, VEVideoAjustmentFilterParam vEVideoAjustmentFilterParam);

    private native int nativeUpdateReshapeFilterParam(long j, int i, int i2, VEReshapeFilterParam vEReshapeFilterParam);

    private native int nativeUpdateScene(long j, String[] strArr, int[] iArr, int[] iArr2);

    private native int nativeUpdateSceneFileOrder(long j, int[] iArr);

    private native int nativeUpdateSceneLoadCache(long j, String[] strArr, int[] iArr, int[] iArr2, boolean[] zArr, String[] strArr2);

    private native int nativeUpdateSceneTime(long j, boolean[] zArr, int[] iArr, int[] iArr2, int[] iArr3, double[] dArr);

    private native int nativeUpdateTrackClip(long j, int i, int i2, String[] strArr);

    private native int nativeUpdateTrackFilter(long j, int i, int i2, boolean z);

    private native int nativeUpdateTrackFilterDuration(long j, int i, int i2, boolean z, long j2);

    private native int nativeUpdateVideoStabFilterParam(long j, int i, int i2, VEVideoStableFilterParam vEVideoStableFilterParam);

    private native int nativeUpdateVideoTransformFilterParam(long j, int i, int i2, VEVideoTransformFilterParam vEVideoTransformFilterParam);

    public int[] getInitResolution() {
        int[] iArr = {-1, -1, -1, -1};
        long j = this.mNative;
        return j == 0 ? iArr : nativeGetInitResolution(j);
    }

    public native int nativeSetAudioOffset(long j, int i, int i2);

    public native String stringFromJNI();

    public int cancelAudioExtendToFile() {
        return nativeCancelAudioExtendToFile(this.mNative);
    }

    public int cancelGetImages() {
        return nativeCancelGetImages(this.mNative);
    }

    public int clearFilter() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeClearFilter(j);
    }

    public int createTimeline() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeCreateTimeline(j);
    }

    public int destroyEngine() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int iNativeDestroyEngine = nativeDestroyEngine(j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release editor native handler=");
        sbLIZ.append(this.mNative);
        sbLIZ.append(", ret=");
        sbLIZ.append(iNativeDestroyEngine);
        C2484209oO.LJIIIIZZ("TEInterface", C2188811AlT.LIZIZ(sbLIZ));
        this.mNative = 0L;
        return iNativeDestroyEngine;
    }

    public int doLensOneKeyHdrDetect() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeDoLensOneKeyHdrDetect(j);
    }

    public String dumpSequence() {
        long j = this.mNative;
        if (j == 0) {
            return null;
        }
        return nativeDumpSequence(j);
    }

    public int excAICutOutTask() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeExcAICutOutTask(j);
    }

    public int flushSeekCmd() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeFlushSeekCmd(j);
    }

    public void genEditorStatus() {
        nativeGenEditorStatus(this.mNative);
    }

    public Object getAllAudioTracks() {
        long j = this.mNative;
        if (j == 0) {
            return null;
        }
        return nativeGetAllAudioTracks(j);
    }

    public List<VEClipVideoFileInfoParam> getAllVideoFileInfos() {
        long j = this.mNative;
        if (j == 0) {
            return null;
        }
        return nativeGetAllVideoFileInfos(j);
    }

    public int getCurPosition() {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        return nativeGetCurPosition(j);
    }

    public int getCurState() {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        return nativeGetCurState(j);
    }

    public VERect getDisplayRect() {
        long j = this.mNative;
        if (j == 0) {
            return new VERect(0, 0, 0, 0);
        }
        int[] iArrNativeGetDisplayDumpSize = nativeGetDisplayDumpSize(j);
        return new VERect(iArrNativeGetDisplayDumpSize[0], iArrNativeGetDisplayDumpSize[1], iArrNativeGetDisplayDumpSize[2], iArrNativeGetDisplayDumpSize[3]);
    }

    public int getDuration() {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        return nativeGetDuration(j);
    }

    public long getDurationUs() {
        long j = this.mNative;
        if (j == 0) {
            return -1L;
        }
        return nativeGetDurationUs(j);
    }

    public long getPCMDeliverHandle() {
        long j = this.mNative;
        if (j == 0) {
            return -112L;
        }
        return nativeGetPCMDeliverHandle(j);
    }

    public float getProjectMattingProgress() {
        long j = this.mNative;
        if (j == 0) {
            return -112.0f;
        }
        return nativeGetProjectProgress(j);
    }

    public int getRuntimeGLVersion() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGetRuntimeGLVersion(j);
    }

    public String getSequenceUniqueKey() {
        long j = this.mNative;
        return j == 0 ? "" : nativeGetSequenceUniqueKey(j);
    }

    public int initAudioExtendToFile() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeInitAudioExtendToFile(j);
    }

    public boolean isAudioExtendToFileProcessing() {
        return nativeIsAudioExtendToFileProcessing(this.mNative);
    }

    public int isCompileEncode() {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        return nativeIsCompileEncode(j);
    }

    public int isWatermarkCompileEncode() {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        return nativeIsWatermarkCompileEncode(j);
    }

    public int pauseSync() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativePauseSync(j);
    }

    public int releaseEngine() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeReleaseEngine(j);
    }

    public int releaseEngineAsync() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeReleaseEngineAsync(j);
    }

    public void releasePreviewSurface() {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeReleasePreviewSurface(j);
    }

    public int removeEffectCallback() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveEffectCallback(j);
    }

    public int removeMessageCenterListener() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveMessageCenterListener(j);
    }

    public int start() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeStart(j);
    }

    public int startEffectMonitor() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        nativeStartEffectMonitor(j);
        return 0;
    }

    public int stop() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeStop(j);
    }

    public int stopEffectMonitor() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        nativeStopEffectMonitor(j);
        return 0;
    }

    public int uninitAudioExtendToFile() {
        return nativeUninitAudioExtendToFile(this.mNative);
    }

    static {
        TENativeLibsLoader.loadLibrary();
        m_IsConfigedAB = false;
    }

    public TEInterface() {
        if (m_IsConfigedAB) {
            return;
        }
        configABforEditor();
        m_IsConfigedAB = true;
    }

    private void configABforEditor() {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        VEConfigCenter.ValuePkt value;
        int iIntValue;
        VEConfigCenter vEConfigCenter = VEConfigCenter.getInstance();
        VEConfigCenter.DataType dataType = VEConfigCenter.DataType.INTEGER;
        VEConfigCenter.ValuePkt value2 = vEConfigCenter.getValue("vesdk_max_cache_count", dataType, 0);
        if (value2 != null && value2.getValue() != null && (value2.getValue() instanceof Integer) && (iIntValue = ((Integer) value2.getValue()).intValue()) > 0) {
            nativeConfigMaxCacheFrameCount(iIntValue);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableAndroidHdr2SdrSupport: ");
        sbLIZ.append(true);
        C2484209oO.LJI("TEInterface", C2188811AlT.LIZIZ(sbLIZ));
        VEConfigCenter vEConfigCenter2 = VEConfigCenter.getInstance();
        VEConfigCenter.DataType dataType2 = VEConfigCenter.DataType.BOOLEAN;
        Boolean bool = Boolean.FALSE;
        VEConfigCenter.ValuePkt value3 = vEConfigCenter2.getValue("ve_camera_enable_preview_pure_color_background", dataType2, bool);
        if (value3 != null && value3.getValue() != null && (value3.getValue() instanceof Boolean)) {
            boolean zBooleanValue4 = ((Boolean) value3.getValue()).booleanValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("enablePreviewPureColorBackground: ");
            sbLIZ2.append(zBooleanValue4);
            C2484209oO.LJI("TEInterface", C2188811AlT.LIZIZ(sbLIZ2));
            if (zBooleanValue4 && (value = VEConfigCenter.getInstance().getValue("ve_camera_preview_pure_color_background_rgba", dataType, 0)) != null && value.getValue() != null && (value.getValue() instanceof Integer)) {
                int iIntValue2 = ((Integer) value.getValue()).intValue();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("enablePreviewPureColorBackground: ");
                sbLIZ3.append(zBooleanValue4);
                sbLIZ3.append(", rgbaValue = ");
                sbLIZ3.append(iIntValue2);
                C2484209oO.LJI("TEInterface", C2188811AlT.LIZIZ(sbLIZ3));
                nativeEnablePreviewPureColorBackground(zBooleanValue4, iIntValue2);
            }
        }
        VEConfigCenter.ValuePkt value4 = VEConfigCenter.getInstance().getValue("enable_android_hdr_preview_support", dataType2, bool);
        if (value4 != null && value4.getValue() != null && (value4.getValue() instanceof Boolean)) {
            ((Boolean) value4.getValue()).booleanValue();
        }
        VEConfigCenter vEConfigCenter3 = VEConfigCenter.getInstance();
        Boolean bool2 = Boolean.TRUE;
        VEConfigCenter.ValuePkt value5 = vEConfigCenter3.getValue("vesdk_audiomix_replace", dataType2, bool2);
        if (value5 != null && value5.getValue() != null && (value5.getValue() instanceof Boolean) && (zBooleanValue3 = ((Boolean) value5.getValue()).booleanValue())) {
            nativeEnableNewAudioMixer(zBooleanValue3);
        }
        VEConfigCenter.ValuePkt value6 = VEConfigCenter.getInstance().getValue("vesdk_audio_hw_encoder", dataType2, bool);
        if (value6 != null && value6.getValue() != null && (value6.getValue() instanceof Boolean) && (zBooleanValue2 = ((Boolean) value6.getValue()).booleanValue())) {
            nativeAudioHwEncoder(zBooleanValue2);
        }
        VEConfigCenter.ValuePkt value7 = VEConfigCenter.getInstance().getValue("crossplat_glbase_fbo", dataType2, bool);
        if (value7 != null && value7.getValue() != null && (value7.getValue() instanceof Boolean)) {
            boolean zBooleanValue5 = ((Boolean) value7.getValue()).booleanValue();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("KEY_CROSSPLAT_GLBASE_FBO: ");
            sbLIZ4.append(zBooleanValue5);
            C2484209oO.LIZJ("TEInterface", C2188811AlT.LIZIZ(sbLIZ4));
            if (zBooleanValue5) {
                nativeEnableCrossplatformGLBaseFBO(zBooleanValue5);
            }
        }
        VEConfigCenter.ValuePkt value8 = VEConfigCenter.getInstance().getValue("enable_render_lib", dataType2, bool);
        if (value8 != null && value8.getValue() != null && (value8.getValue() instanceof Boolean)) {
            boolean zBooleanValue6 = ((Boolean) value8.getValue()).booleanValue();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("KEY_ENABLE_RENDER_LIB: ");
            sbLIZ5.append(zBooleanValue6);
            C2484209oO.LIZJ("TEInterface", C2188811AlT.LIZIZ(sbLIZ5));
            if (zBooleanValue6) {
                nativeEnableRenderLib(zBooleanValue6);
            }
        }
        VEConfigCenter.ValuePkt value9 = VEConfigCenter.getInstance().getValue("renderlib_fbo_opt", dataType2, bool);
        if (value9 != null && value9.getValue() != null && (value9.getValue() instanceof Boolean)) {
            boolean zBooleanValue7 = ((Boolean) value9.getValue()).booleanValue();
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("KEY_RENDER_LIB_FBO_OPT: ");
            sbLIZ6.append(zBooleanValue7);
            C2484209oO.LIZJ("TEInterface", C2188811AlT.LIZIZ(sbLIZ6));
            if (zBooleanValue7) {
                nativeEnableRenderLibFBOOpt(zBooleanValue7);
            }
        }
        VEConfigCenter.ValuePkt value10 = VEConfigCenter.getInstance().getValue("vesdk_use_agfxcontext", dataType2, bool);
        if (value10 != null && value10.getValue() != null && (value10.getValue() instanceof Boolean)) {
            boolean zBooleanValue8 = ((Boolean) value10.getValue()).booleanValue();
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("KEY_ENABLE_AGFX_CTX: ");
            sbLIZ7.append(zBooleanValue8);
            C2484209oO.LIZJ("TEInterface", C2188811AlT.LIZIZ(sbLIZ7));
            if (zBooleanValue8) {
                nativeEnableAGFXCtx(zBooleanValue8);
            }
        }
        VEConfigCenter.ValuePkt value11 = VEConfigCenter.getInstance().getValue("ve_enable_decoder_schedule_opt_hw", dataType, 2);
        if (value11 != null && value11.getValue() != null && (value11.getValue() instanceof Integer)) {
            Integer num = (Integer) value11.getValue();
            if (num.intValue() > 0) {
                nativeEnableDecoderResourceScheduleOptHw(num.intValue());
            }
        }
        VEConfigCenter.ValuePkt value12 = VEConfigCenter.getInstance().getValue("ve_enable_readermanager_refactor", dataType2, bool2);
        if (value12 != null && value12.getValue() != null && (value12.getValue() instanceof Boolean) && ((Boolean) value12.getValue()).booleanValue()) {
            C2484209oO.LJI("TEInterface", "enable ReaderManager refactortrue");
            nativeEnableReaderManagerRefactor(true);
        }
        VEConfigCenter.ValuePkt value13 = VEConfigCenter.getInstance().getValue("ve_enable_video_frame_cache", dataType, 0);
        if (value13 != null && value13.getValue() != null && (value13.getValue() instanceof Integer)) {
            Integer num2 = (Integer) value13.getValue();
            if (num2.intValue() > 0) {
                nativeEnableVideoFrameCacheOpt(num2.intValue());
            }
        }
        VEConfigCenter.ValuePkt value14 = VEConfigCenter.getInstance().getValue("ve_enable_schdule_device_capability_opt", dataType, 0);
        if (value14 != null && value14.getValue() != null && (value14.getValue() instanceof Integer)) {
            Integer num3 = (Integer) value14.getValue();
            if (num3.intValue() > 0) {
                C2484209oO.LJI("TEInterface", "enable_device_capability_opttrue");
                nativeEnableDeviceCapabilityOpt(num3.intValue());
            }
        }
        VEConfigCenter.ValuePkt value15 = VEConfigCenter.getInstance().getValue("ve_enable_render_encode_resolution_align4", dataType2, bool2);
        if (value15 != null && value15.getValue() != null && (value15.getValue() instanceof Boolean) && ((Boolean) value15.getValue()).booleanValue() && Build.VERSION.SDK_INT >= 24) {
            C2484209oO.LJI("TEInterface", "enableRenderEncodeAlign4: true");
            nativeEnableOutResolutionAlign4(true);
            TEAvcEncoder.setEncodeResolutionAlign(4);
        }
        VEConfigCenter.ValuePkt value16 = VEConfigCenter.getInstance().getValue("ve_enable_pin_refactor", dataType2, bool);
        if (value16 != null && value16.getValue() != null && (value16.getValue() instanceof Boolean) && (zBooleanValue = ((Boolean) value16.getValue()).booleanValue())) {
            nativeEnablePinRefactor(zBooleanValue);
        }
        VEConfigCenter.ValuePkt value17 = VEConfigCenter.getInstance().getValue("ve_enable_hwdecode_playback_dropframe_opt", dataType2, bool);
        if (value17 != null && value17.getValue() != null && (value17.getValue() instanceof Boolean)) {
            boolean zBooleanValue9 = ((Boolean) value17.getValue()).booleanValue();
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("hwdecodePlaybackDropFrameOpt: ");
            sbLIZ8.append(zBooleanValue9);
            C2484209oO.LJI("TEInterface", C2188811AlT.LIZIZ(sbLIZ8));
            if (zBooleanValue9) {
                nativeEnableOptPlayBackDropFrame(zBooleanValue9);
            }
        }
        VEConfigCenter.ValuePkt value18 = VEConfigCenter.getInstance().getValue("ve_enable_mpeg24vp89_hwdecoder2", dataType2, bool);
        if (value18 != null && value18.getValue() != null && (value18.getValue() instanceof Boolean)) {
            boolean zBooleanValue10 = ((Boolean) value18.getValue()).booleanValue();
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("enableMpeg24VP89HWDecoder: ");
            sbLIZ9.append(zBooleanValue10);
            C2484209oO.LJI("TEInterface", C2188811AlT.LIZIZ(sbLIZ9));
            if (zBooleanValue10) {
                VERuntime.getInstance().enableHDMpeg24VP89HWDecoder(zBooleanValue10);
            }
        }
        VEConfigCenter.ValuePkt value19 = VEConfigCenter.getInstance().getValue("ve_enable_imageAlgorithmReuseAndOptForAmazing", dataType2, bool);
        if (value19 != null && value19.getValue() != null && (value19.getValue() instanceof Boolean)) {
            boolean zBooleanValue11 = ((Boolean) value19.getValue()).booleanValue();
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("imageAlgorithmReuseAndOptForAmazing: ");
            sbLIZ10.append(zBooleanValue11);
            C2484209oO.LJI("TEInterface", C2188811AlT.LIZIZ(sbLIZ10));
            if (zBooleanValue11) {
                nativeEnableImageAlgorithmReuseAndOptForAmazing(zBooleanValue11);
            }
        }
        VEConfigCenter.ValuePkt value20 = VEConfigCenter.getInstance().getValue("ve_enable_pip_resolution_opt", dataType2, bool);
        if (value20 != null && value20.getValue() != null && (value20.getValue() instanceof Boolean)) {
            boolean zBooleanValue12 = ((Boolean) value20.getValue()).booleanValue();
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append("pip resolution opt: ");
            sbLIZ11.append(zBooleanValue12);
            C2484209oO.LJI("TEInterface", C2188811AlT.LIZIZ(sbLIZ11));
            if (zBooleanValue12) {
                nativeEnablePipResolutionOpt(zBooleanValue12);
            }
        }
        VEConfigCenter.ValuePkt value21 = VEConfigCenter.getInstance().getValue("ve_hardware_encode_fallback", dataType, 0);
        if (value21 != null && value21.getValue() != null && (value21.getValue() instanceof Integer)) {
            Integer num4 = (Integer) value21.getValue();
            if (num4.intValue() != 0) {
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append("ATTENTION!!! TESTING, HARDWARE ENCODE WILL FALLBACK TO SOFT, MODE = ");
                sbLIZ12.append(num4);
                C2484209oO.LJIIIIZZ("TEInterface", C2188811AlT.LIZIZ(sbLIZ12));
                C1284450jWt.LIZLLL = num4.intValue();
            }
        }
        VEConfigCenter.ValuePkt value22 = VEConfigCenter.getInstance().getValue("ve_enable_effect_render_without_glreadpixels", dataType2, bool);
        if (value22 != null && value22.getValue() != null && (value22.getValue() instanceof Boolean)) {
            boolean zBooleanValue13 = ((Boolean) value22.getValue()).booleanValue();
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append("effect render without glreadpixels: ");
            sbLIZ13.append(zBooleanValue13);
            C2484209oO.LJI("TEInterface", C2188811AlT.LIZIZ(sbLIZ13));
            if (zBooleanValue13) {
                nativeEnableEffectRenderWithoutGlreadpixels(zBooleanValue13);
            }
        }
        VEConfigCenter.ValuePkt value23 = VEConfigCenter.getInstance().getValue("ve_enable_part_remux", dataType2, bool);
        if (value23 == null || value23.getValue() == null || !(value23.getValue() instanceof Integer)) {
            return;
        }
        nativeEnablePartRemux(((Boolean) value23.getValue()).booleanValue());
    }

    public int getHostTrackIndex() {
        return this.mHostTrackIndex;
    }

    public long getNativeHandler() {
        return this.mNative;
    }

    public static int configMaxCacheFrameCount(int i) {
        return nativeConfigMaxCacheFrameCount(i);
    }

    public static TEInterface createEngine(VEUserConfig vEUserConfig) {
        int[] iArr;
        int[] iArr2;
        String[] strArr;
        int i;
        int length;
        if (vEUserConfig != null && (length = vEUserConfig.getConfigItems().length) > 0) {
            iArr2 = new int[length];
            strArr = new String[length];
            iArr = new int[length];
            for (int i2 = 0; i2 < vEUserConfig.getConfigItems().length; i2++) {
                strArr[i2] = vEUserConfig.getConfigItems()[i2].id.value();
                int iValue = vEUserConfig.getConfigItems()[i2].getDataType().value();
                iArr[i2] = iValue;
                if (iValue == 0) {
                    iArr2[i2] = ((Boolean) vEUserConfig.getConfigItems()[i2].getValue()).booleanValue() ? 1 : 0;
                } else if (iValue == 1) {
                    iArr2[i2] = ((Integer) vEUserConfig.getConfigItems()[i2].getValue()).intValue();
                } else {
                    C2484209oO.LIZJ("setUserConfig", "illegal type");
                    iArr2[i2] = -1;
                }
            }
        } else {
            iArr = null;
            iArr2 = null;
            strArr = null;
        }
        TEInterface tEInterface = new TEInterface();
        if (VERuntime.getInstance().isGLES3Enabled()) {
            i = 3;
        } else {
            i = 2;
        }
        TEGLGlobalContext.nativeSetGLVersion(i);
        TEGLGlobalContext.nativeSetMaxRenderSize(VERuntime.getInstance().getMaxRenderSize().width, VERuntime.getInstance().getMaxRenderSize().height);
        long jNativeCreateEngine = tEInterface.nativeCreateEngine(strArr, iArr, iArr2);
        if (jNativeCreateEngine == 0) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create new editor native handler=");
        sbLIZ.append(jNativeCreateEngine);
        C2484209oO.LJIIIIZZ("TEInterface", C2188811AlT.LIZIZ(sbLIZ));
        tEInterface.mNative = jNativeCreateEngine;
        b.LIZ("vesdk_event_editor_init", "business", null);
        return tEInterface;
    }

    public static int enableAGFXCtx(boolean z) {
        return nativeEnableAGFXCtx(z);
    }

    public static int enableAndroidHdrPreviewSupport(boolean z) {
        return nativeEnableAndroidHdrPreviewSupport(z);
    }

    public static int enableAudioGBU(boolean z) {
        return nativeEnableAudioGBU(z);
    }

    public static int enableAudioHwEncoder(boolean z) {
        return nativeAudioHwEncoder(z);
    }

    public static int enableCapabilityOpt(int i) {
        return nativeEnableDeviceCapabilityOpt(i);
    }

    public static int enableCreateDecoderByName(boolean z) {
        return nativeEnableCreateDecoderByName(z);
    }

    public static int enableCrossplatformGLBaseFBO(boolean z) {
        return nativeEnableCrossplatformGLBaseFBO(z);
    }

    public static int enableDecoderResourceScheduleOptHw(int i) {
        return nativeEnableDecoderResourceScheduleOptHw(i);
    }

    public static int enableDisplayP3ReEncode(boolean z) {
        return nativeEnableDisplayP3ReEncode(z);
    }

    public static int enableDisplayP3Render(boolean z) {
        return nativeEnableDisplayP3Render(z);
    }

    public static int enableEffectAmazingMV(boolean z) {
        return nativeEnableEffectAmazingMV(z);
    }

    public static int enableEffectRenderWithoutGlreadpixels(boolean z) {
        return nativeEnableEffectRenderWithoutGlreadpixels(z);
    }

    public static int enableFileInfoCache(boolean z) {
        return nativeEnableFileInfoCache(z);
    }

    public static int enableFirstFrameOpt(boolean z) {
        return nativeEnableFirstFrameOpt(z);
    }

    public static int enableHighSpeed(boolean z) {
        return nativeEnableHighSpeed(z);
    }

    public static int enableImageAlgorithmReuseAndOptForAmazing(boolean z) {
        return nativeEnableImageAlgorithmReuseAndOptForAmazing(z);
    }

    public static int enableMultiThreadDecode(boolean z) {
        return nativeEnableMultiThreadDecode(z);
    }

    public static int enableNewAudioMixer(boolean z) {
        return nativeEnableNewAudioMixer(z);
    }

    public static int enableOptGlFlush(boolean z) {
        return nativeEnableOptGLFlush(z);
    }

    public static int enableOptPlayBackDropFrame(boolean z) {
        return nativeEnableOptPlayBackDropFrame(z);
    }

    public static int enableOutResolutionAlign4(boolean z) {
        return nativeEnableOutResolutionAlign4(z);
    }

    public static int enableParallDecodeMatting(boolean z) {
        return nativeEnableParallDecodeMatting(z);
    }

    public static int enablePinRefactor(boolean z) {
        return nativeEnablePinRefactor(z);
    }

    public static int enablePipResolutionOpt(boolean z) {
        return nativeEnablePipResolutionOpt(z);
    }

    public static int enableReaderManagerRefactor(boolean z) {
        return nativeEnableReaderManagerRefactor(z);
    }

    public static int enableRenderLib(boolean z) {
        return nativeEnableRenderLib(z);
    }

    public static int enableRenderLibFBOOpt(boolean z) {
        return nativeEnableRenderLibFBOOpt(z);
    }

    public static int enableSeekAndPreloadOpt(boolean z) {
        return nativeEnableSeekAndPreloadOpt(z);
    }

    public static int enableSeekPredictOpt(boolean z) {
        return nativeSeekPredictOpt(z);
    }

    public static int enableSmartTransDetect(boolean z) {
        return nativeEnableSmartTransDetect(z);
    }

    public static int enableVideoFrameCache(int i) {
        return nativeEnableVideoFrameCacheOpt(i);
    }

    public static Object getMVInfoStatic(String str) {
        return nativeGetMVInfoStatic(str);
    }

    public static int openEditorFpsLog(boolean z) {
        return nativeOpenEditorFpsLog(z);
    }

    public static int openOutputCallback(boolean z) {
        return nativeOpenOutputCallback(z);
    }

    public static int setCompileGLContextReuse(boolean z) {
        return nativeEnableCompileGLContextReuse(z);
    }

    public static int setCompileReportState(int i) {
        return nativeSetCompileReport(i);
    }

    public static int setEnableEffectCanvas(boolean z) {
        return nativeEnableEffectCanvas(z);
    }

    public static int setEnableEffectTransition(boolean z) {
        return nativeEnableEffectTransiton(z);
    }

    public static int setEnableOpt(int i) {
        return nativeSetOptVersion(i);
    }

    public static int setEnableRefaComposer(boolean z) {
        return nativeEnableRefaComposer(z);
    }

    public static int setForceDropFrameWithoutAudio(boolean z) {
        return nativeSetForceDropFrameWithoutAudio(z);
    }

    public static int setInfoStickerTransEnable(boolean z) {
        return nativeSetInfoStickerTransEnable(z);
    }

    public static void setLensOneKeyHdrMaxCacheSize(int i) {
        nativeSetMaxDetectFrameCount(i);
    }

    public static int setMaxAudioReaderCount(int i) {
        return nativeSetMaxAudioReaderCount(i);
    }

    public String addFileInfoCache(String str) {
        long j = this.mNative;
        if (j == 0) {
            return "";
        }
        return nativeAddFileInfoCache(j, str);
    }

    public int appendComposerNodes(String[] strArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeAppendComposerNodes(j, strArr);
    }

    public void clearDisplay(int i) {
        nativeClearDisplay(this.mNative, i);
    }

    public int deleteAICutOutClipParam(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveAICutOutClipParam(j, i);
    }

    public int deleteExternalVideoTrack(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        return nativeDeleteSubVideoTrack(j, i);
    }

    public void dumpSequence(String str) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeDumpSequence(j, str);
    }

    public int enableAudioDisplayCallBack(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeEnableAudioDisplayCallBack(j, z);
    }

    public int enableEffect(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeEnableEffect(j, z);
    }

    public int enableEffectAmazing(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeEnableEffectAmazing(j, z);
    }

    public int enableFaceDetect(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeEnableFaceDetect(j, z);
    }

    public int enableGenderDetect(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeEnableGenderDetect(j, z);
    }

    public int enableHDRSetting(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("enable_android_hdr_preview_support", VEConfigCenter.DataType.BOOLEAN, Boolean.FALSE);
        if (value != null && value.getValue() != null && (value.getValue() instanceof Boolean) && !((Boolean) value.getValue()).booleanValue()) {
            return -1;
        }
        return nativeEnableHDRSetting(this.mNative, z);
    }

    public int enableHighSpeedForSingle(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeEnableHighSpeedForSingle(j, z);
    }

    public int enableImageEditor(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeEnableImageEditor(j, z);
    }

    public void enableSimpleProcessor(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "engine processor mode", j);
    }

    public void enableWatermarkMetadata(boolean z) {
        long j = 0;
        if (this.mNative == 0) {
            return;
        }
        if (z) {
            j = 1;
        }
        setOption(0, "CompileEnableWatermarkMetadata", j);
    }

    public int expandTimeline(int i) {
        return nativeExpandTimeline(this.mNative, i);
    }

    public byte[] getAudioCommonFilterPreprocessResult(long j) {
        long j2 = this.mNative;
        if (j2 == 0) {
            return null;
        }
        return nativeGetAudioCommonFilterPreprocessResult(j2, j);
    }

    public float getClipMattingProgress(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112.0f;
        }
        return nativeGetClipProgress(j, i);
    }

    public float getColorFilterIntensity(String str) {
        long j = this.mNative;
        if (j == 0) {
            return -112.0f;
        }
        return nativeGetColorFilterIntensity(j, str);
    }

    public int getDisplayImage(Bitmap bitmap) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGetDisplayImage(j, bitmap);
    }

    public String getMetaData(String str) {
        long j = this.mNative;
        if (j == 0) {
            return "";
        }
        return nativeGetMetaData(j, str);
    }

    public int getProcessedImage(Bitmap bitmap) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGetProcessedImage(j, bitmap);
    }

    public int getTransparentImage(Bitmap bitmap) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGetTransparentImage(j, bitmap);
    }

    public int lockSeekVideoClip(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeLockSeekVideoClip(j, i);
    }

    public int pause(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativePause(j, i);
    }

    public int prepareEngine(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativePrepareEngine(j, i);
    }

    public int pushImageToBuffer(String str) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativePushImageToBuffer(j, str);
    }

    public int refreshCurrentFrame(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRefreshCurrentFrame(j, i);
    }

    public int reloadComposerNodes(String[] strArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeReloadComposerNodes(j, strArr);
    }

    public int removeComposerNodes(String[] strArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveComposerNodes(j, strArr);
    }

    public int removeFilter(int[] iArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveFilter(j, iArr);
    }

    public void setBackGroundColor(int i) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetBackGroundColor(j, i);
    }

    public int setClientState(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetClientState(j, i);
    }

    public void setCompileColorTransferCharacteristic(int i) {
        if (this.mNative == 0) {
            return;
        }
        setOption(0, "CompileColorTransferCharacteristic", i);
    }

    public void setCompileDumpFilePath(String str) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetCompileDumpFilePath(j, str);
    }

    public void setCompileFps(int i) {
        setOption(0, "CompileFps", i);
    }

    public void setCompileHardwareEncodeOptions(int i) {
        setOption(0, "CompileHardwareBitrate", i);
    }

    public void setCompileMVStillFramesPublishFps(int i) {
        setOption(0, "CompileMVStillFramesPublishFps", i);
    }

    public void setCompileMVStillFramesWatermarkFps(int i) {
        setOption(0, "CompileMVStillFramesWatermarkFps", i);
    }

    public void setCompilePublishFps(int i) {
        setOption(0, "CompilePublishFps", i);
    }

    public void setCompileSoftInfo(boolean z) {
        long j = 0;
        if (this.mNative == 0) {
            return;
        }
        if (z) {
            j = 1;
        }
        setOption(0, "CompileSoftInfo", j);
    }

    public void setCompileType(int i) {
        setOption(0, "CompileType", i);
    }

    public void setCompileWatermark(VEWatermarkParam vEWatermarkParam) {
        if (vEWatermarkParam.needExtFile) {
            setOption(0, "SingleWayCompileWithWatermark", 0L);
            setOption(0, "CompilePathWatermark", vEWatermarkParam.extFile);
        } else {
            setOption(0, "SingleWayCompileWithWatermark", 1L);
        }
        setOption(0, "CompilePathWavWatermark", "");
    }

    public int setComposerNodes(String[] strArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetComposerNodes(j, strArr);
    }

    public int setDestroyVersion(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return 0;
    }

    public int setDldEnabled(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetDldEnabled(j, z);
    }

    public int setDldThrVal(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetDldThrVal(j, i);
    }

    public int setDleEnabled(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetDleEnabled(j, z);
    }

    public int setDleEnabledPreview(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetDleEnabledPreview(j, z);
    }

    public int setEffectCallback(VEListener.VEEditorEffectListener vEEditorEffectListener) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectCallback(j, vEEditorEffectListener);
    }

    public int setEffectMaxMemoryCache(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectMaxMemoryCache(j, i);
    }

    public int setEffectParams(VEEffectParams vEEffectParams) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectParams(j, vEEffectParams);
    }

    public void setEnableAvInterLeave(boolean z) {
        long j = 0;
        if (this.mNative == 0) {
            return;
        }
        if (z) {
            j = 1;
        }
        setOption(0, "CompileAvInterleave", j);
    }

    public void setEnableCompileVboost(boolean z) {
        long j = 0;
        if (this.mNative == 0) {
            return;
        }
        if (z) {
            j = 1;
        }
        setOption(0, "EnableCompileVboost", j);
    }

    public void setEnableInterLeave(boolean z) {
        long j = 0;
        if (this.mNative == 0) {
            return;
        }
        if (z) {
            j = 1;
        }
        setOption(0, "CompileInterleave", j);
    }

    public void setEnableMultipleAudioFilter(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetEnableMultipleAudioFilter(j, z);
    }

    public void setEnableRemuxVideo(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetEnableRemuxVideo(j, z);
    }

    public void setEncGopSize(int i) {
        setOption(0, "video gop size", i);
    }

    public void setExpandLastFrame(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetExpandLastFrame(j, z);
    }

    public void setForceDetectForFirstFrameByClip(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "force detect for first frame by clip", j);
    }

    public void setHeightWidthRatio(float f) {
        if (f > 0.0f) {
            setOption(0, "engine height width ratio", f);
        }
    }

    public void setHostTrackIndex(int i) {
        this.mHostTrackIndex = i;
    }

    public void setImageCompileQuality(float f) {
        setOption(0, "CompileImageQuality", f);
    }

    public void setKeyFramePoints(int[] iArr) {
        if (this.mNative == 0) {
            return;
        }
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i] * LSPassThroughRecordSizeConfig.DEFAULT;
        }
        setOption(0, "compileKeyFramePoints", jArr);
    }

    public void setLooping(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(1, "engine loop play", j);
    }

    public int setMaleMakeupState(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetMaleMakeupState(j, z);
    }

    public int setMessageCenterListener(VEListener.VEMessageCenterListener vEMessageCenterListener) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetMessageCenterListener(j, vEMessageCenterListener);
    }

    public void setMultiComposer(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "is multi composer filter", j);
    }

    public void setNativeHandler(long j) {
        this.mNative = 0L;
    }

    public void setPageMode(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("wrong call setPageMode ");
        sbLIZ.append(i);
        C2484209oO.LIZJ("TEInterface", C2188811AlT.LIZIZ(sbLIZ));
        setOption(0, "engine page mode", i);
    }

    public int setPreviewFps(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        nativeSetPreviewFps(j, i);
        return 0;
    }

    public int setPreviewScaleMode(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetPreviewScaleMode(j, i);
    }

    public void setPreviewSurface(Surface surface) {
        if (this.mNative == 0) {
            return;
        }
        C1311120kDu.LIZ("setPreviewSurface");
        nativeSetPreviewSurface(this.mNative, surface);
        C1311120kDu.LIZIZ();
    }

    public void setScaleMode(int i) {
        setOption(0, "filter mode", i);
    }

    public void setSpeedRatio(float f) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetSpeedRatio(j, f);
    }

    public void setUseHwEnc(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "HardwareVideo", j);
    }

    public void setUseLargeMattingModel(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "UseLargeMattingModel", j);
    }

    public void setUsrRotate(int i) {
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i != 270) {
                        setOption(0, "usr rotate", 0L);
                        return;
                    } else {
                        setOption(0, "usr rotate", 3L);
                        return;
                    }
                }
                setOption(0, "usr rotate", 2L);
                return;
            }
            setOption(0, "usr rotate", 1L);
            return;
        }
        setOption(0, "usr rotate", 0L);
    }

    public void setVideoBackGroundColor(int i) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetVideoBackGroundColor(j, i);
    }

    public int updateSceneFileOrder(VETimelineParams vETimelineParams) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateSceneFileOrder(j, vETimelineParams.videoFileIndex);
    }

    public int updateSenceTime(VETimelineParams vETimelineParams) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateSceneTime(j, vETimelineParams.enable, vETimelineParams.vTrimIn, vETimelineParams.vTrimOut, ROTATE_DEGREE.toIntArray(vETimelineParams.rotate), vETimelineParams.speed);
    }

    public static TEInterface createEngine(long j) {
        int i;
        TEInterface tEInterface = new TEInterface();
        if (VERuntime.getInstance().isGLES3Enabled()) {
            i = 3;
        } else {
            i = 2;
        }
        TEGLGlobalContext.nativeSetGLVersion(i);
        TEGLGlobalContext.nativeSetMaxRenderSize(VERuntime.getInstance().getMaxRenderSize().width, VERuntime.getInstance().getMaxRenderSize().height);
        if (j == 0) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reuse editor native handler=");
        sbLIZ.append(j);
        C2484209oO.LJIIIIZZ("TEInterface", C2188811AlT.LIZIZ(sbLIZ));
        tEInterface.mNative = j;
        tEInterface.nativeResetCallback(j);
        b.LIZ("vesdk_event_editor_init", "business", null);
        return tEInterface;
    }

    public static int enablePreviewPureColorBackground(boolean z, int i) {
        return nativeEnablePreviewPureColorBackground(z, i);
    }

    public static int setTexturePoolLimit(int i, int i2) {
        return nativeSetTexturePoolLimit(i, i2);
    }

    public int addAudioTrackWithStruct(VECommonClipParam vECommonClipParam, boolean z) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(vECommonClipParam.path)) {
            return -100;
        }
        return nativeAddAudioTrackWithStruct(this.mNative, vECommonClipParam, z);
    }

    public void addMetaData(String str, String str2) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeAddMetaData(j, str, str2);
    }

    public int changeTransitionAt(int i, VETransitionFilterParam vETransitionFilterParam) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeChangeTransitonAt(j, i, vETransitionFilterParam);
    }

    public int deleteAudioTrack(int i, boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        return nativeDeleteAudioTrack(j, i, z);
    }

    public List<VEClipParam> getAllClips(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return null;
        }
        return nativeGetAllClips(j, i, i2);
    }

    public int[] getDecodeInfo(int i, int i2) {
        int[] iArr = {0};
        long j = this.mNative;
        if (j == 0) {
            return iArr;
        }
        return nativeGetDecodeDumpInfo(j, i, i2);
    }

    public VERect getDecodeRect(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return new VERect(0, 0, 0, 0);
        }
        int[] iArrNativeGetDecodeDumpInfo = nativeGetDecodeDumpInfo(j, i, i2);
        return new VERect(iArrNativeGetDecodeDumpInfo[0], iArrNativeGetDecodeDumpInfo[1], iArrNativeGetDecodeDumpInfo[2], iArrNativeGetDecodeDumpInfo[3]);
    }

    public int getSingleTrackProcessedImage(int i, Bitmap bitmap) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGetSingleTrackProcessedImage(j, i, bitmap);
    }

    public int setAlgorithmPreConfig(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetAlgorithmPreConfig(j, i, i2);
    }

    public void setAlgorithmReplay(int i, String str) {
        if (this.mNative == 0) {
            return;
        }
        setOption(0, "AlgorithmReplayMode", i);
        setOption(0, "AlgorithmReplayFilePath", str);
    }

    public int setAlgorithmSyncAndNum(boolean z, int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetAlgorithmSyncAndNum(j, z, i);
    }

    public int setAudioOffset(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetAudioOffset(j, i, i2);
    }

    public void setCompileCommonEncodeOptions(int i, int i2) {
        setOption(0, "CompileBitrateMode", i);
        setOption(0, "CompileEncodeProfile", i2);
    }

    public int setComposerMode(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetComposerMode(j, i, i2);
    }

    public int setDeviceRotation(float[] fArr, double d) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetDeviceRotation(j, fArr, d);
    }

    public int setEffectCacheInt(String str, int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectCacheInt(j, str, i);
    }

    public void setEncoderParallel(boolean z, boolean z2) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetEncoderParallel(j, z, z2);
    }

    public void setEngineCompilePath(String str, String str2) {
        setOption(0, "CompilePath", str);
        setOption(0, "CompilePathWav", str2);
    }

    public boolean setFrameTrace(String str, int i) {
        long j = this.mNative;
        if (j == 0 || nativeFrameTrace(j, str, i) != 0) {
            return false;
        }
        return true;
    }

    public void setMaxWidthHeight(int i, int i2) {
        if (i > 0) {
            setOption(0, "engine max video width", i);
        }
        if (i2 > 0) {
            setOption(0, "engine max video height", i2);
        }
    }

    public void setPreviewSurfaceBitmap(Bitmap bitmap, boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetPreviewSurfaceBitmap(j, bitmap, z);
    }

    public void setSurfaceSize(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetSurfaceSize(j, i, i2);
    }

    public void setVideoCompileBitrate(int i, int i2) {
        setOption(0, "CompileBitrateMode", i);
        setOption(0, "CompileBitrateValue", i2);
    }

    public void setWaterMark(VEWatermarkParam.VEWatermarkEntity[] vEWatermarkEntityArr, VEWatermarkParam.VEWatermarkMask vEWatermarkMask) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetWaterMark(j, vEWatermarkEntityArr, vEWatermarkMask);
    }

    public void setWatermarkWidthHeight(int i, int i2) {
        if (i > 0) {
            setOption(0, "engine watermark video width", i);
        }
        if (i2 > 0) {
            setOption(0, "engine watermark video height", i2);
        }
    }

    public void setWidthHeight(int i, int i2) {
        if (i > 0) {
            setOption(0, "engine video width", i);
        }
        if (i2 > 0) {
            setOption(0, "engine video height", i2);
        }
    }

    public int switchResourceLoadMode(boolean z, int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSwitchResourceLoadMode(j, z, i);
    }

    public int updateAlgorithmRuntimeParam(int i, float f) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateAlgorithmRuntimeParam(j, i, f);
    }

    public int updateCanvasResolution(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateCanvasResolution(j, i, i2);
    }

    public static LoudnessDetectResult[] detectAudioLoudness(String[] strArr, int[] iArr, int[] iArr2) {
        return nativeDetectAudioLoudness(strArr, iArr, iArr2);
    }

    public static int setDropFrameParam(boolean z, long j, long j2) {
        return nativeSetDropFrameParam(z, j, j2);
    }

    public static int setImageBufferLimit(int i, int i2, int i3) {
        return nativeSetImageBufferLimit(i, i2, i3);
    }

    public static int setImageBufferParam(int i, int i2, int i3) {
        return nativeSetImageBufferParam(i, i2, i3);
    }

    public int addClipAuxiliaryParam(int i, int i2, VEClipAuxiliaryParam[] vEClipAuxiliaryParamArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeAddClipAuxiliaryParam(j, i, i2, vEClipAuxiliaryParamArr);
    }

    public int adjustFilterInOut(int i, int i2, int i3) {
        return nativeAdjustFilterInOut(this.mNative, i, i2, i3);
    }

    public int[] checkComposerNodeExclusion(String str, String str2, String str3) {
        long j = this.mNative;
        if (j == 0) {
            return new int[]{-1, 0};
        }
        return nativeCheckComposerNodeExclusion(j, str, str2, str3);
    }

    public int deleteClip(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeDeleteClip(j, i, i2, i3);
    }

    public int deleteKeyFrameParam(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeDeleteKeyFrameParam(j, i, i2, i3);
    }

    public String getClipInfoString(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return "";
        }
        return nativeGetClipInfoString(j, i, i2, i3);
    }

    public long getClipSequenceOut(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return -112L;
        }
        return nativeGetClipSequenceOut(j, i, i2, i3);
    }

    public int getDecodeImage(Bitmap bitmap, int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGetDecodeImage(j, bitmap, i, i2);
    }

    public float getTrackVolume(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return 0.0f;
        }
        return nativeGetTrackVolume(j, i, i2, i3);
    }

    public int seekWithResult(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSeekWithResult(j, i, i2, i3);
    }

    public void setAudioCompileSetting(int i, int i2, int i3) {
        if (this.mNative == 0) {
            return;
        }
        setOption(0, "AudioSampleRate", i);
        setOption(0, "AudioChannels", i2);
        setOption(0, "AudioBitrate", i3);
    }

    public int setExtTrackSeqIn(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetSubTrackSeqIn(j, i, i2, i3);
    }

    public int setFilterParam(int i, String str, VEMusicSRTEffectParam vEMusicSRTEffectParam) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetFilterParam(j, i, str, vEMusicSRTEffectParam);
    }

    public void setOption(int i, String str, float f) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetOption(j, i, str, f);
    }

    public void setResizer(int i, float f, float f2) {
        setOption(0, "filter mode", i);
        setOption(0, "resizer offset x percent", f);
        setOption(0, "resizer offset y percent", f2);
    }

    public int setTimeRange(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetTimeRange(j, i, i2, i3);
    }

    public int setTrackDurationType(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetTrackDurationType(j, i, i2, i3);
    }

    public int setTrackFilterEnable(int i, boolean z, boolean z2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetTrackFilterEnable(j, i, z, z2);
    }

    public int setTrackLayer(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetTrackLayer(j, i, i2, i3);
    }

    public boolean setTrackVolume(int i, int i2, float f) {
        long j = this.mNative;
        if (j == 0) {
            return false;
        }
        return nativeSetTrackVolume(j, i, i2, f);
    }

    public int setTransitionAt(int i, long j, String str) {
        long j2 = this.mNative;
        if (j2 == 0) {
            return -112;
        }
        return nativeSetTransitionAt(j2, i, j, str);
    }

    public int updateAICutOutClipParam(int i, int i2, VEAICutOutClipParam vEAICutOutClipParam) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateAICutOutClipParam(j, i, i2, vEAICutOutClipParam);
    }

    public int updateComposerNode(String str, String str2, float f) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateComposerNode(j, str, str2, f);
    }

    public int updateFilterParam(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int i3 = vEBaseFilterParam.filterType;
        if (i3 != 7) {
            if (i3 != 8) {
                if (i3 != 12) {
                    if (i3 != 13) {
                        if (i3 != 27) {
                            if (i3 != 33) {
                                if (i3 != 62) {
                                    if (i3 != 35) {
                                        if (i3 != 36) {
                                            switch (i3) {
                                                case 15:
                                                    if (vEBaseFilterParam instanceof VEVideoTransformFilterParam) {
                                                        return nativeUpdateVideoTransformFilterParam(j, i, i2, (VEVideoTransformFilterParam) vEBaseFilterParam);
                                                    }
                                                    if (vEBaseFilterParam instanceof VECanvasFilterParam) {
                                                        return nativeUpdateCanvasFilterParam(j, i, i2, (VECanvasFilterParam) vEBaseFilterParam);
                                                    }
                                                    break;
                                                case 16:
                                                    return nativeUpdateEffectHdrFilterParam(j, i, i2, (VEEffectHdrFilterParam) vEBaseFilterParam);
                                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                    return nativeUpdateQualityFilterParam(j, i, i2, (VEVideoAjustmentFilterParam) vEBaseFilterParam);
                                                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                                    break;
                                                case 19:
                                                    return nativeUpdateCropFilterParam(j, i, i2, (VEVideoCropFilterParam) vEBaseFilterParam);
                                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                                    return nativeUpdateImageTransformFilterParam(j, i, i2, (VEImageTransformFilterParam) vEBaseFilterParam);
                                                case 21:
                                                    return nativeUpdateImageAddFilterParam(j, i, i2, (VEImageAddFilterParam) vEBaseFilterParam);
                                                case 22:
                                                    return nativeUpdateAmazingFilterParam(j, i, i2, (VEAmazingFilterParam) vEBaseFilterParam);
                                                default:
                                                    return -100;
                                            }
                                            VEComposerFilterParam vEComposerFilterParam = (VEComposerFilterParam) vEBaseFilterParam;
                                            if (!vEComposerFilterParam.isValid()) {
                                                return -100;
                                            }
                                            if (vEComposerFilterParam.isOverallComposer()) {
                                                return nativeUpdateEffectComposerParam(this.mNative, i, i2, vEComposerFilterParam);
                                            }
                                            return nativeUpdateMultiEffectComposerParam(this.mNative, i, i2, (VEMultiComposerFilterParam) vEComposerFilterParam);
                                        }
                                        return nativeUpdateColorAdjustHslFilterParam(j, i, i2, (VEColorHslFilterParam) vEBaseFilterParam);
                                    }
                                    return nativeUpdateLensOneKeyHdrFilterParam(j, i, i2, (VEVideoLensOneKeyHdrParam) vEBaseFilterParam);
                                }
                                return nativeUpdateNewAICutOutClipParam(j, i, i2, (VENewAiCutOutClipFilterParam) vEBaseFilterParam);
                            }
                            return nativeUpdateLensHdrFilterParam(j, i, i2, (VELensHdrFilterParam) vEBaseFilterParam);
                        }
                        return nativeUpdateVideoStabFilterParam(j, i, i2, (VEVideoStableFilterParam) vEBaseFilterParam);
                    }
                    return nativeUpdateReshapeFilterParam(j, i, i2, (VEReshapeFilterParam) vEBaseFilterParam);
                }
                return nativeUpdateBeautyFilterParam(j, i, i2, (VEBeautyFilterParam) vEBaseFilterParam);
            }
            return nativeUpdateEffectFilterParam(j, i, i2, (VEEffectFilterParam) vEBaseFilterParam);
        }
        return nativeUpdateColorFilterParam(j, i, i2, (VEColorFilterParam) vEBaseFilterParam);
    }

    public int updateScene(String[] strArr, int[] iArr, int[] iArr2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int iNativeUpdateScene = nativeUpdateScene(j, strArr, iArr, iArr2);
        if (iNativeUpdateScene < 0) {
            return iNativeUpdateScene;
        }
        this.mHostTrackIndex = iNativeUpdateScene;
        return 0;
    }

    public int updateTrackClips(int i, int i2, String[] strArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateTrackClip(j, i, i2, strArr);
    }

    public int updateTrackFilter(int i, int i2, boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateTrackFilter(j, i, i2, z);
    }

    public int setFilterParam(int i, String str, VEStickerAnimator vEStickerAnimator) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetFilterParam(j, i, str, vEStickerAnimator);
    }

    public void setOption(int i, String str, long j) {
        long j2 = this.mNative;
        if (j2 == 0) {
            return;
        }
        nativeSetOption(j2, i, str, j);
    }

    public int setFilterParam(int i, String str, VEEffectFilterParam vEEffectFilterParam) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetFilterParam(j, i, str, vEEffectFilterParam);
    }

    public void setOption(int i, String str, String str2) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetOption(j, i, str, str2);
    }

    public int setFilterParam(int i, String str, String str2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetFilterParam(j, i, str, str2);
    }

    public void setOption(int i, String str, int[] iArr) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetOptionIntArray(j, i, str, iArr);
    }

    public int setFilterParam(int i, String str, byte[] bArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetFilterParam2(j, i, str, bArr);
    }

    public void setOption(int i, String str, long[] jArr) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetOptionLongArray(j, i, str, jArr);
    }

    public void setOption(int i, String[] strArr, long[] jArr) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetOptionArray(j, i, strArr, jArr);
    }

    public static String audioExtend(String str, float f, float f2, float f3) {
        return nativeAudioExtend(str, f, f2, f3);
    }

    public static int setMaxSoftWareVideoReaderCount(int i, int i2, int i3, int i4) {
        return nativeSetMaxSoftwareVideoReaderCount(i, i2, i3, i4);
    }

    public int addAudioTrackForClips(String[] strArr, int[] iArr, int[] iArr2, float[] fArr) {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        if (strArr != null && strArr.length != 0) {
            return nativeAddAudioTrackForClips(j, strArr, iArr, iArr2, fArr);
        }
        return -100;
    }

    public int concatShootVideo(String str, String[] strArr, long[] jArr, boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeConcatShootVideo(j, str, strArr, jArr, z);
    }

    public String getClipInfoStringWithPath(int i, int i2, int i3, String str) {
        long j = this.mNative;
        if (j == 0) {
            return "";
        }
        return nativeGetClipInfoStringWithPath(j, i, i2, i3, str);
    }

    public int getImages(int[] iArr, int i, int i2, int i3) {
        return getImages(iArr, i, i2, false, i3);
    }

    public int initVideoEditorWithStruct(VECommonClipParam[] vECommonClipParamArr, VECommonClipParam[] vECommonClipParamArr2, String[] strArr, int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int iNativeInitVideoEditorWithStruct = nativeInitVideoEditorWithStruct(j, vECommonClipParamArr, vECommonClipParamArr2, strArr, i);
        if (iNativeInitVideoEditorWithStruct < 0) {
            return iNativeInitVideoEditorWithStruct;
        }
        this.mHostTrackIndex = iNativeInitVideoEditorWithStruct;
        return 0;
    }

    public int moveClip(int i, int i2, int i3, boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeMoveClip(j, i, i2, i3, z);
    }

    public int replaceClip(int i, int i2, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeReplaceClip(j, i, i2, vEClipSourceParam, vEClipTimelineParam);
    }

    public int seek(int i, int i2, int i3, int i4) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSeek(j, i, i2, i3, i4);
    }

    public int setCompileAudioDriver(String str, int i, int i2, String str2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetCompileAudioDriver(j, str, i, i2, str2);
    }

    public void setCompileSoftwareEncodeOptions(int i, long j, int i2, int i3) {
        setOption(0, "CompileSoftwareCrf", i);
        setOption(0, "CompileSoftwareMaxrate", j);
        setOption(0, "CompileSoftwarePreset", i2);
        setOption(0, "CompileSoftwareQp", i3);
    }

    public void setCrop(int i, int i2, int i3, int i4) {
        setOption(1, new String[]{"engine crop x", "engine crop y", "engine crop width", "engine crop height"}, new long[]{i, i2, i3, i4});
    }

    public void setImageResizeinfo(int i, int i2, int i3, int i4) {
        if (i > 0) {
            setOption(0, "image_load_extend_width", i);
        }
        if (i2 > 0) {
            setOption(0, "image_load_extend_height", i2);
        }
        setOption(0, "image_resize_fill_mode", i3);
        setOption(0, "image_resize_algorithm", i4);
    }

    public int setKeyFrameParam(int i, int i2, int i3, String str) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetKeyFrameParam(j, i, i2, i3, str);
    }

    public int setTrackMinMaxDuration(int i, int i2, int i3, int i4) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetTrackMinMaxDuration(j, i, i2, i3, i4);
    }

    public void setViewPort(int i, int i2, int i3, int i4) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetViewPort(j, i, i2, i3, i4);
    }

    public int updateClipsSourceParam(int i, int i2, int[] iArr, VEClipSourceParam[] vEClipSourceParamArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateClipsSourceParam(j, i, i2, iArr, vEClipSourceParamArr);
    }

    public int updateClipsTimelineParam(int i, int i2, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateClipsTimelineParam(j, i, i2, iArr, vEClipTimelineParamArr);
    }

    public int updateFilterTime(int i, int i2, int i3, int i4) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateFilterTime(j, i, i2, i3, i4);
    }

    public int updateMultiComposerNodes(int i, String[] strArr, String[] strArr2, float[] fArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateMultiComposerNodes(j, i, strArr, strArr2, fArr);
    }

    public void updateResolution(int i, int i2, int i3, int i4) {
        setOption(1, new String[]{"engine preivew width", "engine preivew height", "engine preivew width percent", "engine preivew height percent"}, new long[]{i, i2, i3, i4});
    }

    public int updateTrackFilterDuration(int i, int i2, boolean z, long j) {
        long j2 = this.mNative;
        if (j2 == 0) {
            return -112;
        }
        return nativeUpdateTrackFilterDuration(j2, i, i2, z, j);
    }

    public int getImages(int[] iArr, int i, int i2, boolean z, int i3) {
        return nativeGetImages(this.mNative, iArr, i, i2, z, i3);
    }

    public int initAudioEditor(String str, String[] strArr, int[] iArr, int[] iArr2, float[] fArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int iNativeInitAudioEditor = nativeInitAudioEditor(j, str, strArr, iArr, iArr2, fArr);
        if (iNativeInitAudioEditor < 0) {
            return iNativeInitAudioEditor;
        }
        this.mHostTrackIndex = iNativeInitAudioEditor;
        return 0;
    }

    public int insertClip(int i, int i2, int i3, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeInsertClip(j, i, i2, i3, vEClipSourceParam, vEClipTimelineParam);
    }

    public int preprocessAudioTrackForFilter(int i, int i2, String str, byte[] bArr, long[] jArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativePreprocessAudioTrackForFilter(j, i, i2, str, bArr, jArr);
    }

    public int replaceComposerNodesWithTag(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeReplaceComposerNodesWithTag(j, strArr, i, strArr2, i2, strArr3);
    }

    public int seekWithTolerance(int i, int i2, int i3, int i4, int i5) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSeekWithTolerance(j, i, i2, i3, i4, i5);
    }

    public int setClipAttr(int i, int i2, int i3, String str, String str2) {
        return nativeSetClipAttr(this.mNative, i, i2, i3, str, str2);
    }

    public int updateScene(String[] strArr, int[] iArr, int[] iArr2, boolean[] zArr, String[] strArr2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int iNativeUpdateSceneLoadCache = nativeUpdateSceneLoadCache(j, strArr, iArr, iArr2, zArr, strArr2);
        if (iNativeUpdateSceneLoadCache < 0) {
            return iNativeUpdateSceneLoadCache;
        }
        this.mHostTrackIndex = iNativeUpdateSceneLoadCache;
        return 0;
    }

    public int addAudioTrack(String str, int i, int i2, int i3, int i4, boolean z) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeAddAudioTrack(this.mNative, str, i, i2, i3, i4, z);
    }

    public int[] addFilters(int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        return addFilters(iArr, strArr, iArr2, iArr3, iArr4, iArr5, null);
    }

    public int initVideoEditor(String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int iNativeInitVideoEditor = nativeInitVideoEditor(j, str, strArr, strArr2, strArr3, strArr4, i);
        if (iNativeInitVideoEditor < 0) {
            return iNativeInitVideoEditor;
        }
        this.mHostTrackIndex = iNativeInitVideoEditor;
        return 0;
    }

    public int addExternalVideoTrack(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeAddSubVideoTrack(j, strArr, strArr2, iArr, iArr2, iArr3, iArr4, i);
    }

    public int[] addFilters(int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6) {
        long j = this.mNative;
        if (j == 0) {
            return new int[]{-1};
        }
        return nativeAddFilters(j, iArr, strArr, iArr2, iArr3, iArr4, iArr5, iArr6);
    }

    public int beginAudioExtendToFile(String str, String str2, String str3, float f, float f2, float f3, C1DOM c1dom) {
        if (this.mNative == 0) {
            return -112;
        }
        setAudioExtendToFileCallback(new InterfaceC2185781Aga() { // from class: X.1DOk
        });
        return nativeBeginAudioExtendToFile(this.mNative, str, str2, str3, f, f2, f3);
    }

    public void setDisplayState(float f, float f2, float f3, float f4, int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return;
        }
        nativeSetDisplayState(j, f, f2, f3, f4, i, i2, i3);
    }

    public int updateAudioTrack(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        if (i < 0) {
            return -100;
        }
        return nativeUpdateAudioTrack(j, i, i2, i3, i4, i5, z, z2);
    }

    public int addAudioTrack(String str, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeAddAudioTrack2(this.mNative, str, i, i2, i3, i4, z, i5, i6);
    }

    public int addWaterMark(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, double d, double d2, double d3, double d4) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int i = this.mHostTrackIndex;
        if (i < 0) {
            return -105;
        }
        return nativeAddSubTrack(j, strArr, strArr2, iArr, iArr2, iArr, iArr2, d, d2, d3, d4, 5, i);
    }

    public int initVideoEditor(String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i, boolean[] zArr, String[] strArr5) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int iNativeInitVideoEditorLoadCache = nativeInitVideoEditorLoadCache(j, str, strArr, strArr2, strArr3, strArr4, i, zArr, strArr5);
        if (iNativeInitVideoEditorLoadCache < 0) {
            return iNativeInitVideoEditorLoadCache;
        }
        this.mHostTrackIndex = iNativeInitVideoEditorLoadCache;
        return 0;
    }

    public int updateAudioTrack(int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7) {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        if (i < 0) {
            return -100;
        }
        return nativeUpdateAudioTrack2(j, i, i2, i3, i4, i5, z, i6, i7);
    }

    public int addAudioTrack(String str, String str2, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeAddAudioTrackWithNeedPrepare(this.mNative, str, str2, i, i2, i3, i4, z, z2);
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, int i) {
        return initVideoEditor2(strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr, fArr, null, i, false);
    }

    public int initImageEditor(Bitmap[] bitmapArr, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2, String[][] strArr3, float[] fArr, int[] iArr5, int i) {
        float[] fArr2 = fArr;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr2 == null) {
            fArr2 = new float[bitmapArr.length];
            Arrays.fill(fArr2, 1.0f);
        }
        int iNativeInitImageEditor = nativeInitImageEditor(this.mNative, bitmapArr, iArr, iArr2, strArr, iArr3, iArr4, strArr2, strArr3, fArr2, iArr5, i);
        if (iNativeInitImageEditor < 0) {
            return iNativeInitImageEditor;
        }
        this.mHostTrackIndex = iNativeInitImageEditor;
        return 0;
    }

    public int changeResWithEffect(boolean[] zArr, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, int[] iArr5) {
        float[] fArr3 = fArr2;
        float[] fArr4 = fArr;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr4 == null) {
            fArr4 = new float[strArr.length];
            Arrays.fill(fArr4, 1.0f);
        }
        if (fArr3 == null && strArr3 != null) {
            fArr3 = new float[strArr3.length];
            Arrays.fill(fArr3, 1.0f);
        }
        return nativeChangeResWithEffect(this.mNative, zArr, strArr, strArr2, iArr, iArr2, fArr4, strArr3, strArr4, iArr3, iArr4, fArr3, iArr5);
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, int i, boolean[] zArr, String[] strArr5) {
        return initVideoEditor2(strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr, fArr, null, i, false, zArr, strArr5);
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i, boolean z) {
        float[] fArr3 = fArr2;
        float[] fArr4 = fArr;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr4 == null) {
            fArr4 = new float[strArr.length];
            Arrays.fill(fArr4, 1.0f);
        }
        if (fArr3 == null && strArr2 != null) {
            fArr3 = new float[strArr2.length];
            Arrays.fill(fArr3, 1.0f);
        }
        int iNativeInitVideoEditor2 = nativeInitVideoEditor2(this.mNative, strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr4, fArr3, iArr5, i, z);
        if (iNativeInitVideoEditor2 < 0) {
            return iNativeInitVideoEditor2;
        }
        this.mHostTrackIndex = iNativeInitVideoEditor2;
        return 0;
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i, boolean z, boolean[] zArr, String[] strArr5) {
        float[] fArr3 = fArr2;
        float[] fArr4 = fArr;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr4 == null) {
            fArr4 = new float[strArr.length];
            Arrays.fill(fArr4, 1.0f);
        }
        if (fArr3 == null && strArr2 != null) {
            fArr3 = new float[strArr2.length];
            Arrays.fill(fArr3, 1.0f);
        }
        int iNativeInitVideoEditor2LoadCache = nativeInitVideoEditor2LoadCache(this.mNative, strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr4, fArr3, iArr5, i, z, zArr, strArr5);
        if (iNativeInitVideoEditor2LoadCache < 0) {
            return iNativeInitVideoEditor2LoadCache;
        }
        this.mHostTrackIndex = iNativeInitVideoEditor2LoadCache;
        return 0;
    }

    public int initVideoEditorWithCanvas(String[] strArr, Bitmap[] bitmapArr, int i, String[] strArr2, int[] iArr, int[] iArr2, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, String[] strArr5, int[] iArr5, int[] iArr6, String[][] strArr6, float[] fArr, int i2, VESize[] vESizeArr) {
        float[] fArr2 = fArr;
        if (this.mNative == 0) {
            return -112;
        }
        if (i <= 0) {
            return -100;
        }
        if (fArr2 == null) {
            fArr2 = new float[i];
            Arrays.fill(fArr2, 1.0f);
        }
        int iNativeInitVideoEditorWithCanvas = nativeInitVideoEditorWithCanvas(this.mNative, strArr, bitmapArr, strArr2, iArr, iArr2, strArr3, strArr4, iArr3, iArr4, strArr5, iArr5, iArr6, strArr6, fArr2, i2, vESizeArr);
        if (iNativeInitVideoEditorWithCanvas < 0) {
            return iNativeInitVideoEditorWithCanvas;
        }
        this.mHostTrackIndex = iNativeInitVideoEditorWithCanvas;
        return 0;
    }
}
