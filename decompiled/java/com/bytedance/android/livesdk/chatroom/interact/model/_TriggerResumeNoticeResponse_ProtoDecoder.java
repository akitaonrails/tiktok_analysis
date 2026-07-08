package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerResumeNoticeResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TriggerResumeNoticeResponse_ProtoDecoder implements C0IMD<TriggerResumeNoticeResponse> {
    @Override // X.C0IMD
    public final void LIZ(TriggerResumeNoticeResponse triggerResumeNoticeResponse) {
    }

    @Override // X.C0IMD
    public final TriggerResumeNoticeResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TriggerResumeNoticeResponse triggerResumeNoticeResponse = new TriggerResumeNoticeResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    TriggerResumeNoticeResponse.ResponseData responseData = new TriggerResumeNoticeResponse.ResponseData();
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    while (c1516680pZS.LJI() != -1) {
                        C1516700pZU.LJ(c1516680pZS);
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    triggerResumeNoticeResponse.data = responseData;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return triggerResumeNoticeResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TriggerResumeNoticeResponse triggerResumeNoticeResponse, List list) {
    }
}
