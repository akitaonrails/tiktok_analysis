package com.ss.android.ugc.aweme.legoImp.task;

import X.C09JN;
import X.C0CCZ;
import X.C0VZ0;
import X.C2214201BlK;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.AfS172S0100000_3;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class StorageClearTask implements C0CCZ {
    public static volatile boolean LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "StorageClearTask";
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
        if (context != null && !LL) {
            LL = true;
            C2214201BlK.LJ().LJJLL(new AfS172S0100000_3(context, 12), new C09JN() { // from class: X.098F
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("StorageClearTask@6380.run$2");
                    C1C7U.LIZIZ("StorageClearTask@6380.run$2");
                }
            });
        }
    }
}
