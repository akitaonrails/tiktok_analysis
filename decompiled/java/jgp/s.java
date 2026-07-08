package jgp;

import X.AbstractRunnableC21377818lM;
import X.C0CHQ;
import X.C278290AvT;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class s extends AbstractRunnableC21377818lM implements InterfaceC1408530ml1 {
    public boolean LLILZLL;

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
        boolean zLIZ;
        try {
            if (this.LLILZLL) {
                return;
            }
            C0CHQ.LIZ().LJJIIJ().LIZ();
            this.LLILZLL = true;
        } finally {
            if (!zLIZ) {
            }
        }
    }

    public s() {
        LJ(AFwS266S0000000_25.get$arr$(455));
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return C278290AvT.LIZ() ? EnumC194317110p.P3 : EnumC194317110p.P2;
    }
}
