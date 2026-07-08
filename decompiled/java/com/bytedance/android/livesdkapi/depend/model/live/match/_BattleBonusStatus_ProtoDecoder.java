package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleBonusStatus_ProtoDecoder implements C0IMD<BattleBonusStatus> {
    public static BattleBonusStatus LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleBonusStatus battleBonusStatus = new BattleBonusStatus();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        switch (iLJI) {
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                battleBonusStatus.taskProgress = c1516680pZS.LJIIJJI();
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                battleBonusStatus.userAssisted = C1516700pZU.LIZ(c1516680pZS);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                battleBonusStatus.rewardSettlePrompt = _BattlePrompt_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 14:
                                battleBonusStatus.rewardSettleDuration = c1516680pZS.LJIIJJI();
                                break;
                            case 15:
                                battleBonusStatus.rewardSettleStatus = c1516680pZS.LJIIJJI();
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                    } else {
                        battleBonusStatus.enterRoomPrompt = _BattlePrompt_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    battleBonusStatus.bonusPeriod = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleBonusStatus;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleBonusStatus battleBonusStatus) {
        BattleBonusStatus battleBonusStatus2 = battleBonusStatus;
        BattlePrompt battlePrompt = battleBonusStatus2.enterRoomPrompt;
        if (battlePrompt != null) {
            _BattlePrompt_ProtoDecoder.LJ(battlePrompt);
        }
        BattlePrompt battlePrompt2 = battleBonusStatus2.rewardSettlePrompt;
        if (battlePrompt2 != null) {
            _BattlePrompt_ProtoDecoder.LJ(battlePrompt2);
        }
    }

    @Override // X.C0IMD
    public final BattleBonusStatus LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleBonusStatus battleBonusStatus, List list) {
    }
}
