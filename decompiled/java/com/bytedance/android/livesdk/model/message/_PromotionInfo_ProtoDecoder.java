package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PromotionInfo_ProtoDecoder implements C0IMD<PromotionInfo> {
    public static PromotionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PromotionInfo promotionInfo = new PromotionInfo();
        promotionInfo.productIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 100) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            promotionInfo.productIds.add(C1516700pZU.LIZLLL(c1516680pZS));
                        }
                    } else {
                        promotionInfo.failedMessage = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    promotionInfo.promotionId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return promotionInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PromotionInfo promotionInfo) {
        PromotionInfo promotionInfo2 = promotionInfo;
        if (promotionInfo2.productIds == null) {
            promotionInfo2.productIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final PromotionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PromotionInfo promotionInfo, List list) {
    }
}
