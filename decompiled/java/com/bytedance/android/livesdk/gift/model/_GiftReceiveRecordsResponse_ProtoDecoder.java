package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftReceiveRecordsResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftReceiveRecordsResponse_ProtoDecoder implements C0IMD<GiftReceiveRecordsResponse> {
    @Override // X.C0IMD
    public final void LIZ(GiftReceiveRecordsResponse giftReceiveRecordsResponse) {
        GiftReceiveRecordsResponse.Data data = giftReceiveRecordsResponse.data;
        if (data != null) {
            _GiftReceiveRecordsResponse_Data_ProtoDecoder.LJ(data);
        }
    }

    @Override // X.C0IMD
    public final GiftReceiveRecordsResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftReceiveRecordsResponse giftReceiveRecordsResponse = new GiftReceiveRecordsResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftReceiveRecordsResponse.extra = _GiftReceiveRecordsResponse_Extra_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftReceiveRecordsResponse.data = _GiftReceiveRecordsResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftReceiveRecordsResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftReceiveRecordsResponse giftReceiveRecordsResponse, List list) {
    }
}
