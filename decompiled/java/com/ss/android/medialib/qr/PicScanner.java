package com.ss.android.medialib.qr;

import X.C2484209oO;
import X.InterfaceC2254601DMk;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.utils.BitmapLoader;

/* JADX INFO: loaded from: classes36.dex */
public class PicScanner {
    public long handle = nativeCreate();
    public InterfaceC2254601DMk listener;
    public boolean success;

    private native long nativeCreate();

    private native EnigmaResult nativeGetEnigmaResult(long j);

    private native void nativeRelease(long j);

    private native int nativeStart(long j, Bitmap bitmap, ScanSettings scanSettings);

    private native void nativeStop(long j);

    public void onResult(boolean z) {
    }

    public synchronized void release() {
        C2484209oO.LJI("PicScanner", "release");
        long j = this.handle;
        if (j == 0) {
            C2484209oO.LJIIIIZZ("PicScanner", "release skip");
        } else {
            nativeRelease(j);
            this.handle = 0L;
        }
    }

    public void setListener(InterfaceC2254601DMk interfaceC2254601DMk) {
    }

    public EnigmaResult getEnigmaResult() {
        long j = this.handle;
        if (j == 0) {
            return null;
        }
        EnigmaResult enigmaResultNativeGetEnigmaResult = nativeGetEnigmaResult(j);
        if (enigmaResultNativeGetEnigmaResult != null && enigmaResultNativeGetEnigmaResult.getResult() != null) {
            this.success = true;
        }
        return enigmaResultNativeGetEnigmaResult;
    }

    public boolean isValid() {
        return this.handle != 0;
    }

    public void stop() {
        long j = this.handle;
        if (j == 0) {
            return;
        }
        nativeStop(j);
    }

    static {
        TENativeLibsLoader.loadRecorder();
    }

    public boolean isSuccess() {
        return this.success;
    }

    public int start(String str, ScanSettings scanSettings) throws Throwable {
        if (this.handle == 0) {
            return -1;
        }
        Bitmap bitmapCopy = null;
        try {
            try {
                Bitmap bitmapLoadBitmap = BitmapLoader.loadBitmap(str, scanSettings.width, scanSettings.height);
                if (bitmapLoadBitmap != null) {
                    try {
                        int width = bitmapLoadBitmap.getWidth();
                        int height = bitmapLoadBitmap.getHeight();
                        if (width * height > 4000000) {
                            float fSqrt = (float) (1.0d / Math.sqrt((width * height) / 4000000.0f));
                            Matrix matrix = new Matrix();
                            matrix.postScale(fSqrt, fSqrt);
                            bitmapCopy = Bitmap.createBitmap(bitmapLoadBitmap, 0, 0, width, height, matrix, true);
                        } else {
                            bitmapCopy = bitmapLoadBitmap.copy(Bitmap.Config.ARGB_8888, true);
                        }
                        if (!bitmapLoadBitmap.isRecycled()) {
                            bitmapLoadBitmap.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLoadBitmap);
                        } else if (bitmapLoadBitmap != null && !bitmapLoadBitmap.isRecycled()) {
                            bitmapLoadBitmap.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLoadBitmap);
                        }
                    } catch (Exception e) {
                        e = e;
                        bitmapCopy = bitmapLoadBitmap;
                        TryCatchGuardChecker.doCheck(e);
                        if (bitmapCopy != null && !bitmapCopy.isRecycled()) {
                            bitmapCopy.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCopy);
                            return -2;
                        }
                        return -2;
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                        bitmapCopy = bitmapLoadBitmap;
                        TryCatchGuardChecker.doCheck(e);
                        if (bitmapCopy != null && !bitmapCopy.isRecycled()) {
                            bitmapCopy.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCopy);
                            return -3;
                        }
                        return -3;
                    } catch (Throwable th) {
                        th = th;
                        bitmapCopy = bitmapLoadBitmap;
                        TryCatchGuardChecker.doCheck(th);
                        if (bitmapCopy != null && !bitmapCopy.isRecycled()) {
                            bitmapCopy.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCopy);
                        }
                        throw th;
                    }
                }
                return start(bitmapCopy, scanSettings);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (OutOfMemoryError e4) {
            e = e4;
        }
    }

    public int start(Bitmap bitmap, ScanSettings scanSettings) {
        if (bitmap == null) {
            return -1;
        }
        this.success = false;
        nativeStart(this.handle, bitmap, scanSettings);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        return 0;
    }
}
