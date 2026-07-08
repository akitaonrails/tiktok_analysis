package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BizJoinChannelResponse_ProtoDecoder implements C0IMD<BizJoinChannelResponse> {
    public static BizJoinChannelResponse LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizJoinChannelResponse bizJoinChannelResponse = new BizJoinChannelResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    bizJoinChannelResponse.responseData = _BizJoinChannelResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizJoinChannelResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizJoinChannelResponse bizJoinChannelResponse) {
    }

    @Override // X.C0IMD
    public final BizJoinChannelResponse LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizJoinChannelResponse bizJoinChannelResponse, List list) {
    }
}
