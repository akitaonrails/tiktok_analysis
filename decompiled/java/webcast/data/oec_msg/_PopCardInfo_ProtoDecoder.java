package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PopCardInfo_ProtoDecoder implements C0IMD<PopCardInfo> {
    public static PopCardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PopCardInfo popCardInfo = new PopCardInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            popCardInfo.popCardId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        popCardInfo.popCardType = c1516680pZS.LJIIJ();
                    }
                } else {
                    popCardInfo.popProductId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return popCardInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final PopCardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PopCardInfo popCardInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PopCardInfo popCardInfo, List list) {
    }
}
