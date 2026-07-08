package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ShowConfig_ProtoDecoder implements C0IMD<ShowConfig> {
    public static ShowConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ShowConfig showConfig = new ShowConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            showConfig.transitionDurationOfConfig = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        showConfig.allowOpenMicFreely = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    showConfig.durationPerGuest = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return showConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final ShowConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ShowConfig showConfig) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ShowConfig showConfig, List list) {
    }
}
