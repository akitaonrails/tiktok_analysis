package com.ss.android.ugc.aweme.legoImp.task;

import X.AbstractC848400XPy;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C0XQ7;
import X.C1595430rcT;
import X.C1599640rjG;
import X.C296320BjS;
import X.C319860CgK;
import X.EnumC1586970rOp;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsRedDotDeferredTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FriendsRedDotDeferredTask";
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
    public final int priority() {
        return 2;
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

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        boolean z;
        if (((Number) C296320BjS.LIZ.getValue()).intValue() >= 2) {
            z = true;
        } else {
            z = false;
        }
        C1595430rcT c1595430rcT = C1595430rcT.LIZIZ;
        c1595430rcT.LIZJ().registerRedDotBytesync();
        if (C319860CgK.LIZ()) {
            C1599640rjG.LIZIZ.runDeferredRedDotTask(EnumC1586970rOp.COLD_START, z);
        } else {
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                return;
            }
            c1595430rcT.LIZJ().runDeferredRedDotTask(EnumC1586970rOp.COLD_START, z);
        }
    }
}
