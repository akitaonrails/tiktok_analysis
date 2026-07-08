package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CampaignExposureData_ProtoDecoder implements C0IMD<CampaignExposureData> {
    public static CampaignExposureData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CampaignExposureData campaignExposureData = new CampaignExposureData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        campaignExposureData.exposureType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        campaignExposureData.isShow = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        campaignExposureData.eventName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        campaignExposureData.eventData = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        campaignExposureData.plainText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        campaignExposureData.number = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        campaignExposureData.hasNewCampaignLaunched = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return campaignExposureData;
            }
        }
    }

    @Override // X.C0IMD
    public final CampaignExposureData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CampaignExposureData campaignExposureData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CampaignExposureData campaignExposureData, List list) {
    }
}
