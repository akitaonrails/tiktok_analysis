package com.bytedance.android.livesdk.activity.quiz.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuizFinalResult_ProtoDecoder implements C0IMD<QuizFinalResult> {
    public static QuizFinalResult LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuizFinalResult quizFinalResult = new QuizFinalResult();
        quizFinalResult.nextQuiz = new ArrayList();
        quizFinalResult.settledReward = new ArrayList();
        quizFinalResult.anchorList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        quizFinalResult.messageType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        quizFinalResult.quizId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        quizFinalResult.quizType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        quizFinalResult.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        quizFinalResult.settledReward.add(_QuizRewardRule_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        quizFinalResult.nextQuiz.add(_QuizNextQuiz_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        quizFinalResult.rewardAmount = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        quizFinalResult.questionCount = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        quizFinalResult.anchorList.add(_QuizAnchorInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        quizFinalResult.sponsorCode = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        quizFinalResult.displayDurationMs = c1516680pZS.LJIIJ();
                        break;
                    default:
                        switch (iLJI) {
                            case 51:
                                quizFinalResult.extra1 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 52:
                                quizFinalResult.extra2 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 53:
                                quizFinalResult.extra3 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 54:
                                quizFinalResult.extra4 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 55:
                                quizFinalResult.extra5 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quizFinalResult;
            }
        }
    }

    public static void LJ(QuizFinalResult quizFinalResult) {
        List<QuizRewardRule> list = quizFinalResult.settledReward;
        if (list == null) {
            quizFinalResult.settledReward = new ArrayList();
        } else if (!list.isEmpty()) {
            for (QuizRewardRule quizRewardRule : quizFinalResult.settledReward) {
                if (quizRewardRule != null) {
                    _QuizRewardRule_ProtoDecoder.LJ(quizRewardRule);
                }
            }
        }
        List<QuizNextQuiz> list2 = quizFinalResult.nextQuiz;
        if (list2 == null) {
            quizFinalResult.nextQuiz = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<QuizNextQuiz> it2 = quizFinalResult.nextQuiz.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<QuizAnchorInfo> list3 = quizFinalResult.anchorList;
        if (list3 == null) {
            quizFinalResult.anchorList = new ArrayList();
        } else {
            if (list3.isEmpty()) {
                return;
            }
            Iterator<QuizAnchorInfo> it3 = quizFinalResult.anchorList.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(QuizFinalResult quizFinalResult) {
        LJ(quizFinalResult);
    }

    @Override // X.C0IMD
    public final QuizFinalResult LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuizFinalResult quizFinalResult, List list) {
    }
}
