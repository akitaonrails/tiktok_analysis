package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes36.dex */
public final class _GradeIcon_ProtoEncoder implements InterfaceC1132110fZB<GradeIcon> {
    public static int LIZJ(GradeIcon gradeIcon) {
        return _ImageModel_ProtoEncoder.LJ(1, gradeIcon.icon) + C1142340fpg.LJIIL(2, gradeIcon.iconDiamond) + C1142340fpg.LJIIL(3, gradeIcon.level) + C1142340fpg.LJIILL(4, gradeIcon.levelStr);
    }

    public static void LIZIZ(C1142350fph c1142350fph, GradeIcon gradeIcon) {
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, gradeIcon.icon);
        long j = gradeIcon.iconDiamond;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
        long j2 = gradeIcon.level;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j2);
        C1142340fpg.LJFF(c1142350fph, 4, gradeIcon.levelStr);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GradeIcon gradeIcon) {
        LIZIZ(c1142350fph, gradeIcon);
    }
}
