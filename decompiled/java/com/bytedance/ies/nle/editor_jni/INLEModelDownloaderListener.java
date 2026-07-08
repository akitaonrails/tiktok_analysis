package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class INLEModelDownloaderListener {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEResourcesDAVJNI.delete_INLEModelDownloaderListener(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLEModelDownloaderListener iNLEModelDownloaderListener) {
        if (iNLEModelDownloaderListener == null) {
            return 0L;
        }
        return iNLEModelDownloaderListener.swigCPtr;
    }

    public String fetchResourceFromCache(String str) {
        return NLEResourcesDAVJNI.INLEModelDownloaderListener_fetchResourceFromCache__SWIG_1(this.swigCPtr, this, str);
    }

    public INLEModelDownloaderListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public String fetchResourceFromCache(String str, UnorderedMapStrStr unorderedMapStrStr) {
        return NLEResourcesDAVJNI.INLEModelDownloaderListener_fetchResourceFromCache__SWIG_0(this.swigCPtr, this, str, UnorderedMapStrStr.getCPtr(unorderedMapStrStr), unorderedMapStrStr);
    }
}
