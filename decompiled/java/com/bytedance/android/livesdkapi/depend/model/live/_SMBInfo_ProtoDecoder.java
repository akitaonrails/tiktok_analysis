package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SMBInfo_ProtoDecoder implements C0IMD<SMBInfo> {
    public static SMBInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SMBInfo sMBInfo = new SMBInfo();
        sMBInfo.activeSkuTypeList = new ArrayList();
        sMBInfo.publicRoomParam = new HashMap();
        sMBInfo.allSkuTypeList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        sMBInfo.optInStatus = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        sMBInfo.activeSkuCount = c1516680pZS.LJIIJJI();
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
                                        sMBInfo.publicRoomParam.put(strLIZLLL, strLIZLLL2);
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
                        sMBInfo.smbOptInSource = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        sMBInfo.allSkuCount = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        sMBInfo.creatorServicePlusSwitch = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        sMBInfo.activeSkuTypeList.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                        break;
                    case 8:
                        sMBInfo.allSkuTypeList.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        sMBInfo.creatorSingleSkuSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sMBInfo;
            }
        }
    }

    public static void LJ(SMBInfo sMBInfo) {
        if (sMBInfo.publicRoomParam == null) {
            sMBInfo.publicRoomParam = new HashMap();
        }
        if (sMBInfo.activeSkuTypeList == null) {
            sMBInfo.activeSkuTypeList = new ArrayList();
        }
        if (sMBInfo.allSkuTypeList == null) {
            sMBInfo.allSkuTypeList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SMBInfo sMBInfo) {
        LJ(sMBInfo);
    }

    @Override // X.C0IMD
    public final SMBInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBInfo sMBInfo, List list) {
    }
}
