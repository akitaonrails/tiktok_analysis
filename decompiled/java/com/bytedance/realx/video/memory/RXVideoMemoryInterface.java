package com.bytedance.realx.video.memory;

import com.bytedance.realx.base.RefCounted;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoMemoryType;

/* JADX INFO: loaded from: classes21.dex */
public interface RXVideoMemoryInterface extends RefCounted {
    int getHeight();

    RXVideoMemoryType getMemoryType();

    long getNativeHandle();

    RXPixelFormat getPixelFormat();

    int getWidth();

    @Override // com.bytedance.realx.base.RefCounted
    void release();

    @Override // com.bytedance.realx.base.RefCounted
    void retain();
}
