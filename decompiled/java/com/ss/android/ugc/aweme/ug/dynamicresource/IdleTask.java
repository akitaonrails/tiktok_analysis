package com.ss.android.ugc.aweme.ug.dynamicresource;

import X.C0CCZ;
import X.C0VZ0;
import X.C14MJ;
import X.C1786606zA;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class IdleTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "IdleTask";
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
        return ((Boolean) C1786606zA.LIZ.getValue()).booleanValue() ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.IDLE;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        while (true) {
            C14MJ.LIZ.getClass();
            if (!C14MJ.LIZJ.isEmpty()) {
                C14MJ.LJIIL("idle");
            } else {
                return;
            }
        }
    }
}
