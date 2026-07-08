package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicAnchorGuideMessage_ProtoDecoder implements C0IMD<LinkMicAnchorGuideMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage) {
        LinkMicAnchorGuideMessage linkMicAnchorGuideMessage2 = linkMicAnchorGuideMessage;
        CommonMessageData commonMessageData = linkMicAnchorGuideMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = linkMicAnchorGuideMessage2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        ReserveInfo reserveInfo = linkMicAnchorGuideMessage2.reserveInfo;
        if (reserveInfo != null) {
            _ReserveInfo_ProtoDecoder.LJ(reserveInfo);
        }
        OptPairInfo optPairInfo = linkMicAnchorGuideMessage2.optPairInfo;
        if (optPairInfo != null) {
            _OptPairInfo_ProtoDecoder.LJ(optPairInfo);
        }
        List<UserModelPredictionData> list = linkMicAnchorGuideMessage2.userModelPredictionData;
        if (list == null) {
            linkMicAnchorGuideMessage2.userModelPredictionData = new ArrayList();
        } else if (!list.isEmpty()) {
            for (UserModelPredictionData userModelPredictionData : linkMicAnchorGuideMessage2.userModelPredictionData) {
                if (userModelPredictionData != null && userModelPredictionData.modelPredictionData == null) {
                    userModelPredictionData.modelPredictionData = new HashMap();
                }
            }
        }
        CohostFollowMessage cohostFollowMessage = linkMicAnchorGuideMessage2.cohostFollowMessage;
        if (cohostFollowMessage != null) {
            _CohostFollowMessage_ProtoDecoder.LJ(cohostFollowMessage);
        }
    }

    @Override // X.C0IMD
    public final LinkMicAnchorGuideMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMicAnchorGuideMessage linkMicAnchorGuideMessage = new LinkMicAnchorGuideMessage();
        linkMicAnchorGuideMessage.userModelPredictionData = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkMicAnchorGuideMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkMicAnchorGuideMessage.guideContent = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        linkMicAnchorGuideMessage.buttonContent = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        linkMicAnchorGuideMessage.connectType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        linkMicAnchorGuideMessage.guideType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        linkMicAnchorGuideMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        linkMicAnchorGuideMessage.logId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        linkMicAnchorGuideMessage.reserveInfo = _ReserveInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkMicAnchorGuideMessage.buttonShowType = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        linkMicAnchorGuideMessage.optPairInfo = _OptPairInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        linkMicAnchorGuideMessage.userModelPredictionData.add(_UserModelPredictionData_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        switch (iLJI) {
                            case 21:
                                linkMicAnchorGuideMessage.isFollowRival = C1516700pZU.LIZ(c1516680pZS);
                                break;
                            case 22:
                                linkMicAnchorGuideMessage.availableFriendNumber = (int) c1516680pZS.LJIIJJI();
                                break;
                            case 23:
                                linkMicAnchorGuideMessage.groupChannelId = c1516680pZS.LJIIJJI();
                                break;
                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                linkMicAnchorGuideMessage.cohostFollowMessage = _CohostFollowMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicAnchorGuideMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicAnchorGuideMessage linkMicAnchorGuideMessage, List list) {
    }
}
