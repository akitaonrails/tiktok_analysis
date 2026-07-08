package com.ss.android.socialbase.downloader.service;

import X.C1490820otk;
import X.C1490840otm;
import X.C1490880otq;
import X.C2199681B7e;
import X.InterfaceC2199991B8j;
import Y.ARunnableS34S0101000_23;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: loaded from: classes24.dex */
public class DownloadRetrySchedulerService implements IDownloadRetrySchedulerService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public void setRetryScheduleHandler(InterfaceC2199991B8j interfaceC2199991B8j) {
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public void scheduleRetryWhenHasTaskConnected() {
        C1490840otm.LIZJ().LJI(5, false);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public void scheduleRetryWhenHasTaskSucceed() {
        C1490840otm.LIZJ().LJI(2, true);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public void doSchedulerRetry(int i) {
        C1490840otm c1490840otmLIZJ = C1490840otm.LIZJ();
        c1490840otmLIZJ.getClass();
        C2199681B7e.LJI().execute(new ARunnableS34S0101000_23(c1490840otmLIZJ, i, 15));
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public void tryCancelScheduleRetry(int i) {
        C1490840otm c1490840otmLIZJ = C1490840otm.LIZJ();
        synchronized (c1490840otmLIZJ.LLILLL) {
            try {
                C1490820otk c1490820otk = c1490840otmLIZJ.LLILLL.get(i);
                if (c1490820otk == null) {
                    return;
                }
                if (c1490820otk.LJIIJJI) {
                    c1490820otk.LJIIJJI = false;
                    int i2 = c1490840otmLIZJ.LLILZLL - 1;
                    c1490840otmLIZJ.LLILZLL = i2;
                    if (i2 < 0) {
                        c1490840otmLIZJ.LLILZLL = 0;
                    }
                }
                if (!c1490820otk.LJFF) {
                    c1490840otmLIZJ.LLILLJJLI.removeMessages(i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public void tryStartScheduleRetry(DownloadInfo downloadInfo) {
        boolean z;
        C1490840otm c1490840otmLIZJ = C1490840otm.LIZJ();
        c1490840otmLIZJ.getClass();
        if (downloadInfo != null) {
            String str = C1490880otq.LIZ;
            if (!TextUtils.isEmpty("") && "".equals(downloadInfo.getMimeType())) {
                if (!downloadInfo.isOnlyWifi() && !downloadInfo.isPauseReserveOnWifi()) {
                    z = false;
                } else {
                    z = true;
                }
                c1490840otmLIZJ.LJII(downloadInfo, z, c1490840otmLIZJ.LIZLLL());
            }
        }
    }
}
