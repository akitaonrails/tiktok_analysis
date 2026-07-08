package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerReserveNoticeResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TriggerReserveNoticeResponse_ResponseData_ProtoDecoder implements C0IMD<TriggerReserveNoticeResponse.ResponseData> {
    @Override // X.C0IMD
    public final TriggerReserveNoticeResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TriggerReserveNoticeResponse.ResponseData responseData = new TriggerReserveNoticeResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return responseData;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TriggerReserveNoticeResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TriggerReserveNoticeResponse.ResponseData responseData, List list) {
    }
}
