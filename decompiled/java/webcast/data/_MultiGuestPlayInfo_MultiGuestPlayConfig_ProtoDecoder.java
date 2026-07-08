package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import webcast.data.MultiGuestPlayInfo;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestPlayInfo_MultiGuestPlayConfig_ProtoDecoder implements C0IMD<MultiGuestPlayInfo.MultiGuestPlayConfig> {
    public static MultiGuestPlayInfo.MultiGuestPlayConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestPlayInfo.MultiGuestPlayConfig multiGuestPlayConfig = new MultiGuestPlayInfo.MultiGuestPlayConfig();
        multiGuestPlayConfig.featureConfigMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Integer numValueOf = null;
                        Integer numValueOf2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    numValueOf2 = Integer.valueOf(c1516680pZS.LJIIJ());
                                }
                            } else {
                                numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (numValueOf != null) {
                            if (numValueOf2 != null) {
                                multiGuestPlayConfig.featureConfigMap.put(numValueOf, numValueOf2);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    multiGuestPlayConfig.playScene = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestPlayConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiGuestPlayInfo.MultiGuestPlayConfig multiGuestPlayConfig) {
        MultiGuestPlayInfo.MultiGuestPlayConfig multiGuestPlayConfig2 = multiGuestPlayConfig;
        if (multiGuestPlayConfig2.featureConfigMap == null) {
            multiGuestPlayConfig2.featureConfigMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final MultiGuestPlayInfo.MultiGuestPlayConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestPlayInfo.MultiGuestPlayConfig multiGuestPlayConfig, List list) {
    }
}
