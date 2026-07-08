package com.bytedance.fresco.sr;

import X.AbstractC1301670jyf;
import X.C1322210kVn;
import X.C1323050kX9;
import X.C1328570kg3;
import X.C1330270kin;
import X.C2188811AlT;
import X.InterfaceC1328980kgi;
import android.graphics.Bitmap;
import com.bytedance.fresco.nativeheif.Heif;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes21.dex */
public class BmfJniSr implements InterfaceC1328980kgi {
    public static final ReentrantLock rwlock = new ReentrantLock();
    public static final byte[] processLock = new byte[0];
    public static int maxWidth = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
    public static int maxHeight = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
    public static int mConcurrencyLimit = 3;
    public static String mProgramCacheDir = "";
    public static boolean isLoadBmfHydraLiteSo = false;

    public static native Bitmap processSrUseJni(int i, int i2, int i3, String str, boolean z, Bitmap bitmap, int i4, int i5, int[] iArr);

    @Override // X.InterfaceC1328980kgi
    public String getSRType() {
        return "BMFJNISR";
    }

    public String getScaleType() {
        return null;
    }

    public C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) {
        return null;
    }

    @Override // X.InterfaceC1328980kgi
    public C1323050kX9<Bitmap> processMultiScaleBitmap(int i, Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf, int i2) {
        return null;
    }

    public static boolean loadBmfHydraLiteSo() {
        if (isLoadBmfHydraLiteSo) {
            return true;
        }
        try {
            C1322210kVn.LIZIZ("bmf_hydra_lite");
            isLoadBmfHydraLiteSo = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadBmfHydraLiteSo: throwable = ");
            sbLIZ.append(th);
            C1328570kg3.LJFF("BmfJniSr", C2188811AlT.LIZIZ(sbLIZ));
        }
        return isLoadBmfHydraLiteSo;
    }

    public void destroy() {
        ReentrantLock reentrantLock = rwlock;
        reentrantLock.lock();
        Heif.releaseBmfSr();
        reentrantLock.unlock();
    }

    public static String initBMFSR(int i, int i2, int i3, String str) {
        int i4;
        if (!loadBmfHydraLiteSo()) {
            return "load bmf_hydra_lite failed!";
        }
        int i5 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        if (i <= 0) {
            i4 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        } else {
            i4 = i;
        }
        maxWidth = i4;
        if (i2 > 0) {
            i5 = i2;
        }
        maxHeight = i5;
        mProgramCacheDir = str;
        mConcurrencyLimit = i3;
        C1330270kin.LJ = str;
        C1330270kin.LIZIZ = i4;
        C1330270kin.LIZJ = i5;
        C1330270kin.LIZLLL = i3;
        ReentrantLock reentrantLock = rwlock;
        reentrantLock.lock();
        int iInitBmfSr = Heif.initBmfSr(i, i2, i3, str);
        reentrantLock.unlock();
        if (iInitBmfSr == 0) {
            return "success";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append("BmfJniSr initialization error, res = ");
        sbLIZ.append(iInitBmfSr);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Bitmap processSrUseJni(boolean z, Bitmap bitmap, int i, int i2) {
        return processSrUseJni(maxWidth, maxHeight, mConcurrencyLimit, mProgramCacheDir, z, bitmap, i, i2, null);
    }

    @Override // X.InterfaceC1328980kgi
    public C1323050kX9<Bitmap> processMultiScaleBitmap(boolean z, Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf, int i, int i2) throws Exception {
        C1323050kX9<Bitmap> c1323050kX9LIZJ;
        if (i2 == -1) {
            return null;
        }
        if (z) {
            Bitmap bitmapProcessSrUseJni = processSrUseJni(z, bitmap, i, i2);
            if (bitmapProcessSrUseJni != null) {
                return abstractC1301670jyf.LIZJ(bitmapProcessSrUseJni);
            }
            throw new Exception("ProcessMultiScaleBitmap result is null!");
        }
        synchronized (processLock) {
            try {
                Bitmap bitmapProcessSrUseJni2 = processSrUseJni(z, bitmap, i, i2);
                if (bitmapProcessSrUseJni2 != null) {
                    c1323050kX9LIZJ = abstractC1301670jyf.LIZJ(bitmapProcessSrUseJni2);
                } else {
                    throw new Exception("ProcessMultiScaleBitmap result is null!");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1323050kX9LIZJ;
    }
}
