package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEMVAudioInfo {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEMVAudioInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getPath() {
        return NLEMediaJniJNI.NLEMVAudioInfo_path_get(this.swigCPtr, this);
    }

    public long getTrimIn() {
        return NLEMediaJniJNI.NLEMVAudioInfo_trimIn_get(this.swigCPtr, this);
    }

    public long getTrimOut() {
        return NLEMediaJniJNI.NLEMVAudioInfo_trimOut_get(this.swigCPtr, this);
    }

    public NLEMVAudioInfo() {
        this(NLEMediaJniJNI.new_NLEMVAudioInfo(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMVAudioInfo nLEMVAudioInfo) {
        if (nLEMVAudioInfo == null) {
            return 0L;
        }
        return nLEMVAudioInfo.swigCPtr;
    }

    public void setPath(String str) {
        NLEMediaJniJNI.NLEMVAudioInfo_path_set(this.swigCPtr, this, str);
    }

    public void setTrimIn(long j) {
        NLEMediaJniJNI.NLEMVAudioInfo_trimIn_set(this.swigCPtr, this, j);
    }

    public void setTrimOut(long j) {
        NLEMediaJniJNI.NLEMVAudioInfo_trimOut_set(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMVAudioInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
