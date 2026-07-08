package tikcast.api.privilege.enigma;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnigmaIAPReceiptResponse_ProtoDecoder implements C0IMD<EnigmaIAPReceiptResponse> {
    @Override // X.C0IMD
    public final void LIZ(EnigmaIAPReceiptResponse enigmaIAPReceiptResponse) {
    }

    @Override // X.C0IMD
    public final EnigmaIAPReceiptResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EnigmaIAPReceiptResponse enigmaIAPReceiptResponse = new EnigmaIAPReceiptResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    enigmaIAPReceiptResponse.data = _EnigmaIAPReceiptResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enigmaIAPReceiptResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnigmaIAPReceiptResponse enigmaIAPReceiptResponse, List list) {
    }
}
