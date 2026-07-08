package com.bytedance.codecx.video;

import X.C2188811AlT;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.codecx.video.EglBase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes21.dex */
public class EglBase10 implements EglBase {
    public static int egl10ContextCount;
    public EGLConfig eglConfig;
    public EGLContext eglContext;
    public EGLDisplay eglDisplay;
    public EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;
    public final EGL10 egl = (EGL10) EGLContext.getEGL();

    @Override // com.bytedance.codecx.video.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // com.bytedance.codecx.video.EglBase
    public android.opengl.EGLDisplay getDisplay() {
        return null;
    }

    @Override // com.bytedance.codecx.video.EglBase
    public int getGLESVersion() {
        return 2;
    }

    @Override // com.bytedance.codecx.video.EglBase
    public android.opengl.EGLSurface getSurface() {
        return null;
    }

    @Override // com.bytedance.codecx.video.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    @Override // com.bytedance.codecx.video.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == EGL10.EGL_NO_DISPLAY || this.eglContext == EGL10.EGL_NO_CONTEXT || this.eglConfig == null) {
            throw new RuntimeException("This object has been released");
        }
    }

    private void eglDetachCurrent() {
        EGL10 egl10 = this.egl;
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eglDetachCurrent failed: 0x");
        sbLIZ.append(Integer.toHexString(this.egl.eglGetError()));
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    private void eglMakeCurrent() {
        EGL10 egl10 = this.egl;
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = this.eglSurface;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eglMakeCurrent failed: 0x");
        sbLIZ.append(Integer.toHexString(this.egl.eglGetError()));
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    private EGLDisplay getEglDisplay() {
        EGLDisplay eGLDisplayEglGetDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unable to get EGL10 display: 0x");
            sbLIZ.append(Integer.toHexString(this.egl.eglGetError()));
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.egl.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            return eGLDisplayEglGetDisplay;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Unable to initialize EGL10: 0x");
        sbLIZ2.append(Integer.toHexString(this.egl.eglGetError()));
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
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
    public EglBase.Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    @Override // com.bytedance.codecx.video.EglBase
    public boolean hasSurface() {
        return this.eglSurface != EGL10.EGL_NO_SURFACE;
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            this.egl.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = EGL10.EGL_NO_SURFACE;
        }
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
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
        this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
        EglBaseCheckerHelper.EglContextDestoryEnd();
        this.egl.eglTerminate(this.eglDisplay);
        this.eglContext = EGL10.EGL_NO_CONTEXT;
        this.eglDisplay = EGL10.EGL_NO_DISPLAY;
        this.eglConfig = null;
        egl10ContextCount--;
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface == EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't swap buffers");
        }
        if (!EglBase.EglLock.enableEglLock) {
            this.egl.eglSwapBuffers(this.eglDisplay, eGLSurface);
            return;
        }
        synchronized (EglBase.lock) {
            try {
                this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static class Context implements EglBase.Context {
        public final EGLContext eglContext;

        @Override // com.bytedance.codecx.video.EglBase.Context
        public android.opengl.EGLContext getEgl14Context() {
            return null;
        }

        @Override // com.bytedance.codecx.video.EglBase.Context
        public int getGLESVersion() {
            return 2;
        }

        @Override // com.bytedance.codecx.video.EglBase.Context
        public long getNativeEglContext() {
            return 0L;
        }

        @Override // com.bytedance.codecx.video.EglBase.Context
        public EGLContext getEgl10Context() {
            return this.eglContext;
        }

        public Context(EGLContext eGLContext) {
            this.eglContext = eGLContext;
        }
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof SurfaceHolder) && !(obj instanceof SurfaceTexture)) {
            throw new IllegalStateException("Input must be either a SurfaceHolder or SurfaceTexture");
        }
        checkIsNotReleased();
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            EGLSurface eGLSurfaceEglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344});
            this.eglSurface = eGLSurfaceEglCreateWindowSurface;
            if (eGLSurfaceEglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to create window surface: 0x");
            sbLIZ.append(Integer.toHexString(this.egl.eglGetError()));
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(new SurfaceHolder(surface) { // from class: com.bytedance.codecx.video.EglBase10.1FakeSurfaceHolder
            public final Surface surface;

            @Override // android.view.SurfaceHolder
            public void addCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public Rect getSurfaceFrame() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public boolean isCreating() {
                return false;
            }

            @Override // android.view.SurfaceHolder
            public Canvas lockCanvas() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public Canvas lockCanvas(Rect rect) {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public void removeCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public void setFixedSize(int i, int i2) {
            }

            @Override // android.view.SurfaceHolder
            public void setFormat(int i) {
            }

            @Override // android.view.SurfaceHolder
            public void setKeepScreenOn(boolean z) {
            }

            @Override // android.view.SurfaceHolder
            public void setSizeFromLayout() {
            }

            @Override // android.view.SurfaceHolder
            public void setType(int i) {
            }

            @Override // android.view.SurfaceHolder
            public void unlockCanvasAndPost(Canvas canvas) {
            }

            @Override // android.view.SurfaceHolder
            public Surface getSurface() {
                return this.surface;
            }

            {
                this.surface = surface;
            }
        });
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void swapBuffers(long j) {
        swapBuffers();
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    public EglBase10(Context context, int[] iArr) {
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        EGLConfig eglConfig = getEglConfig(eglDisplay, iArr);
        this.eglConfig = eglConfig;
        this.eglContext = createEglContext(context, this.eglDisplay, eglConfig);
    }

    private EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (this.egl.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
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
        sbLIZ.append(Integer.toHexString(this.egl.eglGetError()));
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.codecx.video.EglBase
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            EGLSurface eGLSurfaceEglCreatePbufferSurface = this.egl.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344});
            this.eglSurface = eGLSurfaceEglCreatePbufferSurface;
            if (eGLSurfaceEglCreatePbufferSurface != EGL10.EGL_NO_SURFACE) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to create pixel buffer surface with size ");
            sbLIZ.append(i);
            sbLIZ.append("x");
            sbLIZ.append(i2);
            sbLIZ.append(": 0x");
            sbLIZ.append(Integer.toHexString(this.egl.eglGetError()));
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    private EGLContext createEglContext(Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContext;
        EGLContext eGLContextEglCreateContext;
        if (context != null && context.eglContext == EGL10.EGL_NO_CONTEXT) {
            throw new RuntimeException("Invalid sharedContext");
        }
        int[] iArr = {12440, 2, 12344};
        if (context == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        } else {
            eGLContext = context.eglContext;
        }
        synchronized (EglBase.lock) {
            try {
                eGLContextEglCreateContext = this.egl.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (eGLContextEglCreateContext != EGL10.EGL_NO_CONTEXT) {
            egl10ContextCount++;
            return eGLContextEglCreateContext;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to create EGL context: 0x");
        sbLIZ.append(Integer.toHexString(this.egl.eglGetError()));
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
