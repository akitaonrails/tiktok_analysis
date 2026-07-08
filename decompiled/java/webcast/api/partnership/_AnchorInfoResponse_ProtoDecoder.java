package webcast.api.partnership;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.partnership.AnchorInfoResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorInfoResponse_ProtoDecoder implements C0IMD<AnchorInfoResponse> {
    @Override // X.C0IMD
    public final void LIZ(AnchorInfoResponse anchorInfoResponse) {
        AnchorInfoResponse.ResponseData responseData = anchorInfoResponse.data;
        if (responseData != null) {
            _AnchorInfoResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final AnchorInfoResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AnchorInfoResponse anchorInfoResponse = new AnchorInfoResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    anchorInfoResponse.data = _AnchorInfoResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorInfoResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorInfoResponse anchorInfoResponse, List list) {
    }
}
