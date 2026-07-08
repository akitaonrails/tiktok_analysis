package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LayoutState_ProtoDecoder implements C0IMD<LayoutState> {
    public static LayoutState LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LayoutState layoutState = new LayoutState();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        layoutState.layoutId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        layoutState.layoutKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        layoutState.multiGuestLayoutExtra = _MultiGuestLayoutExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        layoutState.multiGuestLayoutNonSeiExtra = _MultiGuestLayoutNonSeiExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        layoutState.cohostLayoutExtra = _CohostTypeLayoutExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        CohostTypeLayoutNonSeiExtra cohostTypeLayoutNonSeiExtra = new CohostTypeLayoutNonSeiExtra();
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        while (c1516680pZS.LJI() != -1) {
                            C1516700pZU.LJ(c1516680pZS);
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        layoutState.cohostLayoutNonSeiExtra = cohostTypeLayoutNonSeiExtra;
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return layoutState;
            }
        }
    }

    public static void LJ(LayoutState layoutState) {
        MultiGuestLayoutExtra multiGuestLayoutExtra = layoutState.multiGuestLayoutExtra;
        MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtra = layoutState.multiGuestLayoutNonSeiExtra;
    }

    @Override // X.C0IMD
    public final void LIZ(LayoutState layoutState) {
        LJ(layoutState);
    }

    @Override // X.C0IMD
    public final LayoutState LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LayoutState layoutState, List list) {
    }
}
