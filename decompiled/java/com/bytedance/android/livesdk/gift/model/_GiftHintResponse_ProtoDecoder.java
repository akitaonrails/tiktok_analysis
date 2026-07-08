package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftHintResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftHintResponse_ProtoDecoder implements C0IMD<GiftHintResponse> {
    @Override // X.C0IMD
    public final void LIZ(GiftHintResponse giftHintResponse) {
        GiftHintResponse.Data data = giftHintResponse.data;
        if (data != null) {
            _GiftHintResponse_Data_ProtoDecoder.LJ(data);
        }
    }

    @Override // X.C0IMD
    public final GiftHintResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftHintResponse giftHintResponse = new GiftHintResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    giftHintResponse.data = _GiftHintResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftHintResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftHintResponse giftHintResponse, List list) {
    }
}
