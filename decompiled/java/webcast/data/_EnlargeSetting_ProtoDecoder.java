package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnlargeSetting_ProtoDecoder implements C0IMD<EnlargeSetting> {
    public static EnlargeSetting LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnlargeSetting enlargeSetting = new EnlargeSetting();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        enlargeSetting.portraitView = c1516680pZS.LJIIJ();
                    }
                } else {
                    enlargeSetting.landscapeView = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enlargeSetting;
            }
        }
    }

    @Override // X.C0IMD
    public final EnlargeSetting LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EnlargeSetting enlargeSetting) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnlargeSetting enlargeSetting, List list) {
    }
}
