package com.bytedance.codecx.video;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import com.bytedance.codecx.video.EglBase;

/* JADX INFO: loaded from: classes21.dex */
public class CodecXEglBaseUtils {
    public static EGLContext getCurrentContext() {
        return EGL14.eglGetCurrentContext();
    }

    public static int getPreferredEglVersion() {
        return EglBase.EglVersion.getPreferredEglVersion();
    }

    public static EglBase.Context getEGLBaseContext(EglBase eglBase) {
        if (eglBase != null) {
            return eglBase.getEglBaseContext();
        }
        return null;
    }

    public static long getNativeEGLContext(EGLContext eGLContext) {
        if (eGLContext == null) {
            return 0L;
        }
        return eGLContext.getNativeHandle();
    }

    public static void setPreferredEglVersion(int i) {
        EglBase.EglVersion.setPreferredEglVersion(i);
    }
}
