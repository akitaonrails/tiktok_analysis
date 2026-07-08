package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CommentTrayMessage_ProtoDecoder implements C0IMD<CommentTrayMessage> {
    @Override // X.C0IMD
    public final void LIZ(CommentTrayMessage commentTrayMessage) {
        CommonMessageData commonMessageData = commentTrayMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final CommentTrayMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CommentTrayMessage commentTrayMessage = new CommentTrayMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        commentTrayMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        commentTrayMessage.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        commentTrayMessage.contentType = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        commentTrayMessage.count = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        commentTrayMessage.chatTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        commentTrayMessage.trayId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return commentTrayMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CommentTrayMessage commentTrayMessage, List list) {
    }
}
