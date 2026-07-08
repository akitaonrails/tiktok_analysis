package com.ss.android.ugc.aweme.legoImp.task;

import X.C0C64;
import X.C0CCZ;
import X.C0VZ0;
import X.C1BWL;
import X.C2162308dZ;
import X.C2236808pa;
import X.C285090BFj;
import X.C303060BuK;
import X.C786420Ut6;
import X.C786450Ut9;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.sysoptimizer.GetSetEnvOpt;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class PerfOptBootFinishTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PerfOptBootFinishTask";
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (((Boolean) C285090BFj.LJJIIJ.getValue()).booleanValue() && context != null && C0C64.LJIILLIIL().LJIIIZ(31744, "get_set_env_fix", true, true)) {
            GetSetEnvOpt.fix(context);
        }
        if (((Boolean) C285090BFj.LJJII.getValue()).booleanValue()) {
            C2236808pa.LIZ(C1BWL.LIZ(), C2162308dZ.LJI(context));
            if (((Number) C303060BuK.LIZ.getValue()).intValue() > 0) {
                C786420Ut6.LJIIIZ = true;
                C786420Ut6.LJIIIIZZ = LivePreCreateNextRoomPlayer.ENABLE;
                C786450Ut9.LJ = true;
            }
        }
    }
}
