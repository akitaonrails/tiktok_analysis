package com.bytedance.android.livesdk.model.message.ext;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class _PopProduct_ProtoDecoder implements C0IMD<PopProduct> {
    public static PopProduct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PopProduct popProduct = new PopProduct();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        popProduct.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        popProduct.price = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        popProduct.imageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        popProduct.openUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        popProduct.productType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        popProduct.productId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        popProduct.source = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        popProduct.sourceFrom = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        popProduct.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        popProduct.platform = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        popProduct.productStatus = (int) c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return popProduct;
            }
        }
    }

    @Override // X.C0IMD
    public final PopProduct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PopProduct popProduct) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PopProduct popProduct, List list) {
    }
}
