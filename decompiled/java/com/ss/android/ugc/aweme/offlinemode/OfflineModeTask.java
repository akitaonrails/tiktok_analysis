package com.ss.android.ugc.aweme.offlinemode;

import X.C0CCZ;
import X.C0VZ0;
import X.C19319410i8;
import X.C625460Og4;
import X.C625470Og5;
import X.C625860Ogi;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AwS90S0110000_2;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeTask implements C0CCZ {
    public final C19319410i8 LL = new C19319410i8("OfflineModeTask");

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "OfflineModeTask";
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
        C625470Og5.LL.getClass();
        if (C625470Og5.LLJILLL) {
            return;
        }
        C625470Og5.LLJILLL = true;
        boolean zF0 = C625470Og5.F0();
        C625460Og4.LIZ.getClass();
        C625460Og4.LIZJ();
        new C625860Ogi().LIZ(new AwS90S0110000_2(zF0, this, 1));
    }
}
