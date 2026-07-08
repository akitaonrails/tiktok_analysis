package webcast.api.game;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.game.CreateInfoResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _CreateInfoResponse_ProtoDecoder implements C0IMD<CreateInfoResponse> {
    @Override // X.C0IMD
    public final void LIZ(CreateInfoResponse createInfoResponse) {
        CreateInfoResponse.ResponseData responseData = createInfoResponse.data;
        if (responseData != null) {
            _CreateInfoResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final CreateInfoResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CreateInfoResponse createInfoResponse = new CreateInfoResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    createInfoResponse.data = _CreateInfoResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return createInfoResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CreateInfoResponse createInfoResponse, List list) {
    }
}
