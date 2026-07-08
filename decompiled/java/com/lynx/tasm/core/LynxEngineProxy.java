package com.lynx.tasm.core;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxEngineProxy {
    public long LIZ;

    private native long nativeCreate(long j);

    public native void nativeDestroy(long j);

    public native void nativeDispatchTaskToLynxEngine(long j, Runnable runnable);

    public native void nativeInvokeLepusApiCallback(long j, int i, String str, Object obj);

    public native void nativeOnPseudoStatusChanged(long j, int i, int i2, int i3);

    public native void nativeSendCustomEvent(long j, String str, int i, ByteBuffer byteBuffer, int i2, String str2);

    public native void nativeSendGestureEvent(long j, String str, int i, int i2, ByteBuffer byteBuffer, int i3);

    public native void nativeSendMultiTouchEvent(long j, String str, ByteBuffer byteBuffer, int i, long j2);

    public native void nativeSendTouchEvent(long j, String str, int i, float f, float f2, float f3, float f4, float f5, float f6, long j2);

    public native void nativeStartEventBubble(long j, long j2);

    public native void nativeStartEventCapture(long j, long j2);

    public native void nativeStartEventFire(long j, boolean z, long j2);

    public native void nativeStartEventGenerate(long j, ByteBuffer byteBuffer, int i);

    public LynxEngineProxy(long j) {
        this.LIZ = nativeCreate(j);
    }

    public static void executeRunnable(Runnable runnable) {
        runnable.run();
    }
}
