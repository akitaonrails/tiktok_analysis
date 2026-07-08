package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.bytedance.android.live.base.model.user._PrivilegeLogExtra_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.message.proto.DisplayControl;
import com.bytedance.android.livesdk.message.proto._DisplayControl_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BarrageMessage_ProtoDecoder implements C0IMD<BarrageMessage> {
    @Override // X.C0IMD
    public final void LIZ(BarrageMessage barrageMessage) {
        User user;
        User user2;
        Text text;
        BarrageMessage barrageMessage2 = barrageMessage;
        CommonMessageData commonMessageData = barrageMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        BarrageMessage.BarrageEvent barrageEvent = barrageMessage2.event;
        if (barrageEvent != null && barrageEvent.params == null) {
            barrageEvent.params = new HashMap();
        }
        ImageModel imageModel = barrageMessage2.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text2 = barrageMessage2.content;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        ImageModel imageModel2 = barrageMessage2.backGround;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        ImageModel imageModel3 = barrageMessage2.rightIcon;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        DisplayControl displayControl = barrageMessage2.control;
        if (displayControl != null) {
            _DisplayControl_ProtoDecoder.LJ(displayControl);
        }
        BarrageMessage.RightLabel rightLabel = barrageMessage2.rightLabel;
        if (rightLabel != null && (text = rightLabel.content) != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        BadgeStruct badgeStruct = barrageMessage2.badge;
        if (badgeStruct != null) {
            _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
        }
        ImageModel imageModel4 = barrageMessage2.ribbonAnimation;
        if (imageModel4 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel4);
        }
        Text text3 = barrageMessage2.commonBarrageContent;
        if (text3 != null) {
            _Text_ProtoDecoder.LJ(text3);
        }
        User user3 = barrageMessage2.user;
        if (user3 != null) {
            _User_ProtoDecoder.LJ(user3);
        }
        BarrageTypeUserGradeParam barrageTypeUserGradeParam = barrageMessage2.userGradeParam;
        if (barrageTypeUserGradeParam != null && (user2 = barrageTypeUserGradeParam.user) != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        BarrageTypeFansLevelParam barrageTypeFansLevelParam = barrageMessage2.fansLevelParam;
        if (barrageTypeFansLevelParam != null && (user = barrageTypeFansLevelParam.user) != null) {
            _User_ProtoDecoder.LJ(user);
        }
        PublicAreaMessageCommon publicAreaMessageCommon = barrageMessage2.publicAreaMessageCommon;
        if (publicAreaMessageCommon != null) {
            _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
        }
    }

    @Override // X.C0IMD
    public final BarrageMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BarrageMessage barrageMessage = new BarrageMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 50) {
                    switch (iLJI) {
                        case 1:
                            barrageMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            barrageMessage.event = _BarrageMessage_BarrageEvent_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 3:
                            barrageMessage.msgType = c1516680pZS.LJIIJ();
                            break;
                        case 4:
                            barrageMessage.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            barrageMessage.content = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            barrageMessage.duration = c1516680pZS.LJIIJJI();
                            break;
                        case 7:
                            barrageMessage.backGround = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 8:
                            barrageMessage.rightIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            barrageMessage.displayConfig = c1516680pZS.LJIIJ();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            barrageMessage.galleryGiftId = c1516680pZS.LJIIJJI();
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            barrageMessage.scene = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            barrageMessage.control = _DisplayControl_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            barrageMessage.rightLabel = _BarrageMessage_RightLabel_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 14:
                            barrageMessage.useMarquee = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 15:
                            barrageMessage.showType = c1516680pZS.LJIIJ();
                            break;
                        case 16:
                            barrageMessage.badge = _BadgeStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            barrageMessage.renderType = c1516680pZS.LJIIJ();
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            barrageMessage.leftIconDisplayType = c1516680pZS.LJIIJ();
                            break;
                        case 19:
                            barrageMessage.ribbonAnimation = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            barrageMessage.animationData = _AnimationData_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 21:
                            barrageMessage.hybridUrl = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 22:
                            barrageMessage.schema = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 23:
                            barrageMessage.subType = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            barrageMessage.commonBarrageContent = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        default:
                            switch (iLJI) {
                                case 100:
                                    barrageMessage.userGradeParam = _BarrageTypeUserGradeParam_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 101:
                                    barrageMessage.fansLevelParam = _BarrageTypeFansLevelParam_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 102:
                                    barrageMessage.subscribeGiftParam = _BarrageTypeSubscribeGiftParam_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 103:
                                    barrageMessage.privilegeLogExtra = _PrivilegeLogExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 104:
                                    barrageMessage.giftGalleryParams = _BarrageTypeGiftGalleryParam_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 105:
                                    barrageMessage.publicAreaMessageCommon = _PublicAreaMessageCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 106:
                                    barrageMessage.ecomLiveParam = _BarrageTypeEcomLiveParam_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                            break;
                    }
                } else {
                    barrageMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return barrageMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BarrageMessage barrageMessage, List list) {
    }
}
