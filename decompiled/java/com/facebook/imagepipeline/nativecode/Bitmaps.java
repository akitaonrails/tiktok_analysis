package com.facebook.imagepipeline.nativecode;

import X.C1322210kVn;
import X.C1322350kW1;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes21.dex */
public class Bitmaps {
    public static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);

    static {
        C1322210kVn.LIZIZ("imagepipeline");
    }

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (bitmap2.getConfig() == bitmap.getConfig()) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        C1322350kW1.LIZIZ(bitmap.isMutable());
        if (bitmap.getWidth() == bitmap2.getWidth()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1322350kW1.LIZIZ(z2);
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z3 = false;
        }
        C1322350kW1.LIZIZ(z3);
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }
}
