package com.ss.bytertc.engine.utils;

import X.C2188811AlT;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes21.dex */
public class GLUtils {
    public static int[] defaultEGLConfAttr = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
    public static int[] ctxAttr = {12440, 2, 12344};

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

    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay) {
        return getEglConfig(eGLDisplay, defaultEGLConfAttr);
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

    public static int loadShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteShader(iGlCreateShader);
                return 0;
            }
            return iGlCreateShader;
        }
        return iGlCreateShader;
    }

    public static EGLContext createEglContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext) {
        return EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, ctxAttr, 0);
    }
}
