package jgp;

import X.C01GW;
import X.C0C64;
import X.C1661680tLK;
import X.C452501pT;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import X.InterfaceC1661690tLL;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class h extends g3a.a implements InterfaceC1408530ml1 {
    public final C01GW LLIZLLLIL;

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        ((InterfaceC1661690tLL) this.LLIZLLLIL.getValue()).LIZ(new C1661680tLK(this));
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "tool_hdr_strategy", true) != 0) {
            ((InterfaceC1661690tLL) this.LLIZLLLIL.getValue()).LIZIZ(new String[]{"lens_hdr"}, null);
        }
    }

    public h() {
        LJ(AFwS266S0000000_25.get$arr$(450));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(445));
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P1;
    }
}
