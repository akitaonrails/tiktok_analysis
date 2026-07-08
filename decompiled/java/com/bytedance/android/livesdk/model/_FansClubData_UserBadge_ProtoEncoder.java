package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.model.FansClubData;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class _FansClubData_UserBadge_ProtoEncoder implements InterfaceC1132110fZB<FansClubData.UserBadge> {
    public static int LIZJ(FansClubData.UserBadge userBadge) {
        Map<Integer, ImageModel> map = userBadge.icons;
        int iLIZIZ = 0;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Integer, ImageModel> entry : userBadge.icons.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int iLJIIJ = C1142340fpg.LJIIJ(1, entry.getKey()) + _ImageModel_ProtoEncoder.LJ(2, entry.getValue());
                    iLIZIZ += iLJIIJ + C1142350fph.LIZIZ(iLJIIJ) + C1142350fph.LIZ(1);
                }
            }
        }
        return iLIZIZ + C1142340fpg.LJIILL(2, userBadge.title);
    }

    public static void LIZIZ(C1142350fph c1142350fph, FansClubData.UserBadge userBadge) {
        Map<Integer, ImageModel> map = userBadge.icons;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Integer, ImageModel> entry : userBadge.icons.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c1142350fph.LIZLLL(1, 2);
                    c1142350fph.LJ(C1142340fpg.LJIIJ(1, entry.getKey()) + _ImageModel_ProtoEncoder.LJ(2, entry.getValue()));
                    C1142340fpg.LIZLLL(c1142350fph, 1, entry.getKey());
                    _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, entry.getValue());
                }
            }
        }
        C1142340fpg.LJFF(c1142350fph, 2, userBadge.title);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, FansClubData.UserBadge userBadge) {
        LIZIZ(c1142350fph, userBadge);
    }
}
