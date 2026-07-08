package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CancelApplyResponse_ProtoDecoder implements C0IMD<CancelApplyResponse> {
    @Override // X.C0IMD
    public final void LIZ(CancelApplyResponse cancelApplyResponse) {
        LinkMicCommonResp linkMicCommonResp = cancelApplyResponse.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
    }

    @Override // X.C0IMD
    public final CancelApplyResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CancelApplyResponse cancelApplyResponse = new CancelApplyResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    cancelApplyResponse.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cancelApplyResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CancelApplyResponse cancelApplyResponse, List list) {
    }
}
