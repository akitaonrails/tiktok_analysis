package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class ArtistResourceHandler extends DAVResourceHandler {
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
                    DavinciResourceJniJNI.delete_ArtistResourceHandler_Builder(j);
                }
                this.swigCPtr = 0L;
            }
        }

        public ArtistResourceHandler build() {
            long jArtistResourceHandler_Builder_build = DavinciResourceJniJNI.ArtistResourceHandler_Builder_build(this.swigCPtr, this);
            if (jArtistResourceHandler_Builder_build == 0) {
                return null;
            }
            return new ArtistResourceHandler(jArtistResourceHandler_Builder_build, true);
        }

        public Builder() {
            this(DavinciResourceJniJNI.new_ArtistResourceHandler_Builder(), true);
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

        public Builder appID(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_appID(this.swigCPtr, this, str), false);
        }

        public Builder appName(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_appName(this.swigCPtr, this, str), false);
        }

        public Builder appVersion(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_appVersion(this.swigCPtr, this, str), false);
        }

        public Builder artistSDKVersion(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_artistSDKVersion(this.swigCPtr, this, str), false);
        }

        public Builder cacheDir(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_cacheDir(this.swigCPtr, this, str), false);
        }

        public Builder channel(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_channel(this.swigCPtr, this, str), false);
        }

        public Builder deviceId(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_deviceId(this.swigCPtr, this, str), false);
        }

        public Builder devicePlatform(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_devicePlatform(this.swigCPtr, this, str), false);
        }

        public Builder deviceType(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_deviceType(this.swigCPtr, this, str), false);
        }

        public Builder effectSDKVersion(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_effectSDKVersion(this.swigCPtr, this, str), false);
        }

        public Builder host(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_host(this.swigCPtr, this, str), false);
        }

        public Builder language(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_language(this.swigCPtr, this, str), false);
        }

        public Builder region(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_region(this.swigCPtr, this, str), false);
        }

        public Builder resolution(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_resolution(this.swigCPtr, this, str), false);
        }

        public Builder updateVersionCode(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_updateVersionCode(this.swigCPtr, this, str), false);
        }

        public Builder versionCode(String str) {
            return new Builder(DavinciResourceJniJNI.ArtistResourceHandler_Builder_versionCode(this.swigCPtr, this, str), false);
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
                DavinciResourceJniJNI.delete_ArtistResourceHandler(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void finalize() {
        delete();
    }

    public static long getCPtr(ArtistResourceHandler artistResourceHandler) {
        if (artistResourceHandler == null) {
            return 0L;
        }
        return artistResourceHandler.swigCPtr;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public boolean canHandle(DAVResource dAVResource) {
        return DavinciResourceJniJNI.ArtistResourceHandler_canHandle(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public ArtistResourceHandler(long j, boolean z) {
        super(DavinciResourceJniJNI.ArtistResourceHandler_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public DAVResource fetchResourceFromCache(String str, MapStringString mapStringString) {
        long jArtistResourceHandler_fetchResourceFromCache = DavinciResourceJniJNI.ArtistResourceHandler_fetchResourceFromCache(this.swigCPtr, this, str, MapStringString.getCPtr(mapStringString), mapStringString);
        if (jArtistResourceHandler_fetchResourceFromCache == 0) {
            return null;
        }
        return new DAVResource(jArtistResourceHandler_fetchResourceFromCache, true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public void fetchBatchResource(VecPtrDAVResource vecPtrDAVResource, MapStringString mapStringString, DAVBatchResourceFetchCallback dAVBatchResourceFetchCallback) {
        DavinciResourceJniJNI.ArtistResourceHandler_fetchBatchResource(this.swigCPtr, this, VecPtrDAVResource.getCPtr(vecPtrDAVResource), vecPtrDAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVBatchResourceFetchCallback.getCPtr(dAVBatchResourceFetchCallback), dAVBatchResourceFetchCallback);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceHandler
    public long fetchResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.ArtistResourceHandler_fetchResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }
}
