package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftListByCreatorResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftListByCreatorResponse_ProtoDecoder implements C0IMD<GiftListByCreatorResponse> {
    @Override // X.C0IMD
    public final void LIZ(GiftListByCreatorResponse giftListByCreatorResponse) {
        GiftListByCreatorResponse.Data data = giftListByCreatorResponse.data;
        if (data != null) {
            _GiftListByCreatorResponse_Data_ProtoDecoder.LJ(data);
        }
    }

    @Override // X.C0IMD
    public final GiftListByCreatorResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftListByCreatorResponse giftListByCreatorResponse = new GiftListByCreatorResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftListByCreatorResponse.extra = _GiftListByCreatorResponse_Extra_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftListByCreatorResponse.data = _GiftListByCreatorResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftListByCreatorResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftListByCreatorResponse giftListByCreatorResponse, List list) {
    }
}
