package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ProductSnapShot_ProtoDecoder implements C0IMD<ProductSnapShot> {
    public static ProductSnapShot LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ProductSnapShot productSnapShot = new ProductSnapShot();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        productSnapShot.productId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        productSnapShot.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        productSnapShot.cover = _Img_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        productSnapShot.stockType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        productSnapShot.timestamp = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        productSnapShot.addToCartButton = _AddToCartButton_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return productSnapShot;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ProductSnapShot productSnapShot) {
    }

    @Override // X.C0IMD
    public final ProductSnapShot LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ProductSnapShot productSnapShot, List list) {
    }
}
