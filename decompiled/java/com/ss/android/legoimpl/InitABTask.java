package com.ss.android.legoimpl;

import X.C08Q0;
import X.C0C46;
import X.C0C62;
import X.C0C63;
import X.C0C6E;
import X.C0C6H;
import X.C0C6P;
import X.C0C6R;
import X.C0CCZ;
import X.C0CN5;
import X.C0VZ0;
import X.C0X35;
import X.C118300cf;
import X.C1602860roS;
import X.C1BWL;
import X.C2188811AlT;
import X.C259800zU;
import X.C823050WQl;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import Y.AObjectS380S0100000_4;
import Y.ARunnableS104S0100000_4;
import android.app.Application;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC20234614Fk
public class InitABTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitABTask";
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
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static void LIZ() {
        C0X35.LIZ("application_preinit_ab", false);
        Application applicationLIZ = C1BWL.LIZ();
        int i = 1;
        if (!C0C6E.LIZIZ) {
            C0C6E.LIZIZ = true;
            C0C6E.LIZJ = C08Q0.LJ(applicationLIZ, "ffd_perf_monitor_ab", false);
            C0C6H.LJI = C0C6E.LIZJ;
            if (C0C6E.LIZJ) {
                C0CN5.LIZIZ(15000L, new Runnable() { // from class: X.0C61
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PerfMonitorAB@af35.init$1");
                        try {
                            C0C6H.LJFF = true;
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PerfMonitorAB@af35.init$1");
                    }
                });
            }
        }
        C0C63 c0c63 = C0C62.LIZ;
        c0c63.getClass();
        C0X35.LIZ("application_initbefore_init_ab", false);
        C0C6R c0c6rLIZ = C0C46.LIZ();
        C844470XAv.LIZ.getClass();
        int iLIZIZ = C08Q0.LIZIZ(C844470XAv.LIZ(), 10, "sdk_abmock_monitor_sample");
        try {
            c0c6rLIZ.LJIIJ = iLIZIZ;
            if (C0C6R.LJJIIJ == null) {
                C0C6R.LJJIIJ = KevaImpl.getRepoSync("abmock_manager", 0);
            }
            Keva keva = C0C6R.LJJIIJ;
            if (keva != null) {
                keva.storeInt(c0c6rLIZ.LJII, iLIZIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append("");
            C0C46.LIZIZ("ABMockEvent", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
        C844470XAv.LIZ.getClass();
        int iLIZIZ2 = C08Q0.LIZIZ(C844470XAv.LIZ(), 10, "sdk_abmock_error_report_sample");
        try {
            C0C6R.LJJIII = iLIZIZ2;
            if (C0C6R.LJJIIJ == null) {
                C0C6R.LJJIIJ = KevaImpl.getRepoSync("abmock_manager", 0);
            }
            Keva keva2 = C0C6R.LJJIIJ;
            if (keva2 != null) {
                keva2.storeInt("abmock_error_report_sample", iLIZIZ2);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cause: ");
            sbLIZ2.append(th2);
            sbLIZ2.append("--message: ");
            sbLIZ2.append("");
            C0C46.LIZIZ("ABMockEvent", new Throwable(C2188811AlT.LIZIZ(sbLIZ2), th2));
        }
        C0C6R c0c6rLIZ2 = C0C46.LIZ();
        C844470XAv.LIZ.getClass();
        int iLJ = (int) C844470XAv.LJ();
        C1602860roS.LIZ.getClass();
        boolean zLJ = C1602860roS.LJ();
        AObjectS380S0100000_4 aObjectS380S0100000_4 = new AObjectS380S0100000_4(c0c63, 2);
        long jNanoTime = System.nanoTime();
        C118300cf c118300cf = new C118300cf();
        C259800zU c259800zU = new C259800zU();
        C118300cf c118300cf2 = new C118300cf();
        if (zLJ) {
            i = 2;
        } else {
            try {
                Keva keva3 = C0C6R.LJJIIJ;
                if (keva3 != null && keva3.getInt(c0c6rLIZ2.LIZIZ, 0) == iLJ) {
                    i = 0;
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("cause: ");
                sbLIZ3.append(th3);
                sbLIZ3.append("--message: ");
                sbLIZ3.append("sdkInit");
                C0C46.LIZIZ("ABMockEvent", new Throwable(C2188811AlT.LIZIZ(sbLIZ3), th3));
            }
        }
        c118300cf2.element = i;
        Keva keva4 = C0C6R.LJJIIJ;
        if (keva4 != null) {
            keva4.storeInt(c0c6rLIZ2.LIZIZ, iLJ);
        }
        c0c6rLIZ2.LJI(new C0C6P(c0c6rLIZ2, System.nanoTime(), jNanoTime, c118300cf, c118300cf2, c259800zU));
        C0C63 c0c632 = C0C62.LIZ;
        c0c632.getClass();
        if (AwemeConfigCenter.LIZIZ()) {
            C823050WQl.LIZLLL().execute(new ARunnableS104S0100000_4(c0c632, 124));
            C823050WQl.LIZLLL().execute(new ARunnableS104S0100000_4(c0c632, 125));
            C823050WQl.LIZLLL().execute(new ARunnableS104S0100000_4(c0c632, 126));
        }
        C0X35.LJIIJJI("application_preinit_ab", false);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        LIZ();
    }
}
