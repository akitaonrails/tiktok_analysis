package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TryMode_ProtoDecoder implements C0IMD<TryMode> {
    public static TryMode LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TryMode tryMode = new TryMode();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            tryMode.liveVideoGroup = c1516680pZS.LJIIJ();
                        }
                    } else {
                        tryMode.enableLiveVideo = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    tryMode.hasCreatedRoom = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tryMode;
            }
        }
    }

    @Override // X.C0IMD
    public final TryMode LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TryMode tryMode) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TryMode tryMode, List list) {
    }
}
