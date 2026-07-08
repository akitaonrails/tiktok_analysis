package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LayoutData_ProtoDecoder implements C0IMD<LayoutData> {
    public static LayoutData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LayoutData layoutData = new LayoutData();
        layoutData.uiPos = new ArrayList();
        layoutData.spotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 101) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    layoutData.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                                }
                            } else {
                                layoutData.groupChannelId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            layoutData.version = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        layoutData.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    layoutData.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return layoutData;
            }
        }
    }

    public static void LJ(LayoutData layoutData) {
        LayoutState layoutState = layoutData.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list = layoutData.spotList;
        if (list == null) {
            layoutData.spotList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (SpotInfo spotInfo : layoutData.spotList) {
                if (spotInfo != null) {
                    _SpotInfo_ProtoDecoder.LJ(spotInfo);
                }
            }
        }
        List<PosIdentity> list2 = layoutData.uiPos;
        if (list2 == null) {
            layoutData.uiPos = new ArrayList();
        } else {
            if (list2.isEmpty()) {
                return;
            }
            Iterator<PosIdentity> it2 = layoutData.uiPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LayoutData layoutData) {
        LJ(layoutData);
    }

    @Override // X.C0IMD
    public final LayoutData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LayoutData layoutData, List list) {
    }
}
