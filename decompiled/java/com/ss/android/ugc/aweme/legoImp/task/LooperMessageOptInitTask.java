package com.ss.android.ugc.aweme.legoImp.task;

import X.C07A2;
import X.C09Z2;
import X.C09Z3;
import X.C0CCZ;
import X.C0VZ0;
import X.C2187451AjH;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class LooperMessageOptInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LooperMessageOptInitTask";
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
        if (C07A2.LIZJ) {
            C09Z2.LIZ().getClass();
            if (!((Boolean) C09Z3.LIZ.getValue()).booleanValue()) {
                C2187451AjH.LJIIIZ();
            }
        }
    }
}
