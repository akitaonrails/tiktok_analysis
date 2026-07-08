package com.bytedance.codecx.base;

/* JADX INFO: loaded from: classes21.dex */
public interface RefCounted {
    void release();

    void retain();
}
