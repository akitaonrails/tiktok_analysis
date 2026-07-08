package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.game.model.GameEmotesTab;
import com.bytedance.android.livesdk.game.model._GameEmotesTab_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameEmoteUpdateMessage_ProtoDecoder implements C0IMD<GameEmoteUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(GameEmoteUpdateMessage gameEmoteUpdateMessage) {
        GameEmoteUpdateMessage gameEmoteUpdateMessage2 = gameEmoteUpdateMessage;
        CommonMessageData commonMessageData = gameEmoteUpdateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        GameEmotesTab gameEmotesTab = gameEmoteUpdateMessage2.gameEmotesTab;
        if (gameEmotesTab != null) {
            _GameEmotesTab_ProtoDecoder.LJ(gameEmotesTab);
        }
    }

    @Override // X.C0IMD
    public final GameEmoteUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GameEmoteUpdateMessage gameEmoteUpdateMessage = new GameEmoteUpdateMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        gameEmoteUpdateMessage.gameEmotesTab = _GameEmotesTab_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    gameEmoteUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameEmoteUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameEmoteUpdateMessage gameEmoteUpdateMessage, List list) {
    }
}
