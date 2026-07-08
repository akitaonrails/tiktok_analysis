package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveStudioContentExtra_ProtoDecoder implements C0IMD<LiveStudioContentExtra> {
    public static LiveStudioContentExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveStudioContentExtra liveStudioContentExtra = new LiveStudioContentExtra();
        liveStudioContentExtra.coreFuncList = new ArrayList();
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
                                liveStudioContentExtra.coreFuncList.add(C1516700pZU.LIZLLL(c1516680pZS));
                            }
                        } else {
                            liveStudioContentExtra.revenueImprovement = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        liveStudioContentExtra.watchImprovement = c1516680pZS.LJIIJJI();
                    }
                } else {
                    liveStudioContentExtra.animatedCoverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveStudioContentExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveStudioContentExtra liveStudioContentExtra) {
        LiveStudioContentExtra liveStudioContentExtra2 = liveStudioContentExtra;
        if (liveStudioContentExtra2.coreFuncList == null) {
            liveStudioContentExtra2.coreFuncList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final LiveStudioContentExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveStudioContentExtra liveStudioContentExtra, List list) {
    }
}
