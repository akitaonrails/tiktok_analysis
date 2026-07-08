package com.ss.lyrax.video;

import X.C1C7U;
import android.opengl.EGLContext;
import com.bytedance.realx.video.VideoFrame;
import com.ss.lyrax.video.LyraxVideoFrame;
import com.ss.lyrax.video.LyraxVideoFrameWapper;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoFrameWapper extends LyraxVideoFrame {
    public LyraxVideoFrame.OnFrameDestroyedListener frameDestroyedListener;
    public final EGLContext mEglContext;
    public LyraxVideoFrameType mFrameType;
    public final LyraxVideoNativeBufferFrame mNativeBufferFrame;
    public LyraxVideoPixelFormat mPixelFormat;
    public final VideoFrame mRxVideoFrame;
    public VideoFrame.Buffer mVideoBuffer;

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getGLSync() {
        return 0L;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setColorSpace(LyraxVideoColorSpace lyraxVideoColorSpace) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setEGLContext(EGLContext eGLContext) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setExtraDataArray(LyraxVideoExtraData[] lyraxVideoExtraDataArr) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setExtraDataInfo(ByteBuffer byteBuffer) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setGLSync(long j) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setOriginalCaptureTimestampMs(long j) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setOriginalEffectTimestampMs(long j) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setRotation(LyraxVideoRotation lyraxVideoRotation) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setSupplementaryInfo(ByteBuffer byteBuffer) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setTextureID(int i) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setTextureMatrix(float[] fArr) {
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean setTimeStampUs(long j) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        C1C7U.LIZ("LyraxVideoFrameWapper@ec2.<init>$1L");
        this.mNativeBufferFrame.release();
        VideoFrame.Buffer buffer = this.mVideoBuffer;
        if (buffer != null) {
            buffer.release();
        }
        C1C7U.LIZIZ("LyraxVideoFrameWapper@ec2.<init>$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        C1C7U.LIZ("LyraxVideoFrameWapper@ec2.<init>$2L");
        this.mRxVideoFrame.release();
        VideoFrame.Buffer buffer = this.mVideoBuffer;
        if (buffer != null) {
            buffer.release();
        }
        C1C7U.LIZIZ("LyraxVideoFrameWapper@ec2.<init>$2L");
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public void freeVideoFrame() {
        LyraxVideoFrame.OnFrameDestroyedListener onFrameDestroyedListener = this.frameDestroyedListener;
        if (onFrameDestroyedListener != null) {
            onFrameDestroyedListener.OnFrameDestroyed(null, 0, 0L);
        }
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoColorSpace getColorSpace() {
        LyraxVideoNativeBufferFrame lyraxVideoNativeBufferFrame = this.mNativeBufferFrame;
        if (lyraxVideoNativeBufferFrame != null) {
            return lyraxVideoNativeBufferFrame.getColorSpace();
        }
        if (this.mRxVideoFrame != null) {
            return LyraxVideoColorSpace.BT601_LIMITED_RANGE;
        }
        return null;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getEnterDecoderTimestampMs() {
        LyraxVideoNativeBufferFrame lyraxVideoNativeBufferFrame = this.mNativeBufferFrame;
        if (lyraxVideoNativeBufferFrame != null) {
            return lyraxVideoNativeBufferFrame.getEnterDecoderTimestampMs();
        }
        return 0L;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoExtraData[] getExtraDataArray() {
        LyraxVideoNativeBufferFrame lyraxVideoNativeBufferFrame = this.mNativeBufferFrame;
        if (lyraxVideoNativeBufferFrame != null) {
            return lyraxVideoNativeBufferFrame.getExtraDataArray();
        }
        return null;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public ByteBuffer getExtraDataInfo() {
        LyraxVideoNativeBufferFrame lyraxVideoNativeBufferFrame = this.mNativeBufferFrame;
        if (lyraxVideoNativeBufferFrame != null) {
            return lyraxVideoNativeBufferFrame.getExtraDataInfo();
        }
        VideoFrame videoFrame = this.mRxVideoFrame;
        if (videoFrame != null) {
            return videoFrame.getExtendedData();
        }
        return null;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getHeight() {
        VideoFrame.Buffer buffer = this.mVideoBuffer;
        if (buffer != null) {
            return buffer.getHeight();
        }
        return 0;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getLeaveDecoderTimestampMs() {
        LyraxVideoNativeBufferFrame lyraxVideoNativeBufferFrame = this.mNativeBufferFrame;
        if (lyraxVideoNativeBufferFrame != null) {
            return lyraxVideoNativeBufferFrame.getLeaveDecoderTimestampMs();
        }
        return 0L;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getNumberOfPlanes() {
        return this.mPixelFormat == LyraxVideoPixelFormat.I420 ? 3 : 0;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getOriginalCaptureTimestampMs() {
        LyraxVideoNativeBufferFrame lyraxVideoNativeBufferFrame = this.mNativeBufferFrame;
        if (lyraxVideoNativeBufferFrame != null) {
            return lyraxVideoNativeBufferFrame.getOriginalCaptureTimestampMs();
        }
        return 0L;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getOriginalEffectTimestampMs() {
        LyraxVideoNativeBufferFrame lyraxVideoNativeBufferFrame = this.mNativeBufferFrame;
        if (lyraxVideoNativeBufferFrame != null) {
            return lyraxVideoNativeBufferFrame.getOriginalEffectTimestampMs();
        }
        return 0L;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoRotation getRotation() {
        LyraxVideoNativeBufferFrame lyraxVideoNativeBufferFrame = this.mNativeBufferFrame;
        if (lyraxVideoNativeBufferFrame != null) {
            return lyraxVideoNativeBufferFrame.getRotation();
        }
        VideoFrame videoFrame = this.mRxVideoFrame;
        if (videoFrame != null) {
            return LyraxVideoRotation.fromId(videoFrame.getRotation());
        }
        return null;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public ByteBuffer getSupplementaryInfo() {
        LyraxVideoNativeBufferFrame lyraxVideoNativeBufferFrame = this.mNativeBufferFrame;
        if (lyraxVideoNativeBufferFrame != null) {
            return lyraxVideoNativeBufferFrame.getSupplementaryInfo();
        }
        return null;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getTextureID() {
        VideoFrame.Buffer buffer;
        if (this.mFrameType == LyraxVideoFrameType.RAW_MEMORY || (buffer = this.mVideoBuffer) == null) {
            return 0;
        }
        return ((VideoFrame.TextureBuffer) buffer).getTextureId();
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public float[] getTextureMatrix() {
        VideoFrame.Buffer buffer;
        if (this.mFrameType == LyraxVideoFrameType.RAW_MEMORY || (buffer = this.mVideoBuffer) == null) {
            return null;
        }
        return ((VideoFrame.TextureBuffer) buffer).nativeGetTransFormMatrix();
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public long getTimeStampUs() {
        LyraxVideoNativeBufferFrame lyraxVideoNativeBufferFrame = this.mNativeBufferFrame;
        if (lyraxVideoNativeBufferFrame != null) {
            return lyraxVideoNativeBufferFrame.getTimeStampUs();
        }
        VideoFrame videoFrame = this.mRxVideoFrame;
        if (videoFrame != null) {
            return videoFrame.getTimestampNs() / 1000;
        }
        return 0L;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getWidth() {
        VideoFrame.Buffer buffer = this.mVideoBuffer;
        if (buffer != null) {
            return buffer.getWidth();
        }
        return 0;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public boolean isBlackFrame() {
        LyraxVideoNativeBufferFrame lyraxVideoNativeBufferFrame = this.mNativeBufferFrame;
        if (lyraxVideoNativeBufferFrame != null) {
            return lyraxVideoNativeBufferFrame.isBlackFrame();
        }
        return false;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public EGLContext getEGLContext() {
        return this.mEglContext;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoFrameType getFrameType() {
        return this.mFrameType;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public LyraxVideoPixelFormat getPixelFormat() {
        return this.mPixelFormat;
    }

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public ByteBuffer getPlaneData(int i) {
        VideoFrame.Buffer buffer;
        if (this.mFrameType == LyraxVideoFrameType.GL_TEXTURE || (buffer = this.mVideoBuffer) == null) {
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

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public int getPlaneStride(int i) {
        VideoFrame.Buffer buffer;
        if (this.mFrameType == LyraxVideoFrameType.GL_TEXTURE || (buffer = this.mVideoBuffer) == null) {
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

    @Override // com.ss.lyrax.video.LyraxVideoFrame
    public void setFrameDestroyedListener(LyraxVideoFrame.OnFrameDestroyedListener onFrameDestroyedListener) {
        this.frameDestroyedListener = onFrameDestroyedListener;
    }

    public void setReleaseCallback(final Runnable runnable) {
        if (runnable == null) {
            setFrameDestroyedListener(null);
        } else {
            setFrameDestroyedListener(new LyraxVideoFrame.OnFrameDestroyedListener() { // from class: X.0jN4
                @Override // com.ss.lyrax.video.LyraxVideoFrame.OnFrameDestroyedListener
                public final void OnFrameDestroyed(EGLContext eGLContext, int i, long j) {
                    LyraxVideoFrameWapper.lambda$setReleaseCallback$2(runnable, eGLContext, i, j);
                }
            });
        }
    }

    public LyraxVideoFrameWapper(VideoFrame videoFrame, EGLContext eGLContext) {
        this.mRxVideoFrame = videoFrame;
        this.mEglContext = eGLContext;
        videoFrame.retain();
        setReleaseCallback(new Runnable() { // from class: X.0jNP
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$new$1();
            }
        });
        init(videoFrame.getBuffer(), eGLContext);
    }

    private void init(VideoFrame.Buffer buffer, EGLContext eGLContext) {
        if (buffer.getBufferType() == 4) {
            this.mFrameType = LyraxVideoFrameType.GL_TEXTURE;
            this.mVideoBuffer = buffer;
            buffer.retain();
            if (((VideoFrame.TextureBuffer) this.mVideoBuffer).getType() == VideoFrame.TextureBuffer.Type.RGB) {
                this.mPixelFormat = LyraxVideoPixelFormat.TEXTURE_2D;
                return;
            } else {
                this.mPixelFormat = LyraxVideoPixelFormat.TEXTURE_OES;
                return;
            }
        }
        this.mFrameType = LyraxVideoFrameType.RAW_MEMORY;
        this.mVideoBuffer = buffer.toI420();
        this.mPixelFormat = LyraxVideoPixelFormat.I420;
    }

    public LyraxVideoFrameWapper(VideoFrame.Buffer buffer, EGLContext eGLContext, long j) {
        this.mNativeBufferFrame = new LyraxVideoNativeBufferFrame(j);
        this.mRxVideoFrame = null;
        this.mEglContext = eGLContext;
        setReleaseCallback(new Runnable() { // from class: X.0jNQ
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$new$0();
            }
        });
        init(buffer, eGLContext);
    }

    public static /* synthetic */ void lambda$setReleaseCallback$2(Runnable runnable, EGLContext eGLContext, int i, long j) {
        C1C7U.LIZ("LyraxVideoFrameWapper@ec2.setReleaseCallback$1L");
        if (runnable != null) {
            runnable.run();
        }
        C1C7U.LIZIZ("LyraxVideoFrameWapper@ec2.setReleaseCallback$1L");
    }
}
