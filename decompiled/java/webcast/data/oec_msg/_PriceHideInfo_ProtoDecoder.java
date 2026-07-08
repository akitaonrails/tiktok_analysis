package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PriceHideInfo_ProtoDecoder implements C0IMD<PriceHideInfo> {
    public static PriceHideInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PriceHideInfo priceHideInfo = new PriceHideInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    priceHideInfo.displayText = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return priceHideInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final PriceHideInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PriceHideInfo priceHideInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PriceHideInfo priceHideInfo, List list) {
    }
}
