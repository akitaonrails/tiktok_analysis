package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _JoinRoomDirectBizContent_ProtoDecoder implements C0IMD<JoinRoomDirectBizContent> {
    public static JoinRoomDirectBizContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        JoinRoomDirectBizContent joinRoomDirectBizContent = new JoinRoomDirectBizContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        joinRoomDirectBizContent.isFullPositionPreApproved = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    joinRoomDirectBizContent.linkTypePermission = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return joinRoomDirectBizContent;
            }
        }
    }

    @Override // X.C0IMD
    public final JoinRoomDirectBizContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(JoinRoomDirectBizContent joinRoomDirectBizContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinRoomDirectBizContent joinRoomDirectBizContent, List list) {
    }
}
