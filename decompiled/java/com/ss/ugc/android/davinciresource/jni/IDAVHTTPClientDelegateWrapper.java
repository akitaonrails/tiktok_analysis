package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes35.dex */
public class IDAVHTTPClientDelegateWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_IDAVHTTPClientDelegateWrapper(j);
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
        DavinciResourceJniJNI.IDAVHTTPClientDelegateWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        DavinciResourceJniJNI.IDAVHTTPClientDelegateWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public IDAVHTTPClientDelegateWrapper() {
        this(DavinciResourceJniJNI.new_IDAVHTTPClientDelegateWrapper(), true);
        DavinciResourceJniJNI.IDAVHTTPClientDelegateWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(IDAVHTTPClientDelegateWrapper iDAVHTTPClientDelegateWrapper) {
        if (iDAVHTTPClientDelegateWrapper == null) {
            return 0L;
        }
        return iDAVHTTPClientDelegateWrapper.swigCPtr;
    }

    public long getContentLength(long j) {
        return DavinciResourceJniJNI.IDAVHTTPClientDelegateWrapper_getContentLength(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public IDAVHTTPClientDelegateWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean requestNet(String str, HTTP_TYPE http_type, long j, MapStringString mapStringString, MapStringString mapStringString2, String str2, byte[] bArr, SWIGTYPE_p_void sWIGTYPE_p_void, HttpClientCallbackDelegate httpClientCallbackDelegate) {
        return DavinciResourceJniJNI.IDAVHTTPClientDelegateWrapper_requestNet(this.swigCPtr, this, str, http_type.swigValue(), j, MapStringString.getCPtr(mapStringString), mapStringString, MapStringString.getCPtr(mapStringString2), mapStringString2, str2, bArr, SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void), HttpClientCallbackDelegate.getCPtr(httpClientCallbackDelegate), httpClientCallbackDelegate);
    }
}
