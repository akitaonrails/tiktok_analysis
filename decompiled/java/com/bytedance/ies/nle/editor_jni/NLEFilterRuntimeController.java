package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public class NLEFilterRuntimeController {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEFilterRuntimeController(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int doLensOneKeyDetect() {
        return NLEMediaPublicJniJNI.NLEFilterRuntimeController_doLensOneKeyDetect(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEFilterRuntimeController nLEFilterRuntimeController) {
        if (nLEFilterRuntimeController == null) {
            return 0L;
        }
        return nLEFilterRuntimeController.swigCPtr;
    }

    public float getColorFilterIntensity(String str) {
        return NLEMediaPublicJniJNI.NLEFilterRuntimeController_getColorFilterIntensity(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEFilterRuntimeController(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public String getAmazingFilterParam(String str, String str2) {
        return NLEMediaPublicJniJNI.NLEFilterRuntimeController_getAmazingFilterParam(this.swigCPtr, this, str, str2);
    }

    public void updateMultiComposerNodesInSwing(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        NLEMediaPublicJniJNI.NLEFilterRuntimeController_updateMultiComposerNodesInSwing(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, NLETrackSlot.getCPtr(nLETrackSlot2), nLETrackSlot2);
    }

    public VecInt checkComposerNodeExclusion(String str, String str2, String str3) {
        return new VecInt(NLEMediaPublicJniJNI.NLEFilterRuntimeController_checkComposerNodeExclusion(this.swigCPtr, this, str, str2, str3), true);
    }
}
