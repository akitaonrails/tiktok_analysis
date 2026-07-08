package com.ss.android.ugc.aweme.task.hook;

import X.C01GW;
import X.C09JN;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1827307Dr;
import X.C2075008Ay;
import X.C2079508Cr;
import X.C2214201BlK;
import X.C452501pT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import Y.AfS172S0100000_3;
import android.content.Context;
import android.os.Build;
import com.ss.android.agilelogger.ALog;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MainActivityLowMmProtectTask implements C0CCZ, InterfaceC799590VYf {
    public final C01GW LL = C452501pT.LIZIZ(new C2075008Ay(this));

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MainActivityLowMmProtectTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return Build.VERSION.SDK_INT > 29;
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
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLowMmProtect", "HomeActivity task run");
        if (!((Boolean) C1827307Dr.LIZ.getValue()).booleanValue()) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLowMmProtect", "ABTest off");
        } else if (Build.VERSION.SDK_INT >= 30) {
            C2214201BlK.LJII.LJJLIIJ().LJJIL(C2079508Cr.LL).LJJLL(new AfS172S0100000_3(this, 17), new C09JN() { // from class: X.08Az
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("MainActivityLowMmProtectTask@78ef.run$result$2");
                    C1C7U.LIZIZ("MainActivityLowMmProtectTask@78ef.run$result$2");
                }
            });
        }
    }
}
