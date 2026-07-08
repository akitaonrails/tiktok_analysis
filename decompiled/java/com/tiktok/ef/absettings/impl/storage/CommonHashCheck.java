package com.tiktok.ef.absettings.impl.storage;

import X.C0CCZ;
import X.C0VZ0;
import X.C296770BkB;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class CommonHashCheck implements C0CCZ {
    public final Runnable LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CommonHashCheck";
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
        return C296770BkB.LIZ() == 1 ? EnumC799870VZh.IDLE : EnumC799870VZh.APP_BACKGROUND;
    }

    public CommonHashCheck(Runnable runnable) {
        this.LL = runnable;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        this.LL.run();
    }
}
