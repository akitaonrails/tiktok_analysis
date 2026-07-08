package tikcast.api.privilege.enigma;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnigmaUserDetailsResponse_ProtoDecoder implements C0IMD<EnigmaUserDetailsResponse> {
    @Override // X.C0IMD
    public final void LIZ(EnigmaUserDetailsResponse enigmaUserDetailsResponse) {
    }

    @Override // X.C0IMD
    public final EnigmaUserDetailsResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EnigmaUserDetailsResponse enigmaUserDetailsResponse = new EnigmaUserDetailsResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    enigmaUserDetailsResponse.data = _EnigmaUserDetailsResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enigmaUserDetailsResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnigmaUserDetailsResponse enigmaUserDetailsResponse, List list) {
    }
}
