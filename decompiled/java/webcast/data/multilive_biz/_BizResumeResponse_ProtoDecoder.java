package webcast.data.multilive_biz;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.data.multilive_biz.BizResumeResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BizResumeResponse_ProtoDecoder implements C0IMD<BizResumeResponse> {
    public static BizResumeResponse LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizResumeResponse bizResumeResponse = new BizResumeResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    bizResumeResponse.data = _BizResumeResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizResumeResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizResumeResponse bizResumeResponse) {
        BizResumeResponse.ResponseData responseData = bizResumeResponse.data;
        if (responseData != null) {
            _BizResumeResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final BizResumeResponse LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizResumeResponse bizResumeResponse, List list) {
    }
}
