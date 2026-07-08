package com.bytedance.codecx.video;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import com.bytedance.codecx.video.RendererCommon;
import com.bytedance.codecx.video.memory.CodecXVideoByteMemoryInterface;
import com.bytedance.codecx.video.memory.CodecXVideoFrameInterface;
import com.bytedance.codecx.video.memory.CodecXVideoMemoryInterface;
import com.bytedance.codecx.video.memory.CodecXVideoOpenGLMemoryInterface;
import com.bytedance.codecx.video.memory.NativeCodecXByteMemory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class VideoFrameDrawer {
    public static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    public CodecXVideoFrameInterface lastI420Frame;
    public int renderHeight;
    public int renderWidth;
    public final float[] dstPoints = new float[6];
    public final Point renderSize = new Point();
    public int dstWidth = 0;
    public int dstHeight = 0;
    public final YuvUploader yuvUploader = new YuvUploader();
    public final Matrix renderMatrix = new Matrix();

    /* JADX INFO: renamed from: com.bytedance.codecx.video.VideoFrameDrawer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat;

        static {
            int[] iArr = new int[CodecXPixelFormat.values().length];
            $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat = iArr;
            try {
                iArr[CodecXPixelFormat.kTextureOES.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kTexture2D.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }

    public static class YuvUploader {
        public ByteBuffer copyBuffer;
        public int[] yuvTextures;

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        public YuvUploader() {
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public /* synthetic */ YuvUploader(AnonymousClass1 anonymousClass1) {
            this();
        }

        public int[] uploadFromBuffer(CodecXVideoByteMemoryInterface codecXVideoByteMemoryInterface) {
            if (codecXVideoByteMemoryInterface.getPixelFormat() != CodecXPixelFormat.kI420) {
                return null;
            }
            return uploadYuvData(codecXVideoByteMemoryInterface.getWidth(), codecXVideoByteMemoryInterface.getHeight(), new int[]{codecXVideoByteMemoryInterface.getPlaneLineSize(0), codecXVideoByteMemoryInterface.getPlaneLineSize(1), codecXVideoByteMemoryInterface.getPlaneLineSize(2)}, new ByteBuffer[]{codecXVideoByteMemoryInterface.getPlaneData(0), codecXVideoByteMemoryInterface.getPlaneData(1), codecXVideoByteMemoryInterface.getPlaneData(2)});
        }

        public int[] uploadYuvData(int i, int i2, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i3 = 0;
            int i4 = i / 2;
            int[] iArr2 = {i, i4, i4};
            int i5 = i2 / 2;
            int[] iArr3 = {i2, i5, i5};
            int i6 = 0;
            int iMax = 0;
            do {
                int i7 = iArr[i6];
                int i8 = iArr2[i6];
                if (i7 > i8) {
                    iMax = Math.max(iMax, i8 * iArr3[i6]);
                }
                i6++;
            } while (i6 < 3);
            if (iMax > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < iMax)) {
                this.copyBuffer = ByteBuffer.allocateDirect(iMax);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                int i9 = 0;
                do {
                    this.yuvTextures[i9] = GlUtil.generateTexture(3553);
                    i9++;
                } while (i9 < 3);
            }
            do {
                GLES20.glPixelStorei(3317, 1);
                GLES20.glActiveTexture(33984 + i3);
                GLES20.glBindTexture(3553, this.yuvTextures[i3]);
                int i10 = iArr[i3];
                int i11 = iArr2[i3];
                if (i10 == i11) {
                    byteBuffer = byteBufferArr[i3];
                } else {
                    CodecXYuvHelper.nativeCopyPlane(byteBufferArr[i3], i10, this.copyBuffer, i11, i11, iArr3[i3]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i3], iArr3[i3], 0, 6409, 5121, byteBuffer);
                GLES20.glPixelStorei(3317, 4);
                i3++;
            } while (i3 < 3);
            return this.yuvTextures;
        }
    }

    public void drawFrame(CodecXVideoFrameInterface codecXVideoFrameInterface, RendererCommon.GlDrawer glDrawer) {
        drawFrame(codecXVideoFrameInterface, glDrawer, null);
    }

    private void calculateTransformedRenderSize(int i, int i2, Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i;
            this.renderHeight = i2;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        int i3 = 0;
        do {
            float[] fArr = this.dstPoints;
            int i4 = i3 * 2;
            fArr[i4] = fArr[i4] * i;
            int i5 = i4 + 1;
            fArr[i5] = fArr[i5] * i2;
            i3++;
        } while (i3 < 3);
        float[] fArr2 = this.dstPoints;
        this.renderWidth = distance(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        float[] fArr3 = this.dstPoints;
        this.renderHeight = distance(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
    }

    public void drawFrame(CodecXVideoFrameInterface codecXVideoFrameInterface, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(codecXVideoFrameInterface, glDrawer, matrix, 0, 0, codecXVideoFrameInterface.getRotatedWidth(), codecXVideoFrameInterface.getRotatedHeight());
    }

    public static int distance(float f, float f2, float f3, float f4) {
        return (int) Math.round(Math.hypot(f3 - f, f4 - f2));
    }

    public void drawFrame(CodecXVideoFrameInterface codecXVideoFrameInterface, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i, int i2, int i3, int i4) {
        boolean z;
        if (codecXVideoFrameInterface == null) {
            return;
        }
        CodecXVideoMemoryInterface andRetainVideoFrameMemory = codecXVideoFrameInterface.getAndRetainVideoFrameMemory();
        try {
            if (andRetainVideoFrameMemory == null) {
                return;
            }
            try {
                calculateTransformedRenderSize(codecXVideoFrameInterface.getRotatedWidth(), codecXVideoFrameInterface.getRotatedHeight(), matrix);
                if (andRetainVideoFrameMemory.getMemoryType() == CodecXVideoMemoryType.kOPENGL_TEXTURE) {
                    z = true;
                } else {
                    z = false;
                }
                this.renderMatrix.reset();
                this.renderMatrix.preTranslate(0.5f, 0.5f);
                if (!z) {
                    this.renderMatrix.preScale(1.0f, -1.0f);
                }
                this.renderMatrix.preRotate(codecXVideoFrameInterface.getRotation().value());
                this.renderMatrix.preTranslate(-0.5f, -0.5f);
                if (matrix != null) {
                    this.renderMatrix.preConcat(matrix);
                }
                if (z && this.renderWidth > 0) {
                    CodecXVideoOpenGLMemoryInterface codecXVideoOpenGLMemoryInterface = (CodecXVideoOpenGLMemoryInterface) andRetainVideoFrameMemory;
                    FilterType filterTypeFromValue = FilterType.fromValue(codecXVideoOpenGLMemoryInterface.getScaleFilter().value());
                    int unScaledWidth = codecXVideoOpenGLMemoryInterface.getUnScaledWidth();
                    int unScaledHeight = codecXVideoOpenGLMemoryInterface.getUnScaledHeight();
                    this.lastI420Frame = null;
                    if (filterTypeFromValue != null && filterTypeFromValue != FilterType.Origin && unScaledWidth != 0 && unScaledHeight != 0) {
                        drawTexture(glDrawer, codecXVideoOpenGLMemoryInterface, this.renderMatrix, this.renderWidth, this.renderHeight, i, i2, i3, i4, filterTypeFromValue, unScaledWidth, unScaledHeight, this.dstWidth, this.dstHeight);
                    } else {
                        drawTexture(glDrawer, codecXVideoOpenGLMemoryInterface, this.renderMatrix, this.renderWidth, this.renderHeight, i, i2, i3, i4, FilterType.Origin, 0, 0, this.dstWidth, this.dstHeight);
                    }
                } else {
                    if (codecXVideoFrameInterface != this.lastI420Frame) {
                        this.lastI420Frame = codecXVideoFrameInterface;
                        CodecXVideoFrameInterface i420 = codecXVideoFrameInterface.toI420();
                        if (i420 == null) {
                            andRetainVideoFrameMemory.release();
                            return;
                        }
                        CodecXVideoMemoryInterface andRetainVideoFrameMemory2 = i420.getAndRetainVideoFrameMemory();
                        if (!(andRetainVideoFrameMemory2 instanceof NativeCodecXByteMemory)) {
                            i420.release();
                            andRetainVideoFrameMemory.release();
                            return;
                        } else {
                            this.yuvUploader.uploadFromBuffer((CodecXVideoByteMemoryInterface) andRetainVideoFrameMemory2);
                            andRetainVideoFrameMemory2.release();
                            i420.release();
                        }
                    }
                    glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i, i2, i3, i4, FilterType.Origin, 0, 0, this.dstWidth, this.dstHeight);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            andRetainVideoFrameMemory.release();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            andRetainVideoFrameMemory.release();
            throw th;
        }
    }

    public void drawFrame(CodecXVideoFrameInterface codecXVideoFrameInterface, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6) {
        this.dstWidth = i5;
        this.dstHeight = i6;
        drawFrame(codecXVideoFrameInterface, glDrawer, matrix, i, i2, i3, i4);
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, CodecXVideoOpenGLMemoryInterface codecXVideoOpenGLMemoryInterface, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6, FilterType filterType, int i7, int i8) {
        Matrix matrix2 = new Matrix(codecXVideoOpenGLMemoryInterface.getAndroidTextureMatrix());
        matrix2.preConcat(matrix);
        float[] fArrConvertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i9 = AnonymousClass1.$SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[codecXVideoOpenGLMemoryInterface.getPixelFormat().ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                glDrawer.drawRgb(codecXVideoOpenGLMemoryInterface.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6, filterType, i7, i8);
                return;
            }
            throw new RuntimeException("Unknown texture type.");
        }
        glDrawer.drawOes(codecXVideoOpenGLMemoryInterface.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6, filterType, i7, i8);
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, CodecXVideoOpenGLMemoryInterface codecXVideoOpenGLMemoryInterface, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6, FilterType filterType, int i7, int i8, int i9, int i10) {
        Matrix matrix2 = new Matrix(codecXVideoOpenGLMemoryInterface.getAndroidTextureMatrix());
        matrix2.preConcat(matrix);
        float[] fArrConvertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i11 = AnonymousClass1.$SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[codecXVideoOpenGLMemoryInterface.getPixelFormat().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                glDrawer.drawRgb(codecXVideoOpenGLMemoryInterface.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6, filterType, i7, i8, i9, i10);
                return;
            }
            throw new RuntimeException("Unknown texture type.");
        }
        glDrawer.drawOes(codecXVideoOpenGLMemoryInterface.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6, filterType, i7, i8, i9, i10);
    }
}
