package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEVideoSWEncodeSettings {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEVideoSWEncodeSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLE_ENCODE_BITRATE_MODE getMBitrateMode() {
        return NLE_ENCODE_BITRATE_MODE.swigToEnum(NLEMediaJniJNI.NLEVideoSWEncodeSettings_mBitrateMode_get(this.swigCPtr, this));
    }

    public int getMBps() {
        return NLEMediaJniJNI.NLEVideoSWEncodeSettings_mBps_get(this.swigCPtr, this);
    }

    public int getMCrf() {
        return NLEMediaJniJNI.NLEVideoSWEncodeSettings_mCrf_get(this.swigCPtr, this);
    }

    public int getMGop() {
        return NLEMediaJniJNI.NLEVideoSWEncodeSettings_mGop_get(this.swigCPtr, this);
    }

    public long getMMaxRate() {
        return NLEMediaJniJNI.NLEVideoSWEncodeSettings_mMaxRate_get(this.swigCPtr, this);
    }

    public NLE_ENCODE_PRESET getMPreset() {
        return NLE_ENCODE_PRESET.swigToEnum(NLEMediaJniJNI.NLEVideoSWEncodeSettings_mPreset_get(this.swigCPtr, this));
    }

    public NLE_ENCODE_PROFILE getMProfile() {
        return NLE_ENCODE_PROFILE.swigToEnum(NLEMediaJniJNI.NLEVideoSWEncodeSettings_mProfile_get(this.swigCPtr, this));
    }

    public double getMQPOffset() {
        return NLEMediaJniJNI.NLEVideoSWEncodeSettings_mQPOffset_get(this.swigCPtr, this);
    }

    public NLEVideoSWEncodeSettings() {
        this(NLEMediaJniJNI.new_NLEVideoSWEncodeSettings(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings) {
        if (nLEVideoSWEncodeSettings == null) {
            return 0L;
        }
        return nLEVideoSWEncodeSettings.swigCPtr;
    }

    public void setMBitrateMode(NLE_ENCODE_BITRATE_MODE nle_encode_bitrate_mode) {
        NLEMediaJniJNI.NLEVideoSWEncodeSettings_mBitrateMode_set(this.swigCPtr, this, nle_encode_bitrate_mode.swigValue());
    }

    public void setMBps(int i) {
        NLEMediaJniJNI.NLEVideoSWEncodeSettings_mBps_set(this.swigCPtr, this, i);
    }

    public void setMCrf(int i) {
        NLEMediaJniJNI.NLEVideoSWEncodeSettings_mCrf_set(this.swigCPtr, this, i);
    }

    public void setMGop(int i) {
        NLEMediaJniJNI.NLEVideoSWEncodeSettings_mGop_set(this.swigCPtr, this, i);
    }

    public void setMMaxRate(long j) {
        NLEMediaJniJNI.NLEVideoSWEncodeSettings_mMaxRate_set(this.swigCPtr, this, j);
    }

    public void setMPreset(NLE_ENCODE_PRESET nle_encode_preset) {
        NLEMediaJniJNI.NLEVideoSWEncodeSettings_mPreset_set(this.swigCPtr, this, nle_encode_preset.swigValue());
    }

    public void setMProfile(NLE_ENCODE_PROFILE nle_encode_profile) {
        NLEMediaJniJNI.NLEVideoSWEncodeSettings_mProfile_set(this.swigCPtr, this, nle_encode_profile.swigValue());
    }

    public void setMQPOffset(double d) {
        NLEMediaJniJNI.NLEVideoSWEncodeSettings_mQPOffset_set(this.swigCPtr, this, d);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEVideoSWEncodeSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
