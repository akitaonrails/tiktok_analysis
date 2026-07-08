package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomVerifyMessage_ProtoDecoder implements C0IMD<RoomVerifyMessage> {
    @Override // X.C0IMD
    public final void LIZ(RoomVerifyMessage roomVerifyMessage) {
        CommonMessageData commonMessageData = roomVerifyMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final RoomVerifyMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RoomVerifyMessage roomVerifyMessage = new RoomVerifyMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    roomVerifyMessage.closeRoom = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                                }
                            } else {
                                roomVerifyMessage.noticeType = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        } else {
                            roomVerifyMessage.content = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        roomVerifyMessage.verifyAction = c1516680pZS.LJIIJ();
                    }
                } else {
                    roomVerifyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomVerifyMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomVerifyMessage roomVerifyMessage, List list) {
    }
}
