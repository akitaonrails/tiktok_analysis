package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEMediaVideoInfo {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEMediaVideoInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public long getBitrate() {
        return NLEMediaJniJNI.NLEMediaVideoInfo_bitrate_get(this.swigCPtr, this);
    }

    public long getCodec() {
        return NLEMediaJniJNI.NLEMediaVideoInfo_codec_get(this.swigCPtr, this);
    }

    public long getDuration() {
        return NLEMediaJniJNI.NLEMediaVideoInfo_duration_get(this.swigCPtr, this);
    }

    public String getFormatName() {
        return NLEMediaJniJNI.NLEMediaVideoInfo_formatName_get(this.swigCPtr, this);
    }

    public double getFps() {
        return NLEMediaJniJNI.NLEMediaVideoInfo_fps_get(this.swigCPtr, this);
    }

    public int getHdr() {
        return NLEMediaJniJNI.NLEMediaVideoInfo_hdr_get(this.swigCPtr, this);
    }

    public int getHdrColorPrimary() {
        return NLEMediaJniJNI.NLEMediaVideoInfo_hdrColorPrimary_get(this.swigCPtr, this);
    }

    public int getHdrColorRange() {
        return NLEMediaJniJNI.NLEMediaVideoInfo_hdrColorRange_get(this.swigCPtr, this);
    }

    public int getHdrColorSpace() {
        return NLEMediaJniJNI.NLEMediaVideoInfo_hdrColorSpace_get(this.swigCPtr, this);
    }

    public long getHeight() {
        return NLEMediaJniJNI.NLEMediaVideoInfo_height_get(this.swigCPtr, this);
    }

    public boolean getIsImage() {
        return NLEMediaJniJNI.NLEMediaVideoInfo_isImage_get(this.swigCPtr, this);
    }

    public long getKeyFrameCount() {
        return NLEMediaJniJNI.NLEMediaVideoInfo_keyFrameCount_get(this.swigCPtr, this);
    }

    public long getMaxDuration() {
        return NLEMediaJniJNI.NLEMediaVideoInfo_maxDuration_get(this.swigCPtr, this);
    }

    public long getRotation() {
        return NLEMediaJniJNI.NLEMediaVideoInfo_rotation_get(this.swigCPtr, this);
    }

    public long getWidth() {
        return NLEMediaJniJNI.NLEMediaVideoInfo_width_get(this.swigCPtr, this);
    }

    public NLEMediaVideoInfo() {
        this(NLEMediaJniJNI.new_NLEMediaVideoInfo(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaVideoInfo nLEMediaVideoInfo) {
        if (nLEMediaVideoInfo == null) {
            return 0L;
        }
        return nLEMediaVideoInfo.swigCPtr;
    }

    public void setBitrate(long j) {
        NLEMediaJniJNI.NLEMediaVideoInfo_bitrate_set(this.swigCPtr, this, j);
    }

    public void setCodec(long j) {
        NLEMediaJniJNI.NLEMediaVideoInfo_codec_set(this.swigCPtr, this, j);
    }

    public void setDuration(long j) {
        NLEMediaJniJNI.NLEMediaVideoInfo_duration_set(this.swigCPtr, this, j);
    }

    public void setFormatName(String str) {
        NLEMediaJniJNI.NLEMediaVideoInfo_formatName_set(this.swigCPtr, this, str);
    }

    public void setFps(double d) {
        NLEMediaJniJNI.NLEMediaVideoInfo_fps_set(this.swigCPtr, this, d);
    }

    public void setHdr(int i) {
        NLEMediaJniJNI.NLEMediaVideoInfo_hdr_set(this.swigCPtr, this, i);
    }

    public void setHdrColorPrimary(int i) {
        NLEMediaJniJNI.NLEMediaVideoInfo_hdrColorPrimary_set(this.swigCPtr, this, i);
    }

    public void setHdrColorRange(int i) {
        NLEMediaJniJNI.NLEMediaVideoInfo_hdrColorRange_set(this.swigCPtr, this, i);
    }

    public void setHdrColorSpace(int i) {
        NLEMediaJniJNI.NLEMediaVideoInfo_hdrColorSpace_set(this.swigCPtr, this, i);
    }

    public void setHeight(long j) {
        NLEMediaJniJNI.NLEMediaVideoInfo_height_set(this.swigCPtr, this, j);
    }

    public void setIsImage(boolean z) {
        NLEMediaJniJNI.NLEMediaVideoInfo_isImage_set(this.swigCPtr, this, z);
    }

    public void setKeyFrameCount(long j) {
        NLEMediaJniJNI.NLEMediaVideoInfo_keyFrameCount_set(this.swigCPtr, this, j);
    }

    public void setMaxDuration(long j) {
        NLEMediaJniJNI.NLEMediaVideoInfo_maxDuration_set(this.swigCPtr, this, j);
    }

    public void setRotation(long j) {
        NLEMediaJniJNI.NLEMediaVideoInfo_rotation_set(this.swigCPtr, this, j);
    }

    public void setWidth(long j) {
        NLEMediaJniJNI.NLEMediaVideoInfo_width_set(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMediaVideoInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
