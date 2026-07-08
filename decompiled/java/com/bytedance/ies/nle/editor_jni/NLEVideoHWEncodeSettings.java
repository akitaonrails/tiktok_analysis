package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEVideoHWEncodeSettings {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEVideoHWEncodeSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public float getM2K_bitrate_ratio() {
        return NLEMediaJniJNI.NLEVideoHWEncodeSettings_m2K_bitrate_ratio_get(this.swigCPtr, this);
    }

    public float getM4K_bitrate_ratio() {
        return NLEMediaJniJNI.NLEVideoHWEncodeSettings_m4K_bitrate_ratio_get(this.swigCPtr, this);
    }

    public long getMBitrate() {
        return NLEMediaJniJNI.NLEVideoHWEncodeSettings_mBitrate_get(this.swigCPtr, this);
    }

    public int getMCodecType() {
        return NLEMediaJniJNI.NLEVideoHWEncodeSettings_mCodecType_get(this.swigCPtr, this);
    }

    public float getMFullHd_bitrate_ratio() {
        return NLEMediaJniJNI.NLEVideoHWEncodeSettings_mFullHd_bitrate_ratio_get(this.swigCPtr, this);
    }

    public int getMGop() {
        return NLEMediaJniJNI.NLEVideoHWEncodeSettings_mGop_get(this.swigCPtr, this);
    }

    public float getMH_fps_bitrate_ratio() {
        return NLEMediaJniJNI.NLEVideoHWEncodeSettings_mH_fps_bitrate_ratio_get(this.swigCPtr, this);
    }

    public float getMHp_bitrate_ratio() {
        return NLEMediaJniJNI.NLEVideoHWEncodeSettings_mHp_bitrate_ratio_get(this.swigCPtr, this);
    }

    public NLE_ENCODE_PROFILE getMProfile() {
        return NLE_ENCODE_PROFILE.swigToEnum(NLEMediaJniJNI.NLEVideoHWEncodeSettings_mProfile_get(this.swigCPtr, this));
    }

    public int getMQpMax() {
        return NLEMediaJniJNI.NLEVideoHWEncodeSettings_mQpMax_get(this.swigCPtr, this);
    }

    public int getMQpMin() {
        return NLEMediaJniJNI.NLEVideoHWEncodeSettings_mQpMin_get(this.swigCPtr, this);
    }

    public float getMSd_bitrate_ratio() {
        return NLEMediaJniJNI.NLEVideoHWEncodeSettings_mSd_bitrate_ratio_get(this.swigCPtr, this);
    }

    public float getTransition_bitrate_ratio() {
        return NLEMediaJniJNI.NLEVideoHWEncodeSettings_transition_bitrate_ratio_get(this.swigCPtr, this);
    }

    public NLEVideoHWEncodeSettings() {
        this(NLEMediaJniJNI.new_NLEVideoHWEncodeSettings(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings) {
        if (nLEVideoHWEncodeSettings == null) {
            return 0L;
        }
        return nLEVideoHWEncodeSettings.swigCPtr;
    }

    public void setM2K_bitrate_ratio(float f) {
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_m2K_bitrate_ratio_set(this.swigCPtr, this, f);
    }

    public void setM4K_bitrate_ratio(float f) {
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_m4K_bitrate_ratio_set(this.swigCPtr, this, f);
    }

    public void setMBitrate(long j) {
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mBitrate_set(this.swigCPtr, this, j);
    }

    public void setMCodecType(int i) {
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mCodecType_set(this.swigCPtr, this, i);
    }

    public void setMFullHd_bitrate_ratio(float f) {
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mFullHd_bitrate_ratio_set(this.swigCPtr, this, f);
    }

    public void setMGop(int i) {
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mGop_set(this.swigCPtr, this, i);
    }

    public void setMH_fps_bitrate_ratio(float f) {
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mH_fps_bitrate_ratio_set(this.swigCPtr, this, f);
    }

    public void setMHp_bitrate_ratio(float f) {
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mHp_bitrate_ratio_set(this.swigCPtr, this, f);
    }

    public void setMProfile(NLE_ENCODE_PROFILE nle_encode_profile) {
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mProfile_set(this.swigCPtr, this, nle_encode_profile.swigValue());
    }

    public void setMQpMax(int i) {
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mQpMax_set(this.swigCPtr, this, i);
    }

    public void setMQpMin(int i) {
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mQpMin_set(this.swigCPtr, this, i);
    }

    public void setMSd_bitrate_ratio(float f) {
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_mSd_bitrate_ratio_set(this.swigCPtr, this, f);
    }

    public void setTransition_bitrate_ratio(float f) {
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_transition_bitrate_ratio_set(this.swigCPtr, this, f);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEVideoHWEncodeSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void setQpRange(int i, int i2) {
        NLEMediaJniJNI.NLEVideoHWEncodeSettings_setQpRange(this.swigCPtr, this, i, i2);
    }
}
