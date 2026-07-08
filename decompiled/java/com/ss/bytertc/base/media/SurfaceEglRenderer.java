package com.ss.bytertc.base.media;

import X.C1C7U;
import X.C2188811AlT;
import X.RunnableC1280670jQn;
import android.view.SurfaceHolder;
import com.bytedance.realx.base.Logging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes21.dex */
public class SurfaceEglRenderer extends EglRenderer implements SurfaceHolder.Callback {
    public int frameRotation;
    public boolean isFirstFrameRendered;
    public boolean isRenderingPaused;
    public final Object layoutLock;
    public RendererCommon.RendererEvents rendererEvents;
    public int rotatedFrameHeight;
    public int rotatedFrameWidth;

    public static /* synthetic */ void lambda$semisugar$countDown$0(CountDownLatch countDownLatch) {
        C1C7U.LIZ("SurfaceEglRenderer@35d7.release$1L");
        countDownLatch.countDown();
        C1C7U.LIZIZ("SurfaceEglRenderer@35d7.release$1L");
    }

    @Override // com.ss.bytertc.base.media.EglRenderer
    public void disableFpsReduction() {
        synchronized (this.layoutLock) {
            try {
                this.isRenderingPaused = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        super.disableFpsReduction();
    }

    @Override // com.ss.bytertc.base.media.EglRenderer
    public void pauseVideo() {
        synchronized (this.layoutLock) {
            try {
                this.isRenderingPaused = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        super.pauseVideo();
    }

    @Override // com.ss.bytertc.base.media.EglRenderer
    public void release() {
        super.release();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new RunnableC1280670jQn(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    public SurfaceEglRenderer(String str) {
        super(str);
        this.layoutLock = new Object();
    }

    private void logD(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.name);
        sbLIZ.append(": ");
        sbLIZ.append(str);
        Logging.i("SurfaceEglRenderer", C2188811AlT.LIZIZ(sbLIZ));
    }

    private void updateFrameDimensionsAndReportEvents(VideoFrame videoFrame) {
        synchronized (this.layoutLock) {
            try {
                if (this.isRenderingPaused) {
                    return;
                }
                if (!this.isFirstFrameRendered) {
                    this.isFirstFrameRendered = true;
                    logD("Reporting first rendered frame.");
                    RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
                    if (rendererEvents != null) {
                        rendererEvents.onFirstFrameRendered();
                    }
                }
                if (this.rotatedFrameWidth != videoFrame.getRotatedWidth() || this.rotatedFrameHeight != videoFrame.getRotatedHeight() || this.frameRotation != videoFrame.getRotation()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Reporting frame resolution changed to ");
                    sbLIZ.append(videoFrame.getBuffer().getWidth());
                    sbLIZ.append("x");
                    sbLIZ.append(videoFrame.getBuffer().getHeight());
                    sbLIZ.append(" with rotation ");
                    sbLIZ.append(videoFrame.getRotation());
                    logD(C2188811AlT.LIZIZ(sbLIZ));
                    RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                    if (rendererEvents2 != null) {
                        rendererEvents2.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                    }
                    this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                    this.rotatedFrameHeight = videoFrame.getRotatedHeight();
                    this.frameRotation = videoFrame.getRotation();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.bytertc.base.media.EglRenderer, com.ss.bytertc.base.media.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        updateFrameDimensionsAndReportEvents(videoFrame);
        super.onFrame(videoFrame);
    }

    @Override // com.ss.bytertc.base.media.EglRenderer
    public void setFpsReduction(float f) {
        boolean z;
        synchronized (this.layoutLock) {
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            try {
                this.isRenderingPaused = z;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        super.setFpsReduction(f);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        createEglSurface(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new RunnableC1280670jQn(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    @Override // com.ss.bytertc.base.media.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.layoutLock) {
            try {
                this.rendererEvents = rendererEvents;
                this.isFirstFrameRendered = false;
                this.rotatedFrameWidth = 0;
                this.rotatedFrameHeight = 0;
                this.frameRotation = 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        super.init(context, iArr, glDrawer);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ThreadUtils.checkIsOnMainThread();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceChanged: format: ");
        sbLIZ.append(i);
        sbLIZ.append(" size: ");
        sbLIZ.append(i2);
        sbLIZ.append("x");
        sbLIZ.append(i3);
        logD(C2188811AlT.LIZIZ(sbLIZ));
    }
}
