package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorReminderWordInfoMsg_ProtoDecoder implements C0IMD<AnchorReminderWordInfoMsg> {
    public static AnchorReminderWordInfoMsg LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorReminderWordInfoMsg anchorReminderWordInfoMsg = new AnchorReminderWordInfoMsg();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        anchorReminderWordInfoMsg.scene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        anchorReminderWordInfoMsg.title = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        anchorReminderWordInfoMsg.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        anchorReminderWordInfoMsg.messageKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        anchorReminderWordInfoMsg.suggestionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        anchorReminderWordInfoMsg.suggestionTemplateId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorReminderWordInfoMsg;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorReminderWordInfoMsg anchorReminderWordInfoMsg) {
        Text text = anchorReminderWordInfoMsg.title;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final AnchorReminderWordInfoMsg LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorReminderWordInfoMsg anchorReminderWordInfoMsg, List list) {
    }
}
