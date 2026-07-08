package webcast.data.host_board;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiHostBoard_ProtoDecoder implements C0IMD<MultiHostBoard> {
    public static MultiHostBoard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiHostBoard multiHostBoard = new MultiHostBoard();
        multiHostBoard.hostBoardList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            multiHostBoard.position = _DisplayPosition_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        multiHostBoard.foldable = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    multiHostBoard.hostBoardList.add(_HostBoard_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiHostBoard;
            }
        }
    }

    public static void LJ(MultiHostBoard multiHostBoard) {
        List<HostBoard> list = multiHostBoard.hostBoardList;
        if (list == null) {
            multiHostBoard.hostBoardList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (HostBoard hostBoard : multiHostBoard.hostBoardList) {
            if (hostBoard != null) {
                _HostBoard_ProtoDecoder.LJ(hostBoard);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiHostBoard multiHostBoard) {
        LJ(multiHostBoard);
    }

    @Override // X.C0IMD
    public final MultiHostBoard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiHostBoard multiHostBoard, List list) {
    }
}
