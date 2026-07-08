package com.ss.bytertc.engine.mediaio;

import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes21.dex */
public class RTCVideoFrame extends RefObject {
    public ByteBuffer buffer;
    public int buffer_type;
    public int color_space;
    public int cropBottom;
    public int cropLeft;
    public int cropRight;
    public int cropTop;
    public EGLContext eglContext11;
    public android.opengl.EGLContext eglContext14;
    public ByteBuffer extend_data;
    public int format;
    public int glTarget;
    public int height;
    public ByteBuffer[] planes_;
    public int rotation;
    public int stride;
    public int[] strides_;
    public ByteBuffer supplementary_info;
    public int textureId;
    public long timestamp;
    public float[] transform;
    public int width_;

    public RTCVideoFrame() {
        super(null);
    }

    public int getPlaneCount() {
        if (this.buffer_type == 0) {
            return 1;
        }
        return this.planes_.length;
    }

    public int getColorspace() {
        return this.color_space;
    }

    public int getCropBottom() {
        return this.cropBottom;
    }

    public int getCropLeft() {
        return this.cropLeft;
    }

    public int getCropRight() {
        return this.cropRight;
    }

    public int getCropTop() {
        return this.cropTop;
    }

    public android.opengl.EGLContext getEglContext() {
        return this.eglContext14;
    }

    public ByteBuffer getExtendData() {
        return this.extend_data;
    }

    public int getGlTextureId() {
        return this.textureId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getPixelFormat() {
        return this.format;
    }

    public int getRotation() {
        return this.rotation;
    }

    public ByteBuffer getSupplementaryInfo() {
        return this.supplementary_info;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public float[] getTransform() {
        return this.transform;
    }

    public int getWidth() {
        return this.width_;
    }

    public static RTCVideoFrame shallowCopy(RTCVideoFrame rTCVideoFrame) {
        RTCVideoFrame rTCVideoFrame2 = new RTCVideoFrame();
        rTCVideoFrame2.buffer = rTCVideoFrame.buffer;
        rTCVideoFrame2.buffer_type = rTCVideoFrame.buffer_type;
        rTCVideoFrame2.cropBottom = rTCVideoFrame.cropBottom;
        rTCVideoFrame2.cropLeft = rTCVideoFrame.cropLeft;
        rTCVideoFrame2.cropRight = rTCVideoFrame.cropRight;
        rTCVideoFrame2.cropTop = rTCVideoFrame.cropTop;
        rTCVideoFrame2.eglContext11 = rTCVideoFrame.eglContext11;
        rTCVideoFrame2.eglContext14 = rTCVideoFrame.eglContext14;
        rTCVideoFrame2.extend_data = rTCVideoFrame.extend_data;
        rTCVideoFrame2.supplementary_info = rTCVideoFrame.supplementary_info;
        rTCVideoFrame2.format = rTCVideoFrame.format;
        rTCVideoFrame2.glTarget = rTCVideoFrame.glTarget;
        rTCVideoFrame2.stride = rTCVideoFrame.stride;
        rTCVideoFrame2.width_ = rTCVideoFrame.width_;
        rTCVideoFrame2.height = rTCVideoFrame.height;
        rTCVideoFrame2.rotation = rTCVideoFrame.rotation;
        rTCVideoFrame2.textureId = rTCVideoFrame.textureId;
        rTCVideoFrame2.timestamp = rTCVideoFrame.timestamp;
        rTCVideoFrame2.transform = rTCVideoFrame.transform;
        rTCVideoFrame2.planes_ = rTCVideoFrame.planes_;
        rTCVideoFrame2.strides_ = rTCVideoFrame.strides_;
        return rTCVideoFrame2;
    }

    public ByteBuffer getPlane(int i) {
        if (getPlaneCount() <= i) {
            return null;
        }
        if (this.buffer_type == 0) {
            return this.buffer;
        }
        return this.planes_[i].slice();
    }

    public int getPlaneStride(int i) {
        if (getPlaneCount() <= i) {
            return 0;
        }
        if (this.buffer_type == 0) {
            return this.stride;
        }
        return this.strides_[i];
    }

    public void setColorspace(int i) {
        this.color_space = i;
    }

    public void setRotation(int i) {
        this.rotation = i;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public RTCVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, long j, Runnable runnable) {
        super(runnable);
        this.stride = i;
        this.width_ = i;
        this.height = i2;
        this.format = 1;
        this.rotation = i3;
        this.timestamp = j;
        this.extend_data = byteBuffer2;
        this.supplementary_info = byteBuffer3;
        this.buffer = byteBuffer;
    }

    public static RTCVideoFrame createTextureFrame(int i, int i2, int i3, int i4, int i5, long j, float[] fArr, Runnable runnable) {
        if (i != 10 && i != 11) {
            return null;
        }
        return new RTCVideoFrame(i2, i, fArr, (ByteBuffer) null, (ByteBuffer) null, i3, i4, i5, j, runnable);
    }

    public RTCVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, long j, Runnable runnable) {
        super(runnable);
        this.stride = i;
        this.height = i2;
        this.format = 1;
        this.rotation = i3;
        this.color_space = i4;
        this.timestamp = j;
        this.extend_data = byteBuffer2;
        this.supplementary_info = byteBuffer3;
        this.buffer = byteBuffer;
    }

    public RTCVideoFrame(int i, int i2, float[] fArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i3, int i4, int i5, long j, Runnable runnable) {
        super(runnable);
        this.stride = i3;
        this.width_ = i3;
        this.height = i4;
        this.buffer_type = 1;
        this.format = i2;
        this.rotation = i5;
        this.timestamp = j;
        this.extend_data = byteBuffer;
        this.supplementary_info = byteBuffer2;
        this.textureId = i;
        this.transform = fArr;
    }

    public RTCVideoFrame(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, int i4, long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, Runnable runnable) {
        super(runnable);
        this.buffer_type = 2;
        this.planes_ = byteBufferArr;
        this.strides_ = iArr;
        this.width_ = i;
        this.height = i2;
        this.format = i3;
        this.rotation = i4;
        this.timestamp = j;
        this.extend_data = byteBuffer;
        this.supplementary_info = byteBuffer2;
    }

    public RTCVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, long j, int i5, Runnable runnable) {
        super(runnable);
        this.stride = i;
        this.width_ = i2;
        this.height = i3;
        this.format = i5;
        this.rotation = i4;
        this.timestamp = j;
        this.extend_data = byteBuffer2;
        this.supplementary_info = byteBuffer3;
        this.buffer = byteBuffer;
    }

    public static RTCVideoFrame createI420Frame(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, long j, Runnable runnable) {
        return new RTCVideoFrame(new ByteBuffer[]{byteBuffer, byteBuffer2, byteBuffer3}, new int[]{i, i2, i3}, i4, i5, 1, i6, j, (ByteBuffer) null, (ByteBuffer) null, runnable);
    }
}
