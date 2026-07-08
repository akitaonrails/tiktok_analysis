package com.bytedance.realx.video.memory;

import X.C1C7U;
import com.bytedance.realx.video.RXColorSpace;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoFrameHelperInterface;
import com.bytedance.realx.video.RXVideoRotation;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class NativeRXVideoFrame implements RXVideoFrameInterface {
    public long nativeHandle;
    public RefObject refCounted = new RefObject(new Runnable() { // from class: X.0jRA
        @Override // java.lang.Runnable
        public final void run() {
            this.LL.lambda$new$0();
        }
    });

    public static native long nativeCreateRXVideoFrameFromByteMemory(long j, int i, int i2, RXPixelFormat rXPixelFormat, ByteBuffer[] byteBufferArr, int[] iArr, long j2, ByteBuffer byteBuffer, RXColorSpace rXColorSpace, RXVideoRotation rXVideoRotation);

    public static native long nativeCreateRXVideoFrameFromOpenGLMemory(long j, long j2, long j3, ByteBuffer byteBuffer, RXColorSpace rXColorSpace, RXVideoRotation rXVideoRotation);

    public static native RXColorSpace nativeGetColorSpace(long j);

    public static native RXVideoMemoryInterface nativeGetFrameMemory(long j);

    public static native RXVideoRotation nativeGetRotation(long j);

    public static native ByteBuffer nativeGetSupplementData(long j);

    public static native long nativeGetTimestampNs(long j);

    public static native long nativeGetTimestampUs(long j);

    public static native void nativeReleaseVideoFrame(long j);

    public static native void nativeSetRotation(long j, RXVideoRotation rXVideoRotation);

    public static native void nativeSetTimestampNs(long j, long j2);

    public static native void nativeSetTimestampUs(long j, long j2);

    public static native NativeRXVideoFrame nativeToI420(long j);

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface, com.bytedance.realx.base.RefCounted
    public synchronized void release() {
        this.refCounted.release();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface, com.bytedance.realx.base.RefCounted
    public synchronized void retain() {
        this.refCounted.retain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        C1C7U.LIZ("NativeRXVideoFrame@ac14.<init>$1L");
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseVideoFrame(j);
            this.nativeHandle = 0L;
        }
        C1C7U.LIZIZ("NativeRXVideoFrame@ac14.<init>$1L");
    }

    public boolean isNullPointer() {
        return this.nativeHandle == 0;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public RXVideoMemoryInterface getAndRetainVideoFrameMemory() {
        if (isNullPointer()) {
            return null;
        }
        return nativeGetFrameMemory(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public RXColorSpace getColorSpace() {
        return isNullPointer() ? RXColorSpace.kUnknown : nativeGetColorSpace(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public int getHeight() {
        RXVideoMemoryInterface andRetainVideoFrameMemory = getAndRetainVideoFrameMemory();
        if (andRetainVideoFrameMemory == null) {
            return 0;
        }
        int height = andRetainVideoFrameMemory.getHeight();
        andRetainVideoFrameMemory.release();
        return height;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public int getRotatedHeight() {
        RXVideoMemoryInterface andRetainVideoFrameMemory = getAndRetainVideoFrameMemory();
        if (andRetainVideoFrameMemory == null) {
            return 0;
        }
        int width = andRetainVideoFrameMemory.getWidth();
        int height = andRetainVideoFrameMemory.getHeight();
        andRetainVideoFrameMemory.release();
        return getRotation().value() % 180 == 0 ? height : width;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public int getRotatedWidth() {
        RXVideoMemoryInterface andRetainVideoFrameMemory = getAndRetainVideoFrameMemory();
        if (andRetainVideoFrameMemory == null) {
            return 0;
        }
        int width = andRetainVideoFrameMemory.getWidth();
        int height = andRetainVideoFrameMemory.getHeight();
        andRetainVideoFrameMemory.release();
        return getRotation().value() % 180 == 0 ? width : height;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public RXVideoRotation getRotation() {
        return isNullPointer() ? RXVideoRotation.VIDEO_ROTATION_0 : nativeGetRotation(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public ByteBuffer getSupplementData() {
        if (isNullPointer()) {
            return null;
        }
        return nativeGetSupplementData(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public long getTimestampNs() {
        if (isNullPointer()) {
            return 0L;
        }
        return nativeGetTimestampNs(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public long getTimestampUs() {
        if (isNullPointer()) {
            return 0L;
        }
        return nativeGetTimestampUs(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public int getWidth() {
        RXVideoMemoryInterface andRetainVideoFrameMemory = getAndRetainVideoFrameMemory();
        if (andRetainVideoFrameMemory == null) {
            return 0;
        }
        int width = andRetainVideoFrameMemory.getWidth();
        andRetainVideoFrameMemory.release();
        return width;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public RXVideoFrameInterface toI420() {
        if (isNullPointer()) {
            return null;
        }
        return nativeToI420(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public NativeRXVideoFrame(long j) {
        this.nativeHandle = j;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public void setRotation(RXVideoRotation rXVideoRotation) {
        if (isNullPointer()) {
            return;
        }
        nativeSetRotation(this.nativeHandle, rXVideoRotation);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public void setTimestampNs(long j) {
        if (isNullPointer()) {
            return;
        }
        nativeSetTimestampNs(this.nativeHandle, j);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public void setTimestampUs(long j) {
        if (isNullPointer()) {
            return;
        }
        nativeSetTimestampUs(this.nativeHandle, j);
    }

    public static NativeRXVideoFrame createRXVideoFrame(NativeRXByteMemory nativeRXByteMemory, long j, ByteBuffer byteBuffer, RXColorSpace rXColorSpace, RXVideoRotation rXVideoRotation) {
        return new NativeRXVideoFrame(nativeCreateRXVideoFrameFromByteMemory(nativeRXByteMemory.getNativeHandle(), nativeRXByteMemory.getWidth(), nativeRXByteMemory.getHeight(), nativeRXByteMemory.getPixelFormat(), nativeRXByteMemory.getPlaneDataArray(), nativeRXByteMemory.getPlaneLineSizeArray(), j, byteBuffer, rXColorSpace, rXVideoRotation));
    }

    public static NativeRXVideoFrame createRXVideoFrame(NativeRXOpenGLMemory nativeRXOpenGLMemory, RXVideoFrameHelperInterface rXVideoFrameHelperInterface, long j, ByteBuffer byteBuffer, RXColorSpace rXColorSpace) {
        long nativeHandle;
        if (rXVideoFrameHelperInterface != null) {
            nativeHandle = rXVideoFrameHelperInterface.getNativeHandle();
        } else {
            nativeHandle = 0;
        }
        return new NativeRXVideoFrame(nativeCreateRXVideoFrameFromOpenGLMemory(nativeRXOpenGLMemory.getNativeHandle(), nativeHandle, j, byteBuffer, rXColorSpace, nativeRXOpenGLMemory.getRotation()));
    }
}
