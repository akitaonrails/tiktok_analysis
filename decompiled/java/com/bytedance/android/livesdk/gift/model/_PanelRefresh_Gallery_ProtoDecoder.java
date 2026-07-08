package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.PanelRefresh;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PanelRefresh_Gallery_ProtoDecoder implements C0IMD<PanelRefresh.Gallery> {
    public static PanelRefresh.Gallery LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PanelRefresh.Gallery gallery = new PanelRefresh.Gallery();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        gallery.sponsorId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        gallery.lightGiftUp = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        gallery.leftCountToSponsor = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        gallery.canSponsor = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        gallery.goalCount = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        gallery.isGalleryAvailable = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        gallery.giftId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gallery;
            }
        }
    }

    @Override // X.C0IMD
    public final PanelRefresh.Gallery LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PanelRefresh.Gallery gallery) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PanelRefresh.Gallery gallery, List list) {
    }
}
