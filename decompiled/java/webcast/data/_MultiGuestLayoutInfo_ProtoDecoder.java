package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestLayoutInfo_ProtoDecoder implements C0IMD<MultiGuestLayoutInfo> {
    public static MultiGuestLayoutInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestLayoutInfo multiGuestLayoutInfo = new MultiGuestLayoutInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            multiGuestLayoutInfo.multiLayoutKey = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        multiGuestLayoutInfo.guestCnt = c1516680pZS.LJIIJJI();
                    }
                } else {
                    multiGuestLayoutInfo.multiLayoutChanged = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestLayoutInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final MultiGuestLayoutInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MultiGuestLayoutInfo multiGuestLayoutInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestLayoutInfo multiGuestLayoutInfo, List list) {
    }
}
