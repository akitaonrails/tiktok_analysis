package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.match._IceShowdownInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleGameplayMessage_ProtoDecoder implements C0IMD<BattleGameplayMessage> {
    @Override // X.C0IMD
    public final void LIZ(BattleGameplayMessage battleGameplayMessage) {
        CommonMessageData commonMessageData = battleGameplayMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final BattleGameplayMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BattleGameplayMessage battleGameplayMessage = new BattleGameplayMessage();
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
                                    battleGameplayMessage.iceShowdownInfo = _IceShowdownInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                battleGameplayMessage.updateType = c1516680pZS.LJIIJ();
                            }
                        } else {
                            battleGameplayMessage.gameplayType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        battleGameplayMessage.battleId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    battleGameplayMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleGameplayMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleGameplayMessage battleGameplayMessage, List list) {
    }
}
