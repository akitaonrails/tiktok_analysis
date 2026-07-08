package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LeagueMatchExtra_ProtoDecoder implements C0IMD<LeagueMatchExtra> {
    public static LeagueMatchExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LeagueMatchExtra leagueMatchExtra = new LeagueMatchExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    leagueMatchExtra.isAnchorOptOut = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                leagueMatchExtra.battleId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            leagueMatchExtra.endTimestampSec = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        leagueMatchExtra.startTimestampSec = c1516680pZS.LJIIJJI();
                    }
                } else {
                    leagueMatchExtra.stage = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return leagueMatchExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final LeagueMatchExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LeagueMatchExtra leagueMatchExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LeagueMatchExtra leagueMatchExtra, List list) {
    }
}
