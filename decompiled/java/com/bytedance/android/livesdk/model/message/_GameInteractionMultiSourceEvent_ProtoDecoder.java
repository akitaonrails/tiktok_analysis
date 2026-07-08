package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameInteractionMultiSourceEvent_ProtoDecoder implements C0IMD<GameInteractionMultiSourceEvent> {
    public static GameInteractionMultiSourceEvent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameInteractionMultiSourceEvent gameInteractionMultiSourceEvent = new GameInteractionMultiSourceEvent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        gameInteractionMultiSourceEvent.interactionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        gameInteractionMultiSourceEvent.playId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        gameInteractionMultiSourceEvent.triggerAvatarUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        gameInteractionMultiSourceEvent.triggerNickName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        gameInteractionMultiSourceEvent.timestamp = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        gameInteractionMultiSourceEvent.instruction = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        gameInteractionMultiSourceEvent.count = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        gameInteractionMultiSourceEvent.triggerEncryptedId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        gameInteractionMultiSourceEvent.sourceType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameInteractionMultiSourceEvent;
            }
        }
    }

    @Override // X.C0IMD
    public final GameInteractionMultiSourceEvent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GameInteractionMultiSourceEvent gameInteractionMultiSourceEvent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameInteractionMultiSourceEvent gameInteractionMultiSourceEvent, List list) {
    }
}
