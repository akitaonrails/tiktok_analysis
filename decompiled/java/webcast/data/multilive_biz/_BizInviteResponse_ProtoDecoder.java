package webcast.data.multilive_biz;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.data.multilive_biz.BizInviteResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BizInviteResponse_ProtoDecoder implements C0IMD<BizInviteResponse> {
    public static BizInviteResponse LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizInviteResponse bizInviteResponse = new BizInviteResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    bizInviteResponse.data = _BizInviteResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizInviteResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizInviteResponse bizInviteResponse) {
        BizInviteResponse.ResponseData responseData = bizInviteResponse.data;
        if (responseData != null) {
            _BizInviteResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final BizInviteResponse LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizInviteResponse bizInviteResponse, List list) {
    }
}
