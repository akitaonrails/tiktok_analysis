package webcast.api.game;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _InGameInfo_ProtoDecoder implements C0IMD<InGameInfo> {
    public static InGameInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        InGameInfo inGameInfo = new InGameInfo();
        inGameInfo.allowGuideGametagIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        inGameInfo.allowGuideGametagIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    inGameInfo.showInGameRank = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return inGameInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(InGameInfo inGameInfo) {
        InGameInfo inGameInfo2 = inGameInfo;
        if (inGameInfo2.allowGuideGametagIds == null) {
            inGameInfo2.allowGuideGametagIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final InGameInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, InGameInfo inGameInfo, List list) {
    }
}
