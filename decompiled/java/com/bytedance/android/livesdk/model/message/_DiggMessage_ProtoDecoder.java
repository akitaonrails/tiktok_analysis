package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DiggMessage_ProtoDecoder implements C0IMD<DiggMessage> {
    @Override // X.C0IMD
    public final void LIZ(DiggMessage diggMessage) {
        DiggMessage diggMessage2 = diggMessage;
        CommonMessageData commonMessageData = diggMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = diggMessage2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final DiggMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        DiggMessage diggMessage = new DiggMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        diggMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        diggMessage.diggCount = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        diggMessage.duration = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        diggMessage.color = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        diggMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        diggMessage.icon = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return diggMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DiggMessage diggMessage, List list) {
    }
}
