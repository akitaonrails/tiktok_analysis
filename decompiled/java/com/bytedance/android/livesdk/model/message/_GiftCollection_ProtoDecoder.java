package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftCollection_ProtoDecoder implements C0IMD<GiftCollection> {
    public static GiftCollection LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftCollection giftCollection = new GiftCollection();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftCollection.round = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        giftCollection.effectNameKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftCollection.gift = _Gift_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        giftCollection.messageType = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        giftCollection.isFilterHost = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        giftCollection.schemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftCollection;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftCollection giftCollection) {
        Gift gift = giftCollection.gift;
        if (gift != null) {
            _Gift_ProtoDecoder.LJ(gift);
        }
    }

    @Override // X.C0IMD
    public final GiftCollection LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftCollection giftCollection, List list) {
    }
}
