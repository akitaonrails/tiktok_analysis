package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DrawGuessEndMessage_ProtoDecoder implements C0IMD<DrawGuessEndMessage> {
    @Override // X.C0IMD
    public final void LIZ(DrawGuessEndMessage drawGuessEndMessage) {
        CommonMessageData commonMessageData = drawGuessEndMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final DrawGuessEndMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        DrawGuessEndMessage drawGuessEndMessage = new DrawGuessEndMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    drawGuessEndMessage.pictionaryType = c1516680pZS.LJIIJ();
                                }
                            } else {
                                drawGuessEndMessage.endType = c1516680pZS.LJIIJ();
                            }
                        } else {
                            drawGuessEndMessage.word = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        drawGuessEndMessage.roundId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    drawGuessEndMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return drawGuessEndMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DrawGuessEndMessage drawGuessEndMessage, List list) {
    }
}
