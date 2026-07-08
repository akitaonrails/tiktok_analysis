package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RewardPeriodConfig_ProtoDecoder implements C0IMD<RewardPeriodConfig> {
    public static RewardPeriodConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RewardPeriodConfig rewardPeriodConfig = new RewardPeriodConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                switch (iLJI) {
                                    case BdTuring.TYPE_EMAIL /* 11 */:
                                        rewardPeriodConfig.rewardPraparePrompt = _BattlePrompt_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                        rewardPeriodConfig.rewardingPrompt = _BattlePrompt_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                        rewardPeriodConfig.clickPrompt = _BattlePrompt_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    default:
                                        C1516700pZU.LJ(c1516680pZS);
                                        break;
                                }
                            } else {
                                rewardPeriodConfig.rewardStartTimestamp = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            rewardPeriodConfig.rewardMultiple = (int) c1516680pZS.LJIIJJI();
                        }
                    } else {
                        rewardPeriodConfig.duration = c1516680pZS.LJIIJJI();
                    }
                } else {
                    rewardPeriodConfig.rewardStartTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rewardPeriodConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RewardPeriodConfig rewardPeriodConfig) {
        RewardPeriodConfig rewardPeriodConfig2 = rewardPeriodConfig;
        BattlePrompt battlePrompt = rewardPeriodConfig2.rewardPraparePrompt;
        if (battlePrompt != null) {
            _BattlePrompt_ProtoDecoder.LJ(battlePrompt);
        }
        BattlePrompt battlePrompt2 = rewardPeriodConfig2.rewardingPrompt;
        if (battlePrompt2 != null) {
            _BattlePrompt_ProtoDecoder.LJ(battlePrompt2);
        }
        BattlePrompt battlePrompt3 = rewardPeriodConfig2.clickPrompt;
        if (battlePrompt3 != null) {
            _BattlePrompt_ProtoDecoder.LJ(battlePrompt3);
        }
    }

    @Override // X.C0IMD
    public final RewardPeriodConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RewardPeriodConfig rewardPeriodConfig, List list) {
    }
}
