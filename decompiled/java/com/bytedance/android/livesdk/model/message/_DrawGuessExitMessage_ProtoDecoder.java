package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DrawGuessExitMessage_ProtoDecoder implements C0IMD<DrawGuessExitMessage> {
    @Override // X.C0IMD
    public final void LIZ(DrawGuessExitMessage drawGuessExitMessage) {
        CommonMessageData commonMessageData = drawGuessExitMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final DrawGuessExitMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        DrawGuessExitMessage drawGuessExitMessage = new DrawGuessExitMessage();
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
                                drawGuessExitMessage.pictionaryType = c1516680pZS.LJIIJ();
                            }
                        } else {
                            drawGuessExitMessage.showStats = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        drawGuessExitMessage.sessionId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    drawGuessExitMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return drawGuessExitMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DrawGuessExitMessage drawGuessExitMessage, List list) {
    }
}
