package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _InteractiveEffectMessage_ProtoDecoder implements C0IMD<InteractiveEffectMessage> {
    @Override // X.C0IMD
    public final void LIZ(InteractiveEffectMessage interactiveEffectMessage) {
        CommonMessageData commonMessageData = interactiveEffectMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final InteractiveEffectMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        InteractiveEffectMessage interactiveEffectMessage = new InteractiveEffectMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        interactiveEffectMessage.triggerData = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    interactiveEffectMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return interactiveEffectMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, InteractiveEffectMessage interactiveEffectMessage, List list) {
    }
}
