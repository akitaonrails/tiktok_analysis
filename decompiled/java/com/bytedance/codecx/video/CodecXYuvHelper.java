package com.bytedance.codecx.video;

import X.C2188811AlT;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class CodecXYuvHelper {
    public static native void nativeCopyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4);

    public static native void nativeI420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    public static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    public static native void nativeNV12Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    public static void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        nativeCopyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    public static void NV12Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4) {
        NV12Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, i4, i3, i4);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        I420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i4, i5);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        I420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i4, i5);
    }

    public static void NV12Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6) {
        int i7 = (i5 + 1) / 2;
        int i8 = i5 * i6;
        int i9 = (((i6 + 1) / 2) * i7 * 2) + i8;
        if (byteBuffer3.capacity() >= i9) {
            byteBuffer3.position(0);
            ByteBuffer byteBufferSlice = byteBuffer3.slice();
            byteBuffer3.position(i8);
            nativeNV12Copy(byteBuffer, i, byteBuffer2, i2, byteBufferSlice, i5, byteBuffer3.slice(), i7 * 2, i3, i4);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected destination buffer capacity, dst capacity: ");
        sbLIZ.append(byteBuffer3.capacity());
        sbLIZ.append(", minSize: ");
        sbLIZ.append(i9);
        sbLIZ.append(", width: ");
        sbLIZ.append(i5);
        sbLIZ.append(", height: ");
        sbLIZ.append(i6);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
            int i8 = (i6 + 1) / 2;
            int i9 = i6 * i7;
            int i10 = ((i7 + 1) / 2) * i8;
            int i11 = (i10 * 2) + i9;
            if (byteBuffer4.capacity() >= i11) {
                byteBuffer4.position(0);
                ByteBuffer byteBufferSlice = byteBuffer4.slice();
                byteBuffer4.position(i9);
                ByteBuffer byteBufferSlice2 = byteBuffer4.slice();
                byteBuffer4.position(i10 + i9);
                nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBufferSlice, i6, byteBufferSlice2, i8, byteBuffer4.slice(), i8, i4, i5);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected destination buffer capacity, dst capacity: ");
            sbLIZ.append(byteBuffer4.capacity());
            sbLIZ.append(", minSize: ");
            sbLIZ.append(i11);
            sbLIZ.append(", width: ");
            sbLIZ.append(i6);
            sbLIZ.append(", height: ");
            sbLIZ.append(i7);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7) {
        int i8 = (i6 + 1) / 2;
        int i9 = i6 * i7;
        int i10 = (((i7 + 1) / 2) * i8 * 2) + i9;
        if (byteBuffer4.capacity() >= i10) {
            byteBuffer4.position(0);
            ByteBuffer byteBufferSlice = byteBuffer4.slice();
            byteBuffer4.position(i9);
            nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBufferSlice, i6, byteBuffer4.slice(), i8 * 2, i4, i5);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected destination buffer capacity, dst capacity: ");
        sbLIZ.append(byteBuffer4.capacity());
        sbLIZ.append(", minSize: ");
        sbLIZ.append(i10);
        sbLIZ.append(", width: ");
        sbLIZ.append(i6);
        sbLIZ.append(", height: ");
        sbLIZ.append(i7);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7) {
        nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, i6, i7);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8) {
        nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8);
    }
}
