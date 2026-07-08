package tikcast.api.privilege.enigma;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.api.privilege.enigma.EnigmaProductsResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _EnigmaProductsResponse_Data_ProtoDecoder implements C0IMD<EnigmaProductsResponse.Data> {
    public static EnigmaProductsResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnigmaProductsResponse.Data data = new EnigmaProductsResponse.Data();
        data.enigmaProductDetails = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        data.remainingSubscriptionDays = c1516680pZS.LJIIJ();
                    }
                } else {
                    data.enigmaProductDetails.add(_EnigmaProductsResponse_Data_EnigmaIAPProductDetails_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    public static void LJ(EnigmaProductsResponse.Data data) {
        List<EnigmaProductsResponse.Data.EnigmaIAPProductDetails> list = data.enigmaProductDetails;
        if (list == null) {
            data.enigmaProductDetails = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<EnigmaProductsResponse.Data.EnigmaIAPProductDetails> it2 = data.enigmaProductDetails.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EnigmaProductsResponse.Data data) {
        LJ(data);
    }

    @Override // X.C0IMD
    public final EnigmaProductsResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnigmaProductsResponse.Data data, List list) {
    }
}
