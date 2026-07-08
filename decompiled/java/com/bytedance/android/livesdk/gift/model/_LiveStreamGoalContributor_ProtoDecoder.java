package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_EnigmaInfo_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model.SubGoalContribution;
import com.bytedance.android.livesdk.goal.model._SubGoalContribution_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveStreamGoalContributor_ProtoDecoder implements C0IMD<LiveStreamGoalContributor> {
    public static LiveStreamGoalContributor LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveStreamGoalContributor liveStreamGoalContributor = new LiveStreamGoalContributor();
        liveStreamGoalContributor.subGoalContributions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveStreamGoalContributor.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        liveStreamGoalContributor.avatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        liveStreamGoalContributor.displayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        liveStreamGoalContributor.score = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        liveStreamGoalContributor.userIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        liveStreamGoalContributor.inRoom = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        liveStreamGoalContributor.isFriend = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        liveStreamGoalContributor.followByOwner = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        liveStreamGoalContributor.isFistContribute = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        liveStreamGoalContributor.subGoalContributions.add(_SubGoalContribution_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        liveStreamGoalContributor.enigmaInfo = _User_EnigmaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveStreamGoalContributor;
            }
        }
    }

    public static void LJ(LiveStreamGoalContributor liveStreamGoalContributor) {
        ImageModel imageModel = liveStreamGoalContributor.avatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        List<SubGoalContribution> list = liveStreamGoalContributor.subGoalContributions;
        if (list == null) {
            liveStreamGoalContributor.subGoalContributions = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<SubGoalContribution> it2 = liveStreamGoalContributor.subGoalContributions.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveStreamGoalContributor liveStreamGoalContributor) {
        LJ(liveStreamGoalContributor);
    }

    @Override // X.C0IMD
    public final LiveStreamGoalContributor LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveStreamGoalContributor liveStreamGoalContributor, List list) {
    }
}
