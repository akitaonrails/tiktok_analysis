package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerMediaChangeOperator_ProtoDecoder implements C0IMD<LinkerMediaChangeOperator> {
    public static LinkerMediaChangeOperator LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerMediaChangeOperator linkerMediaChangeOperator = new LinkerMediaChangeOperator();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                linkerMediaChangeOperator.displayId = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            linkerMediaChangeOperator.nickName = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        linkerMediaChangeOperator.operatorType = c1516680pZS.LJIIJ();
                    }
                } else {
                    linkerMediaChangeOperator.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerMediaChangeOperator;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkerMediaChangeOperator LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkerMediaChangeOperator linkerMediaChangeOperator) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerMediaChangeOperator linkerMediaChangeOperator, List list) {
    }
}
