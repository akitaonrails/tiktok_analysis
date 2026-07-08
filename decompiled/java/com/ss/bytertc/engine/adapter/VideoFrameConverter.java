package com.ss.bytertc.engine.adapter;

import X.C1C7U;
import com.bytedance.realx.video.JavaI420Buffer;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.engine.adapter.VideoFrameConverter;
import com.ss.bytertc.engine.mediaio.CountDownLatchI420Buffer;
import com.ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class VideoFrameConverter {
    public static int MAX_BYTE_BUFFER_POOL_SIZE = 2;
    public int abandonFrameCount;
    public ArrayList<ByteBufferHolder> byteBufferPool;
    public ByteBuffer[] byteBuffers;
    public boolean isBufferDirect;
    public final int[] steps;
    public final int[] strides;

    public static class ByteBufferHolder {
        public ByteBuffer byteBuffer;
        public volatile boolean isPending;

        public byte[] getArray() {
            ByteBuffer byteBuffer = this.byteBuffer;
            if (byteBuffer == null) {
                return null;
            }
            byteBuffer.clear();
            if (this.byteBuffer.hasArray() && this.byteBuffer.arrayOffset() == 0) {
                return this.byteBuffer.array();
            }
            int iRemaining = this.byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            this.byteBuffer.get(bArr, 0, iRemaining);
            return bArr;
        }

        public ByteBuffer getByteBuffer() {
            ByteBuffer byteBuffer = this.byteBuffer;
            if (byteBuffer != null) {
                byteBuffer.clear();
            }
            return this.byteBuffer;
        }

        public boolean isPending() {
            return this.isPending;
        }

        public void setByteBuffer(ByteBuffer byteBuffer) {
            this.byteBuffer = byteBuffer;
        }

        public void setPending(boolean z) {
            this.isPending = z;
        }
    }

    public static class I420BufferWrapper {
        public VideoFrame.I420Buffer i420Buffer;
        public boolean needManualRelease;

        public void release() {
            VideoFrame.I420Buffer i420Buffer = this.i420Buffer;
            if ((i420Buffer instanceof JavaI420Buffer) && this.needManualRelease) {
                i420Buffer.release();
            }
        }

        public VideoFrame.I420Buffer getBuffer() {
            return this.i420Buffer;
        }

        public I420BufferWrapper(VideoFrame videoFrame) {
            if (videoFrame.getBuffer() instanceof JavaI420Buffer) {
                this.i420Buffer = (JavaI420Buffer) videoFrame.getBuffer();
                this.needManualRelease = false;
            } else {
                this.i420Buffer = videoFrame.getBuffer().toI420();
                this.needManualRelease = true;
                videoFrame.getBuffer().release();
            }
        }
    }

    public VideoFrameConverter() {
        this(false);
    }

    private ByteBufferHolder getPendingBuffer() {
        for (ByteBufferHolder byteBufferHolder : this.byteBufferPool) {
            if (!byteBufferHolder.isPending) {
                byteBufferHolder.setPending(true);
                return byteBufferHolder;
            }
        }
        return null;
    }

    public VideoFrameConverter(boolean z) {
        this.byteBuffers = new ByteBuffer[3];
        this.strides = new int[3];
        this.steps = new int[2];
        this.byteBufferPool = new ArrayList<>();
        this.abandonFrameCount = 0;
        for (int i = 0; i < MAX_BYTE_BUFFER_POOL_SIZE; i++) {
            this.byteBufferPool.add(new ByteBufferHolder());
        }
        this.isBufferDirect = z;
    }

    public static /* synthetic */ void lambda$convertToJavaI420Buffer$0(ByteBufferHolder byteBufferHolder) {
        C1C7U.LIZ("VideoFrameConverter@ee82.convertToJavaI420Buffer$1L");
        byteBufferHolder.setPending(false);
        C1C7U.LIZIZ("VideoFrameConverter@ee82.convertToJavaI420Buffer$1L");
    }

    public static /* synthetic */ void lambda$convertToJavaI420Buffer$1(ByteBufferHolder byteBufferHolder) {
        C1C7U.LIZ("VideoFrameConverter@ee82.convertToJavaI420Buffer$2L");
        byteBufferHolder.setPending(false);
        C1C7U.LIZIZ("VideoFrameConverter@ee82.convertToJavaI420Buffer$2L");
    }

    public static /* synthetic */ void lambda$convertToJavaI420Buffer$2(ByteBufferHolder byteBufferHolder) {
        C1C7U.LIZ("VideoFrameConverter@ee82.convertToJavaI420Buffer$3L");
        byteBufferHolder.setPending(false);
        C1C7U.LIZIZ("VideoFrameConverter@ee82.convertToJavaI420Buffer$3L");
    }

    public static /* synthetic */ void lambda$convertToJavaI420Buffer$3(ByteBufferHolder byteBufferHolder) {
        C1C7U.LIZ("VideoFrameConverter@ee82.convertToJavaI420Buffer$4L");
        byteBufferHolder.setPending(false);
        C1C7U.LIZIZ("VideoFrameConverter@ee82.convertToJavaI420Buffer$4L");
    }

    public ByteBufferHolder convert2YUV(VideoFrame videoFrame) {
        ByteBufferHolder pendingBuffer = getPendingBuffer();
        if (pendingBuffer == null) {
            return null;
        }
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        I420BufferWrapper i420BufferWrapper = new I420BufferWrapper(videoFrame);
        VideoFrame.I420Buffer buffer = i420BufferWrapper.getBuffer();
        boolean zConvertRawYUV2ByteHolder = convertRawYUV2ByteHolder(pendingBuffer, buffer.getDataY(), buffer.getDataU(), buffer.getDataV(), buffer.getStrideY(), buffer.getStrideU(), buffer.getStrideV(), width, height);
        i420BufferWrapper.release();
        if (!zConvertRawYUV2ByteHolder) {
            return null;
        }
        return pendingBuffer;
    }

    public void checkReuseByteBuffer(int i, ByteBufferHolder byteBufferHolder) {
        ByteBuffer byteBufferAllocate;
        if (byteBufferHolder.getByteBuffer() == null || byteBufferHolder.getByteBuffer().capacity() < i) {
            if (this.isBufferDirect) {
                byteBufferAllocate = ByteBuffer.allocateDirect(i);
            } else {
                byteBufferAllocate = ByteBuffer.allocate(i);
            }
            byteBufferAllocate.order(ByteOrder.nativeOrder());
            byteBufferHolder.setByteBuffer(byteBufferAllocate);
        }
    }

    public VideoFrame.I420Buffer convertToJavaI420Buffer(ByteBuffer byteBuffer, int i, int i2, boolean z) {
        if (byteBuffer == null) {
            return null;
        }
        final ByteBufferHolder pendingBuffer = getPendingBuffer();
        if (pendingBuffer == null) {
            int i3 = this.abandonFrameCount + 1;
            this.abandonFrameCount = i3;
            if (i3 >= 60) {
                LogUtil.e("VideoFrameConverter", "drop frame > 60 !!! please check Buffer for release");
                this.abandonFrameCount = 0;
            }
            return null;
        }
        this.abandonFrameCount = 0;
        int i4 = (i2 + 1) / 2;
        int i5 = (i + 1) / 2;
        int i6 = i * i2;
        int i7 = (i5 * 2 * i4) + i6;
        checkReuseByteBuffer(i7, pendingBuffer);
        ByteBuffer byteBuffer2 = pendingBuffer.getByteBuffer();
        byteBuffer.position(0);
        byteBuffer2.position(0);
        if (byteBuffer.limit() > i7) {
            byteBuffer.limit(i7);
        }
        byteBuffer2.limit(i7);
        byteBuffer2.put(byteBuffer);
        int i8 = i4 * i5;
        int i9 = i6 + i8;
        byteBuffer2.position(0);
        byteBuffer2.limit(i6);
        ByteBuffer byteBufferSlice = byteBuffer2.slice();
        byteBuffer2.position(i6);
        byteBuffer2.limit(i9);
        ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
        byteBuffer2.position(i9);
        byteBuffer2.limit(i9 + i8);
        ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
        if (z) {
            return CountDownLatchI420Buffer.wrap(i, i2, byteBufferSlice, i, byteBufferSlice2, i5, byteBufferSlice3, i5, new Runnable() { // from class: X.0jQ9
                @Override // java.lang.Runnable
                public final void run() {
                    VideoFrameConverter.lambda$convertToJavaI420Buffer$0(pendingBuffer);
                }
            });
        }
        return JavaI420Buffer.wrap(i, i2, byteBufferSlice, i, byteBufferSlice2, i5, byteBufferSlice3, i5, new Runnable() { // from class: X.0jQA
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameConverter.lambda$convertToJavaI420Buffer$1(pendingBuffer);
            }
        });
    }

    public VideoFrame.I420Buffer convertToJavaI420Buffer(byte[] bArr, int i, int i2, boolean z) {
        if (bArr == null) {
            return null;
        }
        final ByteBufferHolder pendingBuffer = getPendingBuffer();
        if (pendingBuffer == null) {
            int i3 = this.abandonFrameCount + 1;
            this.abandonFrameCount = i3;
            if (i3 >= 60) {
                LogUtil.e("VideoFrameConverter", "drop frame > 60 !!! please check Buffer for release ");
                this.abandonFrameCount = 0;
            }
            return null;
        }
        this.abandonFrameCount = 0;
        int i4 = (i2 + 1) / 2;
        int i5 = (i + 1) / 2;
        int i6 = i * i2;
        int i7 = (i5 * 2 * i4) + i6;
        checkReuseByteBuffer(i7, pendingBuffer);
        ByteBuffer byteBuffer = pendingBuffer.getByteBuffer();
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        byteBuffer.put(bArr, 0, Math.min(bArr.length, i7));
        int i8 = i4 * i5;
        int i9 = i6 + i8;
        byteBuffer.position(0);
        byteBuffer.limit(i6);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBuffer.position(i6);
        byteBuffer.limit(i9);
        ByteBuffer byteBufferSlice2 = byteBuffer.slice();
        byteBuffer.position(i9);
        byteBuffer.limit(i9 + i8);
        ByteBuffer byteBufferSlice3 = byteBuffer.slice();
        if (z) {
            return CountDownLatchI420Buffer.wrap(i, i2, byteBufferSlice, i, byteBufferSlice2, i5, byteBufferSlice3, i5, new Runnable() { // from class: X.0jQB
                @Override // java.lang.Runnable
                public final void run() {
                    VideoFrameConverter.lambda$convertToJavaI420Buffer$2(pendingBuffer);
                }
            });
        }
        return JavaI420Buffer.wrap(i, i2, byteBufferSlice, i, byteBufferSlice2, i5, byteBufferSlice3, i5, new Runnable() { // from class: X.0jQC
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameConverter.lambda$convertToJavaI420Buffer$3(pendingBuffer);
            }
        });
    }

    public ByteBuffer convertRawYUV2ByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(bArr2.length);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        byteBufferAllocateDirect2.put(bArr2);
        byteBufferAllocateDirect2.position(0);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(bArr3.length);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        byteBufferAllocateDirect3.put(bArr3);
        byteBufferAllocateDirect3.position(0);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((i4 * i5) + (((i4 + 1) / 2) * 2 * i4));
        byteBufferAllocate.clear();
        convertRawYUV2ByteArray(byteBufferAllocate.array(), byteBufferAllocateDirect, byteBufferAllocateDirect2, byteBufferAllocateDirect3, i, i2, i3, i4, i5);
        return byteBufferAllocate;
    }

    private boolean convertRawYUV2ByteArray(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int[] iArr = this.strides;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        int[] iArr2 = this.steps;
        iArr2[0] = i4;
        int i7 = (i4 + 1) / 2;
        iArr2[1] = i7;
        int i8 = (i4 * i5) + (i7 * 2 * i5);
        byteBuffer.clear();
        byteBuffer2.clear();
        byteBuffer3.clear();
        if (bArr == null || i8 > bArr.length) {
            return false;
        }
        ByteBuffer[] byteBufferArr = this.byteBuffers;
        byteBufferArr[0] = byteBuffer;
        byteBufferArr[1] = byteBuffer2;
        byteBufferArr[2] = byteBuffer3;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ByteBuffer[] byteBufferArr2 = this.byteBuffers;
            if (i9 < byteBufferArr2.length) {
                ByteBuffer byteBuffer4 = byteBufferArr2[i9];
                int i11 = this.strides[i9];
                int[] iArr3 = this.steps;
                if (i9 == 0) {
                    i6 = iArr3[0];
                } else {
                    i6 = iArr3[1];
                }
                int i12 = i11 - i6;
                if (i11 == i6) {
                    int iRemaining = byteBuffer4.remaining();
                    byteBuffer4.get(bArr, i10, iRemaining);
                    i10 += iRemaining;
                } else {
                    while (byteBuffer4.hasRemaining() && byteBuffer4.position() + i6 <= byteBuffer4.capacity()) {
                        byteBuffer4.get(bArr, i10, i6);
                        i10 += i6;
                        int iPosition = byteBuffer4.position() + i12;
                        if (!byteBuffer4.hasRemaining() || iPosition > byteBuffer4.capacity()) {
                            break;
                        }
                        byteBuffer4.position(iPosition);
                    }
                }
                i9++;
            } else {
                byteBufferArr2[0] = null;
                byteBufferArr2[1] = null;
                byteBufferArr2[2] = null;
                return true;
            }
        }
    }

    private boolean convertRawYUV2ByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int[] iArr = this.strides;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        int[] iArr2 = this.steps;
        iArr2[0] = i4;
        int i7 = (i4 + 1) / 2;
        iArr2[1] = i7;
        int i8 = (i4 * i5) + (i7 * 2 * i5);
        byteBuffer2.clear();
        byteBuffer3.clear();
        byteBuffer4.clear();
        if (byteBuffer == null || i8 > byteBuffer.capacity()) {
            return false;
        }
        byteBuffer.clear();
        ByteBuffer[] byteBufferArr = this.byteBuffers;
        byteBufferArr[0] = byteBuffer2;
        byteBufferArr[1] = byteBuffer3;
        byteBufferArr[2] = byteBuffer4;
        int i9 = 0;
        while (true) {
            ByteBuffer[] byteBufferArr2 = this.byteBuffers;
            if (i9 < byteBufferArr2.length) {
                ByteBuffer byteBuffer5 = byteBufferArr2[i9];
                int i10 = this.strides[i9];
                int[] iArr3 = this.steps;
                if (i9 == 0) {
                    i6 = iArr3[0];
                } else {
                    i6 = iArr3[1];
                }
                int i11 = i10 - i6;
                if (i10 == i6) {
                    byteBuffer.put(byteBuffer5);
                } else {
                    while (byteBuffer5.hasRemaining() && byteBuffer5.position() + i6 <= byteBuffer5.capacity()) {
                        byteBuffer5.limit(byteBuffer5.position() + i6);
                        byteBuffer.put(byteBuffer5);
                        int iPosition = byteBuffer5.position() + i11;
                        if (iPosition <= byteBuffer5.capacity()) {
                            byteBuffer5.limit(byteBuffer5.capacity());
                            byteBuffer5.position(iPosition);
                        }
                    }
                }
                i9++;
            } else {
                byteBufferArr2[0] = null;
                byteBufferArr2[1] = null;
                byteBufferArr2[2] = null;
                return true;
            }
        }
    }

    public boolean convertRawYUV2ByteHolder(ByteBufferHolder byteBufferHolder, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5) {
        checkReuseByteBuffer((i4 * i5) + (((i4 + 1) / 2) * 2 * i5), byteBufferHolder);
        return convertRawYUV2ByteBuffer(byteBufferHolder.byteBuffer, byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, i4, i5);
    }
}
