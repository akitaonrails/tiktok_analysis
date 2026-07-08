package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1367960lha;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1194100hBA;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PoiInitTask";
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
        C1367960lha.LIZ.getClass();
        if (C1367960lha.LIZ().enable()) {
            try {
                C1367960lha.LIZ().LJJLIIIJLJLI();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1367960lha.LIZ.getClass();
        C1367960lha.LIZ().LJLILLLLZI();
        InterfaceC1194100hBA interfaceC1194100hBALJIIZILJ = C1367960lha.LIZ().LJIIZILJ();
        if (interfaceC1194100hBALJIIZILJ != null) {
            interfaceC1194100hBALJIIZILJ.start();
        }
    }
}
