package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class LokiResourceHandler extends DAVResourceHandler {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    public static class Builder {
        public transient boolean swigCMemOwn;
        public transient long swigCPtr;

        public synchronized void delete() {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    DavinciResourceJniJNI.delete_LokiResourceHandler_Builder(j);
                }
                this.swigCPtr = 0L;
            }
        }

        public LokiResourceHandler build() {
            long jLokiResourceHandler_Builder_build = DavinciResourceJniJNI.LokiResourceHandler_Builder_build(this.swigCPtr, this);
            if (jLokiResourceHandler_Builder_build == 0) {
                return null;
            }
            return new LokiResourceHandler(jLokiResourceHandler_Builder_build, true);
        }

        public Builder() {
            this(DavinciResourceJniJNI.new_LokiResourceHandler_Builder(), true);
        }

        public void finalize() {
            delete();
        }

        public static long getCPtr(Builder builder) {
            if (builder == null) {
                return 0L;
            }
            return builder.swigCPtr;
        }

        public Builder accessKey(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_accessKey(this.swigCPtr, this, str), false);
        }

        public Builder appID(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_appID(this.swigCPtr, this, str), false);
        }

        public Builder appLanguage(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_appLanguage(this.swigCPtr, this, str), false);
        }

        public Builder appVersion(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_appVersion(this.swigCPtr, this, str), false);
        }

        public Builder channel(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_channel(this.swigCPtr, this, str), false);
        }

        public Builder deviceId(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_deviceId(this.swigCPtr, this, str), false);
        }

        public Builder deviceInfo(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_deviceInfo(this.swigCPtr, this, str), false);
        }

        public Builder deviceType(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_deviceType(this.swigCPtr, this, str), false);
        }

        public Builder effectCacheDir(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_effectCacheDir(this.swigCPtr, this, str), false);
        }

        public Builder gpu(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_gpu(this.swigCPtr, this, str), false);
        }

        public Builder host(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_host(this.swigCPtr, this, str), false);
        }

        public Builder iopInfo(MapStringString mapStringString) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_iopInfo(this.swigCPtr, this, MapStringString.getCPtr(mapStringString), mapStringString), false);
        }

        public Builder osVersion(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_osVersion(this.swigCPtr, this, str), false);
        }

        public Builder platform(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_platform(this.swigCPtr, this, str), false);
        }

        public Builder platformSdkVersion(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_platformSdkVersion(this.swigCPtr, this, str), false);
        }

        public Builder region(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_region(this.swigCPtr, this, str), false);
        }

        public Builder sdkVersion(String str) {
            return new Builder(DavinciResourceJniJNI.LokiResourceHandler_Builder_sdkVersion(this.swigCPtr, this, str), false);
        }

        public Builder(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                DavinciResourceJniJNI.delete_LokiResourceHandler(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void finalize() {
        delete();
    }

    public static long getCPtr(LokiResourceHandler lokiResourceHandler) {
        if (lokiResourceHandler == null) {
            return 0L;
        }
        return lokiResourceHandler.swigCPtr;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public boolean canHandle(DAVResource dAVResource) {
        return DavinciResourceJniJNI.LokiResourceHandler_canHandle(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public LokiResourceHandler(long j, boolean z) {
        super(DavinciResourceJniJNI.LokiResourceHandler_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public DAVResource fetchResourceFromCache(String str, MapStringString mapStringString) {
        long jLokiResourceHandler_fetchResourceFromCache = DavinciResourceJniJNI.LokiResourceHandler_fetchResourceFromCache(this.swigCPtr, this, str, MapStringString.getCPtr(mapStringString), mapStringString);
        if (jLokiResourceHandler_fetchResourceFromCache == 0) {
            return null;
        }
        return new DAVResource(jLokiResourceHandler_fetchResourceFromCache, true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void fetchBatchResource(VecPtrDAVResource vecPtrDAVResource, MapStringString mapStringString, DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback) {
        DavinciResourceJniJNI.LokiResourceHandler_fetchBatchResource(this.swigCPtr, this, VecPtrDAVResource.getCPtr(vecPtrDAVResource), vecPtrDAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVBatchResourceFetchCallback.getCPtr(dAVBatchResourceFetchCallback), dAVBatchResourceFetchCallback);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public long fetchResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.LokiResourceHandler_fetchResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }
}
