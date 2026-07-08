package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EffectControlMessage_ProtoDecoder implements C0IMD<EffectControlMessage> {
    @Override // X.C0IMD
    public final void LIZ(EffectControlMessage effectControlMessage) {
        CommonMessageData commonMessageData = effectControlMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final EffectControlMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EffectControlMessage effectControlMessage = new EffectControlMessage();
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
                                    effectControlMessage.scene = c1516680pZS.LJIIJ();
                                }
                            } else {
                                effectControlMessage.replaceResumeEffect = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            effectControlMessage.resourceId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        effectControlMessage.controlType = c1516680pZS.LJIIJ();
                    }
                } else {
                    effectControlMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return effectControlMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectControlMessage effectControlMessage, List list) {
    }
}
