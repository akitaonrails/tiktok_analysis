package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FlashSaleStock_ProtoDecoder implements C0IMD<FlashSaleStock> {
    public static FlashSaleStock LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FlashSaleStock flashSaleStock = new FlashSaleStock();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                flashSaleStock.totalStock = c1516680pZS.LJIIJ();
                            }
                        } else {
                            flashSaleStock.activityStockText = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        flashSaleStock.activityStock = c1516680pZS.LJIIJ();
                    }
                } else {
                    flashSaleStock.activityStockStatus = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return flashSaleStock;
            }
        }
    }

    @Override // X.C0IMD
    public final FlashSaleStock LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FlashSaleStock flashSaleStock) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FlashSaleStock flashSaleStock, List list) {
    }
}
