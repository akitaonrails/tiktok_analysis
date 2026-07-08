package com.bytedance.android.livesdk.gift.model;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftPage_GiftGroupInTab_ProtoEncoder implements InterfaceC1132110fZB<GiftPage.GiftGroupInTab> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftPage.GiftGroupInTab giftGroupInTab) {
        GiftPage.GiftGroupInTab giftGroupInTab2 = giftGroupInTab;
        int i = giftGroupInTab2.groupInTab;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        _Text_ProtoEncoder.LIZJ(c1142350fph, 2, giftGroupInTab2.title);
        _Text_ProtoEncoder.LIZJ(c1142350fph, 3, giftGroupInTab2.description);
    }
}
