package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class _UserAttr_ProtoEncoder implements InterfaceC1132110fZB<UserAttr> {
    public static int LIZJ(UserAttr userAttr) {
        int iLJI = C1142340fpg.LJI(1) + C1142340fpg.LJI(2) + C1142340fpg.LJI(3) + C1142340fpg.LJIIL(4, userAttr.muteDuration);
        Map<Integer, Integer> map = userAttr.adminPermissions;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : userAttr.adminPermissions.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int iLJIIJ = C1142340fpg.LJIIJ(1, entry.getKey()) + C1142340fpg.LJIIJ(2, entry.getValue());
                    iLJI += iLJIIJ + C1142350fph.LIZIZ(iLJIIJ) + C1142350fph.LIZ(5);
                }
            }
        }
        return iLJI + C1142340fpg.LJI(6) + C1142340fpg.LJI(7);
    }

    public static void LIZIZ(C1142350fph c1142350fph, UserAttr userAttr) {
        boolean z = userAttr.isMuted;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        boolean z2 = userAttr.isAdmin;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        boolean z3 = userAttr.isSuperAdmin;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJ(z3 ? 1 : 0);
        long j = userAttr.muteDuration;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j);
        Map<Integer, Integer> map = userAttr.adminPermissions;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : userAttr.adminPermissions.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c1142350fph.LIZLLL(5, 2);
                    c1142350fph.LJ(C1142340fpg.LJIIJ(1, entry.getKey()) + C1142340fpg.LJIIJ(2, entry.getValue()));
                    C1142340fpg.LIZLLL(c1142350fph, 1, entry.getKey());
                    C1142340fpg.LIZLLL(c1142350fph, 2, entry.getValue());
                }
            }
        }
        boolean z4 = userAttr.hasVotingFunction;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJ(z4 ? 1 : 0);
        boolean z5 = userAttr.isChannelAdmin;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LJ(z5 ? 1 : 0);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, UserAttr userAttr) {
        LIZIZ(c1142350fph, userAttr);
    }
}
