package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.PanelRefreshData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PanelRefreshData_ProtoDecoder implements C0IMD<PanelRefreshData> {
    public static PanelRefreshData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PanelRefreshData panelRefreshData = new PanelRefreshData();
        panelRefreshData.galleryData = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        switch (iLJI) {
                            case 100:
                                panelRefreshData.galleryData.add(_PanelRefreshData_GalleryData_ProtoDecoder.LIZLLL(c1516680pZS));
                                break;
                            case 101:
                                panelRefreshData.userLevel = _PanelRefreshData_UserLevel_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 102:
                                panelRefreshData.vaultData = _PanelRefreshData_EligibleVaultGifts_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                    } else {
                        panelRefreshData.timestamp = c1516680pZS.LJIIJJI();
                    }
                } else {
                    panelRefreshData.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return panelRefreshData;
            }
        }
    }

    public static void LJ(PanelRefreshData panelRefreshData) {
        List<PanelRefreshData.GalleryData> list = panelRefreshData.galleryData;
        if (list == null) {
            panelRefreshData.galleryData = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PanelRefreshData.GalleryData> it2 = panelRefreshData.galleryData.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        PanelRefreshData.EligibleVaultGifts eligibleVaultGifts = panelRefreshData.vaultData;
        if (eligibleVaultGifts != null && eligibleVaultGifts.giftIds == null) {
            eligibleVaultGifts.giftIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PanelRefreshData panelRefreshData) {
        LJ(panelRefreshData);
    }

    @Override // X.C0IMD
    public final PanelRefreshData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PanelRefreshData panelRefreshData, List list) {
    }
}
