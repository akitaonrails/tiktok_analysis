package com.bytedance.fresco.nativeheif;

import X.C1322210kVn;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class Heif {
    public static native int initBmfSr(int i, int i2, int i3, String str);

    public static native boolean isHeif(byte[] bArr, int i);

    public static native void nativeInit();

    public static native int[] parseSimpleMeta(byte[] bArr, int i);

    public static native int[] parseSimpleMeta(byte[] bArr, int i, boolean z);

    public static native int[] parseSimpleMetaByNativePtr(long j, int i);

    public static native int[] parseThumbMeta(byte[] bArr, int i);

    public static native int[] parseThumbMetaByNativePtr(long j, int i);

    public static native Bitmap previewToRgbaBitmap(byte[] bArr, int i, int i2, int i3, int[] iArr);

    public static native void releaseBmfSr();

    public static native HeifData toRgb565(byte[] bArr, boolean z, int i, boolean z2, int i2, int i3, int i4, int i5, int i6);

    public static native HeifData toRgb565(byte[] bArr, boolean z, int i, boolean z2, int i2, boolean z3, int i3, boolean z4, int i4, int i5, int i6, int i7, int i8, int i9);

    public static native Bitmap toRgb565Bitmap(ByteBuffer byteBuffer, boolean z, int i, boolean z2, int i2, int i3, int i4, int i5, int i6);

    public static native Bitmap toRgb565Bitmap(ByteBuffer byteBuffer, boolean z, int i, boolean z2, int i2, boolean z3, int i3, boolean z4, int i4, int i5, int i6, int i7, int i8, int i9);

    public static native Bitmap toRgb565BitmapByNativePtr(long j, boolean z, int i, boolean z2, int i2, int i3, boolean z3, int i4, boolean z4, int i5, int i6, int i7, int i8, int i9, int i10, int[] iArr);

    public static native Bitmap toRgb565BitmapOpt(ByteBuffer byteBuffer, boolean z, int i, boolean z2, int i2, int i3, boolean z3, int i4, boolean z4, int i5, int i6, int i7, int i8, int i9, int i10, int[] iArr);

    public static native HeifData toRgba(byte[] bArr, boolean z, int i, boolean z2, int i2, int i3, int i4, int i5, int i6);

    public static native HeifData toRgba(byte[] bArr, boolean z, int i, boolean z2, int i2, boolean z3, int i3, boolean z4, int i4, int i5, int i6, int i7, int i8, int i9);

    public static native Bitmap toRgbaBitmap(ByteBuffer byteBuffer, boolean z, int i, boolean z2, int i2, int i3, int i4, int i5, int i6);

    public static native Bitmap toRgbaBitmap(ByteBuffer byteBuffer, boolean z, int i, boolean z2, int i2, boolean z3, int i3, boolean z4, int i4, int i5, int i6, int i7, int i8, int i9);

    public static native Bitmap toRgbaBitmapByNativePtr(long j, boolean z, int i, boolean z2, int i2, int i3, boolean z3, int i4, boolean z4, int i5, int i6, int i7, int i8, int i9, int i10, int[] iArr);

    public static native Bitmap toRgbaBitmapByNativePtrWithBmfSr(long j, boolean z, int i, boolean z2, int i2, int i3, boolean z3, int i4, boolean z4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, String str, int[] iArr);

    public static native Bitmap toRgbaBitmapOpt(ByteBuffer byteBuffer, boolean z, int i, boolean z2, int i2, int i3, boolean z3, int i4, boolean z4, int i5, int i6, int i7, int i8, int i9, int i10, int[] iArr);

    public static native HeifData toRgbaExternBuffer(byte[] bArr, boolean z, int i, byte[] bArr2, int i2, boolean z2, int i3, int i4, int i5, int i6, int i7);

    public static native HeifData toThumbRgba(byte[] bArr, int i);

    public static native Bitmap toThumbRgbaBitmapByNativePtr(long j, boolean z, int i, int i2, int i3);

    static {
        C1322210kVn.LIZIZ("ttheif_dec");
        C1322210kVn.LIZIZ("bdheif");
        nativeInit();
    }

    public static Bitmap toThumbRgbaBitmapByNativePtr(long j, int i, int i2, int i3) {
        return toThumbRgbaBitmapByNativePtr(j, false, i, i2, i3);
    }

    public static HeifData toRgb565(byte[] bArr, int i, boolean z, int i2, int i3, int i4, int i5, int i6) {
        return toRgb565(bArr, false, i, z, i2, i3, i4, i5, i6);
    }

    public static Bitmap toRgb565Bitmap(ByteBuffer byteBuffer, int i, boolean z, int i2, int i3, int i4, int i5, int i6) {
        return toRgb565Bitmap(byteBuffer, false, i, z, i2, i3, i4, i5, i6);
    }

    public static HeifData toRgba(byte[] bArr, int i, boolean z, int i2, int i3, int i4, int i5, int i6) {
        return toRgba(bArr, false, i, z, i2, i3, i4, i5, i6);
    }

    public static Bitmap toRgbaBitmap(ByteBuffer byteBuffer, int i, boolean z, int i2, int i3, int i4, int i5, int i6) {
        return toRgbaBitmap(byteBuffer, false, i, z, i2, i3, i4, i5, i6);
    }

    public static HeifData toRgbaExternBuffer(byte[] bArr, int i, byte[] bArr2, int i2, boolean z, int i3, int i4, int i5, int i6, int i7) {
        return toRgbaExternBuffer(bArr, false, i, bArr2, i2, z, i3, i4, i5, i6, i7);
    }

    public static HeifData toRgb565(byte[] bArr, int i, boolean z, int i2, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return toRgb565(bArr, false, i, false, 0, z, i2, z2, i3, i4, i5, i6, i7, i8);
    }

    public static Bitmap toRgb565Bitmap(ByteBuffer byteBuffer, int i, boolean z, int i2, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return toRgb565Bitmap(byteBuffer, false, i, false, 0, z, i2, z2, i3, i4, i5, i6, i7, i8);
    }

    public static HeifData toRgba(byte[] bArr, int i, boolean z, int i2, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return toRgba(bArr, false, i, false, 0, z, i2, z2, i3, i4, i5, i6, i7, i8);
    }

    public static Bitmap toRgbaBitmap(ByteBuffer byteBuffer, int i, boolean z, int i2, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return toRgbaBitmap(byteBuffer, false, i, false, 0, z, i2, z2, i3, i4, i5, i6, i7, i8);
    }

    public static Bitmap toRgb565BitmapByNativePtr(long j, int i, boolean z, int i2, int i3, boolean z2, int i4, boolean z3, int i5, int i6, int i7, int i8, int i9, int i10) {
        return toRgb565BitmapByNativePtr(j, false, i, z, i2, i3, z2, i4, z3, i5, i6, i7, i8, i9, i10, null);
    }

    public static Bitmap toRgb565BitmapOpt(ByteBuffer byteBuffer, int i, boolean z, int i2, int i3, boolean z2, int i4, boolean z3, int i5, int i6, int i7, int i8, int i9, int i10) {
        return toRgb565BitmapOpt(byteBuffer, false, i, z, i2, i3, z2, i4, z3, i5, i6, i7, i8, i9, i10, null);
    }

    public static Bitmap toRgbaBitmapByNativePtr(long j, int i, boolean z, int i2, int i3, boolean z2, int i4, boolean z3, int i5, int i6, int i7, int i8, int i9, int i10) {
        return toRgbaBitmapByNativePtr(j, false, i, z, i2, i3, z2, i4, z3, i5, i6, i7, i8, i9, i10, null);
    }

    public static Bitmap toRgbaBitmapOpt(ByteBuffer byteBuffer, int i, boolean z, int i2, int i3, boolean z2, int i4, boolean z3, int i5, int i6, int i7, int i8, int i9, int i10) {
        return toRgbaBitmapOpt(byteBuffer, false, i, z, i2, i3, z2, i4, z3, i5, i6, i7, i8, i9, i10, null);
    }
}
