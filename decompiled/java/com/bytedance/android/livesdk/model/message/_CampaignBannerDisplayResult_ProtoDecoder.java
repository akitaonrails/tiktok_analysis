package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CampaignBannerDisplayResult_ProtoDecoder implements C0IMD<CampaignBannerDisplayResult> {
    public static CampaignBannerDisplayResult LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CampaignBannerDisplayResult campaignBannerDisplayResult = new CampaignBannerDisplayResult();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    campaignBannerDisplayResult.campaignBannerDisplayResult = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return campaignBannerDisplayResult;
            }
        }
    }

    @Override // X.C0IMD
    public final CampaignBannerDisplayResult LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CampaignBannerDisplayResult campaignBannerDisplayResult) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CampaignBannerDisplayResult campaignBannerDisplayResult, List list) {
    }
}
