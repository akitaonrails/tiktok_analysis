package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class KeyFrameCalcalator {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_KeyFrameCalcalator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public KeyFrameCalcalator() {
        this(NLEMediaPublicJniJNI.new_KeyFrameCalcalator(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(KeyFrameCalcalator keyFrameCalcalator) {
        if (keyFrameCalcalator == null) {
            return 0L;
        }
        return keyFrameCalcalator.swigCPtr;
    }

    public KeyFrameCalcalator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static void refreshKeyframeInfo(NLETrackSlot nLETrackSlot, long j) {
        NLEMediaPublicJniJNI.KeyFrameCalcalator_refreshKeyframeInfo(NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, j);
    }
}
