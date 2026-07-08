package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveTab_ProtoDecoder implements C0IMD<LiveTab> {
    public static LiveTab LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveTab liveTab = new LiveTab();
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
                                liveTab.liveTabMg = _LiveTabMG_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            liveTab.content = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        liveTab.name = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    liveTab.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveTab;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveTab liveTab) {
        TabMGTopLive tabMGTopLive;
        LiveTabMG liveTabMG = liveTab.liveTabMg;
        if (liveTabMG != null && (tabMGTopLive = liveTabMG.topLive) != null) {
            _TabMGTopLive_ProtoDecoder.LJ(tabMGTopLive);
        }
    }

    @Override // X.C0IMD
    public final LiveTab LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveTab liveTab, List list) {
    }
}
