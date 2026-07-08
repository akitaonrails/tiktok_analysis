package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.model.Gift;

/* JADX INFO: loaded from: classes18.dex */
public final class _Gift_GiftSkin_ProtoEncoder implements InterfaceC1132110fZB<Gift.GiftSkin> {
    public static int LIZJ(Gift.GiftSkin giftSkin) {
        return C1142340fpg.LJIIL(1, giftSkin.giftSkinId) + C1142340fpg.LJIILL(2, giftSkin.giftSkinName) + _ImageModel_ProtoEncoder.LJ(3, giftSkin.staticImage) + _ImageModel_ProtoEncoder.LJ(4, giftSkin.animatedImage);
    }

    public static void LIZIZ(C1142350fph c1142350fph, Gift.GiftSkin giftSkin) {
        long j = giftSkin.giftSkinId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        C1142340fpg.LJFF(c1142350fph, 2, giftSkin.giftSkinName);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 3, giftSkin.staticImage);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 4, giftSkin.animatedImage);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Gift.GiftSkin giftSkin) {
        LIZIZ(c1142350fph, giftSkin);
    }
}
