package tikcast.api.privilege.enigma;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.privilege.enigma.EnigmaUserDetailsResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _EnigmaUserDetailsResponse_Data_ProtoDecoder implements C0IMD<EnigmaUserDetailsResponse.Data> {
    public static EnigmaUserDetailsResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnigmaUserDetailsResponse.Data data = new EnigmaUserDetailsResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        data.subInfo = _EnigmaSubscriptionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    data.userEnigma = _UserEnigma_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EnigmaUserDetailsResponse.Data data) {
    }

    @Override // X.C0IMD
    public final EnigmaUserDetailsResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnigmaUserDetailsResponse.Data data, List list) {
    }
}
