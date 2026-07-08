package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GrowthJourneyBannerItem_ProtoDecoder implements C0IMD<GrowthJourneyBannerItem> {
    public static GrowthJourneyBannerItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GrowthJourneyBannerItem growthJourneyBannerItem = new GrowthJourneyBannerItem();
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
                                growthJourneyBannerItem.bannerFrequencyKey = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            growthJourneyBannerItem.bannerIcon = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        growthJourneyBannerItem.bannerSchema = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    growthJourneyBannerItem.bannerContent = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return growthJourneyBannerItem;
            }
        }
    }

    @Override // X.C0IMD
    public final GrowthJourneyBannerItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GrowthJourneyBannerItem growthJourneyBannerItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GrowthJourneyBannerItem growthJourneyBannerItem, List list) {
    }
}
