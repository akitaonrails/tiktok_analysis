package com.bytedance.codecx.video.memory;

import android.graphics.Matrix;
import android.opengl.EGLContext;
import com.bytedance.codecx.video.CodecXVideoRotation;
import com.bytedance.codecx.video.CodecXVideoScaleFilter;

/* JADX INFO: loaded from: classes21.dex */
public interface CodecXVideoOpenGLMemoryInterface extends CodecXVideoMemoryInterface {
    Matrix getAndroidTextureMatrix();

    EGLContext getEGLContext();

    long getGLSync();

    long getNativeEGLContext();

    CodecXVideoRotation getRotation();

    CodecXVideoScaleFilter getScaleFilter();

    int getTextureId();

    float[] getTextureMatrix();

    int getUnScaledHeight();

    int getUnScaledWidth();
}
