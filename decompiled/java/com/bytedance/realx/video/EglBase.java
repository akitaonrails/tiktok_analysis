package com.bytedance.realx.video;

import X.C08FF;
import android.graphics.SurfaceTexture;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes21.dex */
public interface EglBase {
    public static final int[] CONFIG_PIXEL_BUFFER;
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER;
    public static final int[] CONFIG_PLAIN;
    public static final int[] CONFIG_RECORDABLE;
    public static final int[] CONFIG_RGBA;
    public static final int[] ES2_CONFIG_PIXEL_BUFFER;
    public static final int[] ES2_CONFIG_PIXEL_RGBA_BUFFER;
    public static final int[] ES2_CONFIG_PLAIN;
    public static final int[] ES2_CONFIG_RECORDABLE;
    public static final int[] ES2_CONFIG_RGBA;
    public static final Object lock = new Object();
    public static final int[] ES3_CONFIG_PLAIN = {12324, 8, 12323, 8, 12322, 8, 12352, 64, 12344};
    public static final int[] ES3_CONFIG_RGBA = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344};
    public static final int[] ES3_CONFIG_PIXEL_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12352, 64, 12339, 1, 12344};
    public static final int[] ES3_CONFIG_PIXEL_RGBA_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12339, 1, 12344};
    public static final int[] ES3_CONFIG_RECORDABLE = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12610, 1, 12344};

    public interface Context {
        EGLContext getEgl10Context();

        android.opengl.EGLContext getEgl14Context();

        int getGLESVersion();

        long getNativeEglContext();
    }

    public interface EglContextChecker {
        void EglContextDestoryEnd();

        void EglContextDestoryStart();
    }

    public static class EglLock {
        public static boolean enableEglLock = true;
    }

    void createDummyPbufferSurface();

    void createPbufferSurface(int i, int i2);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    EGLDisplay getDisplay();

    Context getEglBaseContext();

    int getGLESVersion();

    EGLSurface getSurface();

    boolean hasSurface();

    void makeCurrent();

    void release();

    void releaseSurface();

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers();

    void swapBuffers(long j);

    /* JADX INFO: renamed from: com.bytedance.realx.video.EglBase$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$EglBase$Config;

        static {
            int[] iArr = new int[Config.values().length];
            $SwitchMap$com$bytedance$realx$video$EglBase$Config = iArr;
            try {
                iArr[Config.CONFIG_RGBA.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$EglBase$Config[Config.CONFIG_PIXEL_BUFFER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$EglBase$Config[Config.CONFIG_PIXEL_RGBA_BUFFER.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$EglBase$Config[Config.CONFIG_RECORDABLE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$EglBase$Config[Config.CONFIG_PLAIN.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
    }

    static {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
        ES2_CONFIG_PLAIN = iArr;
        int[] iArr2 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
        ES2_CONFIG_RGBA = iArr2;
        int[] iArr3 = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12339, 1, 12344};
        ES2_CONFIG_PIXEL_BUFFER = iArr3;
        int[] iArr4 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
        ES2_CONFIG_PIXEL_RGBA_BUFFER = iArr4;
        int[] iArr5 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344};
        ES2_CONFIG_RECORDABLE = iArr5;
        CONFIG_PLAIN = iArr;
        CONFIG_RGBA = iArr2;
        CONFIG_PIXEL_BUFFER = iArr3;
        CONFIG_PIXEL_RGBA_BUFFER = iArr4;
        CONFIG_RECORDABLE = iArr5;
    }

    public static class EglVersion {
        public static int PREFERRED_EGL_VERSION = 2;

        public static int getPreferredEglVersion() {
            return PREFERRED_EGL_VERSION;
        }

        public static void setPreferredEglVersion(int i) {
            PREFERRED_EGL_VERSION = i;
        }
    }

    public enum Config {
        CONFIG_PLAIN,
        CONFIG_RGBA,
        CONFIG_PIXEL_BUFFER,
        CONFIG_PIXEL_RGBA_BUFFER,
        CONFIG_RECORDABLE;

        public static Config valueOf(String str) {
            return (Config) C08FF.LIZ(Config.class, str);
        }
    }
}
