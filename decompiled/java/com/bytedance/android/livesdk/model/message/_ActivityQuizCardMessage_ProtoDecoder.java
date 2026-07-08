package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.activity.quiz.model.QuizAnswerInfo;
import com.bytedance.android.livesdk.activity.quiz.model.QuizFinalResult;
import com.bytedance.android.livesdk.activity.quiz.model.QuizQuestionInfo;
import com.bytedance.android.livesdk.activity.quiz.model._QuizAnswerInfo_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizCallUpWebview_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizFinalResult_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizQuestionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizRulesIntroduction_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ActivityQuizCardMessage_ProtoDecoder implements C0IMD<ActivityQuizCardMessage> {
    @Override // X.C0IMD
    public final void LIZ(ActivityQuizCardMessage activityQuizCardMessage) {
        ActivityQuizCardMessage activityQuizCardMessage2 = activityQuizCardMessage;
        CommonMessageData commonMessageData = activityQuizCardMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        QuizQuestionInfo quizQuestionInfo = activityQuizCardMessage2.question;
        if (quizQuestionInfo != null) {
            _QuizQuestionInfo_ProtoDecoder.LJ(quizQuestionInfo);
        }
        QuizAnswerInfo quizAnswerInfo = activityQuizCardMessage2.answer;
        if (quizAnswerInfo != null) {
            _QuizAnswerInfo_ProtoDecoder.LJ(quizAnswerInfo);
        }
        QuizFinalResult quizFinalResult = activityQuizCardMessage2.finalResult;
        if (quizFinalResult != null) {
            _QuizFinalResult_ProtoDecoder.LJ(quizFinalResult);
        }
    }

    @Override // X.C0IMD
    public final ActivityQuizCardMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ActivityQuizCardMessage activityQuizCardMessage = new ActivityQuizCardMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        activityQuizCardMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        activityQuizCardMessage.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        activityQuizCardMessage.primaryId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        activityQuizCardMessage.timestamp = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        activityQuizCardMessage.question = _QuizQuestionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        activityQuizCardMessage.answer = _QuizAnswerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        activityQuizCardMessage.finalResult = _QuizFinalResult_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        activityQuizCardMessage.callUpWebview = _QuizCallUpWebview_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        activityQuizCardMessage.rulesIntroduction = _QuizRulesIntroduction_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        activityQuizCardMessage.seiDelayMultiple = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        activityQuizCardMessage.seiDelayBias = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        activityQuizCardMessage.expiredTime = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return activityQuizCardMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ActivityQuizCardMessage activityQuizCardMessage, List list) {
    }
}
