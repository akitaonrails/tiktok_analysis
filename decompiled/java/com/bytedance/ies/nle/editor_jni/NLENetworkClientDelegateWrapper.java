package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public class NLENetworkClientDelegateWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaRemoteJniJNI.delete_NLENetworkClientDelegateWrapper(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLENetworkClientDelegateWrapper() {
        this(NLEMediaRemoteJniJNI.new_NLENetworkClientDelegateWrapper(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLENetworkClientDelegateWrapper nLENetworkClientDelegateWrapper) {
        if (nLENetworkClientDelegateWrapper == null) {
            return 0L;
        }
        return nLENetworkClientDelegateWrapper.swigCPtr;
    }

    public static void setHttpClientWrapper(INLEHTTPClientDelegateWrapper iNLEHTTPClientDelegateWrapper) {
        NLEMediaRemoteJniJNI.NLENetworkClientDelegateWrapper_setHttpClientWrapper(INLEHTTPClientDelegateWrapper.getCPtr(iNLEHTTPClientDelegateWrapper), iNLEHTTPClientDelegateWrapper);
    }

    public NLENetworkClientDelegateWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
