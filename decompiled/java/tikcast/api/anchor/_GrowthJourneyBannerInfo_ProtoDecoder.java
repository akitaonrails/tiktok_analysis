package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GrowthJourneyBannerInfo_ProtoDecoder implements C0IMD<GrowthJourneyBannerInfo> {
    public static GrowthJourneyBannerInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GrowthJourneyBannerInfo growthJourneyBannerInfo = new GrowthJourneyBannerInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            growthJourneyBannerInfo.growthInstanceBanner = _GrowthJourneyBannerItem_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        growthJourneyBannerInfo.growLevelSpecialLevelArrivedBanner = _GrowthJourneyBannerItem_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    growthJourneyBannerInfo.growLevelFirstBanner = _GrowthJourneyBannerItem_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return growthJourneyBannerInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GrowthJourneyBannerInfo growthJourneyBannerInfo) {
    }

    @Override // X.C0IMD
    public final GrowthJourneyBannerInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GrowthJourneyBannerInfo growthJourneyBannerInfo, List list) {
    }
}
