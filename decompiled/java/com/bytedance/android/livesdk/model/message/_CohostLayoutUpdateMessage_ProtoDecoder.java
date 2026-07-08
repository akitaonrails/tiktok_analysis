package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common._LayoutData_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostLayoutUpdateMessage_ProtoDecoder implements C0IMD<CohostLayoutUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(CohostLayoutUpdateMessage cohostLayoutUpdateMessage) {
        CohostLayoutUpdateMessage cohostLayoutUpdateMessage2 = cohostLayoutUpdateMessage;
        CommonMessageData commonMessageData = cohostLayoutUpdateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        LayoutData layoutData = cohostLayoutUpdateMessage2.crossRoomLayout;
        if (layoutData != null) {
            _LayoutData_ProtoDecoder.LJ(layoutData);
        }
        Text text = cohostLayoutUpdateMessage2.toastDisplayText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final CohostLayoutUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CohostLayoutUpdateMessage cohostLayoutUpdateMessage = new CohostLayoutUpdateMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            cohostLayoutUpdateMessage.toastDisplayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        cohostLayoutUpdateMessage.crossRoomLayout = _LayoutData_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    cohostLayoutUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostLayoutUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostLayoutUpdateMessage cohostLayoutUpdateMessage, List list) {
    }
}
