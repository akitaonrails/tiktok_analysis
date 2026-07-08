package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEHttpClientCallbackDelegate {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaRemoteJniJNI.delete_NLEHttpClientCallbackDelegate(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEHttpClientCallbackDelegate nLEHttpClientCallbackDelegate) {
        if (nLEHttpClientCallbackDelegate == null) {
            return 0L;
        }
        return nLEHttpClientCallbackDelegate.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEHttpClientCallbackDelegate(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onCallback(SWIGTYPE_p_void sWIGTYPE_p_void, NLEHttpClientCallbackAction nLEHttpClientCallbackAction, byte[] bArr, long j, MsgExtParam msgExtParam) {
        NLEMediaRemoteJniJNI.NLEHttpClientCallbackDelegate_onCallback(this.swigCPtr, this, SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void), nLEHttpClientCallbackAction.swigValue(), bArr, j, MsgExtParam.getCPtr(msgExtParam), msgExtParam);
    }
}
