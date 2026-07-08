package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes36.dex */
public final class _AnchorLevel_ProtoEncoder implements InterfaceC1132110fZB<AnchorLevel> {
    public static int LIZJ(AnchorLevel anchorLevel) {
        return C1142340fpg.LJIIL(1, anchorLevel.level) + C1142340fpg.LJIIL(2, anchorLevel.experience) + C1142340fpg.LJIIL(3, anchorLevel.lowestExperienceThisLevel) + C1142340fpg.LJIIL(4, anchorLevel.highestExperienceThisLevel) + C1142340fpg.LJIIL(5, anchorLevel.taskStartExperience) + C1142340fpg.LJIIL(6, anchorLevel.taskStartTime) + C1142340fpg.LJIIL(7, anchorLevel.taskDecreaseExperience) + C1142340fpg.LJIIL(8, anchorLevel.taskTargetExperience) + C1142340fpg.LJIIL(9, anchorLevel.taskEndTime) + _ImageModel_ProtoEncoder.LJ(10, anchorLevel.profileDialogBg) + _ImageModel_ProtoEncoder.LJ(11, anchorLevel.profileDialogBackBg) + _ImageModel_ProtoEncoder.LJ(12, anchorLevel.stageLevelIcon) + _ImageModel_ProtoEncoder.LJ(13, anchorLevel.levelIcon);
    }

    public static void LIZIZ(C1142350fph c1142350fph, AnchorLevel anchorLevel) {
        long j = anchorLevel.level;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = anchorLevel.experience;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
        long j3 = anchorLevel.lowestExperienceThisLevel;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j3);
        long j4 = anchorLevel.highestExperienceThisLevel;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j4);
        long j5 = anchorLevel.taskStartExperience;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJFF(j5);
        long j6 = anchorLevel.taskStartTime;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j6);
        long j7 = anchorLevel.taskDecreaseExperience;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LJFF(j7);
        long j8 = anchorLevel.taskTargetExperience;
        c1142350fph.LIZLLL(8, 0);
        c1142350fph.LJFF(j8);
        long j9 = anchorLevel.taskEndTime;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LJFF(j9);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 10, anchorLevel.profileDialogBg);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 11, anchorLevel.profileDialogBackBg);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 12, anchorLevel.stageLevelIcon);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 13, anchorLevel.levelIcon);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, AnchorLevel anchorLevel) {
        LIZIZ(c1142350fph, anchorLevel);
    }
}
