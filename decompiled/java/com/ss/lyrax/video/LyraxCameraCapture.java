package com.ss.lyrax.video;

import X.C1266420j3o;
import X.C1267940j6G;
import X.C1270620jAa;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.LyraxErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public final class LyraxCameraCapture extends AbsLyraxVideoPlatformWrapper {
    public static final Companion Companion = new Companion();
    public int captureDevice;
    public LyraxVideoContentType contentType;
    public int fps;
    public int height;
    public final Object lock;
    public int minFps;
    public volatile LyraxVideoSourceState state;
    public final C1266420j3o videoSourceManager;
    public int width;

    public static final class Companion {
        public final int normalizeCameraDevice(int i) {
            return i != 2 ? 1 : 2;
        }
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

    private final C1267940j6G buildCaptureParams() {
        C1267940j6G c1267940j6G = new C1267940j6G();
        c1267940j6G.LIZ = this.width;
        c1267940j6G.LIZIZ = this.height;
        c1267940j6G.LIZLLL = this.fps;
        c1267940j6G.LIZJ = this.minFps;
        c1267940j6G.LJ = this.captureDevice == 2 ? 0 : 1;
        return c1267940j6G;
    }

    private final C1270620jAa getActiveCaptureManager() {
        this.videoSourceManager.LIZ(this.captureDevice);
        return this.videoSourceManager.LJI;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxErrorCode startPlatformCapture() {
        LyraxErrorCode lyraxErrorCode;
        synchronized (this.lock) {
            try {
                C1270620jAa activeCaptureManager = getActiveCaptureManager();
                if (activeCaptureManager == null) {
                    return LyraxErrorCode.NOT_SUPPORT;
                }
                try {
                    activeCaptureManager.LIZLLL(buildCaptureParams());
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
                C1270620jAa activeCaptureManager = getActiveCaptureManager();
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

    @Override // com.ss.lyrax.video.AbsLyraxVideoPlatformWrapper, com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxErrorCode switchCameraBack() {
        beginCaptureMaskToNative();
        try {
            LyraxErrorCode lyraxErrorCodeSwitchCameraDevice = switchCameraDevice(2);
            endCaptureMaskToNative();
            return lyraxErrorCodeSwitchCameraDevice;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            endCaptureMaskToNative();
            throw th;
        }
    }

    @Override // com.ss.lyrax.video.AbsLyraxVideoPlatformWrapper, com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxErrorCode switchCameraFront() {
        beginCaptureMaskToNative();
        try {
            LyraxErrorCode lyraxErrorCodeSwitchCameraDevice = switchCameraDevice(1);
            endCaptureMaskToNative();
            return lyraxErrorCodeSwitchCameraDevice;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            endCaptureMaskToNative();
            throw th;
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
        return this.contentType;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxVideoSourceType getSourceType() {
        return LyraxVideoSourceType.INTERNAL_RAW_FRAME;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxVideoSourceState getState() {
        return this.state;
    }

    public LyraxCameraCapture(C1266420j3o c1266420j3o) {
        this(c1266420j3o, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r2.equals("2") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        if (r2.equals("camera_front") != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Integer parseCameraDevice(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L63
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r5)
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L63
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r1.toLowerCase(r0)
            if (r2 == 0) goto L63
            int r1 = r2.hashCode()
            r0 = -602844017(0xffffffffdc11548f, float:-1.6362738E17)
            if (r1 == r0) goto L5b
            if (r1 == 0) goto L52
            r0 = 3015911(0x2e04e7, float:4.226191E-39)
            if (r1 == r0) goto L72
            r0 = 97705513(0x5d2de29, float:1.9829914E-35)
            if (r1 == r0) goto L49
            r0 = 2058627521(0x7ab429c1, float:4.6773015E35)
            if (r1 == r0) goto L69
            r0 = 49
            if (r1 == r0) goto L40
            r0 = 50
            if (r1 != r0) goto L3f
            java.lang.String r0 = "2"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L7b
        L3f:
            return r3
        L40:
            java.lang.String r0 = "1"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L63
            return r3
        L49:
            java.lang.String r0 = "front"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L63
            return r3
        L52:
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L63
            return r3
        L5b:
            java.lang.String r0 = "camera_front"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3f
        L63:
            r0 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L69:
            java.lang.String r0 = "camera_back"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L7b
            return r3
        L72:
            java.lang.String r0 = "back"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L7b
            return r3
        L7b:
            r0 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lyrax.video.LyraxCameraCapture.parseCameraDevice(java.lang.String):java.lang.Integer");
    }

    private final LyraxErrorCode switchCameraDevice(int i) {
        LyraxErrorCode lyraxErrorCode;
        synchronized (this.lock) {
            try {
                int iNormalizeCameraDevice = Companion.normalizeCameraDevice(i);
                int i2 = this.captureDevice;
                if (i2 == iNormalizeCameraDevice) {
                    return LyraxErrorCode.SUCCESS;
                }
                this.captureDevice = iNormalizeCameraDevice;
                try {
                    this.videoSourceManager.LJ(i2, iNormalizeCameraDevice);
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
            if (i3 >= 30) {
                i3 = 7;
            }
            this.minFps = i3;
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

    @Override // com.ss.lyrax.video.AbsLyraxVideoPlatformWrapper, com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public LyraxErrorCode switchCameraTo(String str) {
        Integer cameraDevice = parseCameraDevice(str);
        if (cameraDevice != null) {
            int iIntValue = cameraDevice.intValue();
            beginCaptureMaskToNative();
            try {
                LyraxErrorCode lyraxErrorCodeSwitchCameraDevice = switchCameraDevice(iIntValue);
                endCaptureMaskToNative();
                return lyraxErrorCodeSwitchCameraDevice;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                endCaptureMaskToNative();
                throw th;
            }
        }
        return LyraxErrorCode.NOT_SUPPORT;
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
                C1270620jAa activeCaptureManager = getActiveCaptureManager();
                if (activeCaptureManager == null) {
                    return LyraxErrorCode.NOT_SUPPORT;
                }
                try {
                    activeCaptureManager.LIZLLL(buildCaptureParams());
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

    public LyraxCameraCapture(C1266420j3o c1266420j3o, int i) {
        this.videoSourceManager = c1266420j3o;
        this.captureDevice = i;
        this.state = LyraxVideoSourceState.CREATED;
        this.contentType = LyraxVideoContentType.CAMERA;
        this.lock = new Object();
        this.width = 1280;
        this.height = 720;
        this.fps = 30;
        this.minFps = 7;
        this.captureDevice = Companion.normalizeCameraDevice(this.captureDevice);
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
        if (lyraxVideoPlatformWrapperConfig != null && lyraxVideoPlatformWrapperConfig.contentType != null) {
            this.contentType = lyraxVideoPlatformWrapperConfig.contentType;
        }
        updateLocalCaptureConfig(lyraxVideoPlatformCaptureConfig);
        this.state = LyraxVideoSourceState.CREATED;
        return LyraxErrorCode.SUCCESS;
    }
}
