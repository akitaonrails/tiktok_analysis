package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftEffectAckResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftEffectAckResponse_ProtoDecoder implements C0IMD<GiftEffectAckResponse> {
    @Override // X.C0IMD
    public final void LIZ(GiftEffectAckResponse giftEffectAckResponse) {
    }

    @Override // X.C0IMD
    public final GiftEffectAckResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftEffectAckResponse giftEffectAckResponse = new GiftEffectAckResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    GiftEffectAckResponse.Data data = new GiftEffectAckResponse.Data();
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    while (c1516680pZS.LJI() != -1) {
                        C1516700pZU.LJ(c1516680pZS);
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    giftEffectAckResponse.data = data;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftEffectAckResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftEffectAckResponse giftEffectAckResponse, List list) {
    }
}
