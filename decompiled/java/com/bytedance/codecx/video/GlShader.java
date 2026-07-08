package com.bytedance.codecx.video;

import X.C2188811AlT;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class GlShader {
    public int program;

    public void release() {
        int i = this.program;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.program = -1;
        }
    }

    public void useProgram() {
        int i = this.program;
        if (i == -1) {
            throw new RuntimeException("The program has been released");
        }
        GLES20.glUseProgram(i);
        GlUtil.checkNoGLES2Error("glUseProgram");
    }

    public int getAttribLocation(String str) {
        int i = this.program;
        if (i != -1) {
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, str);
            if (iGlGetAttribLocation >= 0) {
                return iGlGetAttribLocation;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Could not locate '");
            sbLIZ.append(str);
            sbLIZ.append("' in program");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new RuntimeException("The program has been released");
    }

    public int getUniformLocation(String str) {
        int i = this.program;
        if (i != -1) {
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, str);
            if (iGlGetUniformLocation >= 0) {
                return iGlGetUniformLocation;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Could not locate uniform '");
            sbLIZ.append(str);
            sbLIZ.append("' in program");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new RuntimeException("The program has been released");
    }

    public GlShader(String str, String str2) {
        int iCompileShader = compileShader(35633, str);
        int iCompileShader2 = compileShader(35632, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.program = iGlCreateProgram;
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, iCompileShader);
            GLES20.glAttachShader(this.program, iCompileShader2);
            GLES20.glLinkProgram(this.program);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.program, 35714, iArr, 0);
            if (iArr[0] == 1) {
                GLES20.glDeleteShader(iCompileShader);
                GLES20.glDeleteShader(iCompileShader2);
                GlUtil.checkNoGLES2Error("Creating GlShader");
                return;
            }
            throw new RuntimeException(GLES20.glGetProgramInfoLog(this.program));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("glCreateProgram() failed. GLES20 error: ");
        sbLIZ.append(GLES20.glGetError());
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static int compileShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                GlUtil.checkNoGLES2Error("compileShader");
                return iGlCreateShader;
            }
            throw new RuntimeException(GLES20.glGetShaderInfoLog(iGlCreateShader));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("glCreateShader() failed. GLES20 error: ");
        sbLIZ.append(GLES20.glGetError());
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setVertexAttribArray(String str, int i, FloatBuffer floatBuffer) {
        setVertexAttribArray(str, i, 0, floatBuffer);
    }

    public void setVertexAttribArray(String str, int i, int i2, FloatBuffer floatBuffer) {
        if (this.program != -1) {
            int attribLocation = getAttribLocation(str);
            GLES20.glEnableVertexAttribArray(attribLocation);
            GLES20.glVertexAttribPointer(attribLocation, i, 5126, false, i2, (Buffer) floatBuffer);
            GlUtil.checkNoGLES2Error("setVertexAttribArray");
            return;
        }
        throw new RuntimeException("The program has been released");
    }
}
