package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public interface INLERhythmPointRuntime {
    int beginGenVideoFrames(int i, INLEListenerBeginVideoFrame iNLEListenerBeginVideoFrame);

    int beginGenVideoFrames(String str, INLEListenerBeginVideoFrame iNLEListenerBeginVideoFrame);

    int cancelGenVideoFrame(int i);

    int cancelGenVideoFrame(String str);

    int genRandomSolve();

    int genSmartCutting();

    VecNLEClipAlgorithmParam getAllVideoRangeData();

    int initBingoAlgorithm();

    int removeAllVideoSound();

    int removeMusic(int i);

    int restoreAllVideoSound();

    int setMusicAndResult(String str, int i, int i2, NLEAlgorithmPath nLEAlgorithmPath);

    void setMusicAndResultAsync(String str, int i, int i2, NLEAlgorithmPath nLEAlgorithmPath, INLEListenerAsyncOnDone iNLEListenerAsyncOnDone);

    int updateAlgorithmFromNormal();
}
