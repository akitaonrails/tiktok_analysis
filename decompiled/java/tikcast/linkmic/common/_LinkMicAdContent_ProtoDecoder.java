package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicAdContent_ProtoDecoder implements C0IMD<LinkMicAdContent> {
    public static LinkMicAdContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkMicAdContent linkMicAdContent = new LinkMicAdContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    linkMicAdContent.url = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                linkMicAdContent.playTimes = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            linkMicAdContent.duration = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        linkMicAdContent.adId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    linkMicAdContent.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicAdContent;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkMicAdContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkMicAdContent linkMicAdContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicAdContent linkMicAdContent, List list) {
    }
}
