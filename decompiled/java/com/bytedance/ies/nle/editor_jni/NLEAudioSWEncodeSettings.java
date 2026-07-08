package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEAudioSWEncodeSettings {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEAudioSWEncodeSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public long getMBitrate() {
        return NLEMediaJniJNI.NLEAudioSWEncodeSettings_mBitrate_get(this.swigCPtr, this);
    }

    public NLEAudioSWEncodeSettings() {
        this(NLEMediaJniJNI.new_NLEAudioSWEncodeSettings(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEAudioSWEncodeSettings nLEAudioSWEncodeSettings) {
        if (nLEAudioSWEncodeSettings == null) {
            return 0L;
        }
        return nLEAudioSWEncodeSettings.swigCPtr;
    }

    public void setMBitrate(long j) {
        NLEMediaJniJNI.NLEAudioSWEncodeSettings_mBitrate_set(this.swigCPtr, this, j);
    }

    public NLEAudioSWEncodeSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
