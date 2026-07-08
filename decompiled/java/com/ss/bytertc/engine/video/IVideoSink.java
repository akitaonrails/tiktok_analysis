package com.ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes21.dex */
public interface IVideoSink {
    int getRenderElapse();

    void onFrame(VideoFrame videoFrame);
}
