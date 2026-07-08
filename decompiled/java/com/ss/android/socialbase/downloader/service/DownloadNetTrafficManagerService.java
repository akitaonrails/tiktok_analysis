package com.ss.android.socialbase.downloader.service;

import X.C1B96;
import X.C1B97;
import X.C1B99;
import X.C1B9A;
import X.InterfaceC2200011B8l;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes35.dex */
public class DownloadNetTrafficManagerService implements IDownloadNetTrafficManagerService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public C1B97 getCurrentNetworkQuality() {
        return C1B9A.LIZ.LIZ();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public double getDownloadKBitsPerSecond() {
        double d;
        C1B96 c1b96 = C1B9A.LIZ;
        synchronized (c1b96) {
            C1B99 c1b99 = c1b96.LIZ;
            d = c1b99 == null ? -1.0d : c1b99.LIZJ;
        }
        return d;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public void reset() {
        C1B96 c1b96 = C1B9A.LIZ;
        c1b96.getClass();
        try {
            C1B99 c1b99 = c1b96.LIZ;
            if (c1b99 != null) {
                c1b99.LIZJ = -1.0d;
                c1b99.LIZLLL = 0;
            }
            c1b96.LIZJ.set(C1B97.UNKNOWN);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public C1B97 register(InterfaceC2200011B8l interfaceC2200011B8l) {
        C1B96 c1b96 = C1B9A.LIZ;
        if (interfaceC2200011B8l != null) {
            ((CopyOnWriteArrayList) c1b96.LJ).add(interfaceC2200011B8l);
        }
        return c1b96.LIZJ.get();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    public void remove(InterfaceC2200011B8l interfaceC2200011B8l) {
        C1B96 c1b96 = C1B9A.LIZ;
        if (interfaceC2200011B8l != null) {
            ((CopyOnWriteArrayList) c1b96.LJ).remove(interfaceC2200011B8l);
        } else {
            c1b96.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #1 {all -> 0x00d4, blocks: (B:37:0x00b2, B:39:0x00bc), top: B:59:0x00b2, outer: #0 }] */
    @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addBandwidth(long r12, long r14) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.service.DownloadNetTrafficManagerService.addBandwidth(long, long):void");
    }
}
