package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEAlgorithmPath {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEAlgorithmPath(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getBeatsPath() {
        return NLEMediaJniJNI.NLEAlgorithmPath_beatsPath_get(this.swigCPtr, this);
    }

    public String getDownBeatsPath() {
        return NLEMediaJniJNI.NLEAlgorithmPath_downBeatsPath_get(this.swigCPtr, this);
    }

    public String getManMadePath() {
        return NLEMediaJniJNI.NLEAlgorithmPath_manMadePath_get(this.swigCPtr, this);
    }

    public int getMode() {
        return NLEMediaJniJNI.NLEAlgorithmPath_mode_get(this.swigCPtr, this);
    }

    public String getNoStrengthBeatsPath() {
        return NLEMediaJniJNI.NLEAlgorithmPath_noStrengthBeatsPath_get(this.swigCPtr, this);
    }

    public String getOnlineBeatsPath() {
        return NLEMediaJniJNI.NLEAlgorithmPath_onlineBeatsPath_get(this.swigCPtr, this);
    }

    public int getPictureDuration() {
        return NLEMediaJniJNI.NLEAlgorithmPath_pictureDuration_get(this.swigCPtr, this);
    }

    public int getType() {
        return NLEMediaJniJNI.NLEAlgorithmPath_type_get(this.swigCPtr, this);
    }

    public NLEAlgorithmPath() {
        this(NLEMediaJniJNI.new_NLEAlgorithmPath(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEAlgorithmPath nLEAlgorithmPath) {
        if (nLEAlgorithmPath == null) {
            return 0L;
        }
        return nLEAlgorithmPath.swigCPtr;
    }

    public void setBeatsPath(String str) {
        NLEMediaJniJNI.NLEAlgorithmPath_beatsPath_set(this.swigCPtr, this, str);
    }

    public void setDownBeatsPath(String str) {
        NLEMediaJniJNI.NLEAlgorithmPath_downBeatsPath_set(this.swigCPtr, this, str);
    }

    public void setManMadePath(String str) {
        NLEMediaJniJNI.NLEAlgorithmPath_manMadePath_set(this.swigCPtr, this, str);
    }

    public void setMode(int i) {
        NLEMediaJniJNI.NLEAlgorithmPath_mode_set(this.swigCPtr, this, i);
    }

    public void setNoStrengthBeatsPath(String str) {
        NLEMediaJniJNI.NLEAlgorithmPath_noStrengthBeatsPath_set(this.swigCPtr, this, str);
    }

    public void setOnlineBeatsPath(String str) {
        NLEMediaJniJNI.NLEAlgorithmPath_onlineBeatsPath_set(this.swigCPtr, this, str);
    }

    public void setPictureDuration(int i) {
        NLEMediaJniJNI.NLEAlgorithmPath_pictureDuration_set(this.swigCPtr, this, i);
    }

    public void setType(int i) {
        NLEMediaJniJNI.NLEAlgorithmPath_type_set(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEAlgorithmPath(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
