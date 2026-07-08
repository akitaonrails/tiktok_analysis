package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AutoShareLiveCardToBulletinBoard_ProtoDecoder implements C0IMD<AutoShareLiveCardToBulletinBoard> {
    public static AutoShareLiveCardToBulletinBoard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AutoShareLiveCardToBulletinBoard autoShareLiveCardToBulletinBoard = new AutoShareLiveCardToBulletinBoard();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        autoShareLiveCardToBulletinBoard.bulletinBoardInfo = _BulletinBoardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    autoShareLiveCardToBulletinBoard.switchStatus = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return autoShareLiveCardToBulletinBoard;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AutoShareLiveCardToBulletinBoard autoShareLiveCardToBulletinBoard) {
    }

    @Override // X.C0IMD
    public final AutoShareLiveCardToBulletinBoard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AutoShareLiveCardToBulletinBoard autoShareLiveCardToBulletinBoard, List list) {
    }
}
