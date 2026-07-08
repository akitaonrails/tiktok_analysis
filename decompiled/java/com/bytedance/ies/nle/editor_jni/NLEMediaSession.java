package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public class NLEMediaSession {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEMediaSession(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEAlgorithmController getAlgorithmApi() {
        long jNLEMediaSession_getAlgorithmApi = NLEMediaPublicJniJNI.NLEMediaSession_getAlgorithmApi(this.swigCPtr, this);
        if (jNLEMediaSession_getAlgorithmApi == 0) {
            return null;
        }
        return new NLEAlgorithmController(jNLEMediaSession_getAlgorithmApi, true);
    }

    public NLEBrushRuntimeController getBrushApi() {
        long jNLEMediaSession_getBrushApi = NLEMediaPublicJniJNI.NLEMediaSession_getBrushApi(this.swigCPtr, this);
        if (jNLEMediaSession_getBrushApi == 0) {
            return null;
        }
        return new NLEBrushRuntimeController(jNLEMediaSession_getBrushApi, true);
    }

    public NLEModel getDataSource() {
        long jNLEMediaSession_getDataSource = NLEMediaPublicJniJNI.NLEMediaSession_getDataSource(this.swigCPtr, this);
        if (jNLEMediaSession_getDataSource == 0) {
            return null;
        }
        return new NLEModel(jNLEMediaSession_getDataSource, true);
    }

    public NLEEffectRuntimeController getEffectApi() {
        long jNLEMediaSession_getEffectApi = NLEMediaPublicJniJNI.NLEMediaSession_getEffectApi(this.swigCPtr, this);
        if (jNLEMediaSession_getEffectApi == 0) {
            return null;
        }
        return new NLEEffectRuntimeController(jNLEMediaSession_getEffectApi, true);
    }

    public NLEExporterController getExporterApi() {
        long jNLEMediaSession_getExporterApi = NLEMediaPublicJniJNI.NLEMediaSession_getExporterApi(this.swigCPtr, this);
        if (jNLEMediaSession_getExporterApi == 0) {
            return null;
        }
        return new NLEExporterController(jNLEMediaSession_getExporterApi, true);
    }

    public NLEFilterRuntimeController getFilterApi() {
        long jNLEMediaSession_getFilterApi = NLEMediaPublicJniJNI.NLEMediaSession_getFilterApi(this.swigCPtr, this);
        if (jNLEMediaSession_getFilterApi == 0) {
            return null;
        }
        return new NLEFilterRuntimeController(jNLEMediaSession_getFilterApi, true);
    }

    public NLEMattingRuntimeController getMattingApi() {
        long jNLEMediaSession_getMattingApi = NLEMediaPublicJniJNI.NLEMediaSession_getMattingApi(this.swigCPtr, this);
        if (jNLEMediaSession_getMattingApi == 0) {
            return null;
        }
        return new NLEMattingRuntimeController(jNLEMediaSession_getMattingApi, true);
    }

    public NLEMediaConfig getMediaConfig() {
        long jNLEMediaSession_getMediaConfig = NLEMediaPublicJniJNI.NLEMediaSession_getMediaConfig(this.swigCPtr, this);
        if (jNLEMediaSession_getMediaConfig == 0) {
            return null;
        }
        return new NLEMediaConfig(jNLEMediaSession_getMediaConfig, true);
    }

    public NLEMediaRuntimeController getMediaRuntimeApi() {
        long jNLEMediaSession_getMediaRuntimeApi = NLEMediaPublicJniJNI.NLEMediaSession_getMediaRuntimeApi(this.swigCPtr, this);
        if (jNLEMediaSession_getMediaRuntimeApi == 0) {
            return null;
        }
        return new NLEMediaRuntimeController(jNLEMediaSession_getMediaRuntimeApi, true);
    }

    public NLEMediaSettingsController getMediaSettingApi() {
        long jNLEMediaSession_getMediaSettingApi = NLEMediaPublicJniJNI.NLEMediaSession_getMediaSettingApi(this.swigCPtr, this);
        if (jNLEMediaSession_getMediaSettingApi == 0) {
            return null;
        }
        return new NLEMediaSettingsController(jNLEMediaSession_getMediaSettingApi, true);
    }

    public NLEMetricsRuntimeController getMetricsApi() {
        long jNLEMediaSession_getMetricsApi = NLEMediaPublicJniJNI.NLEMediaSession_getMetricsApi(this.swigCPtr, this);
        if (jNLEMediaSession_getMetricsApi == 0) {
            return null;
        }
        return new NLEMetricsRuntimeController(jNLEMediaSession_getMetricsApi, true);
    }

    public NLEPlayer getPlayerApi() {
        long jNLEMediaSession_getPlayerApi = NLEMediaPublicJniJNI.NLEMediaSession_getPlayerApi(this.swigCPtr, this);
        if (jNLEMediaSession_getPlayerApi == 0) {
            return null;
        }
        return new NLEPlayer(jNLEMediaSession_getPlayerApi, true);
    }

    public NLEStickerController getStickerApi() {
        long jNLEMediaSession_getStickerApi = NLEMediaPublicJniJNI.NLEMediaSession_getStickerApi(this.swigCPtr, this);
        if (jNLEMediaSession_getStickerApi == 0) {
            return null;
        }
        return new NLEStickerController(jNLEMediaSession_getStickerApi, true);
    }

    public void finalize() {
        delete();
    }

    public NLEMediaSession(NLEMediaConfig nLEMediaConfig) {
        this(NLEMediaPublicJniJNI.new_NLEMediaSession(NLEMediaConfig.getCPtr(nLEMediaConfig), nLEMediaConfig), true);
    }

    public static long getCPtr(NLEMediaSession nLEMediaSession) {
        if (nLEMediaSession == null) {
            return 0L;
        }
        return nLEMediaSession.swigCPtr;
    }

    public void setDataSource(NLEModel nLEModel) {
        NLEMediaPublicJniJNI.NLEMediaSession_setDataSource(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel);
    }

    public void updateMediaConfig(NLEMediaConfig nLEMediaConfig) {
        NLEMediaPublicJniJNI.NLEMediaSession_updateMediaConfig(this.swigCPtr, this, NLEMediaConfig.getCPtr(nLEMediaConfig), nLEMediaConfig);
    }

    public NLEMediaSession(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
