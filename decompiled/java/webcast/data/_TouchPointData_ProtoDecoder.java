package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TouchPointData_ProtoDecoder implements C0IMD<TouchPointData> {
    public static TouchPointData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TouchPointData touchPointData = new TouchPointData();
        touchPointData.logExtra = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        touchPointData.minVersion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        touchPointData.maxVersion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        String strLIZLLL2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (strLIZLLL2 != null) {
                                        touchPointData.logExtra.put(strLIZLLL, strLIZLLL2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 4:
                        touchPointData.tpName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        touchPointData.metaData = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        touchPointData.tpId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        touchPointData.styleId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        touchPointData.styleName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        touchPointData.entryData = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return touchPointData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TouchPointData touchPointData) {
        TouchPointData touchPointData2 = touchPointData;
        if (touchPointData2.logExtra == null) {
            touchPointData2.logExtra = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final TouchPointData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TouchPointData touchPointData, List list) {
    }
}
