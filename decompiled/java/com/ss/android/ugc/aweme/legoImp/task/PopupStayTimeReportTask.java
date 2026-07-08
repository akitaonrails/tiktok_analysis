package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1906580ziK;
import X.C849850XVn;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1589330rSd;
import X.InterfaceC799590VYf;
import Y.AfS200S0100000_31;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class PopupStayTimeReportTask implements C0CCZ, InterfaceC799590VYf {
    public final InterfaceC1589330rSd LL = C849850XVn.LIZIZ.LIZJ();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PopupStayTimeReportTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
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
        C1906580ziK.LIZJ().LIZJ().LJJLJLI(new AfS200S0100000_31(this, 9));
        this.LL.LJIJJ();
    }
}
