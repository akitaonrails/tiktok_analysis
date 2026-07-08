package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameReqSetGuessMessage_ProtoDecoder implements C0IMD<GameReqSetGuessMessage> {
    @Override // X.C0IMD
    public final void LIZ(GameReqSetGuessMessage gameReqSetGuessMessage) {
        GameReqSetGuessMessage gameReqSetGuessMessage2 = gameReqSetGuessMessage;
        CommonMessageData commonMessageData = gameReqSetGuessMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Text text = gameReqSetGuessMessage2.toastContext;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final GameReqSetGuessMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GameReqSetGuessMessage gameReqSetGuessMessage = new GameReqSetGuessMessage();
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
                                    gameReqSetGuessMessage.capsuleCntStr = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                gameReqSetGuessMessage.limitSupremacyStr = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            gameReqSetGuessMessage.requestCntStr = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        gameReqSetGuessMessage.toastContext = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    gameReqSetGuessMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameReqSetGuessMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameReqSetGuessMessage gameReqSetGuessMessage, List list) {
    }
}
