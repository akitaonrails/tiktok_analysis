package webcast.data.multilive_biz;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.data.multilive_biz.BizLeaveResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BizLeaveResponse_ResponseData_ProtoDecoder implements C0IMD<BizLeaveResponse.ResponseData> {
    public static BizLeaveResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizLeaveResponse.ResponseData responseData = new BizLeaveResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.isApplyHangup = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final BizLeaveResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BizLeaveResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizLeaveResponse.ResponseData responseData, List list) {
    }
}
