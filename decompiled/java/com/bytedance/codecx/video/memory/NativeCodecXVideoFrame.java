package com.bytedance.codecx.video.memory;

import X.C1C7U;
import com.bytedance.codecx.video.CodecXColorSpace;
import com.bytedance.codecx.video.CodecXPixelFormat;
import com.bytedance.codecx.video.CodecXVideoFrameHelperInterface;
import com.bytedance.codecx.video.CodecXVideoRotation;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class NativeCodecXVideoFrame implements CodecXVideoFrameInterface {
    public long nativeHandle;
    public RefObject refCounted = new RefObject(new Runnable() { // from class: X.0jVm
        @Override // java.lang.Runnable
        public final void run() {
            this.LL.lambda$new$0();
        }
    });

    public static native long nativeCreateCodecXVideoFrameFromByteMemory(long j, int i, int i2, CodecXPixelFormat codecXPixelFormat, ByteBuffer[] byteBufferArr, int[] iArr, long j2, ByteBuffer byteBuffer, CodecXColorSpace codecXColorSpace, CodecXVideoRotation codecXVideoRotation);

    public static native long nativeCreateCodecXVideoFrameFromOpenGLMemory(long j, long j2, long j3, ByteBuffer byteBuffer, CodecXColorSpace codecXColorSpace, CodecXVideoRotation codecXVideoRotation);

    public static native CodecXVideoMemoryInterface nativeGetFrameMemory(long j);

    public static native int[] nativeGetRectRoiData(long j);

    public static native CodecXVideoRotation nativeGetRotation(long j);

    public static native long nativeGetTimestampNs(long j);

    public static native void nativeReleaseVideoFrame(long j);

    public static native void nativeSetRotation(long j, CodecXVideoRotation codecXVideoRotation);

    public static native void nativeSetTimestampNs(long j, long j2);

    public static native NativeCodecXVideoFrame nativeToI420(long j);

    @Override // com.bytedance.codecx.video.memory.CodecXVideoFrameInterface, com.bytedance.codecx.base.RefCounted
    public synchronized void release() {
        this.refCounted.release();
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoFrameInterface, com.bytedance.codecx.base.RefCounted
    public synchronized void retain() {
        this.refCounted.retain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        C1C7U.LIZ("NativeCodecXVideoFrame@7fce.<init>$1L");
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseVideoFrame(j);
            this.nativeHandle = 0L;
        }
        C1C7U.LIZIZ("NativeCodecXVideoFrame@7fce.<init>$1L");
    }

    public boolean isNullPointer() {
        return this.nativeHandle == 0;
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoFrameInterface
    public CodecXVideoMemoryInterface getAndRetainVideoFrameMemory() {
        if (isNullPointer()) {
            return null;
        }
        return nativeGetFrameMemory(this.nativeHandle);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoFrameInterface
    public int getHeight() {
        CodecXVideoMemoryInterface andRetainVideoFrameMemory = getAndRetainVideoFrameMemory();
        if (andRetainVideoFrameMemory == null) {
            return 0;
        }
        int height = andRetainVideoFrameMemory.getHeight();
        andRetainVideoFrameMemory.release();
        return height;
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoFrameInterface
    public int[] getRectRoiData() {
        if (isNullPointer()) {
            return null;
        }
        return nativeGetRectRoiData(this.nativeHandle);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoFrameInterface
    public int getRotatedHeight() {
        CodecXVideoMemoryInterface andRetainVideoFrameMemory = getAndRetainVideoFrameMemory();
        if (andRetainVideoFrameMemory == null) {
            return 0;
        }
        int width = andRetainVideoFrameMemory.getWidth();
        int height = andRetainVideoFrameMemory.getHeight();
        andRetainVideoFrameMemory.release();
        return getRotation().value() % 180 == 0 ? height : width;
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoFrameInterface
    public int getRotatedWidth() {
        CodecXVideoMemoryInterface andRetainVideoFrameMemory = getAndRetainVideoFrameMemory();
        if (andRetainVideoFrameMemory == null) {
            return 0;
        }
        int width = andRetainVideoFrameMemory.getWidth();
        int height = andRetainVideoFrameMemory.getHeight();
        andRetainVideoFrameMemory.release();
        return getRotation().value() % 180 == 0 ? width : height;
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoFrameInterface
    public CodecXVideoRotation getRotation() {
        return isNullPointer() ? CodecXVideoRotation.VIDEO_ROTATION_0 : nativeGetRotation(this.nativeHandle);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoFrameInterface
    public long getTimestampNs() {
        if (isNullPointer()) {
            return 0L;
        }
        return nativeGetTimestampNs(this.nativeHandle);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoFrameInterface
    public int getWidth() {
        CodecXVideoMemoryInterface andRetainVideoFrameMemory = getAndRetainVideoFrameMemory();
        if (andRetainVideoFrameMemory == null) {
            return 0;
        }
        int width = andRetainVideoFrameMemory.getWidth();
        andRetainVideoFrameMemory.release();
        return width;
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoFrameInterface
    public CodecXVideoFrameInterface toI420() {
        if (isNullPointer()) {
            return null;
        }
        return nativeToI420(this.nativeHandle);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoFrameInterface
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public NativeCodecXVideoFrame(long j) {
        this.nativeHandle = j;
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoFrameInterface
    public void setRotation(CodecXVideoRotation codecXVideoRotation) {
        if (isNullPointer()) {
            return;
        }
        nativeSetRotation(this.nativeHandle, codecXVideoRotation);
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoFrameInterface
    public void setTimestampNs(long j) {
        if (isNullPointer()) {
            return;
        }
        nativeSetTimestampNs(this.nativeHandle, j);
    }

    public static NativeCodecXVideoFrame createCodecXVideoFrame(NativeCodecXByteMemory nativeCodecXByteMemory, long j, ByteBuffer byteBuffer, CodecXColorSpace codecXColorSpace, CodecXVideoRotation codecXVideoRotation) {
        return new NativeCodecXVideoFrame(nativeCreateCodecXVideoFrameFromByteMemory(nativeCodecXByteMemory.getNativeHandle(), nativeCodecXByteMemory.getWidth(), nativeCodecXByteMemory.getHeight(), nativeCodecXByteMemory.getPixelFormat(), nativeCodecXByteMemory.getPlaneDataArray(), nativeCodecXByteMemory.getPlaneLineSizeArray(), j, byteBuffer, codecXColorSpace, codecXVideoRotation));
    }

    public static NativeCodecXVideoFrame createCodecXVideoFrame(NativeCodecXOpenGLMemory nativeCodecXOpenGLMemory, CodecXVideoFrameHelperInterface codecXVideoFrameHelperInterface, long j, ByteBuffer byteBuffer, CodecXColorSpace codecXColorSpace) {
        long nativeHandle;
        if (codecXVideoFrameHelperInterface != null) {
            nativeHandle = codecXVideoFrameHelperInterface.getNativeHandle();
        } else {
            nativeHandle = 0;
        }
        return new NativeCodecXVideoFrame(nativeCreateCodecXVideoFrameFromOpenGLMemory(nativeCodecXOpenGLMemory.getNativeHandle(), nativeHandle, j, byteBuffer, codecXColorSpace, nativeCodecXOpenGLMemory.getRotation()));
    }
}
