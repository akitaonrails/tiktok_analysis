package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVResourceManager {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVResourceManager(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DAVResourceTaskManager getTaskManager() {
        long jDAVResourceManager_getTaskManager = DavinciResourceJniJNI.DAVResourceManager_getTaskManager(this.swigCPtr, this);
        if (jDAVResourceManager_getTaskManager == 0) {
            return null;
        }
        return new DAVResourceTaskManager(jDAVResourceManager_getTaskManager, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVResourceManager dAVResourceManager) {
        if (dAVResourceManager == null) {
            return 0L;
        }
        return dAVResourceManager.swigCPtr;
    }

    public DAVResource fetchResourceFromCache(String str) {
        long jDAVResourceManager_fetchResourceFromCache__SWIG_1 = DavinciResourceJniJNI.DAVResourceManager_fetchResourceFromCache__SWIG_1(this.swigCPtr, this, str);
        if (jDAVResourceManager_fetchResourceFromCache__SWIG_1 == 0) {
            return null;
        }
        return new DAVResource(jDAVResourceManager_fetchResourceFromCache__SWIG_1, true);
    }

    public int registerResourceHandler(DAVResourceHandler dAVResourceHandler) {
        return DavinciResourceJniJNI.DAVResourceManager_registerResourceHandler(this.swigCPtr, this, DAVResourceHandler.getCPtr(dAVResourceHandler), dAVResourceHandler);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DAVResourceManager(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public DAVResource fetchResourceFromCache(String str, MapStringString mapStringString) {
        long jDAVResourceManager_fetchResourceFromCache__SWIG_0 = DavinciResourceJniJNI.DAVResourceManager_fetchResourceFromCache__SWIG_0(this.swigCPtr, this, str, MapStringString.getCPtr(mapStringString), mapStringString);
        if (jDAVResourceManager_fetchResourceFromCache__SWIG_0 == 0) {
            return null;
        }
        return new DAVResource(jDAVResourceManager_fetchResourceFromCache__SWIG_0, true);
    }

    public long deleteResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.DAVResourceManager_deleteResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }

    public void fetchBatchResource(VecPtrDAVResource vecPtrDAVResource, MapStringString mapStringString, DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback) {
        DavinciResourceJniJNI.DAVResourceManager_fetchBatchResource(this.swigCPtr, this, VecPtrDAVResource.getCPtr(vecPtrDAVResource), vecPtrDAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVBatchResourceFetchCallback.getCPtr(dAVBatchResourceFetchCallback), dAVBatchResourceFetchCallback);
    }

    public long fetchResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.DAVResourceManager_fetchResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }

    public long updateResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.DAVResourceManager_updateResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }

    public long pushResource(String str, String str2, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.DAVResourceManager_pushResource(this.swigCPtr, this, str, str2, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }
}
