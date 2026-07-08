package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ControlMessage_ProtoDecoder implements C0IMD<ControlMessage> {
    @Override // X.C0IMD
    public final void LIZ(ControlMessage controlMessage) {
        ControlMessage controlMessage2 = controlMessage;
        CommonMessageData commonMessageData = controlMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ControlMessage.Extra extra = controlMessage2.extraInfo;
        if (extra != null) {
            Text text = extra.title;
            if (text != null) {
                _Text_ProtoDecoder.LJ(text);
            }
            Text text2 = extra.violationReason;
            if (text2 != null) {
                _Text_ProtoDecoder.LJ(text2);
            }
        }
        PerceptionDialogInfo perceptionDialogInfo = controlMessage2.perceptionDialogInfo;
        if (perceptionDialogInfo != null) {
            _PerceptionDialogInfo_ProtoDecoder.LJ(perceptionDialogInfo);
        }
        Text text3 = controlMessage2.perceptionAudienceText;
        if (text3 != null) {
            _Text_ProtoDecoder.LJ(text3);
        }
        Text text4 = controlMessage2.floatText;
        if (text4 != null) {
            _Text_ProtoDecoder.LJ(text4);
        }
    }

    @Override // X.C0IMD
    public final ControlMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ControlMessage controlMessage = new ControlMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        controlMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        controlMessage.action = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        controlMessage.tips = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        controlMessage.extraInfo = _ControlMessage_Extra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        controlMessage.perceptionDialogInfo = _PerceptionDialogInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        controlMessage.perceptionAudienceText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        controlMessage.punishInfo = _PunishEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        controlMessage.floatText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        controlMessage.floatStyle = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return controlMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ControlMessage controlMessage, List list) {
    }
}
