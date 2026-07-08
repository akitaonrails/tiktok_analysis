package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.FansClubData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _FansClubData_ProtoEncoder implements InterfaceC1132110fZB<FansClubData> {
    public static int LIZJ(FansClubData fansClubData) {
        int iLIZIZ;
        if (fansClubData == null) {
            return 0;
        }
        int iLJIILL = C1142340fpg.LJIILL(1, fansClubData.clubName) + C1142340fpg.LJIIIZ(2, fansClubData.level) + C1142340fpg.LJIIIZ(3, fansClubData.userFansClubStatus);
        FansClubData.UserBadge userBadge = fansClubData.badge;
        if (userBadge == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ = _FansClubData_UserBadge_ProtoEncoder.LIZJ(userBadge);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(4);
        }
        int iLJIILIIL = iLJIILL + iLIZIZ;
        List<Long> list = fansClubData.availableGiftIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < fansClubData.availableGiftIds.size(); i++) {
                iLJIILIIL += C1142340fpg.LJIILIIL(5, (Long) ListProtector.get(fansClubData.availableGiftIds, i));
            }
        }
        return iLJIILIIL + C1142340fpg.LJIIL(6, fansClubData.anchorId);
    }

    public static void LIZIZ(C1142350fph c1142350fph, FansClubData fansClubData) {
        C1142340fpg.LJFF(c1142350fph, 1, fansClubData.clubName);
        int i = fansClubData.level;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i);
        int i2 = fansClubData.userFansClubStatus;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LIZJ(i2);
        FansClubData.UserBadge userBadge = fansClubData.badge;
        if (userBadge != null) {
            c1142350fph.LIZLLL(4, 2);
            c1142350fph.LJ(_FansClubData_UserBadge_ProtoEncoder.LIZJ(userBadge));
            _FansClubData_UserBadge_ProtoEncoder.LIZIZ(c1142350fph, userBadge);
        }
        List<Long> list = fansClubData.availableGiftIds;
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < fansClubData.availableGiftIds.size(); i3++) {
                C1142340fpg.LJ(c1142350fph, 5, (Long) ListProtector.get(fansClubData.availableGiftIds, i3));
            }
        }
        long j = fansClubData.anchorId;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j);
    }

    public static int LIZLLL(int i, FansClubData fansClubData) {
        if (fansClubData == null) {
            return 0;
        }
        int iLIZJ = LIZJ(fansClubData);
        return iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(i);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, FansClubData fansClubData) {
        LIZIZ(c1142350fph, fansClubData);
    }
}
