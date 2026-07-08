package com.ss.android.socialbase.downloader.service;

import X.C1490830otl;
import X.C1490880otq;
import X.C1B5Y;
import X.C1B5Z;
import X.C1B73;
import X.C1B75;
import X.C1B7J;
import X.C1B7L;
import X.C1B84;
import X.C2199661B7c;
import X.C2199681B7e;
import X.C2199981B8i;
import X.C786410Ut5;
import X.InterfaceC1490850otn;
import X.InterfaceC1498840p6g;
import X.InterfaceC2199141B5c;
import X.InterfaceC2199461B6i;
import X.InterfaceC2200061B8q;
import X.InterfaceC2200071B8r;
import X.InterfaceC2200081B8s;
import Y.ARunnableS12S1100000_7;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadNetworkHandler;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class DownloadComponentManagerService implements IDownloadComponentManagerService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public InterfaceC2199461B6i getDownloadInterceptor() {
        Context context = C2199681B7e.LIZ;
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public JSONObject getDownloadSetting() {
        return (C2199681B7e.LJJI == null || C2199681B7e.LJJI.get() == null) ? C1490880otq.LIZIZ : C2199681B7e.LJJI.get();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public InterfaceC1490850otn getReserveWifiStatusListener() {
        Context context = C2199681B7e.LIZ;
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void unRegisterDownloadReceiver() {
        Context context = C2199681B7e.LIZ;
        synchronized (C2199681B7e.class) {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (C2199681B7e.LJJIJ && C2199681B7e.LJIJJLI != null && C2199681B7e.LIZ != null) {
                C786410Ut5.LJJIFFI(C2199681B7e.LIZ, C2199681B7e.LJIJJLI);
                C2199681B7e.LJJIJ = false;
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void clearSqlDownloadCacheData() {
        C1B5Y c1b5y;
        try {
            InterfaceC2199141B5c interfaceC2199141B5cLJIIJJI = C2199681B7e.LJIIJJI();
            if (interfaceC2199141B5cLJIIJJI == null || !(interfaceC2199141B5cLJIIJJI instanceof C1B5Z) || (c1b5y = ((C1B5Z) interfaceC2199141B5cLJIIJJI).LLILLJJLI) == null) {
                return;
            }
            c1b5y.clearData();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public Context getAppContext() {
        return C2199681B7e.LJFF();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public InterfaceC1498840p6g getTTNetHandler() {
        return C2199681B7e.LJIJJLI();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void initDownloadCacheImmediately() {
        C2199681B7e.LJIIJJI().LLLIIL();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public boolean isInit() {
        return C2199681B7e.LJJJJIZL;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setDownloadInMultiProcess() {
        C2199681B7e.LJJIIJ();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void clearMemoryCacheData(final double d) {
        C2199681B7e.LJJIJ(new Runnable() { // from class: X.13qg
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DownloadComponentManagerService@efc6.clearMemoryCacheData$1");
                try {
                    C2199681B7e.LJIIJJI().clearMemoryCacheData(d);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DownloadComponentManagerService@efc6.clearMemoryCacheData$1");
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void coverComponent(C1B84 c1b84) {
        Context context = C2199681B7e.LIZ;
        synchronized (C2199681B7e.class) {
            C2199681B7e.LJJII(c1b84);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void initComponent(C1B84 c1b84) {
        final boolean z;
        Context context = C2199681B7e.LIZ;
        synchronized (C2199681B7e.class) {
            if (C2199681B7e.LJJJJIZL) {
                C1490830otl.LIZJ("DownloadComponentManager", "initComponent", "Component has init");
                return;
            }
            boolean z2 = C2199681B7e.LJJII;
            C2199681B7e.LJJII(c1b84);
            if (C2199681B7e.LIZIZ == null) {
                C2199681B7e.LIZIZ = new C1B5Z();
            }
            if (C2199681B7e.LIZLLL == null) {
                C2199681B7e.LIZLLL = new C1B75();
            }
            if (C2199681B7e.LJ == null && C2199681B7e.LJFF != null) {
                ((C1B7L) C2199681B7e.LJFF).getClass();
                C2199681B7e.LJ = new C1B73();
            }
            if (C2199681B7e.LIZJ == null) {
                C2199681B7e.LIZJ = new C1B7J();
            }
            if (C2199681B7e.LJIL == null) {
                C2199681B7e.LJIL = new C2199981B8i();
            }
            int i = C2199681B7e.LJJIJIIJI;
            if (i <= 0 || i > C2199681B7e.LJJIJIIJIL) {
                C2199681B7e.LJJIJIIJI = C2199681B7e.LJJIJIIJIL;
            }
            if (C2199681B7e.LJJII && !z2 && !C2199661B7c.LJIIL()) {
                z = true;
            } else {
                z = false;
            }
            C2199681B7e.LJJIJ(new Runnable() { // from class: X.13qZ
                /* JADX WARN: Type inference failed for: r0v8, types: [X.0otu] */
                public final void LIZ() {
                    if (z) {
                        C1B7E.LIZ(true).LIZ();
                    }
                    synchronized (C2199681B7e.class) {
                        if (C2199681B7e.LJIJJLI == null) {
                            C2199681B7e.LJIJJLI = new BroadcastReceiver() { // from class: X.0otu
                                public static final String LIZ = C1490920otu.class.getSimpleName();

                                public static void LIZ(Context context2, Intent intent) {
                                    if (context2 != null && intent != null) {
                                        String action = intent.getAction();
                                        if (TextUtils.isEmpty(action)) {
                                            return;
                                        }
                                        if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                                            if (C1490830otl.LIZ()) {
                                                C1490830otl.LIZIZ(LIZ, "onReceive", "Action:android.net.conn.CONNECTIVITY_CHANGE");
                                            }
                                            if (C2199681B7e.LJJJIL) {
                                                long j = 2000;
                                                long jLJIIJ = C2199751B7l.LJFF.LJIIJ("delay_refresh_unsuccess_task_ms", 2000L);
                                                if (jLJIIJ > 0) {
                                                    j = jLJIIJ;
                                                }
                                                C2199681B7e.LJJIJIIJI(new ARunnableS12S1100000_7(context2, action, 8), j, TimeUnit.MILLISECONDS);
                                                return;
                                            }
                                            return;
                                        }
                                        if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                                            C2199681B7e.LJJIIZ(new ARunnableS12S1100000_7(context2, action, 9));
                                        }
                                    }
                                }

                                @Override // android.content.BroadcastReceiver
                                public final void onReceive(Context context2, Intent intent) {
                                    boolean zLJI = MethodIDManager.LJI(71805);
                                    if (!C2214201BlK.LJIIJJI && intent != null) {
                                        if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                                            C2188191AkT.LIZIZ();
                                        }
                                    }
                                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                                        LIZ(context2, intent);
                                    } else {
                                        C2408409cA.LIZ();
                                        LIZ(context2, intent);
                                    }
                                    if (zLJI) {
                                        MethodIDManager.LJ();
                                    }
                                }
                            };
                        }
                        if (!C2199681B7e.LJJIJ) {
                            try {
                                IntentFilter intentFilter = new IntentFilter();
                                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                                C786410Ut5.LJIJJ(C2199681B7e.LIZ, C2199681B7e.LJIJJLI, intentFilter);
                                C2199681B7e.LJJIJ = true;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                    Context contextLJFF = C2199681B7e.LJFF();
                    if (contextLJFF != null) {
                        C2199671B7d.LJIIJ(contextLJFF);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DownloadComponentManager@154a.registerAsync$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DownloadComponentManager@154a.registerAsync$1");
                }
            });
            if (TextUtils.isEmpty(C1490880otq.LIZ)) {
                C1490880otq.LIZ = "oppo";
                C1490880otq.LIZ.toUpperCase();
                String str = C1490880otq.LIZ;
            }
            C2199681B7e.LJJJJIZL = true;
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setAppContext(Context context) {
        C2199681B7e.LJJIFFI(context);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setDownloadDBListener(InterfaceC2200071B8r interfaceC2200071B8r) {
        Context context = C2199681B7e.LIZ;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setDownloadMemoryInfoListener(InterfaceC2200081B8s interfaceC2200081B8s) {
        Context context = C2199681B7e.LIZ;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setDownloadNetworkHandler(IDownloadNetworkHandler iDownloadNetworkHandler) {
        C2199681B7e.LJJIIZI = iDownloadNetworkHandler;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setDownloadThreadCheckListener(InterfaceC2200061B8q interfaceC2200061B8q) {
        Context context = C2199681B7e.LIZ;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void setReserveWifiStatusListener(InterfaceC1490850otn interfaceC1490850otn) {
        Context context = C2199681B7e.LIZ;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void submitSingleTask(Runnable runnable) {
        C2199681B7e.LJJIJIIJIL(runnable);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
    public void updateDownloadInfo(DownloadInfo downloadInfo) {
        C2199661B7c.LIZLLL("updateDownloadInfo");
        try {
            C2199681B7e.LJIIJJI().updateDownloadInfo(downloadInfo);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
