package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.MemberMessage;
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
public final class _MemberMessage_ProtoDecoder implements C0IMD<MemberMessage> {
    @Override // X.C0IMD
    public final void LIZ(MemberMessage memberMessage) {
        MemberMessage memberMessage2 = memberMessage;
        CommonMessageData commonMessageData = memberMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = memberMessage2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        User user2 = memberMessage2.operator;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        MemberMessage.EffectConfigBean effectConfigBean = memberMessage2.effectConfig;
        if (effectConfigBean != null) {
            ImageModel imageModel = effectConfigBean.icon;
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
            Text text = effectConfigBean.textKey;
            if (text != null) {
                _Text_ProtoDecoder.LJ(text);
            }
            ImageModel imageModel2 = effectConfigBean.badge;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
        ImageModel imageModel3 = memberMessage2.background;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        Text text2 = memberMessage2.anchorDisplayText;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        if (memberMessage2.adminPermissions == null) {
            memberMessage2.adminPermissions = new HashMap();
        }
        PublicAreaMessageCommon publicAreaMessageCommon = memberMessage2.publicAreaMessageCommon;
        if (publicAreaMessageCommon != null) {
            _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
        }
    }

    @Override // X.C0IMD
    public final MemberMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MemberMessage memberMessage = new MemberMessage();
        memberMessage.adminPermissions = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        memberMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        memberMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        memberMessage.count = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        memberMessage.operator = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        memberMessage.setToAdmin = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        memberMessage.isTopUser = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        memberMessage.rankScore = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        memberMessage.topUserNo = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        memberMessage.enterType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        memberMessage.action = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        memberMessage.actionDescription = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        memberMessage.userId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    case 16:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 14:
                        memberMessage.popStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        memberMessage.effectConfig = _MemberMessage_EffectConfigBean_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        memberMessage.background = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        memberMessage.anchorDisplayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 19:
                        memberMessage.clientEnterSource = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        memberMessage.clientEnterType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        memberMessage.clientLiveReason = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 22:
                        memberMessage.actionDuration = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 23:
                        memberMessage.userShareType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        memberMessage.displayStyle = c1516680pZS.LJIIJ();
                        break;
                    case 25:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Integer numValueOf = null;
                        Integer numValueOf2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        numValueOf2 = Integer.valueOf(c1516680pZS.LJIIJ());
                                    }
                                } else {
                                    numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (numValueOf != null) {
                                    if (numValueOf2 != null) {
                                        memberMessage.adminPermissions.put(numValueOf, numValueOf2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 26:
                        memberMessage.kickSource = c1516680pZS.LJIIJ();
                        break;
                    case 27:
                        memberMessage.allowPreviewTime = c1516680pZS.LJIIJJI();
                        break;
                    case 28:
                        memberMessage.lastSubscriptionAction = c1516680pZS.LJIIJJI();
                        break;
                    case 29:
                        memberMessage.publicAreaMessageCommon = _PublicAreaMessageCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 30:
                        memberMessage.liveSubOnlyTier = c1516680pZS.LJIIJJI();
                        break;
                    case 31:
                        memberMessage.liveSubOnlyMonth = c1516680pZS.LJIIJJI();
                        break;
                    case 32:
                        memberMessage.ecStreamerKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                        memberMessage.showWave = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        memberMessage.waveAlgorithmData = _WaveAlgorithmData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 35:
                        memberMessage.hitAbStatus = c1516680pZS.LJIIJ();
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return memberMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MemberMessage memberMessage, List list) {
    }
}
