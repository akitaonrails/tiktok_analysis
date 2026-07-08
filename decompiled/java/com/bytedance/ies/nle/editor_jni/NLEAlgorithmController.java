package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public class NLEAlgorithmController {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEAlgorithmController(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int genRandomSolve() {
        return NLEMediaPublicJniJNI.NLEAlgorithmController_genRandomSolve(this.swigCPtr, this);
    }

    public int genSmartCutting() {
        return NLEMediaPublicJniJNI.NLEAlgorithmController_genSmartCutting(this.swigCPtr, this);
    }

    public VecNLEClipAlgorithmParam getAllVideoRangeData() {
        return new VecNLEClipAlgorithmParam(NLEMediaPublicJniJNI.NLEAlgorithmController_getAllVideoRangeData(this.swigCPtr, this), true);
    }

    public int initBingoAlgorithm() {
        return NLEMediaPublicJniJNI.NLEAlgorithmController_initBingoAlgorithm(this.swigCPtr, this);
    }

    public int reInitSmartAlgorithmIfPossible() {
        return NLEMediaPublicJniJNI.NLEAlgorithmController_reInitSmartAlgorithmIfPossible(this.swigCPtr, this);
    }

    public int updateAlgorithmFromNormal() {
        return NLEMediaPublicJniJNI.NLEAlgorithmController_updateAlgorithmFromNormal(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEAlgorithmController nLEAlgorithmController) {
        if (nLEAlgorithmController == null) {
            return 0L;
        }
        return nLEAlgorithmController.swigCPtr;
    }

    public int cancelGenVideoFrame(int i) {
        return NLEMediaPublicJniJNI.NLEAlgorithmController_cancelGenVideoFrame(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEAlgorithmController(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public int beginGenVideoFrames(int i, NLEAlgorithmCallbackWrapper nLEAlgorithmCallbackWrapper) {
        return NLEMediaPublicJniJNI.NLEAlgorithmController_beginGenVideoFrames(this.swigCPtr, this, i, NLEAlgorithmCallbackWrapper.getCPtr(nLEAlgorithmCallbackWrapper), nLEAlgorithmCallbackWrapper);
    }

    public int initSmartAlgorithm(long j, long j2, NLEAlgorithmPath nLEAlgorithmPath) {
        return NLEMediaPublicJniJNI.NLEAlgorithmController_initSmartAlgorithm(this.swigCPtr, this, j, j2, NLEAlgorithmPath.getCPtr(nLEAlgorithmPath), nLEAlgorithmPath);
    }

    public int setMusicAndResult(String str, int i, int i2, NLEAlgorithmPath nLEAlgorithmPath) {
        return NLEMediaPublicJniJNI.NLEAlgorithmController_setMusicAndResult(this.swigCPtr, this, str, i, i2, NLEAlgorithmPath.getCPtr(nLEAlgorithmPath), nLEAlgorithmPath);
    }
}
