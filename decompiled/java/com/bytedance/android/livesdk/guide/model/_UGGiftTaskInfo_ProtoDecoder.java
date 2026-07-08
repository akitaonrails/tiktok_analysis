package com.bytedance.android.livesdk.guide.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UGGiftTaskInfo_ProtoDecoder implements C0IMD<UGGiftTaskInfo> {
    public static UGGiftTaskInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UGGiftTaskInfo uGGiftTaskInfo = new UGGiftTaskInfo();
        uGGiftTaskInfo.rewardList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        uGGiftTaskInfo.showBannerEntry = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        uGGiftTaskInfo.ugTaskStatus = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        uGGiftTaskInfo.rewardUgPoints = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        uGGiftTaskInfo.taskStartTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        uGGiftTaskInfo.taskPeriodDays = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        uGGiftTaskInfo.ugTaskFlow = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        uGGiftTaskInfo.preRewardUgPoints = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        uGGiftTaskInfo.taskBizType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        uGGiftTaskInfo.schemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        uGGiftTaskInfo.taskEndTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        uGGiftTaskInfo.completeTaskGiftId = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        uGGiftTaskInfo.rewardList.add(_RewardProcess_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return uGGiftTaskInfo;
            }
        }
    }

    public static void LJ(UGGiftTaskInfo uGGiftTaskInfo) {
        List<RewardProcess> list = uGGiftTaskInfo.rewardList;
        if (list == null) {
            uGGiftTaskInfo.rewardList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<RewardProcess> it2 = uGGiftTaskInfo.rewardList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UGGiftTaskInfo uGGiftTaskInfo) {
        LJ(uGGiftTaskInfo);
    }

    @Override // X.C0IMD
    public final UGGiftTaskInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UGGiftTaskInfo uGGiftTaskInfo, List list) {
    }
}
