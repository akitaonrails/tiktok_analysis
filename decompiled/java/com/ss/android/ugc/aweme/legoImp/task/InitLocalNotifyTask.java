package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VQ4;
import X.C0VZ0;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS92S0000000_13;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class InitLocalNotifyTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitLocalNotifyTask";
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
        C786410Ut5.LJLIIL(120000L, C799570VYd.LIZIZ(), new ARunnableS92S0000000_13(20));
        C786410Ut5.LJLIIL(120000L, C799570VYd.LIZIZ(), new ARunnableS92S0000000_13(21));
        C0VQ4.LIZIZ.LIZ();
    }
}
