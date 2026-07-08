package com.ss.android.ugc.aweme.legoImp.task;

import X.AbstractC848400XPy;
import X.C08TN;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C0XQ7;
import X.C1595430rcT;
import X.C1599640rjG;
import X.C20684815ws;
import X.C23250099c;
import X.C282890B6x;
import X.C296320BjS;
import X.C319860CgK;
import X.C804880Vhm;
import X.C817503Hh;
import X.EnumC1586970rOp;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.os.SystemClock;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsTabInitTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FriendsTabInitTask";
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
        if (!((Boolean) C282890B6x.LIZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C804880Vhm(null), 3);
        }
        if (C319860CgK.LIZ()) {
            C1599640rjG.LIZIZ.Fu(EnumC1586970rOp.COLD_START);
        }
        if (((Number) C296320BjS.LIZ.getValue()).intValue() < 1) {
            C1595430rcT.LIZIZ.LIZJ().registerRedDotBytesync();
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - C08TN.LIZ().LJJLIIIJLJLI;
        C1595430rcT.LIZIZ.LIZJ().runColdStartTaskV2(true, EnumC1586970rOp.COLD_START);
        C20684815ws.LJIJI("cold_start_fetch_task_v2", new Pair(Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), "duration"), new Pair(Long.valueOf(jElapsedRealtime2), "delay_from_feed_total"));
    }
}
