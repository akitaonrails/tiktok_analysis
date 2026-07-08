package webcast.data.cohost_biz;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.data.cohost_biz.BizMigrateGroupResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BizMigrateGroupResponse_ProtoDecoder implements C0IMD<BizMigrateGroupResponse> {
    public static BizMigrateGroupResponse LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizMigrateGroupResponse bizMigrateGroupResponse = new BizMigrateGroupResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    bizMigrateGroupResponse.data = _BizMigrateGroupResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizMigrateGroupResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizMigrateGroupResponse bizMigrateGroupResponse) {
        BizMigrateGroupResponse.ResponseData responseData = bizMigrateGroupResponse.data;
        if (responseData != null) {
            _BizMigrateGroupResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final BizMigrateGroupResponse LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizMigrateGroupResponse bizMigrateGroupResponse, List list) {
    }
}
