package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicCommonResp_ProtoDecoder implements C0IMD<LinkMicCommonResp> {
    public static LinkMicCommonResp LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkMicCommonResp linkMicCommonResp = new LinkMicCommonResp();
        linkMicCommonResp.extra = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkMicCommonResp.errorCode = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        linkMicCommonResp.errorMsg = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        byte[] bArrLJII = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        bArrLJII = c1516680pZS.LJII();
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (bArrLJII != null) {
                                        linkMicCommonResp.extra.put(strLIZLLL, bArrLJII);
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
                        linkMicCommonResp.linkerMode = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        linkMicCommonResp.waitCrossData = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        linkMicCommonResp.linkerSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicCommonResp;
            }
        }
    }

    public static void LJ(LinkMicCommonResp linkMicCommonResp) {
        if (linkMicCommonResp.extra == null) {
            linkMicCommonResp.extra = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkMicCommonResp linkMicCommonResp) {
        LJ(linkMicCommonResp);
    }

    @Override // X.C0IMD
    public final LinkMicCommonResp LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicCommonResp linkMicCommonResp, List list) {
    }
}
