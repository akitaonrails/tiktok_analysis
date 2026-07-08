package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.anchor.AnchorGrowPerLiveTriggerResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorGrowPerLiveTriggerResponse_Data_ProtoDecoder implements C0IMD<AnchorGrowPerLiveTriggerResponse.Data> {
    public static AnchorGrowPerLiveTriggerResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorGrowPerLiveTriggerResponse.Data data = new AnchorGrowPerLiveTriggerResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    data.anchorGrowLevelInfo = _AnchorGrowLevelTriggerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorGrowPerLiveTriggerResponse.Data data) {
    }

    @Override // X.C0IMD
    public final AnchorGrowPerLiveTriggerResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorGrowPerLiveTriggerResponse.Data data, List list) {
    }
}
