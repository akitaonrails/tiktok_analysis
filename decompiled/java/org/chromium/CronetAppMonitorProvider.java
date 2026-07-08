package org.chromium;

import X.AbstractC1497630p4j;
import X.C1494230ozF;
import X.C1494570ozn;
import X.C1494600ozq;
import X.C1494700p00;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes24.dex */
public class CronetAppMonitorProvider extends AbstractC1497630p4j {
    public static CronetAppMonitorProvider sInstance;

    @Override // X.AbstractC1497630p4j
    public boolean handleApiSample(String str, String str2) {
        return true;
    }

    public static CronetAppMonitorProvider inst() {
        if (sInstance == null) {
            synchronized (CronetAppMonitorProvider.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new CronetAppMonitorProvider();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    @Override // X.AbstractC1497630p4j
    public void sendAppMonitorEvent(String str, String str2) {
        CronetAppProviderManager.inst().sendAppMonitorEvent(str, str2);
    }

    @Override // X.AbstractC1497630p4j
    public void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, int i, int i2, String str7) {
        C1494600ozq c1494600ozqCreate = C1494600ozq.LJJJJZ.create();
        c1494600ozqCreate.LJJIJIIJIL = str2;
        c1494600ozqCreate.LJIJ = str3;
        c1494600ozqCreate.LJ = j;
        c1494600ozqCreate.LJFF = j;
        c1494600ozqCreate.LJI = j2;
        C1494570ozn c1494570ozn = c1494600ozqCreate.LIZLLL;
        C1494700p00 c1494700p00 = c1494570ozn.LJLILLLLZI.LIZ;
        c1494700p00.LJIIJJI = j2;
        c1494600ozqCreate.LJIIIZ = j5;
        c1494700p00.LJIL = j5;
        c1494570ozn.LJJIZ(j6);
        c1494600ozqCreate.LIZLLL.LJJJIL(j7);
        c1494600ozqCreate.LIZLLL.LJJJJI(j8);
        c1494600ozqCreate.LIZLLL.LJJJI(j9);
        c1494600ozqCreate.LIZLLL.LJJJJ(j11);
        c1494600ozqCreate.LIZLLL.LJJJ(j10);
        c1494600ozqCreate.LIZLLL.LJJJJIZL(j5 - j2);
        c1494600ozqCreate.LIZLLL.LJJJJJ(str4);
        c1494600ozqCreate.LJII = j3;
        c1494600ozqCreate.LJIIIIZZ = j4;
        c1494600ozqCreate.LJJI = z2;
        c1494600ozqCreate.LJIJJ = j12;
        c1494600ozqCreate.LJJIIZI = str5;
        c1494600ozqCreate.LJJIJ = str6;
        c1494600ozqCreate.LJJIFFI = 0;
        if (z) {
            C1494230ozF.LJIIJ(str, c1494600ozqCreate);
        } else {
            C1494230ozF.LJII(str, c1494600ozqCreate, Utils.tryConvertCronetException(Utils.createCronetException(i, i2, str7)));
        }
    }
}
