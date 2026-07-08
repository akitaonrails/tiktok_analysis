package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes35.dex */
public class HttpClientCallbackDelegate {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_HttpClientCallbackDelegate(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(HttpClientCallbackDelegate httpClientCallbackDelegate) {
        if (httpClientCallbackDelegate == null) {
            return 0L;
        }
        return httpClientCallbackDelegate.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public HttpClientCallbackDelegate(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onCallback(SWIGTYPE_p_void sWIGTYPE_p_void, HttpClientCallbackAction httpClientCallbackAction, byte[] bArr, long j, MsgExtParam msgExtParam) {
        DavinciResourceJniJNI.HttpClientCallbackDelegate_onCallback(this.swigCPtr, this, SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void), httpClientCallbackAction.swigValue(), bArr, j, MsgExtParam.getCPtr(msgExtParam), msgExtParam);
    }
}
