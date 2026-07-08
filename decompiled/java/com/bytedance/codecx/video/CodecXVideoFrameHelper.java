package com.bytedance.codecx.video;

import X.C1C7U;
import android.opengl.EGLContext;
import com.bytedance.codecx.video.memory.RefObject;

/* JADX INFO: loaded from: classes21.dex */
public class CodecXVideoFrameHelper implements CodecXVideoFrameHelperInterface {
    public long nativeHandle;
    public RefObject refCounted = new RefObject(new Runnable() { // from class: X.0jVf
        @Override // java.lang.Runnable
        public final void run() {
            this.LL.lambda$new$0();
        }
    });

    public static native long nativeCreateCodecXVideoFrameHelperOpenGL(long j);

    public static native void nativeReleaseVideoFrameHelper(long j);

    @Override // com.bytedance.codecx.video.CodecXVideoFrameHelperInterface, com.bytedance.codecx.base.RefCounted
    public synchronized void release() {
        this.refCounted.release();
    }

    @Override // com.bytedance.codecx.video.CodecXVideoFrameHelperInterface, com.bytedance.codecx.base.RefCounted
    public synchronized void retain() {
        this.refCounted.retain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        C1C7U.LIZ("CodecXVideoFrameHelper@6af4.<init>$1L");
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseVideoFrameHelper(j);
            this.nativeHandle = 0L;
        }
        C1C7U.LIZIZ("CodecXVideoFrameHelper@6af4.<init>$1L");
    }

    @Override // com.bytedance.codecx.video.CodecXVideoFrameHelperInterface
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public CodecXVideoFrameHelper(long j) {
        this.nativeHandle = j;
    }

    public static CodecXVideoFrameHelperInterface createCodecXVideoFrameHelperOpenGL(EGLContext eGLContext) {
        return new CodecXVideoFrameHelper(nativeCreateCodecXVideoFrameHelperOpenGL(CodecXEglBaseUtils.getNativeEGLContext(eGLContext)));
    }
}
