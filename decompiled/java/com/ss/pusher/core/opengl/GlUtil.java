package com.ss.pusher.core.opengl;

import X.C2188811AlT;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.util.AndroidRuntimeException;
import com.ss.pusher.core.utils.AVLog;

/* JADX INFO: loaded from: classes21.dex */
public class GlUtil {
    public static native int nativeAttachThreadToOpenGl(long j, int i, long j2);

    public static native void nativeDetachThreadToOpenGl();

    public static native boolean nativeIsOpenGlThread();

    public static void LIZ() {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EGL error: ");
            sbLIZ.append("clearAllGLError");
            sbLIZ.append(" (code :");
            sbLIZ.append(iEglGetError);
            sbLIZ.append(")");
            throw new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (EGL14.eglGetCurrentDisplay() == EGL14.EGL_NO_DISPLAY) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Bad EGL display:");
            sbLIZ2.append("clearAllGLError");
            throw new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (EGL14.eglGetCurrentContext() == EGL14.EGL_NO_CONTEXT) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Bad EGL context:");
            sbLIZ3.append("clearAllGLError");
            throw new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
        }
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("GLES error:");
        sbLIZ4.append("clearAllGLError");
        sbLIZ4.append(" (code :");
        sbLIZ4.append(iGlGetError);
        sbLIZ4.append(")");
        throw new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ4));
    }

    public static void LIZIZ(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(": GL error: ");
            sbLIZ.append(iGlGetError);
            AVLog.logKibana(5, "GlUtil", C2188811AlT.LIZIZ(sbLIZ), null);
        }
    }

    public static void LIZJ(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(": GLES20 error: ");
        sbLIZ.append(iGlGetError);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static int LIZLLL(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(i, i2);
        float f = 9729;
        GLES20.glTexParameterf(i, 10241, f);
        GLES20.glTexParameterf(i, 10240, f);
        GLES20.glTexParameterf(i, 10242, 33071.0f);
        GLES20.glTexParameterf(i, 10243, 33071.0f);
        GLES20.glPixelStorei(3317, 2);
        LIZJ("generateTexture");
        return i2;
    }
}
