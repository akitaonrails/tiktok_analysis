package com.ss.android.ugc.aweme.requesttask.idle;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C104100aN;
import X.C1383350m6P;
import X.C1552050qUV;
import X.C1554460qYO;
import X.C1602860roS;
import X.C1852707Nl;
import X.C2214201BlK;
import X.C2456009jq;
import X.C288540BSq;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes24.dex */
public final class GeckoLocalRequest implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "GeckoLocalRequest";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        if (((Boolean) C288540BSq.LIZIZ.getValue()).booleanValue()) {
            return false;
        }
        C1602860roS.LIZ.getClass();
        if (C1602860roS.LJ()) {
            return C104100aN.LIZ().LJJIJ(AFwS189S0000000_3.get$arr$(1766));
        }
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return ((Boolean) C1852707Nl.LJIIIIZZ.getValue()).booleanValue() ? 0 : 1;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (C2456009jq.LIZ()) {
            C2214201BlK.LIZLLL().LIZIZ(new C1554460qYO(this, context, 1));
            return;
        }
        try {
            C1552050qUV.LIZJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1383350m6P.LIZ(e);
        }
    }
}
