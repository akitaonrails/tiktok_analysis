package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorReminderWordMessage_ProtoDecoder implements C0IMD<AnchorReminderWordMessage> {
    @Override // X.C0IMD
    public final void LIZ(AnchorReminderWordMessage anchorReminderWordMessage) {
        Text text;
        AnchorReminderWordMessage anchorReminderWordMessage2 = anchorReminderWordMessage;
        CommonMessageData commonMessageData = anchorReminderWordMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        AnchorReminderWordInfoMsg anchorReminderWordInfoMsg = anchorReminderWordMessage2.reminderWordInfo;
        if (anchorReminderWordInfoMsg != null && (text = anchorReminderWordInfoMsg.title) != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final AnchorReminderWordMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AnchorReminderWordMessage anchorReminderWordMessage = new AnchorReminderWordMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        anchorReminderWordMessage.reminderWordInfo = _AnchorReminderWordInfoMsg_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    anchorReminderWordMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorReminderWordMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorReminderWordMessage anchorReminderWordMessage, List list) {
    }
}
