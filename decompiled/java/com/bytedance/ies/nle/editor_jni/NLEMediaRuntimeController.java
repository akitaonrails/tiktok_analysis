package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public class NLEMediaRuntimeController {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEMediaRuntimeController(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int cancelGetVideoFrames() {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_cancelGetVideoFrames(this.swigCPtr, this);
    }

    public void cancelPreprocessI2V() {
        NLEMediaPublicJniJNI.NLEMediaRuntimeController_cancelPreprocessI2V(this.swigCPtr, this);
    }

    public void clearAndroidImageHolder() {
        NLEMediaPublicJniJNI.NLEMediaRuntimeController_clearAndroidImageHolder(this.swigCPtr, this);
    }

    public PairIntInt getCanvasSize() {
        return new PairIntInt(NLEMediaPublicJniJNI.NLEMediaRuntimeController_getCanvasSize(this.swigCPtr, this), true);
    }

    public int getEffectHandle() {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_getEffectHandle(this.swigCPtr, this);
    }

    public PairIntInt getInitSize() {
        return new PairIntInt(NLEMediaPublicJniJNI.NLEMediaRuntimeController_getInitSize__SWIG_0(this.swigCPtr, this), true);
    }

    public float getPlayFps() {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_getPlayFps(this.swigCPtr, this);
    }

    public NLEPlayerPreviewMode getPreviewFillMode() {
        return NLEPlayerPreviewMode.swigToEnum(NLEMediaPublicJniJNI.NLEMediaRuntimeController_getPreviewFillMode(this.swigCPtr, this));
    }

    public String getUniqueKey() {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_getUniqueKey(this.swigCPtr, this);
    }

    public int getVEColorSpace() {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_getVEColorSpace(this.swigCPtr, this);
    }

    public PairIntInt getVideoResolution() {
        return new PairIntInt(NLEMediaPublicJniJNI.NLEMediaRuntimeController_getVideoResolution(this.swigCPtr, this), true);
    }

    public boolean isUseFilterProcess() {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_isUseFilterProcess(this.swigCPtr, this);
    }

    public int unlockSeekVideoClip() {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_unlockSeekVideoClip(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaRuntimeController nLEMediaRuntimeController) {
        if (nLEMediaRuntimeController == null) {
            return 0L;
        }
        return nLEMediaRuntimeController.swigCPtr;
    }

    public int enableWatermarkMetadata(boolean z) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_enableWatermarkMetadata(this.swigCPtr, this, z);
    }

    public String findVEParentIdByNLESlotUUID(String str) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_findVEParentIdByNLESlotUUID(this.swigCPtr, this, str);
    }

    public int getDisplayImage(Object obj) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_getDisplayImage(this.swigCPtr, this, obj);
    }

    public int getHighLightResult(VecLongLong vecLongLong) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_getHighLightResult(this.swigCPtr, this, VecLongLong.getCPtr(vecLongLong), vecLongLong);
    }

    public MapStrInt getHighLightResultByPts(int i) {
        return new MapStrInt(NLEMediaPublicJniJNI.NLEMediaRuntimeController_getHighLightResultByPts(this.swigCPtr, this, i), true);
    }

    public String getMetadata(String str) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_getMetadata(this.swigCPtr, this, str);
    }

    public int lockSeekVideoClip(String str) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_lockSeekVideoClip(this.swigCPtr, this, str);
    }

    public double mapOriginalPositionToTimeEffectPosition(double d) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_mapOriginalPositionToTimeEffectPosition__SWIG_1(this.swigCPtr, this, d);
    }

    public double mapTimeEffectPositionToOriginalPosition(double d) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_mapTimeEffectPositionToOriginalPosition(this.swigCPtr, this, d);
    }

    public void setBackgroundColor(int i) {
        NLEMediaPublicJniJNI.NLEMediaRuntimeController_setBackgroundColor(this.swigCPtr, this, i);
    }

    public int setCanvasColor(String str) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_setCanvasColor(this.swigCPtr, this, str);
    }

    public void setEncoderListener(NLEEncodeListenerWrapper nLEEncodeListenerWrapper) {
        NLEMediaPublicJniJNI.NLEMediaRuntimeController_setEncoderListener(this.swigCPtr, this, NLEEncodeListenerWrapper.getCPtr(nLEEncodeListenerWrapper), nLEEncodeListenerWrapper);
    }

    public int setHeightWidthRatio(float f) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_setHeightWidthRatio(this.swigCPtr, this, f);
    }

    public int setMetadata(MapStrStr mapStrStr) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_setMetadata(this.swigCPtr, this, MapStrStr.getCPtr(mapStrStr), mapStrStr);
    }

    public void setOnCompileTargetFileInfoPredictListener(NLEListenerCompileTargetFileInfoPredictWrapper nLEListenerCompileTargetFileInfoPredictWrapper) {
        NLEMediaPublicJniJNI.NLEMediaRuntimeController_setOnCompileTargetFileInfoPredictListener(this.swigCPtr, this, NLEListenerCompileTargetFileInfoPredictWrapper.getCPtr(nLEListenerCompileTargetFileInfoPredictWrapper), nLEListenerCompileTargetFileInfoPredictWrapper);
    }

    public void setPlayFps(float f) {
        NLEMediaPublicJniJNI.NLEMediaRuntimeController_setPlayFps(this.swigCPtr, this, f);
    }

    public NLEError setPreviewFillMode(NLEPlayerPreviewMode nLEPlayerPreviewMode) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEMediaRuntimeController_setPreviewFillMode(this.swigCPtr, this, nLEPlayerPreviewMode.swigValue()));
    }

    public void setPreviewOffScreen(boolean z) {
        NLEMediaPublicJniJNI.NLEMediaRuntimeController_setPreviewOffScreen(this.swigCPtr, this, z);
    }

    public int setPreviewSurfaceTexDesc(String str) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_setPreviewSurfaceTexDesc__SWIG_1(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMediaRuntimeController(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void addAndroidImageHolder(String str, Object obj) {
        NLEMediaPublicJniJNI.NLEMediaRuntimeController_addAndroidImageHolder(this.swigCPtr, this, str, obj);
    }

    public int addMetadata(String str, String str2) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_addMetadata(this.swigCPtr, this, str, str2);
    }

    public int getCurrDecodeImage(Object obj, String str) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_getCurrDecodeImage(this.swigCPtr, this, obj, str);
    }

    public String getFileInfo(String str, String str2) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_getFileInfo(this.swigCPtr, this, str, str2);
    }

    public PairIntInt getInitSize(int i, int i2) {
        return new PairIntInt(NLEMediaPublicJniJNI.NLEMediaRuntimeController_getInitSize__SWIG_1(this.swigCPtr, this, i, i2), true);
    }

    public String getKeyFrameParam(String str, long j) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_getKeyFrameParam(this.swigCPtr, this, str, j);
    }

    public double mapOriginalPositionToTimeEffectPosition(double d, int i) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_mapOriginalPositionToTimeEffectPosition__SWIG_0(this.swigCPtr, this, d, i);
    }

    public int setCanvasMinDuration(long j, boolean z) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_setCanvasMinDuration(this.swigCPtr, this, j, z);
    }

    public void setCanvasSize(int i, int i2) {
        NLEMediaPublicJniJNI.NLEMediaRuntimeController_setCanvasSize(this.swigCPtr, this, i, i2);
    }

    public int setMaxWidthAndHeight(long j, long j2) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_setMaxWidthAndHeight(this.swigCPtr, this, j, j2);
    }

    public int setPreviewSurfaceImage(Object obj, boolean z) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_setPreviewSurfaceImage(this.swigCPtr, this, obj, z);
    }

    public int setPreviewSurfaceTexDesc(String str, boolean z) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_setPreviewSurfaceTexDesc__SWIG_0(this.swigCPtr, this, str, z);
    }

    public void setMagnifierDisplayState(float f, float f2, float f3) {
        NLEMediaPublicJniJNI.NLEMediaRuntimeController_setMagnifierDisplayState(this.swigCPtr, this, f, f2, f3);
    }

    public String preprocessI2V(String str, String str2, long j, int i) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_preprocessI2V(this.swigCPtr, this, str, str2, j, i);
    }

    public int sendEffectMsg(int i, int i2, int i3, String str) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_sendEffectMsg(this.swigCPtr, this, i, i2, i3, str);
    }

    public void setDisplayPos(int i, int i2, int i3, int i4) {
        NLEMediaPublicJniJNI.NLEMediaRuntimeController_setDisplayPos(this.swigCPtr, this, i, i2, i3, i4);
    }

    public int getImages(VecLongLong vecLongLong, int i, int i2, NLE_GET_FRAME_FLAGS nle_get_frame_flags, NLEListenerGetImageWrapper nLEListenerGetImageWrapper) {
        return NLEMediaPublicJniJNI.NLEMediaRuntimeController_getImages(this.swigCPtr, this, VecLongLong.getCPtr(vecLongLong), vecLongLong, i, i2, nle_get_frame_flags.swigValue(), NLEListenerGetImageWrapper.getCPtr(nLEListenerGetImageWrapper), nLEListenerGetImageWrapper);
    }

    public void setDisplayState(float f, float f2, float f3, int i, int i2) {
        NLEMediaPublicJniJNI.NLEMediaRuntimeController_setDisplayState(this.swigCPtr, this, f, f2, f3, i, i2);
    }
}
