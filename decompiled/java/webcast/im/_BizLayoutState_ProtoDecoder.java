package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BizLayoutState_ProtoDecoder implements C0IMD<BizLayoutState> {
    public static BizLayoutState LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizLayoutState bizLayoutState = new BizLayoutState();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        CoHostBizLayoutExtra coHostBizLayoutExtra = new CoHostBizLayoutExtra();
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        while (c1516680pZS.LJI() != -1) {
                            C1516700pZU.LJ(c1516680pZS);
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        bizLayoutState.coHostBizLayoutExtra = coHostBizLayoutExtra;
                    }
                } else {
                    bizLayoutState.multiGuestBizLayoutExtra = _MultiGuestBizLayoutExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizLayoutState;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizLayoutState bizLayoutState) {
    }

    @Override // X.C0IMD
    public final BizLayoutState LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizLayoutState bizLayoutState, List list) {
    }
}
