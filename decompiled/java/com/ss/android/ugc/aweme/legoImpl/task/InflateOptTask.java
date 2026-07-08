package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1492110ovp;
import X.C303880Bve;
import X.C538540LAe;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class InflateOptTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InflateOptTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
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
        if (((Boolean) C303880Bve.LIZLLL.getValue()).booleanValue() || ((Boolean) C303880Bve.LJ.getValue()).booleanValue()) {
            C1492110ovp.LIZ("inflateLockDelay60s", ((Boolean) C303880Bve.LJII.getValue()).booleanValue(), Integer.valueOf(C538540LAe.LLJJJIL), AFwS190S0000000_4.get$arr$(1731));
        }
    }
}
