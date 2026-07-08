package com.ss.ttlivestreamer.core.opengl;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class VideoColorRange {
    public static int Rgb2YuvFormulaColorRange = -1;
    public static int Yuv2RgbFormulaColorRange = -1;

    public static native int nativeCheckYuv2RgbFormulaColorRange(int i);

    public static native int nativeCheckYuvFrameColorRange(ByteBuffer byteBuffer, int i, int i2);

    public static int checkRgb2YuvFormulaColorRange() {
        int i = Rgb2YuvFormulaColorRange;
        if (i != -1) {
            return i;
        }
        float[] fArr = YuvConverter.RGB_TO_YUV_TRANSFORM_MATRIX[0];
        if (((fArr[0] * 1.0f) + (fArr[1] * 1.0f) + (fArr[2] * 1.0f) + fArr[3]) * 255.0f > 245.0f) {
            Rgb2YuvFormulaColorRange = 0;
        } else {
            Rgb2YuvFormulaColorRange = 1;
        }
        return Rgb2YuvFormulaColorRange;
    }

    public static int checkYuv2RgbFormulaColorRange(int i) {
        if (Yuv2RgbFormulaColorRange == -1) {
            Yuv2RgbFormulaColorRange = nativeCheckYuv2RgbFormulaColorRange(i);
        }
        return Yuv2RgbFormulaColorRange;
    }

    public static int checkYuvFrameColorRange(ByteBuffer byteBuffer, int i, int i2) {
        if (byteBuffer != null && byteBuffer.capacity() >= ((i * i2) * 3) / 2) {
            if (!byteBuffer.isDirect()) {
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
                byteBufferAllocateDirect.position(0);
                byteBufferAllocateDirect.put(byteBuffer);
                byteBuffer = byteBufferAllocateDirect;
            }
            return nativeCheckYuvFrameColorRange(byteBuffer, i, i2);
        }
        return -1;
    }
}
