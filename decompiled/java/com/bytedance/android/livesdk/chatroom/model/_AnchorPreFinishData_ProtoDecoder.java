package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorPreFinishData_ProtoDecoder implements C0IMD<AnchorPreFinishData> {
    @Override // X.C0IMD
    public final void LIZ(AnchorPreFinishData anchorPreFinishData) {
        AnchorPreFinishData anchorPreFinishData2 = anchorPreFinishData;
        if (anchorPreFinishData2.metricsMap == null) {
            anchorPreFinishData2.metricsMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final AnchorPreFinishData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AnchorPreFinishData anchorPreFinishData = new AnchorPreFinishData();
        anchorPreFinishData.metricsMap = new HashMap();
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
                                anchorPreFinishData.suggestionTemplateId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            long jLIZJ2 = c1516680pZS.LIZJ();
                            String strLIZLLL = null;
                            String strLIZLLL2 = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 == -1) {
                                    break;
                                }
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            }
                            c1516680pZS.LJ(jLIZJ2);
                            if (strLIZLLL != null) {
                                if (strLIZLLL2 != null) {
                                    anchorPreFinishData.metricsMap.put(strLIZLLL, strLIZLLL2);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        anchorPreFinishData.finishType = c1516680pZS.LJIIJ();
                    }
                } else {
                    anchorPreFinishData.confirmBox = _AnchorPreFinishData_ConfirmBox_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorPreFinishData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorPreFinishData anchorPreFinishData, List list) {
    }
}
