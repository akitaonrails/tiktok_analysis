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
public final class _QuestionSelectMessage_ProtoDecoder implements C0IMD<QuestionSelectMessage> {
    @Override // X.C0IMD
    public final void LIZ(QuestionSelectMessage questionSelectMessage) {
        User user;
        QuestionSelectMessage questionSelectMessage2 = questionSelectMessage;
        CommonMessageData commonMessageData = questionSelectMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Question question = questionSelectMessage2.question;
        if (question != null && (user = question.user) != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final QuestionSelectMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        QuestionSelectMessage questionSelectMessage = new QuestionSelectMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        questionSelectMessage.question = _Question_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    questionSelectMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return questionSelectMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuestionSelectMessage questionSelectMessage, List list) {
    }
}
