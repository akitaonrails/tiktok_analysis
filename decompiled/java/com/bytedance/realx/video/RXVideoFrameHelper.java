package com.bytedance.realx.video;

import X.C1C7U;
import android.opengl.EGLContext;
import com.bytedance.realx.video.memory.RefObject;

/* JADX INFO: loaded from: classes21.dex */
public class RXVideoFrameHelper implements RXVideoFrameHelperInterface {
    public long nativeHandle;
    public RefObject refCounted = new RefObject(new Runnable() { // from class: X.0jOr
        @Override // java.lang.Runnable
        public final void run() {
            this.LL.lambda$new$0();
        }
    });

    public static native long nativeCreateRXVideoFrameHelperOpenGL(long j);

    public static native void nativeReleaseVideoFrameHelper(long j);

    @Override // com.bytedance.realx.video.RXVideoFrameHelperInterface, com.bytedance.realx.base.RefCounted
    public synchronized void release() {
        this.refCounted.release();
    }

    @Override // com.bytedance.realx.video.RXVideoFrameHelperInterface, com.bytedance.realx.base.RefCounted
    public synchronized void retain() {
        this.refCounted.retain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        C1C7U.LIZ("RXVideoFrameHelper@77d7.<init>$1L");
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseVideoFrameHelper(j);
            this.nativeHandle = 0L;
        }
        C1C7U.LIZIZ("RXVideoFrameHelper@77d7.<init>$1L");
    }

    @Override // com.bytedance.realx.video.RXVideoFrameHelperInterface
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public RXVideoFrameHelper(long j) {
        this.nativeHandle = j;
    }

    public static RXVideoFrameHelperInterface createRXVideoFrameHelperOpenGL(EGLContext eGLContext) {
        return new RXVideoFrameHelper(nativeCreateRXVideoFrameHelperOpenGL(EglBaseUtils.getNativeEGLContext(eGLContext)));
    }
}
