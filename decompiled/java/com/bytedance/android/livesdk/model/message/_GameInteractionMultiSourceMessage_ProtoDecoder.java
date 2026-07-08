package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameInteractionMultiSourceMessage_ProtoDecoder implements C0IMD<GameInteractionMultiSourceMessage> {
    @Override // X.C0IMD
    public final void LIZ(GameInteractionMultiSourceMessage gameInteractionMultiSourceMessage) {
        CommonMessageData commonMessageData = gameInteractionMultiSourceMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final GameInteractionMultiSourceMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GameInteractionMultiSourceMessage gameInteractionMultiSourceMessage = new GameInteractionMultiSourceMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            gameInteractionMultiSourceMessage.content = _GameInteractionMultiSourceMessageContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        gameInteractionMultiSourceMessage.messageType = c1516680pZS.LJIIJ();
                    }
                } else {
                    gameInteractionMultiSourceMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameInteractionMultiSourceMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameInteractionMultiSourceMessage gameInteractionMultiSourceMessage, List list) {
    }
}
