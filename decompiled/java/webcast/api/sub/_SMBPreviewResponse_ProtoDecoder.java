package webcast.api.sub;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _SMBPreviewResponse_ProtoDecoder implements C0IMD<SMBPreviewResponse> {
    @Override // X.C0IMD
    public final void LIZ(SMBPreviewResponse sMBPreviewResponse) {
        SMBPreviewResponse.ResponseData responseData = sMBPreviewResponse.data;
        if (responseData != null) {
            _SMBPreviewResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final SMBPreviewResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SMBPreviewResponse sMBPreviewResponse = new SMBPreviewResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    sMBPreviewResponse.data = _SMBPreviewResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sMBPreviewResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBPreviewResponse sMBPreviewResponse, List list) {
    }
}
