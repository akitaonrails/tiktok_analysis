package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DrawGuessUpdateMessage_ProtoDecoder implements C0IMD<DrawGuessUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(DrawGuessUpdateMessage drawGuessUpdateMessage) {
        CommonMessageData commonMessageData = drawGuessUpdateMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final DrawGuessUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        DrawGuessUpdateMessage drawGuessUpdateMessage = new DrawGuessUpdateMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            drawGuessUpdateMessage.roundId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        drawGuessUpdateMessage.correctCount = c1516680pZS.LJIIJJI();
                    }
                } else {
                    drawGuessUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return drawGuessUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DrawGuessUpdateMessage drawGuessUpdateMessage, List list) {
    }
}
