package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PaidContentLiveShoppingMessage_ProtoDecoder implements C0IMD<PaidContentLiveShoppingMessage> {
    @Override // X.C0IMD
    public final void LIZ(PaidContentLiveShoppingMessage paidContentLiveShoppingMessage) {
        CommonMessageData commonMessageData = paidContentLiveShoppingMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final PaidContentLiveShoppingMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PaidContentLiveShoppingMessage paidContentLiveShoppingMessage = new PaidContentLiveShoppingMessage();
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
                                    paidContentLiveShoppingMessage.timeTag = _TimeTag_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                paidContentLiveShoppingMessage.popSeries = _PopSeries_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            paidContentLiveShoppingMessage.liveSeriesNumber = c1516680pZS.LJIIJ();
                        }
                    } else {
                        paidContentLiveShoppingMessage.actionType = c1516680pZS.LJIIJ();
                    }
                } else {
                    paidContentLiveShoppingMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return paidContentLiveShoppingMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PaidContentLiveShoppingMessage paidContentLiveShoppingMessage, List list) {
    }
}
