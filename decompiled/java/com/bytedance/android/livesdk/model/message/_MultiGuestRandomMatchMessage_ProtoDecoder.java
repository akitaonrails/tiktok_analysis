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
public final class _MultiGuestRandomMatchMessage_ProtoDecoder implements C0IMD<MultiGuestRandomMatchMessage> {
    @Override // X.C0IMD
    public final void LIZ(MultiGuestRandomMatchMessage multiGuestRandomMatchMessage) {
        MultiGuestRandomMatchMessage multiGuestRandomMatchMessage2 = multiGuestRandomMatchMessage;
        CommonMessageData commonMessageData = multiGuestRandomMatchMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = multiGuestRandomMatchMessage2.authorUser;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final MultiGuestRandomMatchMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestRandomMatchMessage multiGuestRandomMatchMessage = new MultiGuestRandomMatchMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                multiGuestRandomMatchMessage.authorUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            multiGuestRandomMatchMessage.roomId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        multiGuestRandomMatchMessage.matchStatus = c1516680pZS.LJIIJ();
                    }
                } else {
                    multiGuestRandomMatchMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestRandomMatchMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestRandomMatchMessage multiGuestRandomMatchMessage, List list) {
    }
}
