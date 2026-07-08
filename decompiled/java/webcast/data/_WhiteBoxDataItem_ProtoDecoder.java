package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WhiteBoxDataItem_ProtoDecoder implements C0IMD<WhiteBoxDataItem> {
    public static WhiteBoxDataItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WhiteBoxDataItem whiteBoxDataItem = new WhiteBoxDataItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                whiteBoxDataItem.isNow = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            whiteBoxDataItem.relativeTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        whiteBoxDataItem.recommendationViewers = c1516680pZS.LJIIJJI();
                    }
                } else {
                    whiteBoxDataItem.viewers = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return whiteBoxDataItem;
            }
        }
    }

    @Override // X.C0IMD
    public final WhiteBoxDataItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(WhiteBoxDataItem whiteBoxDataItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WhiteBoxDataItem whiteBoxDataItem, List list) {
    }
}
