package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.room.EntranceConditionsPopup;

/* JADX INFO: loaded from: classes.dex */
public final class _EntranceConditionsPopup_Condition_ProtoDecoder implements C0IMD<EntranceConditionsPopup.Condition> {
    public static EntranceConditionsPopup.Condition LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EntranceConditionsPopup.Condition condition = new EntranceConditionsPopup.Condition();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            condition.match = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        condition.text = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    condition.name = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return condition;
            }
        }
    }

    @Override // X.C0IMD
    public final EntranceConditionsPopup.Condition LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EntranceConditionsPopup.Condition condition) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EntranceConditionsPopup.Condition condition, List list) {
    }
}
