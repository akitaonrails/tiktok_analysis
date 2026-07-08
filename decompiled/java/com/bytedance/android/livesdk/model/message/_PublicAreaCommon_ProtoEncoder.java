package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaCommon_ProtoEncoder implements InterfaceC1132110fZB<PublicAreaCommon> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PublicAreaCommon publicAreaCommon) {
        PublicAreaCommon publicAreaCommon2 = publicAreaCommon;
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, publicAreaCommon2.userLabel);
        C1142340fpg.LJ(c1142350fph, 2, publicAreaCommon2.userConsumeInRoom);
    }
}
