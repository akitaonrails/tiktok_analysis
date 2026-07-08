package webcast.api.linkmic_multi_guest;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.linkmic_multi_guest.GuideLayoutDetailsResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideLayoutDetailsResponse_Extra_ProtoDecoder implements C0IMD<GuideLayoutDetailsResponse.Extra> {
    public static GuideLayoutDetailsResponse.Extra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuideLayoutDetailsResponse.Extra extra = new GuideLayoutDetailsResponse.Extra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    extra.now = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return extra;
            }
        }
    }

    @Override // X.C0IMD
    public final GuideLayoutDetailsResponse.Extra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuideLayoutDetailsResponse.Extra extra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideLayoutDetailsResponse.Extra extra, List list) {
    }
}
