package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftListAckResponse_ProtoDecoder implements C0IMD<GiftListAckResponse> {
    @Override // X.C0IMD
    public final void LIZ(GiftListAckResponse giftListAckResponse) {
    }

    @Override // X.C0IMD
    public final GiftListAckResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftListAckResponse giftListAckResponse = new GiftListAckResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 2) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    giftListAckResponse.extra = _GiftListAckResponse_Extra_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftListAckResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftListAckResponse giftListAckResponse, List list) {
    }
}
