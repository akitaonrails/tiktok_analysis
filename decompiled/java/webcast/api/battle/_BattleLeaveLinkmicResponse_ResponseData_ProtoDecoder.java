package webcast.api.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTeamResult_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.api.battle.BattleLeaveLinkmicResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleLeaveLinkmicResponse_ResponseData_ProtoDecoder implements C0IMD<BattleLeaveLinkmicResponse.ResponseData> {
    public static BattleLeaveLinkmicResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleLeaveLinkmicResponse.ResponseData responseData = new BattleLeaveLinkmicResponse.ResponseData();
        responseData.teamBattleResult = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.battleSettings = _BattleSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    Long lValueOf = null;
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
                            responseData.teamBattleResult.put(lValueOf, battleTeamResultLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(BattleLeaveLinkmicResponse.ResponseData responseData) {
        Map<Long, BattleTeamResult> map = responseData.teamBattleResult;
        if (map == null) {
            responseData.teamBattleResult = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, BattleTeamResult>> it2 = responseData.teamBattleResult.entrySet().iterator();
            while (it2.hasNext()) {
                BattleTeamResult value = it2.next().getValue();
                if (value != null) {
                    _BattleTeamResult_ProtoDecoder.LJ(value);
                }
            }
        }
        BattleSetting battleSetting = responseData.battleSettings;
        if (battleSetting != null) {
            _BattleSetting_ProtoDecoder.LJ(battleSetting);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleLeaveLinkmicResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final BattleLeaveLinkmicResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleLeaveLinkmicResponse.ResponseData responseData, List list) {
    }
}
