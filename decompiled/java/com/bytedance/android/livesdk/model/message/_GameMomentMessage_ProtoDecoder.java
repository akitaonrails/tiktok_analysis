package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameMomentMessage_ProtoDecoder implements C0IMD<GameMomentMessage> {
    @Override // X.C0IMD
    public final void LIZ(GameMomentMessage gameMomentMessage) {
        GameMomentMessage gameMomentMessage2 = gameMomentMessage;
        CommonMessageData commonMessageData = gameMomentMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        if (gameMomentMessage2.momentEffects == null) {
            gameMomentMessage2.momentEffects = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GameMomentMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GameMomentMessage gameMomentMessage = new GameMomentMessage();
        gameMomentMessage.momentEffects = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        gameMomentMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        gameMomentMessage.messageType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        gameMomentMessage.eventTime = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        gameMomentMessage.maxTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        gameMomentMessage.uniqueId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        gameMomentMessage.momentEffects.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameMomentMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameMomentMessage gameMomentMessage, List list) {
    }
}
