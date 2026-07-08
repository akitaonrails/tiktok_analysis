package webcast.api.linkmic;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.linkmic.LeaveResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _LeaveResponse_ResponseData_ProtoDecoder implements C0IMD<LeaveResponse.ResponseData> {
    @Override // X.C0IMD
    public final LeaveResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LeaveResponse.ResponseData responseData = new LeaveResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.feedbackShowReason = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LeaveResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LeaveResponse.ResponseData responseData, List list) {
    }
}
