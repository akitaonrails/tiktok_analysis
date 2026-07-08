package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets._AssetsModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.AssetBundle;
import com.bytedance.android.livesdk.gift.model.FlyingMicResources;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.gift.model.LynxGiftExtra;
import com.bytedance.android.livesdk.gift.model.SecondaryEffectInfo;
import com.bytedance.android.livesdk.gift.model._AssetBundle_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._FlyingMicResources_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftEffect_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._LynxGiftExtra_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._MatchInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._SecondaryEffectInfo_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.GiftsBoxInfo;
import com.bytedance.android.livesdk.model._GiftTrayInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.android.livesdk.model._GiftsBoxInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.TextEffect;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data._MsgFilter_ProtoDecoder;
import webcast.data._UserIdentity_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftMessage_ProtoDecoder implements C0IMD<GiftMessage> {
    public static GiftMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftMessage giftMessage = new GiftMessage();
        giftMessage.lynxExtra = new ArrayList();
        giftMessage.sponsorshipInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 100) {
                    switch (iLJI) {
                        case 1:
                            giftMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            giftMessage.giftId = c1516680pZS.LJIIJJI();
                            break;
                        case 3:
                            giftMessage.fanTicketCount = (int) c1516680pZS.LJIIJJI();
                            break;
                        case 4:
                            giftMessage.groupCount = (int) c1516680pZS.LJIIJJI();
                            break;
                        case 5:
                            giftMessage.repeatCount = (int) c1516680pZS.LJIIJJI();
                            break;
                        case 6:
                            giftMessage.comboCount = (int) c1516680pZS.LJIIJJI();
                            break;
                        case 7:
                            giftMessage.fromUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 8:
                            giftMessage.toUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            giftMessage.repeatEnd = c1516680pZS.LJIIJ();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            giftMessage.textEffect = _TextEffect_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            giftMessage.groupId = c1516680pZS.LJIIJJI();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            giftMessage.incomeTaskgifts = Long.valueOf(c1516680pZS.LJIIJJI());
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            giftMessage.roomFanTicketCount = c1516680pZS.LJIIJJI();
                            break;
                        case 14:
                            giftMessage.priority = _GiftIMPriority_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 15:
                            giftMessage.mGift = _Gift_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 16:
                            giftMessage.mLogId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            giftMessage.sendType = Long.valueOf(c1516680pZS.LJIIJJI());
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            giftMessage.publicAreaCommon = _PublicAreaCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 19:
                            giftMessage.trayDisplayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            giftMessage.bannedDisplayEffects = Long.valueOf(c1516680pZS.LJIIJJI());
                            break;
                        case 21:
                            giftMessage.mTrayInfo = _GiftTrayInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        default:
                            switch (iLJI) {
                                case 23:
                                    giftMessage.giftMonitorInfo = _GiftMonitorInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                    giftMessage.colorId = Long.valueOf(c1516680pZS.LJIIJJI());
                                    break;
                                case 25:
                                    giftMessage.isFirstSendGift = C1516700pZU.LIZ(c1516680pZS);
                                    break;
                                case 26:
                                    giftMessage.displayTextForAnchor = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 27:
                                    giftMessage.displayTextForAudience = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 28:
                                    giftMessage.orderId = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 29:
                                    giftMessage.giftsInBox = _GiftsBoxInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 30:
                                    giftMessage.msgFilter = _MsgFilter_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 31:
                                    giftMessage.lynxExtra.add(_LynxGiftExtra_ProtoDecoder.LIZLLL(c1516680pZS));
                                    break;
                                case 32:
                                    giftMessage.userIdentity = _UserIdentity_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                    giftMessage.matchInfo = _MatchInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                    giftMessage.linkmicGiftExpressionStrategy = c1516680pZS.LJIIJ();
                                    break;
                                case 35:
                                    giftMessage.flyingMicResources = _FlyingMicResources_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                    giftMessage.disableGiftTracking = C1516700pZU.LIZ(c1516680pZS);
                                    break;
                                case 37:
                                    giftMessage.asset = _AssetsModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 38:
                                    giftMessage.version = c1516680pZS.LJIIJ();
                                    break;
                                case 39:
                                    giftMessage.sponsorshipInfo.add(_GiftMessage_SponsorshipInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                                    break;
                                case 40:
                                    giftMessage.flyingMicResourcesV2 = _FlyingMicResources_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 41:
                                    giftMessage.publicAreaMessageCommon = _PublicAreaMessageCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 42:
                                    giftMessage.signature = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 43:
                                    giftMessage.signatureVersion = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 44:
                                    giftMessage.multiGenerateMessage = C1516700pZU.LIZ(c1516680pZS);
                                    break;
                                case 45:
                                    giftMessage.toMemberId = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 46:
                                    giftMessage.toMemberIdInt = c1516680pZS.LJIIJJI();
                                    break;
                                case 47:
                                    giftMessage.toMemberNickname = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 48:
                                    giftMessage.interactiveGiftInfo = _GiftMessage_InteractiveGiftInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 49:
                                    giftMessage.displayDurationMs = c1516680pZS.LJIIJJI();
                                    break;
                                case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                    giftMessage.displayTextForSender = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 51:
                                    giftMessage.isAssetBundleGift = C1516700pZU.LIZ(c1516680pZS);
                                    break;
                                case 52:
                                    giftMessage.assetBundle = _AssetBundle_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 53:
                                    giftMessage.effectExtra = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 54:
                                    giftMessage.secondaryEffectInfo = _SecondaryEffectInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 55:
                                    giftMessage.giftVariantId = c1516680pZS.LJIIJ();
                                    break;
                                case 56:
                                    giftMessage.shinyCardUnlockToken = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                            break;
                    }
                } else {
                    giftMessage.giftEffect = _GiftEffect_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftMessage;
            }
        }
    }

    public static void LJ(GiftMessage giftMessage) {
        ImageModel imageModel;
        CommonMessageData commonMessageData = giftMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = giftMessage.fromUser;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        User user2 = giftMessage.toUser;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        TextEffect textEffect = giftMessage.textEffect;
        if (textEffect != null) {
            TextEffect.Detail detail = textEffect.portraitDetail;
            if (detail != null) {
                Text text = detail.text;
                if (text != null) {
                    _Text_ProtoDecoder.LJ(text);
                }
                ImageModel imageModel2 = detail.background;
                if (imageModel2 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
            }
            TextEffect.Detail detail2 = textEffect.landscapeDetail;
            if (detail2 != null) {
                Text text2 = detail2.text;
                if (text2 != null) {
                    _Text_ProtoDecoder.LJ(text2);
                }
                ImageModel imageModel3 = detail2.background;
                if (imageModel3 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel3);
                }
            }
        }
        GiftIMPriority giftIMPriority = giftMessage.priority;
        if (giftIMPriority != null) {
            _GiftIMPriority_ProtoDecoder.LJ(giftIMPriority);
        }
        Gift gift = giftMessage.mGift;
        if (gift != null) {
            _Gift_ProtoDecoder.LJ(gift);
        }
        PublicAreaCommon publicAreaCommon = giftMessage.publicAreaCommon;
        if (publicAreaCommon != null && (imageModel = publicAreaCommon.userLabel) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text3 = giftMessage.trayDisplayText;
        if (text3 != null) {
            _Text_ProtoDecoder.LJ(text3);
        }
        GiftTrayInfo giftTrayInfo = giftMessage.mTrayInfo;
        if (giftTrayInfo != null) {
            _GiftTrayInfo_ProtoDecoder.LJ(giftTrayInfo);
        }
        Text text4 = giftMessage.displayTextForAnchor;
        if (text4 != null) {
            _Text_ProtoDecoder.LJ(text4);
        }
        Text text5 = giftMessage.displayTextForAudience;
        if (text5 != null) {
            _Text_ProtoDecoder.LJ(text5);
        }
        GiftsBoxInfo giftsBoxInfo = giftMessage.giftsInBox;
        if (giftsBoxInfo != null) {
            _GiftsBoxInfo_ProtoDecoder.LJ(giftsBoxInfo);
        }
        List<LynxGiftExtra> list = giftMessage.lynxExtra;
        if (list == null) {
            giftMessage.lynxExtra = new ArrayList();
        } else if (!list.isEmpty()) {
            for (LynxGiftExtra lynxGiftExtra : giftMessage.lynxExtra) {
                if (lynxGiftExtra != null && lynxGiftExtra.params == null) {
                    lynxGiftExtra.params = new ArrayList();
                }
            }
        }
        FlyingMicResources flyingMicResources = giftMessage.flyingMicResources;
        if (flyingMicResources != null) {
            _FlyingMicResources_ProtoDecoder.LJ(flyingMicResources);
        }
        AssetsModel assetsModel = giftMessage.asset;
        if (assetsModel != null) {
            _AssetsModel_ProtoDecoder.LJ(assetsModel);
        }
        List<GiftMessage.SponsorshipInfo> list2 = giftMessage.sponsorshipInfo;
        if (list2 == null) {
            giftMessage.sponsorshipInfo = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<GiftMessage.SponsorshipInfo> it2 = giftMessage.sponsorshipInfo.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        FlyingMicResources flyingMicResources2 = giftMessage.flyingMicResourcesV2;
        if (flyingMicResources2 != null) {
            _FlyingMicResources_ProtoDecoder.LJ(flyingMicResources2);
        }
        PublicAreaMessageCommon publicAreaMessageCommon = giftMessage.publicAreaMessageCommon;
        if (publicAreaMessageCommon != null) {
            _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
        }
        Text text6 = giftMessage.displayTextForSender;
        if (text6 != null) {
            _Text_ProtoDecoder.LJ(text6);
        }
        AssetBundle assetBundle = giftMessage.assetBundle;
        if (assetBundle != null) {
            _AssetBundle_ProtoDecoder.LJ(assetBundle);
        }
        SecondaryEffectInfo secondaryEffectInfo = giftMessage.secondaryEffectInfo;
        if (secondaryEffectInfo != null) {
            _SecondaryEffectInfo_ProtoDecoder.LJ(secondaryEffectInfo);
        }
        GiftEffect giftEffect = giftMessage.giftEffect;
        if (giftEffect != null) {
            _GiftEffect_ProtoDecoder.LJ(giftEffect);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftMessage giftMessage) {
        LJ(giftMessage);
    }

    @Override // X.C0IMD
    public final GiftMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftMessage giftMessage, List list) {
    }
}
