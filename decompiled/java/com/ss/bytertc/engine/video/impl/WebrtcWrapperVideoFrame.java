package com.ss.bytertc.engine.video.impl;

import android.opengl.EGLContext;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoContentType;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.video.VideoExternalData;
import com.ss.bytertc.engine.video.VideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class WebrtcWrapperVideoFrame extends VideoFrame {
    public final NativeBufferVideoFrame cppFrameWrapper;
    public final EGLContext eglContext;
    public VideoFrame.OnFrameDestroyedListener frameDestroyedListener;
    public VideoFrameType frameType;
    public VideoPixelFormat pixelFormat;
    public VideoFrame.Buffer videoBuffer;
    public final com.bytedance.realx.video.VideoFrame webrtcVideoFrame;

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getGLSync() {
        return 0L;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getOriginalCaptureTimestampMs() {
        return 0L;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getOriginalEffectTimestampMs() {
        return 0L;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setColorSpace(ColorSpace colorSpace) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setEGLContext(EGLContext eGLContext) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setExternalDataArray(VideoExternalData[] videoExternalDataArr) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setExternalDataInfo(ByteBuffer byteBuffer) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setGLSync(long j) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setOriginalCaptureTimestampMs(long j) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setOriginalEffectTimestampMs(long j) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setRotation(VideoRotation videoRotation) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setSupplementaryInfo(ByteBuffer byteBuffer) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setTextureID(int i) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setTextureMatrix(float[] fArr) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public boolean setTimeStampUs(long j) {
        return false;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public void freeVideoFrame() {
        VideoFrame.OnFrameDestroyedListener onFrameDestroyedListener = this.frameDestroyedListener;
        if (onFrameDestroyedListener != null) {
            onFrameDestroyedListener.OnFrameDestroyed(null, 0, 0L);
        }
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ColorSpace getColorSpace() {
        NativeBufferVideoFrame nativeBufferVideoFrame = this.cppFrameWrapper;
        if (nativeBufferVideoFrame != null) {
            return nativeBufferVideoFrame.getColorSpace();
        }
        if (this.webrtcVideoFrame != null) {
            return ColorSpace.BT601_LIMITED_RANGE;
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoContentType getContentType() {
        NativeBufferVideoFrame nativeBufferVideoFrame = this.cppFrameWrapper;
        return nativeBufferVideoFrame != null ? nativeBufferVideoFrame.getContentType() : VideoContentType.NORMAL_FRAME;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoExternalData[] getExternalDataArray() {
        NativeBufferVideoFrame nativeBufferVideoFrame = this.cppFrameWrapper;
        if (nativeBufferVideoFrame != null) {
            return nativeBufferVideoFrame.getExternalDataArray();
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getExternalDataInfo() {
        NativeBufferVideoFrame nativeBufferVideoFrame = this.cppFrameWrapper;
        if (nativeBufferVideoFrame != null) {
            return nativeBufferVideoFrame.getExternalDataInfo();
        }
        com.bytedance.realx.video.VideoFrame videoFrame = this.webrtcVideoFrame;
        if (videoFrame != null) {
            return videoFrame.getExtendedData();
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getHeight() {
        VideoFrame.Buffer buffer = this.videoBuffer;
        if (buffer != null) {
            return buffer.getHeight();
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getNumberOfPlanes() {
        return this.pixelFormat == VideoPixelFormat.I420 ? 3 : 0;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoRotation getRotation() {
        NativeBufferVideoFrame nativeBufferVideoFrame = this.cppFrameWrapper;
        if (nativeBufferVideoFrame != null) {
            return nativeBufferVideoFrame.getRotation();
        }
        com.bytedance.realx.video.VideoFrame videoFrame = this.webrtcVideoFrame;
        if (videoFrame != null) {
            return VideoRotation.fromId(videoFrame.getRotation());
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getSupplementaryInfo() {
        NativeBufferVideoFrame nativeBufferVideoFrame = this.cppFrameWrapper;
        if (nativeBufferVideoFrame != null) {
            return nativeBufferVideoFrame.getSupplementaryInfo();
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getTextureID() {
        VideoFrame.Buffer buffer;
        if (this.frameType == VideoFrameType.RAW_MEMORY || (buffer = this.videoBuffer) == null) {
            return 0;
        }
        return ((VideoFrame.TextureBuffer) buffer).getTextureId();
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public float[] getTextureMatrix() {
        VideoFrame.Buffer buffer;
        if (this.frameType == VideoFrameType.RAW_MEMORY || (buffer = this.videoBuffer) == null) {
            return null;
        }
        return ((VideoFrame.TextureBuffer) buffer).nativeGetTransFormMatrix();
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getTimeStampUs() {
        NativeBufferVideoFrame nativeBufferVideoFrame = this.cppFrameWrapper;
        if (nativeBufferVideoFrame != null) {
            return nativeBufferVideoFrame.getTimeStampUs();
        }
        com.bytedance.realx.video.VideoFrame videoFrame = this.webrtcVideoFrame;
        if (videoFrame != null) {
            return videoFrame.getTimestampNs() / 1000;
        }
        return 0L;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getWidth() {
        VideoFrame.Buffer buffer = this.videoBuffer;
        if (buffer != null) {
            return buffer.getWidth();
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public EGLContext getEGLContext() {
        return this.eglContext;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoFrameType getFrameType() {
        return this.frameType;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoPixelFormat getPixelFormat() {
        return this.pixelFormat;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getPlaneData(int i) {
        VideoFrame.Buffer buffer;
        if (this.frameType == VideoFrameType.GL_TEXTURE || (buffer = this.videoBuffer) == null) {
            return null;
        }
        VideoFrame.I420Buffer i420Buffer = (VideoFrame.I420Buffer) buffer;
        if (i == 0) {
            return i420Buffer.getDataY();
        }
        if (i == 1) {
            return i420Buffer.getDataU();
        }
        if (i != 2) {
            return null;
        }
        return i420Buffer.getDataV();
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getPlaneStride(int i) {
        VideoFrame.Buffer buffer;
        if (this.frameType == VideoFrameType.GL_TEXTURE || (buffer = this.videoBuffer) == null) {
            return 0;
        }
        VideoFrame.I420Buffer i420Buffer = (VideoFrame.I420Buffer) buffer;
        if (i == 0) {
            return i420Buffer.getStrideY();
        }
        if (i == 1) {
            return i420Buffer.getStrideU();
        }
        if (i != 2) {
            return 0;
        }
        return i420Buffer.getStrideV();
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public void setFrameDestroyedListener(VideoFrame.OnFrameDestroyedListener onFrameDestroyedListener) {
        this.frameDestroyedListener = onFrameDestroyedListener;
    }

    public WebrtcWrapperVideoFrame(final com.bytedance.realx.video.VideoFrame videoFrame, EGLContext eGLContext) {
        this.webrtcVideoFrame = videoFrame;
        this.eglContext = eGLContext;
        videoFrame.retain();
        setFrameDestroyedListener(new VideoFrame.OnFrameDestroyedListener() { // from class: X.0jN1
            @Override // com.ss.bytertc.engine.video.VideoFrame.OnFrameDestroyedListener
            public final void OnFrameDestroyed(EGLContext eGLContext2, int i, long j) {
                this.LIZ.lambda$new$1(videoFrame, eGLContext2, i, j);
            }
        });
        init(videoFrame.getBuffer(), eGLContext);
    }

    private void init(VideoFrame.Buffer buffer, EGLContext eGLContext) {
        if (buffer.getBufferType() == 4) {
            this.frameType = VideoFrameType.GL_TEXTURE;
            this.videoBuffer = buffer;
            buffer.retain();
            if (((VideoFrame.TextureBuffer) this.videoBuffer).getType() == VideoFrame.TextureBuffer.Type.RGB) {
                this.pixelFormat = VideoPixelFormat.TEXTURE_2D;
                return;
            } else {
                this.pixelFormat = VideoPixelFormat.TEXTURE_OES;
                return;
            }
        }
        this.frameType = VideoFrameType.RAW_MEMORY;
        this.videoBuffer = buffer.toI420();
        this.pixelFormat = VideoPixelFormat.I420;
    }

    public WebrtcWrapperVideoFrame(VideoFrame.Buffer buffer, EGLContext eGLContext, long j) {
        this.cppFrameWrapper = new NativeBufferVideoFrame(j);
        this.webrtcVideoFrame = null;
        this.eglContext = eGLContext;
        setFrameDestroyedListener(new VideoFrame.OnFrameDestroyedListener() { // from class: X.0jNG
            @Override // com.ss.bytertc.engine.video.VideoFrame.OnFrameDestroyedListener
            public final void OnFrameDestroyed(EGLContext eGLContext2, int i, long j2) {
                this.LIZ.lambda$new$0(eGLContext2, i, j2);
            }
        });
        init(buffer, eGLContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(EGLContext eGLContext, int i, long j) {
        this.cppFrameWrapper.release();
        VideoFrame.Buffer buffer = this.videoBuffer;
        if (buffer != null) {
            buffer.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(com.bytedance.realx.video.VideoFrame videoFrame, EGLContext eGLContext, int i, long j) {
        videoFrame.release();
        VideoFrame.Buffer buffer = this.videoBuffer;
        if (buffer != null) {
            buffer.release();
        }
    }
}
