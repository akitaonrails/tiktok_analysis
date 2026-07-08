package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.game.model.GuessWidgets;
import com.bytedance.android.livesdk.game.model._GuessWidgets_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameGuessWidgetsMessage_ProtoDecoder implements C0IMD<GameGuessWidgetsMessage> {
    @Override // X.C0IMD
    public final void LIZ(GameGuessWidgetsMessage gameGuessWidgetsMessage) {
        GameGuessWidgetsMessage gameGuessWidgetsMessage2 = gameGuessWidgetsMessage;
        CommonMessageData commonMessageData = gameGuessWidgetsMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        GuessWidgets guessWidgets = gameGuessWidgetsMessage2.guessWidgets;
        if (guessWidgets != null) {
            _GuessWidgets_ProtoDecoder.LJ(guessWidgets);
        }
    }

    @Override // X.C0IMD
    public final GameGuessWidgetsMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GameGuessWidgetsMessage gameGuessWidgetsMessage = new GameGuessWidgetsMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        gameGuessWidgetsMessage.guessWidgets = _GuessWidgets_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    gameGuessWidgetsMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameGuessWidgetsMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameGuessWidgetsMessage gameGuessWidgetsMessage, List list) {
    }
}
