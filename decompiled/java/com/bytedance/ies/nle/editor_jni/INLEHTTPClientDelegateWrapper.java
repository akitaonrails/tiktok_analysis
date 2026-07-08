package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class INLEHTTPClientDelegateWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaRemoteJniJNI.delete_INLEHTTPClientDelegateWrapper(j);
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
        NLEMediaRemoteJniJNI.INLEHTTPClientDelegateWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaRemoteJniJNI.INLEHTTPClientDelegateWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public INLEHTTPClientDelegateWrapper() {
        this(NLEMediaRemoteJniJNI.new_INLEHTTPClientDelegateWrapper(), true);
        NLEMediaRemoteJniJNI.INLEHTTPClientDelegateWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLEHTTPClientDelegateWrapper iNLEHTTPClientDelegateWrapper) {
        if (iNLEHTTPClientDelegateWrapper == null) {
            return 0L;
        }
        return iNLEHTTPClientDelegateWrapper.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public INLEHTTPClientDelegateWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean requestNet(String str, NLEHttpType nLEHttpType, long j, UnorderedMapStrStr unorderedMapStrStr, UnorderedMapStrStr unorderedMapStrStr2, String str2, byte[] bArr, SWIGTYPE_p_void sWIGTYPE_p_void, NLEHttpClientCallbackDelegate nLEHttpClientCallbackDelegate) {
        return NLEMediaRemoteJniJNI.INLEHTTPClientDelegateWrapper_requestNet(this.swigCPtr, this, str, nLEHttpType.swigValue(), j, UnorderedMapStrStr.getCPtr(unorderedMapStrStr), unorderedMapStrStr, UnorderedMapStrStr.getCPtr(unorderedMapStrStr2), unorderedMapStrStr2, str2, bArr, SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void), NLEHttpClientCallbackDelegate.getCPtr(nLEHttpClientCallbackDelegate), nLEHttpClientCallbackDelegate);
    }
}
