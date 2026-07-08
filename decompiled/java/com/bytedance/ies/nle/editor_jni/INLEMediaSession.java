package com.bytedance.ies.nle.editor_jni;

import android.view.SurfaceView;

/* JADX INFO: loaded from: classes6.dex */
public interface INLEMediaSession {
    INLERhythmPointRuntime getAlgorithmApi();

    INLEBrushRuntime getBrushApi();

    NLEModel getDataSource();

    INLEEffectRuntime getEffectApi();

    INLEExporter getExporterApi();

    INLEFilterRuntime getFilterApi();

    INLEMattingRuntime getMattingApi();

    NLEMediaConfig getMediaConfig();

    INLEMediaRuntime getMediaRuntimeApi();

    INLEMediaSettings getMediaSettingApi();

    INLEMetricsRuntime getMetricsApi();

    INLEPlayer getPlayerApi();

    INLEStickerRuntime getStickerApi();

    void setDataSource(NLEModel nLEModel);

    void setReuseFirstAVFileInfo(boolean z);

    void updateMediaConfig(NLEMediaConfig nLEMediaConfig);

    void updateNLEEditor(NLEEditor nLEEditor);

    void updateSurfaceView(SurfaceView surfaceView);
}
