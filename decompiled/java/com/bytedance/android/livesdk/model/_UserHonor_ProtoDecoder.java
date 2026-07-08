package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _UserHonor_ProtoDecoder implements C0IMD<UserHonor> {
    public static UserHonor LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserHonor userHonor = new UserHonor();
        userHonor.gradeIconList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1001) {
                    switch (iLJI) {
                        case 1:
                            userHonor.totalDiamond = c1516680pZS.LJIIJJI();
                            break;
                        case 2:
                            userHonor.diamondIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 3:
                            userHonor.currentHonorName = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            userHonor.currentHonorIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            userHonor.nextHonorName = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            userHonor.level = (int) c1516680pZS.LJIIJJI();
                            break;
                        case 7:
                            userHonor.nextHonorIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        default:
                            switch (iLJI) {
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    userHonor.currentDiamond = c1516680pZS.LJIIJJI();
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    userHonor.thisGradeMinDiamond = c1516680pZS.LJIIJJI();
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    userHonor.thisGradeMaxDiamond = c1516680pZS.LJIIJJI();
                                    break;
                                default:
                                    switch (iLJI) {
                                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                            userHonor.gradeDescribe = C1516700pZU.LIZLLL(c1516680pZS);
                                            break;
                                        case 14:
                                            userHonor.gradeIconList.add(_GradeIcon_ProtoDecoder.LIZLLL(c1516680pZS));
                                            break;
                                        case 15:
                                            userHonor.screenChatType = c1516680pZS.LJIIJJI();
                                            break;
                                        case 16:
                                            userHonor.imIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                            userHonor.imIconWithLevel = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                            userHonor.liveIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 19:
                                            userHonor.newImIconWithLevel = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                            userHonor.newLiveIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 21:
                                            userHonor.upgradeNeedConsume = c1516680pZS.LJIIJJI();
                                            break;
                                        case 22:
                                            userHonor.nextPrivileges = C1516700pZU.LIZLLL(c1516680pZS);
                                            break;
                                        case 23:
                                            userHonor.profileDialogBg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                            userHonor.profileDialogBackBg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 25:
                                            userHonor.score = c1516680pZS.LJIIJJI();
                                            break;
                                        default:
                                            C1516700pZU.LJ(c1516680pZS);
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    userHonor.gradeBanner = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userHonor;
            }
        }
    }

    public static void LJ(UserHonor userHonor) {
        ImageModel imageModel;
        ImageModel imageModel2 = userHonor.diamondIcon;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        ImageModel imageModel3 = userHonor.currentHonorIcon;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        ImageModel imageModel4 = userHonor.nextHonorIcon;
        if (imageModel4 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel4);
        }
        List<GradeIcon> list = userHonor.gradeIconList;
        if (list == null) {
            userHonor.gradeIconList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GradeIcon gradeIcon : userHonor.gradeIconList) {
                if (gradeIcon != null && (imageModel = gradeIcon.icon) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        ImageModel imageModel5 = userHonor.imIcon;
        if (imageModel5 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel5);
        }
        ImageModel imageModel6 = userHonor.imIconWithLevel;
        if (imageModel6 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel6);
        }
        ImageModel imageModel7 = userHonor.liveIcon;
        if (imageModel7 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel7);
        }
        ImageModel imageModel8 = userHonor.newImIconWithLevel;
        if (imageModel8 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel8);
        }
        ImageModel imageModel9 = userHonor.newLiveIcon;
        if (imageModel9 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel9);
        }
        ImageModel imageModel10 = userHonor.profileDialogBg;
        if (imageModel10 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel10);
        }
        ImageModel imageModel11 = userHonor.profileDialogBackBg;
        if (imageModel11 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel11);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserHonor userHonor) {
        LJ(userHonor);
    }

    @Override // X.C0IMD
    public final UserHonor LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserHonor userHonor, List list) {
    }
}
