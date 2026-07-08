package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.live.base.model.user._PrivilegeLogExtra_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _BorderInfo_ProtoEncoder implements InterfaceC1132110fZB<BorderInfo> {
    public static int LIZJ(BorderInfo borderInfo) {
        if (borderInfo == null) {
            return 0;
        }
        return _ImageModel_ProtoEncoder.LJ(1, borderInfo.icon) + C1142340fpg.LJIIL(2, borderInfo.level) + C1142340fpg.LJIILL(3, borderInfo.source) + _ImageModel_ProtoEncoder.LJ(4, borderInfo.profileDecorationRibbon) + _PrivilegeLogExtra_ProtoEncoder.LJ(5, borderInfo.borderLogExtra) + _PrivilegeLogExtra_ProtoEncoder.LJ(6, borderInfo.ribbonLogExtra) + C1142340fpg.LJIILL(7, borderInfo.avatarBackgroundColor) + C1142340fpg.LJIILL(8, borderInfo.avatarBackgroundBorderColor) + C1142340fpg.LJIILL(9, borderInfo.nameStarlingKey) + C1142340fpg.LJIILL(10, borderInfo.descStarlingKey) + C1142340fpg.LJIILL(11, borderInfo.name) + C1142340fpg.LJIILL(12, borderInfo.description) + C1142340fpg.LJI(13);
    }

    public static void LIZIZ(C1142350fph c1142350fph, BorderInfo borderInfo) {
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, borderInfo.icon);
        long j = borderInfo.level;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
        C1142340fpg.LJFF(c1142350fph, 3, borderInfo.source);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 4, borderInfo.profileDecorationRibbon);
        _PrivilegeLogExtra_ProtoEncoder.LIZJ(c1142350fph, 5, borderInfo.borderLogExtra);
        _PrivilegeLogExtra_ProtoEncoder.LIZJ(c1142350fph, 6, borderInfo.ribbonLogExtra);
        C1142340fpg.LJFF(c1142350fph, 7, borderInfo.avatarBackgroundColor);
        C1142340fpg.LJFF(c1142350fph, 8, borderInfo.avatarBackgroundBorderColor);
        C1142340fpg.LJFF(c1142350fph, 9, borderInfo.nameStarlingKey);
        C1142340fpg.LJFF(c1142350fph, 10, borderInfo.descStarlingKey);
        C1142340fpg.LJFF(c1142350fph, 11, borderInfo.name);
        C1142340fpg.LJFF(c1142350fph, 12, borderInfo.description);
        boolean z = borderInfo.isTallerAvatarBackground;
        c1142350fph.LIZLLL(13, 0);
        c1142350fph.LJ(z ? 1 : 0);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, BorderInfo borderInfo) {
        LIZIZ(c1142350fph, borderInfo);
    }
}
