package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _StarCommentConfig_ProtoDecoder implements C0IMD<StarCommentConfig> {
    public static StarCommentConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StarCommentConfig starCommentConfig = new StarCommentConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    starCommentConfig.displayLock = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                starCommentConfig.starCommentQualification = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            starCommentConfig.grantLevel = c1516680pZS.LJIIJ();
                        }
                    } else {
                        starCommentConfig.grantGroup = c1516680pZS.LJIIJ();
                    }
                } else {
                    starCommentConfig.starCommentSwitch = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return starCommentConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final StarCommentConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(StarCommentConfig starCommentConfig) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarCommentConfig starCommentConfig, List list) {
    }
}
