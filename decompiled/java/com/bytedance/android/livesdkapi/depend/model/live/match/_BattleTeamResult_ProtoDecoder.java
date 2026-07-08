package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleTeamResult_ProtoDecoder implements C0IMD<BattleTeamResult> {
    public static BattleTeamResult LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleTeamResult battleTeamResult = new BattleTeamResult();
        battleTeamResult.teamUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        battleTeamResult.teamId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 2:
                        battleTeamResult.teamUsers.add(_BattleTeamUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        battleTeamResult.result = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        battleTeamResult.totalScore = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        battleTeamResult.totalEnigmaScore = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        battleTeamResult.totalEnigmaUv = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleTeamResult;
            }
        }
    }

    public static void LJ(BattleTeamResult battleTeamResult) {
        List<BattleTeamUser> list = battleTeamResult.teamUsers;
        if (list == null) {
            battleTeamResult.teamUsers = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<BattleTeamUser> it2 = battleTeamResult.teamUsers.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleTeamResult battleTeamResult) {
        LJ(battleTeamResult);
    }

    @Override // X.C0IMD
    public final BattleTeamResult LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleTeamResult battleTeamResult, List list) {
    }
}
