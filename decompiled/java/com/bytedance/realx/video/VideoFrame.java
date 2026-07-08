package com.bytedance.realx.video;

import X.C08FF;
import android.graphics.Matrix;
import android.opengl.EGLContext;
import com.bytedance.realx.base.RefCounted;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class VideoFrame implements RefCounted {
    public final Buffer buffer;
    public int colorSpace;
    public final ByteBuffer extendedData;
    public boolean isFlip;
    public int iso;
    public final int rotation;
    public final long timestampNs;

    public interface Buffer extends RefCounted {

        public interface BufferType {
        }

        Buffer copyData();

        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        int getBufferType();

        int getHeight();

        int getWidth();

        @Override // com.bytedance.realx.base.RefCounted
        void release();

        @Override // com.bytedance.realx.base.RefCounted
        void retain();

        Buffer scaleAndFill(int i, int i2, int i3, int i4);

        I420Buffer toI420();

        NV12Buffer toNV12();
    }

    public interface I420Buffer extends Buffer {
        @Override // com.bytedance.realx.video.VideoFrame.Buffer
        int getBufferType();

        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public interface NV12Buffer extends Buffer {
        @Override // com.bytedance.realx.video.VideoFrame.Buffer
        int getBufferType();

        ByteBuffer getDataUV();

        ByteBuffer getDataY();

        int getStrideUV();

        int getStrideY();
    }

    public int getRotatedHeight() {
        return this.rotation % 180 == 0 ? this.buffer.getHeight() : this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        return this.rotation % 180 == 0 ? this.buffer.getWidth() : this.buffer.getHeight();
    }

    @Override // com.bytedance.realx.base.RefCounted
    public void release() {
        this.buffer.release();
    }

    @Override // com.bytedance.realx.base.RefCounted
    public void retain() {
        this.buffer.retain();
    }

    public interface TextureBuffer extends Buffer {
        Buffer cropAndScaleWithFilter(int i, int i2, int i3, int i4, int i5, int i6, int i7);

        @Override // com.bytedance.realx.video.VideoFrame.Buffer
        int getBufferType();

        EGLContext getEglContext();

        long getNativeEglContext();

        FilterType getScaleFilter();

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();

        int getTypeGlTarget();

        int getUnscaledHeight();

        int getUnscaledWidth();

        float[] nativeGetTransFormMatrix();

        public enum Type {
            OES(36197),
            RGB(3553);

            public final int glTarget;

            public int getGlTarget() {
                return this.glTarget;
            }

            public static Type valueOf(String str) {
                return (Type) C08FF.LIZ(Type.class, str);
            }

            Type(int i) {
                this.glTarget = i;
            }
        }
    }

    public enum ColorSpace {
        kUnknown(0),
        kYCbCrBT601LimitedRange(1),
        kYCbCrBT601FullRange(2),
        kYCbCrBT709LimitedRange(3),
        kYCbCrBT709FullRange(4);

        public int colorSpace;

        public int getColorSpace() {
            return this.colorSpace;
        }

        public static ColorSpace valueOf(String str) {
            return (ColorSpace) C08FF.LIZ(ColorSpace.class, str);
        }

        ColorSpace(int i) {
            this.colorSpace = i;
        }
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getColorSpace() {
        return this.colorSpace;
    }

    public ByteBuffer getExtendedData() {
        return this.extendedData;
    }

    public boolean getFlipState() {
        return this.isFlip;
    }

    public int getIso() {
        return this.iso;
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public void setFlipState(boolean z) {
        this.isFlip = z;
    }

    public void setIso(int i) {
        this.iso = i;
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        this(buffer, (ByteBuffer) null, i, j);
    }

    public VideoFrame(Buffer buffer, int i, long j, boolean z) {
        this.iso = -1;
        if (buffer != null) {
            if (i % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i;
                this.timestampNs = j;
                this.extendedData = null;
                this.isFlip = z;
                return;
            }
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        throw new IllegalArgumentException("buffer not allowed to be null");
    }

    public VideoFrame(Buffer buffer, ByteBuffer byteBuffer, int i, long j) {
        this.iso = -1;
        if (buffer != null) {
            if (i % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i;
                this.timestampNs = j;
                this.extendedData = byteBuffer;
                return;
            }
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        throw new IllegalArgumentException("buffer not allowed to be null");
    }

    public VideoFrame(Buffer buffer, ByteBuffer byteBuffer, int i, long j, boolean z) {
        this.iso = -1;
        if (buffer != null) {
            if (i % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i;
                this.timestampNs = j;
                this.extendedData = byteBuffer;
                this.isFlip = z;
                return;
            }
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        throw new IllegalArgumentException("buffer not allowed to be null");
    }

    public VideoFrame(Buffer buffer, ByteBuffer byteBuffer, int i, long j, boolean z, int i2) {
        this.iso = -1;
        if (buffer != null) {
            if (i % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i;
                this.timestampNs = j;
                this.extendedData = byteBuffer;
                this.isFlip = z;
                this.colorSpace = i2;
                return;
            }
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        throw new IllegalArgumentException("buffer not allowed to be null");
    }
}
