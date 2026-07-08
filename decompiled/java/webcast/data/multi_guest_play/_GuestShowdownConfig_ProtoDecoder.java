package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestShowdownConfig_ProtoDecoder implements C0IMD<GuestShowdownConfig> {
    public static GuestShowdownConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestShowdownConfig guestShowdownConfig = new GuestShowdownConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            guestShowdownConfig.winnerNum = c1516680pZS.LJIIJ();
                        }
                    } else {
                        guestShowdownConfig.loserNum = c1516680pZS.LJIIJ();
                    }
                } else {
                    guestShowdownConfig.duration = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestShowdownConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final GuestShowdownConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuestShowdownConfig guestShowdownConfig) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestShowdownConfig guestShowdownConfig, List list) {
    }
}
