package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameInteractionEvent_ProtoDecoder implements C0IMD<GameInteractionEvent> {
    public static GameInteractionEvent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameInteractionEvent gameInteractionEvent = new GameInteractionEvent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        gameInteractionEvent.interactionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        gameInteractionEvent.playId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        gameInteractionEvent.triggerAvatarUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        gameInteractionEvent.triggerNickName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        gameInteractionEvent.timestamp = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        gameInteractionEvent.instruction = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        gameInteractionEvent.count = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        gameInteractionEvent.triggerEncryptedId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        gameInteractionEvent.sourceType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameInteractionEvent;
            }
        }
    }

    @Override // X.C0IMD
    public final GameInteractionEvent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GameInteractionEvent gameInteractionEvent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameInteractionEvent gameInteractionEvent, List list) {
    }
}
