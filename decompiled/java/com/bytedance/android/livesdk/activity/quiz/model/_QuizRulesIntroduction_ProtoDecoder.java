package com.bytedance.android.livesdk.activity.quiz.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuizRulesIntroduction_ProtoDecoder implements C0IMD<QuizRulesIntroduction> {
    public static QuizRulesIntroduction LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuizRulesIntroduction quizRulesIntroduction = new QuizRulesIntroduction();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        quizRulesIntroduction.messageType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        quizRulesIntroduction.quizId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        quizRulesIntroduction.quizType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        quizRulesIntroduction.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        quizRulesIntroduction.rewardAmount = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        quizRulesIntroduction.questionCount = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        quizRulesIntroduction.userCount = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        quizRulesIntroduction.sponsorCode = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        quizRulesIntroduction.displayDurationMs = c1516680pZS.LJIIJ();
                        break;
                    default:
                        switch (iLJI) {
                            case 51:
                                quizRulesIntroduction.extra1 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 52:
                                quizRulesIntroduction.extra2 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 53:
                                quizRulesIntroduction.extra3 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 54:
                                quizRulesIntroduction.extra4 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 55:
                                quizRulesIntroduction.extra5 = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quizRulesIntroduction;
            }
        }
    }

    @Override // X.C0IMD
    public final QuizRulesIntroduction LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(QuizRulesIntroduction quizRulesIntroduction) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuizRulesIntroduction quizRulesIntroduction, List list) {
    }
}
