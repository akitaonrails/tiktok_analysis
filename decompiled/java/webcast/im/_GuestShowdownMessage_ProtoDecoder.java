package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._LinkerMediaChangeOperator_ProtoDecoder;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play._GuestShowdownConfigChange_ProtoDecoder;
import webcast.data.multi_guest_play._GuestShowdownContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestShowdownMessage_ProtoDecoder implements C0IMD<GuestShowdownMessage> {
    @Override // X.C0IMD
    public final void LIZ(GuestShowdownMessage guestShowdownMessage) {
        GuestShowdownMessage guestShowdownMessage2 = guestShowdownMessage;
        CommonMessageData commonMessageData = guestShowdownMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        GuestShowdownContent guestShowdownContent = guestShowdownMessage2.playContent;
        if (guestShowdownContent != null) {
            _GuestShowdownContent_ProtoDecoder.LJ(guestShowdownContent);
        }
    }

    @Override // X.C0IMD
    public final GuestShowdownMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuestShowdownMessage guestShowdownMessage = new GuestShowdownMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guestShowdownMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        guestShowdownMessage.messageType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        guestShowdownMessage.playContent = _GuestShowdownContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        guestShowdownMessage.operatorUserInfo = _LinkerMediaChangeOperator_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        guestShowdownMessage.playClosedReason = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        guestShowdownMessage.toCalculatingReason = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        guestShowdownMessage.guestShowdownConfigChange = _GuestShowdownConfigChange_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestShowdownMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestShowdownMessage guestShowdownMessage, List list) {
    }
}
