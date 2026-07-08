package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveTabMG_ProtoDecoder implements C0IMD<LiveTabMG> {
    public static LiveTabMG LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveTabMG liveTabMG = new LiveTabMG();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            liveTabMG.topLive = _TabMGTopLive_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        liveTabMG.lynxLink = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    liveTabMG.contentType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveTabMG;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveTabMG liveTabMG) {
        TabMGTopLive tabMGTopLive = liveTabMG.topLive;
        if (tabMGTopLive != null) {
            _TabMGTopLive_ProtoDecoder.LJ(tabMGTopLive);
        }
    }

    @Override // X.C0IMD
    public final LiveTabMG LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveTabMG liveTabMG, List list) {
    }
}
