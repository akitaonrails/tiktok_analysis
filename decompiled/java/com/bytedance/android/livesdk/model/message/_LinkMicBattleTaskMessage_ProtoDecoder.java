package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.battle.BattleRewardSettle;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskStart;
import com.bytedance.android.livesdk.model.message.battle._BattleRewardSettle_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTaskSettle_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTaskStart_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTaskUpdate_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleBonusConfig_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattlePrompt_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicBattleTaskMessage_ProtoDecoder implements C0IMD<LinkMicBattleTaskMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkMicBattleTaskMessage linkMicBattleTaskMessage) {
        BattlePrompt battlePrompt;
        BattleBonusConfig battleBonusConfig;
        LinkMicBattleTaskMessage linkMicBattleTaskMessage2 = linkMicBattleTaskMessage;
        CommonMessageData commonMessageData = linkMicBattleTaskMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        BattleTaskStart battleTaskStart = linkMicBattleTaskMessage2.taskStart;
        if (battleTaskStart != null && (battleBonusConfig = battleTaskStart.battleBonusConfig) != null) {
            _BattleBonusConfig_ProtoDecoder.LJ(battleBonusConfig);
        }
        BattleRewardSettle battleRewardSettle = linkMicBattleTaskMessage2.rewardSettle;
        if (battleRewardSettle != null && (battlePrompt = battleRewardSettle.rewardSettlePrompt) != null) {
            _BattlePrompt_ProtoDecoder.LJ(battlePrompt);
        }
    }

    @Override // X.C0IMD
    public final LinkMicBattleTaskMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMicBattleTaskMessage linkMicBattleTaskMessage = new LinkMicBattleTaskMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 20) {
                    switch (iLJI) {
                        case 1:
                            linkMicBattleTaskMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            linkMicBattleTaskMessage.battleTaskMessageType = c1516680pZS.LJIIJ();
                            break;
                        case 3:
                            linkMicBattleTaskMessage.taskStart = _BattleTaskStart_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            linkMicBattleTaskMessage.taskUpdate = _BattleTaskUpdate_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            linkMicBattleTaskMessage.taskSettle = _BattleTaskSettle_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            linkMicBattleTaskMessage.rewardSettle = _BattleRewardSettle_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    linkMicBattleTaskMessage.battleId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicBattleTaskMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicBattleTaskMessage linkMicBattleTaskMessage, List list) {
    }
}
