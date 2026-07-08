package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Panel_ProtoDecoder implements C0IMD<Panel> {
    public static Panel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Panel panel = new Panel();
        panel.tags = new ArrayList();
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
                                    panel.extra = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                panel.tagsUpdatedAt = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            panel.tags.add(C1516700pZU.LIZLLL(c1516680pZS));
                        }
                    } else {
                        panel.icon = _UrlDataStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    panel.text = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return panel;
            }
        }
    }

    public static void LJ(Panel panel) {
        UrlDataStruct urlDataStruct = panel.icon;
        if (urlDataStruct != null) {
            _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct);
        }
        if (panel.tags == null) {
            panel.tags = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Panel panel) {
        LJ(panel);
    }

    @Override // X.C0IMD
    public final Panel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Panel panel, List list) {
    }
}
