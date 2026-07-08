package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEMVResourceBean {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEMVResourceBean(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int getClipIndex() {
        return NLEMediaJniJNI.NLEMVResourceBean_clipIndex_get(this.swigCPtr, this);
    }

    public String getContent() {
        return NLEMediaJniJNI.NLEMVResourceBean_content_get(this.swigCPtr, this);
    }

    public int getIsLoop() {
        return NLEMediaJniJNI.NLEMVResourceBean_isLoop_get(this.swigCPtr, this);
    }

    public boolean getIsMute() {
        return NLEMediaJniJNI.NLEMVResourceBean_isMute_get(this.swigCPtr, this);
    }

    public int getRid() {
        return NLEMediaJniJNI.NLEMVResourceBean_rid_get(this.swigCPtr, this);
    }

    public long getSeqIn() {
        return NLEMediaJniJNI.NLEMVResourceBean_seqIn_get(this.swigCPtr, this);
    }

    public long getSeqOut() {
        return NLEMediaJniJNI.NLEMVResourceBean_seqOut_get(this.swigCPtr, this);
    }

    public int getTrackIndex() {
        return NLEMediaJniJNI.NLEMVResourceBean_trackIndex_get(this.swigCPtr, this);
    }

    public long getTrimIn() {
        return NLEMediaJniJNI.NLEMVResourceBean_trimIn_get(this.swigCPtr, this);
    }

    public long getTrimOut() {
        return NLEMediaJniJNI.NLEMVResourceBean_trimOut_get(this.swigCPtr, this);
    }

    public String getType() {
        return NLEMediaJniJNI.NLEMVResourceBean_type_get(this.swigCPtr, this);
    }

    public NLEMVResourceBean() {
        this(NLEMediaJniJNI.new_NLEMVResourceBean(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMVResourceBean nLEMVResourceBean) {
        if (nLEMVResourceBean == null) {
            return 0L;
        }
        return nLEMVResourceBean.swigCPtr;
    }

    public void setClipIndex(int i) {
        NLEMediaJniJNI.NLEMVResourceBean_clipIndex_set(this.swigCPtr, this, i);
    }

    public void setContent(String str) {
        NLEMediaJniJNI.NLEMVResourceBean_content_set(this.swigCPtr, this, str);
    }

    public void setIsLoop(int i) {
        NLEMediaJniJNI.NLEMVResourceBean_isLoop_set(this.swigCPtr, this, i);
    }

    public void setIsMute(boolean z) {
        NLEMediaJniJNI.NLEMVResourceBean_isMute_set(this.swigCPtr, this, z);
    }

    public void setRid(int i) {
        NLEMediaJniJNI.NLEMVResourceBean_rid_set(this.swigCPtr, this, i);
    }

    public void setSeqIn(long j) {
        NLEMediaJniJNI.NLEMVResourceBean_seqIn_set(this.swigCPtr, this, j);
    }

    public void setSeqOut(long j) {
        NLEMediaJniJNI.NLEMVResourceBean_seqOut_set(this.swigCPtr, this, j);
    }

    public void setTrackIndex(int i) {
        NLEMediaJniJNI.NLEMVResourceBean_trackIndex_set(this.swigCPtr, this, i);
    }

    public void setTrimIn(long j) {
        NLEMediaJniJNI.NLEMVResourceBean_trimIn_set(this.swigCPtr, this, j);
    }

    public void setTrimOut(long j) {
        NLEMediaJniJNI.NLEMVResourceBean_trimOut_set(this.swigCPtr, this, j);
    }

    public void setType(String str) {
        NLEMediaJniJNI.NLEMVResourceBean_type_set(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMVResourceBean(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
