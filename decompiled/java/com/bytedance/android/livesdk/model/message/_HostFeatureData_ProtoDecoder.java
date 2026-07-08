package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HostFeatureData_ProtoDecoder implements C0IMD<HostFeatureData> {
    public static HostFeatureData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HostFeatureData hostFeatureData = new HostFeatureData();
        hostFeatureData.features = new HashMap();
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
                                hostFeatureData.features.put(strLIZLLL, strLIZLLL2);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    hostFeatureData.eventTimeMs = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hostFeatureData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HostFeatureData hostFeatureData) {
        HostFeatureData hostFeatureData2 = hostFeatureData;
        if (hostFeatureData2.features == null) {
            hostFeatureData2.features = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final HostFeatureData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HostFeatureData hostFeatureData, List list) {
    }
}
