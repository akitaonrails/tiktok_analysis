package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.api.room.EntranceConditionsPopup;

/* JADX INFO: loaded from: classes.dex */
public final class _EntranceConditionsPopup_ProtoDecoder implements C0IMD<EntranceConditionsPopup> {
    public static EntranceConditionsPopup LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EntranceConditionsPopup entranceConditionsPopup = new EntranceConditionsPopup();
        entranceConditionsPopup.conditions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        entranceConditionsPopup.title = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    entranceConditionsPopup.conditions.add(_EntranceConditionsPopup_Condition_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return entranceConditionsPopup;
            }
        }
    }

    public static void LJ(EntranceConditionsPopup entranceConditionsPopup) {
        List<EntranceConditionsPopup.Condition> list = entranceConditionsPopup.conditions;
        if (list == null) {
            entranceConditionsPopup.conditions = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<EntranceConditionsPopup.Condition> it2 = entranceConditionsPopup.conditions.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EntranceConditionsPopup entranceConditionsPopup) {
        LJ(entranceConditionsPopup);
    }

    @Override // X.C0IMD
    public final EntranceConditionsPopup LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EntranceConditionsPopup entranceConditionsPopup, List list) {
    }
}
