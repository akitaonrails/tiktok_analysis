package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BizCreateChannelResponse_ProtoDecoder implements C0IMD<BizCreateChannelResponse> {
    public static BizCreateChannelResponse LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizCreateChannelResponse bizCreateChannelResponse = new BizCreateChannelResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    bizCreateChannelResponse.responseData = _BizCreateChannelResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizCreateChannelResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizCreateChannelResponse bizCreateChannelResponse) {
        BizCreateChannelResponseData bizCreateChannelResponseData = bizCreateChannelResponse.responseData;
        if (bizCreateChannelResponseData != null) {
            _BizCreateChannelResponseData_ProtoDecoder.LJ(bizCreateChannelResponseData);
        }
    }

    @Override // X.C0IMD
    public final BizCreateChannelResponse LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizCreateChannelResponse bizCreateChannelResponse, List list) {
    }
}
