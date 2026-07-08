package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public interface INLEExporter {
    int cancelCompile();

    boolean compile(String str, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    boolean compile(String str, NLEVideoEncodeSettings nLEVideoEncodeSettings, INLEListenerCompile iNLEListenerCompile);

    boolean compile(String str, String str2, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    boolean compile(String str, String str2, NLEVideoEncodeSettings nLEVideoEncodeSettings, INLEListenerCompile iNLEListenerCompile);

    boolean compileOnlyAudio(String str, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings, INLEListenerCompile iNLEListenerCompile);

    int destroyCompiler();

    String getAudioMatrixResult();

    int getCompileLevel(NLEVideoEncodeSettings nLEVideoEncodeSettings);

    NLECompileResult getCompileResult();

    String getCompileStuckResult();

    VecString getDenoiseSnrResults();

    int getRemuxErrorCode(NLEVideoEncodeSettings nLEVideoEncodeSettings);

    boolean isEnableRemuxVideo(NLEVideoEncodeSettings nLEVideoEncodeSettings);

    int isWatermarkCompileEncode();

    void pauseCompile();

    void releaseNLEResources();

    void resumeCompile();

    void setCompileDumpFilePath(String str);

    void setDownloadNetSpeed(int i);

    void setOptimizeListenerRelease(Boolean bool);

    void setSmartRecodeParam(boolean z, int i);
}
