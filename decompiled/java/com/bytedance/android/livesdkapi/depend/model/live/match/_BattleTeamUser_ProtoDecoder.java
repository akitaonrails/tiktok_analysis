package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleTeamUser_ProtoDecoder implements C0IMD<BattleTeamUser> {
    public static BattleTeamUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleTeamUser battleTeamUser = new BattleTeamUser();
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
                                battleTeamUser.enigmaScore = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            battleTeamUser.userIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        battleTeamUser.score = Long.valueOf(c1516680pZS.LJIIJJI());
                    }
                } else {
                    battleTeamUser.userId = Long.valueOf(c1516680pZS.LJIIJJI());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleTeamUser;
            }
        }
    }

    @Override // X.C0IMD
    public final BattleTeamUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BattleTeamUser battleTeamUser) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleTeamUser battleTeamUser, List list) {
    }
}
