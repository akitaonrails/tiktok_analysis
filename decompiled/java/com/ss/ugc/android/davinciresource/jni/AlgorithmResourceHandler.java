package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class AlgorithmResourceHandler extends DAVResourceHandler {
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
                    DavinciResourceJniJNI.delete_AlgorithmResourceHandler_Builder(j);
                }
                this.swigCPtr = 0L;
            }
        }

        public AlgorithmResourceHandler build() {
            long jAlgorithmResourceHandler_Builder_build = DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_build(this.swigCPtr, this);
            if (jAlgorithmResourceHandler_Builder_build == 0) {
                return null;
            }
            return new AlgorithmResourceHandler(jAlgorithmResourceHandler_Builder_build, true);
        }

        public Builder() {
            this(DavinciResourceJniJNI.new_AlgorithmResourceHandler_Builder(), true);
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
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_accessKey(this.swigCPtr, this, str), false);
        }

        public Builder appID(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_appID(this.swigCPtr, this, str), false);
        }

        public Builder appLanguage(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_appLanguage(this.swigCPtr, this, str), false);
        }

        public Builder appVersion(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_appVersion(this.swigCPtr, this, str), false);
        }

        public Builder busiId(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_busiId(this.swigCPtr, this, str), false);
        }

        public Builder cacheDir(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_cacheDir(this.swigCPtr, this, str), false);
        }

        public Builder deviceId(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_deviceId(this.swigCPtr, this, str), false);
        }

        public Builder deviceInfo(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_deviceInfo(this.swigCPtr, this, str), false);
        }

        public Builder deviceType(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_deviceType(this.swigCPtr, this, str), false);
        }

        public Builder gpu(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_gpu(this.swigCPtr, this, str), false);
        }

        public Builder host(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_host(this.swigCPtr, this, str), false);
        }

        public Builder iopInfo(MapStringString mapStringString) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_iopInfo(this.swigCPtr, this, MapStringString.getCPtr(mapStringString), mapStringString), false);
        }

        public Builder osVersion(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_osVersion(this.swigCPtr, this, str), false);
        }

        public Builder platform(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_platform(this.swigCPtr, this, str), false);
        }

        public Builder platformSdkVersion(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_platformSdkVersion(this.swigCPtr, this, str), false);
        }

        public Builder region(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_region(this.swigCPtr, this, str), false);
        }

        public Builder sdkVersion(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_sdkVersion(this.swigCPtr, this, str), false);
        }

        public Builder status(String str) {
            return new Builder(DavinciResourceJniJNI.AlgorithmResourceHandler_Builder_status(this.swigCPtr, this, str), false);
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
                DavinciResourceJniJNI.delete_AlgorithmResourceHandler(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void finalize() {
        delete();
    }

    public static long getCPtr(AlgorithmResourceHandler algorithmResourceHandler) {
        if (algorithmResourceHandler == null) {
            return 0L;
        }
        return algorithmResourceHandler.swigCPtr;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public boolean canHandle(DAVResource dAVResource) {
        return DavinciResourceJniJNI.AlgorithmResourceHandler_canHandle(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public DAVResource fetchResourceFromCache(String str) {
        long jAlgorithmResourceHandler_fetchResourceFromCache__SWIG_1 = DavinciResourceJniJNI.AlgorithmResourceHandler_fetchResourceFromCache__SWIG_1(this.swigCPtr, this, str);
        if (jAlgorithmResourceHandler_fetchResourceFromCache__SWIG_1 == 0) {
            return null;
        }
        return new DAVResource(jAlgorithmResourceHandler_fetchResourceFromCache__SWIG_1, true);
    }

    public String findModelUri(String str) {
        return DavinciResourceJniJNI.AlgorithmResourceHandler_findModelUri(this.swigCPtr, this, str);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public AlgorithmResourceHandler(long j, boolean z) {
        super(DavinciResourceJniJNI.AlgorithmResourceHandler_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public DAVResource fetchResourceFromCache(String str, MapStringString mapStringString) {
        long jAlgorithmResourceHandler_fetchResourceFromCache__SWIG_0 = DavinciResourceJniJNI.AlgorithmResourceHandler_fetchResourceFromCache__SWIG_0(this.swigCPtr, this, str, MapStringString.getCPtr(mapStringString), mapStringString);
        if (jAlgorithmResourceHandler_fetchResourceFromCache__SWIG_0 == 0) {
            return null;
        }
        return new DAVResource(jAlgorithmResourceHandler_fetchResourceFromCache__SWIG_0, true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public long fetchResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.AlgorithmResourceHandler_fetchResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }
}
