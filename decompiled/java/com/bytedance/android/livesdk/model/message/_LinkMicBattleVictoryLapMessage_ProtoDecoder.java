package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTips;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuideV2;
import com.bytedance.android.livesdk.model.message.battle._BattleTruthOrDareOptOutNotice_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTruthOrDareTips_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTruthOrDareTriggerGuideV2_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTruthOrDareTriggerGuide_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicBattleVictoryLapMessage_ProtoDecoder implements C0IMD<LinkMicBattleVictoryLapMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkMicBattleVictoryLapMessage linkMicBattleVictoryLapMessage) {
        LinkMicBattleVictoryLapMessage linkMicBattleVictoryLapMessage2 = linkMicBattleVictoryLapMessage;
        CommonMessageData commonMessageData = linkMicBattleVictoryLapMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        BattleTruthOrDareTips battleTruthOrDareTips = linkMicBattleVictoryLapMessage2.playTips;
        if (battleTruthOrDareTips != null) {
            _BattleTruthOrDareTips_ProtoDecoder.LJ(battleTruthOrDareTips);
        }
        BattleTruthOrDareTriggerGuideV2 battleTruthOrDareTriggerGuideV2 = linkMicBattleVictoryLapMessage2.triggerGuideV2;
        if (battleTruthOrDareTriggerGuideV2 != null) {
            _BattleTruthOrDareTriggerGuideV2_ProtoDecoder.LJ(battleTruthOrDareTriggerGuideV2);
        }
    }

    @Override // X.C0IMD
    public final LinkMicBattleVictoryLapMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMicBattleVictoryLapMessage linkMicBattleVictoryLapMessage = new LinkMicBattleVictoryLapMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 10) {
                    if (iLJI != 11) {
                        switch (iLJI) {
                            case 1:
                                linkMicBattleVictoryLapMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 2:
                                linkMicBattleVictoryLapMessage.playType = c1516680pZS.LJIIJ();
                                break;
                            case 3:
                                linkMicBattleVictoryLapMessage.battleTruthOrDareTriggerGuide = _BattleTruthOrDareTriggerGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 4:
                                linkMicBattleVictoryLapMessage.playTips = _BattleTruthOrDareTips_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 5:
                                linkMicBattleVictoryLapMessage.truthOrDareCloseNotice = _BattleTruthOrDareOptOutNotice_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 6:
                                linkMicBattleVictoryLapMessage.triggerGuideV2 = _BattleTruthOrDareTriggerGuideV2_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                    } else {
                        linkMicBattleVictoryLapMessage.battleId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    linkMicBattleVictoryLapMessage.anchorRegion = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicBattleVictoryLapMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicBattleVictoryLapMessage linkMicBattleVictoryLapMessage, List list) {
    }
}
