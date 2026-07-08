package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameGuessToastMessage_ProtoDecoder implements C0IMD<GameGuessToastMessage> {
    @Override // X.C0IMD
    public final void LIZ(GameGuessToastMessage gameGuessToastMessage) {
        CommonMessageData commonMessageData = gameGuessToastMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final GameGuessToastMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GameGuessToastMessage gameGuessToastMessage = new GameGuessToastMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        gameGuessToastMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        gameGuessToastMessage.roundIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        gameGuessToastMessage.showType = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        gameGuessToastMessage.showOptionIdxStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        gameGuessToastMessage.titleStarlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        gameGuessToastMessage.resultStarlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        gameGuessToastMessage.showRankStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        gameGuessToastMessage.optionIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        gameGuessToastMessage.dissMissSeconds = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameGuessToastMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameGuessToastMessage gameGuessToastMessage, List list) {
    }
}
