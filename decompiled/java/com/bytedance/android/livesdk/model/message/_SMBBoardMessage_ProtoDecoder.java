package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model._Board_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SMBBoardMessage_ProtoDecoder implements C0IMD<SMBBoardMessage> {
    @Override // X.C0IMD
    public final void LIZ(SMBBoardMessage sMBBoardMessage) {
        SMBBoardMessage sMBBoardMessage2 = sMBBoardMessage;
        CommonMessageData commonMessageData = sMBBoardMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Board board = sMBBoardMessage2.board;
        if (board != null) {
            _Board_ProtoDecoder.LJ(board);
        }
    }

    @Override // X.C0IMD
    public final SMBBoardMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SMBBoardMessage sMBBoardMessage = new SMBBoardMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            sMBBoardMessage.action = c1516680pZS.LJIIJ();
                        }
                    } else {
                        sMBBoardMessage.board = _Board_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    sMBBoardMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sMBBoardMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBBoardMessage sMBBoardMessage, List list) {
    }
}
