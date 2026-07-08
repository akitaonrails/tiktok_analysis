package com.ss.android.ugc.aweme.legoImp.task;

import X.C08PF;
import X.C09Z2;
import X.C0C64;
import X.C0CCZ;
import X.C0CD2;
import X.C0VZ0;
import X.C0X35;
import X.C1AF0;
import X.C1C7U;
import X.C7740030o;
import X.C799890VZj;
import X.C799900VZk;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import Y.ARunnableS103S0100000_3;
import android.content.Context;
import android.os.Build;
import com.bytedance.anrthanos.optimization.LogcatDowngradeOpt;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC20234614Fk(dependencies = {"AnrThanosEarliestTask"})
public class AnrThanosTask implements C0CCZ {
    public static /* synthetic */ void LJ(AnrThanosTask anrThanosTask) {
        C1C7U.LIZ("AnrThanosTask@8eb.run$1L");
        anrThanosTask.preloadGsonProvider();
        C1C7U.LIZIZ("AnrThanosTask@8eb.run$1L");
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AnrThanosTask";
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
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static void LIZ() {
        C09Z2.LIZ().getClass();
        int i = Build.VERSION.SDK_INT;
        int iLJIIZILJ = C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "anropt_cut_logcat", true);
        if (iLJIIZILJ > 0) {
            Npth.addTag("has_cut_log", "1");
            C09Z2.LIZIZ = iLJIIZILJ;
            if (C08PF.LIZ == null) {
                C08PF.LIZ = new C08PF();
            }
            C08PF.LIZ.getClass();
            LogcatDowngradeOpt.startDowngradeOptNative(iLJIIZILJ, i);
        }
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj = new C799890VZj();
        c799890VZj.LIZ(new AnrThanosBootFinishedTask());
        c799890VZj.LIZIZ();
    }

    private void preloadGsonProvider() {
        C7740030o.LIZ().getGson();
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0X35.LIZ("anrthanos_task_init", false);
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "anrthanos_task_error");
        }
        if (((Boolean) C0CD2.LJJIIJ.getValue()).booleanValue()) {
            C823050WQl.LIZLLL().execute(new ARunnableS103S0100000_3(this, 41));
        }
        C0X35.LJIIJJI("anrthanos_task_init", false);
    }
}
