package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PlaybookGroup_ProtoDecoder implements C0IMD<PlaybookGroup> {
    public static PlaybookGroup LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PlaybookGroup playbookGroup = new PlaybookGroup();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        playbookGroup.lastActorUserId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    playbookGroup.groupId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playbookGroup;
            }
        }
    }

    @Override // X.C0IMD
    public final PlaybookGroup LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PlaybookGroup playbookGroup) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlaybookGroup playbookGroup, List list) {
    }
}
