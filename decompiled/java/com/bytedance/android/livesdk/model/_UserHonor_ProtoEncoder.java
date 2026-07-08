package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _UserHonor_ProtoEncoder implements InterfaceC1132110fZB<UserHonor> {
    public static int LIZJ(UserHonor userHonor) {
        int iLIZIZ;
        int iLJIIL = C1142340fpg.LJIIL(1, userHonor.totalDiamond) + _ImageModel_ProtoEncoder.LJ(2, userHonor.diamondIcon) + C1142340fpg.LJIILL(3, userHonor.currentHonorName) + _ImageModel_ProtoEncoder.LJ(4, userHonor.currentHonorIcon) + C1142340fpg.LJIILL(5, userHonor.nextHonorName) + C1142340fpg.LJIIL(6, userHonor.level) + _ImageModel_ProtoEncoder.LJ(7, userHonor.nextHonorIcon) + C1142340fpg.LJIIL(9, userHonor.currentDiamond) + C1142340fpg.LJIIL(10, userHonor.thisGradeMinDiamond) + C1142340fpg.LJIIL(11, userHonor.thisGradeMaxDiamond) + C1142340fpg.LJIILL(13, userHonor.gradeDescribe);
        List<GradeIcon> list = userHonor.gradeIconList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < userHonor.gradeIconList.size(); i++) {
                GradeIcon gradeIcon = (GradeIcon) ListProtector.get(userHonor.gradeIconList, i);
                if (gradeIcon == null) {
                    iLIZIZ = 0;
                } else {
                    int iLIZJ = _GradeIcon_ProtoEncoder.LIZJ(gradeIcon);
                    iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(14);
                }
                iLJIIL += iLIZIZ;
            }
        }
        return iLJIIL + C1142340fpg.LJIIL(15, userHonor.screenChatType) + _ImageModel_ProtoEncoder.LJ(16, userHonor.imIcon) + _ImageModel_ProtoEncoder.LJ(17, userHonor.imIconWithLevel) + _ImageModel_ProtoEncoder.LJ(18, userHonor.liveIcon) + _ImageModel_ProtoEncoder.LJ(19, userHonor.newImIconWithLevel) + _ImageModel_ProtoEncoder.LJ(20, userHonor.newLiveIcon) + C1142340fpg.LJIIL(21, userHonor.upgradeNeedConsume) + C1142340fpg.LJIILL(22, userHonor.nextPrivileges) + _ImageModel_ProtoEncoder.LJ(23, userHonor.profileDialogBg) + _ImageModel_ProtoEncoder.LJ(24, userHonor.profileDialogBackBg) + C1142340fpg.LJIIL(25, userHonor.score) + C1142340fpg.LJIILL(1001, userHonor.gradeBanner);
    }

    public static void LIZIZ(C1142350fph c1142350fph, UserHonor userHonor) {
        long j = userHonor.totalDiamond;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, userHonor.diamondIcon);
        C1142340fpg.LJFF(c1142350fph, 3, userHonor.currentHonorName);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 4, userHonor.currentHonorIcon);
        C1142340fpg.LJFF(c1142350fph, 5, userHonor.nextHonorName);
        long j2 = userHonor.level;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j2);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 7, userHonor.nextHonorIcon);
        long j3 = userHonor.currentDiamond;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LJFF(j3);
        long j4 = userHonor.thisGradeMinDiamond;
        c1142350fph.LIZLLL(10, 0);
        c1142350fph.LJFF(j4);
        long j5 = userHonor.thisGradeMaxDiamond;
        c1142350fph.LIZLLL(11, 0);
        c1142350fph.LJFF(j5);
        C1142340fpg.LJFF(c1142350fph, 13, userHonor.gradeDescribe);
        List<GradeIcon> list = userHonor.gradeIconList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < userHonor.gradeIconList.size(); i++) {
                GradeIcon gradeIcon = (GradeIcon) ListProtector.get(userHonor.gradeIconList, i);
                if (gradeIcon != null) {
                    c1142350fph.LIZLLL(14, 2);
                    c1142350fph.LJ(_GradeIcon_ProtoEncoder.LIZJ(gradeIcon));
                    _GradeIcon_ProtoEncoder.LIZIZ(c1142350fph, gradeIcon);
                }
            }
        }
        long j6 = userHonor.screenChatType;
        c1142350fph.LIZLLL(15, 0);
        c1142350fph.LJFF(j6);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 16, userHonor.imIcon);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 17, userHonor.imIconWithLevel);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 18, userHonor.liveIcon);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 19, userHonor.newImIconWithLevel);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 20, userHonor.newLiveIcon);
        long j7 = userHonor.upgradeNeedConsume;
        c1142350fph.LIZLLL(21, 0);
        c1142350fph.LJFF(j7);
        C1142340fpg.LJFF(c1142350fph, 22, userHonor.nextPrivileges);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 23, userHonor.profileDialogBg);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 24, userHonor.profileDialogBackBg);
        long j8 = userHonor.score;
        c1142350fph.LIZLLL(25, 0);
        c1142350fph.LJFF(j8);
        C1142340fpg.LJFF(c1142350fph, 1001, userHonor.gradeBanner);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, UserHonor userHonor) {
        LIZIZ(c1142350fph, userHonor);
    }
}
