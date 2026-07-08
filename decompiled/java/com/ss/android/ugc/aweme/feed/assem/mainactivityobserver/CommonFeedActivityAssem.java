package com.ss.android.ugc.aweme.feed.assem.mainactivityobserver;

import X.C01GW;
import X.C0NET;
import X.C0QSJ;
import X.C0SR4;
import X.C1150504el;
import X.C1399670mWj;
import X.C1399680mWk;
import X.C13LE;
import X.C1563720qnK;
import X.C2217381BqS;
import X.C2426709f7;
import X.C452501pT;
import X.C487580JAe;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C810560Vqw;
import X.C823050WQl;
import X.InterfaceC1146704e9;
import X.InterfaceC1399350mWD;
import X.InterfaceC2217461Bqa;
import X.InterfaceC655270Pn3;
import X.InterfaceC665370Q7z;
import android.os.SystemClock;
import android.view.KeyEvent;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.count.IFeedPlayNumService;
import com.ss.android.ugc.aweme.feed.Feed0VVManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.aweme.localservice.service.PoiFeedPlayNumServiceImpl;
import com.ss.android.ugc.aweme.main.IPerformanceAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes25.dex */
public final class CommonFeedActivityAssem extends BaseMainContainerAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C01GW LL = C452501pT.LIZIZ(new C1399680mWk(this));
    public final C1399670mWj LLILLJJLI = new InterfaceC1399350mWD() { // from class: X.0mWj
        @Override // X.InterfaceC1399350mWD
        public final /* synthetic */ boolean Fi() {
            return false;
        }

        @Override // X.InterfaceC1399350mWD
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            C1399710mWn.LIZIZ.LIZ(Integer.valueOf(i), keyEvent, C724240Sb0.LIZ(this.LL));
            return false;
        }
    };
    public volatile IPerformanceAbility LLILLL;
    public InterfaceC665370Q7z LLILZ;
    public C0QSJ LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommonFeedActivityAssem.class, "performanceAbility", "getPerformanceAbility()Lcom/ss/android/ugc/aweme/main/IPerformanceAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"CommonFeedActivityAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        if (Feed0VVManager.LIZLLL != -1) {
            Feed0VVManager.LJ = SystemClock.elapsedRealtime() - Feed0VVManager.LIZLLL;
            Feed0VVManager.LIZLLL = -1L;
            Queue<Runnable> queue = Feed0VVManager.LJII;
            if (queue != null) {
                Iterator it2 = ((LinkedBlockingQueue) queue).iterator();
                while (it2.hasNext()) {
                    C810560Vqw.LJ((Runnable) it2.next());
                }
                ((LinkedBlockingQueue) Feed0VVManager.LJII).clear();
                Feed0VVManager.LJII = null;
            }
        }
        ((InterfaceC655270Pn3) C487580JAe.LIZJ(C724240Sb0.LJI(this))).registerActivityOnKeyDownListener(this.LLILLJJLI);
        C1150504el.LIZ().LJI(strJ4, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            r6 = this;
            java.lang.String r2 = "main_act_assem_lifecycle_%s_%s"
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "CommonFeedActivityAssem"
            r4 = 0
            r1[r4] = r0
            java.lang.String r0 = "onCreate"
            r5 = 1
            r1[r5] = r0
            java.lang.String r3 = X.C786410Ut5.j4(r2, r1)
            X.145x r0 = X.C1150504el.LIZ()
            r0.LIZLLL(r3, r4)
            super.onCreate()
            boolean r0 = X.C296200BjG.LIZ()
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.main.IPerformanceAbility r1 = r6.LLILLL
            if (r1 != 0) goto L73
            monitor-enter(r6)
            com.ss.android.ugc.aweme.main.IPerformanceAbility r1 = r6.LLILLL     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L62
            X.0QSJ r1 = r6.LLILZIL     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L4a
            X.0Q7z r2 = r6.LLILZ     // Catch: java.lang.Throwable -> L64
            if (r2 != 0) goto L3a
            X.0Q7z r2 = X.C687700QyG.LJIIIZ(r6)     // Catch: java.lang.Throwable -> L64
            r6.LLILZ = r2     // Catch: java.lang.Throwable -> L64
        L3a:
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L64
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r0 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r1[r4] = r0     // Catch: java.lang.Throwable -> L64
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r2, r1)     // Catch: java.lang.Throwable -> L64
            r6.LLILZIL = r1     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L4a
            r1 = 0
            goto L52
        L4a:
            java.lang.Class<com.ss.android.ugc.aweme.main.IPerformanceAbility> r0 = com.ss.android.ugc.aweme.main.IPerformanceAbility.class
            java.lang.Object r1 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L64
            com.ss.android.ugc.aweme.main.IPerformanceAbility r1 = (com.ss.android.ugc.aweme.main.IPerformanceAbility) r1     // Catch: java.lang.Throwable -> L64
        L52:
            r6.LLILLL = r1     // Catch: java.lang.Throwable -> L64
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L73
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L62:
            monitor-exit(r6)
            goto L73
        L64:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L67:
            X.0Q7z r1 = X.C1558520qew.LJIIL(r6)
            java.lang.Class<com.ss.android.ugc.aweme.main.IPerformanceAbility> r0 = com.ss.android.ugc.aweme.main.IPerformanceAbility.class
            X.01wD r1 = X.C1558520qew.LIZJ(r1, r0)
            com.ss.android.ugc.aweme.main.IPerformanceAbility r1 = (com.ss.android.ugc.aweme.main.IPerformanceAbility) r1
        L73:
            X.0rmi r0 = new X.0rmi
            r0.<init>(r6)
            r1.dt2(r0)
            X.0roS r0 = X.C1602860roS.LIZ
            r0.getClass()
            int r0 = X.C1602860roS.LJI()
            X.145x r0 = X.C1150504el.LIZ()
            r0.LJI(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.mainactivityobserver.CommonFeedActivityAssem.onCreate():void");
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0SR4.LLJJL = 0;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C2426709f7.LIZ("feed");
        C0NET.LIZ.getClass();
        C0NET.LJIILIIL.getValue();
        ((InterfaceC655270Pn3) C487580JAe.LIZJ(C724240Sb0.LJI(this))).unRegisterActivityOnKeyDownListener(this.LLILLJJLI);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        C1563720qnK.LIZ();
        ((IFeedPlayNumService) ServiceManager.get().getService(IFeedPlayNumService.class)).a4();
        PoiFeedPlayNumServiceImpl.LIZLLL().a4();
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onWindowFocusChanged(boolean z, boolean z2) {
        super.onWindowFocusChanged(z, z2);
        if (z && z2) {
            C0NET.LIZ.getClass();
            if (!C0NET.LJIIJ) {
                C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.08B1
                    public static void LIZ() {
                        try {
                            LoadSoLancet.LIZJ("ttmverify");
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            Librarian.LJFF("ttmverify");
                            LoadSoLancet.LJ(jUptimeMillis, "ttmverify");
                            LoadSoLancet.LIZLLL(jUptimeMillis, "ttmverify");
                            LoadSoLancet.LIZIZ("ttmverify");
                        } finally {
                            try {
                            } catch (Throwable th) {
                            }
                        }
                        C0NET.LIZ.getClass();
                        C0NET.LJIIJ = true;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("CommonFeedActivityAssem@da89.setAllowLoadVcnVerifyLib$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("CommonFeedActivityAssem@da89.setAllowLoadVcnVerifyLib$1");
                    }
                });
            }
        }
    }
}
