package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._SubGoalPinInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveStreamSubGoal_ProtoDecoder implements C0IMD<LiveStreamSubGoal> {
    public static LiveStreamSubGoal LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveStreamSubGoal liveStreamSubGoal = new LiveStreamSubGoal();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveStreamSubGoal.type = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        liveStreamSubGoal.id = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        liveStreamSubGoal.progress = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        liveStreamSubGoal.target = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        liveStreamSubGoal.gift = _LiveStreamSubGoalGift_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        liveStreamSubGoal.idStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        liveStreamSubGoal.pinInfo = _SubGoalPinInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        liveStreamSubGoal.source = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        liveStreamSubGoal.recommendedText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        liveStreamSubGoal.recommendedHeader = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveStreamSubGoal;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveStreamSubGoal liveStreamSubGoal) {
        ImageModel imageModel;
        LiveStreamSubGoalGift liveStreamSubGoalGift = liveStreamSubGoal.gift;
        if (liveStreamSubGoalGift != null && (imageModel = liveStreamSubGoalGift.icon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final LiveStreamSubGoal LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveStreamSubGoal liveStreamSubGoal, List list) {
    }
}
