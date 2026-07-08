package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEBeatTrackingInfo {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEBeatTrackingInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int getBeat() {
        return NLEMediaJniJNI.NLEBeatTrackingInfo_beat_get(this.swigCPtr, this);
    }

    public long getOffset() {
        return NLEMediaJniJNI.NLEBeatTrackingInfo_offset_get(this.swigCPtr, this);
    }

    public NLEBeatTrackingInfo() {
        this(NLEMediaJniJNI.new_NLEBeatTrackingInfo(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEBeatTrackingInfo nLEBeatTrackingInfo) {
        if (nLEBeatTrackingInfo == null) {
            return 0L;
        }
        return nLEBeatTrackingInfo.swigCPtr;
    }

    public void setBeat(int i) {
        NLEMediaJniJNI.NLEBeatTrackingInfo_beat_set(this.swigCPtr, this, i);
    }

    public void setOffset(long j) {
        NLEMediaJniJNI.NLEBeatTrackingInfo_offset_set(this.swigCPtr, this, j);
    }

    public NLEBeatTrackingInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
