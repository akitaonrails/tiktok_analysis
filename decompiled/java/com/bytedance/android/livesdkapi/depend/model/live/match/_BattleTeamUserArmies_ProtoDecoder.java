package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.model.message.battle._BattleUserArmies_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleTeamUserArmies_ProtoDecoder implements C0IMD<BattleTeamUserArmies> {
    public static BattleTeamUserArmies LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleTeamUserArmies battleTeamUserArmies = new BattleTeamUserArmies();
        battleTeamUserArmies.hostVisibleRankFromTeamId = new HashMap();
        battleTeamUserArmies.teamUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        battleTeamUserArmies.teamId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 2:
                        battleTeamUserArmies.teamUsers.add(_BattleTeamUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        battleTeamUserArmies.teamTotalScore = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        battleTeamUserArmies.userArmies = _BattleUserArmies_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        battleTeamUserArmies.hostRank = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        battleTeamUserArmies.teamTotalEnigmaScore = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        battleTeamUserArmies.teamTotalEnigmaUv = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        Long lValueOf2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        lValueOf2 = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (lValueOf2 != null) {
                                        battleTeamUserArmies.hostVisibleRankFromTeamId.put(lValueOf, lValueOf2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleTeamUserArmies;
            }
        }
    }

    public static void LJ(BattleTeamUserArmies battleTeamUserArmies) {
        List<BattleTeamUser> list = battleTeamUserArmies.teamUsers;
        if (list == null) {
            battleTeamUserArmies.teamUsers = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<BattleTeamUser> it2 = battleTeamUserArmies.teamUsers.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        BattleUserArmies battleUserArmies = battleTeamUserArmies.userArmies;
        if (battleUserArmies != null) {
            _BattleUserArmies_ProtoDecoder.LJ(battleUserArmies);
        }
        if (battleTeamUserArmies.hostVisibleRankFromTeamId == null) {
            battleTeamUserArmies.hostVisibleRankFromTeamId = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleTeamUserArmies battleTeamUserArmies) {
        LJ(battleTeamUserArmies);
    }

    @Override // X.C0IMD
    public final BattleTeamUserArmies LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleTeamUserArmies battleTeamUserArmies, List list) {
    }
}
