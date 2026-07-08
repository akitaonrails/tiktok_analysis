package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class MediaResourceHandler extends DAVResourceHandler {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                DavinciResourceJniJNI.delete_MediaResourceHandler(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void finalize() {
        delete();
    }

    public static MediaResourceHandler create(MediaResourceConfig mediaResourceConfig) {
        long jMediaResourceHandler_create = DavinciResourceJniJNI.MediaResourceHandler_create(MediaResourceConfig.getCPtr(mediaResourceConfig), mediaResourceConfig);
        if (jMediaResourceHandler_create == 0) {
            return null;
        }
        return new MediaResourceHandler(jMediaResourceHandler_create, true);
    }

    public static long getCPtr(MediaResourceHandler mediaResourceHandler) {
        if (mediaResourceHandler == null) {
            return 0L;
        }
        return mediaResourceHandler.swigCPtr;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public boolean canHandle(DAVResource dAVResource) {
        return DavinciResourceJniJNI.MediaResourceHandler_canHandle(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public MediaResourceHandler(long j, boolean z) {
        super(DavinciResourceJniJNI.MediaResourceHandler_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public DAVResource fetchResourceFromCache(String str, MapStringString mapStringString) {
        long jMediaResourceHandler_fetchResourceFromCache = DavinciResourceJniJNI.MediaResourceHandler_fetchResourceFromCache(this.swigCPtr, this, str, MapStringString.getCPtr(mapStringString), mapStringString);
        if (jMediaResourceHandler_fetchResourceFromCache == 0) {
            return null;
        }
        return new DAVResource(jMediaResourceHandler_fetchResourceFromCache, true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public long deleteResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.MediaResourceHandler_deleteResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void fetchBatchResource(VecPtrDAVResource vecPtrDAVResource, MapStringString mapStringString, DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback) {
        DavinciResourceJniJNI.MediaResourceHandler_fetchBatchResource(this.swigCPtr, this, VecPtrDAVResource.getCPtr(vecPtrDAVResource), vecPtrDAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVBatchResourceFetchCallback.getCPtr(dAVBatchResourceFetchCallback), dAVBatchResourceFetchCallback);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public long fetchResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.MediaResourceHandler_fetchResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public long pushResource(String str, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.MediaResourceHandler_pushResource(this.swigCPtr, this, str, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public long updateResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.MediaResourceHandler_updateResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }
}
