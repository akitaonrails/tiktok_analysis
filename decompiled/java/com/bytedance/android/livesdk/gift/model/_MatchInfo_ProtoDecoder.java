package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MatchInfo_ProtoDecoder implements C0IMD<MatchInfo> {
    public static MatchInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MatchInfo matchInfo = new MatchInfo();
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
                                matchInfo.multiplierValue = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            matchInfo.multiplierType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        matchInfo.effectCardInUse = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    matchInfo.critical = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return matchInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final MatchInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MatchInfo matchInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MatchInfo matchInfo, List list) {
    }
}
