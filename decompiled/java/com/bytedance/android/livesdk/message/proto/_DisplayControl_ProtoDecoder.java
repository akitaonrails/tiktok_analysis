package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _DisplayControl_ProtoDecoder implements C0IMD<DisplayControl> {
    public static DisplayControl LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        DisplayControl displayControl = new DisplayControl();
        displayControl.targetGroupShowRst = new HashMap();
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
                                displayControl.horizontalTriggerType = c1516680pZS.LJIIJ();
                            }
                        } else {
                            long jLIZJ2 = c1516680pZS.LIZJ();
                            Integer numValueOf = null;
                            ShowResult showResultLIZLLL = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 == -1) {
                                    break;
                                }
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        showResultLIZLLL = _ShowResult_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                                }
                            }
                            c1516680pZS.LJ(jLIZJ2);
                            if (numValueOf != null) {
                                if (showResultLIZLLL != null) {
                                    displayControl.targetGroupShowRst.put(numValueOf, showResultLIZLLL);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        displayControl.duration = c1516680pZS.LJIIJJI();
                    }
                } else {
                    displayControl.priority = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return displayControl;
            }
        }
    }

    public static void LJ(DisplayControl displayControl) {
        Map<Integer, ShowResult> map = displayControl.targetGroupShowRst;
        if (map == null) {
            displayControl.targetGroupShowRst = new HashMap();
        } else {
            if (map.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<Integer, ShowResult>> it2 = displayControl.targetGroupShowRst.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(DisplayControl displayControl) {
        LJ(displayControl);
    }

    @Override // X.C0IMD
    public final DisplayControl LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DisplayControl displayControl, List list) {
    }
}
