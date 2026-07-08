package webcast.api.anchor_tool;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EffectBeautySuggestionResponse_ProtoDecoder implements C0IMD<EffectBeautySuggestionResponse> {
    @Override // X.C0IMD
    public final void LIZ(EffectBeautySuggestionResponse effectBeautySuggestionResponse) {
    }

    @Override // X.C0IMD
    public final EffectBeautySuggestionResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EffectBeautySuggestionResponse effectBeautySuggestionResponse = new EffectBeautySuggestionResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    effectBeautySuggestionResponse.data = _EffectBeautySuggestionResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return effectBeautySuggestionResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectBeautySuggestionResponse effectBeautySuggestionResponse, List list) {
    }
}
