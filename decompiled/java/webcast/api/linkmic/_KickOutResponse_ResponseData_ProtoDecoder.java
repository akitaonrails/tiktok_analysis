package webcast.api.linkmic;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.linkmic.KickOutResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _KickOutResponse_ResponseData_ProtoDecoder implements C0IMD<KickOutResponse.ResponseData> {
    @Override // X.C0IMD
    public final KickOutResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        KickOutResponse.ResponseData responseData = new KickOutResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return responseData;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(KickOutResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, KickOutResponse.ResponseData responseData, List list) {
    }
}
