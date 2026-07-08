package com.ss.ttlivestreamer.core.engine;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;

/* JADX INFO: loaded from: classes21.dex */
public abstract class VideoProcessor extends NativeObject {
    public abstract VideoFrame process(VideoFrame videoFrame);
}
