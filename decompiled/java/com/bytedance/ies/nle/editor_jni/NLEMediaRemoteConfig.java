package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEMediaRemoteConfig {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaRemoteJniJNI.delete_NLEMediaRemoteConfig(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getAccessKey() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_accessKey_get(this.swigCPtr, this);
    }

    public String getApplication() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_application_get(this.swigCPtr, this);
    }

    public String getArea() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_area_get(this.swigCPtr, this);
    }

    public NLEMediaRemoteCacheStrategy getCacheStrategy() {
        return NLEMediaRemoteCacheStrategy.swigToEnum(NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_cacheStrategy_get(this.swigCPtr, this));
    }

    public MapStrStr getControlParams() {
        long jNLEMediaRemoteConfig_controlParams_get = NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_controlParams_get(this.swigCPtr, this);
        if (jNLEMediaRemoteConfig_controlParams_get == 0) {
            return null;
        }
        return new MapStrStr(jNLEMediaRemoteConfig_controlParams_get, false);
    }

    public String getDate() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_date_get(this.swigCPtr, this);
    }

    public String getEditAction() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_editAction_get(this.swigCPtr, this);
    }

    public int getGetProgressTaskInternalMs() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_getProgressTaskInternalMs_get(this.swigCPtr, this);
    }

    public String getHost() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_host_get(this.swigCPtr, this);
    }

    public int getRequestTimeOutSecond() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_requestTimeOutSecond_get(this.swigCPtr, this);
    }

    public String getScene() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_scene_get(this.swigCPtr, this);
    }

    public String getSecretAccessKey() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_secretAccessKey_get(this.swigCPtr, this);
    }

    public String getService() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_service_get(this.swigCPtr, this);
    }

    public String getSessionToken() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_sessionToken_get(this.swigCPtr, this);
    }

    public String getTaskList() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_taskList_get(this.swigCPtr, this);
    }

    public String getUploadStoreType() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_uploadStoreType_get(this.swigCPtr, this);
    }

    public String getUploader() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_uploader_get(this.swigCPtr, this);
    }

    public String getUser() {
        return NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_user_get(this.swigCPtr, this);
    }

    public NLEMediaRemoteConfig() {
        this(NLEMediaRemoteJniJNI.new_NLEMediaRemoteConfig(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaRemoteConfig nLEMediaRemoteConfig) {
        if (nLEMediaRemoteConfig == null) {
            return 0L;
        }
        return nLEMediaRemoteConfig.swigCPtr;
    }

    public void setAccessKey(String str) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_accessKey_set(this.swigCPtr, this, str);
    }

    public void setApplication(String str) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_application_set(this.swigCPtr, this, str);
    }

    public void setArea(String str) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_area_set(this.swigCPtr, this, str);
    }

    public void setCacheStrategy(NLEMediaRemoteCacheStrategy nLEMediaRemoteCacheStrategy) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_cacheStrategy_set(this.swigCPtr, this, nLEMediaRemoteCacheStrategy.swigValue());
    }

    public void setControlParams(MapStrStr mapStrStr) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_controlParams_set(this.swigCPtr, this, MapStrStr.getCPtr(mapStrStr), mapStrStr);
    }

    public void setDate(String str) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_date_set(this.swigCPtr, this, str);
    }

    public void setEditAction(String str) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_editAction_set(this.swigCPtr, this, str);
    }

    public void setGetProgressTaskInternalMs(int i) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_getProgressTaskInternalMs_set(this.swigCPtr, this, i);
    }

    public void setHost(String str) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_host_set(this.swigCPtr, this, str);
    }

    public void setRequestTimeOutSecond(int i) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_requestTimeOutSecond_set(this.swigCPtr, this, i);
    }

    public void setScene(String str) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_scene_set(this.swigCPtr, this, str);
    }

    public void setSecretAccessKey(String str) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_secretAccessKey_set(this.swigCPtr, this, str);
    }

    public void setService(String str) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_service_set(this.swigCPtr, this, str);
    }

    public void setSessionToken(String str) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_sessionToken_set(this.swigCPtr, this, str);
    }

    public void setTaskList(String str) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_taskList_set(this.swigCPtr, this, str);
    }

    public void setUploadStoreType(String str) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_uploadStoreType_set(this.swigCPtr, this, str);
    }

    public void setUploader(String str) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_uploader_set(this.swigCPtr, this, str);
    }

    public void setUser(String str) {
        NLEMediaRemoteJniJNI.NLEMediaRemoteConfig_user_set(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMediaRemoteConfig(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
