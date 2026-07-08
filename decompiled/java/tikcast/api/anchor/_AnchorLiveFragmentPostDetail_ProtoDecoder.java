package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorLiveFragmentPostDetail_ProtoDecoder implements C0IMD<AnchorLiveFragmentPostDetail> {
    public static AnchorLiveFragmentPostDetail LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorLiveFragmentPostDetail anchorLiveFragmentPostDetail = new AnchorLiveFragmentPostDetail();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            anchorLiveFragmentPostDetail.fragmentTypeNew = c1516680pZS.LJIIJ();
                        }
                    } else {
                        anchorLiveFragmentPostDetail.postCount = c1516680pZS.LJIIJJI();
                    }
                } else {
                    anchorLiveFragmentPostDetail.fragmentType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorLiveFragmentPostDetail;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorLiveFragmentPostDetail LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorLiveFragmentPostDetail anchorLiveFragmentPostDetail) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorLiveFragmentPostDetail anchorLiveFragmentPostDetail, List list) {
    }
}
