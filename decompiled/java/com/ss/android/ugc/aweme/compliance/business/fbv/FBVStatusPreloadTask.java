package com.ss.android.ugc.aweme.compliance.business.fbv;

import X.C01GW;
import X.C0CCZ;
import X.C0VZ0;
import X.C1916230zxt;
import X.C23250099c;
import X.C452501pT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC497601wk;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class FBVStatusPreloadTask implements C0CCZ {
    public final C01GW LL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(116));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(117));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(118));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(115));

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FBVStatusPreloadTask";
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
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLILLL.getValue(), null, null, new C1916230zxt(this, null), 3);
    }
}
