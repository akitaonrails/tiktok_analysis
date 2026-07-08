package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BillboardProductPrice_ProtoDecoder implements C0IMD<BillboardProductPrice> {
    public static BillboardProductPrice LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BillboardProductPrice billboardProductPrice = new BillboardProductPrice();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    billboardProductPrice.currency = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                billboardProductPrice.promotionPriceWithCurrency = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            billboardProductPrice.originalPriceWithCurrency = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        billboardProductPrice.promotionPrice = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    billboardProductPrice.originalPrice = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return billboardProductPrice;
            }
        }
    }

    @Override // X.C0IMD
    public final BillboardProductPrice LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BillboardProductPrice billboardProductPrice) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BillboardProductPrice billboardProductPrice, List list) {
    }
}
