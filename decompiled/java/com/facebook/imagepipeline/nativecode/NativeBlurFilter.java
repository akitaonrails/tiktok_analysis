package com.facebook.imagepipeline.nativecode;

import X.C1322210kVn;
import X.C1322350kW1;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes21.dex */
public class NativeBlurFilter {
    public static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    static {
        C1322210kVn.LIZIZ("native-filters");
    }

    public static void iterativeBoxBlur(Bitmap bitmap, int i, int i2) {
        boolean z;
        bitmap.getClass();
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        if (i2 <= 0) {
            z2 = false;
        }
        C1322350kW1.LIZIZ(z2);
        nativeIterativeBoxBlur(bitmap, i, i2);
    }
}
