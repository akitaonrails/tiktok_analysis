package tikcast.api.privilege.enigma;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class _PriceDetail_ProtoDecoder implements C0IMD<PriceDetail> {
    public static PriceDetail LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PriceDetail priceDetail = new PriceDetail();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        priceDetail.currency = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        priceDetail.originalPrice = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        priceDetail.originalPriceMicro = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        priceDetail.symbol = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        priceDetail.discountedPrice = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        priceDetail.discountedPriceMicro = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return priceDetail;
            }
        }
    }

    @Override // X.C0IMD
    public final PriceDetail LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PriceDetail priceDetail) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PriceDetail priceDetail, List list) {
    }
}
