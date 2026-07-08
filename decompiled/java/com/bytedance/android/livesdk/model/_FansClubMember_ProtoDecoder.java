package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _FansClubMember_ProtoDecoder implements C0IMD<FansClubMember> {
    public static FansClubMember LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FansClubMember fansClubMember = new FansClubMember();
        fansClubMember.preferData = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Integer numValueOf = null;
                        FansClubData fansClubDataLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    fansClubDataLIZLLL = _FansClubData_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (numValueOf != null) {
                            if (fansClubDataLIZLLL != null) {
                                fansClubMember.preferData.put(numValueOf, fansClubDataLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    fansClubMember.data = _FansClubData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return fansClubMember;
            }
        }
    }

    public static void LJ(FansClubMember fansClubMember) {
        FansClubData fansClubData = fansClubMember.data;
        if (fansClubData != null) {
            _FansClubData_ProtoDecoder.LJ(fansClubData);
        }
        Map<Integer, FansClubData> map = fansClubMember.preferData;
        if (map == null) {
            fansClubMember.preferData = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Integer, FansClubData>> it2 = fansClubMember.preferData.entrySet().iterator();
        while (it2.hasNext()) {
            FansClubData value = it2.next().getValue();
            if (value != null) {
                _FansClubData_ProtoDecoder.LJ(value);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FansClubMember fansClubMember) {
        LJ(fansClubMember);
    }

    @Override // X.C0IMD
    public final FansClubMember LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FansClubMember fansClubMember, List list) {
    }
}
