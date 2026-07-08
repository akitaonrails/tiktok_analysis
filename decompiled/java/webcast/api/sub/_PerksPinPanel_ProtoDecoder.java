package webcast.api.sub;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PerksPinPanel_ProtoDecoder implements C0IMD<PerksPinPanel> {
    public static PerksPinPanel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PerksPinPanel perksPinPanel = new PerksPinPanel();
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
                                perksPinPanel.showToNewViewer = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            perksPinPanel.status = c1516680pZS.LJIIJ();
                        }
                    } else {
                        perksPinPanel.pinnedIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    perksPinPanel.coolingDownTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return perksPinPanel;
            }
        }
    }

    @Override // X.C0IMD
    public final PerksPinPanel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PerksPinPanel perksPinPanel) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PerksPinPanel perksPinPanel, List list) {
    }
}
