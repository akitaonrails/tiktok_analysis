package tikcast.api.privilege.enigma;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.privilege.enigma.EnigmaIAPReceiptResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _EnigmaIAPReceiptResponse_Data_ProtoDecoder implements C0IMD<EnigmaIAPReceiptResponse.Data> {
    public static EnigmaIAPReceiptResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnigmaIAPReceiptResponse.Data data = new EnigmaIAPReceiptResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            data.subInfo = _EnigmaSubscriptionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        data.userEnigma = _UserEnigma_ProtoDecoder.LIZLLL(c1516680pZS);
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
    public final void LIZ(EnigmaIAPReceiptResponse.Data data) {
    }

    @Override // X.C0IMD
    public final EnigmaIAPReceiptResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnigmaIAPReceiptResponse.Data data, List list) {
    }
}
