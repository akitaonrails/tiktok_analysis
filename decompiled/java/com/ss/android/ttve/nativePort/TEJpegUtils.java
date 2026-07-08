package com.ss.android.ttve.nativePort;

import X.C2122208Tc;
import android.graphics.Bitmap;
import com.ss.android.medialib.camera.ImageFrame;

/* JADX INFO: loaded from: classes4.dex */
public class TEJpegUtils {
    public static native void compressToJPEG(Bitmap bitmap, int i, String str);

    public static native void compressToJPEG2(byte[] bArr, int i, int i2, int i3, String str);

    public static native ImageFrame decompressJPEG(String str, int i);

    static {
        C2122208Tc.LIZJ();
    }

    public static int calBestSampleSize(int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0 && i3 > 0 && i4 > 0) {
            if (i3 > i4) {
                i4 = i3;
                i3 = i4;
            }
            if (i > i2) {
                int i5 = i4;
                i4 = i3;
                i3 = i5;
            }
            return Math.max((int) Math.ceil(i / i3), (int) Math.ceil(i2 / i4));
        }
        return -1;
    }

    public static int calBestSampleSize2(int i, int i2, int i3, int i4) {
        if (i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0) {
            return -1;
        }
        if (i3 > i4) {
            i4 = i3;
            i3 = i4;
        }
        if (i > i2) {
            int i5 = i4;
            i4 = i3;
            i3 = i5;
        }
        if (Math.max((int) Math.floor(i / i3), (int) Math.floor(i2 / i4)) < 2) {
            return -1;
        }
        return (int) Math.pow(2.0d, (int) Math.floor(Math.log(r1) / Math.log(2.0d)));
    }
}
