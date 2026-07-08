package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEAudioBeatTracking {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEAudioBeatTracking(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void notifyStop() {
        NLEMediaPublicJniJNI.NLEAudioBeatTracking_notifyStop(this.swigCPtr, this);
    }

    public NLEAudioBeatTracking() {
        this(NLEMediaPublicJniJNI.new_NLEAudioBeatTracking(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEAudioBeatTracking nLEAudioBeatTracking) {
        if (nLEAudioBeatTracking == null) {
            return 0L;
        }
        return nLEAudioBeatTracking.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEAudioBeatTracking(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public int process(NLEBeatTrackingParam nLEBeatTrackingParam, VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo) {
        return NLEMediaPublicJniJNI.NLEAudioBeatTracking_process(this.swigCPtr, this, NLEBeatTrackingParam.getCPtr(nLEBeatTrackingParam), nLEBeatTrackingParam, VecNLEBeatTrackingInfo.getCPtr(vecNLEBeatTrackingInfo), vecNLEBeatTrackingInfo);
    }
}
