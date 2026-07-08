package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostSettingsInfo_ProtoDecoder implements C0IMD<CohostSettingsInfo> {
    public static CohostSettingsInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostSettingsInfo cohostSettingsInfo = new CohostSettingsInfo();
        cohostSettingsInfo.anchorSettings = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    Long lValueOf = null;
                    Boolean boolValueOf = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                boolValueOf = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (lValueOf != null) {
                        if (boolValueOf != null) {
                            cohostSettingsInfo.anchorSettings.put(lValueOf, boolValueOf);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostSettingsInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostSettingsInfo cohostSettingsInfo) {
        CohostSettingsInfo cohostSettingsInfo2 = cohostSettingsInfo;
        if (cohostSettingsInfo2.anchorSettings == null) {
            cohostSettingsInfo2.anchorSettings = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final CohostSettingsInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostSettingsInfo cohostSettingsInfo, List list) {
    }
}
