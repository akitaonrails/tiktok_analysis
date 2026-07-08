package com.facebook.imagepipeline.nativecode;

import X.C1322210kVn;
import X.C1323050kX9;
import X.C1327320ke2;
import X.C1328480kfu;
import X.C1329450khT;
import X.C1329910kiD;
import X.C1330310kir;
import X.C1331420kke;
import X.C786410Ut5;
import X.InterfaceC1327060kdc;
import X.InterfaceC1328910kgb;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public abstract class DalvikPurgeableDecoder implements InterfaceC1328910kgb {
    public static final byte[] EOI;
    public final C1329450khT mUnpooledBitmapsCounter;

    public static native void nativePinBitmap(Bitmap bitmap);

    public abstract Bitmap decodeByteArrayAsPurgeable(C1323050kX9<InterfaceC1327060kdc> c1323050kX9, BitmapFactory.Options options);

    public abstract Bitmap decodeJPEGByteArrayAsPurgeable(C1323050kX9<InterfaceC1327060kdc> c1323050kX9, int i, BitmapFactory.Options options);

    static {
        C1322210kVn.LIZIZ("imagepipeline");
        EOI = new byte[]{-1, -39};
    }

    public DalvikPurgeableDecoder() {
        if (C1329910kiD.LIZJ == null) {
            synchronized (C1329910kiD.class) {
                try {
                    if (C1329910kiD.LIZJ == null) {
                        C1329910kiD.LIZJ = new C1329450khT(C1329910kiD.LIZIZ, C1329910kiD.LIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.mUnpooledBitmapsCounter = C1329910kiD.LIZJ;
    }

    public C1323050kX9<Bitmap> pinBitmap(Bitmap bitmap) throws Throwable {
        bitmap.getClass();
        try {
            nativePinBitmap(bitmap);
            C1329450khT c1329450khT = this.mUnpooledBitmapsCounter;
            synchronized (c1329450khT) {
                int iLIZJ = C1327320ke2.LIZJ(bitmap);
                int i = c1329450khT.LIZ;
                if (i < c1329450khT.LIZJ) {
                    long j = c1329450khT.LIZIZ + ((long) iLIZJ);
                    if (j <= c1329450khT.LIZLLL) {
                        c1329450khT.LIZ = i + 1;
                        c1329450khT.LIZIZ = j;
                        return C1323050kX9.LJJIZ(bitmap, this.mUnpooledBitmapsCounter.LJ);
                    }
                }
                int iLIZJ2 = C1327320ke2.LIZJ(bitmap);
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                throw new C1330310kir(C786410Ut5.k4(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", new Object[]{Integer.valueOf(iLIZJ2), Integer.valueOf(this.mUnpooledBitmapsCounter.LIZIZ()), Long.valueOf(this.mUnpooledBitmapsCounter.LJ()), Integer.valueOf(this.mUnpooledBitmapsCounter.LIZJ()), Integer.valueOf(this.mUnpooledBitmapsCounter.LIZLLL())}));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            C1331420kke.LIZIZ(e);
            throw null;
        }
    }

    public static boolean endsWithEOI(C1323050kX9<InterfaceC1327060kdc> c1323050kX9, int i) {
        InterfaceC1327060kdc interfaceC1327060kdc = c1323050kX9.get();
        if (i >= 2 && interfaceC1327060kdc.read(i - 2) == -1 && interfaceC1327060kdc.read(i - 1) == -39) {
            return true;
        }
        return false;
    }

    public static BitmapFactory.Options getBitmapFactoryOptions(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        return options;
    }

    public C1323050kX9<Bitmap> decodeFromEncodedImage(C1328480kfu c1328480kfu, Bitmap.Config config, Rect rect) {
        return decodeFromEncodedImageWithColorSpace(c1328480kfu, config, rect, false);
    }

    @Override // X.InterfaceC1328910kgb
    public C1323050kX9<Bitmap> decodeFromEncodedImageWithColorSpace(C1328480kfu c1328480kfu, Bitmap.Config config, Rect rect, boolean z) {
        BitmapFactory.Options bitmapFactoryOptions = getBitmapFactoryOptions(c1328480kfu.LLIZLLLIL, config);
        C1323050kX9<InterfaceC1327060kdc> c1323050kX9LJFF = c1328480kfu.LJFF();
        c1323050kX9LJFF.getClass();
        try {
            C1323050kX9<Bitmap> c1323050kX9PinBitmap = pinBitmap(decodeByteArrayAsPurgeable(c1323050kX9LJFF, bitmapFactoryOptions));
            C1323050kX9.LJII(c1323050kX9LJFF);
            return c1323050kX9PinBitmap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323050kX9.LJII(c1323050kX9LJFF);
            throw th;
        }
    }

    public C1323050kX9<Bitmap> decodeJPEGFromEncodedImage(C1328480kfu c1328480kfu, Bitmap.Config config, Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(c1328480kfu, config, rect, i, false);
    }

    @Override // X.InterfaceC1328910kgb
    public C1323050kX9<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(C1328480kfu c1328480kfu, Bitmap.Config config, Rect rect, int i, boolean z) {
        BitmapFactory.Options bitmapFactoryOptions = getBitmapFactoryOptions(c1328480kfu.LLIZLLLIL, config);
        C1323050kX9<InterfaceC1327060kdc> c1323050kX9LJFF = c1328480kfu.LJFF();
        c1323050kX9LJFF.getClass();
        try {
            C1323050kX9<Bitmap> c1323050kX9PinBitmap = pinBitmap(decodeJPEGByteArrayAsPurgeable(c1323050kX9LJFF, i, bitmapFactoryOptions));
            C1323050kX9.LJII(c1323050kX9LJFF);
            return c1323050kX9PinBitmap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323050kX9.LJII(c1323050kX9LJFF);
            throw th;
        }
    }
}
