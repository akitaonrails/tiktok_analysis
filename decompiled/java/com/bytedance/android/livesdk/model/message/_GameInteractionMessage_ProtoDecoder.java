package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameInteractionMessage_ProtoDecoder implements C0IMD<GameInteractionMessage> {
    @Override // X.C0IMD
    public final void LIZ(GameInteractionMessage gameInteractionMessage) {
        CommonMessageData commonMessageData = gameInteractionMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final GameInteractionMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GameInteractionMessage gameInteractionMessage = new GameInteractionMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            gameInteractionMessage.content = _GameInteractionMessageContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        gameInteractionMessage.messageType = c1516680pZS.LJIIJ();
                    }
                } else {
                    gameInteractionMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameInteractionMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameInteractionMessage gameInteractionMessage, List list) {
    }
}
