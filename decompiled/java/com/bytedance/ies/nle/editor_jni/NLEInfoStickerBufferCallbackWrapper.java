package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEInfoStickerBufferCallbackWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEInfoStickerBufferCallbackWrapper(j);
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
        NLEMediaPublicJniJNI.NLEInfoStickerBufferCallbackWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEInfoStickerBufferCallbackWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLEInfoStickerBufferCallbackWrapper() {
        this(NLEMediaPublicJniJNI.new_NLEInfoStickerBufferCallbackWrapper(), true);
        NLEMediaPublicJniJNI.NLEInfoStickerBufferCallbackWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEInfoStickerBufferCallbackWrapper nLEInfoStickerBufferCallbackWrapper) {
        if (nLEInfoStickerBufferCallbackWrapper == null) {
            return 0L;
        }
        return nLEInfoStickerBufferCallbackWrapper.swigCPtr;
    }

    public Object onGetBuffer(String str) {
        return NLEMediaPublicJniJNI.NLEInfoStickerBufferCallbackWrapper_onGetBuffer(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEInfoStickerBufferCallbackWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
