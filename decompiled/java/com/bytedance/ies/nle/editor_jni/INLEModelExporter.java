package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public interface INLEModelExporter {
    int cancelExport();

    int exportModel(NLEModel nLEModel, String str, NLEVideoEncodeSettings nLEVideoEncodeSettings, String str2);

    int setCompileListener(INLEModelExporterListener iNLEModelExporterListener);
}
