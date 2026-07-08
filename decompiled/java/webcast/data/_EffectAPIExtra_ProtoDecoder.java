package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EffectAPIExtra_ProtoDecoder implements C0IMD<EffectAPIExtra> {
    public static EffectAPIExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EffectAPIExtra effectAPIExtra = new EffectAPIExtra();
        effectAPIExtra.filteredEffects = new ArrayList();
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
                                    effectAPIExtra.tradeChange = c1516680pZS.LJIIJ();
                                }
                            } else {
                                effectAPIExtra.filteredEffects.add(_FilteredEffect_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            effectAPIExtra.abParams = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        effectAPIExtra.effectRecommend = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    effectAPIExtra.recId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return effectAPIExtra;
            }
        }
    }

    public static void LJ(EffectAPIExtra effectAPIExtra) {
        List<FilteredEffect> list = effectAPIExtra.filteredEffects;
        if (list == null) {
            effectAPIExtra.filteredEffects = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<FilteredEffect> it2 = effectAPIExtra.filteredEffects.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EffectAPIExtra effectAPIExtra) {
        LJ(effectAPIExtra);
    }

    @Override // X.C0IMD
    public final EffectAPIExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectAPIExtra effectAPIExtra, List list) {
    }
}
