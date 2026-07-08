package com.ss.bytertc.engine.video.converter;

import X.C1C7U;
import X.C2188811AlT;
import X.RunnableC1278440jNC;
import X.RunnableC1278450jND;
import android.graphics.Matrix;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.realx.video.JavaI420Buffer;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.utils.ByteBufferUtils;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.lyrax.video.LyraxVideoFrame;
import com.ss.lyrax.video.LyraxVideoFrameType;
import com.ss.lyrax.video.LyraxVideoPixelFormat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class WebRTCConverter {
    public static final String TAG = "WebRTCConverter";

    public static /* synthetic */ void lambda$semisugar$release$0(VideoFrame videoFrame) {
        C1C7U.LIZ("WebRTCConverter@7d.convertByteRGBAFrame2WebrtcI420Frame$1L");
        videoFrame.release();
        C1C7U.LIZIZ("WebRTCConverter@7d.convertByteRGBAFrame2WebrtcI420Frame$1L");
    }

    public static /* synthetic */ void lambda$semisugar$release$1(LyraxVideoFrame lyraxVideoFrame) {
        C1C7U.LIZ("WebRTCConverter@7d.convertByteRGBAFrame2WebrtcI420Frame$2L");
        lyraxVideoFrame.release();
        C1C7U.LIZIZ("WebRTCConverter@7d.convertByteRGBAFrame2WebrtcI420Frame$2L");
    }

    public static com.bytedance.realx.video.VideoFrame convertByteI420Frame2WebrtcI420Frame(VideoFrame videoFrame) {
        if (videoFrame.getFrameType() != VideoFrameType.RAW_MEMORY || videoFrame.getPixelFormat() != VideoPixelFormat.I420) {
            return null;
        }
        videoFrame.retain();
        int width = videoFrame.getWidth();
        int height = videoFrame.getHeight();
        ByteBuffer planeData = videoFrame.getPlaneData(0);
        ByteBuffer planeData2 = videoFrame.getPlaneData(1);
        ByteBuffer planeData3 = videoFrame.getPlaneData(2);
        try {
            return new com.bytedance.realx.video.VideoFrame(JavaI420Buffer.wrap(width, height, planeData, videoFrame.getPlaneStride(0), planeData2, videoFrame.getPlaneStride(1), planeData3, videoFrame.getPlaneStride(2), new RunnableC1278440jNC(videoFrame)), videoFrame.getRotation().value(), videoFrame.getTimeStampUs());
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            videoFrame.release();
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Frame convert failed: ");
            sbLIZ.append(e.getMessage());
            LogUtil.e(str, C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static com.bytedance.realx.video.VideoFrame convertByteRGBAFrame2WebrtcI420Frame(VideoFrame videoFrame) {
        if (videoFrame.getFrameType() == VideoFrameType.RAW_MEMORY && videoFrame.getPixelFormat() == VideoPixelFormat.RGBA) {
            int width = videoFrame.getWidth();
            int height = videoFrame.getHeight();
            int planeStride = videoFrame.getPlaneStride(0);
            int i = ((width + 63) / 64) * 64;
            int i2 = (((width >> 1) + 63) / 64) * 64;
            ByteBuffer planeData = videoFrame.getPlaneData(0);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * height);
            int i3 = ((height + 1) >> 1) * i2;
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i3);
            ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(i3);
            ByteBufferUtils.nativeRGBAToI420(planeData, planeStride, byteBufferAllocateDirect, i, byteBufferAllocateDirect2, i2, byteBufferAllocateDirect3, i2, width, height);
            return new com.bytedance.realx.video.VideoFrame(JavaI420Buffer.wrap(width, height, byteBufferAllocateDirect, i, byteBufferAllocateDirect2, i2, byteBufferAllocateDirect3, i2, new RunnableC1278440jNC(videoFrame)), videoFrame.getRotation().value(), videoFrame.getTimeStampUs());
        }
        return null;
    }

    public static com.bytedance.realx.video.VideoFrame convertByteI420Frame2WebrtcI420Frame(LyraxVideoFrame lyraxVideoFrame) {
        if (lyraxVideoFrame.getFrameType() != LyraxVideoFrameType.RAW_MEMORY || lyraxVideoFrame.getPixelFormat() != LyraxVideoPixelFormat.I420) {
            return null;
        }
        lyraxVideoFrame.retain();
        int width = lyraxVideoFrame.getWidth();
        int height = lyraxVideoFrame.getHeight();
        ByteBuffer planeData = lyraxVideoFrame.getPlaneData(0);
        ByteBuffer planeData2 = lyraxVideoFrame.getPlaneData(1);
        ByteBuffer planeData3 = lyraxVideoFrame.getPlaneData(2);
        try {
            return new com.bytedance.realx.video.VideoFrame(JavaI420Buffer.wrap(width, height, planeData, lyraxVideoFrame.getPlaneStride(0), planeData2, lyraxVideoFrame.getPlaneStride(1), planeData3, lyraxVideoFrame.getPlaneStride(2), new RunnableC1278450jND(lyraxVideoFrame)), lyraxVideoFrame.getRotation().value(), lyraxVideoFrame.getTimeStampUs());
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            lyraxVideoFrame.release();
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Frame convert failed: ");
            sbLIZ.append(e.getMessage());
            LogUtil.e(str, C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static com.bytedance.realx.video.VideoFrame convertByteRGBAFrame2WebrtcI420Frame(LyraxVideoFrame lyraxVideoFrame) {
        if (lyraxVideoFrame.getFrameType() == LyraxVideoFrameType.RAW_MEMORY && lyraxVideoFrame.getPixelFormat() == LyraxVideoPixelFormat.RGBA) {
            int width = lyraxVideoFrame.getWidth();
            int height = lyraxVideoFrame.getHeight();
            int planeStride = lyraxVideoFrame.getPlaneStride(0);
            int i = ((width + 63) / 64) * 64;
            int i2 = (((width >> 1) + 63) / 64) * 64;
            ByteBuffer planeData = lyraxVideoFrame.getPlaneData(0);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * height);
            int i3 = ((height + 1) >> 1) * i2;
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i3);
            ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(i3);
            ByteBufferUtils.nativeRGBAToI420(planeData, planeStride, byteBufferAllocateDirect, i, byteBufferAllocateDirect2, i2, byteBufferAllocateDirect3, i2, width, height);
            return new com.bytedance.realx.video.VideoFrame(JavaI420Buffer.wrap(width, height, byteBufferAllocateDirect, i, byteBufferAllocateDirect2, i2, byteBufferAllocateDirect3, i2, new RunnableC1278450jND(lyraxVideoFrame)), lyraxVideoFrame.getRotation().value(), lyraxVideoFrame.getTimeStampUs());
        }
        return null;
    }

    public static com.bytedance.realx.video.VideoFrame convertByteTexFrame2WebrtcTexFrame(VideoFrame videoFrame, Looper looper) {
        VideoFrame.TextureBuffer.Type type;
        if (videoFrame.getFrameType() != VideoFrameType.GL_TEXTURE || looper == null) {
            return null;
        }
        Matrix matrixConvertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(videoFrame.getTextureMatrix());
        if (videoFrame.getPixelFormat() == VideoPixelFormat.TEXTURE_2D) {
            type = VideoFrame.TextureBuffer.Type.RGB;
        } else {
            type = VideoFrame.TextureBuffer.Type.OES;
        }
        videoFrame.retain();
        return new com.bytedance.realx.video.VideoFrame(new TextureBufferImpl(videoFrame.getWidth(), videoFrame.getHeight(), type, videoFrame.getTextureID(), matrixConvertMatrixToAndroidGraphicsMatrix, new BPEAHandler(looper), new YuvConverter(), new RunnableC1278440jNC(videoFrame)), videoFrame.getRotation().value(), videoFrame.getTimeStampUs());
    }

    public static com.bytedance.realx.video.VideoFrame convertByteTexFrame2WebrtcTexFrame(LyraxVideoFrame lyraxVideoFrame, Looper looper) {
        VideoFrame.TextureBuffer.Type type;
        if (lyraxVideoFrame.getFrameType() != LyraxVideoFrameType.GL_TEXTURE || looper == null) {
            return null;
        }
        Matrix matrixConvertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(lyraxVideoFrame.getTextureMatrix());
        if (lyraxVideoFrame.getPixelFormat() == LyraxVideoPixelFormat.TEXTURE_2D) {
            type = VideoFrame.TextureBuffer.Type.RGB;
        } else {
            type = VideoFrame.TextureBuffer.Type.OES;
        }
        lyraxVideoFrame.retain();
        return new com.bytedance.realx.video.VideoFrame(new TextureBufferImpl(lyraxVideoFrame.getWidth(), lyraxVideoFrame.getHeight(), type, lyraxVideoFrame.getTextureID(), matrixConvertMatrixToAndroidGraphicsMatrix, new BPEAHandler(looper), new YuvConverter(), new RunnableC1278450jND(lyraxVideoFrame)), lyraxVideoFrame.getRotation().value(), lyraxVideoFrame.getTimeStampUs());
    }
}
