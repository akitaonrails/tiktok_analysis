package com.ss.bytertc.engine.video;

import com.bytedance.realx.base.JniCommon;
import com.ss.bytertc.engine.video.VideoStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class WrappedNativeStreamBuffer implements VideoStream.Buffer {
    public final ByteBuffer data;
    public final long nativeBuffer;
    public final int size;

    @Override // com.ss.bytertc.engine.video.VideoStream.Buffer
    public ByteBuffer getData() {
        return this.data.slice();
    }

    @Override // com.ss.bytertc.engine.video.VideoStream.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        JniCommon.nativeReleaseRef(this.nativeBuffer);
    }

    @Override // com.ss.bytertc.engine.video.VideoStream.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        JniCommon.nativeAddRef(this.nativeBuffer);
    }

    @Override // com.ss.bytertc.engine.video.VideoStream.Buffer
    public int getDataSize() {
        return this.size;
    }

    public WrappedNativeStreamBuffer(int i, ByteBuffer byteBuffer, long j) {
        this.size = i;
        this.data = byteBuffer;
        this.nativeBuffer = j;
        retain();
    }
}
