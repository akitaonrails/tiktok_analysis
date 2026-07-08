package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HighlightReminder_ProtoDecoder implements C0IMD<HighlightReminder> {
    public static HighlightReminder LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HighlightReminder highlightReminder = new HighlightReminder();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        highlightReminder.type = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        highlightReminder.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        highlightReminder.subTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        highlightReminder.coverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        highlightReminder.iconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        highlightReminder.fragmentId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        highlightReminder.eventTrackParam = _HighlightReminderEventTrackParam_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return highlightReminder;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HighlightReminder highlightReminder) {
    }

    @Override // X.C0IMD
    public final HighlightReminder LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HighlightReminder highlightReminder, List list) {
    }
}
