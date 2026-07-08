package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserModelPredictionData_ProtoDecoder implements C0IMD<UserModelPredictionData> {
    public static UserModelPredictionData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserModelPredictionData userModelPredictionData = new UserModelPredictionData();
        userModelPredictionData.modelPredictionData = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        Double dValueOf = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    dValueOf = Double.valueOf(Double.longBitsToDouble(c1516680pZS.LJIIIZ()));
                                }
                            } else {
                                strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (strLIZLLL != null) {
                            if (dValueOf != null) {
                                userModelPredictionData.modelPredictionData.put(strLIZLLL, dValueOf);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    userModelPredictionData.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userModelPredictionData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserModelPredictionData userModelPredictionData) {
        UserModelPredictionData userModelPredictionData2 = userModelPredictionData;
        if (userModelPredictionData2.modelPredictionData == null) {
            userModelPredictionData2.modelPredictionData = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final UserModelPredictionData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserModelPredictionData userModelPredictionData, List list) {
    }
}
