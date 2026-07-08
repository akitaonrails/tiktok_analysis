package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public interface INLEMediaSettings {
    int enableEffect(boolean z);

    void enableHighSpeedForSingle(boolean z);

    void enableImageEditor(boolean z);

    void enableSimpleProcessor(boolean z);

    int getPageMode();

    void setAutoPrepare(boolean z);

    int setDestroyVersion(boolean z);

    void setDldEnabled(boolean z);

    void setDldThrVal(int i);

    void setDleEnabled(boolean z);

    void setDleEnabledPreview(boolean z);

    int setDropFrameParam(boolean z, long j, int i);

    void setForceDetectForFirstFrameByClip(boolean z);

    void setImageResizeInfo(int i, int i2, NLEResFillMode nLEResFillMode, NLEResizeAlgorithm nLEResizeAlgorithm);

    void setLoopPlay(boolean z);

    void setPageMode(int i);

    int setPreviewFps(int i);

    int setPreviewFps(int i, boolean z);

    int setPreviewMaxFps(int i);

    int setSrcMaxHWRatio(float f);

    void setSurfaceReDraw(boolean z);
}
