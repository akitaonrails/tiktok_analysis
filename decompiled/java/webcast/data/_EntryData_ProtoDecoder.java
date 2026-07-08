package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.EntryData;

/* JADX INFO: loaded from: classes.dex */
public final class _EntryData_ProtoDecoder implements C0IMD<EntryData> {
    public static EntryData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EntryData entryData = new EntryData();
        entryData.bubbleCondition = new ArrayList();
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
                                entryData.bubbleCondition.add(_BubbleCondition_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            entryData.schemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        entryData.conditions = _EntryData_Conditions_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    entryData.entryType = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return entryData;
            }
        }
    }

    public static void LJ(EntryData entryData) {
        EntryData.Conditions conditions = entryData.conditions;
        if (conditions != null && conditions.blockGiftIds == null) {
            conditions.blockGiftIds = new ArrayList();
        }
        List<BubbleCondition> list = entryData.bubbleCondition;
        if (list == null) {
            entryData.bubbleCondition = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<BubbleCondition> it2 = entryData.bubbleCondition.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EntryData entryData) {
        LJ(entryData);
    }

    @Override // X.C0IMD
    public final EntryData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EntryData entryData, List list) {
    }
}
