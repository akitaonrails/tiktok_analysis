package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PlaybookFlowExtra_ProtoDecoder implements C0IMD<PlaybookFlowExtra> {
    public static PlaybookFlowExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PlaybookFlowExtra playbookFlowExtra = new PlaybookFlowExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    playbookFlowExtra.needLoading = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playbookFlowExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final PlaybookFlowExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PlaybookFlowExtra playbookFlowExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlaybookFlowExtra playbookFlowExtra, List list) {
    }
}
