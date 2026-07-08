package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuestionMessage_ProtoDecoder implements C0IMD<QuestionMessage> {
    @Override // X.C0IMD
    public final void LIZ(QuestionMessage questionMessage) {
        User user;
        QuestionMessage questionMessage2 = questionMessage;
        CommonMessageData commonMessageData = questionMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Question question = questionMessage2.question;
        if (question != null && (user = question.user) != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final QuestionMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        QuestionMessage questionMessage = new QuestionMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        questionMessage.question = _Question_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    questionMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return questionMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuestionMessage questionMessage, List list) {
    }
}
