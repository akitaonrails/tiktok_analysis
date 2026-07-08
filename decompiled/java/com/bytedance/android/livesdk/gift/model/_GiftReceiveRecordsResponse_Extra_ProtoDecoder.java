package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftReceiveRecordsResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftReceiveRecordsResponse_Extra_ProtoDecoder implements C0IMD<GiftReceiveRecordsResponse.Extra> {
    public static GiftReceiveRecordsResponse.Extra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftReceiveRecordsResponse.Extra extra = new GiftReceiveRecordsResponse.Extra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    extra.logId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return extra;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftReceiveRecordsResponse.Extra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftReceiveRecordsResponse.Extra extra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftReceiveRecordsResponse.Extra extra, List list) {
    }
}
