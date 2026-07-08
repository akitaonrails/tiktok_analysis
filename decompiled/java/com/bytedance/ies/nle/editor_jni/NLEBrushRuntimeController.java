package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEBrushRuntimeController {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEBrushRuntimeController(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEBrushRuntimeController nLEBrushRuntimeController) {
        if (nLEBrushRuntimeController == null) {
            return 0L;
        }
        return nLEBrushRuntimeController.swigCPtr;
    }

    public int begin2DBrush(String str) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_begin2DBrush(this.swigCPtr, this, str);
    }

    public int clear2DBrush(String str) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_clear2DBrush(this.swigCPtr, this, str);
    }

    public int end2DBrush(String str) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_end2DBrush(this.swigCPtr, this, str);
    }

    public int redo2DBrush(String str) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_redo2DBrush(this.swigCPtr, this, str);
    }

    public int reverse2DBrush(String str) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_reverse2DBrush(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public int undo2DBrush(String str) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_undo2DBrush(this.swigCPtr, this, str);
    }

    public NLEBrushRuntimeController(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public NLEBrushStickerState getBrushStickerOutState(String str, boolean z) {
        long jNLEBrushRuntimeController_getBrushStickerOutState = NLEMediaPublicJniJNI.NLEBrushRuntimeController_getBrushStickerOutState(this.swigCPtr, this, str, z);
        if (jNLEBrushRuntimeController_getBrushStickerOutState == 0) {
            return null;
        }
        return new NLEBrushStickerState(jNLEBrushRuntimeController_getBrushStickerOutState, true);
    }

    public int setBrushStickerOutStateCallback(String str, NLEBrushStateCallbackWrapper nLEBrushStateCallbackWrapper) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_setBrushStickerOutStateCallback(this.swigCPtr, this, str, NLEBrushStateCallbackWrapper.getCPtr(nLEBrushStateCallbackWrapper), nLEBrushStateCallbackWrapper);
    }

    public int addBrushStickerStroke(String str, Object obj, NLERectF nLERectF) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_addBrushStickerStroke__SWIG_0(this.swigCPtr, this, str, obj, NLERectF.getCPtr(nLERectF), nLERectF);
    }

    public int saveBrushStickerContext(String str, String str2, NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_saveBrushStickerContext(this.swigCPtr, this, str, str2, NLEBrushSaveCallbackWrapper.getCPtr(nLEBrushSaveCallbackWrapper), nLEBrushSaveCallbackWrapper);
    }

    public int saveStickerBrushMask(String str, String str2, NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_saveStickerBrushMask(this.swigCPtr, this, str, str2, NLEBrushSaveCallbackWrapper.getCPtr(nLEBrushSaveCallbackWrapper), nLEBrushSaveCallbackWrapper);
    }

    public int saveStickerBrushToPng(String str, String str2, NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_saveStickerBrushToPng(this.swigCPtr, this, str, str2, NLEBrushSaveCallbackWrapper.getCPtr(nLEBrushSaveCallbackWrapper), nLEBrushSaveCallbackWrapper);
    }

    public int addBrushStickerStroke(String str, String str2, String str3, long j) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_addBrushStickerStroke__SWIG_1(this.swigCPtr, this, str, str2, str3, j);
    }

    public int processPanEvent(String str, float f, float f2, float f3, float f4, float f5) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_processPanEvent(this.swigCPtr, this, str, f, f2, f3, f4, f5);
    }

    public int processTouchDownEvent(String str, float f, float f2, float f3, float f4, float f5) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_processTouchDownEvent(this.swigCPtr, this, str, f, f2, f3, f4, f5);
    }

    public int processTouchUpEvent(String str, float f, float f2, float f3, float f4, float f5) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_processTouchUpEvent(this.swigCPtr, this, str, f, f2, f3, f4, f5);
    }

    public int processTouchUpEvent2(String str, float f, float f2, float f3, float f4, float f5, boolean z) {
        return NLEMediaPublicJniJNI.NLEBrushRuntimeController_processTouchUpEvent2(this.swigCPtr, this, str, f, f2, f3, f4, f5, z);
    }
}
