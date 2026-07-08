package com.ss.android.ugc.aweme.ug.dynamicresource;

import X.C0CCZ;
import X.C0VZ0;
import X.C14MJ;
import X.C14MM;
import X.C15O7;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class BootFinishTask implements C0CCZ {
    public final boolean LL = true;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "BootFinishTask";
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return this.LL;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C14MJ.LIZ.getClass();
        if (C14MJ.LIZJ.isEmpty()) {
            C14MJ.LIZLLL = true;
            C15O7.LIZJ(C14MM.LL);
        } else {
            C14MJ.LJIIL("boot_finish");
        }
    }
}
