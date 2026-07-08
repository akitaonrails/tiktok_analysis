package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public class NLEExporterController {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEExporterController(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int cancelCompile() {
        return NLEMediaPublicJniJNI.NLEExporterController_cancelCompile(this.swigCPtr, this);
    }

    public int destroyCompiler() {
        return NLEMediaPublicJniJNI.NLEExporterController_destroyCompiler(this.swigCPtr, this);
    }

    public String getAudioMatrixResult() {
        return NLEMediaPublicJniJNI.NLEExporterController_getAudioMatrixResult(this.swigCPtr, this);
    }

    public NLECompileResult getCompileResult() {
        return new NLECompileResult(NLEMediaPublicJniJNI.NLEExporterController_getCompileResult(this.swigCPtr, this), true);
    }

    public String getCompileStuckResult() {
        return NLEMediaPublicJniJNI.NLEExporterController_getCompileStuckResult(this.swigCPtr, this);
    }

    public VecString getDenoiseSnrResults() {
        return new VecString(NLEMediaPublicJniJNI.NLEExporterController_getDenoiseSnrResults(this.swigCPtr, this), true);
    }

    public int isWatermarkCompileEncode() {
        return NLEMediaPublicJniJNI.NLEExporterController_isWatermarkCompileEncode(this.swigCPtr, this);
    }

    public void pauseCompile() {
        NLEMediaPublicJniJNI.NLEExporterController_pauseCompile(this.swigCPtr, this);
    }

    public void resumeCompile() {
        NLEMediaPublicJniJNI.NLEExporterController_resumeCompile(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEExporterController nLEExporterController) {
        if (nLEExporterController == null) {
            return 0L;
        }
        return nLEExporterController.swigCPtr;
    }

    public int getCompileLevel(NLEVideoEncodeSettings nLEVideoEncodeSettings) {
        return NLEMediaPublicJniJNI.NLEExporterController_getCompileLevel(this.swigCPtr, this, NLEVideoEncodeSettings.getCPtr(nLEVideoEncodeSettings), nLEVideoEncodeSettings);
    }

    public int getRemuxErrorCode(NLEVideoEncodeSettings nLEVideoEncodeSettings) {
        return NLEMediaPublicJniJNI.NLEExporterController_getRemuxErrorCode(this.swigCPtr, this, NLEVideoEncodeSettings.getCPtr(nLEVideoEncodeSettings), nLEVideoEncodeSettings);
    }

    public boolean isEnableRemuxVideo(NLEVideoEncodeSettings nLEVideoEncodeSettings) {
        return NLEMediaPublicJniJNI.NLEExporterController_isEnableRemuxVideo(this.swigCPtr, this, NLEVideoEncodeSettings.getCPtr(nLEVideoEncodeSettings), nLEVideoEncodeSettings);
    }

    public void setCompileDumpFilePath(String str) {
        NLEMediaPublicJniJNI.NLEExporterController_setCompileDumpFilePath(this.swigCPtr, this, str);
    }

    public void setDownloadNetSpeed(int i) {
        NLEMediaPublicJniJNI.NLEExporterController_setDownloadNetSpeed(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEExporterController(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean compile(String str, NLEVideoEncodeSettings nLEVideoEncodeSettings) {
        return NLEMediaPublicJniJNI.NLEExporterController_compile__SWIG_0(this.swigCPtr, this, str, NLEVideoEncodeSettings.getCPtr(nLEVideoEncodeSettings), nLEVideoEncodeSettings);
    }

    public boolean compileOnlyAudio(String str, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings) {
        return NLEMediaPublicJniJNI.NLEExporterController_compileOnlyAudio(this.swigCPtr, this, str, NLEAudioCompileEncodeSettings.getCPtr(nLEAudioCompileEncodeSettings), nLEAudioCompileEncodeSettings);
    }

    public void setSmartRecodeParam(boolean z, int i) {
        NLEMediaPublicJniJNI.NLEExporterController_setSmartRecodeParam(this.swigCPtr, this, z, i);
    }

    public boolean compile(String str, NLEVideoEncodeSettings nLEVideoEncodeSettings, NLECompileListenerWrapper nLECompileListenerWrapper) {
        return NLEMediaPublicJniJNI.NLEExporterController_compile__SWIG_2(this.swigCPtr, this, str, NLEVideoEncodeSettings.getCPtr(nLEVideoEncodeSettings), nLEVideoEncodeSettings, NLECompileListenerWrapper.getCPtr(nLECompileListenerWrapper), nLECompileListenerWrapper);
    }

    public boolean compile(String str, String str2, NLEVideoEncodeSettings nLEVideoEncodeSettings) {
        return NLEMediaPublicJniJNI.NLEExporterController_compile__SWIG_1(this.swigCPtr, this, str, str2, NLEVideoEncodeSettings.getCPtr(nLEVideoEncodeSettings), nLEVideoEncodeSettings);
    }

    public boolean compile(String str, String str2, NLEVideoEncodeSettings nLEVideoEncodeSettings, NLECompileListenerWrapper nLECompileListenerWrapper) {
        return NLEMediaPublicJniJNI.NLEExporterController_compile__SWIG_3(this.swigCPtr, this, str, str2, NLEVideoEncodeSettings.getCPtr(nLEVideoEncodeSettings), nLEVideoEncodeSettings, NLECompileListenerWrapper.getCPtr(nLECompileListenerWrapper), nLECompileListenerWrapper);
    }
}
