package tikcast.api.boost;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.boost.ConsumeCardResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _ConsumeCardResponse_Data_ProtoDecoder implements C0IMD<ConsumeCardResponse.Data> {
    public static ConsumeCardResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ConsumeCardResponse.Data data = new ConsumeCardResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    data.boostEndTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final ConsumeCardResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ConsumeCardResponse.Data data) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ConsumeCardResponse.Data data, List list) {
    }
}
