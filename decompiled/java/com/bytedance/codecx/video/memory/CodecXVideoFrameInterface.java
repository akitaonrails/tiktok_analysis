package com.bytedance.codecx.video.memory;

import com.bytedance.codecx.base.RefCounted;
import com.bytedance.codecx.video.CodecXVideoRotation;

/* JADX INFO: loaded from: classes21.dex */
public interface CodecXVideoFrameInterface extends RefCounted {
    CodecXVideoMemoryInterface getAndRetainVideoFrameMemory();

    int getHeight();

    long getNativeHandle();

    int[] getRectRoiData();

    int getRotatedHeight();

    int getRotatedWidth();

    CodecXVideoRotation getRotation();

    long getTimestampNs();

    int getWidth();

    @Override // com.bytedance.codecx.base.RefCounted
    void release();

    @Override // com.bytedance.codecx.base.RefCounted
    void retain();

    void setRotation(CodecXVideoRotation codecXVideoRotation);

    void setTimestampNs(long j);

    CodecXVideoFrameInterface toI420();
}
