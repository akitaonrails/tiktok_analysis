package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TouchPointColor_ProtoDecoder implements C0IMD<TouchPointColor> {
    public static TouchPointColor LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TouchPointColor touchPointColor = new TouchPointColor();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        touchPointColor.dark = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    touchPointColor.light = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return touchPointColor;
            }
        }
    }

    @Override // X.C0IMD
    public final TouchPointColor LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TouchPointColor touchPointColor) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TouchPointColor touchPointColor, List list) {
    }
}
