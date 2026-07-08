package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RealtimeLiveCenterShopData_ProtoDecoder implements C0IMD<RealtimeLiveCenterShopData> {
    public static RealtimeLiveCenterShopData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RealtimeLiveCenterShopData realtimeLiveCenterShopData = new RealtimeLiveCenterShopData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 6) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                realtimeLiveCenterShopData.buyers = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            realtimeLiveCenterShopData.unitSales = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        realtimeLiveCenterShopData.revenueAmount = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    realtimeLiveCenterShopData.showShopData = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return realtimeLiveCenterShopData;
            }
        }
    }

    @Override // X.C0IMD
    public final RealtimeLiveCenterShopData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RealtimeLiveCenterShopData realtimeLiveCenterShopData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RealtimeLiveCenterShopData realtimeLiveCenterShopData, List list) {
    }
}
