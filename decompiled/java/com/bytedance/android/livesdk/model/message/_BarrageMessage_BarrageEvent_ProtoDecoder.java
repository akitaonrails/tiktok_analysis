package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BarrageMessage_BarrageEvent_ProtoDecoder implements C0IMD<BarrageMessage.BarrageEvent> {
    public static BarrageMessage.BarrageEvent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BarrageMessage.BarrageEvent barrageEvent = new BarrageMessage.BarrageEvent();
        barrageEvent.params = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        String strLIZLLL2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (strLIZLLL != null) {
                            if (strLIZLLL2 != null) {
                                barrageEvent.params.put(strLIZLLL, strLIZLLL2);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    barrageEvent.eventName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return barrageEvent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BarrageMessage.BarrageEvent barrageEvent) {
        BarrageMessage.BarrageEvent barrageEvent2 = barrageEvent;
        if (barrageEvent2.params == null) {
            barrageEvent2.params = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final BarrageMessage.BarrageEvent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BarrageMessage.BarrageEvent barrageEvent, List list) {
    }
}
