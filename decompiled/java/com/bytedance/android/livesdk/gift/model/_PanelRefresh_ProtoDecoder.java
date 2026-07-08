package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.PanelRefresh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PanelRefresh_ProtoDecoder implements C0IMD<PanelRefresh> {
    public static PanelRefresh LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PanelRefresh panelRefresh = new PanelRefresh();
        panelRefresh.allGalleryData = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    switch (iLJI) {
                                        case 100:
                                            panelRefresh.galleryData = _PanelRefresh_Gallery_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 101:
                                            panelRefresh.userLevel = _PanelRefresh_UserLevel_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 102:
                                            panelRefresh.fanClub = _PanelRefresh_FanClub_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 103:
                                            panelRefresh.allGalleryData.add(_PanelRefresh_Gallery_ProtoDecoder.LIZLLL(c1516680pZS));
                                            break;
                                        default:
                                            C1516700pZU.LJ(c1516680pZS);
                                            break;
                                    }
                                } else {
                                    panelRefresh.timestamp = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                panelRefresh.roomId = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        } else {
                            panelRefresh.toUserId = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    } else {
                        panelRefresh.price = c1516680pZS.LJIIJJI();
                    }
                } else {
                    panelRefresh.giftId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return panelRefresh;
            }
        }
    }

    public static void LJ(PanelRefresh panelRefresh) {
        List<PanelRefresh.Gallery> list = panelRefresh.allGalleryData;
        if (list == null) {
            panelRefresh.allGalleryData = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<PanelRefresh.Gallery> it2 = panelRefresh.allGalleryData.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PanelRefresh panelRefresh) {
        LJ(panelRefresh);
    }

    @Override // X.C0IMD
    public final PanelRefresh LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PanelRefresh panelRefresh, List list) {
    }
}
