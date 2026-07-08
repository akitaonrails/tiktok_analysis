package com.ss.android.ugc.aweme.homepage;

import X.C04TW;
import X.C0BFP;
import X.C0C3V;
import X.C0CCZ;
import X.C0CN5;
import X.C0CPH;
import X.C0VZ0;
import X.C0WZX;
import X.C1224204qe;
import X.C1336205Ku;
import X.C1336580ksy;
import X.C1483410ohn;
import X.C1484670ojp;
import X.C1590810rV1;
import X.C1701330uNH;
import X.C1768270w7F;
import X.C1768280w7G;
import X.C20684815ws;
import X.C2188561Al4;
import X.C2204961BRm;
import X.C2217891BrH;
import X.C2344009Gk;
import X.C2367709Pn;
import X.C2554709zl;
import X.C476250Ilz;
import X.C755980Tl6;
import X.C786410Ut5;
import X.C786550UtJ;
import X.C799900VZk;
import X.C823050WQl;
import X.EnumC21267218Ko;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1570710qyb;
import X.RunnableC823120WQs;
import Y.ARunnableS88S0200000_19;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.webkit.CookieSyncManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public abstract class TiktokBaseMainHelper implements InterfaceC1570710qyb {
    public static int LIZLLL;
    public final Activity LIZ;
    public long LIZIZ;
    public long LIZJ;

    /* JADX INFO: loaded from: classes21.dex */
    public static final class AppStartJobTask implements C0CCZ {
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "TiktokBaseMainHelper$AppStartJobTask";
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ boolean meetTrigger() {
            return true;
        }

        @Override // X.C0CCZ
        public final /* synthetic */ boolean serialExecute() {
            return false;
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ int targetProcess() {
            return C0VZ0.LIZ();
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ EnumC799980VZs triggerType() {
            return C0VZ0.LIZIZ(this);
        }

        @Override // X.C0CCZ
        public final EnumC799870VZh type() {
            return C0BFP.LIZ != -1 ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.BOOT_FINISH;
        }

        public static void LIZ(Context context) {
            final C1336580ksy c1336580ksy = new C1336580ksy(C786410Ut5.N3(context));
            if (!C1336580ksy.LJIIIIZZ && C1336580ksy.LIZIZ() >= 62914560) {
                C2217891BrH.LLJI.LL = System.currentTimeMillis();
                C1336580ksy.LJIIIIZZ = true;
                new RunnableC823120WQs() { // from class: X.0kt2
                    public final void LIZJ() {
                        Process.setThreadPriority(10);
                        System.currentTimeMillis();
                        try {
                            System.currentTimeMillis();
                            c1336580ksy.getClass();
                            try {
                                C2112608Pk.LIZIZ(C1336580ksy.LJ);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (C1336580ksy.LIZIZ() > 20971520) {
                                long jLIZ = C1336580ksy.LIZ(20971520L, C1336580ksy.LIZLLL);
                                if (jLIZ < 20971520) {
                                    C1336580ksy.LIZ(20971520 - jLIZ, C1336580ksy.LJFF);
                                }
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        System.currentTimeMillis();
                        C1336580ksy.LJIIIIZZ = false;
                        try {
                            C2217891BrH.LLJI.LIZ(c1336580ksy);
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                    }

                    @Override // X.RunnableC823120WQs, java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("BaseImageManager@ed5c.tryEvictAboveSize$1");
                        try {
                            LIZJ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("BaseImageManager@ed5c.tryEvictAboveSize$1");
                    }

                    {
                        super((Object) null);
                    }
                }.LIZ();
            }
            if (!C1336580ksy.LJIIIIZZ) {
                C2217891BrH c2217891BrH = C2217891BrH.LLJI;
                long j = c2217891BrH.LL;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - j < 86400000) {
                    try {
                        c2217891BrH.LIZ(c1336580ksy);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else {
                    c2217891BrH.LL = jCurrentTimeMillis;
                    C1336580ksy.LJIIIIZZ = true;
                    new RunnableC823120WQs() { // from class: X.0kt1
                        public final void LIZJ() {
                            Process.setThreadPriority(10);
                            System.currentTimeMillis();
                            try {
                                Thread.sleep(10000L);
                                System.currentTimeMillis();
                                C1336580ksy c1336580ksy2 = c1336580ksy;
                                int i = c1336580ksy2.LIZ;
                                int i2 = c1336580ksy2.LIZIZ;
                                try {
                                    C2112608Pk.LIZIZ(C1336580ksy.LJ);
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                                C1336580ksy.LIZJ(i, new C0VSJ(C1336580ksy.LIZLLL));
                                if (!C2093608Ic.LJ(C1336580ksy.LJFF)) {
                                    C1336580ksy.LIZJ(i2, new C0VSJ(C1336580ksy.LJFF));
                                }
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                            System.currentTimeMillis();
                            C1336580ksy.LJIIIIZZ = false;
                            try {
                                C2217891BrH.LLJI.LIZ(c1336580ksy);
                            } catch (Exception e4) {
                                TryCatchGuardChecker.doCheck(e4);
                            }
                        }

                        @Override // X.RunnableC823120WQs, java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("BaseImageManager@ed5c.tryClearCache$3");
                            try {
                                LIZJ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("BaseImageManager@ed5c.tryClearCache$3");
                        }

                        {
                            super((Object) null);
                        }
                    }.LIZ();
                }
            }
            C1336205Ku.LIZ(false);
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            long j = C0BFP.LIZ;
            if (j != -1) {
                C0CN5.LIZIZ(Long.valueOf(j), new ARunnableS88S0200000_19(this, context, 15));
            } else {
                LIZ(context);
            }
        }
    }

    @Override // X.InterfaceC1570710qyb
    public final void LIZJ() {
        Activity activity = this.LIZ;
        long j = this.LIZJ;
        if (activity != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_method", C1590810rV1.LIZIZ(activity));
            c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
            c2344009Gk.LIZLLL(j, "gap_time");
            c2344009Gk.LJIIIIZZ("is_quite", "1");
            C20684815ws.LJIILLIIL("click_back_quit", c2344009Gk.LIZ);
        }
        boolean z = !((Boolean) C0C3V.LIZLLL.getValue()).booleanValue() || LIZLLL > 0;
        if (((Boolean) C0C3V.LIZJ.getValue()).booleanValue() && z) {
            boolean zMoveTaskToBack = this.LIZ.moveTaskToBack(true);
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LIZJ(zMoveTaskToBack ? 1 : 0, "is_success");
            C20684815ws.LJIILLIIL("tt_fake_quit", c2344009Gk2.LIZ);
            if (zMoveTaskToBack) {
                return;
            }
            LJ();
            return;
        }
        if (((Boolean) C0C3V.LIZIZ.getValue()).booleanValue() && z) {
            LJ();
            return;
        }
        LIZLLL++;
        try {
            CookieSyncManager.getInstance().sync();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C04TW.LIZIZ.LIZ();
        ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJJ();
        C1483410ohn.LJLJJI().release();
        C755980Tl6.LIZ().LIZJ();
        C1484670ojp.LIZ.release();
        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).clearCache();
        IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
        if (iECommerceMallService != null) {
            iECommerceMallService.LIZJ();
        }
        try {
            float fFloatValue = ((Number) C2554709zl.LIZ.getValue()).floatValue();
            if (fFloatValue > 0.0f && (fFloatValue >= 1.0f || C2367709Pn.LIZJ() > fFloatValue)) {
                C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
                C1768280w7G c1768280w7G = new C1768280w7G();
                c1768280w7G.LIZJ = EnumC21267218Ko.GLOBAL_APP_QUIT;
                c2188561Al4.LJ(new C1768270w7F(c1768280w7G));
            }
            if (C1224204qe.LIZ()) {
                if (((Boolean) C1224204qe.LIZJ.getValue()).booleanValue()) {
                    C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0Utn
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("MainHelper@80f1.onAppQuit$1");
                            try {
                                C786550UtJ.LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("MainHelper@80f1.onAppQuit$1");
                        }
                    });
                } else {
                    C786550UtJ.LIZ();
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        this.LIZ.finish();
    }

    public final void LJ() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        Activity activity = this.LIZ;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOKnbpre3TXNp3hvyh4nskl0Kcv79xRSl+P07TuW", null));
    }

    @Override // X.InterfaceC1570710qyb
    public final void onCreate() {
        C799900VZk.LIZ.getClass();
        C0CPH c0cph = new C0CPH();
        c0cph.LIZ(new AppStartJobTask());
        c0cph.LIZIZ();
    }

    public TiktokBaseMainHelper(Activity activity) {
        this.LIZ = activity;
        new BPEAHandler();
        C786410Ut5.F2(activity, "notification");
    }
}
