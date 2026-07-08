package tikcast.api.privilege.enigma;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnigmaIAPPurchaseResponse_ProtoDecoder implements C0IMD<EnigmaIAPPurchaseResponse> {
    @Override // X.C0IMD
    public final void LIZ(EnigmaIAPPurchaseResponse enigmaIAPPurchaseResponse) {
    }

    @Override // X.C0IMD
    public final EnigmaIAPPurchaseResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EnigmaIAPPurchaseResponse enigmaIAPPurchaseResponse = new EnigmaIAPPurchaseResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    enigmaIAPPurchaseResponse.data = _EnigmaIAPPurchaseResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enigmaIAPPurchaseResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnigmaIAPPurchaseResponse enigmaIAPPurchaseResponse, List list) {
    }
}
