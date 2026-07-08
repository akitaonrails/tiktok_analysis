package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PlaybookCoverInfo_ProtoDecoder implements C0IMD<PlaybookCoverInfo> {
    public static PlaybookCoverInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PlaybookCoverInfo playbookCoverInfo = new PlaybookCoverInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            playbookCoverInfo.iconPosition = c1516680pZS.LJIIJ();
                        }
                    } else {
                        playbookCoverInfo.iconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    playbookCoverInfo.starlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playbookCoverInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final PlaybookCoverInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PlaybookCoverInfo playbookCoverInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlaybookCoverInfo playbookCoverInfo, List list) {
    }
}
