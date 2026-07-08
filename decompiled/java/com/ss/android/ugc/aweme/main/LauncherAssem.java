package com.ss.android.ugc.aweme.main;

import X.C098200Yq;
import X.C0CCZ;
import X.C0QSJ;
import X.C1150504el;
import X.C1252704vF;
import X.C1389890mGx;
import X.C13LE;
import X.C1558520qew;
import X.C1590120rTu;
import X.C1594270rab;
import X.C189200o6;
import X.C19EG;
import X.C1EKA;
import X.C2217381BqS;
import X.C282860B6u;
import X.C296200BjG;
import X.C616540OGe;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C799900VZk;
import X.C817540W5g;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC817550W5h;
import android.app.Application;
import android.content.BroadcastReceiver;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.IPerformanceAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes25.dex */
public final class LauncherAssem extends BaseMainContainerAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public BroadcastReceiver LL;
    public InterfaceC817550W5h LLILLJJLI;
    public boolean LLILLL;
    public volatile IPerformanceAbility LLILZ;
    public InterfaceC665370Q7z LLILZIL;
    public C0QSJ LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LauncherAssem.class, "performanceAbility", "getPerformanceAbility()Lcom/ss/android/ugc/aweme/main/IPerformanceAbility;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        IPerformanceAbility iPerformanceAbilityBo;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"LauncherAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        if (!C296200BjG.LIZ()) {
            iPerformanceAbilityBo = (IPerformanceAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), IPerformanceAbility.class);
        } else if (((Boolean) C282860B6u.LIZ.getValue()).booleanValue()) {
            if (bo() == null) {
                System.out.println((Object) "LauncherAssem performanceAbility is null");
            }
            iPerformanceAbilityBo = bo();
            if (iPerformanceAbilityBo == null) {
                iPerformanceAbilityBo = IPerformanceAbility.AsyncDefault.LL;
            }
        } else {
            iPerformanceAbilityBo = bo();
            if (iPerformanceAbilityBo == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        iPerformanceAbilityBo.dt2(new C817540W5g(this));
        if (C1252704vF.LIZIZ.LIZ()) {
            C799900VZk c799900VZk = C799900VZk.LIZ;
            C0CCZ c0cczLIZIZ = C1590120rTu.LIZIZ.LIZIZ();
            c799900VZk.getClass();
            C799900VZk.LIZJ(c0cczLIZIZ);
        }
        if (C616540OGe.LIZ()) {
            C1594270rab c1594270rab = BaseFragment.LLILZ;
            C1EKA c1eka = new C1EKA() { // from class: X.0raa
                @Override // X.C1EKA
                public final void LIZ() {
                }

                @Override // X.C1EKA
                public final void LIZIZ() {
                }

                @Override // X.C1EKA
                public final void LIZLLL() {
                }

                @Override // X.C1EKA
                public final void LJ() {
                }

                @Override // X.C1EKA
                public final void LJI() {
                }

                @Override // X.C1EKA
                public final void LJIIIIZZ(BaseFragment baseFragment) {
                }

                @Override // X.C1EKA
                public final void LJIIIZ() {
                }

                @Override // X.C1EKA
                public final void LJIIJ() {
                }

                @Override // X.C1EKA
                public final void LJIIJJI(BaseFragment baseFragment) {
                }

                @Override // X.C1EKA
                public final void LJIIL() {
                }

                @Override // X.C1EKA
                public final void LJIILIIL() {
                }

                @Override // X.C1EKA
                public final void LJIILJJIL(BaseFragment baseFragment) {
                }

                @Override // X.C1EKA
                public final void LJIILL() {
                }

                @Override // X.C1EKA
                public final void LJIILLIIL(BaseFragment baseFragment) {
                    if (!((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(baseFragment.getActivity())) {
                        C2187451AjH.LJJIJIIJI(baseFragment.getClass().getName());
                    }
                }
            };
            c1594270rab.getClass();
            BaseFragment.LLILZLL.LL.add(c1eka);
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.main.IPerformanceAbility bo() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.main.IPerformanceAbility r0 = r4.LLILZ
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.main.IPerformanceAbility r0 = r4.LLILZ     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLILZLL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLILZIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLILZIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLILZLL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.main.IPerformanceAbility> r0 = com.ss.android.ugc.aweme.main.IPerformanceAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.main.IPerformanceAbility r0 = (com.ss.android.ugc.aweme.main.IPerformanceAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLILZ = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.LauncherAssem.bo():com.ss.android.ugc.aweme.main.IPerformanceAbility");
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        Unit unit;
        Application application;
        Object c098200Yq;
        super.onDestroy();
        if (this.LLILLL) {
            try {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    BroadcastReceiver broadcastReceiver = this.LL;
                    ReceiverRegisterLancet.loge(broadcastReceiver, false);
                    c19egLIZ.unregisterReceiver(broadcastReceiver);
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 == null || (application = c19egLIZ2.getApplication()) == null) {
            return;
        }
        try {
            InterfaceC817550W5h interfaceC817550W5h = this.LLILLJJLI;
            if (interfaceC817550W5h != null) {
                interfaceC817550W5h.LIZIZ(application);
            }
            Object service = ServiceManager.get().getService(IEarphonePlayerControlService.class);
            ((IEarphonePlayerControlService) service).LJFF(application);
            c098200Yq = (IEarphonePlayerControlService) service;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m1boximpl(c098200Yq);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        if (C296200BjG.LIZ()) {
            return;
        }
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onWindowFocusChanged(boolean z, boolean z2) {
        C19EG c19egLIZ;
        super.onWindowFocusChanged(z, z2);
        if (z2 && (c19egLIZ = C724240Sb0.LIZ(this)) != null && c19egLIZ.getIntent().getBooleanExtra("app_action_restricted", false)) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIIZ(2131834493);
            c1389890mGx.LJIIJJI();
        }
    }
}
