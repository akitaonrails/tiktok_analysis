package com.bytedance.android.livesdk.activity.quiz.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuizUserIdentityInfo_ProtoDecoder implements C0IMD<QuizUserIdentityInfo> {
    public static QuizUserIdentityInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuizUserIdentityInfo quizUserIdentityInfo = new QuizUserIdentityInfo();
        quizUserIdentityInfo.userIdentityInfos = new ArrayList();
        quizUserIdentityInfo.userQuestionResult = new ArrayList();
        quizUserIdentityInfo.userLiveEventInfos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        quizUserIdentityInfo.messageType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        quizUserIdentityInfo.quizId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        quizUserIdentityInfo.quizType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        quizUserIdentityInfo.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        quizUserIdentityInfo.userDataVersion = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        quizUserIdentityInfo.deviceId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        quizUserIdentityInfo.userStatus = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        quizUserIdentityInfo.respawnBalance = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        quizUserIdentityInfo.doubleBonusBalance = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        quizUserIdentityInfo.spectatorType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        quizUserIdentityInfo.isQuestionEncrypt = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        quizUserIdentityInfo.questionEncryptKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        quizUserIdentityInfo.userQuestionResult.add(_QuizUserQuestionResult_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 14:
                        quizUserIdentityInfo.availableRespawnBalance = c1516680pZS.LJIIJ();
                        break;
                    case 15:
                        quizUserIdentityInfo.availableDoubleBonusBalance = c1516680pZS.LJIIJ();
                        break;
                    case 16:
                        quizUserIdentityInfo.isRetainIfWrong = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        quizUserIdentityInfo.userLiveEventInfos.add(_UserLiveEventInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        quizUserIdentityInfo.userIdentityInfos.add(LIZLLL(c1516680pZS));
                        break;
                    default:
                        switch (iLJI) {
                            case 51:
                                quizUserIdentityInfo.extra1 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 52:
                                quizUserIdentityInfo.extra2 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 53:
                                quizUserIdentityInfo.extra3 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 54:
                                quizUserIdentityInfo.extra4 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 55:
                                quizUserIdentityInfo.extra5 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quizUserIdentityInfo;
            }
        }
    }

    public static void LJ(QuizUserIdentityInfo quizUserIdentityInfo) {
        List<QuizUserQuestionResult> list = quizUserIdentityInfo.userQuestionResult;
        if (list == null) {
            quizUserIdentityInfo.userQuestionResult = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<QuizUserQuestionResult> it2 = quizUserIdentityInfo.userQuestionResult.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<UserLiveEventInfo> list2 = quizUserIdentityInfo.userLiveEventInfos;
        if (list2 == null) {
            quizUserIdentityInfo.userLiveEventInfos = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<UserLiveEventInfo> it3 = quizUserIdentityInfo.userLiveEventInfos.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        List<QuizUserIdentityInfo> list3 = quizUserIdentityInfo.userIdentityInfos;
        if (list3 == null) {
            quizUserIdentityInfo.userIdentityInfos = new ArrayList();
            return;
        }
        if (list3.isEmpty()) {
            return;
        }
        for (QuizUserIdentityInfo quizUserIdentityInfo2 : quizUserIdentityInfo.userIdentityInfos) {
            if (quizUserIdentityInfo2 != null) {
                LJ(quizUserIdentityInfo2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(QuizUserIdentityInfo quizUserIdentityInfo) {
        LJ(quizUserIdentityInfo);
    }

    @Override // X.C0IMD
    public final QuizUserIdentityInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuizUserIdentityInfo quizUserIdentityInfo, List list) {
    }
}
