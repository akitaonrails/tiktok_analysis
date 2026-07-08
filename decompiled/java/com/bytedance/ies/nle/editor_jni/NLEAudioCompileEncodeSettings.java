package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEAudioCompileEncodeSettings {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEAudioCompileEncodeSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int getAudioBps() {
        return NLEMediaJniJNI.NLEAudioCompileEncodeSettings_audioBps_get(this.swigCPtr, this);
    }

    public int getChannelCount() {
        return NLEMediaJniJNI.NLEAudioCompileEncodeSettings_channelCount_get(this.swigCPtr, this);
    }

    public NLE_COMPILE_TYPE getCompileType() {
        return NLE_COMPILE_TYPE.swigToEnum(NLEMediaJniJNI.NLEAudioCompileEncodeSettings_compileType_get(this.swigCPtr, this));
    }

    public boolean getEnableAudioCompileGraph() {
        return NLEMediaJniJNI.NLEAudioCompileEncodeSettings_enableAudioCompileGraph_get(this.swigCPtr, this);
    }

    public boolean getEnableHwBufferEncode() {
        return NLEMediaJniJNI.NLEAudioCompileEncodeSettings_enableHwBufferEncode_get(this.swigCPtr, this);
    }

    public boolean getIsSkipAudioBitrateAdjust() {
        return NLEMediaJniJNI.NLEAudioCompileEncodeSettings_isSkipAudioBitrateAdjust_get(this.swigCPtr, this);
    }

    public boolean getIsSupportHWEncoder() {
        return NLEMediaJniJNI.NLEAudioCompileEncodeSettings_isSupportHWEncoder_get(this.swigCPtr, this);
    }

    public NLEAudioHWEncodeSettings getMHWEncodeSetting() {
        long jNLEAudioCompileEncodeSettings_mHWEncodeSetting_get = NLEMediaJniJNI.NLEAudioCompileEncodeSettings_mHWEncodeSetting_get(this.swigCPtr, this);
        if (jNLEAudioCompileEncodeSettings_mHWEncodeSetting_get == 0) {
            return null;
        }
        return new NLEAudioHWEncodeSettings(jNLEAudioCompileEncodeSettings_mHWEncodeSetting_get, false);
    }

    public NLEAudioSWEncodeSettings getMSWEncodeSetting() {
        long jNLEAudioCompileEncodeSettings_mSWEncodeSetting_get = NLEMediaJniJNI.NLEAudioCompileEncodeSettings_mSWEncodeSetting_get(this.swigCPtr, this);
        if (jNLEAudioCompileEncodeSettings_mSWEncodeSetting_get == 0) {
            return null;
        }
        return new NLEAudioSWEncodeSettings(jNLEAudioCompileEncodeSettings_mSWEncodeSetting_get, false);
    }

    public int getSampleRate() {
        return NLEMediaJniJNI.NLEAudioCompileEncodeSettings_sampleRate_get(this.swigCPtr, this);
    }

    public boolean getUseHWEncoder() {
        return NLEMediaJniJNI.NLEAudioCompileEncodeSettings_useHWEncoder_get(this.swigCPtr, this);
    }

    public NLEAudioCompileEncodeSettings() {
        this(NLEMediaJniJNI.new_NLEAudioCompileEncodeSettings(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings) {
        if (nLEAudioCompileEncodeSettings == null) {
            return 0L;
        }
        return nLEAudioCompileEncodeSettings.swigCPtr;
    }

    public void setAudioBps(int i) {
        NLEMediaJniJNI.NLEAudioCompileEncodeSettings_audioBps_set(this.swigCPtr, this, i);
    }

    public void setChannelCount(int i) {
        NLEMediaJniJNI.NLEAudioCompileEncodeSettings_channelCount_set(this.swigCPtr, this, i);
    }

    public void setCompileType(NLE_COMPILE_TYPE nle_compile_type) {
        NLEMediaJniJNI.NLEAudioCompileEncodeSettings_compileType_set(this.swigCPtr, this, nle_compile_type.swigValue());
    }

    public void setEnableAudioCompileGraph(boolean z) {
        NLEMediaJniJNI.NLEAudioCompileEncodeSettings_enableAudioCompileGraph_set(this.swigCPtr, this, z);
    }

    public void setEnableHwBufferEncode(boolean z) {
        NLEMediaJniJNI.NLEAudioCompileEncodeSettings_enableHwBufferEncode_set(this.swigCPtr, this, z);
    }

    public void setIsSkipAudioBitrateAdjust(boolean z) {
        NLEMediaJniJNI.NLEAudioCompileEncodeSettings_isSkipAudioBitrateAdjust_set(this.swigCPtr, this, z);
    }

    public void setIsSupportHWEncoder(boolean z) {
        NLEMediaJniJNI.NLEAudioCompileEncodeSettings_isSupportHWEncoder_set(this.swigCPtr, this, z);
    }

    public void setMHWEncodeSetting(NLEAudioHWEncodeSettings nLEAudioHWEncodeSettings) {
        NLEMediaJniJNI.NLEAudioCompileEncodeSettings_mHWEncodeSetting_set(this.swigCPtr, this, NLEAudioHWEncodeSettings.getCPtr(nLEAudioHWEncodeSettings), nLEAudioHWEncodeSettings);
    }

    public void setMSWEncodeSetting(NLEAudioSWEncodeSettings nLEAudioSWEncodeSettings) {
        NLEMediaJniJNI.NLEAudioCompileEncodeSettings_mSWEncodeSetting_set(this.swigCPtr, this, NLEAudioSWEncodeSettings.getCPtr(nLEAudioSWEncodeSettings), nLEAudioSWEncodeSettings);
    }

    public void setSampleRate(int i) {
        NLEMediaJniJNI.NLEAudioCompileEncodeSettings_sampleRate_set(this.swigCPtr, this, i);
    }

    public void setUseHWEncoder(boolean z) {
        NLEMediaJniJNI.NLEAudioCompileEncodeSettings_useHWEncoder_set(this.swigCPtr, this, z);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEAudioCompileEncodeSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
