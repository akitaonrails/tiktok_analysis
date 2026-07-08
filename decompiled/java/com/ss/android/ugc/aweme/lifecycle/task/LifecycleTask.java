package com.ss.android.ugc.aweme.lifecycle.task;

import X.C086T;
import X.C0C64;
import X.C0CCZ;
import X.C0VZ0;
import X.C0WZX;
import X.C1906580ziK;
import X.C1BWL;
import X.C2204961BRm;
import X.C2416709dV;
import X.C2455309jj;
import X.C2455709jn;
import X.C2455909jp;
import X.C2456309jt;
import X.C557050Lt1;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS83S0000000_3;
import Y.AfS0S0201100_3;
import Y.AfS12S0001000_3;
import Y.AfS172S0100000_3;
import android.app.Application;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lifecycle.LifecycleActiveReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class LifecycleTask implements C0CCZ {
    public static final C557050Lt1 LL = new C557050Lt1(false);

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LifecycleTask";
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

    public static boolean LIZ() {
        return C2455309jj.LIZJ() >= 0 || C0C64.LJIILLIIL().LJIJ(31744, 0, "4580_lifecycle_job_delay_by_daily_open_count", true) == 1 || C0C64.LJIILLIIL().LJIJ(31744, 0, "4590_lifecycle_task_probe_require_session_terminate", true) == 1;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) throws Throwable {
        boolean z;
        String strLJJIJIIJIL;
        ComponentName component;
        if (LL.LIZ(false, true)) {
            if (LIZ() && (!C1906580ziK.LJI() || C2456309jt.LIZIZ())) {
                C2455909jp.LIZIZ();
            }
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "4500_lifecycle_self_kill_idle_min", true);
            if (iLJIJ > 0) {
                Intent intentLIZ = C086T.LIZ();
                if (intentLIZ != null && (component = intentLIZ.getComponent()) != null) {
                    strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahZZrNxTHwdyqQgKeRO6tib9etq5WstFjQ2fsd6iK9", null));
                } else {
                    strLJJIJIIJIL = null;
                }
                if (C2455309jj.LJ(strLJJIJIIJIL, C2455309jj.LJFF(C0C64.LJIILLIIL().LJJ(31744, "4540_lifecycle_self_kill_launch_components", "", true)))) {
                    C1906580ziK.LIZJ().LIZ().LJLLLLLL(new AfS12S0001000_3(iLJIJ, 0));
                    if (C1906580ziK.LJI()) {
                        if (!C2416709dV.LIZ) {
                            long j = ((long) iLJIJ) * 60000;
                            BPEAHandler bPEAHandler = C2416709dV.LIZIZ;
                            ARunnableS83S0000000_3 aRunnableS83S0000000_3 = C2416709dV.LIZJ;
                            bPEAHandler.removeCallbacks(aRunnableS83S0000000_3);
                            C786410Ut5.LJLIIL(j, bPEAHandler, aRunnableS83S0000000_3);
                        }
                    } else {
                        C2416709dV.LIZ = true;
                    }
                }
            }
            try {
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "4500_lifecycle_job_keep_warm", true) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zLIZ = LifecycleActiveReceiver.LIZ(context);
                C2455309jj.LIZJ();
                if (z && zLIZ) {
                    if (C1906580ziK.LJI() && !C2456309jt.LIZIZ()) {
                        C2455709jn.LIZJ(context);
                    } else if (!C1906580ziK.LJI() || C2456309jt.LIZIZ()) {
                        if (C2455709jn.LIZLLL(C2455309jj.LIZJ())) {
                            C2455709jn.LIZJ(context);
                        } else {
                            C2455709jn.LJ(context);
                        }
                    }
                    C1906580ziK.LIZJ().LIZ().LJLLLLLL(new AfS172S0100000_3(context, 20));
                } else {
                    C2455709jn.LJ(context);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            int iLJIJ2 = C0C64.LJIILLIIL().LJIJ(31744, 0, "4500_lifecycle_screen_on_active_sec", true);
            if (iLJIJ2 > 0) {
                final int iLIZIZ = C2455309jj.LIZIZ();
                if (iLIZIZ <= 0) {
                    iLIZIZ = 8000;
                }
                final long millis = TimeUnit.SECONDS.toMillis(iLJIJ2);
                try {
                    C786410Ut5.LJIJJ(C786410Ut5.N3(context), new BroadcastReceiver() { // from class: X.09jm
                        public final void LIZ(Intent intent) {
                            if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && C1906580ziK.LJI()) {
                                LifecycleActiveReceiver.LIZLLL(iLIZIZ, millis, false);
                            }
                        }

                        @Override // android.content.BroadcastReceiver
                        public final void onReceive(Context context2, Intent intent) {
                            if (!C2214201BlK.LJIIJJI && intent != null) {
                                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                                    C2188191AkT.LIZIZ();
                                }
                            }
                            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                                LIZ(intent);
                            } else {
                                C2408409cA.LIZ();
                                LIZ(intent);
                            }
                        }
                    }, new IntentFilter("android.intent.action.SCREEN_ON"));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            int iLIZIZ2 = C2455309jj.LIZIZ();
            long jLIZ = C2455309jj.LIZ();
            if (iLIZIZ2 > 0 && jLIZ > 0 && LifecycleActiveReceiver.LIZ(context)) {
                if (C1906580ziK.LJI()) {
                    LJ(iLIZIZ2, jLIZ, context);
                } else if (C0C64.LJIILLIIL().LJIJ(31744, 0, "4500_lifecycle_disable_fg", true) != 1) {
                    Application applicationLIZ = C1BWL.LIZ();
                    try {
                        C2204961BRm.LJJ(applicationLIZ, new Intent(applicationLIZ, (Class<?>) TaskLifecycleProbeService.class), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahZZrNxTHwdyqQgKeRO7d5ZtGroYWTKC70N54=", null));
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                    }
                }
                C1906580ziK.LIZJ().LIZ().LJLLLLLL(new AfS0S0201100_3(this, iLIZIZ2, context, jLIZ, 0));
            }
        }
    }

    public static void LJ(int i, long j, Context context) {
        ComponentName component;
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "4500_lifecycle_push_fgs_duration", true);
        boolean zLIZJ = C2456309jt.LIZJ();
        if (iLJIJ < 0 && Build.VERSION.SDK_INT >= 26) {
            try {
                NotificationManager notificationManager = (NotificationManager) C786410Ut5.G2(C1BWL.LIZ(), "notification");
                if (notificationManager != null && notificationManager.getNotificationChannel("perf_fgs_silent") != null) {
                    notificationManager.deleteNotificationChannel("perf_fgs_silent");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        String strLJJIJIIJIL = null;
        if (Build.VERSION.SDK_INT >= 31 && zLIZJ && iLJIJ > 0) {
            Intent intent = new Intent(context, (Class<?>) ForegroundShortService.class);
            intent.putExtra("duration_sec", iLJIJ);
            try {
                C2204961BRm.LJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahZZrNxTHwdyqQgKeRO7d5ZtGroYWTKC70N54=", null));
                return;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return;
            }
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "4480_lifecycle_active_bg", true) > 0) {
            Intent intentLIZ = C086T.LIZ();
            if (intentLIZ != null && (component = intentLIZ.getComponent()) != null) {
                strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahZZrNxTHwdyqQgKeRO7d5ZtGroYWTKC70N54=", null));
            }
            if (!C2455309jj.LJ(strLJJIJIIJIL, C2455309jj.LJFF(C0C64.LJIILLIIL().LJJ(31744, "4540_lifecycle_active_bg_launch_components", "", true)))) {
                return;
            }
            if ((C0C64.LJIILLIIL().LJIJ(31744, 0, "4480_lifecycle_active_bg", true) & 4) == 4) {
                if (zLIZJ) {
                    LifecycleActiveReceiver.LIZLLL(i, j, C2455309jj.LIZLLL());
                    return;
                }
                return;
            }
            LifecycleActiveReceiver.LIZLLL(i, j, C2455309jj.LIZLLL());
        }
    }
}
