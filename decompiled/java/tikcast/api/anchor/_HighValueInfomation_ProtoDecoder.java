package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HighValueInfomation_ProtoDecoder implements C0IMD<HighValueInfomation> {
    public static HighValueInfomation LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HighValueInfomation highValueInfomation = new HighValueInfomation();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        highValueInfomation.priority = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        highValueInfomation.category = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        highValueInfomation.type = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        highValueInfomation.liveRecordingsDesc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        highValueInfomation.liveFragment = _HighValueLiveFragment_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        highValueInfomation.highlightPublishTaskPoints = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return highValueInfomation;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HighValueInfomation highValueInfomation) {
    }

    @Override // X.C0IMD
    public final HighValueInfomation LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HighValueInfomation highValueInfomation, List list) {
    }
}
