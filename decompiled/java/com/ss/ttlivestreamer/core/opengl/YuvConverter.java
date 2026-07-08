package com.ss.ttlivestreamer.core.opengl;

import X.C1269360j8Y;
import X.C1269390j8b;
import X.C1271390jBp;
import X.C1271900jCe;
import X.C1273010jER;
import X.C1273520jFG;
import X.C1273530jFH;
import X.C1273540jFI;
import X.C1273560jFK;
import X.C1273570jFL;
import X.C1273580jFM;
import X.EnumC1273550jFJ;
import X.InterfaceC1271560jC6;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.graphics.Matrix;
import android.opengl.GLES20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.JniCommon;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public class YuvConverter {
    public static final float[][] RGB_TO_VIDEO_RANGE_YUV_TRANSFORM_MATRIX;
    public static float[][] RGB_TO_YUV_TRANSFORM_MATRIX;
    public int coeffsLoc;
    public C1273560jFK mConverterBufferPool;
    public boolean released;
    public C1273530jFH shader;
    public EnumC1273550jFJ shaderTextureType;
    public int texMatrixLoc;
    public final C1271390jBp textureFrameBuffer;
    public final C1269390j8b threadChecker;
    public int xUnitLoc;
    public C1273570jFL yuvConverterCPU;
    public static final FloatBuffer DEVICE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    public static final FloatBuffer TEXTURE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    public static final float[][] RGB_TO_FULL_RANGE_YUV_TRANSFORM_MATRIX = {new float[]{0.299f, 0.587f, 0.114f, 0.0f}, new float[]{-0.169f, -0.331f, 0.499f, 0.5f}, new float[]{0.499f, -0.418f, -0.0813f, 0.5f}};

    public static native void nativeSetConvertColorRange(int i);

    static {
        float[][] fArr = {new float[]{0.257f, 0.504f, 0.098f, 0.0625f}, new float[]{-0.148f, -0.291f, 0.439f, 0.5f}, new float[]{0.439f, -0.368f, -0.071f, 0.5f}};
        RGB_TO_VIDEO_RANGE_YUV_TRANSFORM_MATRIX = fArr;
        RGB_TO_YUV_TRANSFORM_MATRIX = fArr;
    }

    private void setupVertexAttribArray() {
        this.shader.LIZJ("in_pos", DEVICE_RECTANGLE);
        this.shader.LIZJ("in_tc", TEXTURE_RECTANGLE);
    }

    public void release() {
        this.threadChecker.LIZ();
        this.released = true;
        C1273530jFH c1273530jFH = this.shader;
        if (c1273530jFH != null) {
            AVLog.d("GlShader", "Deleting shader.");
            int i = c1273530jFH.LIZ;
            if (i != -1) {
                GLES20.glDeleteProgram(i);
                c1273530jFH.LIZ = -1;
            }
        }
        this.textureFrameBuffer.LIZJ();
        C1273570jFL c1273570jFL = this.yuvConverterCPU;
        if (c1273570jFL != null) {
            C1271390jBp c1271390jBp = c1273570jFL.LIZ;
            if (c1271390jBp != null) {
                c1271390jBp.LIZJ();
                c1273570jFL.LIZ = null;
            }
            GlRenderDrawer glRenderDrawer = c1273570jFL.LIZIZ;
            if (glRenderDrawer != null) {
                glRenderDrawer.release();
                c1273570jFL.LIZIZ = null;
            }
            this.yuvConverterCPU = null;
        }
        C1273560jFK c1273560jFK = this.mConverterBufferPool;
        if (c1273560jFK != null) {
            synchronized (c1273560jFK) {
                if (c1273560jFK.LIZ == 0 || c1273560jFK.LJ) {
                    return;
                }
                synchronized (c1273560jFK.LIZLLL) {
                    try {
                        if (c1273560jFK.LJ) {
                            return;
                        }
                        c1273560jFK.LJ = true;
                        for (int i2 = 0; i2 < c1273560jFK.LIZ; i2++) {
                            ByteBuffer byteBuffer = c1273560jFK.LIZIZ[i2];
                            if (byteBuffer != null && !c1273560jFK.LIZJ[i2]) {
                                byteBuffer.rewind();
                                JniCommon.nativeFreeByteBuffer(c1273560jFK.LIZIZ[i2]);
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

    public YuvConverter() {
        C1269390j8b c1269390j8b = new C1269390j8b();
        this.threadChecker = c1269390j8b;
        this.released = false;
        c1269390j8b.LIZ();
        this.textureFrameBuffer = new C1271390jBp(null);
    }

    private void initShader(EnumC1273550jFJ enumC1273550jFJ) {
        String str;
        C1273530jFH c1273530jFH = this.shader;
        if (c1273530jFH != null) {
            AVLog.d("GlShader", "Deleting shader.");
            int i = c1273530jFH.LIZ;
            if (i != -1) {
                GLES20.glDeleteProgram(i);
                c1273530jFH.LIZ = -1;
            }
        }
        int i2 = C1273540jFI.LIZ[enumC1273550jFJ.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                str = "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
            } else {
                throw new IllegalArgumentException("Unsupported texture type.");
            }
        } else {
            str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
        }
        this.shaderTextureType = enumC1273550jFJ;
        C1273530jFH c1273530jFH2 = new C1273530jFH(str);
        this.shader = c1273530jFH2;
        int i3 = c1273530jFH2.LIZ;
        if (i3 != -1) {
            GLES20.glUseProgram(i3);
            GLES20.glGetError();
            this.texMatrixLoc = this.shader.LIZIZ("texMatrix");
            this.xUnitLoc = this.shader.LIZIZ("xUnit");
            this.coeffsLoc = this.shader.LIZIZ("coeffs");
            GLES20.glUniform1i(this.shader.LIZIZ("tex"), 0);
            GLES20.glGetError();
            setupVertexAttribArray();
            return;
        }
        throw new RuntimeException("The program has been released");
    }

    public static void setConvertColorRange(int i) {
        if (i == 1) {
            RGB_TO_YUV_TRANSFORM_MATRIX = RGB_TO_VIDEO_RANGE_YUV_TRANSFORM_MATRIX;
        } else if (i == 0) {
            RGB_TO_YUV_TRANSFORM_MATRIX = RGB_TO_FULL_RANGE_YUV_TRANSFORM_MATRIX;
        }
        nativeSetConvertColorRange(i);
    }

    public VideoFrame.I420Buffer convert(InterfaceC1271560jC6 interfaceC1271560jC6) {
        VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        try {
            i420BufferArr[0] = convertGPUInternal(interfaceC1271560jC6);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i420BufferArr[0] == null) {
            i420BufferArr[0] = convertCPUInternal(interfaceC1271560jC6);
        }
        return i420BufferArr[0];
    }

    public VideoFrame.I420Buffer convertCPUInternal(InterfaceC1271560jC6 interfaceC1271560jC6) {
        Matrix matrix;
        float[] fArr;
        int iMin;
        int iMin2;
        int iMin3;
        if (this.yuvConverterCPU == null) {
            this.yuvConverterCPU = new C1273570jFL();
        }
        C1273570jFL c1273570jFL = this.yuvConverterCPU;
        if (c1273570jFL.LIZ == null) {
            C1271390jBp c1271390jBp = new C1271390jBp(null);
            c1273570jFL.LIZ = c1271390jBp;
            c1271390jBp.LIZLLL(interfaceC1271560jC6.getWidth(), interfaceC1271560jC6.getHeight());
        }
        if (c1273570jFL.LIZIZ == null) {
            c1273570jFL.LIZIZ = new GlRenderDrawer();
        }
        int width = interfaceC1271560jC6.getWidth();
        int height = interfaceC1271560jC6.getHeight();
        float[] fArr2 = new float[16];
        int i = 0;
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        if (C1273520jFG.LIZJ) {
            C1273580jFM c1273580jFM = c1273570jFL.LIZLLL;
            Matrix transformMatrix = interfaceC1271560jC6.getTransformMatrix();
            if (c1273580jFM.LIZ == null || !Intrinsics.LJFF(transformMatrix, c1273580jFM.LIZIZ)) {
                c1273580jFM.LIZIZ = new Matrix(transformMatrix);
                float[] fArr3 = new float[16];
                android.opengl.Matrix.setIdentityM(fArr3, 0);
                float[] fArr4 = new float[16];
                android.opengl.Matrix.setIdentityM(fArr4, 0);
                Matrix matrix2 = new Matrix(transformMatrix);
                matrix2.preTranslate(0.5f, 0.5f);
                matrix2.preScale(1.0f, -1.0f);
                matrix2.preTranslate(-0.5f, -0.5f);
                android.opengl.Matrix.rotateM(fArr3, 0, 0.0f, 0.0f, 0.0f, 1.0f);
                android.opengl.Matrix.multiplyMM(fArr3, 0, fArr4, 0, C1273010jER.LIZIZ(matrix2), 0);
                c1273580jFM.LIZ = fArr3;
            }
            fArr = c1273570jFL.LIZLLL.LIZ;
        } else {
            float[] fArr5 = new float[16];
            android.opengl.Matrix.setIdentityM(fArr5, 0);
            float[] fArr6 = new float[16];
            android.opengl.Matrix.setIdentityM(fArr6, 0);
            if (C1273520jFG.LIZ()) {
                matrix = C1273520jFG.LIZIZ(0, false, interfaceC1271560jC6.getTransformMatrix());
            } else {
                matrix = new Matrix(interfaceC1271560jC6.getTransformMatrix());
            }
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
            android.opengl.Matrix.rotateM(fArr5, 0, 0.0f, 0.0f, 0.0f, 1.0f);
            fArr = fArr5;
            android.opengl.Matrix.multiplyMM(fArr, 0, fArr6, 0, C1273010jER.LIZIZ(matrix), 0);
        }
        GLES20.glBindFramebuffer(36160, c1273570jFL.LIZ.LIZ);
        if (interfaceC1271560jC6.getType() == EnumC1273550jFJ.OES) {
            c1273570jFL.LIZIZ.drawOes(interfaceC1271560jC6.getTextureId(), fArr2, fArr, 0, 0, interfaceC1271560jC6.getWidth(), interfaceC1271560jC6.getHeight());
        } else {
            c1273570jFL.LIZIZ.drawRgb(interfaceC1271560jC6.getTextureId(), fArr2, fArr, 0, 0, interfaceC1271560jC6.getWidth(), interfaceC1271560jC6.getHeight());
        }
        GLES20.glFinish();
        int width2 = interfaceC1271560jC6.getWidth() * interfaceC1271560jC6.getHeight() * 4;
        ByteBuffer byteBuffer = c1273570jFL.LIZJ;
        if (byteBuffer == null || byteBuffer.capacity() < width2) {
            c1273570jFL.LIZJ = ByteBuffer.allocateDirect(width2);
        }
        c1273570jFL.LIZJ.rewind();
        GLES20.glReadPixels(0, 0, interfaceC1271560jC6.getWidth(), interfaceC1271560jC6.getHeight(), 6408, 5121, c1273570jFL.LIZJ);
        c1273570jFL.LIZJ.position(0);
        GLES20.glBindFramebuffer(36160, 0);
        byte[] bArr = new byte[c1273570jFL.LIZJ.limit()];
        c1273570jFL.LIZJ.get(bArr);
        int i2 = ((width + 7) / 8) * 8;
        int i3 = (height + 1) / 2;
        int i4 = (height + i3 + 1) * i2;
        byte[] bArr2 = new byte[i4];
        int i5 = width * height;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i6 < height) {
            while (i < width) {
                int i11 = i8 + 1;
                int i12 = bArr[i8] & 255;
                int i13 = i11 + 1;
                int i14 = bArr[i11] & 255;
                int i15 = bArr[i13] & 255;
                i8 = i13 + 1 + 1;
                int i16 = (((((i12 * 66) + (i14 * 129)) + (i15 * 25)) + 128) >> 8) + 16;
                int i17 = (((((i12 * (-38)) - (i14 * 74)) + (i15 * 112)) + 128) >> 8) + 128;
                int i18 = (((((i12 * 112) - (i14 * 94)) - (i15 * 18)) + 128) >> 8) + 128;
                int i19 = i7 + 1;
                if (i16 < 0) {
                    iMin = 0;
                } else {
                    iMin = Math.min(i16, 255);
                }
                bArr2[i7] = (byte) iMin;
                if (i6 % 2 == 0 && i9 % 2 == 0) {
                    int i20 = i5 + i10;
                    if (i17 < 0) {
                        iMin2 = 0;
                    } else {
                        iMin2 = Math.min(i17, 255);
                    }
                    bArr2[i20] = (byte) iMin2;
                    int i21 = width / 2;
                    int i22 = i20 + i21;
                    if (i18 < 0) {
                        iMin3 = 0;
                    } else {
                        iMin3 = Math.min(i18, 255);
                    }
                    bArr2[i22] = (byte) iMin3;
                    i10++;
                    if (i10 == i21) {
                        i5 += width;
                        i10 = 0;
                    }
                }
                i9++;
                i++;
                i7 = i19;
            }
            i6++;
            i = 0;
        }
        ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i4);
        byteBufferNativeAllocateByteBuffer.clear();
        byteBufferNativeAllocateByteBuffer.put(bArr2);
        int i23 = i2 * height;
        int i24 = (i2 / 2) + i23;
        byteBufferNativeAllocateByteBuffer.position(i);
        byteBufferNativeAllocateByteBuffer.limit(i23);
        ByteBuffer byteBufferSlice = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i23);
        int i25 = i3 * i2;
        byteBufferNativeAllocateByteBuffer.limit(i23 + i25);
        ByteBuffer byteBufferSlice2 = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i24);
        byteBufferNativeAllocateByteBuffer.limit(i24 + i25);
        return C1271900jCe.LIZJ(width, height, byteBufferSlice, i2, byteBufferSlice2, i2, byteBufferNativeAllocateByteBuffer.slice(), i2, interfaceC1271560jC6.getCaptureMs(), new ARunnableS120S0100000_20(byteBufferNativeAllocateByteBuffer, 114), interfaceC1271560jC6.getCaptureServerNtpMs(), interfaceC1271560jC6.getEffectServerNtpMs());
    }

    public VideoFrame.I420Buffer convertGPUInternal(InterfaceC1271560jC6 interfaceC1271560jC6) {
        ByteBuffer byteBufferNativeAllocateByteBuffer;
        int width = interfaceC1271560jC6.getWidth();
        int height = interfaceC1271560jC6.getHeight();
        int i = ((width + 7) / 8) * 8;
        int i2 = (height + 1) / 2;
        int i3 = (height + i2 + 1) * i;
        if (this.mConverterBufferPool == null) {
            this.mConverterBufferPool = new C1273560jFK(C1269360j8Y.LIZ);
        }
        C1273560jFK c1273560jFK = this.mConverterBufferPool;
        synchronized (c1273560jFK) {
            if (c1273560jFK.LIZ == 0) {
                byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i3);
            } else {
                if (c1273560jFK.LJ) {
                    return null;
                }
                synchronized (c1273560jFK.LIZLLL) {
                    try {
                        if (c1273560jFK.LJ) {
                            return null;
                        }
                        for (int i4 = 0; i4 < c1273560jFK.LIZ; i4++) {
                            if (!c1273560jFK.LIZJ[i4]) {
                                ByteBuffer[] byteBufferArr = c1273560jFK.LIZIZ;
                                ByteBuffer byteBuffer = byteBufferArr[i4];
                                if (byteBuffer == null) {
                                    byteBufferArr[i4] = JniCommon.nativeAllocateByteBuffer(i3);
                                } else if (byteBuffer.capacity() < i3) {
                                    JniCommon.nativeFreeByteBuffer(c1273560jFK.LIZIZ[i4]);
                                    c1273560jFK.LIZIZ[i4] = JniCommon.nativeAllocateByteBuffer(i3);
                                }
                                c1273560jFK.LIZJ[i4] = true;
                                c1273560jFK.LIZIZ[i4].rewind();
                                byteBufferNativeAllocateByteBuffer = c1273560jFK.LIZIZ[i4];
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
                convert(byteBufferNativeAllocateByteBuffer, width, height, i, interfaceC1271560jC6.getTextureId(), C1273010jER.LIZIZ(interfaceC1271560jC6.getTransformMatrix()), interfaceC1271560jC6.getType());
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
                return C1271900jCe.LIZJ(width, height, byteBufferSlice, i, byteBufferSlice2, i, byteBufferNativeAllocateByteBuffer.slice(), i, interfaceC1271560jC6.getCaptureMs(), new ARunnableS89S0200000_20(this, byteBufferNativeAllocateByteBuffer, 65), interfaceC1271560jC6.getCaptureServerNtpMs(), interfaceC1271560jC6.getEffectServerNtpMs());
            }
            return null;
        }
    }

    public void convert(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr) {
        convert(byteBuffer, i, i2, i3, i4, fArr, EnumC1273550jFJ.OES);
    }

    private void convert(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr, EnumC1273550jFJ enumC1273550jFJ) {
        this.threadChecker.LIZ();
        if (!this.released) {
            if (enumC1273550jFJ != this.shaderTextureType) {
                initShader(enumC1273550jFJ);
            }
            int i5 = this.shader.LIZ;
            if (i5 != -1) {
                GLES20.glUseProgram(i5);
                GLES20.glGetError();
                setupVertexAttribArray();
                if (i3 % 8 == 0) {
                    if (i3 >= i) {
                        int i6 = (i + 3) / 4;
                        int i7 = (i + 7) / 8;
                        int i8 = (i2 + 1) / 2;
                        int i9 = i2 + i8;
                        if (byteBuffer.capacity() >= i3 * i9) {
                            float[] fArr2 = new float[16];
                            android.opengl.Matrix.multiplyMM(fArr2, 0, fArr, 0, C1273010jER.LJFF(), 0);
                            int i10 = i3 / 4;
                            this.textureFrameBuffer.LIZLLL(i10, i9);
                            GLES20.glBindFramebuffer(36160, this.textureFrameBuffer.LIZ);
                            GLES20.glGetError();
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(enumC1273550jFJ.getGlTarget(), i4);
                            GLES20.glUniformMatrix4fv(this.texMatrixLoc, 1, false, fArr2, 0);
                            GLES20.glViewport(0, 0, i6, i2);
                            float f = i;
                            GLES20.glUniform2f(this.xUnitLoc, fArr2[0] / f, fArr2[1] / f);
                            float[] fArr3 = RGB_TO_YUV_TRANSFORM_MATRIX[0];
                            GLES20.glUniform4f(this.coeffsLoc, fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
                            GLES20.glDrawArrays(5, 0, 4);
                            GLES20.glViewport(0, i2, i7, i8);
                            GLES20.glUniform2f(this.xUnitLoc, (fArr2[0] * 2.0f) / f, (fArr2[1] * 2.0f) / f);
                            float[] fArr4 = RGB_TO_YUV_TRANSFORM_MATRIX[1];
                            GLES20.glUniform4f(this.coeffsLoc, fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
                            GLES20.glDrawArrays(5, 0, 4);
                            GLES20.glViewport(i3 / 8, i2, i7, i8);
                            float[] fArr5 = RGB_TO_YUV_TRANSFORM_MATRIX[2];
                            GLES20.glUniform4f(this.coeffsLoc, fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
                            GLES20.glDrawArrays(5, 0, 4);
                            GLES20.glReadPixels(0, 0, i10, i9, 6408, 5121, byteBuffer);
                            GLES20.glGetError();
                            GLES20.glBindFramebuffer(36160, 0);
                            GLES20.glBindTexture(3553, 0);
                            GLES20.glBindTexture(enumC1273550jFJ.getGlTarget(), 0);
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
