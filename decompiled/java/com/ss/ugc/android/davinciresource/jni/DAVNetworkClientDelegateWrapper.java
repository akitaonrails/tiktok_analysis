package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVNetworkClientDelegateWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVNetworkClientDelegateWrapper(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DAVNetworkClientDelegateWrapper() {
        this(DavinciResourceJniJNI.new_DAVNetworkClientDelegateWrapper(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVNetworkClientDelegateWrapper dAVNetworkClientDelegateWrapper) {
        if (dAVNetworkClientDelegateWrapper == null) {
            return 0L;
        }
        return dAVNetworkClientDelegateWrapper.swigCPtr;
    }

    public static void setHttpClientWrapper(IDAVHTTPClientDelegateWrapper iDAVHTTPClientDelegateWrapper) {
        DavinciResourceJniJNI.DAVNetworkClientDelegateWrapper_setHttpClientWrapper(IDAVHTTPClientDelegateWrapper.getCPtr(iDAVHTTPClientDelegateWrapper), iDAVHTTPClientDelegateWrapper);
    }

    public DAVNetworkClientDelegateWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
