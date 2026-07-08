package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ImDeleteMessage_ProtoDecoder implements C0IMD<ImDeleteMessage> {
    @Override // X.C0IMD
    public final void LIZ(ImDeleteMessage imDeleteMessage) {
        ImDeleteMessage imDeleteMessage2 = imDeleteMessage;
        CommonMessageData commonMessageData = imDeleteMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        if (imDeleteMessage2.deleteMsgIds == null) {
            imDeleteMessage2.deleteMsgIds = new ArrayList();
        }
        if (imDeleteMessage2.deleteUserIds == null) {
            imDeleteMessage2.deleteUserIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final ImDeleteMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ImDeleteMessage imDeleteMessage = new ImDeleteMessage();
        imDeleteMessage.deleteMsgIds = new ArrayList();
        imDeleteMessage.deleteUserIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            imDeleteMessage.deleteUserIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        }
                    } else {
                        imDeleteMessage.deleteMsgIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    imDeleteMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return imDeleteMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ImDeleteMessage imDeleteMessage, List list) {
    }
}
