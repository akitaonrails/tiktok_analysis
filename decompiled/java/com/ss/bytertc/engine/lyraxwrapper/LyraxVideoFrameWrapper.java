package com.ss.bytertc.engine.lyraxwrapper;

import X.C1C7U;
import android.opengl.EGLContext;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoContentType;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.lyraxwrapper.LyraxVideoFrameWrapper;
import com.ss.bytertc.engine.video.VideoExternalData;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.lyrax.video.LyraxVideoExtraData;
import com.ss.lyrax.video.LyraxVideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoFrameWrapper extends VideoFrame {
    public final LyraxVideoFrame mVideoFrame;

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
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            lyraxVideoFrame.release();
        }
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ColorSpace getColorSpace() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        return lyraxVideoFrame != null ? ColorSpace.fromId(lyraxVideoFrame.getColorSpace().value()) : ColorSpace.UNKNOWN;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoContentType getContentType() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        return lyraxVideoFrame != null ? lyraxVideoFrame.isBlackFrame() ? VideoContentType.BLACK_FRAME : VideoContentType.NORMAL_FRAME : VideoContentType.NORMAL_FRAME;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public EGLContext getEGLContext() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            return lyraxVideoFrame.getEGLContext();
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoExternalData[] getExternalDataArray() {
        LyraxVideoExtraData[] extraDataArray;
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        VideoExternalData[] videoExternalDataArr = null;
        if (lyraxVideoFrame != null && (extraDataArray = lyraxVideoFrame.getExtraDataArray()) != null && extraDataArray.length != 0) {
            videoExternalDataArr = new VideoExternalData[extraDataArray.length];
            for (int i = 0; i < extraDataArray.length; i++) {
                VideoExternalData videoExternalData = new VideoExternalData();
                videoExternalData.setDataId(extraDataArray[i].getChannelId());
                videoExternalData.setData(extraDataArray[i].getSeiData());
                videoExternalDataArr[i] = videoExternalData;
            }
        }
        return videoExternalDataArr;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getExternalDataInfo() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            return lyraxVideoFrame.getExtraDataInfo();
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoFrameType getFrameType() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        return lyraxVideoFrame != null ? VideoFrameType.fromId(lyraxVideoFrame.getFrameType().value()) : VideoFrameType.UNKNOWN;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getGLSync() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            return lyraxVideoFrame.getGLSync();
        }
        return 0L;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getHeight() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            return lyraxVideoFrame.getHeight();
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getNumberOfPlanes() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            return lyraxVideoFrame.getNumberOfPlanes();
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getOriginalCaptureTimestampMs() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            return lyraxVideoFrame.getOriginalCaptureTimestampMs();
        }
        return 0L;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getOriginalEffectTimestampMs() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            return lyraxVideoFrame.getOriginalEffectTimestampMs();
        }
        return 0L;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoPixelFormat getPixelFormat() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        return lyraxVideoFrame != null ? VideoPixelFormat.fromId(lyraxVideoFrame.getPixelFormat().value()) : VideoPixelFormat.UNKNOWN;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoRotation getRotation() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        return lyraxVideoFrame != null ? VideoRotation.fromId(lyraxVideoFrame.getRotation().value()) : VideoRotation.VIDEO_ROTATION_0;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getSupplementaryInfo() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            return lyraxVideoFrame.getSupplementaryInfo();
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getTextureID() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            return lyraxVideoFrame.getTextureID();
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public float[] getTextureMatrix() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        return lyraxVideoFrame != null ? lyraxVideoFrame.getTextureMatrix() : new float[0];
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getTimeStampUs() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            return lyraxVideoFrame.getTimeStampUs();
        }
        return 0L;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getWidth() {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            return lyraxVideoFrame.getWidth();
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public void release() {
        super.release();
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            lyraxVideoFrame.release();
        }
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public void retain() {
        super.retain();
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            lyraxVideoFrame.retain();
        }
    }

    public LyraxVideoFrameWrapper(LyraxVideoFrame lyraxVideoFrame) {
        this.mVideoFrame = lyraxVideoFrame;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getPlaneData(int i) {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            return lyraxVideoFrame.getPlaneData(i);
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getPlaneStride(int i) {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            return lyraxVideoFrame.getPlaneStride(i);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public void setFrameDestroyedListener(final VideoFrame.OnFrameDestroyedListener onFrameDestroyedListener) {
        LyraxVideoFrame lyraxVideoFrame = this.mVideoFrame;
        if (lyraxVideoFrame != null) {
            lyraxVideoFrame.setFrameDestroyedListener(new LyraxVideoFrame.OnFrameDestroyedListener() { // from class: X.0jMz
                @Override // com.ss.lyrax.video.LyraxVideoFrame.OnFrameDestroyedListener
                public final void OnFrameDestroyed(EGLContext eGLContext, int i, long j) {
                    this.LIZ.lambda$setFrameDestroyedListener$0(onFrameDestroyedListener, eGLContext, i, j);
                }
            });
        }
    }

    public void setReleaseCallback(final Runnable runnable) {
        if (runnable == null) {
            setFrameDestroyedListener(null);
        } else {
            setFrameDestroyedListener(new VideoFrame.OnFrameDestroyedListener() { // from class: X.0jN0
                @Override // com.ss.bytertc.engine.video.VideoFrame.OnFrameDestroyedListener
                public final void OnFrameDestroyed(EGLContext eGLContext, int i, long j) {
                    LyraxVideoFrameWrapper.lambda$setReleaseCallback$1(runnable, eGLContext, i, j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFrameDestroyedListener$0(VideoFrame.OnFrameDestroyedListener onFrameDestroyedListener, EGLContext eGLContext, int i, long j) {
        if (onFrameDestroyedListener != null) {
            onFrameDestroyedListener.OnFrameDestroyed(this.mVideoFrame.getEGLContext(), this.mVideoFrame.getTextureID(), this.mVideoFrame.getGLSync());
        }
    }

    public static /* synthetic */ void lambda$setReleaseCallback$1(Runnable runnable, EGLContext eGLContext, int i, long j) {
        C1C7U.LIZ("LyraxVideoFrameWrapper@83fa.setReleaseCallback$1L");
        if (runnable != null) {
            runnable.run();
        }
        C1C7U.LIZIZ("LyraxVideoFrameWrapper@83fa.setReleaseCallback$1L");
    }
}
