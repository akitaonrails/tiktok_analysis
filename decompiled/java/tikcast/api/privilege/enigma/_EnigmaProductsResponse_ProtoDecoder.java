package tikcast.api.privilege.enigma;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.privilege.enigma.EnigmaProductsResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _EnigmaProductsResponse_ProtoDecoder implements C0IMD<EnigmaProductsResponse> {
    @Override // X.C0IMD
    public final void LIZ(EnigmaProductsResponse enigmaProductsResponse) {
        EnigmaProductsResponse.Data data = enigmaProductsResponse.data;
        if (data != null) {
            _EnigmaProductsResponse_Data_ProtoDecoder.LJ(data);
        }
    }

    @Override // X.C0IMD
    public final EnigmaProductsResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EnigmaProductsResponse enigmaProductsResponse = new EnigmaProductsResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    enigmaProductsResponse.data = _EnigmaProductsResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enigmaProductsResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnigmaProductsResponse enigmaProductsResponse, List list) {
    }
}
