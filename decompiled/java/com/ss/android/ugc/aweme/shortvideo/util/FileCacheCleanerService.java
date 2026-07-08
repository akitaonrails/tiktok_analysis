package com.ss.android.ugc.aweme.shortvideo.util;

import X.AbstractC1387200mCc;
import X.C04TD;
import X.C07GX;
import X.C0VSJ;
import X.C1336210ksN;
import X.C1906580ziK;
import X.C2188811AlT;
import X.C2259808tI;
import X.C2427009fA;
import X.C2427709fH;
import X.C786410Ut5;
import X.InterfaceC1603190roz;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.storage.IFileCacheCleanerService;
import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class FileCacheCleanerService implements IFileCacheCleanerService {
    public static IFileCacheCleanerService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IFileCacheCleanerService.class, false);
        if (objLIZ != null) {
            return (IFileCacheCleanerService) objLIZ;
        }
        if (C04TD.m5 == null) {
            synchronized (IFileCacheCleanerService.class) {
                if (C04TD.m5 == null) {
                    C04TD.m5 = new FileCacheCleanerService();
                }
            }
        }
        return C04TD.m5;
    }

    @Override // com.ss.android.ugc.aweme.base.storage.IFileCacheCleanerService
    public final boolean LIZ() {
        if (!C1336210ksN.LIZ() && !((Boolean) C07GX.LIZJ.getValue()).booleanValue()) {
            return C1906580ziK.LIZIZ() == null;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        Object obj = abstractC1387200mCcLJ != null ? abstractC1387200mCcLJ.LIZ : null;
        return (obj instanceof InterfaceC1603190roz) && obj != null;
    }

    @Override // com.ss.android.ugc.aweme.base.storage.IFileCacheCleanerService
    public final Set<String> LIZIZ() {
        return C2427709fH.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.base.storage.IFileCacheCleanerService
    public final void LIZJ(Context context) throws Throwable {
        C2427709fH.LIZ = false;
        if (context != null && !C2427709fH.LIZ) {
            C2427709fH.LIZ = true;
            C2427709fH.LIZLLL(2, context);
            C2427709fH.LIZJ(2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearDrafts ");
            sbLIZ.append(2);
            C2188811AlT.LIZIZ(sbLIZ);
            C2427709fH.LJFF(C2427709fH.LJIIIZ(2, context));
            C2427709fH.LIZIZ(2, context);
            try {
                File fileLJI = C2427709fH.LJI(context);
                try {
                    File fileY2 = C786410Ut5.y2(context, "logs");
                    if (fileY2 != null && fileY2.exists() && !TextUtils.equals(fileY2.getAbsolutePath(), fileLJI.getAbsolutePath())) {
                        C2259808tI.LIZJ(fileY2);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C0VSJ c0vsj = new C0VSJ(C2427709fH.LIZ(context), "logs");
                if (c0vsj.exists() && !TextUtils.equals(c0vsj.getAbsolutePath(), fileLJI.getAbsolutePath())) {
                    C2259808tI.LIZJ(c0vsj);
                }
                File fileLJIIJ = C2427009fA.LJIIJ(context);
                if (fileLJIIJ != null) {
                    C0VSJ c0vsj2 = new C0VSJ(fileLJIIJ, "logs");
                    if (c0vsj2.exists() && !TextUtils.equals(c0vsj2.getAbsolutePath(), fileLJI.getAbsolutePath())) {
                        C2259808tI.LIZJ(c0vsj2);
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C0VSJ c0vsj3 = new C0VSJ(C2427709fH.LJIILJJIL(), "fresco_cache");
            C0VSJ c0vsj4 = new C0VSJ(C786410Ut5.x2(context), "picture/fresco_cache");
            if (c0vsj4.exists() && !TextUtils.equals(c0vsj4.getAbsolutePath(), c0vsj3.getAbsolutePath())) {
                C2259808tI.LIZJ(c0vsj4);
            }
            C0VSJ c0vsj5 = new C0VSJ(C786410Ut5.w2(context), "picture/fresco_cache");
            if (c0vsj5.exists() && !TextUtils.equals(c0vsj5.getAbsolutePath(), c0vsj3.getAbsolutePath())) {
                C2259808tI.LIZJ(c0vsj5);
            }
            File fileLJIIIZ = C2427009fA.LJIIIZ(context);
            if (fileLJIIIZ != null) {
                C0VSJ c0vsj6 = new C0VSJ(fileLJIIIZ, "picture/fresco_cache");
                if (c0vsj6.exists() && !TextUtils.equals(c0vsj6.getAbsolutePath(), c0vsj3.getAbsolutePath())) {
                    C2259808tI.LIZJ(c0vsj6);
                }
            }
            C2427709fH.LIZ = false;
        }
    }
}
