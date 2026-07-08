package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SurpriseSetExtra_ProtoDecoder implements C0IMD<SurpriseSetExtra> {
    public static SurpriseSetExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SurpriseSetExtra surpriseSetExtra = new SurpriseSetExtra();
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
                                    surpriseSetExtra.quantityDeductionTime = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                surpriseSetExtra.auctionItemSkuVariantDescription = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            surpriseSetExtra.auctionItemProductName = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        surpriseSetExtra.auctionItemSkuId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    surpriseSetExtra.auctionItemProductId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return surpriseSetExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final SurpriseSetExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SurpriseSetExtra surpriseSetExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SurpriseSetExtra surpriseSetExtra, List list) {
    }
}
