package com.bytedance.realx.video.memory;

import X.C1C7U;
import com.bytedance.realx.base.RefCounted;
import com.bytedance.realx.video.RXVideoMemoryType;
import com.bytedance.realx.video.RXVideoRotation;

/* JADX INFO: loaded from: classes21.dex */
public abstract class RTCVideoMemory implements RefCounted {
    public RefObject refCounted = new RefObject(new Runnable() { // from class: X.0jQR
        @Override // java.lang.Runnable
        public final void run() {
            this.LL.lambda$new$0();
        }
    });
    public Runnable releaseCallback;

    public abstract int getHeight();

    public abstract RXVideoMemoryType getMemoryType();

    public abstract RXVideoRotation getRotation();

    public abstract int getWidth();

    public synchronized boolean hasReleaseCallback() {
        return this.releaseCallback != null;
    }

    @Override // com.bytedance.realx.base.RefCounted
    public synchronized void release() {
        this.refCounted.release();
    }

    @Override // com.bytedance.realx.base.RefCounted
    public synchronized void retain() {
        this.refCounted.retain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        C1C7U.LIZ("RTCVideoMemory@f7d4.<init>$1L");
        Runnable runnable = this.releaseCallback;
        if (runnable != null) {
            runnable.run();
        }
        C1C7U.LIZIZ("RTCVideoMemory@f7d4.<init>$1L");
    }

    public synchronized void setReleaseCallback(Runnable runnable) {
        this.releaseCallback = runnable;
    }
}
