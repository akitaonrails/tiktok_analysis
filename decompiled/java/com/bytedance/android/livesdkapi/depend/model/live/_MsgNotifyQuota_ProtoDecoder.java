package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MsgNotifyQuota_ProtoDecoder implements C0IMD<MsgNotifyQuota> {
    public static MsgNotifyQuota LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MsgNotifyQuota msgNotifyQuota = new MsgNotifyQuota();
        msgNotifyQuota.positionCountMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            msgNotifyQuota.defaultCount = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        Long lValueOf = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (strLIZLLL != null) {
                            if (lValueOf != null) {
                                msgNotifyQuota.positionCountMap.put(strLIZLLL, lValueOf);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    msgNotifyQuota.componentType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return msgNotifyQuota;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MsgNotifyQuota msgNotifyQuota) {
        MsgNotifyQuota msgNotifyQuota2 = msgNotifyQuota;
        if (msgNotifyQuota2.positionCountMap == null) {
            msgNotifyQuota2.positionCountMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final MsgNotifyQuota LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MsgNotifyQuota msgNotifyQuota, List list) {
    }
}
