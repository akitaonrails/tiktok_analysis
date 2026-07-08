package com.ss.android.ugc.aweme.ecommerce.search.sug.spi;

import X.C0QT8;
import X.C0QTY;
import X.C0QUT;
import X.C0QXC;
import X.C13LZ;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.EcSearchSugInputABModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes11.dex */
public final class EcomSearchServiceImpl implements IEcomSearchService {
    public C0QUT LIZ;

    @Override // com.ss.android.ugc.aweme.ecommerce.search.sug.spi.IEcomSearchService
    public final void LIZIZ() {
        if (C0QXC.LIZ().enable) {
            try {
                C0QUT c0qut = this.LIZ;
                C0QUT c0qut2 = C0QUT.RESULT;
                C0QT8.LIZLLL(c0qut, c0qut2);
                this.LIZ = c0qut2;
                C0QTY.LIZ.LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.sug.spi.IEcomSearchService
    public final void LIZ(String str) {
        if (!C0QXC.LIZ().enable) {
            return;
        }
        try {
            C0QTY.LIZ.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.sug.spi.IEcomSearchService
    public final void LIZLLL(long j) {
        long j2 = j;
        EcSearchSugInputABModel ecSearchSugInputABModelLIZ = C0QXC.LIZ();
        if (!ecSearchSugInputABModelLIZ.enable) {
            return;
        }
        long j3 = ecSearchSugInputABModelLIZ.durationMs;
        if (j2 <= 0) {
            if (j3 > 0) {
                j2 = j3;
            } else {
                j2 = 500;
            }
        }
        long jLJFF = C13LZ.LJFF(j2, 100L, Mp4ScreenVideoLoadTimeout.CONTROL);
        try {
            C0QUT c0qut = this.LIZ;
            C0QUT c0qut2 = C0QUT.SUG;
            C0QT8.LIZLLL(c0qut, c0qut2);
            this.LIZ = c0qut2;
            C0QTY.LIZ.LIZIZ();
            C0QTY.LIZJ(Long.valueOf(jLJFF));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyEnterSug, threshold=");
            sbLIZ.append(jLJFF);
            sbLIZ.append(", abDuration=");
            sbLIZ.append(j3);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.sug.spi.IEcomSearchService
    public final void LIZJ(int i, String str) {
        if (!C0QXC.LIZ().enable) {
            return;
        }
        try {
            C0QT8.LIZIZ(i, str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("logBack, input=");
            sbLIZ.append(str);
            sbLIZ.append(", rootEnterFromType=");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.sug.spi.IEcomSearchService
    public final void LJ(int i, String str) {
        if (!C0QXC.LIZ().enable) {
            return;
        }
        try {
            C0QT8.LIZJ(i, str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("logKeyboardConfirm, input=");
            sbLIZ.append(str);
            sbLIZ.append(", rootEnterFromType=");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
