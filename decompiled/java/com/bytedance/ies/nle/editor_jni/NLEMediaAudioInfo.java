package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEMediaAudioInfo {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEMediaAudioInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public long getBitrate() {
        return NLEMediaJniJNI.NLEMediaAudioInfo_bitrate_get(this.swigCPtr, this);
    }

    public long getChannelSize() {
        return NLEMediaJniJNI.NLEMediaAudioInfo_channelSize_get(this.swigCPtr, this);
    }

    public long getDuration() {
        return NLEMediaJniJNI.NLEMediaAudioInfo_duration_get(this.swigCPtr, this);
    }

    public long getSampleFormat() {
        return NLEMediaJniJNI.NLEMediaAudioInfo_sampleFormat_get(this.swigCPtr, this);
    }

    public long getSampleRate() {
        return NLEMediaJniJNI.NLEMediaAudioInfo_sampleRate_get(this.swigCPtr, this);
    }

    public NLEMediaAudioInfo() {
        this(NLEMediaJniJNI.new_NLEMediaAudioInfo(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaAudioInfo nLEMediaAudioInfo) {
        if (nLEMediaAudioInfo == null) {
            return 0L;
        }
        return nLEMediaAudioInfo.swigCPtr;
    }

    public void setBitrate(long j) {
        NLEMediaJniJNI.NLEMediaAudioInfo_bitrate_set(this.swigCPtr, this, j);
    }

    public void setChannelSize(long j) {
        NLEMediaJniJNI.NLEMediaAudioInfo_channelSize_set(this.swigCPtr, this, j);
    }

    public void setDuration(long j) {
        NLEMediaJniJNI.NLEMediaAudioInfo_duration_set(this.swigCPtr, this, j);
    }

    public void setSampleFormat(long j) {
        NLEMediaJniJNI.NLEMediaAudioInfo_sampleFormat_set(this.swigCPtr, this, j);
    }

    public void setSampleRate(long j) {
        NLEMediaJniJNI.NLEMediaAudioInfo_sampleRate_set(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMediaAudioInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
