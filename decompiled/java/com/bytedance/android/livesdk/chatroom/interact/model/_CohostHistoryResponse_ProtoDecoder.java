package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostHistoryResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostHistoryResponse_ProtoDecoder implements C0IMD<CohostHistoryResponse> {
    @Override // X.C0IMD
    public final void LIZ(CohostHistoryResponse cohostHistoryResponse) {
        CohostHistoryResponse.ResponseData responseData = cohostHistoryResponse.data;
        if (responseData != null) {
            _CohostHistoryResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final CohostHistoryResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CohostHistoryResponse cohostHistoryResponse = new CohostHistoryResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    cohostHistoryResponse.data = _CohostHistoryResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostHistoryResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostHistoryResponse cohostHistoryResponse, List list) {
    }
}
