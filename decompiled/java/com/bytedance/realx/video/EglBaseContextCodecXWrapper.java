package com.bytedance.realx.video;

import com.bytedance.codecx.video.EglBase;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.EglBase14;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes21.dex */
public class EglBaseContextCodecXWrapper implements EglBase.Context {
    public final EglBase.Context rxCtx;

    @Override // com.bytedance.codecx.video.EglBase.Context
    public EGLContext getEgl10Context() {
        return this.rxCtx.getEgl10Context();
    }

    @Override // com.bytedance.codecx.video.EglBase.Context
    public android.opengl.EGLContext getEgl14Context() {
        EglBase.Context context = this.rxCtx;
        if (context instanceof EglBase14.Context) {
            return context.getEgl14Context();
        }
        return null;
    }

    @Override // com.bytedance.codecx.video.EglBase.Context
    public int getGLESVersion() {
        return this.rxCtx.getGLESVersion();
    }

    @Override // com.bytedance.codecx.video.EglBase.Context
    public long getNativeEglContext() {
        return this.rxCtx.getNativeEglContext();
    }

    public EglBaseContextCodecXWrapper(EglBase.Context context) {
        this.rxCtx = context;
    }
}
