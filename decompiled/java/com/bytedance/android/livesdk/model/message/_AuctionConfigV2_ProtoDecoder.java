package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AuctionConfigV2_ProtoDecoder implements C0IMD<AuctionConfigV2> {
    public static AuctionConfigV2 LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AuctionConfigV2 auctionConfigV2 = new AuctionConfigV2();
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
                                    auctionConfigV2.surpriseSet = _SurpriseSet_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                auctionConfigV2.auctionCardType = c1516680pZS.LJIIJ();
                            }
                        } else {
                            auctionConfigV2.auctionConfigType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        auctionConfigV2.auctionConfigId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    auctionConfigV2.auctionItem = _AuctionItem_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return auctionConfigV2;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AuctionConfigV2 auctionConfigV2) {
        SurpriseSet surpriseSet = auctionConfigV2.surpriseSet;
        if (surpriseSet != null) {
            _SurpriseSet_ProtoDecoder.LJ(surpriseSet);
        }
    }

    @Override // X.C0IMD
    public final AuctionConfigV2 LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AuctionConfigV2 auctionConfigV2, List list) {
    }
}
