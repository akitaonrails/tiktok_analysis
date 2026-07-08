package com.ss.pusher.core.engine;

import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.buffer.VideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public abstract class VideoEncoder extends NativeObject {
    public abstract int Encode(VideoFrame videoFrame);

    public abstract boolean InitEncoder(TEBundle tEBundle);

    public abstract void RequestIDRFrame();

    public abstract void SetBitrate(int i);

    public String getEncoderInfo() {
        return "";
    }

    public native void nativeEncoded(ByteBuffer byteBuffer, int i, int i2, int i3, long j, long j2);

    @Override // com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
    public void release() {
    }
}
