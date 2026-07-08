package com.ss.android.legoimpl;

import X.C0CCZ;
import X.C0VZ0;
import X.C2426509f5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class KidsModeStorageTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "KidsModeStorageTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C2426509f5.LIZ().run(context);
    }
}
