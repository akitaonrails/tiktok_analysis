package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RandomMatchInfo_ProtoDecoder implements C0IMD<RandomMatchInfo> {
    public static RandomMatchInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RandomMatchInfo randomMatchInfo = new RandomMatchInfo();
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
                                randomMatchInfo.requestSource = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            randomMatchInfo.requestId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        randomMatchInfo.stopTimestamp = c1516680pZS.LJIIJJI();
                    }
                } else {
                    randomMatchInfo.startTimestamp = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return randomMatchInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final RandomMatchInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RandomMatchInfo randomMatchInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RandomMatchInfo randomMatchInfo, List list) {
    }
}
