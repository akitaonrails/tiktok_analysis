package com.ss.ttlivestreamer.core.opengl;

import X.C1274040jG6;
import X.C1274070jG9;
import X.C1274080jGA;
import X.C2188811AlT;
import X.C786410Ut5;
import android.app.ActivityManager;
import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.transport.ContextUtils;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class GlUtil {
    public static int glEsVersion;
    public static boolean useGlEsCache;
    public static final float[] V_FLIP_MATRIX = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    public static int sFilterType = -1;

    public static void clearAllGLError() {
        boolean z = true;
        String strLIZIZ = "";
        int i = 0;
        while (z) {
            int i2 = i + 1;
            if (i >= 10) {
                break;
            }
            try {
                checkAnyGLES2Error("clearAllGLError");
                z = false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1274080jGA.LIZ.LIZ("GlUtil.clearAllGLError", e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append("|");
                sbLIZ.append(e.getMessage());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            i = i2;
        }
        if (TextUtils.isEmpty(strLIZIZ)) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("clearAllGLError:");
        sbLIZ2.append(strLIZIZ);
        AVLog.logKibana(6, "GlUtil", C2188811AlT.LIZIZ(sbLIZ2), new AndroidRuntimeException("clearAllGLError"));
    }

    public static int createFrameBuffer() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    public static void glError(int i, Object obj) {
    }

    public static native int nativeAttachThreadToOpenGl(long j, int i, long j2);

    public static native long nativeCheckGLSyncor();

    public static native void nativeDetachThreadToOpenGl();

    public static native boolean nativeIsOpenGlThread();

    public static native void nativeWaitGLSyncor(long j, boolean z);

    public static long checkGLSyncor() {
        return nativeCheckGLSyncor();
    }

    public static boolean isGLES3Support() {
        return getGLEsVersion(ContextUtils.getApplicationContext()) >= 196608;
    }

    public static boolean nativeAttachThreadToOpenGl() {
        return nativeAttachThreadToOpenGl(GLThreadManager.getNativeEGLContext(), 0, 0L) != 0;
    }

    public static void checkAnyGLES2Error(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            if (EGL14.eglGetCurrentDisplay() != EGL14.EGL_NO_DISPLAY) {
                if (EGL14.eglGetCurrentContext() != EGL14.EGL_NO_CONTEXT) {
                    int iGlGetError = GLES20.glGetError();
                    if (iGlGetError == 0) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("GLES error:");
                    sbLIZ.append(str);
                    sbLIZ.append(" (code :");
                    sbLIZ.append(iGlGetError);
                    sbLIZ.append(")");
                    throw new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Bad EGL context:");
                sbLIZ2.append(str);
                throw new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Bad EGL display:");
            sbLIZ3.append(str);
            throw new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("EGL error: ");
        sbLIZ4.append(str);
        sbLIZ4.append(" (code :");
        sbLIZ4.append(iEglGetError);
        sbLIZ4.append(")");
        throw new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ4));
    }

    public static void checkNoGLES2Error(String str) {
        GLES20.glGetError();
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static void destroyFrameBuffer(int i) {
        if (i > 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
        }
    }

    public static void destroyTexture(int i) {
        if (i > 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
    }

    public static int generateTexture(int i) {
        clearAllGLError();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(i, i2);
        GLES20.glTexParameterf(i, 10241, getFilterType(9729));
        GLES20.glTexParameterf(i, 10240, getFilterType(9729));
        GLES20.glTexParameterf(i, 10242, 33071.0f);
        GLES20.glTexParameterf(i, 10243, 33071.0f);
        GLES20.glPixelStorei(3317, 2);
        GLES20.glGetError();
        return i2;
    }

    public static int getFilterType(int i) {
        int i2 = sFilterType;
        if (i2 != 9729 && i2 != 9728) {
            return i;
        }
        return i2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "arg" is null
    	at jadx.core.dex.instructions.args.RegisterArg.sameCodeVar(RegisterArg.java:193)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.extractConstNumber(SwitchOverStringVisitor.java:263)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.mergeWithCode(SwitchOverStringVisitor.java:184)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:71)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:65)
     */
    public static int getFilterTypeFromName(String str) {
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2025410270:
                if (str.equals("linear_mipmap_linear")) {
                    return 9987;
                }
                break;
            case -1580272728:
                if (str.equals("nearest_mipmap_nearest")) {
                    return 9984;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    b = 2;
                }
                break;
            case -1009299967:
                if (str.equals("linear_mipmap_nearest")) {
                    return 9985;
                }
                break;
            case -796902757:
                if (str.equals("nearest_mipmap_linear")) {
                    return 9986;
                }
                break;
            case 1825779806:
                if (str.equals("nearest")) {
                    return 9728;
                }
                break;
        }
        switch (b) {
            case 0:
                return 9987;
            case 1:
                return 9984;
            case 2:
                return 9729;
            case 3:
                return 9985;
            case 4:
                return 9986;
            case 5:
                return 9728;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unsupported texture filter ");
                sbLIZ.append(str);
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                C1274070jG9 c1274070jG9 = C1274080jGA.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("GlUtil.getFilterTypeFromName(");
                sbLIZ2.append(str);
                sbLIZ2.append(")");
                c1274070jG9.LIZ(C2188811AlT.LIZIZ(sbLIZ2), androidRuntimeException);
                if (!C1274040jG6.LIZ()) {
                    return 9729;
                }
                throw androidRuntimeException;
        }
    }

    public static int getGLEsVersion(Context context) {
        if (context != null && glEsVersion <= 0) {
            int i = ((ActivityManager) C786410Ut5.H2(context, "activity")).getDeviceConfigurationInfo().reqGlEsVersion;
            glEsVersion = i;
            return i;
        }
        return glEsVersion;
    }

    public static boolean isGLES3Support(Context context) {
        if (useGlEsCache) {
            if (getGLEsVersion(context) >= 196608) {
                return true;
            }
            return false;
        }
        if (((ActivityManager) C786410Ut5.H2(context, "activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
            return true;
        }
        return false;
    }

    public static boolean isGLES3_2Support(Context context) {
        if (useGlEsCache) {
            if (getGLEsVersion(context) >= 196610) {
                return true;
            }
            return false;
        }
        if (((ActivityManager) C786410Ut5.H2(context, "activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 196610) {
            return true;
        }
        return false;
    }

    public static void setFilterType(int i) {
        if (i == 9729 || i == 9728) {
            sFilterType = i;
        }
    }

    public static int createGLProgram(String str, String str2) {
        int iLoadShader;
        int iLoadShader2 = loadShader(35633, str);
        if (iLoadShader2 == 0 || (iLoadShader = loadShader(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
            GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Could not link program:");
                sbLIZ.append(GLES20.glGetProgramInfoLog(iGlCreateProgram));
                glError(1, C2188811AlT.LIZIZ(sbLIZ));
                GLES20.glDeleteProgram(iGlCreateProgram);
                return 0;
            }
        }
        return iGlCreateProgram;
    }

    public static int createTexture(int i, int i2) {
        clearAllGLError();
        int iGenerateTexture = generateTexture(3553);
        if (iGenerateTexture > 0) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iGenerateTexture);
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            GLES20.glBindTexture(3553, 0);
        }
        return iGenerateTexture;
    }

    public static int loadShader(int i, String str) {
        if (str == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Shader source ==null : shaderType =");
            sbLIZ.append(i);
            glError(1, C2188811AlT.LIZIZ(sbLIZ));
            return 0;
        }
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Could not compile shader:");
                sbLIZ2.append(i);
                glError(1, C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("GLES20 Error:");
                sbLIZ3.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
                glError(1, C2188811AlT.LIZIZ(sbLIZ3));
                GLES20.glDeleteShader(iGlCreateShader);
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public static void waitGLSyncor(long j, boolean z) {
        nativeWaitGLSyncor(j, z);
    }

    public static void reSizeTexture(int i, int i2, int i3) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
    }
}
