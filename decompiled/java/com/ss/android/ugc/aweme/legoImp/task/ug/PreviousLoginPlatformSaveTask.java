package com.ss.android.ugc.aweme.legoImp.task.ug;

import X.C01GW;
import X.C0CCZ;
import X.C0VZ0;
import X.C13VA;
import X.C452501pT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.keva.Keva;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class PreviousLoginPlatformSaveTask implements C0CCZ {
    public final C01GW LL = C452501pT.LIZIZ(new C13VA());

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreviousLoginPlatformSaveTask";
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
        if (((Keva) this.LL.getValue()).getBoolean("did_save", false)) {
            return;
        }
        ((Keva) this.LL.getValue()).storeBoolean("did_save", true);
    }
}
