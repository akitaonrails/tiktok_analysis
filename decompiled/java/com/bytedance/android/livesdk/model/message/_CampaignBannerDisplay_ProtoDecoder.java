package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CampaignBannerDisplay_ProtoDecoder implements C0IMD<CampaignBannerDisplay> {
    public static CampaignBannerDisplay LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CampaignBannerDisplay campaignBannerDisplay = new CampaignBannerDisplay();
        campaignBannerDisplay.daInfo = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        campaignBannerDisplay.imageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        campaignBannerDisplay.campaignBannerIsDisplay = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        campaignBannerDisplay.sourceFrom = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        campaignBannerDisplay.bornTimeMs = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        campaignBannerDisplay.billboardVersion = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        String strLIZLLL2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (strLIZLLL2 != null) {
                                        campaignBannerDisplay.daInfo.put(strLIZLLL, strLIZLLL2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return campaignBannerDisplay;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CampaignBannerDisplay campaignBannerDisplay) {
        CampaignBannerDisplay campaignBannerDisplay2 = campaignBannerDisplay;
        if (campaignBannerDisplay2.daInfo == null) {
            campaignBannerDisplay2.daInfo = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final CampaignBannerDisplay LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CampaignBannerDisplay campaignBannerDisplay, List list) {
    }
}
