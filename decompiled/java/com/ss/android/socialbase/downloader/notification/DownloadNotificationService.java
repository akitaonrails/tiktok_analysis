package com.ss.android.socialbase.downloader.notification;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1285950jZJ;
import X.C1490830otl;
import X.C1B7M;
import X.C1B7N;
import X.C1B7P;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2199681B7e;
import X.C2199751B7l;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import X.InterfaceC2199641B7a;
import Y.ARunnableS36S1200000_34;
import Y.ARunnableS38S0201000_34;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes35.dex */
public class DownloadNotificationService extends Service {
    public static volatile long LLIZ;
    public static volatile long LLIZLLLIL;
    public static boolean LLJ;
    public C1285950jZJ LL;
    public final SparseArray<Notification> LLILLJJLI = new SparseArray<>(2);
    public static int LLILLL = -1;
    public static int LLILZ = -1;
    public static boolean LLILZIL = true;
    public static boolean LLILZLL = false;
    public static long LLJI = 1000;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/socialbase/downloader/notification/DownloadNotificationService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisofTN91YUCwRBXGmML33HyHQIpfp51rAsbs79K/icgE9Ks2TVlRW9R1M=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (this.LL == null) {
            C1285950jZJ c1285950jZJ = new C1285950jZJ();
            this.LL = c1285950jZJ;
            c1285950jZJ.LIZJ.start();
        }
        C2199681B7e.LJJIFFI(this);
        C2199751B7l c2199751B7l = C2199751B7l.LJFF;
        int iLJIIIIZZ = c2199751B7l.LJIIIIZZ("download_service_foreground", 0);
        if ((iLJIIIIZZ == 1 || iLJIIIIZZ == 3) && LLILLL == -1) {
            LLILLL = 0;
        }
        if ((iLJIIIIZZ == 2 || iLJIIIIZZ == 3) && LLILZ == -1) {
            LLILZ = 0;
        }
        LLILZLL = c2199751B7l.LJI("non_going_notification_foreground", false);
        LLJ = c2199751B7l.LJI("notify_too_fast", true);
        long jLJIIJ = c2199751B7l.LJIIJ("notification_time_window", 1000L);
        LLJI = jLJIIJ;
        if (jLJIIJ < 0 || jLJIIJ > 1200) {
            LLJI = 1000L;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C1285950jZJ c1285950jZJ = this.LL;
        if (c1285950jZJ != null) {
            try {
                c1285950jZJ.LIZJ.quit();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            this.LL = null;
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    public static void LIZ(NotificationManager notificationManager, int i) {
        boolean z;
        int i2 = LLILLL;
        if (i2 != i && LLILZ != i) {
            try {
                notificationManager.cancel(i);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        if (i2 == i) {
            LLILLL = 0;
            z = false;
        } else {
            LLILZ = 0;
            z = true;
        }
        try {
            InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
            if (!interfaceC2199641B7aLIZIZ.LJJIJIL()) {
                LLILZIL = false;
                if (C1490830otl.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Yry to stopForeground when is not Foreground, id = ");
                    sbLIZ.append(i);
                    sbLIZ.append(", isIndependentProcess = ");
                    sbLIZ.append(z);
                    C1490830otl.LIZIZ("DownloadNotificationService", "doCancel", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            if (C1490830otl.LIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("StopForeground id = ");
                sbLIZ2.append(i);
                sbLIZ2.append(", isIndependentProcess = ");
                sbLIZ2.append(z);
                C1490830otl.LIZIZ("DownloadNotificationService", "doCancel", C2188811AlT.LIZIZ(sbLIZ2));
            }
            interfaceC2199641B7aLIZIZ.LJJIIZ(true);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        try {
            notificationManager.cancel(i);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        if (!LLILZIL) {
            return;
        }
        try {
            SparseArray<C1B7P> allNotificationItems = C1B7N.LIZ().getAllNotificationItems();
            if (allNotificationItems != null) {
                for (int size = allNotificationItems.size() - 1; size >= 0; size--) {
                    allNotificationItems.valueAt(size);
                }
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4 A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:29:0x0044, B:31:0x004e, B:33:0x0054, B:35:0x0059, B:41:0x0072, B:43:0x0078, B:45:0x007e, B:47:0x009b, B:49:0x00a0, B:48:0x009e, B:50:0x00a4, B:52:0x00aa, B:36:0x0066), top: B:65:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #1 {all -> 0x00be, blocks: (B:29:0x0044, B:31:0x004e, B:33:0x0054, B:35:0x0059, B:41:0x0072, B:43:0x0078, B:45:0x007e, B:47:0x009b, B:49:0x00a0, B:48:0x009e, B:50:0x00a4, B:52:0x00aa, B:36:0x0066), top: B:65:0x0044 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.app.NotificationManager r6, int r7, android.app.Notification r8) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LIZJ(android.app.NotificationManager, int, android.app.Notification):void");
    }

    public final void LIZIZ(NotificationManager notificationManager, int i, Notification notification) {
        synchronized (this.LLILLJJLI) {
            try {
                int iIndexOfKey = this.LLILLJJLI.indexOfKey(i);
                if (iIndexOfKey >= 0 && iIndexOfKey < this.LLILLJJLI.size()) {
                    this.LLILLJJLI.setValueAt(iIndexOfKey, notification);
                    return;
                }
                long jCurrentTimeMillis = LLJI - (System.currentTimeMillis() - LLIZ);
                if (jCurrentTimeMillis <= 0) {
                    jCurrentTimeMillis = 0;
                } else if (jCurrentTimeMillis > 20000) {
                    jCurrentTimeMillis = 20000;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() + jCurrentTimeMillis;
                LLIZLLLIL = jCurrentTimeMillis2;
                LLIZ = jCurrentTimeMillis2;
                if (jCurrentTimeMillis <= 0) {
                    LIZJ(notificationManager, i, notification);
                    return;
                }
                if (this.LL == null) {
                    return;
                }
                synchronized (this.LLILLJJLI) {
                    try {
                        this.LLILLJJLI.put(i, notification);
                    } finally {
                    }
                }
                this.LL.LIZ(new ARunnableS38S0201000_34(this, notificationManager, i, 0), jCurrentTimeMillis);
            } finally {
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C1285950jZJ c1285950jZJ;
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action) && (c1285950jZJ = this.LL) != null) {
                c1285950jZJ.LIZ(new ARunnableS36S1200000_34(this, action, intent, 6), 0L);
                return 2;
            }
            return 2;
        }
        return 2;
    }
}
