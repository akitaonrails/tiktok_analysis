package com.ss.android.ugc.aweme.legoImp.task;

import X.AnonymousClass0716;
import X.C08NF;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C2073408Ai;
import X.C2073608Ak;
import X.C2073708Al;
import X.C2074508At;
import X.C2108808Ny;
import X.C2123108Tl;
import X.C2155108cP;
import X.C23250099c;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import Y.ARunnableS83S0000000_3;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.librarian.Librarian;
import com.bytedance.sysoptimizer.ClearCacheOpt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.aweme.offline.reliability.chaos.IReliabilityChaosService;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC20234614Fk
public class ColdBootInitTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ColdBootInitTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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

    public static void LJ() {
        try {
            long jLIZLLL = C2108808Ny.LIZLLL();
            if (134217728 >= jLIZLLL) {
                C2074508At.LIZ.getValue().getClass();
                if (jLIZLLL > 67108864) {
                    if (((Boolean) AnonymousClass0716.LJIIIIZZ.getValue()).booleanValue()) {
                        C2108808Ny.LIZIZ("above 64MB");
                    }
                } else if (((Boolean) AnonymousClass0716.LJIIIZ.getValue()).booleanValue()) {
                    C2108808Ny.LIZIZ("below 64MB");
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r13) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.ColdBootInitTask.LIZ(android.content.Context):void");
    }

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) {
        try {
            C23250099c.LIZLLL(C08NF.LIZIZ, null, null, new C2155108cP(context, null), 3);
            ((IReliabilityChaosService) ServiceManager.get().getService(IReliabilityChaosService.class)).LIZ();
            LJ();
            LIZ(context);
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.081o
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ColdBootInitTask@1c6b.run$1");
                    try {
                        ClearCacheOpt.fix(context);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ColdBootInitTask@1c6b.run$1");
                }
            });
            LoadSoLancet.LIZJ("quick");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("quick");
            LoadSoLancet.LJ(jUptimeMillis, "quick");
            LoadSoLancet.LIZLLL(jUptimeMillis, "quick");
            LoadSoLancet.LIZIZ("quick");
            LoadSoLancet.LIZJ("napi");
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            Librarian.LJFF("napi");
            LoadSoLancet.LJ(jUptimeMillis2, "napi");
            LoadSoLancet.LIZLLL(jUptimeMillis2, "napi");
            LoadSoLancet.LIZIZ("napi");
            boolean z = false;
            C2073708Al.LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("async_audio_opt_ab_enabled", false);
            C2073608Ak.LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("audio_focus_opt_ab", false);
            if (C2073408Ai.LIZ != -1) {
                z = true;
            }
            C2073608Ak.LIZIZ = z;
            C2123108Tl.LIZ.execute(new ARunnableS83S0000000_3(15));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
