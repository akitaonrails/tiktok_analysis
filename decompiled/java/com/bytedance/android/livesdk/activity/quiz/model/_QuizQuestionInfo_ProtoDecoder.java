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
public final class _QuizQuestionInfo_ProtoDecoder implements C0IMD<QuizQuestionInfo> {
    public static QuizQuestionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuizQuestionInfo quizQuestionInfo = new QuizQuestionInfo();
        quizQuestionInfo.image = new ArrayList();
        quizQuestionInfo.nextQuiz = new ArrayList();
        quizQuestionInfo.options = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        quizQuestionInfo.messageType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        quizQuestionInfo.quizId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        quizQuestionInfo.quizType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        quizQuestionInfo.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        quizQuestionInfo.participantsCount = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        quizQuestionInfo.questionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        quizQuestionInfo.questionNo = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        quizQuestionInfo.questionCount = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        quizQuestionInfo.questionType = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        quizQuestionInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        quizQuestionInfo.image.add(_QuizImage_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        quizQuestionInfo.options.add(_QuizQuestionOption_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        switch (iLJI) {
                            case 15:
                                quizQuestionInfo.rewardAmount = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 16:
                                quizQuestionInfo.questionDurationMs = c1516680pZS.LJIIJ();
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                quizQuestionInfo.nextQuiz.add(_QuizNextQuiz_ProtoDecoder.LIZLLL(c1516680pZS));
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                quizQuestionInfo.sponsorCode = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 19:
                                quizQuestionInfo.displayDurationMs = c1516680pZS.LJIIJ();
                                break;
                            default:
                                switch (iLJI) {
                                    case 51:
                                        quizQuestionInfo.extra1 = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 52:
                                        quizQuestionInfo.extra2 = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 53:
                                        quizQuestionInfo.extra3 = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 54:
                                        quizQuestionInfo.extra4 = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 55:
                                        quizQuestionInfo.extra5 = C1516700pZU.LIZLLL(c1516680pZS);
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
                c1516680pZS.LJ(jLIZJ);
                return quizQuestionInfo;
            }
        }
    }

    public static void LJ(QuizQuestionInfo quizQuestionInfo) {
        List<QuizImage> list = quizQuestionInfo.image;
        if (list == null) {
            quizQuestionInfo.image = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<QuizImage> it2 = quizQuestionInfo.image.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<QuizQuestionOption> list2 = quizQuestionInfo.options;
        if (list2 == null) {
            quizQuestionInfo.options = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (QuizQuestionOption quizQuestionOption : quizQuestionInfo.options) {
                if (quizQuestionOption != null) {
                    _QuizQuestionOption_ProtoDecoder.LJ(quizQuestionOption);
                }
            }
        }
        List<QuizNextQuiz> list3 = quizQuestionInfo.nextQuiz;
        if (list3 == null) {
            quizQuestionInfo.nextQuiz = new ArrayList();
        } else {
            if (list3.isEmpty()) {
                return;
            }
            Iterator<QuizNextQuiz> it3 = quizQuestionInfo.nextQuiz.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(QuizQuestionInfo quizQuestionInfo) {
        LJ(quizQuestionInfo);
    }

    @Override // X.C0IMD
    public final QuizQuestionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuizQuestionInfo quizQuestionInfo, List list) {
    }
}
