package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerReserveNoticeResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TriggerReserveNoticeResponse_ProtoDecoder implements C0IMD<TriggerReserveNoticeResponse> {
    @Override // X.C0IMD
    public final void LIZ(TriggerReserveNoticeResponse triggerReserveNoticeResponse) {
    }

    @Override // X.C0IMD
    public final TriggerReserveNoticeResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TriggerReserveNoticeResponse triggerReserveNoticeResponse = new TriggerReserveNoticeResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    TriggerReserveNoticeResponse.ResponseData responseData = new TriggerReserveNoticeResponse.ResponseData();
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    while (c1516680pZS.LJI() != -1) {
                        C1516700pZU.LJ(c1516680pZS);
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    triggerReserveNoticeResponse.data = responseData;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return triggerReserveNoticeResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TriggerReserveNoticeResponse triggerReserveNoticeResponse, List list) {
    }
}
