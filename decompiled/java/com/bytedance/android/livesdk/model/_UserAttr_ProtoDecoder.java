package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _UserAttr_ProtoDecoder implements C0IMD<UserAttr> {
    public static UserAttr LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserAttr userAttr = new UserAttr();
        userAttr.adminPermissions = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        userAttr.isMuted = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        userAttr.isAdmin = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        userAttr.isSuperAdmin = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        userAttr.muteDuration = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Integer numValueOf = null;
                        Integer numValueOf2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        numValueOf2 = Integer.valueOf(c1516680pZS.LJIIJ());
                                    }
                                } else {
                                    numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (numValueOf != null) {
                                    if (numValueOf2 != null) {
                                        userAttr.adminPermissions.put(numValueOf, numValueOf2);
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
                    case 6:
                        userAttr.hasVotingFunction = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        userAttr.isChannelAdmin = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userAttr;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserAttr userAttr) {
        UserAttr userAttr2 = userAttr;
        if (userAttr2.adminPermissions == null) {
            userAttr2.adminPermissions = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final UserAttr LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserAttr userAttr, List list) {
    }
}
