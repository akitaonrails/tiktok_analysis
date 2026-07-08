package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownForAllConfig_ProtoDecoder implements C0IMD<CountdownForAllConfig> {
    public static CountdownForAllConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CountdownForAllConfig countdownForAllConfig = new CountdownForAllConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 7) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            countdownForAllConfig.resourceId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        countdownForAllConfig.targetScore = c1516680pZS.LJIIJJI();
                    }
                } else {
                    countdownForAllConfig.duration = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return countdownForAllConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final CountdownForAllConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CountdownForAllConfig countdownForAllConfig) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownForAllConfig countdownForAllConfig, List list) {
    }
}
