package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class UrlResourceHandler extends DAVResourceHandler {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                DavinciResourceJniJNI.delete_UrlResourceHandler(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static UrlResourceHandler create() {
        long jUrlResourceHandler_create = DavinciResourceJniJNI.UrlResourceHandler_create();
        if (jUrlResourceHandler_create == 0) {
            return null;
        }
        return new UrlResourceHandler(jUrlResourceHandler_create, true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void finalize() {
        delete();
    }

    public static long getCPtr(UrlResourceHandler urlResourceHandler) {
        if (urlResourceHandler == null) {
            return 0L;
        }
        return urlResourceHandler.swigCPtr;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public boolean canHandle(DAVResource dAVResource) {
        return DavinciResourceJniJNI.UrlResourceHandler_canHandle(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public UrlResourceHandler(long j, boolean z) {
        super(DavinciResourceJniJNI.UrlResourceHandler_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public DAVResource fetchResourceFromCache(String str, MapStringString mapStringString) {
        long jUrlResourceHandler_fetchResourceFromCache = DavinciResourceJniJNI.UrlResourceHandler_fetchResourceFromCache(this.swigCPtr, this, str, MapStringString.getCPtr(mapStringString), mapStringString);
        if (jUrlResourceHandler_fetchResourceFromCache == 0) {
            return null;
        }
        return new DAVResource(jUrlResourceHandler_fetchResourceFromCache, true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public long fetchResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.UrlResourceHandler_fetchResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }
}
