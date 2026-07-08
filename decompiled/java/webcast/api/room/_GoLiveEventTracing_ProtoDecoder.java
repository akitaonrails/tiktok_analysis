package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GoLiveEventTracing_ProtoDecoder implements C0IMD<GoLiveEventTracing> {
    public static GoLiveEventTracing LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GoLiveEventTracing goLiveEventTracing = new GoLiveEventTracing();
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
                                goLiveEventTracing.lopLevelStayDays = c1516680pZS.LJIIJ();
                            }
                        } else {
                            goLiveEventTracing.lopLevel = c1516680pZS.LJIIJ();
                        }
                    } else {
                        goLiveEventTracing.daysSinceGetPerm = c1516680pZS.LJIIJ();
                    }
                } else {
                    goLiveEventTracing.isNewAnchor = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return goLiveEventTracing;
            }
        }
    }

    @Override // X.C0IMD
    public final GoLiveEventTracing LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GoLiveEventTracing goLiveEventTracing) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GoLiveEventTracing goLiveEventTracing, List list) {
    }
}
