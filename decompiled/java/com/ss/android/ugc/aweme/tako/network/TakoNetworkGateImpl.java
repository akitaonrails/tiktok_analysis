package com.ss.android.ugc.aweme.tako.network;

import X.AnonymousClass0951;
import X.C054G;
import X.C09A1;
import X.C0PEM;
import X.C1863680yb8;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C325020Coe;
import X.C325040Cog;
import X.C325050Coh;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoNetworkGateImpl implements ITakoNetworkGate {
    public final C054G LIZ;
    public final C325050Coh LIZIZ;
    public final C325020Coe LIZJ;
    public volatile boolean LIZLLL;

    @Override // com.ss.android.ugc.aweme.tako.network.ITakoNetworkGate
    public final TakoNetworkState LIZIZ() {
        C325050Coh c325050Coh = this.LIZIZ;
        c325050Coh.LIZIZ.getValue();
        TakoNetworkState takoNetworkStateLIZ = c325050Coh.LIZ();
        c325050Coh.LIZIZ.setValue(takoNetworkStateLIZ);
        return takoNetworkStateLIZ;
    }

    @Override // com.ss.android.ugc.aweme.tako.network.ITakoNetworkGate
    public final TakoNetworkState LIZJ() {
        return (TakoNetworkState) this.LIZIZ.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.network.ITakoNetworkGate
    public final AnonymousClass0951 getState() {
        return this.LIZIZ.LIZJ;
    }

    public TakoNetworkGateImpl() {
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
        this.LIZ = c054gLIZ;
        this.LIZIZ = new C325050Coh();
        this.LIZJ = new C325020Coe(c054gLIZ);
        LIZLLL();
    }

    public final void LIZLLL() {
        if (C1863680yb8.LIZLLL() || C1863680yb8.LIZIZ()) {
            synchronized (this) {
                try {
                    C325050Coh c325050Coh = this.LIZIZ;
                    if (!c325050Coh.LIZLLL) {
                        c325050Coh.LIZLLL = true;
                        c325050Coh.LJ = ((INetworkStateService) c325050Coh.LIZ.getValue()).getNetworkStatus();
                        c325050Coh.LIZIZ.setValue(c325050Coh.LIZ());
                        ((INetworkStateService) c325050Coh.LIZ.getValue()).observerNetworkChange(c325050Coh.LJFF);
                    }
                    if (this.LIZLLL) {
                        return;
                    }
                    this.LIZLLL = true;
                    C23250099c.LIZLLL(this.LIZ, null, null, new C325040Cog(this, null), 3);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.network.ITakoNetworkGate
    public final boolean isOffline() {
        return LIZIZ() == TakoNetworkState.OFFLINE;
    }

    @Override // com.ss.android.ugc.aweme.tako.network.ITakoNetworkGate
    public final void LIZ(TakoRecoveryTask takoRecoveryTask) {
        this.LIZJ.LIZIZ.put(takoRecoveryTask.getId(), takoRecoveryTask);
        LIZLLL();
    }
}
