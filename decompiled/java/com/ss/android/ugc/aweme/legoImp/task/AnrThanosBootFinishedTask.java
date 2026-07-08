package com.ss.android.ugc.aweme.legoImp.task;

import X.C09Z2;
import X.C09Z3;
import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.anrthanos.optimization.MessageLoggingOpt;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AnrThanosBootFinishedTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AnrThanosBootFinishedTask";
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
        C09Z2.LIZ().getClass();
        C09Z2.LIZ().getClass();
        if (((Boolean) C09Z3.LIZ.getValue()).booleanValue()) {
            MessageLoggingOpt.startOpt();
        }
    }
}
