package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class _FansClubMember_ProtoEncoder implements InterfaceC1132110fZB<FansClubMember> {
    public static int LIZJ(FansClubMember fansClubMember) {
        int iLIZLLL = _FansClubData_ProtoEncoder.LIZLLL(1, fansClubMember.data);
        Map<Integer, FansClubData> map = fansClubMember.preferData;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Integer, FansClubData> entry : fansClubMember.preferData.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int iLJIIJ = C1142340fpg.LJIIJ(1, entry.getKey()) + _FansClubData_ProtoEncoder.LIZLLL(2, entry.getValue());
                    iLIZLLL += iLJIIJ + C1142350fph.LIZIZ(iLJIIJ) + C1142350fph.LIZ(2);
                }
            }
        }
        return iLIZLLL;
    }

    public static void LIZIZ(C1142350fph c1142350fph, FansClubMember fansClubMember) {
        FansClubData fansClubData = fansClubMember.data;
        if (fansClubData != null) {
            c1142350fph.LIZLLL(1, 2);
            c1142350fph.LJ(_FansClubData_ProtoEncoder.LIZJ(fansClubData));
            _FansClubData_ProtoEncoder.LIZIZ(c1142350fph, fansClubData);
        }
        Map<Integer, FansClubData> map = fansClubMember.preferData;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Integer, FansClubData> entry : fansClubMember.preferData.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c1142350fph.LIZLLL(2, 2);
                    c1142350fph.LJ(C1142340fpg.LJIIJ(1, entry.getKey()) + _FansClubData_ProtoEncoder.LIZLLL(2, entry.getValue()));
                    C1142340fpg.LIZLLL(c1142350fph, 1, entry.getKey());
                    FansClubData value = entry.getValue();
                    if (value != null) {
                        c1142350fph.LIZLLL(2, 2);
                        c1142350fph.LJ(_FansClubData_ProtoEncoder.LIZJ(value));
                        _FansClubData_ProtoEncoder.LIZIZ(c1142350fph, value);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, FansClubMember fansClubMember) {
        LIZIZ(c1142350fph, fansClubMember);
    }
}
