package com.ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes21.dex */
public interface ITextureBuffer {
    int getTextureId();

    int getTypeGlTarget();

    float[] nativeGetTransFormMatrix();

    void release();

    void retain();
}
