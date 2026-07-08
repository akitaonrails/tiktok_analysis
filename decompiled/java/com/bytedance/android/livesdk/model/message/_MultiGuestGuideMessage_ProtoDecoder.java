package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestGuideMessage_ProtoDecoder implements C0IMD<MultiGuestGuideMessage> {
    @Override // X.C0IMD
    public final void LIZ(MultiGuestGuideMessage multiGuestGuideMessage) {
        MultiGuestGuideMessage multiGuestGuideMessage2 = multiGuestGuideMessage;
        CommonMessageData commonMessageData = multiGuestGuideMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<User> list = multiGuestGuideMessage2.user;
        if (list == null) {
            multiGuestGuideMessage2.user = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (User user : multiGuestGuideMessage2.user) {
            if (user != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final MultiGuestGuideMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestGuideMessage multiGuestGuideMessage = new MultiGuestGuideMessage();
        multiGuestGuideMessage.user = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        multiGuestGuideMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        multiGuestGuideMessage.user.add(_User_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        multiGuestGuideMessage.displayPosition = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        multiGuestGuideMessage.triggerType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        multiGuestGuideMessage.requestId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        multiGuestGuideMessage.messageType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        multiGuestGuideMessage.linkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestGuideMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestGuideMessage multiGuestGuideMessage, List list) {
    }
}
