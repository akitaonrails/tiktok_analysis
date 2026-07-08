package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuestionDeleteMessage_ProtoDecoder implements C0IMD<QuestionDeleteMessage> {
    @Override // X.C0IMD
    public final void LIZ(QuestionDeleteMessage questionDeleteMessage) {
        CommonMessageData commonMessageData = questionDeleteMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final QuestionDeleteMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        QuestionDeleteMessage questionDeleteMessage = new QuestionDeleteMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                questionDeleteMessage.scene = c1516680pZS.LJIIJ();
                            }
                        } else {
                            questionDeleteMessage.userId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        questionDeleteMessage.questionId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    questionDeleteMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return questionDeleteMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuestionDeleteMessage questionDeleteMessage, List list) {
    }
}
