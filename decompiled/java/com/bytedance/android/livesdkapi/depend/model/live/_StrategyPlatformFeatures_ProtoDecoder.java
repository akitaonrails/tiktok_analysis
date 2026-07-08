package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StrategyPlatformFeatures_ProtoDecoder implements C0IMD<StrategyPlatformFeatures> {
    public static StrategyPlatformFeatures LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StrategyPlatformFeatures strategyPlatformFeatures = new StrategyPlatformFeatures();
        strategyPlatformFeatures.stringFeatures = new ArrayList();
        strategyPlatformFeatures.boolFeatures = new ArrayList();
        strategyPlatformFeatures.intFeatures = new ArrayList();
        strategyPlatformFeatures.floatFeatures = new ArrayList();
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
                                strategyPlatformFeatures.boolFeatures.add(_StrategyPlatformFeature_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            strategyPlatformFeatures.stringFeatures.add(_StrategyPlatformFeature_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        strategyPlatformFeatures.floatFeatures.add(_StrategyPlatformFeature_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    strategyPlatformFeatures.intFeatures.add(_StrategyPlatformFeature_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return strategyPlatformFeatures;
            }
        }
    }

    public static void LJ(StrategyPlatformFeatures strategyPlatformFeatures) {
        List<StrategyPlatformFeature> list = strategyPlatformFeatures.intFeatures;
        if (list == null) {
            strategyPlatformFeatures.intFeatures = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<StrategyPlatformFeature> it2 = strategyPlatformFeatures.intFeatures.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<StrategyPlatformFeature> list2 = strategyPlatformFeatures.floatFeatures;
        if (list2 == null) {
            strategyPlatformFeatures.floatFeatures = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<StrategyPlatformFeature> it3 = strategyPlatformFeatures.floatFeatures.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        List<StrategyPlatformFeature> list3 = strategyPlatformFeatures.stringFeatures;
        if (list3 == null) {
            strategyPlatformFeatures.stringFeatures = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<StrategyPlatformFeature> it4 = strategyPlatformFeatures.stringFeatures.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        List<StrategyPlatformFeature> list4 = strategyPlatformFeatures.boolFeatures;
        if (list4 == null) {
            strategyPlatformFeatures.boolFeatures = new ArrayList();
        } else {
            if (list4.isEmpty()) {
                return;
            }
            Iterator<StrategyPlatformFeature> it5 = strategyPlatformFeatures.boolFeatures.iterator();
            while (it5.hasNext()) {
                it5.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(StrategyPlatformFeatures strategyPlatformFeatures) {
        LJ(strategyPlatformFeatures);
    }

    @Override // X.C0IMD
    public final StrategyPlatformFeatures LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StrategyPlatformFeatures strategyPlatformFeatures, List list) {
    }
}
