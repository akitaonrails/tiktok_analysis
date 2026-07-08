package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HighlightCollectionVideo_ProtoDecoder implements C0IMD<HighlightCollectionVideo> {
    public static HighlightCollectionVideo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HighlightCollectionVideo highlightCollectionVideo = new HighlightCollectionVideo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        highlightCollectionVideo.fragmentId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    highlightCollectionVideo.url = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return highlightCollectionVideo;
            }
        }
    }

    @Override // X.C0IMD
    public final HighlightCollectionVideo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(HighlightCollectionVideo highlightCollectionVideo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HighlightCollectionVideo highlightCollectionVideo, List list) {
    }
}
