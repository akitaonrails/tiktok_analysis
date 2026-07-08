package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._AnchorActivityTaskProgress_ProtoDecoder;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;
import tikcast.api.creator_succ.ActionButton;
import tikcast.api.creator_succ.LiveGoalParam;
import tikcast.api.creator_succ.UserParam;
import tikcast.api.creator_succ._ActionButton_ProtoDecoder;
import tikcast.api.creator_succ._LiveGoalParam_ProtoDecoder;
import tikcast.api.creator_succ._UserParam_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _InteractionHubGoalMessage_ProtoDecoder implements C0IMD<InteractionHubGoalMessage> {
    @Override // X.C0IMD
    public final void LIZ(InteractionHubGoalMessage interactionHubGoalMessage) {
        User user;
        Gift gift;
        InteractionHubGoalMessage interactionHubGoalMessage2 = interactionHubGoalMessage;
        CommonMessageData commonMessageData = interactionHubGoalMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Text text = interactionHubGoalMessage2.interactionGoal;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = interactionHubGoalMessage2.interactionTips;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        Gift gift2 = interactionHubGoalMessage2.newGiftInfo;
        if (gift2 != null) {
            _Gift_ProtoDecoder.LJ(gift2);
        }
        ActionButton actionButton = interactionHubGoalMessage2.actionButton;
        if (actionButton != null) {
            Text text3 = actionButton.buttonActiveText;
            if (text3 != null) {
                _Text_ProtoDecoder.LJ(text3);
            }
            Text text4 = actionButton.buttonInactiveText;
            if (text4 != null) {
                _Text_ProtoDecoder.LJ(text4);
            }
        }
        LiveGoalParam liveGoalParam = interactionHubGoalMessage2.liveGoalParam;
        if (liveGoalParam != null && (gift = liveGoalParam.giftInfo) != null) {
            _Gift_ProtoDecoder.LJ(gift);
        }
        UserParam userParam = interactionHubGoalMessage2.userParam;
        if (userParam != null && (user = userParam.targetUserInfo) != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final InteractionHubGoalMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        InteractionHubGoalMessage interactionHubGoalMessage = new InteractionHubGoalMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        interactionHubGoalMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        interactionHubGoalMessage.interactionGoal = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        interactionHubGoalMessage.interactionTips = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        interactionHubGoalMessage.interactionGoalType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        interactionHubGoalMessage.interactionGoalSource = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        interactionHubGoalMessage.newGiftInfo = _Gift_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        interactionHubGoalMessage.hasNewGift = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        interactionHubGoalMessage.taskProgress = _AnchorActivityTaskProgress_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        interactionHubGoalMessage.hasButton = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        interactionHubGoalMessage.actionButton = _ActionButton_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        interactionHubGoalMessage.liveGoalParam = _LiveGoalParam_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        interactionHubGoalMessage.userParam = _UserParam_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return interactionHubGoalMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, InteractionHubGoalMessage interactionHubGoalMessage, List list) {
    }
}
