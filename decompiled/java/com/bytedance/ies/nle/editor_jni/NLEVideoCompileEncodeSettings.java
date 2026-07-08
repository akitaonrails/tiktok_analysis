package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEVideoCompileEncodeSettings {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEVideoCompileEncodeSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean getEnableHwBufferEncode() {
        return NLEMediaJniJNI.NLEVideoCompileEncodeSettings_enableHwBufferEncode_get(this.swigCPtr, this);
    }

    public boolean getIsSupportHWEncoder() {
        return NLEMediaJniJNI.NLEVideoCompileEncodeSettings_isSupportHWEncoder_get(this.swigCPtr, this);
    }

    public NLEVideoHWEncodeSettings getMHWEncodeSetting() {
        long jNLEVideoCompileEncodeSettings_mHWEncodeSetting_get = NLEMediaJniJNI.NLEVideoCompileEncodeSettings_mHWEncodeSetting_get(this.swigCPtr, this);
        if (jNLEVideoCompileEncodeSettings_mHWEncodeSetting_get == 0) {
            return null;
        }
        return new NLEVideoHWEncodeSettings(jNLEVideoCompileEncodeSettings_mHWEncodeSetting_get, true);
    }

    public NLEVideoSWEncodeSettings getMSWEncodeSetting() {
        long jNLEVideoCompileEncodeSettings_mSWEncodeSetting_get = NLEMediaJniJNI.NLEVideoCompileEncodeSettings_mSWEncodeSetting_get(this.swigCPtr, this);
        if (jNLEVideoCompileEncodeSettings_mSWEncodeSetting_get == 0) {
            return null;
        }
        return new NLEVideoSWEncodeSettings(jNLEVideoCompileEncodeSettings_mSWEncodeSetting_get, true);
    }

    public boolean getUseHWEncoder() {
        return NLEMediaJniJNI.NLEVideoCompileEncodeSettings_useHWEncoder_get(this.swigCPtr, this);
    }

    public NLEVideoCompileEncodeSettings() {
        this(NLEMediaJniJNI.new_NLEVideoCompileEncodeSettings(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings) {
        if (nLEVideoCompileEncodeSettings == null) {
            return 0L;
        }
        return nLEVideoCompileEncodeSettings.swigCPtr;
    }

    public void setEnableHwBufferEncode(boolean z) {
        NLEMediaJniJNI.NLEVideoCompileEncodeSettings_enableHwBufferEncode_set(this.swigCPtr, this, z);
    }

    public void setIsSupportHWEncoder(boolean z) {
        NLEMediaJniJNI.NLEVideoCompileEncodeSettings_isSupportHWEncoder_set(this.swigCPtr, this, z);
    }

    public void setMHWEncodeSetting(NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings) {
        NLEMediaJniJNI.NLEVideoCompileEncodeSettings_mHWEncodeSetting_set(this.swigCPtr, this, NLEVideoHWEncodeSettings.getCPtr(nLEVideoHWEncodeSettings), nLEVideoHWEncodeSettings);
    }

    public void setMSWEncodeSetting(NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings) {
        NLEMediaJniJNI.NLEVideoCompileEncodeSettings_mSWEncodeSetting_set(this.swigCPtr, this, NLEVideoSWEncodeSettings.getCPtr(nLEVideoSWEncodeSettings), nLEVideoSWEncodeSettings);
    }

    public void setUseHWEncoder(boolean z) {
        NLEMediaJniJNI.NLEVideoCompileEncodeSettings_useHWEncoder_set(this.swigCPtr, this, z);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEVideoCompileEncodeSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
