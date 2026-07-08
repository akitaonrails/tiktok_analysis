package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WebcastLSAccessStatus_ProtoDecoder implements C0IMD<WebcastLSAccessStatus> {
    public static WebcastLSAccessStatus LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WebcastLSAccessStatus webcastLSAccessStatus = new WebcastLSAccessStatus();
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
                                webcastLSAccessStatus.upgradeRestrictionEndDay = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            webcastLSAccessStatus.punishDetailUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        webcastLSAccessStatus.isUpgradeRestricted = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    webcastLSAccessStatus.userAccessStatus = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return webcastLSAccessStatus;
            }
        }
    }

    @Override // X.C0IMD
    public final WebcastLSAccessStatus LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(WebcastLSAccessStatus webcastLSAccessStatus) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WebcastLSAccessStatus webcastLSAccessStatus, List list) {
    }
}
