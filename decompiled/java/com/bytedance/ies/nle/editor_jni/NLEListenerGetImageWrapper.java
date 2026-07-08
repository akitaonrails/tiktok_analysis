package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEListenerGetImageWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEListenerGetImageWrapper(j);
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
        NLEMediaPublicJniJNI.NLEListenerGetImageWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEListenerGetImageWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLEListenerGetImageWrapper() {
        this(NLEMediaPublicJniJNI.new_NLEListenerGetImageWrapper(), true);
        NLEMediaPublicJniJNI.NLEListenerGetImageWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEListenerGetImageWrapper nLEListenerGetImageWrapper) {
        if (nLEListenerGetImageWrapper == null) {
            return 0L;
        }
        return nLEListenerGetImageWrapper.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEListenerGetImageWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public int onGetImageDataCalled(byte[] bArr, int i, int i2, int i3, float f) {
        return NLEMediaPublicJniJNI.NLEListenerGetImageWrapper_onGetImageDataCalled(this.swigCPtr, this, bArr, i, i2, i3, f);
    }
}
