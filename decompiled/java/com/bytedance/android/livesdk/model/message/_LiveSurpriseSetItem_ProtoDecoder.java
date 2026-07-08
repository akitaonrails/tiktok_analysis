package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveSurpriseSetItem_ProtoDecoder implements C0IMD<LiveSurpriseSetItem> {
    public static LiveSurpriseSetItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveSurpriseSetItem liveSurpriseSetItem = new LiveSurpriseSetItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveSurpriseSetItem.productId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        liveSurpriseSetItem.productName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        liveSurpriseSetItem.skuId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        liveSurpriseSetItem.skuDesc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        liveSurpriseSetItem.totalQuantity = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        liveSurpriseSetItem.leftQuantity = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        liveSurpriseSetItem.probability = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveSurpriseSetItem;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveSurpriseSetItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveSurpriseSetItem liveSurpriseSetItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveSurpriseSetItem liveSurpriseSetItem, List list) {
    }
}
