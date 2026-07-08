package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle._BattleSetting_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiBattleFinishResponse_ProtoDecoder implements C0IMD<MultiBattleFinishResponse> {
    @Override // X.C0IMD
    public final void LIZ(MultiBattleFinishResponse multiBattleFinishResponse) {
        MultiBattleFinishResponse multiBattleFinishResponse2 = multiBattleFinishResponse;
        Map<Long, BattleTeamResult> map = multiBattleFinishResponse2.teamBattleResult;
        if (map == null) {
            multiBattleFinishResponse2.teamBattleResult = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, BattleTeamResult>> it2 = multiBattleFinishResponse2.teamBattleResult.entrySet().iterator();
            while (it2.hasNext()) {
                BattleTeamResult value = it2.next().getValue();
                if (value != null) {
                    _BattleTeamResult_ProtoDecoder.LJ(value);
                }
            }
        }
        Map<Long, BattleTeamUserArmies> map2 = multiBattleFinishResponse2.teamArmies;
        if (map2 == null) {
            multiBattleFinishResponse2.teamArmies = new HashMap();
        } else if (!map2.isEmpty()) {
            Iterator<Map.Entry<Long, BattleTeamUserArmies>> it3 = multiBattleFinishResponse2.teamArmies.entrySet().iterator();
            while (it3.hasNext()) {
                BattleTeamUserArmies value2 = it3.next().getValue();
                if (value2 != null) {
                    _BattleTeamUserArmies_ProtoDecoder.LJ(value2);
                }
            }
        }
        BattleSetting battleSetting = multiBattleFinishResponse2.battleSettings;
        if (battleSetting != null) {
            _BattleSetting_ProtoDecoder.LJ(battleSetting);
        }
        Map<Long, BattleComboInfo> map3 = multiBattleFinishResponse2.battleComboV2;
        if (map3 == null) {
            multiBattleFinishResponse2.battleComboV2 = new HashMap();
        } else if (!map3.isEmpty()) {
            Iterator<Map.Entry<Long, BattleComboInfo>> it4 = multiBattleFinishResponse2.battleComboV2.entrySet().iterator();
            while (it4.hasNext()) {
                it4.next().getValue();
            }
        }
        MatchPunishExtraInfo matchPunishExtraInfo = multiBattleFinishResponse2.matchPunishExtraInfo;
        if (matchPunishExtraInfo != null) {
            _MatchPunishExtraInfo_ProtoDecoder.LJ(matchPunishExtraInfo);
        }
    }

    @Override // X.C0IMD
    public final MultiBattleFinishResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MultiBattleFinishResponse multiBattleFinishResponse = new MultiBattleFinishResponse();
        multiBattleFinishResponse.teamBattleResult = new HashMap();
        multiBattleFinishResponse.teamArmies = new HashMap();
        multiBattleFinishResponse.battleComboV2 = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Long lValueOf = null;
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    if (iLJI != 20) {
                                        C1516700pZU.LJ(c1516680pZS);
                                    } else {
                                        multiBattleFinishResponse.matchPunishExtraInfo = _MatchPunishExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    long jLIZJ2 = c1516680pZS.LIZJ();
                                    BattleComboInfo battleComboInfoLIZLLL = null;
                                    while (true) {
                                        int iLJI2 = c1516680pZS.LJI();
                                        if (iLJI2 == -1) {
                                            break;
                                        }
                                        if (iLJI2 != 1) {
                                            if (iLJI2 == 2) {
                                                battleComboInfoLIZLLL = _BattleComboInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                            }
                                        } else {
                                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                        }
                                    }
                                    c1516680pZS.LJ(jLIZJ2);
                                    if (lValueOf != null) {
                                        if (battleComboInfoLIZLLL != null) {
                                            multiBattleFinishResponse.battleComboV2.put(lValueOf, battleComboInfoLIZLLL);
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            } else {
                                multiBattleFinishResponse.hasTeamMatchMvpSfx = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            multiBattleFinishResponse.battleSettings = _BattleSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        long jLIZJ3 = c1516680pZS.LIZJ();
                        BattleTeamUserArmies battleTeamUserArmiesLIZLLL = null;
                        while (true) {
                            int iLJI3 = c1516680pZS.LJI();
                            if (iLJI3 == -1) {
                                break;
                            }
                            if (iLJI3 != 1) {
                                if (iLJI3 == 2) {
                                    battleTeamUserArmiesLIZLLL = _BattleTeamUserArmies_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ3);
                        if (lValueOf != null) {
                            if (battleTeamUserArmiesLIZLLL != null) {
                                multiBattleFinishResponse.teamArmies.put(lValueOf, battleTeamUserArmiesLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    long jLIZJ4 = c1516680pZS.LIZJ();
                    BattleTeamResult battleTeamResultLIZLLL = null;
                    while (true) {
                        int iLJI4 = c1516680pZS.LJI();
                        if (iLJI4 == -1) {
                            break;
                        }
                        if (iLJI4 != 1) {
                            if (iLJI4 == 2) {
                                battleTeamResultLIZLLL = _BattleTeamResult_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ4);
                    if (lValueOf != null) {
                        if (battleTeamResultLIZLLL != null) {
                            multiBattleFinishResponse.teamBattleResult.put(lValueOf, battleTeamResultLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiBattleFinishResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiBattleFinishResponse multiBattleFinishResponse, List list) {
    }
}
