package com.ss.lyrax.video;

import X.C1266420j3o;
import X.C1267670j5p;
import X.C1270180j9s;
import X.C1283100jUi;
import Y.ARunnableS31S0101000_20;
import android.graphics.SurfaceTexture;
import android.hardware.display.VirtualDisplay;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.ttlivestreamer.core.utils.AVLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public final class LyraxScreenCapture extends AbsLyraxVideoPlatformWrapper {
    public static final Companion Companion = new Companion();
    public final C1266420j3o videoSourceManager;
    public volatile LyraxVideoSourceState state = LyraxVideoSourceState.CREATED;
    public final Object lock = new Object();
    public int width = 720;
    public int height = 1280;
    public int fps = 30;

    public static final class Companion {
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public void enablePushAliveCheck(boolean z) {
    }

    @Override // com.ss.lyrax.video.AbsLyraxVideoPlatformWrapper, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        stopPlatformCapture();
        super.release();
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public void setPushTimeoutThreshold(int i) {
    }

    private final C1267670j5p getActiveCaptureManager() {
        this.videoSourceManager.LIZ(3);
        return this.videoSourceManager.LJFF;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxErrorCode startPlatformCapture() {
        LyraxErrorCode lyraxErrorCode;
        synchronized (this.lock) {
            try {
                C1267670j5p activeCaptureManager = getActiveCaptureManager();
                if (activeCaptureManager == null) {
                    return LyraxErrorCode.NOT_SUPPORT;
                }
                try {
                    applyCaptureConfig(activeCaptureManager);
                    activeCaptureManager.LIZ();
                    this.state = LyraxVideoSourceState.STARTED;
                    lyraxErrorCode = LyraxErrorCode.SUCCESS;
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    lyraxErrorCode = LyraxErrorCode.FAILURE;
                }
                return lyraxErrorCode;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxErrorCode stopPlatformCapture() {
        LyraxErrorCode lyraxErrorCode;
        synchronized (this.lock) {
            try {
                C1267670j5p activeCaptureManager = getActiveCaptureManager();
                if (activeCaptureManager == null) {
                    this.state = LyraxVideoSourceState.STOPPED;
                    return LyraxErrorCode.NOT_SUPPORT;
                }
                try {
                    activeCaptureManager.LJIILL();
                    this.state = LyraxVideoSourceState.STOPPED;
                    lyraxErrorCode = LyraxErrorCode.SUCCESS;
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    lyraxErrorCode = LyraxErrorCode.FAILURE;
                }
                return lyraxErrorCode;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxErrorCode uninitPlatformWrapper() {
        stopPlatformCapture();
        this.state = LyraxVideoSourceState.CREATED;
        return LyraxErrorCode.SUCCESS;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxVideoContentType getContentType() {
        return LyraxVideoContentType.SCREEN;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxVideoSourceType getSourceType() {
        return LyraxVideoSourceType.INTERNAL_RAW_FRAME;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxVideoSourceState getState() {
        return this.state;
    }

    public LyraxScreenCapture(C1266420j3o c1266420j3o) {
        this.videoSourceManager = c1266420j3o;
    }

    private final void applyCaptureConfig(C1267670j5p c1267670j5p) {
        Handler handler;
        Handler handler2;
        final int i = this.width;
        final int i2 = this.height;
        int i3 = this.fps;
        final C1270180j9s c1270180j9s = c1267670j5p.LLIZLLLIL;
        if (c1270180j9s != null) {
            if (c1270180j9s.LLJJJIL != null && (handler2 = c1270180j9s.LLILZ) != null) {
                C1283100jUi.LIZIZ(handler2, new Runnable() { // from class: X.0j9t
                    public final /* synthetic */ boolean LLILZ = true;

                    @Override // java.lang.Runnable
                    public final void run() {
                        VirtualDisplay virtualDisplay;
                        C1270180j9s c1270180j9s2 = c1270180j9s;
                        int i4 = i;
                        int i5 = i2;
                        boolean z = this.LLILZ;
                        C1C7U.LIZ("ScreenVideoNode@5892.changeScreenCaptureSize$1L");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("changeScreenCaptureSize before this.width:");
                        sbLIZ.append(c1270180j9s2.LLJJ);
                        sbLIZ.append(" this height:");
                        sbLIZ.append(c1270180j9s2.LLJJI);
                        sbLIZ.append(" after, resizeWidth:");
                        sbLIZ.append(i4);
                        sbLIZ.append(" resizeHeight:");
                        sbLIZ.append(i5);
                        sbLIZ.append(", changVirtualSize:");
                        sbLIZ.append(z);
                        AVLog.logKibana(4, "ScreenVideoNode", C2188811AlT.LIZIZ(sbLIZ), null);
                        c1270180j9s2.LLJJ = i4;
                        c1270180j9s2.LLJJI = i5;
                        SurfaceTexture surfaceTexture = c1270180j9s2.LLIZ;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(i4, i5);
                        }
                        if (z && (virtualDisplay = c1270180j9s2.LLJJJIL) != null) {
                            virtualDisplay.resize(i4, i5, 400);
                        }
                        C1C7U.LIZIZ("ScreenVideoNode@5892.changeScreenCaptureSize$1L");
                    }
                });
            }
            synchronized (c1270180j9s) {
                if (c1270180j9s.LLJJJIL != null && (handler = c1270180j9s.LLILZ) != null) {
                    C1283100jUi.LIZIZ(handler, new ARunnableS31S0101000_20(i3, c1270180j9s, 43));
                }
            }
        }
    }

    private final void updateLocalCaptureConfig(LyraxVideoPlatformCaptureConfig lyraxVideoPlatformCaptureConfig) {
        if (lyraxVideoPlatformCaptureConfig == null) {
            return;
        }
        int i = lyraxVideoPlatformCaptureConfig.width;
        if (i > 0) {
            this.width = i;
        }
        int i2 = lyraxVideoPlatformCaptureConfig.height;
        if (i2 > 0) {
            this.height = i2;
        }
        int i3 = lyraxVideoPlatformCaptureConfig.framerate;
        if (i3 > 0) {
            this.fps = i3;
        }
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxErrorCode pushVideoFrame(LyraxVideoFrame lyraxVideoFrame) {
        if (lyraxVideoFrame == null) {
            return LyraxErrorCode.INVALID_PARAMS;
        }
        if (getNativePeer() == 0) {
            return LyraxErrorCode.INVALID_STATE;
        }
        LyraxErrorCode lyraxErrorCodePushFrameToNative = pushFrameToNative(lyraxVideoFrame);
        if (lyraxErrorCodePushFrameToNative == LyraxErrorCode.SUCCESS || lyraxErrorCodePushFrameToNative == LyraxErrorCode.TIMESTAMP_ERROR) {
            this.state = LyraxVideoSourceState.STARTED;
        }
        return lyraxErrorCodePushFrameToNative;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxErrorCode updateExternalStats(LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats) {
        return updateStatsToNative(lyraxPreProcessVideoNodeStats);
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxErrorCode updatePlatformCaptureConfig(LyraxVideoPlatformCaptureConfig lyraxVideoPlatformCaptureConfig) {
        LyraxErrorCode lyraxErrorCode;
        if (lyraxVideoPlatformCaptureConfig == null) {
            return LyraxErrorCode.INVALID_PARAMS;
        }
        synchronized (this.lock) {
            try {
                updateLocalCaptureConfig(lyraxVideoPlatformCaptureConfig);
                C1267670j5p activeCaptureManager = getActiveCaptureManager();
                if (activeCaptureManager == null) {
                    return LyraxErrorCode.NOT_SUPPORT;
                }
                try {
                    applyCaptureConfig(activeCaptureManager);
                    lyraxErrorCode = LyraxErrorCode.SUCCESS;
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    lyraxErrorCode = LyraxErrorCode.FAILURE;
                }
                return lyraxErrorCode;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private final LyraxErrorCode runManagerCall(String str, Function0<? extends LyraxErrorCode> function0) {
        try {
            return function0.invoke();
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            return LyraxErrorCode.FAILURE;
        }
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxErrorCode initPlatformWrapper(LyraxVideoPlatformWrapperConfig lyraxVideoPlatformWrapperConfig, LyraxVideoPlatformCaptureConfig lyraxVideoPlatformCaptureConfig) {
        updateLocalCaptureConfig(lyraxVideoPlatformCaptureConfig);
        this.state = LyraxVideoSourceState.CREATED;
        return LyraxErrorCode.SUCCESS;
    }
}
