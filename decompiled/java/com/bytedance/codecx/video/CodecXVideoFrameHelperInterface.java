package com.bytedance.codecx.video;

import com.bytedance.codecx.base.RefCounted;

/* JADX INFO: loaded from: classes21.dex */
public interface CodecXVideoFrameHelperInterface extends RefCounted {
    long getNativeHandle();

    @Override // com.bytedance.codecx.base.RefCounted
    void release();

    @Override // com.bytedance.codecx.base.RefCounted
    void retain();
}
