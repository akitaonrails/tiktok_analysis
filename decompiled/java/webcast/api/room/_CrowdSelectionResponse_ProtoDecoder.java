package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CrowdSelectionResponse_ProtoDecoder implements C0IMD<CrowdSelectionResponse> {
    @Override // X.C0IMD
    public final void LIZ(CrowdSelectionResponse crowdSelectionResponse) {
    }

    @Override // X.C0IMD
    public final CrowdSelectionResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CrowdSelectionResponse crowdSelectionResponse = new CrowdSelectionResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    crowdSelectionResponse.data = _CrowdSelectionResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return crowdSelectionResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CrowdSelectionResponse crowdSelectionResponse, List list) {
    }
}
