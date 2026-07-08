package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.anchor.AnchorAdminListResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorAdminListResponse_ProtoDecoder implements C0IMD<AnchorAdminListResponse> {
    @Override // X.C0IMD
    public final void LIZ(AnchorAdminListResponse anchorAdminListResponse) {
        AnchorAdminListResponse.Data data = anchorAdminListResponse.data;
        if (data != null) {
            _AnchorAdminListResponse_Data_ProtoDecoder.LJ(data);
        }
    }

    @Override // X.C0IMD
    public final AnchorAdminListResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AnchorAdminListResponse anchorAdminListResponse = new AnchorAdminListResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    anchorAdminListResponse.data = _AnchorAdminListResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorAdminListResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorAdminListResponse anchorAdminListResponse, List list) {
    }
}
