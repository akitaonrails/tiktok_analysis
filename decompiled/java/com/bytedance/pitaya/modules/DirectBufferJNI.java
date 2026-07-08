package com.bytedance.pitaya.modules;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes24.dex */
public final class DirectBufferJNI implements ReflectionCall {
    public static final DirectBufferJNI INSTANCE = new DirectBufferJNI();

    public final native ByteBuffer nativeGetDirectBuffer(long j, int i);

    public final native void nativeReleaseDirectBuffer(long j);
}
