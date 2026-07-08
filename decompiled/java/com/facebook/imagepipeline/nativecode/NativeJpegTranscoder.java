package com.facebook.imagepipeline.nativecode;

import X.C1322210kVn;
import X.C1322350kW1;
import X.C1322480kWE;
import X.C1323080kXC;
import X.C1324630kZh;
import X.C1324670kZl;
import X.C1327090kdf;
import X.C1327100kdg;
import X.C1327120kdi;
import X.C1328480kfu;
import X.C1328580kg4;
import X.C1330000kiM;
import X.InterfaceC1328370kfj;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class NativeJpegTranscoder implements InterfaceC1328370kfj {
    public int mMaxBitmapSize;
    public boolean mResizingEnabled;
    public boolean mUseDownsamplingRatio;

    public static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    public static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @Override // X.InterfaceC1328370kfj
    public String getIdentifier() {
        return "NativeJpegTranscoder";
    }

    static {
        C1322210kVn.LIZIZ("imagepipeline");
    }

    @Override // X.InterfaceC1328370kfj
    public boolean canTranscode(C1330000kiM c1330000kiM) {
        if (c1330000kiM == C1328580kg4.LIZ) {
            return true;
        }
        return false;
    }

    public NativeJpegTranscoder(boolean z, int i, boolean z2) {
        this.mResizingEnabled = z;
        this.mMaxBitmapSize = i;
        this.mUseDownsamplingRatio = z2;
    }

    @Override // X.InterfaceC1328370kfj
    public boolean canResize(C1328480kfu c1328480kfu, C1324670kZl c1324670kZl, C1324630kZh c1324630kZh) {
        if (c1324670kZl == null) {
            c1324670kZl = C1324670kZl.LIZJ;
        }
        if (C1327100kdg.LIZJ(c1324670kZl, c1324630kZh, c1328480kfu, this.mResizingEnabled) < 8) {
            return true;
        }
        return false;
    }

    public static void transcodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (i2 >= 1) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1322350kW1.LIZIZ(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1322350kW1.LIZIZ(z3);
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        C1322350kW1.LIZIZ(z4);
        C1322480kWE<Integer> c1322480kWE = C1327100kdg.LIZ;
        if (i >= 0 && i <= 270 && i % 90 == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        C1322350kW1.LIZIZ(z5);
        if (i2 != 8 || i != 0) {
            z6 = true;
        }
        C1322350kW1.LIZ("no transformation requested", z6);
        inputStream.getClass();
        outputStream.getClass();
        nativeTranscodeJpeg(inputStream, outputStream, i, i2, i3);
    }

    public static void transcodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (i2 >= 1) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1322350kW1.LIZIZ(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1322350kW1.LIZIZ(z3);
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        C1322350kW1.LIZIZ(z4);
        C1322480kWE<Integer> c1322480kWE = C1327100kdg.LIZ;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z5 = true;
                break;
            default:
                z5 = false;
                break;
        }
        C1322350kW1.LIZIZ(z5);
        if (i2 != 8 || i != 1) {
            z6 = true;
        }
        C1322350kW1.LIZ("no transformation requested", z6);
        inputStream.getClass();
        outputStream.getClass();
        nativeTranscodeJpegWithExifOrientation(inputStream, outputStream, i, i2, i3);
    }

    @Override // X.InterfaceC1328370kfj
    public C1327120kdi transcode(C1328480kfu c1328480kfu, OutputStream outputStream, C1324670kZl c1324670kZl, C1324630kZh c1324630kZh, C1330000kiM c1330000kiM, Integer num) throws Throwable {
        if (num == null) {
            num = 85;
        }
        if (c1324670kZl == null) {
            c1324670kZl = C1324670kZl.LIZJ;
        }
        int iLIZ = C1327090kdf.LIZ(c1324670kZl, c1324630kZh, c1328480kfu, this.mMaxBitmapSize);
        try {
            int iLIZJ = C1327100kdg.LIZJ(c1324670kZl, c1324630kZh, c1328480kfu, this.mResizingEnabled);
            int i = 1;
            int iMax = Math.max(1, 8 / iLIZ);
            if (this.mUseDownsamplingRatio) {
                iLIZJ = iMax;
            }
            InputStream inputStreamLJII = c1328480kfu.LJII();
            C1322480kWE<Integer> c1322480kWE = C1327100kdg.LIZ;
            c1328480kfu.LJIJJLI();
            if (c1322480kWE.contains(Integer.valueOf(c1328480kfu.LLILZIL))) {
                transcodeJpegWithExifOrientation(inputStreamLJII, outputStream, C1327100kdg.LIZ(c1324670kZl, c1328480kfu), iLIZJ, num.intValue());
            } else {
                transcodeJpeg(inputStreamLJII, outputStream, C1327100kdg.LIZIZ(c1324670kZl, c1328480kfu), iLIZJ, num.intValue());
            }
            C1323080kXC.LIZIZ(inputStreamLJII);
            if (iLIZ != 1) {
                i = 0;
            }
            return new C1327120kdi(i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323080kXC.LIZIZ(null);
            throw th;
        }
    }
}
