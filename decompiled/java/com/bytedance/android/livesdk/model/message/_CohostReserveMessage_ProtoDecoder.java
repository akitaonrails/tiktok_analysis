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
public final class _CohostReserveMessage_ProtoDecoder implements C0IMD<CohostReserveMessage> {
    @Override // X.C0IMD
    public final void LIZ(CohostReserveMessage cohostReserveMessage) {
        User user;
        User user2;
        CohostReserveMessage cohostReserveMessage2 = cohostReserveMessage;
        CommonMessageData commonMessageData = cohostReserveMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ReserveContent reserveContent = cohostReserveMessage2.reserveContent;
        if (reserveContent != null && (user2 = reserveContent.reserver) != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        ReplyContent replyContent = cohostReserveMessage2.replyContent;
        if (replyContent != null && (user = replyContent.replier) != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final CohostReserveMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CohostReserveMessage cohostReserveMessage = new CohostReserveMessage();
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
                                    cohostReserveMessage.replyContent = _ReplyContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                cohostReserveMessage.reserveContent = _ReserveContent_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            cohostReserveMessage.reservationId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        cohostReserveMessage.reserveType = c1516680pZS.LJIIJ();
                    }
                } else {
                    cohostReserveMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostReserveMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostReserveMessage cohostReserveMessage, List list) {
    }
}
