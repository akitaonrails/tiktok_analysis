package com.bytedance.realx.video;

import X.C1280730jQt;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import com.bytedance.realx.video.EglBase;

/* JADX INFO: loaded from: classes21.dex */
public class EglBaseUtils {
    public static EGLContext getCurrentContext() {
        return EGL14.eglGetCurrentContext();
    }

    public static int getPreferredEglVersion() {
        return EglBase.EglVersion.getPreferredEglVersion();
    }

    public static EglBase createEGLBase(EGLContext eGLContext) {
        if (eGLContext != EGL14.EGL_NO_CONTEXT && eGLContext != null) {
            return C1280730jQt.LJFF(eGLContext, C1280730jQt.LJIIJ(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_PLAIN));
        }
        return C1280730jQt.LJI(C1280730jQt.LJIIJ(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_PLAIN));
    }

    public static EglBase.Context getEGLBaseContext(EglBase eglBase) {
        if (eglBase != null) {
            return eglBase.getEglBaseContext();
        }
        return null;
    }

    public static long getNativeContextFromEGLBaseContext(EglBase.Context context) {
        if (context != null) {
            return context.getNativeEglContext();
        }
        return 0L;
    }

    public static long getNativeEGLContext(EGLContext eGLContext) {
        if (eGLContext == null) {
            return 0L;
        }
        return eGLContext.getNativeHandle();
    }

    public static void releaseEGLBase(EglBase eglBase) {
        if (eglBase != null) {
            eglBase.release();
        }
    }

    public static void setPreferredEglVersion(int i) {
        EglBase.EglVersion.setPreferredEglVersion(i);
    }
}
