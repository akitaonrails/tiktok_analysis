package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ToplivePageData_ProtoDecoder implements C0IMD<ToplivePageData> {
    @Override // X.C0IMD
    public final void LIZ(ToplivePageData toplivePageData) {
        ToplivePageData toplivePageData2 = toplivePageData;
        List<ToplivePageItem> list = toplivePageData2.items;
        if (list == null) {
            toplivePageData2.items = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ToplivePageItem toplivePageItem : toplivePageData2.items) {
            if (toplivePageItem != null) {
                _ToplivePageItem_ProtoDecoder.LJ(toplivePageItem);
            }
        }
    }

    @Override // X.C0IMD
    public final ToplivePageData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ToplivePageData toplivePageData = new ToplivePageData();
        toplivePageData.items = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    toplivePageData.items.add(_ToplivePageItem_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return toplivePageData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ToplivePageData toplivePageData, List list) {
    }
}
