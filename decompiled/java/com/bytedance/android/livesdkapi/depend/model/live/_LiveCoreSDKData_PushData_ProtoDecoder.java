package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveCoreSDKData_PushData_ProtoDecoder implements C0IMD<LiveCoreSDKData.PushData> {
    public static LiveCoreSDKData.PushData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveCoreSDKData.PushData pushData = new LiveCoreSDKData.PushData();
        pushData.resolutionParams = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            pushData.streamData = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        pushData.pushStreamLevel = c1516680pZS.LJIIJ();
                    }
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    String strLIZLLL = null;
                    LiveCoreSDKData.PushData.ResolutionParams resolutionParamsLIZLLL = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                resolutionParamsLIZLLL = _LiveCoreSDKData_PushData_ResolutionParams_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (strLIZLLL != null) {
                        if (resolutionParamsLIZLLL != null) {
                            pushData.resolutionParams.put(strLIZLLL, resolutionParamsLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pushData;
            }
        }
    }

    public static void LJ(LiveCoreSDKData.PushData pushData) {
        Map<String, LiveCoreSDKData.PushData.ResolutionParams> map = pushData.resolutionParams;
        if (map == null) {
            pushData.resolutionParams = new HashMap();
        } else {
            if (map.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<String, LiveCoreSDKData.PushData.ResolutionParams>> it2 = pushData.resolutionParams.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveCoreSDKData.PushData pushData) {
        LJ(pushData);
    }

    @Override // X.C0IMD
    public final LiveCoreSDKData.PushData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveCoreSDKData.PushData pushData, List list) {
    }
}
