package com.bytedance.realx.video;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.memory.NativeRXByteMemory;
import com.bytedance.realx.video.memory.RXVideoByteMemoryInterface;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;
import com.bytedance.realx.video.memory.RXVideoMemoryInterface;
import com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class VideoFrameDrawer {
    public static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    public RXVideoFrameInterface lastI420Frame;
    public int renderHeight;
    public int renderWidth;
    public final float[] dstPoints = new float[6];
    public final Point renderSize = new Point();
    public int dstWidth = 0;
    public int dstHeight = 0;
    public final YuvUploader yuvUploader = new YuvUploader();
    public final Matrix renderMatrix = new Matrix();

    /* JADX INFO: renamed from: com.bytedance.realx.video.VideoFrameDrawer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXPixelFormat;

        static {
            int[] iArr = new int[RXPixelFormat.values().length];
            $SwitchMap$com$bytedance$realx$video$RXPixelFormat = iArr;
            try {
                iArr[RXPixelFormat.kTextureOES.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kTexture2D.ordinal()] = 2;
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

        public int[] uploadFromBuffer(RXVideoByteMemoryInterface rXVideoByteMemoryInterface) {
            if (rXVideoByteMemoryInterface.getPixelFormat() != RXPixelFormat.kI420) {
                return null;
            }
            return uploadYuvData(rXVideoByteMemoryInterface.getWidth(), rXVideoByteMemoryInterface.getHeight(), new int[]{rXVideoByteMemoryInterface.getPlaneLineSize(0), rXVideoByteMemoryInterface.getPlaneLineSize(1), rXVideoByteMemoryInterface.getPlaneLineSize(2)}, new ByteBuffer[]{rXVideoByteMemoryInterface.getPlaneData(0), rXVideoByteMemoryInterface.getPlaneData(1), rXVideoByteMemoryInterface.getPlaneData(2)});
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
                    YuvHelper.nativeCopyPlane(byteBufferArr[i3], i10, this.copyBuffer, i11, i11, iArr3[i3]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i3], iArr3[i3], 0, 6409, 5121, byteBuffer);
                GLES20.glPixelStorei(3317, 4);
                i3++;
            } while (i3 < 3);
            return this.yuvTextures;
        }
    }

    public void drawFrame(RXVideoFrameInterface rXVideoFrameInterface, RendererCommon.GlDrawer glDrawer) {
        drawFrame(rXVideoFrameInterface, glDrawer, null);
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

    public void drawFrame(RXVideoFrameInterface rXVideoFrameInterface, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(rXVideoFrameInterface, glDrawer, matrix, 0, 0, rXVideoFrameInterface.getRotatedWidth(), rXVideoFrameInterface.getRotatedHeight());
    }

    public static int distance(float f, float f2, float f3, float f4) {
        return (int) Math.round(Math.hypot(f3 - f, f4 - f2));
    }

    public void drawFrame(RXVideoFrameInterface rXVideoFrameInterface, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i, int i2, int i3, int i4) {
        boolean z;
        if (rXVideoFrameInterface == null) {
            return;
        }
        RXVideoMemoryInterface andRetainVideoFrameMemory = rXVideoFrameInterface.getAndRetainVideoFrameMemory();
        try {
            if (andRetainVideoFrameMemory == null) {
                return;
            }
            try {
                calculateTransformedRenderSize(rXVideoFrameInterface.getRotatedWidth(), rXVideoFrameInterface.getRotatedHeight(), matrix);
                if (andRetainVideoFrameMemory.getMemoryType() == RXVideoMemoryType.kOPENGL_TEXTURE) {
                    z = true;
                } else {
                    z = false;
                }
                this.renderMatrix.reset();
                this.renderMatrix.preTranslate(0.5f, 0.5f);
                if (!z) {
                    this.renderMatrix.preScale(1.0f, -1.0f);
                }
                this.renderMatrix.preRotate(rXVideoFrameInterface.getRotation().value());
                this.renderMatrix.preTranslate(-0.5f, -0.5f);
                if (matrix != null) {
                    this.renderMatrix.preConcat(matrix);
                }
                if (z && this.renderWidth > 0) {
                    RXVideoOpenGLMemoryInterface rXVideoOpenGLMemoryInterface = (RXVideoOpenGLMemoryInterface) andRetainVideoFrameMemory;
                    FilterType filterTypeFromValue = FilterType.fromValue(rXVideoOpenGLMemoryInterface.getScaleFilter().value());
                    int unScaledWidth = rXVideoOpenGLMemoryInterface.getUnScaledWidth();
                    int unScaledHeight = rXVideoOpenGLMemoryInterface.getUnScaledHeight();
                    this.lastI420Frame = null;
                    if (filterTypeFromValue != null && filterTypeFromValue != FilterType.Origin && unScaledWidth != 0 && unScaledHeight != 0) {
                        drawTexture(glDrawer, rXVideoOpenGLMemoryInterface, this.renderMatrix, this.renderWidth, this.renderHeight, i, i2, i3, i4, filterTypeFromValue, unScaledWidth, unScaledHeight, this.dstWidth, this.dstHeight);
                    } else {
                        drawTexture(glDrawer, rXVideoOpenGLMemoryInterface, this.renderMatrix, this.renderWidth, this.renderHeight, i, i2, i3, i4, FilterType.Origin, 0, 0, this.dstWidth, this.dstHeight);
                    }
                } else {
                    if (rXVideoFrameInterface != this.lastI420Frame) {
                        this.lastI420Frame = rXVideoFrameInterface;
                        RXVideoFrameInterface i420 = rXVideoFrameInterface.toI420();
                        if (i420 == null) {
                            andRetainVideoFrameMemory.release();
                            return;
                        }
                        RXVideoMemoryInterface andRetainVideoFrameMemory2 = i420.getAndRetainVideoFrameMemory();
                        if (!(andRetainVideoFrameMemory2 instanceof NativeRXByteMemory)) {
                            i420.release();
                            andRetainVideoFrameMemory.release();
                            return;
                        } else {
                            this.yuvUploader.uploadFromBuffer((RXVideoByteMemoryInterface) andRetainVideoFrameMemory2);
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

    public void drawFrame(RXVideoFrameInterface rXVideoFrameInterface, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6) {
        this.dstWidth = i5;
        this.dstHeight = i6;
        drawFrame(rXVideoFrameInterface, glDrawer, matrix, i, i2, i3, i4);
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, RXVideoOpenGLMemoryInterface rXVideoOpenGLMemoryInterface, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6, FilterType filterType, int i7, int i8) {
        Matrix matrix2 = new Matrix(rXVideoOpenGLMemoryInterface.getAndroidTextureMatrix());
        matrix2.preConcat(matrix);
        float[] fArrConvertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i9 = AnonymousClass1.$SwitchMap$com$bytedance$realx$video$RXPixelFormat[rXVideoOpenGLMemoryInterface.getTextureTarget().ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                glDrawer.drawRgb(rXVideoOpenGLMemoryInterface.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6, filterType, i7, i8);
                return;
            }
            throw new RuntimeException("Unknown texture type.");
        }
        glDrawer.drawOes(rXVideoOpenGLMemoryInterface.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6, filterType, i7, i8);
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, RXVideoOpenGLMemoryInterface rXVideoOpenGLMemoryInterface, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6, FilterType filterType, int i7, int i8, int i9, int i10) {
        Matrix matrix2 = new Matrix(rXVideoOpenGLMemoryInterface.getAndroidTextureMatrix());
        matrix2.preConcat(matrix);
        float[] fArrConvertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i11 = AnonymousClass1.$SwitchMap$com$bytedance$realx$video$RXPixelFormat[rXVideoOpenGLMemoryInterface.getTextureTarget().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                glDrawer.drawRgb(rXVideoOpenGLMemoryInterface.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6, filterType, i7, i8, i9, i10);
                return;
            }
            throw new RuntimeException("Unknown texture type.");
        }
        glDrawer.drawOes(rXVideoOpenGLMemoryInterface.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6, filterType, i7, i8, i9, i10);
    }
}
