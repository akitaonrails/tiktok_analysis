package com.bytedance.realx.video.memory;

import android.opengl.EGLContext;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoScaleFilter;

/* JADX INFO: loaded from: classes21.dex */
public abstract class RXVideoTextureMemory extends RTCVideoMemory {
    public abstract EGLContext getEGLContext();

    public abstract long getNativeEGLContext();

    public abstract RXVideoScaleFilter getScaleFilter();

    public abstract int getTextureId();

    public abstract float[] getTextureMatrix();

    public abstract RXPixelFormat getTextureTarget();

    public abstract int getUnScaledHeight();

    public abstract int getUnScaledWidth();
}
