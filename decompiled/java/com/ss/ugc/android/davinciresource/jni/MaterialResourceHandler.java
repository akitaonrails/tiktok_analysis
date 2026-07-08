package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class MaterialResourceHandler extends DAVResourceHandler {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                DavinciResourceJniJNI.delete_MaterialResourceHandler(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void finalize() {
        delete();
    }

    public MaterialResourceHandler(MaterialResourceConfig materialResourceConfig) {
        this(DavinciResourceJniJNI.new_MaterialResourceHandler(MaterialResourceConfig.getCPtr(materialResourceConfig), materialResourceConfig), true);
    }

    public static long getCPtr(MaterialResourceHandler materialResourceHandler) {
        if (materialResourceHandler == null) {
            return 0L;
        }
        return materialResourceHandler.swigCPtr;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public boolean canHandle(DAVResource dAVResource) {
        return DavinciResourceJniJNI.MaterialResourceHandler_canHandle(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public DAVResource fetchResourceFromCache(String str) {
        long jMaterialResourceHandler_fetchResourceFromCache__SWIG_1 = DavinciResourceJniJNI.MaterialResourceHandler_fetchResourceFromCache__SWIG_1(this.swigCPtr, this, str);
        if (jMaterialResourceHandler_fetchResourceFromCache__SWIG_1 == 0) {
            return null;
        }
        return new DAVResource(jMaterialResourceHandler_fetchResourceFromCache__SWIG_1, true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public MaterialResourceHandler(long j, boolean z) {
        super(DavinciResourceJniJNI.MaterialResourceHandler_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public DAVResource fetchResourceFromCache(String str, MapStringString mapStringString) {
        long jMaterialResourceHandler_fetchResourceFromCache__SWIG_0 = DavinciResourceJniJNI.MaterialResourceHandler_fetchResourceFromCache__SWIG_0(this.swigCPtr, this, str, MapStringString.getCPtr(mapStringString), mapStringString);
        if (jMaterialResourceHandler_fetchResourceFromCache__SWIG_0 == 0) {
            return null;
        }
        return new DAVResource(jMaterialResourceHandler_fetchResourceFromCache__SWIG_0, true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void fetchBatchResource(VecPtrDAVResource vecPtrDAVResource, MapStringString mapStringString, DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback) {
        DavinciResourceJniJNI.MaterialResourceHandler_fetchBatchResource(this.swigCPtr, this, VecPtrDAVResource.getCPtr(vecPtrDAVResource), vecPtrDAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVBatchResourceFetchCallback.getCPtr(dAVBatchResourceFetchCallback), dAVBatchResourceFetchCallback);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public long fetchResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.MaterialResourceHandler_fetchResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }
}
