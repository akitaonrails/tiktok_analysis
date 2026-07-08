package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class MediaResourceConfig {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_MediaResourceConfig(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean getAutoUnzip() {
        return DavinciResourceJniJNI.MediaResourceConfig_autoUnzip_get(this.swigCPtr, this);
    }

    public String getBiz_id() {
        return DavinciResourceJniJNI.MediaResourceConfig_biz_id_get(this.swigCPtr, this);
    }

    public String getCreativeCloudHost() {
        return DavinciResourceJniJNI.MediaResourceConfig_creativeCloudHost_get(this.swigCPtr, this);
    }

    public String getDefaultCacheDir() {
        return DavinciResourceJniJNI.MediaResourceConfig_defaultCacheDir_get(this.swigCPtr, this);
    }

    public String getDeviceId() {
        return DavinciResourceJniJNI.MediaResourceConfig_deviceId_get(this.swigCPtr, this);
    }

    public String getHost() {
        return DavinciResourceJniJNI.MediaResourceConfig_host_get(this.swigCPtr, this);
    }

    public String getUploadHost() {
        return DavinciResourceJniJNI.MediaResourceConfig_uploadHost_get(this.swigCPtr, this);
    }

    public MediaResourceConfig() {
        this(DavinciResourceJniJNI.new_MediaResourceConfig(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(MediaResourceConfig mediaResourceConfig) {
        if (mediaResourceConfig == null) {
            return 0L;
        }
        return mediaResourceConfig.swigCPtr;
    }

    public void setAutoUnzip(boolean z) {
        DavinciResourceJniJNI.MediaResourceConfig_autoUnzip_set(this.swigCPtr, this, z);
    }

    public void setBiz_id(String str) {
        DavinciResourceJniJNI.MediaResourceConfig_biz_id_set(this.swigCPtr, this, str);
    }

    public void setCreativeCloudHost(String str) {
        DavinciResourceJniJNI.MediaResourceConfig_creativeCloudHost_set(this.swigCPtr, this, str);
    }

    public void setDefaultCacheDir(String str) {
        DavinciResourceJniJNI.MediaResourceConfig_defaultCacheDir_set(this.swigCPtr, this, str);
    }

    public void setDeviceId(String str) {
        DavinciResourceJniJNI.MediaResourceConfig_deviceId_set(this.swigCPtr, this, str);
    }

    public void setHost(String str) {
        DavinciResourceJniJNI.MediaResourceConfig_host_set(this.swigCPtr, this, str);
    }

    public void setUploadHost(String str) {
        DavinciResourceJniJNI.MediaResourceConfig_uploadHost_set(this.swigCPtr, this, str);
    }

    public MediaResourceConfig(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
