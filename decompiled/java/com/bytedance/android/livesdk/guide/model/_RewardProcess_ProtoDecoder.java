package com.bytedance.android.livesdk.guide.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _RewardProcess_ProtoDecoder implements C0IMD<RewardProcess> {
    public static RewardProcess LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RewardProcess rewardProcess = new RewardProcess();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 16) {
                    switch (iLJI) {
                        case 1:
                            rewardProcess.rewardId = c1516680pZS.LJIIJJI();
                            break;
                        case 2:
                            rewardProcess.rewardOrder = c1516680pZS.LJIIJ();
                            break;
                        case 3:
                            rewardProcess.rewardType = c1516680pZS.LJIIJ();
                            break;
                        case 4:
                            rewardProcess.rewardAmount = c1516680pZS.LJIIJJI();
                            break;
                        case 5:
                            rewardProcess.rewardExpire = c1516680pZS.LJIIJJI();
                            break;
                        case 6:
                            rewardProcess.rewardExpireTs = c1516680pZS.LJIIJJI();
                            break;
                        case 7:
                            rewardProcess.rewardName = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 8:
                            rewardProcess.preRewardAmount = c1516680pZS.LJIIJJI();
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            rewardProcess.localCurrencyRewardAmount = c1516680pZS.LJIIJJI();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            rewardProcess.localCurrencyRegion = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    rewardProcess.targetType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rewardProcess;
            }
        }
    }

    @Override // X.C0IMD
    public final RewardProcess LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RewardProcess rewardProcess) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RewardProcess rewardProcess, List list) {
    }
}
