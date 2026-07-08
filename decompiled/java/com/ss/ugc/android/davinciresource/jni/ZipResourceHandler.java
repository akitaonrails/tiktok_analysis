package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class ZipResourceHandler extends DAVResourceHandler {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                DavinciResourceJniJNI.delete_ZipResourceHandler(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static ZipResourceHandler create() {
        long jZipResourceHandler_create = DavinciResourceJniJNI.ZipResourceHandler_create();
        if (jZipResourceHandler_create == 0) {
            return null;
        }
        return new ZipResourceHandler(jZipResourceHandler_create, true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void finalize() {
        delete();
    }

    public static long getCPtr(ZipResourceHandler zipResourceHandler) {
        if (zipResourceHandler == null) {
            return 0L;
        }
        return zipResourceHandler.swigCPtr;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public boolean canHandle(DAVResource dAVResource) {
        return DavinciResourceJniJNI.ZipResourceHandler_canHandle(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public ZipResourceHandler(long j, boolean z) {
        super(DavinciResourceJniJNI.ZipResourceHandler_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public DAVResource fetchResourceFromCache(String str, MapStringString mapStringString) {
        long jZipResourceHandler_fetchResourceFromCache = DavinciResourceJniJNI.ZipResourceHandler_fetchResourceFromCache(this.swigCPtr, this, str, MapStringString.getCPtr(mapStringString), mapStringString);
        if (jZipResourceHandler_fetchResourceFromCache == 0) {
            return null;
        }
        return new DAVResource(jZipResourceHandler_fetchResourceFromCache, true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public long fetchResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.ZipResourceHandler_fetchResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }
}
