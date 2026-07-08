package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data.host_board.MultiHostBoard;
import webcast.data.host_board._MultiHostBoard_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _HostBoardMessage_ProtoDecoder implements C0IMD<HostBoardMessage> {
    @Override // X.C0IMD
    public final void LIZ(HostBoardMessage hostBoardMessage) {
        HostBoardMessage hostBoardMessage2 = hostBoardMessage;
        CommonMessageData commonMessageData = hostBoardMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        MultiHostBoard multiHostBoard = hostBoardMessage2.board;
        if (multiHostBoard != null) {
            _MultiHostBoard_ProtoDecoder.LJ(multiHostBoard);
        }
    }

    @Override // X.C0IMD
    public final HostBoardMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        HostBoardMessage hostBoardMessage = new HostBoardMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        hostBoardMessage.board = _MultiHostBoard_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    hostBoardMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hostBoardMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HostBoardMessage hostBoardMessage, List list) {
    }
}
