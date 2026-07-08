package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEOnFrameAvailableWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEOnFrameAvailableWrapper(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        NLEMediaPublicJniJNI.NLEOnFrameAvailableWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEOnFrameAvailableWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLEOnFrameAvailableWrapper() {
        this(NLEMediaPublicJniJNI.new_NLEOnFrameAvailableWrapper(), true);
        NLEMediaPublicJniJNI.NLEOnFrameAvailableWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEOnFrameAvailableWrapper nLEOnFrameAvailableWrapper) {
        if (nLEOnFrameAvailableWrapper == null) {
            return 0L;
        }
        return nLEOnFrameAvailableWrapper.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEOnFrameAvailableWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean onGetFrame(byte[] bArr, long j, long j2, long j3) {
        return NLEMediaPublicJniJNI.NLEOnFrameAvailableWrapper_onGetFrame(this.swigCPtr, this, bArr, j, j2, j3);
    }
}
