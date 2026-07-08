package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PersonaAlertSourceNoticeSwitch_ProtoDecoder implements C0IMD<PersonaAlertSourceNoticeSwitch> {
    public static PersonaAlertSourceNoticeSwitch LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PersonaAlertSourceNoticeSwitch personaAlertSourceNoticeSwitch = new PersonaAlertSourceNoticeSwitch();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    personaAlertSourceNoticeSwitch.value = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return personaAlertSourceNoticeSwitch;
            }
        }
    }

    @Override // X.C0IMD
    public final PersonaAlertSourceNoticeSwitch LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PersonaAlertSourceNoticeSwitch personaAlertSourceNoticeSwitch) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PersonaAlertSourceNoticeSwitch personaAlertSourceNoticeSwitch, List list) {
    }
}
