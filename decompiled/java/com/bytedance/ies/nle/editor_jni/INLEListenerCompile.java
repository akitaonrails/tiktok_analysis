package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public interface INLEListenerCompile {
    void onCompileDone();

    void onCompileError(int i, int i2, float f, String str);

    void onCompileProgress(float f);
}
