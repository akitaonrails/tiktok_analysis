package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _AuthenticationInfo_ProtoEncoder implements InterfaceC1132110fZB<AuthenticationInfo> {
    public static int LIZJ(AuthenticationInfo authenticationInfo) {
        return C1142340fpg.LJIILL(1, authenticationInfo.customVerify) + C1142340fpg.LJIILL(2, authenticationInfo.enterpriseVerifyReason) + _ImageModel_ProtoEncoder.LJ(3, authenticationInfo.authenticationBadge) + C1142340fpg.LJI(4);
    }

    public static void LIZIZ(C1142350fph c1142350fph, AuthenticationInfo authenticationInfo) {
        C1142340fpg.LJFF(c1142350fph, 1, authenticationInfo.customVerify);
        C1142340fpg.LJFF(c1142350fph, 2, authenticationInfo.enterpriseVerifyReason);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 3, authenticationInfo.authenticationBadge);
        boolean z = authenticationInfo.hasCert;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJ(z ? 1 : 0);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, AuthenticationInfo authenticationInfo) {
        LIZIZ(c1142350fph, authenticationInfo);
    }
}
