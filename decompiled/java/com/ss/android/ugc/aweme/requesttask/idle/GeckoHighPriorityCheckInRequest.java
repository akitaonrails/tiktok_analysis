package com.ss.android.ugc.aweme.requesttask.idle;

import X.C0CCZ;
import X.C0VZ0;
import X.C1383350m6P;
import X.C1402340mb2;
import X.C1552050qUV;
import X.C2214201BlK;
import X.C2456009jq;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.RunnableC1052350dUX;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class GeckoHighPriorityCheckInRequest implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "GeckoHighPriorityCheckInRequest";
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
        if (C1552050qUV.LJ) {
            return;
        }
        if (C2456009jq.LIZ()) {
            C2214201BlK.LIZLLL().LIZIZ(new C1402340mb2(this, context, 0));
            return;
        }
        try {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), RunnableC1052350dUX.LL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1383350m6P.LIZ(e);
        }
    }
}
