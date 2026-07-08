package com.bytedance.realx.base;

/* JADX INFO: loaded from: classes21.dex */
public interface RefCounted {
    void release();

    void retain();
}
