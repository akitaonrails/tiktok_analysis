package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.api.user_level.PayGradeInfo;
import tikcast.api.user_level.UserGrade;
import tikcast.api.user_level._PayGradeInfo_ProtoDecoder;
import webcast.data.FansLevelInfo;
import webcast.data._FansLevelInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _SendGiftResult_ProtoDecoder implements C0IMD<SendGiftResult> {
    @Override // X.C0IMD
    public final void LIZ(SendGiftResult sendGiftResult) {
        BadgeStruct badgeStruct;
        UserGrade userGrade;
        SendGiftResult sendGiftResult2 = sendGiftResult;
        Text text = sendGiftResult2.displayText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        List<Prop> list = sendGiftResult2.props;
        if (list == null) {
            sendGiftResult2.props = new ArrayList();
        } else if (!list.isEmpty()) {
            for (Prop prop : sendGiftResult2.props) {
                if (prop != null) {
                    _Prop_ProtoDecoder.LJ(prop);
                }
            }
        }
        List<GiftResultData> list2 = sendGiftResult2.gifts;
        if (list2 == null) {
            sendGiftResult2.gifts = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (GiftResultData giftResultData : sendGiftResult2.gifts) {
                if (giftResultData != null) {
                    _GiftResultData_ProtoDecoder.LJ(giftResultData);
                }
            }
        }
        List<ExchangeGiftResultData> list3 = sendGiftResult2.balanceResult;
        if (list3 == null) {
            sendGiftResult2.balanceResult = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<ExchangeGiftResultData> it2 = sendGiftResult2.balanceResult.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        PayGradeInfo payGradeInfo = sendGiftResult2.payGradeInfo;
        if (payGradeInfo != null && (userGrade = payGradeInfo.userGrade) != null) {
            BadgeStruct badgeStruct2 = userGrade.defaultGradeBadge;
            if (badgeStruct2 != null) {
                _BadgeStruct_ProtoDecoder.LJ(badgeStruct2);
            }
            BadgeStruct badgeStruct3 = userGrade.opacityBadge;
            if (badgeStruct3 != null) {
                _BadgeStruct_ProtoDecoder.LJ(badgeStruct3);
            }
        }
        List<LynxGiftExtra> list4 = sendGiftResult2.lynxExtra;
        if (list4 == null) {
            sendGiftResult2.lynxExtra = new ArrayList();
        } else if (!list4.isEmpty()) {
            for (LynxGiftExtra lynxGiftExtra : sendGiftResult2.lynxExtra) {
                if (lynxGiftExtra != null && lynxGiftExtra.params == null) {
                    lynxGiftExtra.params = new ArrayList();
                }
            }
        }
        FansLevelInfo fansLevelInfo = sendGiftResult2.fansLevelInfo;
        if (fansLevelInfo != null && (badgeStruct = fansLevelInfo.badge) != null) {
            _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
        }
        FlyingMicResources flyingMicResources = sendGiftResult2.flyingMicResources;
        if (flyingMicResources != null) {
            _FlyingMicResources_ProtoDecoder.LJ(flyingMicResources);
        }
        TeamRankProgress teamRankProgress = sendGiftResult2.teamRankProgress;
        if (teamRankProgress != null && teamRankProgress.giftIds == null) {
            teamRankProgress.giftIds = new ArrayList();
        }
        List<SponsorshipInfo> list5 = sendGiftResult2.sponsorshipInfo;
        if (list5 == null) {
            sendGiftResult2.sponsorshipInfo = new ArrayList();
        } else if (!list5.isEmpty()) {
            Iterator<SponsorshipInfo> it3 = sendGiftResult2.sponsorshipInfo.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        FlyingMicResources flyingMicResources2 = sendGiftResult2.flyingMicResourcesV2;
        if (flyingMicResources2 != null) {
            _FlyingMicResources_ProtoDecoder.LJ(flyingMicResources2);
        }
        GiftChallengeProgress giftChallengeProgress = sendGiftResult2.giftChallengeProgress;
        if (giftChallengeProgress != null) {
            _GiftChallengeProgress_ProtoDecoder.LJ(giftChallengeProgress);
        }
        SecondaryEffectInfo secondaryEffectInfo = sendGiftResult2.secondaryEffectInfo;
        if (secondaryEffectInfo != null) {
            _SecondaryEffectInfo_ProtoDecoder.LJ(secondaryEffectInfo);
        }
        PanelRefresh panelRefresh = sendGiftResult2.panelRefreshData;
        if (panelRefresh != null) {
            _PanelRefresh_ProtoDecoder.LJ(panelRefresh);
        }
    }

    @Override // X.C0IMD
    public final SendGiftResult LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SendGiftResult sendGiftResult = new SendGiftResult();
        sendGiftResult.lynxExtra = new ArrayList();
        sendGiftResult.gifts = new ArrayList();
        sendGiftResult.balanceResult = new ArrayList();
        sendGiftResult.sponsorshipInfo = new ArrayList();
        sendGiftResult.props = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 100) {
                    switch (iLJI) {
                        case 1:
                            sendGiftResult.displayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            sendGiftResult.fanTicketCount = (int) c1516680pZS.LJIIJJI();
                            break;
                        case 3:
                            sendGiftResult.describe = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            sendGiftResult.mGiftId = c1516680pZS.LJIIJJI();
                            break;
                        case 5:
                            sendGiftResult.groupCount = (int) c1516680pZS.LJIIJJI();
                            break;
                        case 6:
                            sendGiftResult.mLeftDiamonds = c1516680pZS.LJIIJJI();
                            break;
                        case 7:
                            sendGiftResult.repeatCount = (int) c1516680pZS.LJIIJJI();
                            break;
                        case 8:
                            sendGiftResult.comboCount = (int) c1516680pZS.LJIIJJI();
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            sendGiftResult.propId = c1516680pZS.LJIIJJI();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            sendGiftResult.propType = (int) c1516680pZS.LJIIJJI();
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            sendGiftResult.props.add(_Prop_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            sendGiftResult.msgId = c1516680pZS.LJIIJJI();
                            break;
                        default:
                            switch (iLJI) {
                                case 15:
                                    sendGiftResult.gifts.add(_GiftResultData_ProtoDecoder.LIZLLL(c1516680pZS));
                                    break;
                                case 16:
                                    sendGiftResult.roomFanTicketCount = Long.valueOf(c1516680pZS.LJIIJJI());
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                    sendGiftResult.groupId = c1516680pZS.LJIIJJI();
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                    sendGiftResult.orderId = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 19:
                                    sendGiftResult.mCalmDownInfo = _CalmDownInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                    sendGiftResult.balanceResult.add(_ExchangeGiftResultData_ProtoDecoder.LIZLLL(c1516680pZS));
                                    break;
                                case 21:
                                    sendGiftResult.monitorExtra = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 22:
                                    sendGiftResult.isFirstSend = C1516700pZU.LIZ(c1516680pZS);
                                    break;
                                case 23:
                                    sendGiftResult.freqLimitRemaintimes = c1516680pZS.LJIIJ();
                                    break;
                                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                    sendGiftResult.payGradeInfo = _PayGradeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 25:
                                    sendGiftResult.lynxExtra.add(_LynxGiftExtra_ProtoDecoder.LIZLLL(c1516680pZS));
                                    break;
                                case 26:
                                    sendGiftResult.matchInfo = _MatchInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 27:
                                    sendGiftResult.linkmicGiftExpressionStrategy = c1516680pZS.LJIIJ();
                                    break;
                                case 28:
                                    sendGiftResult.fansLevelInfo = _FansLevelInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 29:
                                    sendGiftResult.anchorFansCount = c1516680pZS.LJIIJJI();
                                    break;
                                case 30:
                                    sendGiftResult.flyingMicResources = _FlyingMicResources_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 31:
                                    sendGiftResult.teamRankProgress = _TeamRankProgress_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 32:
                                    sendGiftResult.version = c1516680pZS.LJIIJ();
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                    sendGiftResult.sponsorshipInfo.add(_SponsorshipInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                    sendGiftResult.giftGalleryComboSponsor = C1516700pZU.LIZ(c1516680pZS);
                                    break;
                                case 35:
                                    sendGiftResult.flyingMicResourcesV2 = _FlyingMicResources_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                    sendGiftResult.giftChallengeProgress = _GiftChallengeProgress_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 37:
                                    sendGiftResult.backpackInfo = _BackpackInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 38:
                                    sendGiftResult.fansClubInfo = _GiftSendFansClubInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 39:
                                    sendGiftResult.multiGenerateMessage = C1516700pZU.LIZ(c1516680pZS);
                                    break;
                                case 40:
                                    sendGiftResult.toMemberId = c1516680pZS.LJIIJJI();
                                    break;
                                case 41:
                                    sendGiftResult.toMemberNickname = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 42:
                                    sendGiftResult.levelUpGiftInfo = _LevelUpGiftInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 43:
                                    sendGiftResult.secondaryEffectInfo = _SecondaryEffectInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 44:
                                    sendGiftResult.giftVariantId = c1516680pZS.LJIIJ();
                                    break;
                                case 45:
                                    sendGiftResult.coinsBalanceVersion = c1516680pZS.LJIIJJI();
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                            break;
                    }
                } else {
                    sendGiftResult.panelRefreshData = _PanelRefresh_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sendGiftResult;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SendGiftResult sendGiftResult, List list) {
    }
}
