package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public class NLEMediaSettingsController {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEMediaSettingsController(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int getPageMode() {
        return NLEMediaPublicJniJNI.NLEMediaSettingsController_getPageMode(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaSettingsController nLEMediaSettingsController) {
        if (nLEMediaSettingsController == null) {
            return 0L;
        }
        return nLEMediaSettingsController.swigCPtr;
    }

    public int enableEffect(boolean z) {
        return NLEMediaPublicJniJNI.NLEMediaSettingsController_enableEffect(this.swigCPtr, this, z);
    }

    public void enableHighSpeedForSingle(boolean z) {
        NLEMediaPublicJniJNI.NLEMediaSettingsController_enableHighSpeedForSingle(this.swigCPtr, this, z);
    }

    public void enableImageEditor(boolean z) {
        NLEMediaPublicJniJNI.NLEMediaSettingsController_enableImageEditor(this.swigCPtr, this, z);
    }

    public void enableSimpleProcessor(boolean z) {
        NLEMediaPublicJniJNI.NLEMediaSettingsController_enableSimpleProcessor(this.swigCPtr, this, z);
    }

    public void setAutoPrepare(boolean z) {
        NLEMediaPublicJniJNI.NLEMediaSettingsController_setAutoPrepare(this.swigCPtr, this, z);
    }

    public int setDestroyVersion(boolean z) {
        return NLEMediaPublicJniJNI.NLEMediaSettingsController_setDestroyVersion(this.swigCPtr, this, z);
    }

    public void setDldEnabled(boolean z) {
        NLEMediaPublicJniJNI.NLEMediaSettingsController_setDldEnabled(this.swigCPtr, this, z);
    }

    public void setDldThrVal(int i) {
        NLEMediaPublicJniJNI.NLEMediaSettingsController_setDldThrVal(this.swigCPtr, this, i);
    }

    public void setDleEnabled(boolean z) {
        NLEMediaPublicJniJNI.NLEMediaSettingsController_setDleEnabled(this.swigCPtr, this, z);
    }

    public void setDleEnabledPreview(boolean z) {
        NLEMediaPublicJniJNI.NLEMediaSettingsController_setDleEnabledPreview(this.swigCPtr, this, z);
    }

    public void setForceDetectForFirstFrameByClip(boolean z) {
        NLEMediaPublicJniJNI.NLEMediaSettingsController_setForceDetectForFirstFrameByClip(this.swigCPtr, this, z);
    }

    public void setLoopPlay(boolean z) {
        NLEMediaPublicJniJNI.NLEMediaSettingsController_setLoopPlay(this.swigCPtr, this, z);
    }

    public void setPageMode(int i) {
        NLEMediaPublicJniJNI.NLEMediaSettingsController_setPageMode(this.swigCPtr, this, i);
    }

    public int setPreviewFps(int i) {
        return NLEMediaPublicJniJNI.NLEMediaSettingsController_setPreviewFps__SWIG_1(this.swigCPtr, this, i);
    }

    public int setPreviewMaxFps(int i) {
        return NLEMediaPublicJniJNI.NLEMediaSettingsController_setPreviewMaxFps(this.swigCPtr, this, i);
    }

    public int setSrcMaxHWRatio(float f) {
        return NLEMediaPublicJniJNI.NLEMediaSettingsController_setSrcMaxHWRatio(this.swigCPtr, this, f);
    }

    public void setSurfaceReDraw(boolean z) {
        NLEMediaPublicJniJNI.NLEMediaSettingsController_setSurfaceReDraw(this.swigCPtr, this, z);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMediaSettingsController(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public int setPreviewFps(int i, boolean z) {
        return NLEMediaPublicJniJNI.NLEMediaSettingsController_setPreviewFps__SWIG_0(this.swigCPtr, this, i, z);
    }

    public int setDropFrameParam(boolean z, long j, int i) {
        return NLEMediaPublicJniJNI.NLEMediaSettingsController_setDropFrameParam(this.swigCPtr, this, z, j, i);
    }

    public void setImageResizeInfo(int i, int i2, NLEResFillMode nLEResFillMode, NLEResizeAlgorithm nLEResizeAlgorithm) {
        NLEMediaPublicJniJNI.NLEMediaSettingsController_setImageResizeInfo(this.swigCPtr, this, i, i2, nLEResFillMode.swigValue(), nLEResizeAlgorithm.swigValue());
    }
}
