package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicSignalMessage_ProtoDecoder implements C0IMD<LinkMicSignalMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkMicSignalMessage linkMicSignalMessage) {
        CommonMessageData commonMessageData = linkMicSignalMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final LinkMicSignalMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMicSignalMessage linkMicSignalMessage = new LinkMicSignalMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        linkMicSignalMessage.signal = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    linkMicSignalMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicSignalMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicSignalMessage linkMicSignalMessage, List list) {
    }
}
