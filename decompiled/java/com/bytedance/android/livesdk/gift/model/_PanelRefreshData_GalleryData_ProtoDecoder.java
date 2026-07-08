package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.PanelRefreshData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PanelRefreshData_GalleryData_ProtoDecoder implements C0IMD<PanelRefreshData.GalleryData> {
    public static PanelRefreshData.GalleryData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PanelRefreshData.GalleryData galleryData = new PanelRefreshData.GalleryData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        galleryData.sponsorId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        galleryData.giftId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        galleryData.ownProgress = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        galleryData.leftCountToSponsor = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        galleryData.canSponsor = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        galleryData.isGalleryAvailable = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return galleryData;
            }
        }
    }

    @Override // X.C0IMD
    public final PanelRefreshData.GalleryData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PanelRefreshData.GalleryData galleryData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PanelRefreshData.GalleryData galleryData, List list) {
    }
}
