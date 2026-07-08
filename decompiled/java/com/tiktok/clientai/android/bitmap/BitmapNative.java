package com.tiktok.clientai.android.bitmap;

import X.C0OFE;
import X.C0Z1Z;
import X.C13LP;
import X.C892890Z1b;
import X.C892910Z1d;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes15.dex */
public final class BitmapNative {
    public final Bitmap LIZ;
    public long LIZIZ;
    public int LIZJ;

    private final native long preprocessImagePixelsNative(int[] iArr, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6, float f, float[] fArr, float[] fArr2, int i7, int i8);

    private final native float[] readFloatArrayNative(long j, int i);

    private final native void releaseNativeBuffer(long j);

    public final void LIZIZ() {
        long j = this.LIZIZ;
        if (j != 0) {
            releaseNativeBuffer(j);
        }
        this.LIZIZ = 0L;
        this.LIZJ = 0;
    }

    public BitmapNative(Bitmap bitmap) {
        this.LIZ = bitmap;
        LoadSoLancet.LIZJ("client_ai_impl_jni");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("client_ai_impl_jni");
        LoadSoLancet.LJ(jUptimeMillis, "client_ai_impl_jni");
        LoadSoLancet.LIZLLL(jUptimeMillis, "client_ai_impl_jni");
        LoadSoLancet.LIZIZ("client_ai_impl_jni");
    }

    public final void LIZ(C892910Z1d c892910Z1d, C892890Z1b c892890Z1b) {
        int i;
        int i2;
        int i3;
        int i4 = c892910Z1d.LIZIZ;
        int i5 = c892910Z1d.LIZ;
        float f = c892890Z1b.LIZIZ;
        int i6 = c892910Z1d.LIZJ;
        boolean z = c892910Z1d.LIZLLL;
        boolean z2 = c892910Z1d.LJ;
        float[] fArrLLI = C13LP.LLI(C0OFE.LIZJ(c892890Z1b.LIZJ));
        float[] fArrLLI2 = C13LP.LLI(C0OFE.LIZJ(c892890Z1b.LIZLLL));
        NormalizationType normalizationType = c892890Z1b.LIZ;
        OutputFormat outputFormat = c892890Z1b.LJ;
        ColorSeq colorSeq = c892890Z1b.LJFF;
        int i7 = C0Z1Z.LIZ[normalizationType.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                i = 2;
            } else {
                i = 1;
            }
        } else {
            i = 0;
        }
        if (C0Z1Z.LIZIZ[outputFormat.ordinal()] == 1) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (C0Z1Z.LIZJ[colorSeq.ordinal()] == 1) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        int width = this.LIZ.getWidth();
        int height = this.LIZ.getHeight();
        int[] iArr = new int[width * height];
        this.LIZ.getPixels(iArr, 0, width, 0, 0, width, height);
        this.LIZIZ = preprocessImagePixelsNative(iArr, width, height, i5, i4, i6, z, z2, i, f, fArrLLI, fArrLLI2, i2, i3);
        this.LIZJ = i5 * i4 * 3;
    }
}
