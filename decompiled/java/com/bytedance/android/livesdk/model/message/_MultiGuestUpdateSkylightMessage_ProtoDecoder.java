package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestUpdateSkylightMessage_ProtoDecoder implements C0IMD<MultiGuestUpdateSkylightMessage> {
    @Override // X.C0IMD
    public final void LIZ(MultiGuestUpdateSkylightMessage multiGuestUpdateSkylightMessage) {
        CommonMessageData commonMessageData = multiGuestUpdateSkylightMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final MultiGuestUpdateSkylightMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestUpdateSkylightMessage multiGuestUpdateSkylightMessage = new MultiGuestUpdateSkylightMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            multiGuestUpdateSkylightMessage.outRoomApplyStatus = _OutRoomApply_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        multiGuestUpdateSkylightMessage.updateSkylightType = c1516680pZS.LJIIJ();
                    }
                } else {
                    multiGuestUpdateSkylightMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestUpdateSkylightMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestUpdateSkylightMessage multiGuestUpdateSkylightMessage, List list) {
    }
}
