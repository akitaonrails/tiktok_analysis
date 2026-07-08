package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EffectPreloadingMessage_ProtoDecoder implements C0IMD<EffectPreloadingMessage> {
    @Override // X.C0IMD
    public final void LIZ(EffectPreloadingMessage effectPreloadingMessage) {
        EffectPreloadingMessage effectPreloadingMessage2 = effectPreloadingMessage;
        CommonMessageData commonMessageData = effectPreloadingMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        if (effectPreloadingMessage2.giftId == null) {
            effectPreloadingMessage2.giftId = new ArrayList();
        }
        if (effectPreloadingMessage2.effectId == null) {
            effectPreloadingMessage2.effectId = new ArrayList();
        }
        GiftIMPriority giftIMPriority = effectPreloadingMessage2.priority;
        if (giftIMPriority != null) {
            _GiftIMPriority_ProtoDecoder.LJ(giftIMPriority);
        }
    }

    @Override // X.C0IMD
    public final EffectPreloadingMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EffectPreloadingMessage effectPreloadingMessage = new EffectPreloadingMessage();
        effectPreloadingMessage.giftId = new ArrayList();
        effectPreloadingMessage.effectId = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 14) {
                                if (iLJI != 16) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    effectPreloadingMessage.logId = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                effectPreloadingMessage.priority = _GiftIMPriority_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            effectPreloadingMessage.effectId.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        }
                    } else {
                        effectPreloadingMessage.giftId.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    effectPreloadingMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return effectPreloadingMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectPreloadingMessage effectPreloadingMessage, List list) {
    }
}
