package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GoalPinInfo_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveStreamGoalServerMessage_ProtoDecoder implements C0IMD<LiveStreamGoalServerMessage> {
    @Override // X.C0IMD
    public final void LIZ(LiveStreamGoalServerMessage liveStreamGoalServerMessage) {
        LiveStreamSubGoalGift liveStreamSubGoalGift;
        ImageModel imageModel;
        LiveStreamGoalServerMessage liveStreamGoalServerMessage2 = liveStreamGoalServerMessage;
        CommonMessageData commonMessageData = liveStreamGoalServerMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        LiveStreamGoal liveStreamGoal = liveStreamGoalServerMessage2.goal;
        if (liveStreamGoal != null) {
            _LiveStreamGoal_ProtoDecoder.LJ(liveStreamGoal);
        }
        ImageModel imageModel2 = liveStreamGoalServerMessage2.contributorAvatar;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        LiveStreamSubGoal liveStreamSubGoal = liveStreamGoalServerMessage2.contributeSubgoal;
        if (liveStreamSubGoal != null && (liveStreamSubGoalGift = liveStreamSubGoal.gift) != null && (imageModel = liveStreamSubGoalGift.icon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final LiveStreamGoalServerMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LiveStreamGoalServerMessage liveStreamGoalServerMessage = new LiveStreamGoalServerMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveStreamGoalServerMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        liveStreamGoalServerMessage.indicator = _LiveStreamGoalIndicator_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        liveStreamGoalServerMessage.goal = _LiveStreamGoal_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        liveStreamGoalServerMessage.contributorId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        liveStreamGoalServerMessage.contributorAvatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        liveStreamGoalServerMessage.contributorDisplayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        liveStreamGoalServerMessage.contributeSubgoal = _LiveStreamSubGoal_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    case 14:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        liveStreamGoalServerMessage.contributeCount = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        liveStreamGoalServerMessage.contributeScore = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        liveStreamGoalServerMessage.giftRepeatCount = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        liveStreamGoalServerMessage.contributorIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        liveStreamGoalServerMessage.pinInfo = _GoalPinInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        liveStreamGoalServerMessage.updateSource = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        liveStreamGoalServerMessage.goalExtra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveStreamGoalServerMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveStreamGoalServerMessage liveStreamGoalServerMessage, List list) {
    }
}
