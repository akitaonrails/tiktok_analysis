package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class _PreviewRoom_ProtoDecoder implements C0IMD<PreviewRoom> {
    @Override // X.C0IMD
    public final PreviewRoom LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PreviewRoom previewRoom = new PreviewRoom();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        previewRoom.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        previewRoom.liveId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        previewRoom.identity = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        previewRoom.cursor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        previewRoom.accountType = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        previewRoom.enterUniqId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return previewRoom;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PreviewRoom previewRoom) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PreviewRoom previewRoom, List list) {
    }
}
