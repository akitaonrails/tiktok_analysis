package com.bytedance.android.livesdk.battle.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.battle.model.BattleRecentContribResponse;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle._BattleResult_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTeamResult_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleRecentContribResponse_ResponseData_ProtoDecoder implements C0IMD<BattleRecentContribResponse.ResponseData> {
    public static BattleRecentContribResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleRecentContribResponse.ResponseData responseData = new BattleRecentContribResponse.ResponseData();
        responseData.teamBattleScore = new HashMap();
        responseData.giftLogIds = new ArrayList();
        responseData.supportedActions = new HashMap();
        responseData.battleScore = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    Long lValueOf = null;
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                long jLIZJ2 = c1516680pZS.LIZJ();
                                BattleTeamResult battleTeamResultLIZLLL = null;
                                while (true) {
                                    int iLJI2 = c1516680pZS.LJI();
                                    if (iLJI2 == -1) {
                                        break;
                                    }
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            battleTeamResultLIZLLL = _BattleTeamResult_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                }
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (battleTeamResultLIZLLL != null) {
                                        responseData.teamBattleScore.put(lValueOf, battleTeamResultLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            long jLIZJ3 = c1516680pZS.LIZJ();
                            BattleResult battleResultLIZLLL = null;
                            while (true) {
                                int iLJI3 = c1516680pZS.LJI();
                                if (iLJI3 == -1) {
                                    break;
                                }
                                if (iLJI3 != 1) {
                                    if (iLJI3 == 2) {
                                        battleResultLIZLLL = _BattleResult_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            }
                            c1516680pZS.LJ(jLIZJ3);
                            if (lValueOf != null) {
                                if (battleResultLIZLLL != null) {
                                    responseData.battleScore.put(lValueOf, battleResultLIZLLL);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        long jLIZJ4 = c1516680pZS.LIZJ();
                        Boolean boolValueOf = null;
                        while (true) {
                            int iLJI4 = c1516680pZS.LJI();
                            if (iLJI4 == -1) {
                                break;
                            }
                            if (iLJI4 != 1) {
                                if (iLJI4 == 2) {
                                    boolValueOf = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                                }
                            } else {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ4);
                        if (lValueOf != null) {
                            if (boolValueOf != null) {
                                responseData.supportedActions.put(lValueOf, boolValueOf);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    responseData.giftLogIds.add(C1516700pZU.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(BattleRecentContribResponse.ResponseData responseData) {
        if (responseData.giftLogIds == null) {
            responseData.giftLogIds = new ArrayList();
        }
        if (responseData.supportedActions == null) {
            responseData.supportedActions = new HashMap();
        }
        Map<Long, BattleResult> map = responseData.battleScore;
        if (map == null) {
            responseData.battleScore = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, BattleResult>> it2 = responseData.battleScore.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
        Map<Long, BattleTeamResult> map2 = responseData.teamBattleScore;
        if (map2 == null) {
            responseData.teamBattleScore = new HashMap();
            return;
        }
        if (map2.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, BattleTeamResult>> it3 = responseData.teamBattleScore.entrySet().iterator();
        while (it3.hasNext()) {
            BattleTeamResult value = it3.next().getValue();
            if (value != null) {
                _BattleTeamResult_ProtoDecoder.LJ(value);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleRecentContribResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final BattleRecentContribResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleRecentContribResponse.ResponseData responseData, List list) {
    }
}
