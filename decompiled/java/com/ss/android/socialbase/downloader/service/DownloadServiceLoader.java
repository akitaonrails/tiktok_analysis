package com.ss.android.socialbase.downloader.service;

import X.C1490830otl;
import X.C1B82;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.downloader.IDownloadServiceLoader;

/* JADX INFO: loaded from: classes35.dex */
public class DownloadServiceLoader implements IDownloadServiceLoader {
    public static boolean LIZ = false;

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceLoader
    public void load() {
        synchronized (C1B82.class) {
            try {
                if (LIZ) {
                    return;
                }
                LIZ = true;
                if (C1490830otl.LIZ()) {
                    C1490830otl.LIZIZ("DownloadServiceLoader", "load", "Load download service start");
                }
                C1B82.LIZIZ(IDownloadMonitorHelperService.class, new DownloadMonitorHelperService());
                C1B82.LIZIZ(IDownloadIdGeneratorService.class, new DownloadIdGeneratorService());
                C1B82.LIZIZ(IDownloadComponentManagerService.class, new DownloadComponentManagerService());
                C1B82.LIZIZ(IDownloadProcessDispatcherService.class, new DownloadProcessDispatcherService());
                C1B82.LIZIZ(IDownloadNetTrafficManagerService.class, new DownloadNetTrafficManagerService());
                C1B82.LIZIZ(IDownloadNotificationManagerService.class, new DownloadNotificationManagerService());
                C1B82.LIZIZ(IDownloadPreconnecterService.class, new DownloadPreconnecterService());
                C1B82.LIZIZ(IDownloadRetrySchedulerService.class, new DownloadRetrySchedulerService());
                C1B82.LIZIZ(IDownloadMultiProcService.class, new DownloadMultiProcService());
                C1B82.LIZLLL = true;
                if (C1490830otl.LIZ()) {
                    C1490830otl.LIZIZ("DownloadServiceLoader", "load", "Load download service end");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadServiceLoader
    public void defaultLoadCallback(boolean z, String str) {
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Load status:");
            sbLIZ.append(z);
            sbLIZ.append(" errorMsg:");
            sbLIZ.append(str);
            C1490830otl.LIZIZ("DownloadServiceLoader", "defaultLoadCallback", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
