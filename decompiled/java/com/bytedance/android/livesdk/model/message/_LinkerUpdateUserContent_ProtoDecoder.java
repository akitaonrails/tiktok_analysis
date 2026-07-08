package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerUpdateUserContent_ProtoDecoder implements C0IMD<LinkerUpdateUserContent> {
    public static LinkerUpdateUserContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerUpdateUserContent linkerUpdateUserContent = new LinkerUpdateUserContent();
        linkerUpdateUserContent.updateInfo = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
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
                                    linkerUpdateUserContent.updateInfo.put(strLIZLLL, strLIZLLL2);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        linkerUpdateUserContent.toUserId = Long.valueOf(c1516680pZS.LJIIJJI());
                    }
                } else {
                    linkerUpdateUserContent.fromUserId = Long.valueOf(c1516680pZS.LJIIJJI());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerUpdateUserContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkerUpdateUserContent linkerUpdateUserContent) {
        LinkerUpdateUserContent linkerUpdateUserContent2 = linkerUpdateUserContent;
        if (linkerUpdateUserContent2.updateInfo == null) {
            linkerUpdateUserContent2.updateInfo = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final LinkerUpdateUserContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerUpdateUserContent linkerUpdateUserContent, List list) {
    }
}
