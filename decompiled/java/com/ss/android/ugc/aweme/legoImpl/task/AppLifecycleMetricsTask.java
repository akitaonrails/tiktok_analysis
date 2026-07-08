package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0LAB;
import X.C0VU1;
import X.C0VZ0;
import X.C18ZN;
import X.C20684815ws;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class AppLifecycleMetricsTask implements C0CCZ, C18ZN, InterfaceC799590VYf {
    public static int LL = 1;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AppLifecycleMetricsTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C18ZN
    public final void onAppBackground() {
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.C18ZN
    public final void onAppForeground() {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(LL, "is_cold_start");
        C20684815ws.LJIILLIIL("app_foreground", c0lab.LIZ);
        LL = 0;
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
        ActivityStack.addNonWeakAppBackGroundListener(this);
        new ExitBackgroundManager("exit_background");
    }
}
