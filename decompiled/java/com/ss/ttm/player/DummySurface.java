package com.ss.ttm.player;

import X.HandlerThreadC1284610jX9;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes21.dex */
public final class DummySurface extends Surface {
    public static int SetOutputSurfaceExceptionCounter = 0;
    public static volatile int SetOutputSurfaceExceptionLimit = 1;
    public static int SetOutputSurfaceExceptionOtherCounter = 0;
    public static volatile int SetOutputSurfaceExceptionOtherLimit = 1;
    public static int secureMode;
    public static boolean secureModeInitialized;
    public volatile boolean cached;
    public boolean hasSetOutputSurfaceException;
    public boolean hasSetOutputSurfaceExceptionOther;
    public final boolean secure;
    public final HandlerThreadC1284610jX9 thread;
    public boolean threadReleased;
    public static final ConcurrentLinkedQueue<DummySurface> caches = new ConcurrentLinkedQueue<>();
    public static volatile boolean useDummySurfaceCaches = false;
    public static volatile int cacheMode = 1;

    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Surface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void release() {
        /*
            r5 = this;
            boolean r0 = com.ss.ttm.player.DummySurface.useDummySurfaceCaches
            r3 = 2
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L21
            java.util.concurrent.ConcurrentLinkedQueue<com.ss.ttm.player.DummySurface> r0 = com.ss.ttm.player.DummySurface.caches
            int r0 = r0.size()
            if (r0 > r3) goto L21
            boolean r0 = r5.secure
            if (r0 != 0) goto L21
            boolean r0 = r5.isValid()
            if (r0 == 0) goto L21
            int r0 = com.ss.ttm.player.DummySurface.cacheMode
            if (r0 != r3) goto L28
            boolean r0 = r5.hasSetOutputSurfaceException
            if (r0 == 0) goto L28
        L21:
            super.release()
            X.0jX9 r1 = r5.thread
            monitor-enter(r1)
            goto L60
        L28:
            int r1 = com.ss.ttm.player.DummySurface.cacheMode
            r0 = 3
            if (r1 != r0) goto L32
            boolean r0 = r5.hasSetOutputSurfaceExceptionOther
            if (r0 == 0) goto L32
            goto L21
        L32:
            int r1 = com.ss.ttm.player.DummySurface.cacheMode
            r0 = 4
            if (r1 != r0) goto L49
            boolean r0 = r5.hasSetOutputSurfaceException
            if (r0 == 0) goto L49
            int r0 = com.ss.ttm.player.DummySurface.SetOutputSurfaceExceptionCounter
            int r1 = r0 + 1
            com.ss.ttm.player.DummySurface.SetOutputSurfaceExceptionCounter = r1
            int r0 = com.ss.ttm.player.DummySurface.SetOutputSurfaceExceptionLimit
            if (r1 < r0) goto L78
            useCaches(r4)
            goto L21
        L49:
            int r1 = com.ss.ttm.player.DummySurface.cacheMode
            r0 = 5
            if (r1 != r0) goto L78
            boolean r0 = r5.hasSetOutputSurfaceExceptionOther
            if (r0 == 0) goto L78
            int r0 = com.ss.ttm.player.DummySurface.SetOutputSurfaceExceptionOtherCounter
            int r1 = r0 + 1
            com.ss.ttm.player.DummySurface.SetOutputSurfaceExceptionOtherCounter = r1
            int r0 = com.ss.ttm.player.DummySurface.SetOutputSurfaceExceptionOtherLimit
            if (r1 < r0) goto L78
            useCaches(r4)
            goto L21
        L60:
            boolean r0 = r5.threadReleased     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L70
            X.0jX9 r0 = r5.thread     // Catch: java.lang.Throwable -> L72
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r0.LLILLJJLI     // Catch: java.lang.Throwable -> L72
            r0.getClass()
            X.C786410Ut5.LJLILLLLZI(r0, r3)     // Catch: java.lang.Throwable -> L72
            r5.threadReleased = r2     // Catch: java.lang.Throwable -> L72
        L70:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            return
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            throw r0
        L78:
            boolean r0 = r5.cached
            if (r0 != 0) goto L83
            java.util.concurrent.ConcurrentLinkedQueue<com.ss.ttm.player.DummySurface> r0 = com.ss.ttm.player.DummySurface.caches
            r0.add(r5)
            r5.cached = r2
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.DummySurface.release():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.ttm.player.DummySurface newInstanceV17(boolean r5) {
        /*
            boolean r0 = com.ss.ttm.player.DummySurface.useDummySurfaceCaches
            r2 = 0
            if (r0 == 0) goto L14
            if (r5 != 0) goto L16
            java.util.concurrent.ConcurrentLinkedQueue<com.ss.ttm.player.DummySurface> r0 = com.ss.ttm.player.DummySurface.caches
            java.lang.Object r0 = r0.poll()
            com.ss.ttm.player.DummySurface r0 = (com.ss.ttm.player.DummySurface) r0
            if (r0 == 0) goto L67
            r0.cached = r2
            return r0
        L14:
            if (r5 == 0) goto L67
        L16:
            java.lang.Class<com.ss.ttm.player.DummySurface> r4 = com.ss.ttm.player.DummySurface.class
            monitor-enter(r4)
            boolean r0 = com.ss.ttm.player.DummySurface.secureModeInitialized     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L66
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L63
            r0 = 24
            r3 = 1
            if (r1 < r0) goto L5d
            r0 = 26
            if (r1 >= r0) goto L3d
            java.lang.String r1 = "samsung"
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L63
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L5d
            java.lang.String r1 = "XT1650"
            java.lang.String r0 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L63
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L3d
            goto L5d
        L3d:
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r2)     // Catch: java.lang.Throwable -> L63
            r0 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r1 = android.opengl.EGL14.eglQueryString(r1, r0)     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L5d
            java.lang.String r0 = "EGL_EXT_protected_content"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L5d
            java.lang.String r0 = "EGL_KHR_surfaceless_context"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L5b
            r0 = 1
            goto L5e
        L5b:
            r0 = 2
            goto L5e
        L5d:
            r0 = 0
        L5e:
            com.ss.ttm.player.DummySurface.secureMode = r0     // Catch: java.lang.Throwable -> L63
            com.ss.ttm.player.DummySurface.secureModeInitialized = r3     // Catch: java.lang.Throwable -> L63
            goto L66
        L63:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L66:
            monitor-exit(r4)
        L67:
            X.0jX9 r0 = new X.0jX9
            r0.<init>()
            if (r5 == 0) goto L70
            int r2 = com.ss.ttm.player.DummySurface.secureMode
        L70:
            com.ss.ttm.player.DummySurface r0 = r0.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.DummySurface.newInstanceV17(boolean):com.ss.ttm.player.DummySurface");
    }

    public static void useCaches(boolean z) {
        LIZ(1, SetOutputSurfaceExceptionLimit, z);
    }

    public void addEvent(int i) {
        if (i != 1) {
            if (i == 2) {
                this.hasSetOutputSurfaceExceptionOther = true;
            }
        } else {
            this.hasSetOutputSurfaceException = true;
            this.hasSetOutputSurfaceExceptionOther = true;
        }
    }

    public DummySurface(HandlerThreadC1284610jX9 handlerThreadC1284610jX9, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = handlerThreadC1284610jX9;
        this.secure = z;
    }

    public static void LIZ(int i, int i2, boolean z) {
        useDummySurfaceCaches = z;
        cacheMode = i;
        if (i == 4) {
            SetOutputSurfaceExceptionLimit = i2;
        } else if (i == 5) {
            SetOutputSurfaceExceptionOtherLimit = i2;
        }
        if (useDummySurfaceCaches) {
            return;
        }
        while (true) {
            ConcurrentLinkedQueue<DummySurface> concurrentLinkedQueue = caches;
            if (!concurrentLinkedQueue.isEmpty()) {
                DummySurface dummySurfacePoll = concurrentLinkedQueue.poll();
                if (dummySurfacePoll != null) {
                    dummySurfacePoll.release();
                }
            } else {
                return;
            }
        }
    }
}
