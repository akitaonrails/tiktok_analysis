package jgp;

import X.C01GW;
import X.C1660660tJg;
import X.C1661800tLW;
import X.C452501pT;
import X.C823050WQl;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import Y.ARunnableS125S0100000_25;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class t extends g3a.a implements InterfaceC1408530ml1 {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(446));

    @Override // X.InterfaceC1408530ml1
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    public t() {
        LJ(AFwS266S0000000_25.get$arr$(456));
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        int iLIZ = C1661800tLW.LIZ();
        return iLIZ != 1 ? iLIZ != 2 ? EnumC194317110p.P1 : EnumC194317110p.P3 : EnumC194317110p.P2;
    }

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        if (C1661800tLW.LIZIZ()) {
            C823050WQl.LIZLLL().submit(new ARunnableS125S0100000_25(this, 80));
        } else {
            C1660660tJg.LIZ().LIZIZ(new IFoundationAVService.IFetchResourcesListener() { // from class: X.0tJf
                @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                public final void onFailed(Exception exc) {
                    this.LIZ.LJIIJ();
                }

                @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                public final void onSuccess(String[] strArr) {
                    this.LIZ.LJIIJ();
                }
            });
        }
    }
}
