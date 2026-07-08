package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class MusicResourceConfig {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_MusicResourceConfig(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getAid() {
        return DavinciResourceJniJNI.MusicResourceConfig_aid_get(this.swigCPtr, this);
    }

    public String getCacheDir() {
        return DavinciResourceJniJNI.MusicResourceConfig_cacheDir_get(this.swigCPtr, this);
    }

    public String getHost() {
        return DavinciResourceJniJNI.MusicResourceConfig_host_get(this.swigCPtr, this);
    }

    public String getLanguage() {
        return DavinciResourceJniJNI.MusicResourceConfig_language_get(this.swigCPtr, this);
    }

    public String getRegionKey() {
        return DavinciResourceJniJNI.MusicResourceConfig_regionKey_get(this.swigCPtr, this);
    }

    public MapStringString getRequestParam() {
        return new MapStringString(DavinciResourceJniJNI.MusicResourceConfig_getRequestParam(this.swigCPtr, this), true);
    }

    public MusicResourceConfig() {
        this(DavinciResourceJniJNI.new_MusicResourceConfig(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(MusicResourceConfig musicResourceConfig) {
        if (musicResourceConfig == null) {
            return 0L;
        }
        return musicResourceConfig.swigCPtr;
    }

    public void setAid(String str) {
        DavinciResourceJniJNI.MusicResourceConfig_aid_set(this.swigCPtr, this, str);
    }

    public void setCacheDir(String str) {
        DavinciResourceJniJNI.MusicResourceConfig_cacheDir_set(this.swigCPtr, this, str);
    }

    public void setHost(String str) {
        DavinciResourceJniJNI.MusicResourceConfig_host_set(this.swigCPtr, this, str);
    }

    public void setLanguage(String str) {
        DavinciResourceJniJNI.MusicResourceConfig_language_set(this.swigCPtr, this, str);
    }

    public void setRegionKey(String str) {
        DavinciResourceJniJNI.MusicResourceConfig_regionKey_set(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public MusicResourceConfig(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
