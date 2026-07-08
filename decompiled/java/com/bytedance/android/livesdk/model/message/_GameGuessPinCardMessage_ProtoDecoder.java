package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.game.model.GuessText;
import com.bytedance.android.livesdk.game.model.PinCardView;
import com.bytedance.android.livesdk.game.model._GuessText_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PinCardView_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameGuessPinCardMessage_ProtoDecoder implements C0IMD<GameGuessPinCardMessage> {
    @Override // X.C0IMD
    public final void LIZ(GameGuessPinCardMessage gameGuessPinCardMessage) {
        GuessText guessText;
        GameGuessPinCardMessage gameGuessPinCardMessage2 = gameGuessPinCardMessage;
        CommonMessageData commonMessageData = gameGuessPinCardMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        PinCardView pinCardView = gameGuessPinCardMessage2.view;
        if (pinCardView != null && (guessText = pinCardView.guessTitle) != null) {
            _GuessText_ProtoDecoder.LJ(guessText);
        }
    }

    @Override // X.C0IMD
    public final GameGuessPinCardMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GameGuessPinCardMessage gameGuessPinCardMessage = new GameGuessPinCardMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        gameGuessPinCardMessage.view = _PinCardView_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    gameGuessPinCardMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameGuessPinCardMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameGuessPinCardMessage gameGuessPinCardMessage, List list) {
    }
}
