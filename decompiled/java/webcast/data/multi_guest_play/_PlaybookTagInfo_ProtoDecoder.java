package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PlaybookTagInfo_ProtoDecoder implements C0IMD<PlaybookTagInfo> {
    public static PlaybookTagInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PlaybookTagInfo playbookTagInfo = new PlaybookTagInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        playbookTagInfo.tagTranslatedName = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    playbookTagInfo.tagType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playbookTagInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final PlaybookTagInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PlaybookTagInfo playbookTagInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlaybookTagInfo playbookTagInfo, List list) {
    }
}
