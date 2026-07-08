package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.DynamicListConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _DynamicListConfig_ProtoDecoder implements C0IMD<DynamicListConfig> {
    public static DynamicListConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        DynamicListConfig dynamicListConfig = new DynamicListConfig();
        dynamicListConfig.listSections = new ArrayList();
        dynamicListConfig.sectionConfigs = new HashMap();
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
                        DynamicListConfig.SectionConfig sectionConfigLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    sectionConfigLIZLLL = _DynamicListConfig_SectionConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (strLIZLLL != null) {
                            if (sectionConfigLIZLLL != null) {
                                dynamicListConfig.sectionConfigs.put(strLIZLLL, sectionConfigLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    dynamicListConfig.listSections.add(C1516700pZU.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return dynamicListConfig;
            }
        }
    }

    public static void LJ(DynamicListConfig dynamicListConfig) {
        if (dynamicListConfig.listSections == null) {
            dynamicListConfig.listSections = new ArrayList();
        }
        Map<String, DynamicListConfig.SectionConfig> map = dynamicListConfig.sectionConfigs;
        if (map == null) {
            dynamicListConfig.sectionConfigs = new HashMap();
        } else {
            if (map.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<String, DynamicListConfig.SectionConfig>> it2 = dynamicListConfig.sectionConfigs.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(DynamicListConfig dynamicListConfig) {
        LJ(dynamicListConfig);
    }

    @Override // X.C0IMD
    public final DynamicListConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DynamicListConfig dynamicListConfig, List list) {
    }
}
