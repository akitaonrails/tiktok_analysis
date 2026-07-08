package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GoalReward_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GoalStats_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveStreamGoal_ProtoDecoder implements C0IMD<LiveStreamGoal> {
    public static LiveStreamGoal LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveStreamGoal liveStreamGoal = new LiveStreamGoal();
        liveStreamGoal.subGoals = new ArrayList();
        liveStreamGoal.contributors = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveStreamGoal.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        liveStreamGoal.type = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        liveStreamGoal.status = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        liveStreamGoal.subGoals.add(_LiveStreamSubGoal_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        liveStreamGoal.description = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        liveStreamGoal.auditStatus = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        liveStreamGoal.cycleType = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        liveStreamGoal.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        liveStreamGoal.expireTime = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        liveStreamGoal.realFinishTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        liveStreamGoal.contributors.add(_LiveStreamGoalContributor_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        liveStreamGoal.contributorsLength = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        liveStreamGoal.idStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        liveStreamGoal.auditDescription = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        liveStreamGoal.stats = _GoalStats_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        liveStreamGoal.goalExtraInfo = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        liveStreamGoal.mode = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        liveStreamGoal.auditInfo = _LiveStreamGoal_AuditInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 19:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        liveStreamGoal.challengeType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        liveStreamGoal.isUneditable = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 22:
                        liveStreamGoal.goalReward = _GoalReward_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 23:
                        liveStreamGoal.createSource = c1516680pZS.LJIIJ();
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveStreamGoal;
            }
        }
    }

    public static void LJ(LiveStreamGoal liveStreamGoal) {
        LiveStreamSubGoalGift liveStreamSubGoalGift;
        ImageModel imageModel;
        List<LiveStreamSubGoal> list = liveStreamGoal.subGoals;
        if (list == null) {
            liveStreamGoal.subGoals = new ArrayList();
        } else if (!list.isEmpty()) {
            for (LiveStreamSubGoal liveStreamSubGoal : liveStreamGoal.subGoals) {
                if (liveStreamSubGoal != null && (liveStreamSubGoalGift = liveStreamSubGoal.gift) != null && (imageModel = liveStreamSubGoalGift.icon) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<LiveStreamGoalContributor> list2 = liveStreamGoal.contributors;
        if (list2 == null) {
            liveStreamGoal.contributors = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (LiveStreamGoalContributor liveStreamGoalContributor : liveStreamGoal.contributors) {
            if (liveStreamGoalContributor != null) {
                _LiveStreamGoalContributor_ProtoDecoder.LJ(liveStreamGoalContributor);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveStreamGoal liveStreamGoal) {
        LJ(liveStreamGoal);
    }

    @Override // X.C0IMD
    public final LiveStreamGoal LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveStreamGoal liveStreamGoal, List list) {
    }
}
