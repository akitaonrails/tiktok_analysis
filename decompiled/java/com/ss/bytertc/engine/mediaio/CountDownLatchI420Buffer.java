package com.ss.bytertc.engine.mediaio;

import X.C1280200jQ2;
import X.C1280510jQX;
import X.C1C7U;
import com.bytedance.realx.video.JavaI420Buffer;
import com.bytedance.realx.video.VideoFrame;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes21.dex */
public class CountDownLatchI420Buffer implements VideoFrame.I420Buffer {
    public final JavaI420Buffer buffer;
    public final CountDownLatch mCountDownLatch = new CountDownLatch(1);
    public Runnable mCustomReleaseCallback;

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer, com.bytedance.realx.video.VideoFrame.Buffer
    public final /* synthetic */ int getBufferType() {
        return C1280510jQX.LIZ(this);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public final /* synthetic */ VideoFrame.NV12Buffer toNV12() {
        return C1280200jQ2.LIZ(this);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return this.buffer.copyData();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.buffer.getDataU();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.buffer.getDataV();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.buffer.getDataY();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.buffer.getHeight();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.buffer.getStrideU();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.buffer.getStrideV();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.buffer.getStrideY();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.buffer.getWidth();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        this.buffer.release();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        this.buffer.retain();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        JavaI420Buffer javaI420Buffer = this.buffer;
        javaI420Buffer.toI420();
        return javaI420Buffer;
    }

    public CountDownLatch getLatch() {
        return this.mCountDownLatch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Runnable runnable) {
        C1C7U.LIZ("CountDownLatchI420Buffer@3040.<init>$1L");
        this.mCountDownLatch.countDown();
        if (this.mCustomReleaseCallback != null) {
            runnable.run();
        }
        C1C7U.LIZIZ("CountDownLatchI420Buffer@3040.<init>$1L");
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        return this.buffer.scaleAndFill(i, i2, i3, i4);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.buffer.cropAndScale(i, i2, i3, i4, i5, i6);
    }

    public CountDownLatchI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, final Runnable runnable) {
        this.mCustomReleaseCallback = runnable;
        this.buffer = JavaI420Buffer.wrap(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, new Runnable() { // from class: X.0jQW
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$new$0(runnable);
            }
        });
    }

    public static CountDownLatchI420Buffer wrap(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        return new CountDownLatchI420Buffer(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, runnable);
    }
}
