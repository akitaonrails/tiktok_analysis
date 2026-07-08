package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEAudioHWEncodeSettings {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEAudioHWEncodeSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public long getMBitrate() {
        return NLEMediaJniJNI.NLEAudioHWEncodeSettings_mBitrate_get(this.swigCPtr, this);
    }

    public NLEAudioHWEncodeSettings() {
        this(NLEMediaJniJNI.new_NLEAudioHWEncodeSettings(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEAudioHWEncodeSettings nLEAudioHWEncodeSettings) {
        if (nLEAudioHWEncodeSettings == null) {
            return 0L;
        }
        return nLEAudioHWEncodeSettings.swigCPtr;
    }

    public void setMBitrate(long j) {
        NLEMediaJniJNI.NLEAudioHWEncodeSettings_mBitrate_set(this.swigCPtr, this, j);
    }

    public NLEAudioHWEncodeSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
