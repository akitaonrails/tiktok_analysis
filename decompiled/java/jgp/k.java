package jgp;

import X.AbstractRunnableC21377818lM;
import X.C0ASV;
import X.C0FGC;
import X.C1661800tLW;
import X.C2179971ATj;
import X.C278290AvT;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class k extends AbstractRunnableC21377818lM implements InterfaceC1408530ml1 {
    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractRunnableC21377818lM, java.lang.Runnable, X.InterfaceC1408530ml1
    public final void run() {
        try {
            C0FGC.LIZ(2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        if (((Boolean) C0ASV.LIZ.getValue()).booleanValue()) {
            return EnumC194317110p.P1;
        }
        if (C278290AvT.LIZ()) {
            return EnumC194317110p.P3;
        }
        int iLIZ = C1661800tLW.LIZ();
        return iLIZ != 1 ? iLIZ != 2 ? EnumC194317110p.P1 : EnumC194317110p.P3 : EnumC194317110p.P1;
    }

    public k() {
        LJ(AFwS266S0000000_25.get$arr$(451));
    }
}
