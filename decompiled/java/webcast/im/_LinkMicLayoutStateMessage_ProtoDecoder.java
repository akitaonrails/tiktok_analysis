package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicLayoutStateMessage_ProtoDecoder implements C0IMD<LinkMicLayoutStateMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkMicLayoutStateMessage linkMicLayoutStateMessage) {
        LinkMicLayoutStateMessage linkMicLayoutStateMessage2 = linkMicLayoutStateMessage;
        CommonMessageData commonMessageData = linkMicLayoutStateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<BizSpotInfo> list = linkMicLayoutStateMessage2.bizSpotList;
        if (list == null) {
            linkMicLayoutStateMessage2.bizSpotList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<BizSpotInfo> it2 = linkMicLayoutStateMessage2.bizSpotList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final LinkMicLayoutStateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMicLayoutStateMessage linkMicLayoutStateMessage = new LinkMicLayoutStateMessage();
        linkMicLayoutStateMessage.bizSpotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkMicLayoutStateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkMicLayoutStateMessage.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        linkMicLayoutStateMessage.scene = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        linkMicLayoutStateMessage.version = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        linkMicLayoutStateMessage.bizLayoutState = _BizLayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        linkMicLayoutStateMessage.bizSpotList.add(_BizSpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicLayoutStateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicLayoutStateMessage linkMicLayoutStateMessage, List list) {
    }
}
