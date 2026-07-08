package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StarCommentPushMessage_ProtoDecoder implements C0IMD<StarCommentPushMessage> {
    @Override // X.C0IMD
    public final void LIZ(StarCommentPushMessage starCommentPushMessage) {
        StarCommentPushMessage starCommentPushMessage2 = starCommentPushMessage;
        CommonMessageData commonMessageData = starCommentPushMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        StarCommentMessage starCommentMessage = starCommentPushMessage2.current;
        if (starCommentMessage != null) {
            _StarCommentMessage_ProtoDecoder.LJ(starCommentMessage);
        }
        StarCommentMessage starCommentMessage2 = starCommentPushMessage2.next;
        if (starCommentMessage2 != null) {
            _StarCommentMessage_ProtoDecoder.LJ(starCommentMessage2);
        }
    }

    @Override // X.C0IMD
    public final StarCommentPushMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        StarCommentPushMessage starCommentPushMessage = new StarCommentPushMessage();
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
                                starCommentPushMessage.next = _StarCommentMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            starCommentPushMessage.current = _StarCommentMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        starCommentPushMessage.queueVersion = c1516680pZS.LJIIJ();
                    }
                } else {
                    starCommentPushMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return starCommentPushMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarCommentPushMessage starCommentPushMessage, List list) {
    }
}
