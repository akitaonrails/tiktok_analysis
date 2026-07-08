package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FansScoreRule_ProtoDecoder implements C0IMD<FansScoreRule> {
    public static FansScoreRule LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FansScoreRule fansScoreRule = new FansScoreRule();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            fansScoreRule.levelMaxScore = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        fansScoreRule.levelMinScore = c1516680pZS.LJIIJJI();
                    }
                } else {
                    fansScoreRule.level = (int) c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return fansScoreRule;
            }
        }
    }

    @Override // X.C0IMD
    public final FansScoreRule LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FansScoreRule fansScoreRule) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FansScoreRule fansScoreRule, List list) {
    }
}
