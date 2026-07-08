package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.data.EntryData;

/* JADX INFO: loaded from: classes.dex */
public final class _EntryData_Conditions_ProtoDecoder implements C0IMD<EntryData.Conditions> {
    public static EntryData.Conditions LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EntryData.Conditions conditions = new EntryData.Conditions();
        conditions.blockGiftIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        conditions.blockGiftIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    conditions.giftPrice = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return conditions;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EntryData.Conditions conditions) {
        EntryData.Conditions conditions2 = conditions;
        if (conditions2.blockGiftIds == null) {
            conditions2.blockGiftIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final EntryData.Conditions LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EntryData.Conditions conditions, List list) {
    }
}
