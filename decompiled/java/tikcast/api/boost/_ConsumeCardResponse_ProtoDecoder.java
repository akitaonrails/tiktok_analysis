package tikcast.api.boost;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ConsumeCardResponse_ProtoDecoder implements C0IMD<ConsumeCardResponse> {
    @Override // X.C0IMD
    public final void LIZ(ConsumeCardResponse consumeCardResponse) {
    }

    @Override // X.C0IMD
    public final ConsumeCardResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ConsumeCardResponse consumeCardResponse = new ConsumeCardResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    consumeCardResponse.data = _ConsumeCardResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return consumeCardResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ConsumeCardResponse consumeCardResponse, List list) {
    }
}
