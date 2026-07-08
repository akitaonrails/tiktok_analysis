package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SurpriseSet_ProtoDecoder implements C0IMD<SurpriseSet> {
    public static SurpriseSet LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SurpriseSet surpriseSet = new SurpriseSet();
        surpriseSet.surpriseSetItem = new ArrayList();
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
                                    surpriseSet.surpriseSetExtra = _SurpriseSetExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                surpriseSet.surpriseSetProperties = _SurpriseSetProperties_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            surpriseSet.status = c1516680pZS.LJIIJ();
                        }
                    } else {
                        surpriseSet.surpriseSetItem.add(_LiveSurpriseSetItem_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    surpriseSet.surpriseSetId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return surpriseSet;
            }
        }
    }

    public static void LJ(SurpriseSet surpriseSet) {
        List<LiveSurpriseSetItem> list = surpriseSet.surpriseSetItem;
        if (list == null) {
            surpriseSet.surpriseSetItem = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<LiveSurpriseSetItem> it2 = surpriseSet.surpriseSetItem.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SurpriseSet surpriseSet) {
        LJ(surpriseSet);
    }

    @Override // X.C0IMD
    public final SurpriseSet LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SurpriseSet surpriseSet, List list) {
    }
}
