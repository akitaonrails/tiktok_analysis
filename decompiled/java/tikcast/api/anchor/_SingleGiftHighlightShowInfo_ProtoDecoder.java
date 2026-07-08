package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SingleGiftHighlightShowInfo_ProtoDecoder implements C0IMD<SingleGiftHighlightShowInfo> {
    public static SingleGiftHighlightShowInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SingleGiftHighlightShowInfo singleGiftHighlightShowInfo = new SingleGiftHighlightShowInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        singleGiftHighlightShowInfo.includeBeansGift = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    singleGiftHighlightShowInfo.isHashtagChallenge = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return singleGiftHighlightShowInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final SingleGiftHighlightShowInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SingleGiftHighlightShowInfo singleGiftHighlightShowInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SingleGiftHighlightShowInfo singleGiftHighlightShowInfo, List list) {
    }
}
