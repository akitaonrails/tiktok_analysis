package com.bytedance.codecx.video.memory;

import com.bytedance.codecx.base.RefCounted;
import com.bytedance.codecx.video.CodecXPixelFormat;
import com.bytedance.codecx.video.CodecXVideoMemoryType;

/* JADX INFO: loaded from: classes21.dex */
public interface CodecXVideoMemoryInterface extends RefCounted {
    int getHeight();

    CodecXVideoMemoryType getMemoryType();

    long getNativeHandle();

    CodecXPixelFormat getPixelFormat();

    int getWidth();

    @Override // com.bytedance.codecx.base.RefCounted
    void release();

    @Override // com.bytedance.codecx.base.RefCounted
    void retain();
}
