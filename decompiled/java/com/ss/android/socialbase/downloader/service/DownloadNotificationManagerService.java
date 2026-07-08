package com.ss.android.socialbase.downloader.service;

import X.C1B7N;
import X.C1B7O;
import X.C1B7P;
import X.C2199681B7e;
import X.C786410Ut5;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationService;

/* JADX INFO: loaded from: classes35.dex */
public class DownloadNotificationManagerService implements IDownloadNotificationManagerService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public void clearNotification() {
        SparseArray<C1B7P> sparseArrayClone;
        C1B7O c1b7oLIZ = C1B7O.LIZ();
        synchronized (c1b7oLIZ.LIZIZ) {
            try {
                sparseArrayClone = c1b7oLIZ.LIZIZ.clone();
                c1b7oLIZ.LIZIZ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (int i = 0; i < sparseArrayClone.size(); i++) {
            sparseArrayClone.get(sparseArrayClone.keyAt(i)).getClass();
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public SparseArray<C1B7P> getAllNotificationItems() {
        SparseArray<C1B7P> sparseArray;
        C1B7O c1b7oLIZ = C1B7O.LIZ();
        synchronized (c1b7oLIZ.LIZIZ) {
            try {
                sparseArray = c1b7oLIZ.LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return sparseArray;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public void addNotification(C1B7P c1b7p) {
        C1B7O c1b7oLIZ = C1B7O.LIZ();
        if (c1b7p == null) {
            c1b7oLIZ.getClass();
            return;
        }
        synchronized (c1b7oLIZ.LIZIZ) {
            try {
                c1b7oLIZ.LIZIZ.put(0, c1b7p);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public void cancel(int i) {
        C1B7O.LIZ().getClass();
        Context contextLJFF = C2199681B7e.LJFF();
        if (contextLJFF != null && i != 0) {
            try {
                Intent intent = new Intent(contextLJFF, (Class<?>) DownloadNotificationService.class);
                intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL");
                intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i);
                C786410Ut5.s3(contextLJFF, intent);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public void cancelNotification(int i) {
        C1B7O.LIZ().LIZIZ(i);
        if (i != 0) {
            C1B7N.LIZ().cancel(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public C1B7P getNotificationItem(int i) {
        C1B7P c1b7p;
        C1B7O c1b7oLIZ = C1B7O.LIZ();
        if (i == 0) {
            c1b7oLIZ.getClass();
            return null;
        }
        synchronized (c1b7oLIZ.LIZIZ) {
            try {
                c1b7p = c1b7oLIZ.LIZIZ.get(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1b7p;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public void hideNotification(int i) {
        C1B7O c1b7oLIZ = C1B7O.LIZ();
        c1b7oLIZ.getClass();
        DownloadInfo downloadInfo = Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C2199681B7e.LJFF()).getDownloadInfo(i);
        if (downloadInfo != null) {
            if (downloadInfo.isDownloadOverStatus()) {
                downloadInfo.setNotificationVisibility(3);
                Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C2199681B7e.LJFF()).updateDownloadInfo(downloadInfo);
            }
            if (downloadInfo.isDownloadOverStatus()) {
                int notificationVisibility = downloadInfo.getNotificationVisibility();
                if (notificationVisibility == 1 || notificationVisibility == 3) {
                    int id = downloadInfo.getId();
                    c1b7oLIZ.LIZIZ(id);
                    if (id != 0) {
                        C1B7N.LIZ().cancel(id);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public C1B7P removeNotification(int i) {
        return C1B7O.LIZ().LIZIZ(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public void notifyByService(int i, int i2, Notification notification) {
        C1B7O c1b7oLIZ = C1B7O.LIZ();
        c1b7oLIZ.getClass();
        Context contextLJFF = C2199681B7e.LJFF();
        if (contextLJFF != null && i != 0 && notification != null) {
            if (i2 == 4) {
                synchronized (c1b7oLIZ.LIZ) {
                    try {
                        Long l = c1b7oLIZ.LIZ.get(i);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (l != null && Math.abs(jCurrentTimeMillis - l.longValue()) < 1000) {
                            return;
                        } else {
                            c1b7oLIZ.LIZ.put(i, Long.valueOf(jCurrentTimeMillis));
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            try {
                Intent intent = new Intent(contextLJFF, (Class<?>) DownloadNotificationService.class);
                intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY");
                intent.putExtra("DOWNLOAD_NOTIFICATION_EXTRA_STATUS", i2);
                intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i);
                intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA", notification);
                C786410Ut5.s3(contextLJFF, intent);
            } catch (Throwable th) {
            }
        }
    }
}
