package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEMediaConfig {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEMediaConfig(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getContentType() {
        return NLEMediaJniJNI.NLEMediaConfig_contentType_get(this.swigCPtr, this);
    }

    public String getDefaultFontPath() {
        return NLEMediaJniJNI.NLEMediaConfig_defaultFontPath_get(this.swigCPtr, this);
    }

    public boolean getDeleteBeforeAddingEffect() {
        return NLEMediaJniJNI.NLEMediaConfig_deleteBeforeAddingEffect_get(this.swigCPtr, this);
    }

    public boolean getEnableCatchExceptionInCallback() {
        return NLEMediaJniJNI.NLEMediaConfig_enableCatchExceptionInCallback_get(this.swigCPtr, this);
    }

    public boolean getEnableCoexistGlobalEffect() {
        return NLEMediaJniJNI.NLEMediaConfig_enableCoexistGlobalEffect_get(this.swigCPtr, this);
    }

    public boolean getEnableDestroyingCheck() {
        return NLEMediaJniJNI.NLEMediaConfig_enableDestroyingCheck_get(this.swigCPtr, this);
    }

    public boolean getEnableGetStateLock() {
        return NLEMediaJniJNI.NLEMediaConfig_enableGetStateLock_get(this.swigCPtr, this);
    }

    public boolean getEnableImageTemplateConfig() {
        return NLEMediaJniJNI.NLEMediaConfig_enableImageTemplateConfig_get(this.swigCPtr, this);
    }

    public boolean getEnableLockSeekInVESwingMode() {
        return NLEMediaJniJNI.NLEMediaConfig_enableLockSeekInVESwingMode_get(this.swigCPtr, this);
    }

    public boolean getEnableLogExecutor() {
        return NLEMediaJniJNI.NLEMediaConfig_enableLogExecutor_get(this.swigCPtr, this);
    }

    public boolean getEnableReleaseSurfaceLock() {
        return NLEMediaJniJNI.NLEMediaConfig_enableReleaseSurfaceLock_get(this.swigCPtr, this);
    }

    public boolean getEnableResourceAsyncRender() {
        return NLEMediaJniJNI.NLEMediaConfig_enableResourceAsyncRender_get(this.swigCPtr, this);
    }

    public boolean getEnableStickerMode() {
        return NLEMediaJniJNI.NLEMediaConfig_enableStickerMode_get(this.swigCPtr, this);
    }

    public boolean getEnableVEOperationEvent() {
        return NLEMediaJniJNI.NLEMediaConfig_enableVEOperationEvent_get(this.swigCPtr, this);
    }

    public boolean getForCanvasMode() {
        return NLEMediaJniJNI.NLEMediaConfig_forCanvasMode_get(this.swigCPtr, this);
    }

    public boolean getLockSetDataSourceAndDestroy() {
        return NLEMediaJniJNI.NLEMediaConfig_lockSetDataSourceAndDestroy_get(this.swigCPtr, this);
    }

    public double getMaxFps() {
        return NLEMediaJniJNI.NLEMediaConfig_maxFps_get(this.swigCPtr, this);
    }

    public LogLevel getMediaLogLevel() {
        return LogLevel.swigToEnum(NLEMediaJniJNI.NLEMediaConfig_mediaLogLevel_get(this.swigCPtr, this));
    }

    public double getMinFps() {
        return NLEMediaJniJNI.NLEMediaConfig_minFps_get(this.swigCPtr, this);
    }

    public String getModelPath() {
        return NLEMediaJniJNI.NLEMediaConfig_modelPath_get(this.swigCPtr, this);
    }

    public int getNleImageLinearLayoutShortEdgeMaxLength() {
        return NLEMediaJniJNI.NLEMediaConfig_nleImageLinearLayoutShortEdgeMaxLength_get(this.swigCPtr, this);
    }

    public int getNleImageMaxRenderHeight() {
        return NLEMediaJniJNI.NLEMediaConfig_nleImageMaxRenderHeight_get(this.swigCPtr, this);
    }

    public int getNleImageMaxRenderWidth() {
        return NLEMediaJniJNI.NLEMediaConfig_nleImageMaxRenderWidth_get(this.swigCPtr, this);
    }

    public NLEMediaABConfig getNleMediaAbConfig() {
        long jNLEMediaConfig_nleMediaAbConfig_get = NLEMediaJniJNI.NLEMediaConfig_nleMediaAbConfig_get(this.swigCPtr, this);
        if (jNLEMediaConfig_nleMediaAbConfig_get == 0) {
            return null;
        }
        return new NLEMediaABConfig(jNLEMediaConfig_nleMediaAbConfig_get, true);
    }

    public NLEVEGlobalConfig getNleVEGlobalConfig() {
        long jNLEMediaConfig_nleVEGlobalConfig_get = NLEMediaJniJNI.NLEMediaConfig_nleVEGlobalConfig_get(this.swigCPtr, this);
        if (jNLEMediaConfig_nleVEGlobalConfig_get == 0) {
            return null;
        }
        return new NLEVEGlobalConfig(jNLEMediaConfig_nleVEGlobalConfig_get, true);
    }

    public NLEVEUserConfig getNleVEUserConfig() {
        long jNLEMediaConfig_nleVEUserConfig_get = NLEMediaJniJNI.NLEMediaConfig_nleVEUserConfig_get(this.swigCPtr, this);
        if (jNLEMediaConfig_nleVEUserConfig_get == 0) {
            return null;
        }
        return new NLEVEUserConfig(jNLEMediaConfig_nleVEUserConfig_get, true);
    }

    public boolean getReUseFirstAVInfo() {
        return NLEMediaJniJNI.NLEMediaConfig_reUseFirstAVInfo_get(this.swigCPtr, this);
    }

    public boolean getUsingDefaultFpsToMinus1() {
        return NLEMediaJniJNI.NLEMediaConfig_usingDefaultFpsToMinus1_get(this.swigCPtr, this);
    }

    public String getWorkSpace() {
        return NLEMediaJniJNI.NLEMediaConfig_workSpace_get(this.swigCPtr, this);
    }

    public NLEMediaConfig() {
        this(NLEMediaJniJNI.new_NLEMediaConfig(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaConfig nLEMediaConfig) {
        if (nLEMediaConfig == null) {
            return 0L;
        }
        return nLEMediaConfig.swigCPtr;
    }

    public void setContentType(String str) {
        NLEMediaJniJNI.NLEMediaConfig_contentType_set(this.swigCPtr, this, str);
    }

    public void setDefaultFontPath(String str) {
        NLEMediaJniJNI.NLEMediaConfig_defaultFontPath_set(this.swigCPtr, this, str);
    }

    public void setDeleteBeforeAddingEffect(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_deleteBeforeAddingEffect_set(this.swigCPtr, this, z);
    }

    public void setEnableCatchExceptionInCallback(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_enableCatchExceptionInCallback_set(this.swigCPtr, this, z);
    }

    public void setEnableCoexistGlobalEffect(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_enableCoexistGlobalEffect_set(this.swigCPtr, this, z);
    }

    public void setEnableDestroyingCheck(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_enableDestroyingCheck_set(this.swigCPtr, this, z);
    }

    public void setEnableGetStateLock(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_enableGetStateLock_set(this.swigCPtr, this, z);
    }

    public void setEnableImageTemplateConfig(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_enableImageTemplateConfig_set(this.swigCPtr, this, z);
    }

    public void setEnableLockSeekInVESwingMode(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_enableLockSeekInVESwingMode_set(this.swigCPtr, this, z);
    }

    public void setEnableLogExecutor(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_enableLogExecutor_set(this.swigCPtr, this, z);
    }

    public void setEnableReleaseSurfaceLock(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_enableReleaseSurfaceLock_set(this.swigCPtr, this, z);
    }

    public void setEnableResourceAsyncRender(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_enableResourceAsyncRender_set(this.swigCPtr, this, z);
    }

    public void setEnableStickerMode(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_enableStickerMode_set(this.swigCPtr, this, z);
    }

    public void setEnableVEOperationEvent(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_enableVEOperationEvent_set(this.swigCPtr, this, z);
    }

    public void setForCanvasMode(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_forCanvasMode_set(this.swigCPtr, this, z);
    }

    public void setLockSetDataSourceAndDestroy(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_lockSetDataSourceAndDestroy_set(this.swigCPtr, this, z);
    }

    public void setMaxFps(double d) {
        NLEMediaJniJNI.NLEMediaConfig_maxFps_set(this.swigCPtr, this, d);
    }

    public void setMediaLogLevel(LogLevel logLevel) {
        NLEMediaJniJNI.NLEMediaConfig_mediaLogLevel_set(this.swigCPtr, this, logLevel.swigValue());
    }

    public void setMinFps(double d) {
        NLEMediaJniJNI.NLEMediaConfig_minFps_set(this.swigCPtr, this, d);
    }

    public void setModelPath(String str) {
        NLEMediaJniJNI.NLEMediaConfig_modelPath_set(this.swigCPtr, this, str);
    }

    public void setNleImageLinearLayoutShortEdgeMaxLength(int i) {
        NLEMediaJniJNI.NLEMediaConfig_nleImageLinearLayoutShortEdgeMaxLength_set(this.swigCPtr, this, i);
    }

    public void setNleImageMaxRenderHeight(int i) {
        NLEMediaJniJNI.NLEMediaConfig_nleImageMaxRenderHeight_set(this.swigCPtr, this, i);
    }

    public void setNleImageMaxRenderWidth(int i) {
        NLEMediaJniJNI.NLEMediaConfig_nleImageMaxRenderWidth_set(this.swigCPtr, this, i);
    }

    public void setNleMediaAbConfig(NLEMediaABConfig nLEMediaABConfig) {
        NLEMediaJniJNI.NLEMediaConfig_nleMediaAbConfig_set(this.swigCPtr, this, NLEMediaABConfig.getCPtr(nLEMediaABConfig), nLEMediaABConfig);
    }

    public void setNleVEGlobalConfig(NLEVEGlobalConfig nLEVEGlobalConfig) {
        NLEMediaJniJNI.NLEMediaConfig_nleVEGlobalConfig_set(this.swigCPtr, this, NLEVEGlobalConfig.getCPtr(nLEVEGlobalConfig), nLEVEGlobalConfig);
    }

    public void setNleVEUserConfig(NLEVEUserConfig nLEVEUserConfig) {
        NLEMediaJniJNI.NLEMediaConfig_nleVEUserConfig_set(this.swigCPtr, this, NLEVEUserConfig.getCPtr(nLEVEUserConfig), nLEVEUserConfig);
    }

    public void setReUseFirstAVInfo(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_reUseFirstAVInfo_set(this.swigCPtr, this, z);
    }

    public void setUsingDefaultFpsToMinus1(boolean z) {
        NLEMediaJniJNI.NLEMediaConfig_usingDefaultFpsToMinus1_set(this.swigCPtr, this, z);
    }

    public void setWorkSpace(String str) {
        NLEMediaJniJNI.NLEMediaConfig_workSpace_set(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMediaConfig(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
