package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostListResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostListResponse_ProtoDecoder implements C0IMD<CohostListResponse> {
    @Override // X.C0IMD
    public final void LIZ(CohostListResponse cohostListResponse) {
        CohostListResponse.ResponseData responseData = cohostListResponse.data;
        if (responseData != null) {
            _CohostListResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final CohostListResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CohostListResponse cohostListResponse = new CohostListResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    cohostListResponse.data = _CohostListResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostListResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostListResponse cohostListResponse, List list) {
    }
}
