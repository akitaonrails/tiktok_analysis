package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class MaterialResourceConfig {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_MaterialResourceConfig(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getAc() {
        return DavinciResourceJniJNI.MaterialResourceConfig_ac_get(this.swigCPtr, this);
    }

    public String getAccessKey() {
        return DavinciResourceJniJNI.MaterialResourceConfig_accessKey_get(this.swigCPtr, this);
    }

    public String getAppId() {
        return DavinciResourceJniJNI.MaterialResourceConfig_appId_get(this.swigCPtr, this);
    }

    public String getAppName() {
        return DavinciResourceJniJNI.MaterialResourceConfig_appName_get(this.swigCPtr, this);
    }

    public String getAppVersion() {
        return DavinciResourceJniJNI.MaterialResourceConfig_appVersion_get(this.swigCPtr, this);
    }

    public String getCacheDir() {
        return DavinciResourceJniJNI.MaterialResourceConfig_cacheDir_get(this.swigCPtr, this);
    }

    public String getDeviceId() {
        return DavinciResourceJniJNI.MaterialResourceConfig_deviceId_get(this.swigCPtr, this);
    }

    public String getDevicePlatform() {
        return DavinciResourceJniJNI.MaterialResourceConfig_devicePlatform_get(this.swigCPtr, this);
    }

    public String getDeviceType() {
        return DavinciResourceJniJNI.MaterialResourceConfig_deviceType_get(this.swigCPtr, this);
    }

    public String getHost() {
        return DavinciResourceJniJNI.MaterialResourceConfig_host_get(this.swigCPtr, this);
    }

    public int getStatus() {
        return DavinciResourceJniJNI.MaterialResourceConfig_status_get(this.swigCPtr, this);
    }

    public String getTag() {
        return DavinciResourceJniJNI.MaterialResourceConfig_tag_get(this.swigCPtr, this);
    }

    public String getUserId() {
        return DavinciResourceJniJNI.MaterialResourceConfig_userId_get(this.swigCPtr, this);
    }

    public MaterialResourceConfig() {
        this(DavinciResourceJniJNI.new_MaterialResourceConfig(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(MaterialResourceConfig materialResourceConfig) {
        if (materialResourceConfig == null) {
            return 0L;
        }
        return materialResourceConfig.swigCPtr;
    }

    public void setAc(String str) {
        DavinciResourceJniJNI.MaterialResourceConfig_ac_set(this.swigCPtr, this, str);
    }

    public void setAccessKey(String str) {
        DavinciResourceJniJNI.MaterialResourceConfig_accessKey_set(this.swigCPtr, this, str);
    }

    public void setAppId(String str) {
        DavinciResourceJniJNI.MaterialResourceConfig_appId_set(this.swigCPtr, this, str);
    }

    public void setAppName(String str) {
        DavinciResourceJniJNI.MaterialResourceConfig_appName_set(this.swigCPtr, this, str);
    }

    public void setAppVersion(String str) {
        DavinciResourceJniJNI.MaterialResourceConfig_appVersion_set(this.swigCPtr, this, str);
    }

    public void setCacheDir(String str) {
        DavinciResourceJniJNI.MaterialResourceConfig_cacheDir_set(this.swigCPtr, this, str);
    }

    public void setDeviceId(String str) {
        DavinciResourceJniJNI.MaterialResourceConfig_deviceId_set(this.swigCPtr, this, str);
    }

    public void setDevicePlatform(String str) {
        DavinciResourceJniJNI.MaterialResourceConfig_devicePlatform_set(this.swigCPtr, this, str);
    }

    public void setDeviceType(String str) {
        DavinciResourceJniJNI.MaterialResourceConfig_deviceType_set(this.swigCPtr, this, str);
    }

    public void setHost(String str) {
        DavinciResourceJniJNI.MaterialResourceConfig_host_set(this.swigCPtr, this, str);
    }

    public void setStatus(int i) {
        DavinciResourceJniJNI.MaterialResourceConfig_status_set(this.swigCPtr, this, i);
    }

    public void setTag(String str) {
        DavinciResourceJniJNI.MaterialResourceConfig_tag_set(this.swigCPtr, this, str);
    }

    public void setUserId(String str) {
        DavinciResourceJniJNI.MaterialResourceConfig_userId_set(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public MaterialResourceConfig(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
