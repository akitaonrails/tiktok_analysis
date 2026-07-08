package tikcast.api.privilege.enigma;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.privilege.enigma.EnigmaIAPPurchaseResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _EnigmaIAPPurchaseResponse_Data_ProtoDecoder implements C0IMD<EnigmaIAPPurchaseResponse.Data> {
    public static EnigmaIAPPurchaseResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnigmaIAPPurchaseResponse.Data data = new EnigmaIAPPurchaseResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        data.mpPayload = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    data.contractId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final EnigmaIAPPurchaseResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EnigmaIAPPurchaseResponse.Data data) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnigmaIAPPurchaseResponse.Data data, List list) {
    }
}
