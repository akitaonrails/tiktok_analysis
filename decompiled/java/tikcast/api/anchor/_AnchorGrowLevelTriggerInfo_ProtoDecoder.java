package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorGrowLevelTriggerInfo_ProtoDecoder implements C0IMD<AnchorGrowLevelTriggerInfo> {
    public static AnchorGrowLevelTriggerInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorGrowLevelTriggerInfo anchorGrowLevelTriggerInfo = new AnchorGrowLevelTriggerInfo();
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
                                anchorGrowLevelTriggerInfo.growthInstanceStrategy = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            anchorGrowLevelTriggerInfo.growthStage = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        anchorGrowLevelTriggerInfo.growthJourneyBannerInfo = _GrowthJourneyBannerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    anchorGrowLevelTriggerInfo.isGrowLevelAnchor = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorGrowLevelTriggerInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorGrowLevelTriggerInfo anchorGrowLevelTriggerInfo) {
    }

    @Override // X.C0IMD
    public final AnchorGrowLevelTriggerInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorGrowLevelTriggerInfo anchorGrowLevelTriggerInfo, List list) {
    }
}
