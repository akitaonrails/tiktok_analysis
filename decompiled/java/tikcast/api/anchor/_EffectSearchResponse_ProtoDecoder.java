package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.anchor.EffectSearchResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _EffectSearchResponse_ProtoDecoder implements C0IMD<EffectSearchResponse> {
    @Override // X.C0IMD
    public final void LIZ(EffectSearchResponse effectSearchResponse) {
        EffectSearchResponse.ResponseData responseData = effectSearchResponse.data;
        if (responseData != null) {
            _EffectSearchResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final EffectSearchResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EffectSearchResponse effectSearchResponse = new EffectSearchResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    effectSearchResponse.data = _EffectSearchResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return effectSearchResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectSearchResponse effectSearchResponse, List list) {
    }
}
