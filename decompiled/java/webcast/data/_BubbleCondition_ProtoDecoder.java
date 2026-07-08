package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BubbleCondition_ProtoDecoder implements C0IMD<BubbleCondition> {
    public static BubbleCondition LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BubbleCondition bubbleCondition = new BubbleCondition();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        bubbleCondition.type = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        bubbleCondition.bagItemType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        bubbleCondition.bagItemId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        bubbleCondition.giftId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        bubbleCondition.resourceId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        bubbleCondition.uri = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        bubbleCondition.giftEffectId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bubbleCondition;
            }
        }
    }

    @Override // X.C0IMD
    public final BubbleCondition LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BubbleCondition bubbleCondition) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BubbleCondition bubbleCondition, List list) {
    }
}
