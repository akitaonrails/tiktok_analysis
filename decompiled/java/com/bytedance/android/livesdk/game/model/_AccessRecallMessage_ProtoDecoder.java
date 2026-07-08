package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AccessRecallMessage_ProtoDecoder implements C0IMD<AccessRecallMessage> {
    @Override // X.C0IMD
    public final void LIZ(AccessRecallMessage accessRecallMessage) {
        AccessRecallMessage accessRecallMessage2 = accessRecallMessage;
        CommonMessageData commonMessageData = accessRecallMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Text text = accessRecallMessage2.notice;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = accessRecallMessage2.content;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
    }

    @Override // X.C0IMD
    public final AccessRecallMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AccessRecallMessage accessRecallMessage = new AccessRecallMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        accessRecallMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        accessRecallMessage.status = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        accessRecallMessage.duration = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        accessRecallMessage.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        accessRecallMessage.scene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        accessRecallMessage.notice = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        accessRecallMessage.content = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        accessRecallMessage.punishInfo = _PunishEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        accessRecallMessage.endTimeV2 = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return accessRecallMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AccessRecallMessage accessRecallMessage, List list) {
    }
}
