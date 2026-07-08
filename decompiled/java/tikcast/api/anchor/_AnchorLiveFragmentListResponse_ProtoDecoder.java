package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.anchor.AnchorLiveFragmentListResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorLiveFragmentListResponse_ProtoDecoder implements C0IMD<AnchorLiveFragmentListResponse> {
    @Override // X.C0IMD
    public final void LIZ(AnchorLiveFragmentListResponse anchorLiveFragmentListResponse) {
        AnchorLiveFragmentListResponse.ResponseData responseData = anchorLiveFragmentListResponse.data;
        if (responseData != null) {
            _AnchorLiveFragmentListResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final AnchorLiveFragmentListResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AnchorLiveFragmentListResponse anchorLiveFragmentListResponse = new AnchorLiveFragmentListResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    anchorLiveFragmentListResponse.data = _AnchorLiveFragmentListResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorLiveFragmentListResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorLiveFragmentListResponse anchorLiveFragmentListResponse, List list) {
    }
}
