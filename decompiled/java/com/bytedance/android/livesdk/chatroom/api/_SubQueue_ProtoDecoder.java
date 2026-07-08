package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class _SubQueue_ProtoDecoder implements C0IMD<SubQueue> {
    public static SubQueue LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubQueue subQueue = new SubQueue();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        subQueue.id = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        subQueue.type = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        subQueue.status = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        subQueue.auditStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        subQueue.anchorId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        subQueue.roomId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        subQueue.createTimeSec = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        subQueue.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        subQueue.waitingCount = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        subQueue.totalCount = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subQueue;
            }
        }
    }

    @Override // X.C0IMD
    public final SubQueue LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SubQueue subQueue) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubQueue subQueue, List list) {
    }
}
