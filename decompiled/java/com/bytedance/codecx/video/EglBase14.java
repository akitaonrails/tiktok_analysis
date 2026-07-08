package com.bytedance.codecx.video;

import X.C1283770jVn;
import X.C2188811AlT;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;
import com.bytedance.codecx.base.CodecXLogging;
import com.bytedance.codecx.video.EglBase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public class EglBase14 implements EglBase {
    public static final int CURRENT_SDK_VERSION = Build.VERSION.SDK_INT;
    public static int egl14ContextCount;
    public EGLConfig eglConfig;
    public EGLContext eglContext;
    public EGLDisplay eglDisplay;
    public EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;
    public int glesVersion = -1;

    public static class Context implements EglBase.Context {
        public final EGLContext egl14Context;
        public final int glesVersion;

        @Override // com.bytedance.codecx.video.EglBase.Context
        public javax.microedition.khronos.egl.EGLContext getEgl10Context() {
            return null;
        }

        @Override // com.bytedance.codecx.video.EglBase.Context
        public long getNativeEglContext() {
            return EglBase14.CURRENT_SDK_VERSION >= 21 ? this.egl14Context.getNativeHandle() : this.egl14Context.getHandle();
        }

        @Override // com.bytedance.codecx.video.EglBase.Context
        public EGLContext getEgl14Context() {
            return this.egl14Context;
        }

        @Override // com.bytedance.codecx.video.EglBase.Context
        public int getGLESVersion() {
            return this.glesVersion;
        }

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
            this.glesVersion = 2;
        }

        public Context(EGLContext eGLContext, int i) {
            this.egl14Context = eGLContext;
            this.glesVersion = i;
        }
    }

    public static EGLDisplay getEglDisplay() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unable to get EGL14 display: 0x");
            sbLIZ.append(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Unable to initialize EGL14: 0x");
        sbLIZ2.append(Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // com.bytedance.codecx.video.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // com.bytedance.codecx.video.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == EGL14.EGL_NO_DISPLAY || this.eglContext == EGL14.EGL_NO_CONTEXT || this.eglConfig == null) {
            throw new RuntimeException("This object has been released");
        }
    }

    private void eglDetachCurrent() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eglDetachCurrent failed: 0x");
        sbLIZ.append(Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    private void eglMakeCurrent() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = this.eglSurface;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eglMakeCurrent failed: 0x");
        sbLIZ.append(Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void detachCurrent() {
        if (!EglBase.EglLock.enableEglLock) {
            eglDetachCurrent();
            return;
        }
        synchronized (EglBase.lock) {
            try {
                eglDetachCurrent();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.codecx.video.EglBase
    public Context getEglBaseContext() {
        return new Context(this.eglContext, this.glesVersion);
    }

    @Override // com.bytedance.codecx.video.EglBase
    public boolean hasSurface() {
        return this.eglSurface != EGL14.EGL_NO_SURFACE;
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    public static boolean isEGL14Supported() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SDK version: ");
        int i = CURRENT_SDK_VERSION;
        sbLIZ.append(i);
        sbLIZ.append(". isEGL14Supported: ");
        sbLIZ.append(i >= 18);
        C2188811AlT.LIZIZ(sbLIZ);
        return i >= 18;
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't make current");
        }
        if (!EglBase.EglLock.enableEglLock) {
            eglMakeCurrent();
            return;
        }
        synchronized (EglBase.lock) {
            try {
                eglMakeCurrent();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        EglBaseCheckerHelper.EglContextDestoryStart();
        EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
        EglBaseCheckerHelper.EglContextDestoryEnd();
        if (!GlReleaseThreadByPass.isEglReleaseThreadByPass()) {
            EGL14.eglReleaseThread();
        }
        EGL14.eglTerminate(this.eglDisplay);
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
        this.eglConfig = null;
        egl14ContextCount--;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EGL14 context destroy. current count is:");
        sbLIZ.append(egl14ContextCount);
        CodecXLogging.w("EglBase14", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't swap buffers");
        }
        if (!EglBase.EglLock.enableEglLock) {
            EGL14.eglSwapBuffers(this.eglDisplay, eGLSurface);
            return;
        }
        synchronized (EglBase.lock) {
            try {
                EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.codecx.video.EglBase
    public EGLDisplay getDisplay() {
        return this.eglDisplay;
    }

    @Override // com.bytedance.codecx.video.EglBase
    public int getGLESVersion() {
        return this.glesVersion;
    }

    @Override // com.bytedance.codecx.video.EglBase
    public EGLSurface getSurface() {
        return this.eglSurface;
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
        }
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344}, 0);
            this.eglSurface = eGLSurfaceEglCreateWindowSurface;
            if (eGLSurfaceEglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to create window surface: 0x");
            sbLIZ.append(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void swapBuffers(long j) {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            if (EglBase.EglLock.enableEglLock) {
                synchronized (EglBase.lock) {
                    try {
                        EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j);
                        EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return;
            }
            EGLExt.eglPresentationTimeANDROID(this.eglDisplay, eGLSurface, j);
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    public EglBase14(Context context, int[] iArr) {
        init(EglBase.EglVersion.getPreferredEglVersion(), context, iArr);
    }

    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            if (iArr2[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                if (eGLConfig != null) {
                    return eGLConfig;
                }
                throw new RuntimeException("eglChooseConfig returned null");
            }
            throw new RuntimeException("Unable to find any matching EGL config");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eglChooseConfig failed: 0x");
        sbLIZ.append(Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
            this.eglSurface = eGLSurfaceEglCreatePbufferSurface;
            if (eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to create pixel buffer surface with size ");
            sbLIZ.append(i);
            sbLIZ.append("x");
            sbLIZ.append(i2);
            sbLIZ.append(": 0x");
            sbLIZ.append(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    public EglBase14(int i, Context context, int[] iArr) {
        init(i, context, iArr);
    }

    private void init(int i, Context context, int[] iArr) {
        this.glesVersion = i;
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        try {
            EGLConfig eglConfig = getEglConfig(eglDisplay, iArr);
            this.eglConfig = eglConfig;
            this.eglContext = createEglContext(context, i, this.eglDisplay, eglConfig);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            if (i == 3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EGL14 GLES3 context create failed: ");
                sbLIZ.append(e.toString());
                sbLIZ.append(". trying falback to EGLS2");
                CodecXLogging.w("EglBase14", C2188811AlT.LIZIZ(sbLIZ));
                EGLConfig eglConfig2 = getEglConfig(this.eglDisplay, C1283770jVn.LJII(iArr, 12352, 64, 4));
                this.eglConfig = eglConfig2;
                this.eglContext = createEglContext(context, 2, this.eglDisplay, eglConfig2);
                return;
            }
            CodecXLogging.w("EglBase14", "EGL14 GLES context create failed.");
            throw e;
        }
    }

    public static EGLContext createEglContext(Context context, int i, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContext;
        EGLContext eGLContextEglCreateContext;
        if (context != null && context.egl14Context == EGL14.EGL_NO_CONTEXT) {
            throw new RuntimeException("Invalid sharedContext");
        }
        int[] iArr = {12440, i, 12344};
        if (context == null || (eGLContext = context.egl14Context) == null) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
        }
        synchronized (EglBase.lock) {
            try {
                eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
            egl14ContextCount++;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EGL14 context create. current count is:");
            sbLIZ.append(egl14ContextCount);
            CodecXLogging.w("EglBase14", C2188811AlT.LIZIZ(sbLIZ));
            return eGLContextEglCreateContext;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Failed to create EGL context: 0x");
        sbLIZ2.append(Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
