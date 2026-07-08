package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.activity.quiz.model.QuizUserIdentityInfo;
import com.bytedance.android.livesdk.activity.quiz.model._QuizUserIdentityInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ActivityQuizUserIdentityMessage_ProtoDecoder implements C0IMD<ActivityQuizUserIdentityMessage> {
    @Override // X.C0IMD
    public final void LIZ(ActivityQuizUserIdentityMessage activityQuizUserIdentityMessage) {
        ActivityQuizUserIdentityMessage activityQuizUserIdentityMessage2 = activityQuizUserIdentityMessage;
        CommonMessageData commonMessageData = activityQuizUserIdentityMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        QuizUserIdentityInfo quizUserIdentityInfo = activityQuizUserIdentityMessage2.body;
        if (quizUserIdentityInfo != null) {
            _QuizUserIdentityInfo_ProtoDecoder.LJ(quizUserIdentityInfo);
        }
    }

    @Override // X.C0IMD
    public final ActivityQuizUserIdentityMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ActivityQuizUserIdentityMessage activityQuizUserIdentityMessage = new ActivityQuizUserIdentityMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        activityQuizUserIdentityMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        activityQuizUserIdentityMessage.primaryId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        activityQuizUserIdentityMessage.version = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        activityQuizUserIdentityMessage.retainDeviceId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        activityQuizUserIdentityMessage.timestamp = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        activityQuizUserIdentityMessage.body = _QuizUserIdentityInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return activityQuizUserIdentityMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ActivityQuizUserIdentityMessage activityQuizUserIdentityMessage, List list) {
    }
}
