package com.bytedance.realx.video;

import X.C2188811AlT;
import android.opengl.GLES20;
import com.bytedance.realx.base.Logging;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class GlUtil {
    public static void checkNoGLES2Error(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("error: ");
            sbLIZ.append(iGlGetError);
            Logging.e("checkNoGLES2Error", C2188811AlT.LIZIZ(sbLIZ));
            if (iGlGetError != 1285) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(": GLES20 error: ");
                sbLIZ2.append(iGlGetError);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public static void clearGLES2Error(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("clear opengl error: ");
            sbLIZ.append(iGlGetError);
            Logging.w("clearGLES2Error", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static int generateTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(i, i2);
        GLES20.glTexParameterf(i, 10241, 9729.0f);
        GLES20.glTexParameterf(i, 10240, 9729.0f);
        GLES20.glTexParameterf(i, 10242, 33071.0f);
        GLES20.glTexParameterf(i, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i2;
    }
}
