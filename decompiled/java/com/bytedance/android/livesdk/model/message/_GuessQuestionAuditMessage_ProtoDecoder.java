package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.game.model.GuessTemplate;
import com.bytedance.android.livesdk.game.model._GuessTemplate_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuessQuestionAuditMessage_ProtoDecoder implements C0IMD<GuessQuestionAuditMessage> {
    @Override // X.C0IMD
    public final void LIZ(GuessQuestionAuditMessage guessQuestionAuditMessage) {
        GuessQuestionAuditMessage guessQuestionAuditMessage2 = guessQuestionAuditMessage;
        CommonMessageData commonMessageData = guessQuestionAuditMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        GuessTemplate guessTemplate = guessQuestionAuditMessage2.guessTemplate;
        if (guessTemplate != null) {
            _GuessTemplate_ProtoDecoder.LJ(guessTemplate);
        }
    }

    @Override // X.C0IMD
    public final GuessQuestionAuditMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuessQuestionAuditMessage guessQuestionAuditMessage = new GuessQuestionAuditMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        guessQuestionAuditMessage.guessTemplate = _GuessTemplate_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    guessQuestionAuditMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guessQuestionAuditMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuessQuestionAuditMessage guessQuestionAuditMessage, List list) {
    }
}
