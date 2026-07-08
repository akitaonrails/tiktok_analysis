package com.facebook.imagepipeline.nativecode;

import X.C1322210kVn;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes21.dex */
public class NativeRoundingFilter {
    public static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    public static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    static {
        C1322210kVn.LIZIZ("native-filters");
    }

    public static void toCircle(Bitmap bitmap) {
        toCircle(bitmap, false);
    }

    public static void toCircle(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        nativeToCircleFilter(bitmap, z);
    }

    public static void toCircleWithBorder(Bitmap bitmap, int i, int i2, boolean z) {
        bitmap.getClass();
        nativeToCircleWithBorderFilter(bitmap, i, i2, z);
    }
}
