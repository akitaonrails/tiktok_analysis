package com.bytedance.android.livesdk.model.message.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PatternRef_ProtoDecoder implements C0IMD<PatternRef> {
    public static PatternRef LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PatternRef patternRef = new PatternRef();
        patternRef.keyGroups = new HashMap();
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
                                    patternRef.keyGroups.put(strLIZLLL, strLIZLLL2);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        patternRef.defaultPattern = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    patternRef.key = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return patternRef;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PatternRef patternRef) {
        PatternRef patternRef2 = patternRef;
        if (patternRef2.keyGroups == null) {
            patternRef2.keyGroups = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final PatternRef LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PatternRef patternRef, List list) {
    }
}
