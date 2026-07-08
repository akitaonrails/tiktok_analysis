package com.bytedance.codecx.video.memory;

import X.C1C7U;

/* JADX INFO: loaded from: classes21.dex */
public abstract class CodecXVideoMemory implements CodecXVideoMemoryInterface {
    public long nativeHandle;
    public RefObject refCounted = new RefObject(new Runnable() { // from class: X.0jVl
        @Override // java.lang.Runnable
        public final void run() {
            this.LL.lambda$new$0();
        }
    });

    public static native void nativeReleaseVideoMemory(long j);

    @Override // com.bytedance.codecx.video.memory.CodecXVideoMemoryInterface, com.bytedance.codecx.base.RefCounted
    public synchronized void release() {
        this.refCounted.release();
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoMemoryInterface, com.bytedance.codecx.base.RefCounted
    public synchronized void retain() {
        this.refCounted.retain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        C1C7U.LIZ("CodecXVideoMemory@9d36.<init>$1L");
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseVideoMemory(j);
            this.nativeHandle = 0L;
        }
        C1C7U.LIZIZ("CodecXVideoMemory@9d36.<init>$1L");
    }

    public boolean isNullPointer() {
        return this.nativeHandle == 0;
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoMemoryInterface
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public CodecXVideoMemory(long j) {
        this.nativeHandle = j;
    }
}
