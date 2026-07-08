package webcast.data.cohost_biz;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.data.cohost_biz.BizRechargeResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BizRechargeResponse_ProtoDecoder implements C0IMD<BizRechargeResponse> {
    public static BizRechargeResponse LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizRechargeResponse bizRechargeResponse = new BizRechargeResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    bizRechargeResponse.data = _BizRechargeResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizRechargeResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizRechargeResponse bizRechargeResponse) {
        BizRechargeResponse.ResponseData responseData = bizRechargeResponse.data;
        if (responseData != null) {
            _BizRechargeResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final BizRechargeResponse LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizRechargeResponse bizRechargeResponse, List list) {
    }
}
