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
public final class _StarCommentNotificationMessage_ProtoDecoder implements C0IMD<StarCommentNotificationMessage> {
    @Override // X.C0IMD
    public final void LIZ(StarCommentNotificationMessage starCommentNotificationMessage) {
        StarCommentNotificationMessage starCommentNotificationMessage2 = starCommentNotificationMessage;
        CommonMessageData commonMessageData = starCommentNotificationMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = starCommentNotificationMessage2.operator;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        StarCommentMessage starCommentMessage = starCommentNotificationMessage2.starCommentMessage;
        if (starCommentMessage != null) {
            _StarCommentMessage_ProtoDecoder.LJ(starCommentMessage);
        }
    }

    @Override // X.C0IMD
    public final StarCommentNotificationMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        StarCommentNotificationMessage starCommentNotificationMessage = new StarCommentNotificationMessage();
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
                                    starCommentNotificationMessage.starCommentMessage = _StarCommentMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                starCommentNotificationMessage.operator = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            starCommentNotificationMessage.msgId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        starCommentNotificationMessage.starCommentAction = c1516680pZS.LJIIJ();
                    }
                } else {
                    starCommentNotificationMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return starCommentNotificationMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarCommentNotificationMessage starCommentNotificationMessage, List list) {
    }
}
