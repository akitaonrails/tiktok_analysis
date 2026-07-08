package com.bytedance.android.livesdk.model;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftsBoxInfo_ProtoEncoder implements InterfaceC1132110fZB<GiftsBoxInfo> {
    public static void LIZIZ(C1142350fph c1142350fph, GiftsBoxInfo giftsBoxInfo) {
        List<GiftInfoInBox> list = giftsBoxInfo.gifts;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftsBoxInfo.gifts.size(); i++) {
                GiftInfoInBox giftInfoInBox = (GiftInfoInBox) ListProtector.get(giftsBoxInfo.gifts, i);
                if (giftInfoInBox != null) {
                    c1142350fph.LIZLLL(1, 2);
                    c1142350fph.LJ(_GiftInfoInBox_ProtoEncoder.LIZJ(giftInfoInBox));
                    _GiftInfoInBox_ProtoEncoder.LIZIZ(c1142350fph, giftInfoInBox);
                }
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftsBoxInfo giftsBoxInfo) {
        LIZIZ(c1142350fph, giftsBoxInfo);
    }
}
