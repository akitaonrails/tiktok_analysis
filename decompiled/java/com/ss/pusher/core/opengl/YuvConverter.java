package com.ss.pusher.core.opengl;

import X.C1271400jBq;
import X.C1273590jFN;
import X.C1276510jK5;
import X.C1277780jM8;
import X.C1277840jME;
import X.C1278130jMh;
import X.C1278240jMs;
import X.C1278590jNR;
import X.C1279370jOh;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1277800jMA;
import X.InterfaceC1278160jMk;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.base.JniCommon;
import com.ss.pusher.core.buffer.VideoFrame;
import com.ss.pusher.core.utils.AVLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class YuvConverter {
    public static final FloatBuffer LJIIJ;
    public static final FloatBuffer LJIIJJI;
    public static final float[][] LJIIL;
    public static final float[][] LJIILIIL;
    public static float[][] LJIILJJIL;
    public final C1276510jK5 LIZ;
    public final C1271400jBq LIZIZ;
    public C1278130jMh LIZJ;
    public EnumC1277800jMA LIZLLL;
    public C1273590jFN LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public C1278240jMs LJIIIZ;

    public static native void nativeSetConvertColorRange(int i);

    public final void LIZLLL() {
        this.LJIIIIZZ = true;
        C1273590jFN c1273590jFN = this.LJ;
        if (c1273590jFN != null) {
            AVLog.d("GlShader", "Deleting shader.");
            int i = c1273590jFN.LIZ;
            if (i != -1) {
                GLES20.glDeleteProgram(i);
                c1273590jFN.LIZ = -1;
            }
        }
        this.LIZIZ.LIZIZ();
        C1278240jMs c1278240jMs = this.LJIIIZ;
        if (c1278240jMs != null) {
            C1271400jBq c1271400jBq = c1278240jMs.LIZ;
            if (c1271400jBq != null) {
                c1271400jBq.LIZIZ();
                c1278240jMs.LIZ = null;
            }
            GlRenderDrawer glRenderDrawer = c1278240jMs.LIZIZ;
            if (glRenderDrawer != null) {
                glRenderDrawer.LIZJ();
                c1278240jMs.LIZIZ = null;
            }
            this.LJIIIZ = null;
        }
        C1278130jMh c1278130jMh = this.LIZJ;
        if (c1278130jMh != null) {
            synchronized (c1278130jMh) {
                if (c1278130jMh.LIZ == 0 || c1278130jMh.LJ) {
                    return;
                }
                synchronized (c1278130jMh.LIZLLL) {
                    try {
                        if (c1278130jMh.LJ) {
                            return;
                        }
                        c1278130jMh.LJ = true;
                        for (int i2 = 0; i2 < c1278130jMh.LIZ; i2++) {
                            ByteBuffer byteBuffer = c1278130jMh.LIZIZ[i2];
                            if (byteBuffer != null && !c1278130jMh.LIZJ[i2]) {
                                byteBuffer.rewind();
                                JniCommon.nativeFreeByteBuffer(c1278130jMh.LIZIZ[i2]);
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    static {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        LJIIJ = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        LJIIJJI = floatBufferAsFloatBuffer2;
        LJIIL = new float[][]{new float[]{0.299f, 0.587f, 0.114f, 0.0f}, new float[]{-0.169f, -0.331f, 0.499f, 0.5f}, new float[]{0.499f, -0.418f, -0.0813f, 0.5f}};
        float[][] fArr = {new float[]{0.257f, 0.504f, 0.098f, 0.0625f}, new float[]{-0.148f, -0.291f, 0.439f, 0.5f}, new float[]{0.439f, -0.368f, -0.071f, 0.5f}};
        LJIILIIL = fArr;
        LJIILJJIL = fArr;
    }

    public YuvConverter() {
        C1276510jK5 c1276510jK5 = new C1276510jK5();
        this.LIZ = c1276510jK5;
        this.LJIIIIZZ = false;
        Thread threadU3 = C786410Ut5.u3();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create YUVConverter@");
        sbLIZ.append(this);
        sbLIZ.append(" in ");
        sbLIZ.append(threadU3.getName());
        AVLog.iod("YuvConverter", C2188811AlT.LIZIZ(sbLIZ));
        c1276510jK5.LIZ();
        this.LIZIZ = new C1271400jBq();
    }

    public static void LJ(int i) {
        if (i == 1) {
            LJIILJJIL = LJIILIIL;
        } else if (i == 0) {
            LJIILJJIL = LJIIL;
        }
        nativeSetConvertColorRange(i);
    }

    public final VideoFrame.I420Buffer LIZ(InterfaceC1278160jMk interfaceC1278160jMk) {
        int iMin;
        int iMin2;
        int iMin3;
        VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        int i = 0;
        try {
            i420BufferArr[0] = LIZJ(interfaceC1278160jMk);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i420BufferArr[0] == null) {
            if (this.LJIIIZ == null) {
                this.LJIIIZ = new C1278240jMs();
            }
            C1278240jMs c1278240jMs = this.LJIIIZ;
            if (c1278240jMs.LIZ == null) {
                C1271400jBq c1271400jBq = new C1271400jBq();
                c1278240jMs.LIZ = c1271400jBq;
                c1271400jBq.LIZJ(interfaceC1278160jMk.getWidth(), interfaceC1278160jMk.getHeight());
            }
            if (c1278240jMs.LIZIZ == null) {
                c1278240jMs.LIZIZ = new GlRenderDrawer();
            }
            int width = interfaceC1278160jMk.getWidth();
            int height = interfaceC1278160jMk.getHeight();
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            float[] fArr2 = new float[16];
            Matrix.setIdentityM(fArr2, 0);
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            android.graphics.Matrix matrix = new android.graphics.Matrix(interfaceC1278160jMk.getTransformMatrix());
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
            Matrix.rotateM(fArr2, 0, 0.0f, 0.0f, 0.0f, 1.0f);
            int i2 = 0;
            Matrix.multiplyMM(fArr2, 0, fArr3, 0, C1278590jNR.LIZ(matrix), 0);
            GLES20.glBindFramebuffer(36160, c1278240jMs.LIZ.LIZ);
            if (interfaceC1278160jMk.getType() == EnumC1277800jMA.OES) {
                c1278240jMs.LIZIZ.LIZ(interfaceC1278160jMk.getTextureId(), fArr, fArr2, interfaceC1278160jMk.getWidth(), interfaceC1278160jMk.getHeight());
            } else {
                c1278240jMs.LIZIZ.LIZIZ(interfaceC1278160jMk.getTextureId(), fArr, fArr2, interfaceC1278160jMk.getWidth(), interfaceC1278160jMk.getHeight());
            }
            GLES20.glFinish();
            int width2 = interfaceC1278160jMk.getWidth() * interfaceC1278160jMk.getHeight() * 4;
            ByteBuffer byteBuffer = c1278240jMs.LIZJ;
            if (byteBuffer == null || byteBuffer.capacity() < width2) {
                c1278240jMs.LIZJ = ByteBuffer.allocateDirect(width2);
            }
            c1278240jMs.LIZJ.rewind();
            int i3 = 0;
            GLES20.glReadPixels(0, 0, interfaceC1278160jMk.getWidth(), interfaceC1278160jMk.getHeight(), 6408, 5121, c1278240jMs.LIZJ);
            c1278240jMs.LIZJ.position(0);
            GLES20.glBindFramebuffer(36160, 0);
            byte[] bArr = new byte[c1278240jMs.LIZJ.limit()];
            c1278240jMs.LIZJ.get(bArr);
            int i4 = ((width + 7) / 8) * 8;
            int i5 = (height + 1) / 2;
            int i6 = (height + i5 + 1) * i4;
            byte[] bArr2 = new byte[i6];
            int i7 = width * height;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i3 < height) {
                while (i < width) {
                    int i12 = i2 + 1;
                    int i13 = bArr[i9] & 255;
                    int i14 = i12 + 1;
                    int i15 = bArr[i12] & 255;
                    int i16 = bArr[i14] & 255;
                    i2 = i14 + 1 + 1;
                    int i17 = (((((i13 * 66) + (i15 * 129)) + (i16 * 25)) + 128) >> 8) + 16;
                    int i18 = (((((i13 * (-38)) - (i15 * 74)) + (i16 * 112)) + 128) >> 8) + 128;
                    int i19 = (((((i13 * 112) - (i15 * 94)) - (i16 * 18)) + 128) >> 8) + 128;
                    int i20 = i8 + 1;
                    if (i17 < 0) {
                        iMin = 0;
                    } else {
                        iMin = Math.min(i17, 255);
                    }
                    bArr2[i8] = (byte) iMin;
                    if (i3 % 2 == 0 && i10 % 2 == 0) {
                        int i21 = i7 + i11;
                        if (i18 < 0) {
                            iMin2 = 0;
                        } else {
                            iMin2 = Math.min(i18, 255);
                        }
                        bArr2[i21] = (byte) iMin2;
                        int i22 = width / 2;
                        int i23 = i21 + i22;
                        if (i19 < 0) {
                            iMin3 = 0;
                        } else {
                            iMin3 = Math.min(i19, 255);
                        }
                        bArr2[i23] = (byte) iMin3;
                        i11++;
                        if (i11 == i22) {
                            i7 += width;
                            i11 = 0;
                        }
                    }
                    i10++;
                    i++;
                    i8 = i20;
                    i9 = i2;
                }
                i3++;
                i = 0;
            }
            ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i6);
            byteBufferNativeAllocateByteBuffer.clear();
            byteBufferNativeAllocateByteBuffer.put(bArr2);
            int i24 = i4 * height;
            int i25 = (i4 / 2) + i24;
            byteBufferNativeAllocateByteBuffer.position(i);
            byteBufferNativeAllocateByteBuffer.limit(i24);
            ByteBuffer byteBufferSlice = byteBufferNativeAllocateByteBuffer.slice();
            byteBufferNativeAllocateByteBuffer.position(i24);
            int i26 = i5 * i4;
            byteBufferNativeAllocateByteBuffer.limit(i24 + i26);
            ByteBuffer byteBufferSlice2 = byteBufferNativeAllocateByteBuffer.slice();
            byteBufferNativeAllocateByteBuffer.position(i25);
            byteBufferNativeAllocateByteBuffer.limit(i25 + i26);
            i420BufferArr[i] = C1277780jM8.LIZJ(byteBufferSlice, byteBufferSlice2, byteBufferNativeAllocateByteBuffer.slice(), width, height, i4, i4, interfaceC1278160jMk.getCaptureMs(), i4, new ARunnableS120S0100000_20(byteBufferNativeAllocateByteBuffer, 96));
        }
        return i420BufferArr[i];
    }

    public final C1277780jM8 LIZJ(InterfaceC1278160jMk interfaceC1278160jMk) {
        ByteBuffer byteBufferNativeAllocateByteBuffer;
        int width = interfaceC1278160jMk.getWidth();
        int height = interfaceC1278160jMk.getHeight();
        int i = ((width + 7) / 8) * 8;
        int i2 = (height + 1) / 2;
        int i3 = (height + i2 + 1) * i;
        if (this.LIZJ == null) {
            this.LIZJ = new C1278130jMh(C1279370jOh.LIZ);
        }
        C1278130jMh c1278130jMh = this.LIZJ;
        synchronized (c1278130jMh) {
            if (c1278130jMh.LIZ == 0) {
                byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i3);
            } else {
                if (c1278130jMh.LJ) {
                    return null;
                }
                synchronized (c1278130jMh.LIZLLL) {
                    try {
                        if (c1278130jMh.LJ) {
                            return null;
                        }
                        for (int i4 = 0; i4 < c1278130jMh.LIZ; i4++) {
                            if (!c1278130jMh.LIZJ[i4]) {
                                ByteBuffer[] byteBufferArr = c1278130jMh.LIZIZ;
                                ByteBuffer byteBuffer = byteBufferArr[i4];
                                if (byteBuffer == null) {
                                    byteBufferArr[i4] = JniCommon.nativeAllocateByteBuffer(i3);
                                } else if (byteBuffer.capacity() < i3) {
                                    JniCommon.nativeFreeByteBuffer(c1278130jMh.LIZIZ[i4]);
                                    c1278130jMh.LIZIZ[i4] = JniCommon.nativeAllocateByteBuffer(i3);
                                }
                                c1278130jMh.LIZJ[i4] = true;
                                c1278130jMh.LIZIZ[i4].rewind();
                                byteBufferNativeAllocateByteBuffer = c1278130jMh.LIZIZ[i4];
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            if (byteBufferNativeAllocateByteBuffer != null) {
                LIZIZ(byteBufferNativeAllocateByteBuffer, width, height, i, interfaceC1278160jMk.getTextureId(), C1278590jNR.LIZ(interfaceC1278160jMk.getTransformMatrix()), interfaceC1278160jMk.getType());
                int i5 = i * height;
                int i6 = (i / 2) + i5;
                byteBufferNativeAllocateByteBuffer.position(0);
                byteBufferNativeAllocateByteBuffer.limit(i5);
                ByteBuffer byteBufferSlice = byteBufferNativeAllocateByteBuffer.slice();
                byteBufferNativeAllocateByteBuffer.position(i5);
                int i7 = i2 * i;
                byteBufferNativeAllocateByteBuffer.limit(i5 + i7);
                ByteBuffer byteBufferSlice2 = byteBufferNativeAllocateByteBuffer.slice();
                byteBufferNativeAllocateByteBuffer.position(i6);
                byteBufferNativeAllocateByteBuffer.limit(i6 + i7);
                return C1277780jM8.LIZJ(byteBufferSlice, byteBufferSlice2, byteBufferNativeAllocateByteBuffer.slice(), width, height, i, i, interfaceC1278160jMk.getCaptureMs(), i, new ARunnableS89S0200000_20(this, byteBufferNativeAllocateByteBuffer, 62));
            }
            return null;
        }
    }

    public final void LIZIZ(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr, EnumC1277800jMA enumC1277800jMA) {
        String str;
        this.LIZ.LIZ();
        if (!this.LJIIIIZZ) {
            if (enumC1277800jMA != this.LIZLLL) {
                C1273590jFN c1273590jFN = this.LJ;
                if (c1273590jFN != null) {
                    AVLog.d("GlShader", "Deleting shader.");
                    int i5 = c1273590jFN.LIZ;
                    if (i5 != -1) {
                        GLES20.glDeleteProgram(i5);
                        c1273590jFN.LIZ = -1;
                    }
                }
                int i6 = C1277840jME.LIZ[enumC1277800jMA.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        str = "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
                    } else {
                        throw new IllegalArgumentException("Unsupported texture type.");
                    }
                } else {
                    str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
                }
                this.LIZLLL = enumC1277800jMA;
                C1273590jFN c1273590jFN2 = new C1273590jFN(str);
                this.LJ = c1273590jFN2;
                int i7 = c1273590jFN2.LIZ;
                if (i7 != -1) {
                    GLES20.glUseProgram(i7);
                    GlUtil.LIZJ("glUseProgram");
                    this.LJFF = this.LJ.LIZIZ("texMatrix");
                    this.LJI = this.LJ.LIZIZ("xUnit");
                    this.LJII = this.LJ.LIZIZ("coeffs");
                    GLES20.glUniform1i(this.LJ.LIZIZ("tex"), 0);
                    GlUtil.LIZJ("Initialize fragment shader uniform values.");
                    this.LJ.LIZJ("in_pos", LJIIJ);
                    this.LJ.LIZJ("in_tc", LJIIJJI);
                } else {
                    throw new RuntimeException("The program has been released");
                }
            }
            int i8 = this.LJ.LIZ;
            if (i8 != -1) {
                GLES20.glUseProgram(i8);
                GlUtil.LIZJ("glUseProgram");
                this.LJ.LIZJ("in_pos", LJIIJ);
                this.LJ.LIZJ("in_tc", LJIIJJI);
                if (i3 % 8 == 0) {
                    if (i3 >= i) {
                        int i9 = (i + 3) / 4;
                        int i10 = (i + 7) / 8;
                        int i11 = (i2 + 1) / 2;
                        int i12 = i2 + i11;
                        if (byteBuffer.capacity() >= i3 * i12) {
                            float[] fArr2 = new float[16];
                            Matrix.multiplyMM(fArr2, 0, fArr, 0, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f}, 0);
                            int i13 = i3 / 4;
                            this.LIZIZ.LIZJ(i13, i12);
                            GLES20.glBindFramebuffer(36160, this.LIZIZ.LIZ);
                            GlUtil.LIZJ("glBindFramebuffer");
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(enumC1277800jMA.getGlTarget(), i4);
                            GLES20.glUniformMatrix4fv(this.LJFF, 1, false, fArr2, 0);
                            GLES20.glViewport(0, 0, i9, i2);
                            float f = i;
                            GLES20.glUniform2f(this.LJI, fArr2[0] / f, fArr2[1] / f);
                            float[] fArr3 = LJIILJJIL[0];
                            GLES20.glUniform4f(this.LJII, fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
                            GLES20.glDrawArrays(5, 0, 4);
                            GLES20.glViewport(0, i2, i10, i11);
                            GLES20.glUniform2f(this.LJI, (fArr2[0] * 2.0f) / f, (fArr2[1] * 2.0f) / f);
                            float[] fArr4 = LJIILJJIL[1];
                            GLES20.glUniform4f(this.LJII, fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
                            GLES20.glDrawArrays(5, 0, 4);
                            GLES20.glViewport(i3 / 8, i2, i10, i11);
                            float[] fArr5 = LJIILJJIL[2];
                            GLES20.glUniform4f(this.LJII, fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
                            GLES20.glDrawArrays(5, 0, 4);
                            GLES20.glReadPixels(0, 0, i13, i12, 6408, 5121, byteBuffer);
                            GlUtil.LIZJ("YuvConverter.convert");
                            GLES20.glBindFramebuffer(36160, 0);
                            GLES20.glBindTexture(3553, 0);
                            GLES20.glBindTexture(enumC1277800jMA.getGlTarget(), 0);
                            return;
                        }
                        throw new IllegalArgumentException("YuvConverter.convert called with too small buffer");
                    }
                    throw new IllegalArgumentException("Invalid stride, must >= width");
                }
                throw new IllegalArgumentException("Invalid stride, must be a multiple of 8");
            }
            throw new RuntimeException("The program has been released");
        }
        throw new IllegalStateException("YuvConverter.convert called on released object");
    }
}
