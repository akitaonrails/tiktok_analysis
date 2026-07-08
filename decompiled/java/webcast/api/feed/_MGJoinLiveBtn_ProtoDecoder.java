package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MGJoinLiveBtn_ProtoDecoder implements C0IMD<MGJoinLiveBtn> {
    public static MGJoinLiveBtn LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MGJoinLiveBtn mGJoinLiveBtn = new MGJoinLiveBtn();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 7) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    mGJoinLiveBtn.innerFeedMgAggId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return mGJoinLiveBtn;
            }
        }
    }

    @Override // X.C0IMD
    public final MGJoinLiveBtn LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MGJoinLiveBtn mGJoinLiveBtn) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MGJoinLiveBtn mGJoinLiveBtn, List list) {
    }
}
