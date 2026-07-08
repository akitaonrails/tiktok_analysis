package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserAttrResponse_ProtoDecoder implements C0IMD<UserAttrResponse> {
    @Override // X.C0IMD
    public final void LIZ(UserAttrResponse userAttrResponse) {
        UserAttrResponse userAttrResponse2 = userAttrResponse;
        if (userAttrResponse2.values == null) {
            userAttrResponse2.values = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final UserAttrResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        UserAttrResponse userAttrResponse = new UserAttrResponse();
        userAttrResponse.values = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    Long lValueOf = null;
                    Long lValueOf2 = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                lValueOf2 = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (lValueOf != null) {
                        if (lValueOf2 != null) {
                            userAttrResponse.values.put(lValueOf, lValueOf2);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userAttrResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserAttrResponse userAttrResponse, List list) {
    }
}
