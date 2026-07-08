package com.ss.android.storage.cleaner;

import X.C13VI;
import X.C2427709fH;
import X.EnumC1335420kr6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FilesDuetStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return null;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return 0L;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) throws Throwable {
        File[] fileArrTempDuetFile;
        ICacheService iCacheServiceCacheConfig = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig();
        File[] fileArrRawDuetFile = null;
        try {
            fileArrTempDuetFile = iCacheServiceCacheConfig.tempDuetFile();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            fileArrTempDuetFile = null;
        }
        List<File> listLJIL = C2427709fH.LJIL(fileArrTempDuetFile, 0);
        try {
            fileArrRawDuetFile = iCacheServiceCacheConfig.rawDuetFile();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        long jLJII = C2427709fH.LJII(listLJIL) + C2427709fH.LJIIIIZZ(C2427709fH.LJIL(fileArrRawDuetFile, 0));
        if (z) {
            try {
                C2427709fH.LIZJ(0);
                return jLJII;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jLJII;
    }
}
