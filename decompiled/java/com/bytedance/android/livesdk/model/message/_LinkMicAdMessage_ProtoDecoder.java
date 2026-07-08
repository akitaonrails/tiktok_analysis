package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.LinkMicAdContent;
import tikcast.linkmic.common._LinkMicAdContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicAdMessage_ProtoDecoder implements C0IMD<LinkMicAdMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkMicAdMessage linkMicAdMessage) {
        LinkMicAdMessage linkMicAdMessage2 = linkMicAdMessage;
        CommonMessageData commonMessageData = linkMicAdMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<LinkMicAdContent> list = linkMicAdMessage2.linkAdContents;
        if (list == null) {
            linkMicAdMessage2.linkAdContents = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<LinkMicAdContent> it2 = linkMicAdMessage2.linkAdContents.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final LinkMicAdMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMicAdMessage linkMicAdMessage = new LinkMicAdMessage();
        linkMicAdMessage.linkAdContents = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            linkMicAdMessage.linkAdContents.add(_LinkMicAdContent_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        linkMicAdMessage.messageType = c1516680pZS.LJIIJ();
                    }
                } else {
                    linkMicAdMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicAdMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicAdMessage linkMicAdMessage, List list) {
    }
}
