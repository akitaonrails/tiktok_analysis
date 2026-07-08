package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorToolModificationMessage_ProtoDecoder implements C0IMD<AnchorToolModificationMessage> {
    @Override // X.C0IMD
    public final void LIZ(AnchorToolModificationMessage anchorToolModificationMessage) {
        CommonMessageData commonMessageData = anchorToolModificationMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final AnchorToolModificationMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AnchorToolModificationMessage anchorToolModificationMessage = new AnchorToolModificationMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        anchorToolModificationMessage.modification = _AnchorToolModification_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    anchorToolModificationMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorToolModificationMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorToolModificationMessage anchorToolModificationMessage, List list) {
    }
}
