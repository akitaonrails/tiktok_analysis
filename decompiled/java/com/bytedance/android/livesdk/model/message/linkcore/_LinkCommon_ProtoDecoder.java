package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkCommon_ProtoDecoder implements C0IMD<LinkCommon> {
    public static LinkCommon LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkCommon linkCommon = new LinkCommon();
        linkCommon.extraMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    switch (iLJI) {
                        case 200:
                            linkCommon.source = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 201:
                            linkCommon.appId = c1516680pZS.LJIIJJI();
                            break;
                        case 202:
                            linkCommon.live_id = c1516680pZS.LJIIJJI();
                            break;
                        case 203:
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
                                            linkCommon.extraMap.put(strLIZLLL, strLIZLLL2);
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
                        default:
                            switch (iLJI) {
                                case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                                    linkCommon.centerizedIdc = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 301:
                                    linkCommon.linkmicArchVersion = c1516680pZS.LJIIJ();
                                    break;
                                case 302:
                                    linkCommon.linkerSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                            break;
                    }
                } else {
                    linkCommon.scene = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkCommon;
            }
        }
    }

    public static void LJ(LinkCommon linkCommon) {
        if (linkCommon.extraMap == null) {
            linkCommon.extraMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkCommon linkCommon) {
        LJ(linkCommon);
    }

    @Override // X.C0IMD
    public final LinkCommon LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkCommon linkCommon, List list) {
    }
}
