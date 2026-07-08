package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.data.MultiGuestPlayInfo;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestPlayInfo_ProtoDecoder implements C0IMD<MultiGuestPlayInfo> {
    public static MultiGuestPlayInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestPlayInfo multiGuestPlayInfo = new MultiGuestPlayInfo();
        multiGuestPlayInfo.playSceneToConfigMap = new HashMap();
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
                        MultiGuestPlayInfo.MultiGuestPlayConfig multiGuestPlayConfigLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    multiGuestPlayConfigLIZLLL = _MultiGuestPlayInfo_MultiGuestPlayConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (numValueOf != null) {
                            if (multiGuestPlayConfigLIZLLL != null) {
                                multiGuestPlayInfo.playSceneToConfigMap.put(numValueOf, multiGuestPlayConfigLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    multiGuestPlayInfo.packSuccFlag = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestPlayInfo;
            }
        }
    }

    public static void LJ(MultiGuestPlayInfo multiGuestPlayInfo) {
        Map<Integer, MultiGuestPlayInfo.MultiGuestPlayConfig> map = multiGuestPlayInfo.playSceneToConfigMap;
        if (map == null) {
            multiGuestPlayInfo.playSceneToConfigMap = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Integer, MultiGuestPlayInfo.MultiGuestPlayConfig>> it2 = multiGuestPlayInfo.playSceneToConfigMap.entrySet().iterator();
        while (it2.hasNext()) {
            MultiGuestPlayInfo.MultiGuestPlayConfig value = it2.next().getValue();
            if (value != null && value.featureConfigMap == null) {
                value.featureConfigMap = new HashMap();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiGuestPlayInfo multiGuestPlayInfo) {
        LJ(multiGuestPlayInfo);
    }

    @Override // X.C0IMD
    public final MultiGuestPlayInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestPlayInfo multiGuestPlayInfo, List list) {
    }
}
