package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.MsgDetectMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MsgDetectMessage_TriggerCondition_ProtoDecoder implements C0IMD<MsgDetectMessage.TriggerCondition> {
    public static MsgDetectMessage.TriggerCondition LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MsgDetectMessage.TriggerCondition triggerCondition = new MsgDetectMessage.TriggerCondition();
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
                                    triggerCondition.httpOptimize = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                                }
                            } else {
                                triggerCondition.detectRoomMsg = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                            }
                        } else {
                            triggerCondition.detectP2PMsg = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        }
                    } else {
                        triggerCondition.uplinkDetectWebsocket = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                    }
                } else {
                    triggerCondition.uplinkDetectHTTP = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return triggerCondition;
            }
        }
    }

    @Override // X.C0IMD
    public final MsgDetectMessage.TriggerCondition LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MsgDetectMessage.TriggerCondition triggerCondition) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MsgDetectMessage.TriggerCondition triggerCondition, List list) {
    }
}
