package com.ss.bytertc.engine.mediaio;

import android.opengl.EGLContext;
import com.ss.bytertc.engine.video.VideoFrame;

/* JADX INFO: loaded from: classes21.dex */
public interface IVideoSink {
    void consumeVideoFrame(VideoFrame videoFrame);

    int getBufferType();

    EGLContext getEGLContextHandle();

    int getPixelFormat();

    int getRenderElapse();

    void onDispose();

    boolean onInitialize();

    boolean onStart();

    void onStop();
}
