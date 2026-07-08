package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OecLiveCreatorMessageMeta_ProtoDecoder implements C0IMD<OecLiveCreatorMessageMeta> {
    public static OecLiveCreatorMessageMeta LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        OecLiveCreatorMessageMeta oecLiveCreatorMessageMeta = new OecLiveCreatorMessageMeta();
        oecLiveCreatorMessageMeta.traceInfoMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
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
                                        oecLiveCreatorMessageMeta.traceInfoMap.put(strLIZLLL, strLIZLLL2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            oecLiveCreatorMessageMeta.reason = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        oecLiveCreatorMessageMeta.serverSendNs = c1516680pZS.LJIIJJI();
                    }
                } else {
                    oecLiveCreatorMessageMeta.sourceOperateNs = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return oecLiveCreatorMessageMeta;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(OecLiveCreatorMessageMeta oecLiveCreatorMessageMeta) {
        OecLiveCreatorMessageMeta oecLiveCreatorMessageMeta2 = oecLiveCreatorMessageMeta;
        if (oecLiveCreatorMessageMeta2.traceInfoMap == null) {
            oecLiveCreatorMessageMeta2.traceInfoMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final OecLiveCreatorMessageMeta LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OecLiveCreatorMessageMeta oecLiveCreatorMessageMeta, List list) {
    }
}
