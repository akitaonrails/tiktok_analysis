package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BizSpotExtra_ProtoDecoder implements C0IMD<BizSpotExtra> {
    public static BizSpotExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizSpotExtra bizSpotExtra = new BizSpotExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        CoHostBizSpotExtra coHostBizSpotExtra = new CoHostBizSpotExtra();
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        while (c1516680pZS.LJI() != -1) {
                            C1516700pZU.LJ(c1516680pZS);
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        bizSpotExtra.coHostBizSpotExtra = coHostBizSpotExtra;
                    }
                } else {
                    bizSpotExtra.multiGuestBizSpotExtra = _MultiGuestBizSpotExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizSpotExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizSpotExtra bizSpotExtra) {
    }

    @Override // X.C0IMD
    public final BizSpotExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizSpotExtra bizSpotExtra, List list) {
    }
}
