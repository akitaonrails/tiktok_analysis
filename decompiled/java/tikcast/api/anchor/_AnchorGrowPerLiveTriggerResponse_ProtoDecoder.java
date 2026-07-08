package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorGrowPerLiveTriggerResponse_ProtoDecoder implements C0IMD<AnchorGrowPerLiveTriggerResponse> {
    @Override // X.C0IMD
    public final void LIZ(AnchorGrowPerLiveTriggerResponse anchorGrowPerLiveTriggerResponse) {
    }

    @Override // X.C0IMD
    public final AnchorGrowPerLiveTriggerResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AnchorGrowPerLiveTriggerResponse anchorGrowPerLiveTriggerResponse = new AnchorGrowPerLiveTriggerResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    anchorGrowPerLiveTriggerResponse.data = _AnchorGrowPerLiveTriggerResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorGrowPerLiveTriggerResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorGrowPerLiveTriggerResponse anchorGrowPerLiveTriggerResponse, List list) {
    }
}
