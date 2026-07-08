package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DestroyRequestResponse_ProtoDecoder implements C0IMD<DestroyRequestResponse> {
    @Override // X.C0IMD
    public final void LIZ(DestroyRequestResponse destroyRequestResponse) {
        LinkMicCommonResp linkMicCommonResp = destroyRequestResponse.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
    }

    @Override // X.C0IMD
    public final DestroyRequestResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        DestroyRequestResponse destroyRequestResponse = new DestroyRequestResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    destroyRequestResponse.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return destroyRequestResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DestroyRequestResponse destroyRequestResponse, List list) {
    }
}
