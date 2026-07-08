package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HighlightCollection_ProtoDecoder implements C0IMD<HighlightCollection> {
    public static HighlightCollection LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HighlightCollection highlightCollection = new HighlightCollection();
        highlightCollection.elementList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        highlightCollection.prompt = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    highlightCollection.elementList.add(_HighlightCollectionElement_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return highlightCollection;
            }
        }
    }

    public static void LJ(HighlightCollection highlightCollection) {
        List<HighlightCollectionElement> list = highlightCollection.elementList;
        if (list == null) {
            highlightCollection.elementList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (HighlightCollectionElement highlightCollectionElement : highlightCollection.elementList) {
            if (highlightCollectionElement != null) {
                _HighlightCollectionElement_ProtoDecoder.LJ(highlightCollectionElement);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HighlightCollection highlightCollection) {
        LJ(highlightCollection);
    }

    @Override // X.C0IMD
    public final HighlightCollection LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HighlightCollection highlightCollection, List list) {
    }
}
