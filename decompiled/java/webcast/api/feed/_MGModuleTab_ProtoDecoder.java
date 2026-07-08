package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MGModuleTab_ProtoDecoder implements C0IMD<MGModuleTab> {
    public static MGModuleTab LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MGModuleTab mGModuleTab = new MGModuleTab();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 4) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            mGModuleTab.innerFeedMgAggId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        mGModuleTab.title = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    mGModuleTab.name = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return mGModuleTab;
            }
        }
    }

    @Override // X.C0IMD
    public final MGModuleTab LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MGModuleTab mGModuleTab) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MGModuleTab mGModuleTab, List list) {
    }
}
