package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftResource_ProtoEncoder implements InterfaceC1132110fZB<GiftResource> {
    public static int LIZIZ(GiftResource giftResource) {
        if (giftResource == null) {
            return 0;
        }
        return C1142340fpg.LJIIL(1, giftResource.id) + _ImageModel_ProtoEncoder.LJ(2, giftResource.image) + C1142340fpg.LJIIL(3, giftResource.effectId);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftResource giftResource) {
        GiftResource giftResource2 = giftResource;
        long j = giftResource2.id;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, giftResource2.image);
        long j2 = giftResource2.effectId;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j2);
    }
}
