package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopGuestMetaContent_ProtoDecoder implements C0IMD<TopGuestMetaContent> {
    public static TopGuestMetaContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TopGuestMetaContent topGuestMetaContent = new TopGuestMetaContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        topGuestMetaContent.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        topGuestMetaContent.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        topGuestMetaContent.playId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        topGuestMetaContent.topGuestStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        topGuestMetaContent.version = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        topGuestMetaContent.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        topGuestMetaContent.endTime = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topGuestMetaContent;
            }
        }
    }

    @Override // X.C0IMD
    public final TopGuestMetaContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TopGuestMetaContent topGuestMetaContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopGuestMetaContent topGuestMetaContent, List list) {
    }
}
