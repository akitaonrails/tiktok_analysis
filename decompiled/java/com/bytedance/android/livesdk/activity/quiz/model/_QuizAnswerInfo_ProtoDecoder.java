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
public final class _QuizAnswerInfo_ProtoDecoder implements C0IMD<QuizAnswerInfo> {
    public static QuizAnswerInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuizAnswerInfo quizAnswerInfo = new QuizAnswerInfo();
        quizAnswerInfo.image = new ArrayList();
        quizAnswerInfo.correctAnswerImage = new ArrayList();
        quizAnswerInfo.nextQuiz = new ArrayList();
        quizAnswerInfo.options = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        quizAnswerInfo.messageType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        quizAnswerInfo.quizId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        quizAnswerInfo.quizType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        quizAnswerInfo.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        quizAnswerInfo.participantsCount = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        quizAnswerInfo.questionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        quizAnswerInfo.questionNo = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        quizAnswerInfo.questionCount = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        quizAnswerInfo.questionType = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        quizAnswerInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        quizAnswerInfo.image.add(_QuizImage_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        quizAnswerInfo.options.add(_QuizQuestionOption_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        switch (iLJI) {
                            case 15:
                                quizAnswerInfo.correctAnswer = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 16:
                                quizAnswerInfo.statistics = _QuizStatistics_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                quizAnswerInfo.nextQuiz.add(_QuizNextQuiz_ProtoDecoder.LIZLLL(c1516680pZS));
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                quizAnswerInfo.rewardAmount = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 19:
                                quizAnswerInfo.correctAnswerImage.add(_QuizImage_ProtoDecoder.LIZLLL(c1516680pZS));
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                quizAnswerInfo.sponsorCode = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 21:
                                quizAnswerInfo.displayDurationMs = c1516680pZS.LJIIJ();
                                break;
                            default:
                                switch (iLJI) {
                                    case 51:
                                        quizAnswerInfo.extra1 = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 52:
                                        quizAnswerInfo.extra2 = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 53:
                                        quizAnswerInfo.extra3 = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 54:
                                        quizAnswerInfo.extra4 = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 55:
                                        quizAnswerInfo.extra5 = C1516700pZU.LIZLLL(c1516680pZS);
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
                return quizAnswerInfo;
            }
        }
    }

    public static void LJ(QuizAnswerInfo quizAnswerInfo) {
        List<QuizImage> list = quizAnswerInfo.image;
        if (list == null) {
            quizAnswerInfo.image = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<QuizImage> it2 = quizAnswerInfo.image.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<QuizQuestionOption> list2 = quizAnswerInfo.options;
        if (list2 == null) {
            quizAnswerInfo.options = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (QuizQuestionOption quizQuestionOption : quizAnswerInfo.options) {
                if (quizQuestionOption != null) {
                    _QuizQuestionOption_ProtoDecoder.LJ(quizQuestionOption);
                }
            }
        }
        QuizStatistics quizStatistics = quizAnswerInfo.statistics;
        if (quizStatistics != null) {
            _QuizStatistics_ProtoDecoder.LJ(quizStatistics);
        }
        List<QuizNextQuiz> list3 = quizAnswerInfo.nextQuiz;
        if (list3 == null) {
            quizAnswerInfo.nextQuiz = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<QuizNextQuiz> it3 = quizAnswerInfo.nextQuiz.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        List<QuizImage> list4 = quizAnswerInfo.correctAnswerImage;
        if (list4 == null) {
            quizAnswerInfo.correctAnswerImage = new ArrayList();
        } else {
            if (list4.isEmpty()) {
                return;
            }
            Iterator<QuizImage> it4 = quizAnswerInfo.correctAnswerImage.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(QuizAnswerInfo quizAnswerInfo) {
        LJ(quizAnswerInfo);
    }

    @Override // X.C0IMD
    public final QuizAnswerInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuizAnswerInfo quizAnswerInfo, List list) {
    }
}
