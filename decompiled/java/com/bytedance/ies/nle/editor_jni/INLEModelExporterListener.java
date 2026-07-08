package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public interface INLEModelExporterListener {
    void onCompileDone(NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody);

    void onCompileError(int i, int i2, float f, String str);

    void onCompileProgress(float f);

    void onCompileStart(NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody);
}
