package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEAudioXResults {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEAudioXResults(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public float getBe0() {
        return NLEMediaJniJNI.NLEAudioXResults_be0_get(this.swigCPtr, this);
    }

    public float getBe1() {
        return NLEMediaJniJNI.NLEAudioXResults_be1_get(this.swigCPtr, this);
    }

    public float getCtps() {
        return NLEMediaJniJNI.NLEAudioXResults_ctps_get(this.swigCPtr, this);
    }

    public float getDo_() {
        return NLEMediaJniJNI.NLEAudioXResults_do__get(this.swigCPtr, this);
    }

    public float getDrr() {
        return NLEMediaJniJNI.NLEAudioXResults_drr_get(this.swigCPtr, this);
    }

    public float getLi() {
        return NLEMediaJniJNI.NLEAudioXResults_li_get(this.swigCPtr, this);
    }

    public float getMp() {
        return NLEMediaJniJNI.NLEAudioXResults_mp_get(this.swigCPtr, this);
    }

    public float getRcd() {
        return NLEMediaJniJNI.NLEAudioXResults_rcd_get(this.swigCPtr, this);
    }

    public float getTacm() {
        return NLEMediaJniJNI.NLEAudioXResults_tacm_get(this.swigCPtr, this);
    }

    public NLEAudioXResults() {
        this(NLEMediaJniJNI.new_NLEAudioXResults(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEAudioXResults nLEAudioXResults) {
        if (nLEAudioXResults == null) {
            return 0L;
        }
        return nLEAudioXResults.swigCPtr;
    }

    public void setBe0(float f) {
        NLEMediaJniJNI.NLEAudioXResults_be0_set(this.swigCPtr, this, f);
    }

    public void setBe1(float f) {
        NLEMediaJniJNI.NLEAudioXResults_be1_set(this.swigCPtr, this, f);
    }

    public void setCtps(float f) {
        NLEMediaJniJNI.NLEAudioXResults_ctps_set(this.swigCPtr, this, f);
    }

    public void setDo_(float f) {
        NLEMediaJniJNI.NLEAudioXResults_do__set(this.swigCPtr, this, f);
    }

    public void setDrr(float f) {
        NLEMediaJniJNI.NLEAudioXResults_drr_set(this.swigCPtr, this, f);
    }

    public void setLi(float f) {
        NLEMediaJniJNI.NLEAudioXResults_li_set(this.swigCPtr, this, f);
    }

    public void setMp(float f) {
        NLEMediaJniJNI.NLEAudioXResults_mp_set(this.swigCPtr, this, f);
    }

    public void setRcd(float f) {
        NLEMediaJniJNI.NLEAudioXResults_rcd_set(this.swigCPtr, this, f);
    }

    public void setTacm(float f) {
        NLEMediaJniJNI.NLEAudioXResults_tacm_set(this.swigCPtr, this, f);
    }

    public NLEAudioXResults(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
