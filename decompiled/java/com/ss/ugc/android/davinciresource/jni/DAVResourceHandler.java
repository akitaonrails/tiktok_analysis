package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVResourceHandler {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVResourceHandler(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVResourceHandler dAVResourceHandler) {
        if (dAVResourceHandler == null) {
            return 0L;
        }
        return dAVResourceHandler.swigCPtr;
    }

    public boolean canHandle(DAVResource dAVResource) {
        return DavinciResourceJniJNI.DAVResourceHandler_canHandle(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource);
    }

    public DAVResource fetchResourceFromCache(String str) {
        long jDAVResourceHandler_fetchResourceFromCache__SWIG_1 = DavinciResourceJniJNI.DAVResourceHandler_fetchResourceFromCache__SWIG_1(this.swigCPtr, this, str);
        if (jDAVResourceHandler_fetchResourceFromCache__SWIG_1 == 0) {
            return null;
        }
        return new DAVResource(jDAVResourceHandler_fetchResourceFromCache__SWIG_1, true);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DAVResourceHandler(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public DAVResource fetchResourceFromCache(String str, MapStringString mapStringString) {
        long jDAVResourceHandler_fetchResourceFromCache__SWIG_0 = DavinciResourceJniJNI.DAVResourceHandler_fetchResourceFromCache__SWIG_0(this.swigCPtr, this, str, MapStringString.getCPtr(mapStringString), mapStringString);
        if (jDAVResourceHandler_fetchResourceFromCache__SWIG_0 == 0) {
            return null;
        }
        return new DAVResource(jDAVResourceHandler_fetchResourceFromCache__SWIG_0, true);
    }

    public long deleteResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.DAVResourceHandler_deleteResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }

    public void fetchBatchResource(VecPtrDAVResource vecPtrDAVResource, MapStringString mapStringString, DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback) {
        DavinciResourceJniJNI.DAVResourceHandler_fetchBatchResource(this.swigCPtr, this, VecPtrDAVResource.getCPtr(vecPtrDAVResource), vecPtrDAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVBatchResourceFetchCallback.getCPtr(dAVBatchResourceFetchCallback), dAVBatchResourceFetchCallback);
    }

    public long fetchResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.DAVResourceHandler_fetchResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }

    public long pushResource(String str, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.DAVResourceHandler_pushResource(this.swigCPtr, this, str, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }

    public long updateResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.DAVResourceHandler_updateResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }
}
