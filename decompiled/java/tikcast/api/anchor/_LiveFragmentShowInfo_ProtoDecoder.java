package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class _LiveFragmentShowInfo_ProtoDecoder implements C0IMD<LiveFragmentShowInfo> {
    public static LiveFragmentShowInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveFragmentShowInfo liveFragmentShowInfo = new LiveFragmentShowInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveFragmentShowInfo.icon = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        liveFragmentShowInfo.desc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        liveFragmentShowInfo.subTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        liveFragmentShowInfo.popUpPageInfo = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        liveFragmentShowInfo.singleGiftHighlightShowInfo = _SingleGiftHighlightShowInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        liveFragmentShowInfo.businessShowInfo = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        liveFragmentShowInfo.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveFragmentShowInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveFragmentShowInfo liveFragmentShowInfo) {
    }

    @Override // X.C0IMD
    public final LiveFragmentShowInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveFragmentShowInfo liveFragmentShowInfo, List list) {
    }
}
