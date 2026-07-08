package com.ss.android.ugc.aweme.requesttask.idle;

import X.C0CCZ;
import X.C0VZ0;
import X.C1383350m6P;
import X.C1552050qUV;
import X.C288540BSq;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class GeckoLocalRequestV2 implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "GeckoLocalRequestV2";
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
        return ((Boolean) C288540BSq.LIZIZ.getValue()).booleanValue();
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            C1552050qUV.LIZJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1383350m6P.LIZ(e);
        }
    }
}
