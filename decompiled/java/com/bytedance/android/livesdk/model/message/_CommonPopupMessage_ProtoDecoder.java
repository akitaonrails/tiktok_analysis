package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CommonPopupMessage_ProtoDecoder implements C0IMD<CommonPopupMessage> {
    @Override // X.C0IMD
    public final void LIZ(CommonPopupMessage commonPopupMessage) {
        CommonMessageData commonMessageData = commonPopupMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final CommonPopupMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CommonPopupMessage commonPopupMessage = new CommonPopupMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            commonPopupMessage.anchorPopup = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        commonPopupMessage.schemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    commonPopupMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return commonPopupMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CommonPopupMessage commonPopupMessage, List list) {
    }
}
