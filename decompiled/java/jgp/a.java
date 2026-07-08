package jgp;

import X.AbstractRunnableC21377818lM;
import X.C1437790nWD;
import X.C1661700tLM;
import X.C2179971ATj;
import X.C278290AvT;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class a extends AbstractRunnableC21377818lM implements InterfaceC1408530ml1 {
    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    public a() {
        LJ(AFwS266S0000000_25.get$arr$(447));
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return C278290AvT.LIZ() ? EnumC194317110p.P3 : EnumC194317110p.P1;
    }

    @Override // X.AbstractRunnableC21377818lM, java.lang.Runnable, X.InterfaceC1408530ml1
    public final void run() {
        try {
            C1437790nWD.LIZ = C1661700tLM.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }
}
