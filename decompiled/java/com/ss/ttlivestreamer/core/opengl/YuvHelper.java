package com.ss.ttlivestreamer.core.opengl;

import X.C2188811AlT;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class YuvHelper {
    public static native void nativeAndroid420ToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, ByteBuffer byteBuffer6, int i7, int i8, int i9);

    public static native void nativeI420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    public static native void nativeI420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9);

    public static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    public static native void nativeNV21ToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        int i6 = (i4 + 1) / 2;
        int i7 = i4 * i5;
        int i8 = ((i5 + 1) / 2) * i6;
        int i9 = (i8 * 2) + i7;
        if (byteBuffer4.capacity() >= i9) {
            byteBuffer4.position(0);
            ByteBuffer byteBufferSlice = byteBuffer4.slice();
            byteBuffer4.position(i7);
            ByteBuffer byteBufferSlice2 = byteBuffer4.slice();
            byteBuffer4.position(i8 + i7);
            nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBufferSlice, i4, byteBufferSlice2, i6, byteBuffer4.slice(), i6, i4, i5);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected destination buffer capacity to be at least ");
        sbLIZ.append(i9);
        sbLIZ.append(" was ");
        sbLIZ.append(byteBuffer4.capacity());
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        int i6 = (i4 + 1) / 2;
        int i7 = i4 * i5;
        int i8 = (((i5 + 1) / 2) * i6 * 2) + i7;
        if (byteBuffer4.capacity() >= i8) {
            byteBuffer4.position(0);
            ByteBuffer byteBufferSlice = byteBuffer4.slice();
            byteBuffer4.position(i7);
            nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBufferSlice, i4, byteBuffer4.slice(), i6 * 2, i4, i5);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected destination buffer capacity to be at least ");
        sbLIZ.append(i8);
        sbLIZ.append(" was ");
        sbLIZ.append(byteBuffer4.capacity());
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i6 % 180 == 0) {
            i7 = i4;
            i8 = i5;
        } else {
            i7 = i5;
            i8 = i4;
        }
        int i9 = (i8 + 1) / 2;
        int i10 = (i7 + 1) / 2;
        int i11 = i8 * i7;
        int i12 = i9 * i10;
        int i13 = (i12 * 2) + i11;
        if (byteBuffer4.capacity() >= i13) {
            byteBuffer4.position(0);
            ByteBuffer byteBufferSlice = byteBuffer4.slice();
            byteBuffer4.position(i11);
            ByteBuffer byteBufferSlice2 = byteBuffer4.slice();
            byteBuffer4.position(i12 + i11);
            nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBufferSlice, i7, byteBufferSlice2, i10, byteBuffer4.slice(), i10, i4, i5, i6);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected destination buffer capacity to be at least ");
        sbLIZ.append(i13);
        sbLIZ.append(" was ");
        sbLIZ.append(byteBuffer4.capacity());
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7) {
        nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, i6, i7);
    }

    public static void NV21ToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7) {
        nativeNV21ToI420(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, i6, i7);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8) {
        nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8);
    }

    public static void Android420ToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, ByteBuffer byteBuffer6, int i7, int i8, int i9) {
        nativeAndroid420ToI420(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, i4, byteBuffer4, i5, byteBuffer5, i6, byteBuffer6, i7, i8, i9);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9) {
        nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8, i9);
    }
}
