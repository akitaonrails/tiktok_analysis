package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C2206791BYn;
import X.C2210291Bf1;
import X.C2210441BfG;
import X.C2210701Bfg;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class AppLogInitTask implements C0CCZ, InterfaceC799590VYf {
    public static final AppLogInitTask LL = new AppLogInitTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AppLogInitTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return C2210701Bfg.LIZIZ.LIZLLL();
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return C2206791BYn.LIZIZ.LJ() ? 2 : 1;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return C2206791BYn.LIZIZ.LIZLLL() ? 1 : 16777215;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C2210291Bf1.LIZ(C2210441BfG.LIZIZ.getApplication());
    }
}
