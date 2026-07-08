package com.ss.bytertc.base.media;

import X.C1C7U;
import X.C786410Ut5;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.ss.bytertc.base.media.Texture2DToWebRTCVideoFrame;

/* JADX INFO: loaded from: classes21.dex */
public class Texture2DToWebRTCVideoFrame {
    public Handler mHandler;
    public Matrix mMat;
    public boolean needPendingRelease;
    public YuvConverter yuvConverter = new YuvConverter();
    public boolean isReleased = false;
    public boolean isFrameInUse = false;

    public static /* synthetic */ void lambda$semisugar$releaseFrame$0(Texture2DToWebRTCVideoFrame texture2DToWebRTCVideoFrame) {
        C1C7U.LIZ("Texture2DToWebRTCVideoFrame@13fe.convertTexture2DToWebRTCVideoFrame$1L");
        texture2DToWebRTCVideoFrame.releaseFrame();
        C1C7U.LIZIZ("Texture2DToWebRTCVideoFrame@13fe.convertTexture2DToWebRTCVideoFrame$1L");
    }

    private void releaseFrame() {
        this.isFrameInUse = false;
        if (!this.needPendingRelease || this.isReleased) {
            return;
        }
        this.isReleased = true;
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: X.0jQE
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$releaseFrame$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$1() {
        C1C7U.LIZ("Texture2DToWebRTCVideoFrame@13fe.release$1L");
        this.yuvConverter.release();
        this.mHandler.getLooper().quit();
        C1C7U.LIZIZ("Texture2DToWebRTCVideoFrame@13fe.release$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseFrame$0() {
        C1C7U.LIZ("Texture2DToWebRTCVideoFrame@13fe.releaseFrame$1L");
        this.yuvConverter.release();
        this.mHandler.getLooper().quit();
        C1C7U.LIZIZ("Texture2DToWebRTCVideoFrame@13fe.releaseFrame$1L");
    }

    public void release() {
        if (this.isFrameInUse) {
            this.needPendingRelease = true;
        } else {
            this.isReleased = true;
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: X.0jQD
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$release$1();
                }
            });
        }
    }

    public Texture2DToWebRTCVideoFrame() {
        this.mHandler = null;
        this.needPendingRelease = false;
        HandlerThread handlerThread = new HandlerThread("Texture2DToVideoFrame");
        handlerThread.start();
        this.mHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
        this.needPendingRelease = false;
        Matrix matrix = new Matrix();
        this.mMat = matrix;
        matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
    }

    public boolean isFameInUse() {
        return this.isFrameInUse;
    }

    public VideoFrame convertTexture2DToWebRTCVideoFrame(int i, int i2, int i3) {
        if (!this.needPendingRelease && !this.isReleased) {
            this.isFrameInUse = true;
            return new VideoFrame(new TextureBufferImpl(i2, i3, VideoFrame.TextureBuffer.Type.RGB, i, this.mMat, this.mHandler, this.yuvConverter, new Runnable() { // from class: X.0jQF
                @Override // java.lang.Runnable
                public final void run() {
                    Texture2DToWebRTCVideoFrame.lambda$semisugar$releaseFrame$0(this.LL);
                }
            }), 0, 0L);
        }
        return null;
    }
}
