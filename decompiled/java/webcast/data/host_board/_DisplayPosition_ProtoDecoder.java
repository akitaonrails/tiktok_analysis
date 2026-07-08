package webcast.data.host_board;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DisplayPosition_ProtoDecoder implements C0IMD<DisplayPosition> {
    public static DisplayPosition LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        DisplayPosition displayPosition = new DisplayPosition();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        displayPosition.alignment = c1516680pZS.LJIIJ();
                    }
                } else {
                    displayPosition.marginTop = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return displayPosition;
            }
        }
    }

    @Override // X.C0IMD
    public final DisplayPosition LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(DisplayPosition displayPosition) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DisplayPosition displayPosition, List list) {
    }
}
